package com.crashlytics.android.core;

class ClassF implements java.io.FilenameFilter {
    ClassF() {
    }

    @Override
    public boolean accept(java.io.File r1, java.lang.String r2) {
        return r2.endsWith(".cls_temp");
    }
}
