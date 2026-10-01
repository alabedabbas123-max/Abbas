package com.crashlytics.android.core;

class ClassJ implements com.crashlytics.android.core.Interfaceka {
    private final com.crashlytics.android.core.Aa DW;
    private final com.crashlytics.android.core.na j6;

    public ClassJ(com.crashlytics.android.core.na r1, com.crashlytics.android.core.Aa r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    @Override
    public boolean j6(com.crashlytics.android.core.ja r4) {
        int r0 = com.crashlytics.android.core.ClassI.j6[r4.DW.getType().ordinal()];
        if (r0 != 1) goto L5;
        this.j6.j6(r4);
        return true;
    L5:
        if (r0 == 2) goto L8;
        return false;
    L8:
        this.DW.j6(r4);
        return true;
    }
}
