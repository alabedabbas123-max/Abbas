package com.sun.source.tree;

public interface ImportTree extends Tree {
    Tree getQualifiedIdentifier();

    boolean isStatic();
}
