package cn.yzstu.processor;

import cn.yzstu.metadata.ClassData;
import com.sun.tools.javac.code.Symbol;

import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.TypeElement;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Baldwin
 * @mail admin@yzstu.cn
 * @blog blog.yzstu.cn
 * @since 2022/5/4 00:18
 */
public abstract class BaseClassProcessor extends BaseProcessor {

    /**
     * get target annotation
     * @return
     */
    protected abstract Class<? extends Annotation> getAnnotationClass();

    /**
     * @description:
     * @since: 2022/5/4 00:59
     * @param: clazz
     * @return: void
    */
    protected void handleClass(final ClassData clazz) {
        // default do nothing
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        getClassList(roundEnv, getAnnotationClass()).forEach(this::handleClass);
        return true;
    }

    protected List<ClassData> getClassList(final RoundEnvironment roundEnv, final Class<? extends Annotation> clazz) {
         return roundEnv.getElementsAnnotatedWith(getAnnotationClass())
                    .stream()
                    .filter(element -> element instanceof Symbol.ClassSymbol)
                    .map(element -> new ClassData((Symbol.ClassSymbol) element, context))
                    .collect(Collectors.toList());
    }


}
