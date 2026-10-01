package com.myopicmobile.textwarrior.common;

public class TextBufferCache {
    private static final int CACHE_SIZE = 4;
    private Pair[] _cache = new Pair[4];

    public TextBufferCache() {
        this._cache[0] = new Pair(0, 0);
        for (int i = 1; i < 4; i++) {
            this._cache[i] = new Pair(-1, -1);
        }
    }

    private void insertEntry(int i, int i2) {
        makeHead(3);
        this._cache[1] = new Pair(i, i2);
    }

    private void makeHead(int i) {
        if (i == 0) {
            return;
        }
        Pair pair = this._cache[i];
        while (i > 1) {
            this._cache[i] = this._cache[i - 1];
            i--;
        }
        this._cache[1] = pair;
    }

    private boolean replaceEntry(int i, int i2) {
        for (int i3 = 1; i3 < 4; i3++) {
            if (this._cache[i3].getFirst() == i) {
                this._cache[i3].setSecond(i2);
                return true;
            }
        }
        return false;
    }

    public Pair getNearestCharOffset(int i) {
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        int i4 = 0;
        while (i3 < 4) {
            int iAbs = Math.abs(i - this._cache[i3].getSecond());
            if (iAbs < i2) {
                i4 = i3;
            } else {
                iAbs = i2;
            }
            i3++;
            i2 = iAbs;
        }
        Pair pair = this._cache[i4];
        makeHead(i4);
        return pair;
    }

    public Pair getNearestLine(int i) {
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        int i4 = 0;
        while (i3 < 4) {
            int iAbs = Math.abs(i - this._cache[i3].getFirst());
            if (iAbs < i2) {
                i4 = i3;
            } else {
                iAbs = i2;
            }
            i3++;
            i2 = iAbs;
        }
        Pair pair = this._cache[i4];
        makeHead(i4);
        return pair;
    }

    protected final void invalidateCache(int i) {
        for (int i2 = 1; i2 < 4; i2++) {
            if (this._cache[i2].getSecond() >= i) {
                this._cache[i2] = new Pair(-1, -1);
            }
        }
    }

    public void updateEntry(int i, int i2) {
        if (i > 0 && !replaceEntry(i, i2)) {
            insertEntry(i, i2);
        }
    }
}
