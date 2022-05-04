package cn.yzstu.metadata;

import cn.yzstu.processor.ProcessContext;
import com.sun.source.tree.Tree;
import com.sun.tools.javac.code.Flags;
import com.sun.tools.javac.code.Symbol;
import com.sun.tools.javac.tree.JCTree;
import com.sun.tools.javac.util.ListBuffer;

import javax.tools.Diagnostic;

/**
 * @author Baldwin
 */
public class ClassData extends CommonData {
    private final Symbol.ClassSymbol classSymbol;
    private final JCTree.JCClassDecl jcClassDecl;

    public ClassData(Symbol.ClassSymbol classSymbol, ProcessContext context) {
        super(context);
        this.classSymbol = classSymbol;
        jcClassDecl = context.getTrees().getTree(classSymbol);
    }

    public Symbol.ClassSymbol getClassSymbol() {
        return classSymbol;
    }

    public JCTree.JCClassDecl getJcClassDecl() {
        return jcClassDecl;
    }

    private JCTree.JCIdent getIdent(final Class<?> clazz) {
        return processContext.getTreeMaker()
                .Ident(new Symbol.ClassSymbol(Flags.ClassFlags,
                        processContext.getNames().fromString(clazz.getSimpleName()), null));
    }

    /**
     * import package
     * @param targetClass the class you want to import
     */
    public void importPackage(Class<?> targetClass) {
        ListBuffer<JCTree> importTrees = new ListBuffer<>();
        JCTree.JCCompilationUnit compilationUnit =
                (JCTree.JCCompilationUnit) processContext.getTrees().getPath(classSymbol).getCompilationUnit();
        JCTree.JCIdent packageIdent = processContext.getTreeMaker().Ident(processContext.getNames().fromString(targetClass.getPackage().getName()));
        JCTree.JCFieldAccess jcFieldAccess = processContext.getTreeMaker().Select(packageIdent, processContext.getNames().fromString(targetClass.getSimpleName()));
        // remain
        importTrees.append(processContext.getTreeMaker().Import(jcFieldAccess, false));
        compilationUnit.defs.forEach(importTrees::append);
        compilationUnit.defs = importTrees.toList();
    }

    public ClassData insertField(final FieldData field) {
        if (fieldNameExist(field.getName())) {
            processContext.getMessager().printMessage(Diagnostic.Kind.ERROR,
                    "Field: " + field.getName() + " is already exists in class " + classSymbol.fullname.toString());
            return this;
        }
        ListBuffer<JCTree> fieldList = new ListBuffer<>();
        importPackage(field.getType());
        JCTree.JCVariableDecl varDef = processContext.getTreeMaker()
                .VarDef(processContext.getTreeMaker().Modifiers(field.getModifier()),
                        processContext.getNames().fromString(field.getName()),
                        getIdent(field.getType()),
                        field.getValue().getExpression());
        jcClassDecl.defs.forEach(fieldList::append);
        fieldList.append(varDef);
        jcClassDecl.defs = fieldList.toList();
        return this;
    }

    private boolean fieldNameExist(String name) {
        return jcClassDecl.defs.stream()
                .filter(jcTree -> jcTree.getKind() == Tree.Kind.VARIABLE)
                .anyMatch(jcTree -> name.equals(((JCTree.JCVariableDecl) jcTree).name.toString()));
    }
}