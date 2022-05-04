package cn.yzstu.processor;

import com.sun.tools.javac.api.JavacTrees;
import com.sun.tools.javac.processing.JavacProcessingEnvironment;
import com.sun.tools.javac.tree.TreeMaker;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.Names;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;

/**
 * @author Baldwin
 * @mail admin@yzstu.cn
 * @blog blog.yzstu.cn
 * @since  2022/5/4 00:07
 */
public abstract class BaseProcessor extends AbstractProcessor {
    /**
     * Print log on compile
     */
    protected Messager messager;

    /**
     * Provide a tree of abstract syntax to be processed
     */
    protected JavacTrees trees;

    /**
     * Encapsulates some methods for creating AST nodes
     */
    protected TreeMaker treeMaker;

    /**
     * Provides methods to create identifiers
     */
    protected Names names;

    protected ProcessContext context;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnv) {
        super.init(processingEnv);
        this.messager = processingEnv.getMessager();
        this.trees = JavacTrees.instance(processingEnv);
        Context context = ((JavacProcessingEnvironment) processingEnv).getContext();
        this.treeMaker = TreeMaker.instance(context);
        this.names = Names.instance(context);
        this.context = new ProcessContext(messager, trees, treeMaker, names);
    }
}
