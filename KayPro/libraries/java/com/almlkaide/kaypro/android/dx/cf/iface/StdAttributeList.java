package com.almlkaide.kaypro.android.dx.cf.iface;

import com.almlkaide.kaypro.android.dx.util.FixedSizeList;

public final class StdAttributeList extends FixedSizeList implements AttributeList {
    public StdAttributeList(int i) {
        super(i);
    }

    @Override
    public Attribute mo7138get(int i) {
        return (Attribute) get0(i);
    }

    @Override
    public int byteLength() {
        int size = size();
        int iByteLength = 2;
        for (int i = 0; i < size; i++) {
            iByteLength += mo7138get(i).byteLength();
        }
        return iByteLength;
    }

    @Override
    public Attribute findFirst(String str) {
        int size = size();
        for (int i = 0; i < size; i++) {
            Attribute attributeMo7138get = mo7138get(i);
            if (attributeMo7138get.getName().equals(str)) {
                return attributeMo7138get;
            }
        }
        return (Attribute) null;
    }

    @Override
    public Attribute findNext(Attribute attribute) {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (mo7138get(i) == attribute) {
                String name = attribute.getName();
                for (int i2 = i + 1; i2 < size; i2++) {
                    Attribute attributeMo7138get = mo7138get(i2);
                    if (attributeMo7138get.getName().equals(name)) {
                        return attributeMo7138get;
                    }
                }
                return (Attribute) null;
            }
        }
        return (Attribute) null;
    }

    public void m7141set(int i, Attribute attribute) {
        set0(i, attribute);
    }
}
