package com.sun.source.tree;

import java.util.List;

public interface NewClassTree extends ExpressionTree {
    List<? extends ExpressionTree> getArguments();

    ClassTree getClassBody();

    ExpressionTree getEnclosingExpression();

    ExpressionTree getIdentifier();

    List<? extends Tree> getTypeArguments();
}
