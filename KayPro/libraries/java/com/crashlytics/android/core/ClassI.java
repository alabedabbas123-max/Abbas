package com.crashlytics.android.core;

class ClassI {
    static final int[] j6 = null;

    static {
        j6 = new int[com.crashlytics.android.core.Ka.a.values().length];
        j6[com.crashlytics.android.core.Ka.a.j6.ordinal()] = 1;     // Catch: java.lang.NoSuchFieldError -> L6
    L8:
        j6[com.crashlytics.android.core.Ka.a.DW.ordinal()] = 2;     // Catch: java.lang.NoSuchFieldError -> L7
        return;
    }
}
