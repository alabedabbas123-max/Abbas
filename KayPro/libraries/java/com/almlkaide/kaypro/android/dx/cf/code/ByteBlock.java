package com.almlkaide.kaypro.android.dx.cf.code;

import com.almlkaide.kaypro.android.dx.util.Hex;
import com.almlkaide.kaypro.android.dx.util.IntList;
import com.almlkaide.kaypro.android.dx.util.LabeledItem;

public final class ByteBlock implements LabeledItem {
    private final ByteCatchList catches;

    private final int f4982end;
    private final int label;
    private final int start;
    private final IntList successors;

    public ByteBlock(int i, int i2, int i3, IntList intList, ByteCatchList byteCatchList) {
        if (i < 0) {
            throw new IllegalArgumentException("label < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("start < 0");
        }
        if (i3 <= i2) {
            throw new IllegalArgumentException("end <= start");
        }
        if (intList == null) {
            throw new NullPointerException("targets == null");
        }
        int size = intList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (intList.m7231get(i4) < 0) {
                throw new IllegalArgumentException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("successors[").append(i4).toString()).append("] == ").toString()).append(intList.m7231get(i4)).toString());
            }
        }
        if (byteCatchList == null) {
            throw new NullPointerException("catches == null");
        }
        this.label = i;
        this.start = i2;
        this.f4982end = i3;
        this.successors = intList;
        this.catches = byteCatchList;
    }

    public String toString() {
        return new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append('{').append(Hex.m7225u2(this.label)).toString()).append(": ").toString()).append(Hex.m7225u2(this.start)).toString()).append("..").toString()).append(Hex.m7225u2(this.f4982end)).toString()).append('}').toString();
    }

    @Override
    public int getLabel() {
        return this.label;
    }

    public int getStart() {
        return this.start;
    }

    public int getEnd() {
        return this.f4982end;
    }

    public IntList getSuccessors() {
        return this.successors;
    }

    public ByteCatchList getCatches() {
        return this.catches;
    }
}
