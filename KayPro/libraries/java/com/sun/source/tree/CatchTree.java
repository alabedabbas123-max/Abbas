package com.sun.source.tree;

public interface CatchTree extends Tree {
    BlockTree getBlock();

    VariableTree getParameter();
}
