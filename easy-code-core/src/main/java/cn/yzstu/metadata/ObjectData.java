package cn.yzstu.metadata;

import com.sun.tools.javac.tree.JCTree;

/**
 * @author Baldwin
 */
public class ObjectData {
    /** expression */
    private JCTree.JCExpression expression;
    private JCTree.JCStatement statement;

    public ObjectData(JCTree.JCExpression expression) {
        this.expression = expression;
    }

    public ObjectData(JCTree.JCExpression expression, JCTree.JCStatement statement) {
        this.expression = expression;
        this.statement = statement;
    }

    public JCTree.JCExpression getExpression() {
        return expression;
    }

    public JCTree.JCStatement getStatement() {
        return statement;
    }
}
