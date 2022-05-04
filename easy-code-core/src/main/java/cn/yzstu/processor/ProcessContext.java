package cn.yzstu.processor;

import com.sun.tools.javac.api.JavacTrees;
import com.sun.tools.javac.tree.TreeMaker;
import com.sun.tools.javac.util.Names;

import javax.annotation.processing.Messager;

/**
 * @author Baldwin
 * @mail admin@yzstu.cn
 * @blog blog.yzstu.cn
 * @since 2022/5/4 00:27
 */
public class ProcessContext {
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

    public static ProcessContext newInstance() {
        return new ProcessContext();
    }

    public Messager messager() {
        return messager;
    }

    public ProcessContext messager(Messager messager) {
        this.messager = messager;
        return this;
    }

    public JavacTrees trees() {
        return trees;
    }

    public ProcessContext trees(JavacTrees trees) {
        this.trees = trees;
        return this;
    }

    public TreeMaker treeMaker() {
        return treeMaker;
    }

    public ProcessContext treeMaker(TreeMaker treeMaker) {
        this.treeMaker = treeMaker;
        return this;
    }

    public Names names() {
        return names;
    }

    public ProcessContext names(Names names) {
        this.names = names;
        return this;
    }
}
