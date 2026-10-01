package com.crashlytics.android.core;

class Ra {
    public final java.lang.String DW;
    public final java.lang.StackTraceElement[] FH;
    public final com.crashlytics.android.core.Ra Hw;
    public final java.lang.String j6;

    public Ra(java.lang.Throwable r2, com.crashlytics.android.core.Qa r3) {
        this.j6 = r2.getLocalizedMessage();
        this.DW = r2.getClass().getName();
        this.FH = r3.j6(r2.getStackTrace());
        java.lang.Throwable r4 = r2.getCause();
        if (r4 == null) goto L5;
        com.crashlytics.android.core.Ra r0 = new com.crashlytics.android.core.Ra(r4, r3);
    L6:
        this.Hw = r0;
        return;
    L5:
        r0 = null;
        goto L6
    }
}
