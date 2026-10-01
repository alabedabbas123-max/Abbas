package com.myopicmobile.textwarrior.common;

public final class Pair {
    private int _first;
    private int _second;

    public Pair(int i, int i2) {
        this._first = i;
        this._second = i2;
    }

    public final int getFirst() {
        return this._first;
    }

    public final int getSecond() {
        return this._second;
    }

    public final void setFirst(int i) {
        this._first = i;
    }

    public final void setSecond(int i) {
        this._second = i;
    }
}
