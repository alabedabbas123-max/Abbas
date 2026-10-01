package com.sun.source.tree;

import java.util.List;

public interface MethodInvocationTree extends ExpressionTree {
    List<? extends ExpressionTree> getArguments();

    ExpressionTree getMethodSelect();

    List<? extends Tree> getTypeArguments();
}
