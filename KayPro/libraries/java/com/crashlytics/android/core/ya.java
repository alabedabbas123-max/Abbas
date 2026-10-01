package com.crashlytics.android.core;

class ya implements com.crashlytics.android.core.Qa {
    private final com.crashlytics.android.core.Qa[] DW;
    private final com.crashlytics.android.core.za FH;
    private final int j6;

    public ya(int r1, com.crashlytics.android.core.Qa... r2) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = new com.crashlytics.android.core.za(r1);
    }

    @Override
    public java.lang.StackTraceElement[] j6(java.lang.StackTraceElement[] r8) {
        if (r8.length > this.j6) goto L5;
        return r8;
    L5:
        com.crashlytics.android.core.Qa[] r0 = this.DW;
        int r1 = r0.length;
        int r2 = 0;
        java.lang.StackTraceElement[] r3 = r8;
    L6:
        if (r2 >= r1) goto L12;
        com.crashlytics.android.core.Qa r4 = r0[r2];
        if (r3.length <= this.j6) goto L12;
        r3 = r4.j6(r8);
        r2 = r2 + 1;
    L12:
        if (r3.length > this.j6) goto L14;
        return r3;
    L14:
        return this.FH.j6(r3);
    }
}
