package com.crashlytics.android.answers;

class C implements com.crashlytics.android.answers.t {
    static final java.util.Set<com.crashlytics.android.answers.I.b> j6 = null;
    final int DW;

    static {
        j6 = new com.crashlytics.android.answers.B();
    }

    public C(int r1) {
        this.DW = r1;
    }

    @Override
    public boolean j6(com.crashlytics.android.answers.I r5) {
        if (j6.contains(r5.FH) == true) goto L5;
    L7:
        boolean r0 = false;
    L9:
        if (java.lang.Math.abs(r5.j6.FH.hashCode() % this.DW) == 0) goto L11;
        boolean r6 = true;
    L12:
        if (r0 == false) goto L15;
        if (r6 == false) goto L15;
        return true;
    L15:
        return false;
    L11:
        r6 = false;
        goto L12
    L5:
        if (r5.j6.v5 != null) goto L7;
        r0 = true;
        goto L9
    }
}
