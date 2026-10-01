package com.sun.source.tree;

import javax.lang.model.element.Name;

public interface VariableTree extends StatementTree {
    ExpressionTree getInitializer();

    ModifiersTree getModifiers();

    Name getName();

    Tree getType();
}
