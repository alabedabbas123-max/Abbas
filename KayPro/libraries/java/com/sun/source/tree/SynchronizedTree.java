package com.sun.source.tree;

public interface SynchronizedTree extends StatementTree {
    BlockTree getBlock();

    ExpressionTree getExpression();
}
