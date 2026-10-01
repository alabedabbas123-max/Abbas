package com.crashlytics.android.core;

class Ja implements com.crashlytics.android.core.Qa {
    private final int j6;

    public Ja(int r1) {
        this.j6 = r1;
    }

    private static boolean j6(java.lang.StackTraceElement[] r5, int r6, int r7) {
        int r0 = r7 - r6;
        if ((r7 + r0) <= r5.length) goto L5;
        return false;
    L5:
        int r1 = 0;
    L6:
        if (r1 >= r0) goto L11;
        if (r5[r6 + r1].equals(r5[r7 + r1]) == false) goto L9;
        r1 = r1 + 1;
        goto L6
    L9:
        return false;
    L11:
        return true;
    }

    private static java.lang.StackTraceElement[] j6(java.lang.StackTraceElement[] r10, int r11) {
        java.util.HashMap r0 = new java.util.HashMap();
        java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r10.length];
        int r4 = 0;
        int r5 = 0;
        int r6 = 1;
    L4:
        if (r4 >= r10.length) goto L16;
        java.lang.StackTraceElement r7 = r10[r4];
        java.lang.Integer r8 = (java.lang.Integer) r0.get(r7);
        if (r8 != null) goto L8;
    L14:
        r1[r5] = r10[r4];
        r5 = r5 + 1;
        int r9 = r4;
        r6 = 1;
    L15:
        r0.put(r7, java.lang.Integer.valueOf(r4));
        r4 = r9 + 1;
        goto L4
    L8:
        if (j6(r10, r8.intValue(), r4) == false) goto L14;
        int r12 = r4 - r8.intValue();
        if (r6 >= r11) goto L13;
        java.lang.System.arraycopy(r10, r4, r1, r5, r12);
        r5 = r5 + r12;
        r6 = r6 + 1;
    L13:
        r9 = (r12 - 1) + r4;
        goto L15
    L16:
        java.lang.StackTraceElement[] r13 = new java.lang.StackTraceElement[r5];
        java.lang.System.arraycopy(r1, 0, r13, 0, r13.length);
        return r13;
    }

    @Override
    public java.lang.StackTraceElement[] j6(java.lang.StackTraceElement[] r4) {
        java.lang.StackTraceElement[] r0 = j6(r4, this.j6);
        if (r0.length >= r4.length) goto L5;
        return r0;
    L5:
        return r4;
    }
}
