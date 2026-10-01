package com.crashlytics.android.core;

final class ClassH implements java.io.Flushable {
    private final int DW;
    private int FH;
    private final java.io.OutputStream Hw;
    private final byte[] j6;

    static class a extends java.io.IOException {
        a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private ClassH(java.io.OutputStream r1, byte[] r2) {
        this.Hw = r1;
        this.j6 = r2;
        this.FH = 0;
        this.DW = r2.length;
    }

    public static int DW(int r0) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r0 >= 0) { $pc0 = 4; continue $sw0; }
                    return 10;
                }
                case 4: {
                    return FH(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int DW(int r0, int r1) {
        return v5(r0) + Hw(r1);
    }

    public static int DW(long r0) {
        return j6(r0);
    }

    public static int FH(int r1) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r1 & (-128)) != 0) { $pc1 = 7; continue $sw1; }
                    return 1;
                }
                case 7: {
                    if ((r1 & (-16384)) != 0) { $pc1 = 11; continue $sw1; }
                    return 2;
                }
                case 11: {
                    if (((-2097152) & r1) != 0) { $pc1 = 15; continue $sw1; }
                    return 3;
                }
                case 15: {
                    if ((r1 & (-268435456)) != 0) { $pc1 = 18; continue $sw1; }
                    return 4;
                }
                case 18: {
                    return 5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int FH(int r0, int r1) {
        return v5(r0) + Zo(r1);
    }

    public static int Hw(int r0) {
        return FH(VH(r0));
    }

    public static int VH(int r1) {
        int r0 = r1 << 1;
        return (r1 >> 31) ^ r0;
    }

    public static int Zo(int r0) {
        return FH(r0);
    }

    public static int j6(float r0) {
        return 4;
    }

    public static int j6(int r0) {
        return DW(r0);
    }

    public static int j6(int r0, float r1) {
        return v5(r0) + j6(r1);
    }

    public static int j6(int r0, int r1) {
        return v5(r0) + j6(r1);
    }

    public static int j6(int r0, long r1) {
        return v5(r0) + DW(r1);
    }

    public static int j6(int r0, com.crashlytics.android.core.ClassD r1) {
        return v5(r0) + j6(r1);
    }

    public static int j6(int r0, boolean r1) {
        return v5(r0) + j6(r1);
    }

    public static int j6(long r5) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (((-128) & r5) != 0) { $pc2 = 7; continue $sw2; }
                    return 1;
                }
                case 7: {
                    if (((-16384) & r5) != 0) { $pc2 = 11; continue $sw2; }
                    return 2;
                }
                case 11: {
                    if (((-2097152) & r5) != 0) { $pc2 = 15; continue $sw2; }
                    return 3;
                }
                case 15: {
                    if (((-268435456) & r5) != 0) { $pc2 = 19; continue $sw2; }
                    return 4;
                }
                case 19: {
                    if (((-34359738368L) & r5) != 0) { $pc2 = 23; continue $sw2; }
                    return 5;
                }
                case 23: {
                    if (((-4398046511104L) & r5) != 0) { $pc2 = 27; continue $sw2; }
                    return 6;
                }
                case 27: {
                    if (((-562949953421312L) & r5) != 0) { $pc2 = 31; continue $sw2; }
                    return 7;
                }
                case 31: {
                    if (((-72057594037927936L) & r5) != 0) { $pc2 = 35; continue $sw2; }
                    return 8;
                }
                case 35: {
                    if ((r5 & Long.MIN_VALUE) != 0) { $pc2 = 38; continue $sw2; }
                    return 9;
                }
                case 38: {
                    return 10;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int j6(com.crashlytics.android.core.ClassD r1) {
        return FH(r1.DW()) + r1.DW();
    }

    public static int j6(boolean r0) {
        return 1;
    }

    public static com.crashlytics.android.core.ClassH j6(java.io.OutputStream r1) {
        return j6(r1, 4096);
    }

    public static com.crashlytics.android.core.ClassH j6(java.io.OutputStream r1, int r2) {
        return new com.crashlytics.android.core.ClassH(r1, new byte[r2]);
    }

    private void j6() {
        java.io.OutputStream r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.Hw;
                    if (r0 == null) { $pc3 = 7; continue $sw3; }
                    r0.write(this.j6, 0, this.FH);
                    this.FH = 0;
                    return;
                }
                case 7: {
                    throw new com.crashlytics.android.core.ClassH.a();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int v5(int r1) {
        return FH(com.crashlytics.android.core.Wa.j6(r1, 0));
    }

    public void DW(float r1) {
        EQ(java.lang.Float.floatToRawIntBits(r1));
    }

    public void DW(int r2, float r3) {
        Zo(r2, 5);
        DW(r3);
    }

    public void DW(int r2, long r3) {
        Zo(r2, 0);
        Hw(r3);
    }

    public void DW(int r2, com.crashlytics.android.core.ClassD r3) {
        Zo(r2, 2);
        DW(r3);
    }

    public void DW(int r2, boolean r3) {
        Zo(r2, 0);
        DW(r3);
    }

    public void DW(com.crashlytics.android.core.ClassD r2) {
        we(r2.DW());
        FH(r2);
    }

    public void DW(boolean r1) {
        tp(r1 ? 1 : 0);
    }

    public void EQ(int r2) {
        tp(r2 & 255);
        tp((r2 >> 8) & 255);
        tp((r2 >> 16) & 255);
        tp((r2 >> 24) & 255);
    }

    public void FH(long r6) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = 3;
        $sw4: while (true) {
            switch ($pc4) {
                case 3: {
                    if (((-128) & r6) == 0) { $pc4 = 4; continue $sw4; }
                    tp((((int) r6) & 127) | 128);
                    r6 = r6 >>> 7;
                    { $pc4 = 3; continue $sw4; }
                }
                case 4: {
                    tp((int) r6);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH(com.crashlytics.android.core.ClassD r3) {
        j6(r3, 0, r3.DW());
    }

    public void Hw(int r2, int r3) {
        Zo(r2, 0);
        gn(r3);
    }

    public void Hw(long r1) {
        FH(r1);
    }

    public void J0(int r1) {
        we(VH(r1));
    }

    public void J8(int r1) {
        we(r1);
    }

    public void VH(int r2, int r3) {
        Zo(r2, 0);
        J8(r3);
    }

    public void Zo(int r1, int r2) {
        we(com.crashlytics.android.core.Wa.j6(r1, r2));
    }

    @Override
    public void flush() {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (this.Hw == null) { $pc5 = 6; continue $sw5; }
                    j6();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void gn(int r1) {
        u7(r1);
    }

    public void j6(byte r4) {
        byte[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (this.FH != this.DW) { $pc6 = 5; continue $sw6; }
                    j6();
                    $pc6 = 5; continue $sw6;
                }
                case 5: {
                    r0 = this.j6;
                    r1 = this.FH;
                    this.FH = r1 + 1;
                    r0[r1] = r4;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(com.crashlytics.android.core.ClassD r7, int r8, int r9) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r10 = 0;
        int r11 = 0;
        java.io.InputStream r12 = null;
        long r3 = 0L;
        int r13 = 0;
        int r4 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = this.DW;
                    r1 = this.FH;
                    if ((r0 - r1) < r9) { $pc7 = 5; continue $sw7; }
                    r7.j6(this.j6, r8, r1, r9);
                    this.FH += r9;
                    return;
                }
                case 5: {
                    r2 = r0 - r1;
                    r7.j6(this.j6, r8, r1, r2);
                    r10 = r8 + r2;
                    r11 = r9 - r2;
                    this.FH = this.DW;
                    j6();
                    if (r11 > this.DW) { $pc7 = 8; continue $sw7; }
                    r7.j6(this.j6, r10, 0, r11);
                    this.FH = r11;
                    return;
                }
                case 8: {
                    r12 = r7.j6();
                    r3 = r10;
                    if (r3 != r12.skip(r3)) { $pc7 = 18; continue $sw7; }
                    $pc7 = 10; continue $sw7;
                }
                case 10: {
                    if (r11 <= 0) { $pc7 = 23; continue $sw7; }
                    r13 = java.lang.Math.min(r11, this.DW);
                    r4 = r12.read(this.j6, 0, r13);
                    if (r4 != r13) { $pc7 = 15; continue $sw7; }
                    this.Hw.write(this.j6, 0, r4);
                    r11 = r11 - r4;
                    { $pc7 = 10; continue $sw7; }
                }
                case 15: {
                    throw new java.lang.IllegalStateException("Read failed.");
                }
                case 23: {
                    return;
                }
                case 18: {
                    throw new java.lang.IllegalStateException("Skip failed.");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(byte[] r3) {
        j6(r3, 0, r3.length);
    }

    public void j6(byte[] r4, int r5, int r6) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r7 = 0;
        int r8 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = this.DW;
                    r1 = this.FH;
                    if ((r0 - r1) < r6) { $pc8 = 5; continue $sw8; }
                    java.lang.System.arraycopy(r4, r5, this.j6, r1, r6);
                    this.FH += r6;
                    return;
                }
                case 5: {
                    r2 = r0 - r1;
                    java.lang.System.arraycopy(r4, r5, this.j6, r1, r2);
                    r7 = r5 + r2;
                    r8 = r6 - r2;
                    this.FH = this.DW;
                    j6();
                    if (r8 > this.DW) { $pc8 = 8; continue $sw8; }
                    java.lang.System.arraycopy(r4, r7, this.j6, 0, r8);
                    this.FH = r8;
                    return;
                }
                case 8: {
                    this.Hw.write(r4, r7, r8);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void tp(int r1) {
        j6((byte) r1);
    }

    public void u7(int r3) {
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (r3 < 0) { $pc9 = 4; continue $sw9; }
                    we(r3);
                    return;
                }
                case 4: {
                    FH(r3);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void v5(int r2, int r3) {
        Zo(r2, 0);
        J0(r3);
    }

    public void we(int r2) {
        java.lang.Throwable $ex10 = null;
        int $pc10 = 3;
        $sw10: while (true) {
            switch ($pc10) {
                case 3: {
                    if ((r2 & (-128)) == 0) { $pc10 = 4; continue $sw10; }
                    tp((r2 & 127) | 128);
                    r2 = r2 >>> 7;
                    { $pc10 = 3; continue $sw10; }
                }
                case 4: {
                    tp(r2);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
