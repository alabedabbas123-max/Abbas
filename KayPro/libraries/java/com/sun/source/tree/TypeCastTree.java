package com.sun.source.tree;

public interface TypeCastTree extends ExpressionTree {
    ExpressionTree getExpression();

    Tree getType();
}
