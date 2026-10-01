package com.almlkaide.kaypro.android.dx.util;

public interface IntSet {
    void mo7214add(int i);

    int elements();

    boolean mo7215has(int i);

    IntIterator iterator();

    void merge(IntSet intSet);

    void remove(int i);
}
