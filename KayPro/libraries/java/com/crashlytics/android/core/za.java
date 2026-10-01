package com.crashlytics.android.core;

class za implements com.crashlytics.android.core.Qa {
    private final int j6;

    public za(int r1) {
        this.j6 = r1;
    }

    @Override
    public java.lang.StackTraceElement[] j6(java.lang.StackTraceElement[] r5) {
        int r0 = r5.length;
        int r1 = this.j6;
        if (r0 > r1) goto L5;
        return r5;
    L5:
        int r2 = r1 / 2;
        int r3 = r1 - r2;
        java.lang.StackTraceElement[] r4 = new java.lang.StackTraceElement[r1];
        java.lang.System.arraycopy(r5, 0, r4, 0, r3);
        java.lang.System.arraycopy(r5, r5.length - r2, r4, r3, r2);
        return r4;
    }
}
