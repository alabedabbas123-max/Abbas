package com.crashlytics.android.core;

final class ClassD {
    public static final com.crashlytics.android.core.ClassD j6 = null;
    private final byte[] DW;
    private volatile int FH;

    static {
        j6 = new com.crashlytics.android.core.ClassD(new byte[0]);
    }

    private ClassD(byte[] r2) {
        this.FH = 0;
        this.DW = r2;
    }

    public static com.crashlytics.android.core.ClassD j6(java.lang.String r2) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    return new com.crashlytics.android.core.ClassD(r2.getBytes("UTF-8"));
                }
                case 4: {
                    e = $ex0;
                    throw new java.lang.RuntimeException("UTF-8 not supported.", e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static com.crashlytics.android.core.ClassD j6(byte[] r2, int r3, int r4) {
        byte[] r0 = new byte[r4];
        java.lang.System.arraycopy(r2, r3, r0, 0, r4);
        return new com.crashlytics.android.core.ClassD(r0);
    }

    public int DW() {
        return this.DW.length;
    }

    public boolean equals(java.lang.Object r8) {
        byte[] r1 = null;
        int r3 = 0;
        byte[] r9 = null;
        int r4 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r8 != this) { $pc1 = 6; continue $sw1; }
                    return true;
                }
                case 6: {
                    if ((r8 instanceof com.crashlytics.android.core.ClassD) == true) { $pc1 = 8; continue $sw1; }
                    return false;
                }
                case 8: {
                    r1 = this.DW;
                    r3 = r1.length;
                    r9 = ((com.crashlytics.android.core.ClassD) r8).DW;
                    if (r3 == r9.length) { $pc1 = 11; continue $sw1; }
                    return false;
                }
                case 11: {
                    r4 = 0;
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    if (r4 >= r3) { $pc1 = 17; continue $sw1; }
                    if (r1[r4] != r9[r4]) { $pc1 = 15; continue $sw1; }
                    r4 = r4 + 1;
                    { $pc1 = 12; continue $sw1; }
                }
                case 15: {
                    return false;
                }
                case 17: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        int r0 = 0;
        byte[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.FH;
                    if (r0 != 0) { $pc2 = 11; continue $sw2; }
                    r1 = this.DW;
                    r2 = r1.length;
                    r3 = 0;
                    r4 = r2;
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    if (r3 >= r2) { $pc2 = 7; continue $sw2; }
                    r4 = (r4 * 31) + r1[r3];
                    r3 = r3 + 1;
                    { $pc2 = 5; continue $sw2; }
                }
                case 7: {
                    if (r4 != 0) { $pc2 = 9; continue $sw2; }
                    r0 = 1;
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    this.FH = r0;
                    { $pc2 = 11; continue $sw2; }
                }
                case 9: {
                    r0 = r4;
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.io.InputStream j6() {
        return new java.io.ByteArrayInputStream(this.DW);
    }

    public void j6(byte[] r2, int r3, int r4, int r5) {
        java.lang.System.arraycopy(this.DW, r3, r2, r4, r5);
    }
}
