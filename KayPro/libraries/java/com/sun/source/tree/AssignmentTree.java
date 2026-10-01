package com.sun.source.tree;

public interface AssignmentTree extends ExpressionTree {
    ExpressionTree getExpression();

    ExpressionTree getVariable();
}
