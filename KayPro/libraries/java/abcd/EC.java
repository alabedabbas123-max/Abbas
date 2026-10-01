package abcd;

class EC {
    private static final abcd.EC.a j6 = null;
    private long DW;
    private int FH;
    private int Hw;
    private int Zo;
    private long[] v5;

    static class a extends java.lang.Exception {
        a() {
        }
    }

    static {
        j6 = new abcd.EC.a();
    }

    EC() {
        this.Zo = 8;
        int r0 = this.Zo;
        this.v5 = new long[1 << r0];
        this.Hw = j6(r0);
    }

    private int DW(int r3) {
        return (this.v5.length - this.FH) + r3;
    }

    private static long DW(long r2) {
        return r2 & 4294967295L;
    }

    private void DW() {
        int r0 = 0;
        long[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        long r4 = 0L;
        int r8 = 0;
        long[] r9 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.Zo;
                    if (r0 == 30) { $pc0 = 22; continue $sw0; }
                    r1 = this.v5;
                    r2 = r1.length;
                    this.Zo = r0 + 1;
                    this.Hw = j6(this.Zo);
                    try {
                        this.v5 = new long[1 << this.Zo];
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.OutOfMemoryError) { $pc0 = 19; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r3 = 0;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r3 >= r2) { $pc0 = 8; continue $sw0; }
                    r4 = r1[r3];
                    if (r4 == 0) { $pc0 = 18; continue $sw0; }
                    r8 = FH(FH(r4));
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    r9 = this.v5;
                    if (r9[r8] == 0) { $pc0 = 14; continue $sw0; }
                    r8 = r8 + 1;
                    if (r8 < r9.length) { $pc0 = 12; continue $sw0; }
                    r8 = 0;
                    { $pc0 = 12; continue $sw0; }
                }
                case 14: {
                    r9[r8] = r4;
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    r3 = r3 + 1;
                    { $pc0 = 7; continue $sw0; }
                }
                case 8: {
                    return;
                }
                case 20: {
                    throw j6;
                }
                case 22: {
                    throw new abcd.EC.a();
                }
                case 19: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int FH(int r2) {
        return r2 >>> (31 - this.Zo);
    }

    private static int FH(long r1) {
        return (int) (r1 >>> 32);
    }

    private static int j6(int r2) {
        return ((1 << r2) * (r2 - 3)) / r2;
    }

    private static long j6(int r3, long r4) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (4294967295L < r4) { $pc1 = 7; continue $sw1; }
                    return r4 | (((long) r3) << 32);
                }
                case 7: {
                    throw new abcd.EC.a();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static long j6(abcd.EC r2, abcd.EC r3) {
        int r1 = r2.DW(0);
        int r0 = r3.DW(0);
        return j6(r2.v5, r1, r3.v5, r0);
    }

    private static long j6(long[] r7, int r8, long[] r9, int r10) {
        long r1 = 0L;
        int r0 = 0;
        int r3 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r1 = 0;
                    if (r8 != r7.length) { $pc2 = 5; continue $sw2; }
                    $pc2 = 25; continue $sw2;
                }
                case 25: {
                    return 0;
                }
                case 5: {
                    if (r10 == r9.length) { $pc2 = 25; continue $sw2; }
                    r0 = FH(r7[r8]);
                    r3 = FH(r9[r10]);
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    if (r0 == r3) { $pc2 = 9; continue $sw2; }
                    if (r0 < r3) { $pc2 = 17; continue $sw2; }
                    r10 = r10 + 1;
                    if (r10 == r9.length) { $pc2 = 23; continue $sw2; }
                    r3 = FH(r9[r10]);
                    $pc2 = 23; continue $sw2;
                }
                case 23: {
                    return r1;
                }
                case 17: {
                    r8 = r8 + 1;
                    if (r8 == r7.length) { $pc2 = 23; continue $sw2; }
                    r0 = FH(r7[r8]);
                    { $pc2 = 8; continue $sw2; }
                }
                case 9: {
                    r1 = r1 + java.lang.Math.min(DW(r7[r8]), DW(r9[r10]));
                    r8 = r8 + 1;
                    if (r8 == r7.length) { $pc2 = 23; continue $sw2; }
                    r0 = FH(r7[r8]);
                    r10 = r10 + 1;
                    if (r10 == r9.length) { $pc2 = 23; continue $sw2; }
                    r3 = FH(r9[r10]);
                    { $pc2 = 8; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int j6(abcd.EC r6, int r7) {
        long r0 = 0L;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = java.lang.Math.max(this.DW, r6.DW);
                    if (r0 != 0) { $pc3 = 6; continue $sw3; }
                    return r7;
                }
                case 6: {
                    return (int) ((j6(r6) * ((long) r7)) / r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    long j6(abcd.EC r3) {
        return j6(this, r3);
    }

    void j6() {
        java.util.Arrays.sort(this.v5);
    }

    void j6(int r8, int r9) {
        int r10 = 0;
        int r0 = 0;
        long[] r1 = null;
        long r2 = 0L;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r10 = (r8 * (-1640562687)) >>> 1;
                    r0 = FH(r10);
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    r1 = this.v5;
                    r2 = r1[r0];
                    if (r2 == 0) { $pc4 = 6; continue $sw4; }
                    if (FH(r2) == r10) { $pc4 = 12; continue $sw4; }
                    r0 = r0 + 1;
                    if (r0 < this.v5.length) { $pc4 = 3; continue $sw4; }
                    r0 = 0;
                    { $pc4 = 3; continue $sw4; }
                }
                case 12: {
                    this.v5[r0] = j6(r10, DW(r2) + ((long) r9));
                    return;
                }
                case 6: {
                    if (this.Hw > this.FH) { $pc4 = 8; continue $sw4; }
                    DW();
                    r0 = FH(r10);
                    { $pc4 = 3; continue $sw4; }
                }
                case 8: {
                    r1[r0] = j6(r10, r9);
                    this.FH++;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(long r1) {
        this.DW = r1;
    }

    void j6(abcd.FE r3) {
        abcd.JE r4 = null;
        byte[] r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r3.Hw() == false) { $pc5 = 10; continue $sw5; }
                    r4 = r3.v5();
                    try {
                        j6(r4.j6());
                        j6(r4, this.DW);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 7; continue $sw5;
                    }
                    r4.close();
                    return;
                }
                case 7: {
                    th = $ex5;
                    r4.close();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 10: {
                    r5 = r3.j6();
                    j6(r5.length);
                    j6(r5, 0, r5.length);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(java.io.InputStream r10, long r11) {
        byte[] r0 = null;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = new byte[4096];
                    r2 = 0;
                    r3 = 0;
                    $pc6 = 4; continue $sw6;
                }
                case 4: {
                    if (0 >= r11) { $pc6 = 5; continue $sw6; }
                    r4 = 5381;
                    r5 = 0;
                    $pc6 = 7; continue $sw6;
                }
                case 7: {
                    if (r3 != r2) { $pc6 = 13; continue $sw6; }
                    r2 = r10.read(r0, 0, r0.length);
                    if (r2 <= 0) { $pc6 = 12; continue $sw6; }
                    r3 = 0;
                    { $pc6 = 13; continue $sw6; }
                }
                case 12: {
                    throw new java.io.EOFException();
                }
                case 13: {
                    r5 = r5 + 1;
                    r6 = r3 + 1;
                    r7 = r0[r3] & 255;
                    if (r7 == 10) { $pc6 = 22; continue $sw6; }
                    r4 = ((r4 << 5) + r4) + r7;
                    if (r5 >= 64) { $pc6 = 22; continue $sw6; }
                    if (r5 >= r11) { $pc6 = 22; continue $sw6; }
                    r3 = r6;
                    $pc6 = 22; continue $sw6;
                }
                case 22: {
                    j6(r4, r5);
                    r11 = r11 - ((long) r5);
                    r3 = r6;
                    { $pc6 = 4; continue $sw6; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(byte[] r5, int r6, int r7) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 2;
        $sw7: while (true) {
            switch ($pc7) {
                case 2: {
                    if (r6 >= r7) { $pc7 = 3; continue $sw7; }
                    r0 = r6;
                    r1 = 5381;
                    $pc7 = 5; continue $sw7;
                }
                case 5: {
                    r2 = r0 + 1;
                    r3 = r5[r0] & 255;
                    if (r3 == 10) { $pc7 = 14; continue $sw7; }
                    r1 = ((r1 << 5) + r1) + r3;
                    if (r2 >= r7) { $pc7 = 14; continue $sw7; }
                    if ((r2 - r6) >= 64) { $pc7 = 14; continue $sw7; }
                    r0 = r2;
                    $pc7 = 14; continue $sw7;
                }
                case 14: {
                    j6(r1, r2 - r6);
                    r6 = r2;
                    { $pc7 = 2; continue $sw7; }
                }
                case 3: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
