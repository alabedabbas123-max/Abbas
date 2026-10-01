package com.crashlytics.android.core;

class D extends com.crashlytics.android.core.W.d {
    D(java.lang.String r1) {
        super(r1);
    }

    @Override
    public boolean accept(java.io.File r1, java.lang.String r2) {
        if (super.accept(r1, r2) == true) goto L5;
    L7:
        return false;
    L5:
        if (r2.endsWith(".cls") == false) goto L7;
        return true;
    }
}
