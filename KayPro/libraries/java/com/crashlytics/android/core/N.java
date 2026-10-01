package com.crashlytics.android.core;

class N implements java.io.FilenameFilter {
    N() {
    }

    @Override
    public boolean accept(java.io.File r2, java.lang.String r3) {
        if (r3.length() == 39) goto L5;
    L7:
        return false;
    L5:
        if (r3.endsWith(".cls") == false) goto L7;
        return true;
    }
}
