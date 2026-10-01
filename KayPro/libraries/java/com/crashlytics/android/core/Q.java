package com.crashlytics.android.core;

class Q implements java.util.Comparator<java.io.File> {
    Q() {
    }

    @Override
    public int compare(java.io.File r1, java.io.File r2) {
        return j6(r1, r2);
    }

    public int j6(java.io.File r1, java.io.File r2) {
        return r1.getName().compareTo(r2.getName());
    }
}
