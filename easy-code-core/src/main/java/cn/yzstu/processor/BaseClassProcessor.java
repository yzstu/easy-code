package cn.yzstu.processor;

import com.sun.tools.javac.code.Symbol;

import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Baldwin
 * @mail admin@yzstu.cn
 * @blog blog.yzstu.cn
 * @since 2022/5/4 00:18
 */
public abstract class BaseClassProcessor extends BaseProcessor {

    /**
     * @description:
     * @since: 2022/5/4 00:59
     * @param: clazz
     * @return: void
    */
    protected void handleClass(final Class clazz) {
        // default do nothing
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        return true;
    }

    protected List<Class> getClassList(final RoundEnvironment roundEnv,
                                        final Class<? extends Annotation> clazz) {

        return new ArrayList<>();
    }

}
