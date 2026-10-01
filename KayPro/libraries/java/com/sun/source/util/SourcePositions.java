package com.sun.source.util;

import com.sun.source.tree.CompilationUnitTree;
import com.sun.source.tree.Tree;

public interface SourcePositions {
    long getEndPosition(CompilationUnitTree compilationUnitTree, Tree tree);

    long getStartPosition(CompilationUnitTree compilationUnitTree, Tree tree);
}
