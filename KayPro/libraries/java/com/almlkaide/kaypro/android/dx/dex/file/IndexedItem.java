package com.almlkaide.kaypro.android.dx.dex.file;

public abstract class IndexedItem extends Item {
    private int index = -1;

    public final boolean hasIndex() {
        return this.index >= 0;
    }

    public final int getIndex() {
        if (this.index < 0) {
            throw new RuntimeException("index not yet set");
        }
        return this.index;
    }

    public final void setIndex(int i) {
        if (this.index != -1) {
            throw new RuntimeException("index already set");
        }
        this.index = i;
    }

    public final String indexString() {
        return new StringBuffer().append(new StringBuffer().append('[').append(Integer.toHexString(this.index)).toString()).append(']').toString();
    }
}
