package cn.yzstu.processor;

import cn.yzstu.annotation.Table;
import cn.yzstu.metadata.ClassData;
import cn.yzstu.metadata.FieldData;
import cn.yzstu.metadata.ObjectData;
import com.sun.tools.javac.code.Flags;

import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Baldwin
 */
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class TableColumnProcessor extends BaseClassProcessor {
    @Override
    protected void handleClass(ClassData clazz) {
        ObjectData value = new ObjectData(context.getTreeMaker().Literal("HELLO"));
        FieldData helloField = new FieldData(Flags.PUBLIC | Flags.STATIC | Flags.FINAL, String.class, "HELLO", value);
        clazz.insertField(helloField);
    }

    @Override
    protected Class<? extends Annotation> getAnnotationClass() {
        return Table.class;
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        HashSet<String> set = new HashSet<>();
        set.add(Table.class.getName());
        return set;
    }


}
