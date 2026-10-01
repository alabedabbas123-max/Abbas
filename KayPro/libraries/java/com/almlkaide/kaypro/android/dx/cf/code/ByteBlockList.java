package com.almlkaide.kaypro.android.dx.cf.code;

import com.almlkaide.kaypro.android.dx.util.Hex;
import com.almlkaide.kaypro.android.dx.util.LabeledItem;
import com.almlkaide.kaypro.android.dx.util.LabeledList;

public final class ByteBlockList extends LabeledList {
    public ByteBlockList(int i) {
        super(i);
    }

    public ByteBlock m7120get(int i) {
        return (ByteBlock) get0(i);
    }

    public ByteBlock labelToBlock(int i) {
        int iIndexOfLabel = indexOfLabel(i);
        if (iIndexOfLabel < 0) {
            throw new IllegalArgumentException(new StringBuffer().append("no such label: ").append(Hex.m7225u2(i)).toString());
        }
        return m7120get(iIndexOfLabel);
    }

    public void m7121set(int i, ByteBlock byteBlock) {
        super.m7236set(i, (LabeledItem) byteBlock);
    }
}
