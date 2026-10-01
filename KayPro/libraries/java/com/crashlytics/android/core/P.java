package com.crashlytics.android.core;

class P implements java.util.Comparator<java.io.File> {
    P() {
    }

    @Override
    public int compare(java.io.File r1, java.io.File r2) {
        return j6(r1, r2);
    }

    public int j6(java.io.File r1, java.io.File r2) {
        return r2.getName().compareTo(r1.getName());
    }
}
