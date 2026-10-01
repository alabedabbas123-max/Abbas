package com.sun.source.tree;

public interface LineMap {
    long getColumnNumber(long j);

    long getLineNumber(long j);

    long getPosition(long j, long j2);

    long getStartPosition(long j);
}
