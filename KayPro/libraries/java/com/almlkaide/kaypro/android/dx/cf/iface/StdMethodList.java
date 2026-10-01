package com.almlkaide.kaypro.android.dx.cf.iface;

import com.almlkaide.kaypro.android.dx.util.FixedSizeList;

public final class StdMethodList extends FixedSizeList implements MethodList {
    public StdMethodList(int i) {
        super(i);
    }

    @Override
    public Method mo7140get(int i) {
        return (Method) get0(i);
    }

    public void m7143set(int i, Method method) {
        set0(i, method);
    }
}
