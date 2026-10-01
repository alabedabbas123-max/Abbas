package com.crashlytics.android.core;

class O implements java.io.FileFilter {
    O() {
    }

    @Override
    public boolean accept(java.io.File r2) {
        if (r2.isDirectory() == true) goto L5;
    L7:
        return false;
    L5:
        if (r2.getName().length() != 35) goto L7;
        return true;
    }
}
