package com.sun.source.tree;

import java.util.List;

public interface ForLoopTree extends StatementTree {
    ExpressionTree getCondition();

    List<? extends StatementTree> getInitializer();

    StatementTree getStatement();

    List<? extends ExpressionStatementTree> getUpdate();
}
