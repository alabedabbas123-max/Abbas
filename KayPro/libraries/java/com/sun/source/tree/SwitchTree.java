package com.sun.source.tree;

import java.util.List;

public interface SwitchTree extends StatementTree {
    List<? extends CaseTree> getCases();

    ExpressionTree getExpression();
}
