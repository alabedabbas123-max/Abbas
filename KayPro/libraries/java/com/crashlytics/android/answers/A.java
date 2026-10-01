package com.crashlytics.android.answers;

class A {
    private abcd.rz DW;
    long j6;

    public A(abcd.rz r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 == null) { $pc0 = 7; continue $sw0; }
                    this.DW = r2;
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("retryState must not be null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        long r0 = 0L;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.DW.j6() * 1000000;
                    if ((r5 - this.j6) < r0) { $pc1 = 5; continue $sw1; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
