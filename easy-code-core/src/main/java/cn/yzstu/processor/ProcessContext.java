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
    private final Messager messager;

    /**
     * Provide a tree of abstract syntax to be processed
     */
    private final JavacTrees trees;

    /**
     * Encapsulates some methods for creating AST nodes
     */
    private final TreeMaker treeMaker;

    /**
     * Provides methods to create identifiers
     */
    private final Names names;

    public ProcessContext(Messager messager, JavacTrees trees, TreeMaker treeMaker, Names names) {
        this.messager = messager;
        this.trees = trees;
        this.treeMaker = treeMaker;
        this.names = names;
    }

    public Messager getMessager() {
        return messager;
    }

    public JavacTrees getTrees() {
        return trees;
    }

    public TreeMaker getTreeMaker() {
        return treeMaker;
    }

    public Names getNames() {
        return names;
    }
}
