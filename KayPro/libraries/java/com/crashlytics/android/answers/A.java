package com.crashlytics.android.answers;

class A {
    private abcd.rz DW;
    long j6;

    public A(abcd.rz r2) {
        if (r2 == null) goto L7;
        this.DW = r2;
        return;
    L7:
        throw new java.lang.NullPointerException("retryState must not be null");
    }

    public void DW(long r1) {
        this.j6 = r1;
        this.DW = this.DW.FH();
    }

    public void j6() {
        this.j6 = 0;
        this.DW = this.DW.DW();
    }

    public boolean j6(long r5) {
        long r0 = this.DW.j6() * 1000000;
        if ((r5 - this.j6) < r0) goto L5;
        return true;
    L5:
        return false;
    }
}
