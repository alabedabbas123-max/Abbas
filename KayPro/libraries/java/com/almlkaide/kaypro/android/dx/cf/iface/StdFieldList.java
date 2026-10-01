package com.almlkaide.kaypro.android.dx.cf.iface;

import com.almlkaide.kaypro.android.dx.util.FixedSizeList;

public final class StdFieldList extends FixedSizeList implements FieldList {
    public StdFieldList(int i) {
        super(i);
    }

    @Override
    public Field mo7139get(int i) {
        return (Field) get0(i);
    }

    public void m7142set(int i, Field field) {
        set0(i, field);
    }
}
