package com.almlkaide.kaypro.android.dx.cf.iface;

public interface AttributeList {
    int byteLength();

    Attribute findFirst(String str);

    Attribute findNext(Attribute attribute);

    Attribute mo7138get(int i);

    boolean isMutable();

    int size();
}
