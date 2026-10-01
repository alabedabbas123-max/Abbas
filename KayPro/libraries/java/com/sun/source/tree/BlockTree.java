package com.sun.source.tree;

import java.util.List;

public interface BlockTree extends StatementTree {
    List<? extends StatementTree> getStatements();

    boolean isStatic();
}
