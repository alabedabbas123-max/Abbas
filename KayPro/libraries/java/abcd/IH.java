package abcd;

class IH {
    private final abcd.CH DW;
    private abcd.RK.c EQ;
    private final abcd.IE FH;
    private final abcd.JH[] Hw;
    private java.util.zip.Deflater J0;
    private long VH;
    private final int Zo;
    private int gn;
    private final abcd.NH j6;
    private abcd.JH tp;
    private int u7;
    private final long v5;
    private int we;

    static final class a extends java.io.OutputStream {
        private final byte[] DW;
        private int FH;
        private final java.util.zip.Deflater j6;

        a(java.util.zip.Deflater r1, byte[] r2) {
            this.j6 = r1;
            this.DW = r2;
        }

        int j6() {
            int r0 = 0;
            byte[] r1 = null;
            int r2 = 0;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        this.j6.finish();
                        $pc0 = 3; continue $sw0;
                    }
                    case 3: {
                        r0 = this.FH;
                        r1 = this.DW;
                        if (r0 == r1.length) { $pc0 = 15; continue $sw0; }
                        r2 = this.j6.deflate(r1, r0, r1.length - r0);
                        if (r2 == 0) { $pc0 = 8; continue $sw0; }
                        this.FH += r2;
                        { $pc0 = 3; continue $sw0; }
                    }
                    case 8: {
                        if (this.j6.finished() == false) { $pc0 = 12; continue $sw0; }
                        return this.FH;
                    }
                    case 12: {
                        throw new java.io.IOException();
                    }
                    case 15: {
                        throw new java.io.EOFException();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void write(int r1) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override
        public void write(byte[] r2, int r3, int r4) {
            int r5 = 0;
            byte[] r6 = null;
            int r7 = 0;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        this.j6.setInput(r2, r3, r4);
                        $pc1 = 3; continue $sw1;
                    }
                    case 3: {
                        r5 = this.FH;
                        r6 = this.DW;
                        if (r5 == r6.length) { $pc1 = 14; continue $sw1; }
                        r7 = this.j6.deflate(r6, r5, r6.length - r5);
                        if (r7 == 0) { $pc1 = 8; continue $sw1; }
                        this.FH += r7;
                        { $pc1 = 3; continue $sw1; }
                    }
                    case 8: {
                        if (this.j6.needsInput() == false) { $pc1 = 11; continue $sw1; }
                        return;
                    }
                    case 11: {
                        throw new java.io.IOException();
                    }
                    case 14: {
                        throw new java.io.EOFException();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    IH(abcd.NH r1, abcd.CH r2, abcd.IE r3) {
        int r4 = 0;
        abcd.JH[] r5 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    this.j6 = r1;
                    this.DW = r2;
                    this.FH = r3;
                    this.Hw = new abcd.JH[this.j6.Zo() + 1];
                    r4 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    r5 = this.Hw;
                    if (r4 >= r5.length) { $pc2 = 5; continue $sw2; }
                    r5[r4] = new abcd.JH();
                    r4 = r4 + 1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 5: {
                    this.v5 = this.j6.v5();
                    this.Zo = this.j6.u7();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW() {
        this.gn = FH(this.gn);
    }

    private void DW(int r1) {
    }

    private void DW(abcd.JH r6) {
        abcd.EH r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = r6.FH;
                    if (r0 == null) { $pc3 = 6; continue $sw3; }
                    this.VH -= r0.j6();
                    $pc3 = 8; continue $sw3;
                }
                case 8: {
                    r6.j6(null);
                    return;
                }
                case 6: {
                    if (this.tp.DW == null) { $pc3 = 8; continue $sw3; }
                    this.VH -= (long) r6.DW.length;
                    { $pc3 = 8; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int FH(int r2) {
        int r3 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r3 = r2 + 1;
                    if (r3 != this.Hw.length) { $pc4 = 6; continue $sw4; }
                    return 0;
                }
                case 6: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.EH FH(abcd.JH r8) {
        abcd.EH r0 = null;
        abcd.cD.c r1 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = r8.FH;
                    if (r0 == null) { $pc5 = 13; continue $sw5; }
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    return r0;
                }
                case 13: {
                    try {
                        r0 = new abcd.EH(j6(r8));
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.lang.OutOfMemoryError) { $pc5 = 9; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (0 >= this.v5) { $pc5 = 8; continue $sw5; }
                    this.VH += r0.j6() - r0.DW();
                    $pc5 = 8; continue $sw5;
                }
                case 8: {
                    r8.FH = r0;
                    $pc5 = 9; continue $sw5;
                }
                case 9: {
                    e = $ex5;
                    r1 = new abcd.cD.c(e);
                    r1.j6(r8.j6);
                    throw r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void FH() {
        int r0 = 0;
        abcd.JH r1 = null;
        abcd.MH r2 = null;
        abcd.MH r3 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    this.u7 = this.Zo;
                    r0 = this.gn;
                    $pc6 = 3; continue $sw6;
                }
                case 3: {
                    r0 = Hw(r0);
                    if (r0 == this.gn) { $pc6 = 9; continue $sw6; }
                    r1 = this.Hw[r0];
                    if (r1.DW() == true) { $pc6 = 9; continue $sw6; }
                    if (j6(r1, r0) != 0) { $pc6 = 3; continue $sw6; }
                    this.EQ = null;
                    return;
                }
                case 9: {
                    if (this.EQ != null) { $pc6 = 12; continue $sw6; }
                    DW();
                    return;
                }
                case 12: {
                    r2 = this.Hw[this.we].j6;
                    r3 = this.tp.j6;
                    if (r2.P8() == false) { $pc6 = 15; continue $sw6; }
                    r3.DW(r2.Hw());
                    $pc6 = 16; continue $sw6;
                }
                case 16: {
                    r3.Hw(r2.rN() + 1);
                    r3.Mr();
                    j6(r2, r3);
                    this.EQ = null;
                    if (r3.rN() != this.Zo) { $pc6 = 19; continue $sw6; }
                    return;
                }
                case 19: {
                    Hw();
                    DW();
                    return;
                }
                case 15: {
                    r3.DW(r2);
                    { $pc6 = 16; continue $sw6; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int Hw(int r1) {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (r1 != 0) { $pc7 = 6; continue $sw7; }
                    return this.Hw.length - 1;
                }
                case 6: {
                    return r1 - 1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Hw() {
        abcd.JH[] r0 = null;
        int r1 = 0;
        abcd.JH r2 = null;
        int r3 = 0;
        abcd.JH[] r4 = null;
        abcd.JH r5 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = this.Hw;
                    r1 = this.gn;
                    r0[r1] = r0[this.we];
                    r2 = this.tp;
                    r3 = Hw(r1);
                    $pc8 = 4; continue $sw8;
                }
                case 4: {
                    if (r3 == this.we) { $pc8 = 5; continue $sw8; }
                    r4 = this.Hw;
                    r5 = r4[r3];
                    r4[r3] = r2;
                    r3 = Hw(r3);
                    r2 = r5;
                    { $pc8 = 4; continue $sw8; }
                }
                case 5: {
                    this.Hw[r3] = r2;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(int r1) {
        return ((((r1 + 7) >> 3) + r1) + ((r1 + 63) >> 6)) + 11;
    }

    private int j6(abcd.JH r10, int r11) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        abcd.EH r3 = null;
        byte[] r4 = null;
        abcd.RK.c r5 = null;
        abcd.RK.c r6 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (r10.Hw() == this.tp.Hw()) { $pc9 = 6; continue $sw9; }
                    DW();
                    return 0;
                }
                case 6: {
                    r0 = r10.j6();
                    r1 = this.u7;
                    if (r0 <= r1) { $pc9 = 9; continue $sw9; }
                    return 1;
                }
                case 9: {
                    r2 = j6(this.tp, r1, r10);
                    if (r2 > 8) { $pc9 = 13; continue $sw9; }
                    return 1;
                }
                case 13: {
                    if ((this.tp.FH() - r10.FH()) <= r2) { $pc9 = 16; continue $sw9; }
                    return 1;
                }
                case 16: {
                    if (this.tp.FH() >= (r10.FH() / 16)) { $pc9 = 47; continue $sw9; }
                    return 1;
                }
                case 47: {
                    try {
                        r3 = FH(r10);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        if ($t instanceof java.io.IOException) { $pc9 = 34; continue $sw9; }
                        if ($t instanceof abcd.cD) { $pc9 = 40; continue $sw9; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        r4 = j6(this.tp);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        if ($t instanceof abcd.cD) { $pc9 = 33; continue $sw9; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r5 = this.EQ;
                    if (r5 != null) { $pc9 = 23; continue $sw9; }
                    $pc9 = 25; continue $sw9;
                }
                case 25: {
                    r6 = new abcd.RK.c(r2);
                    if (r3.j6(r6, r4, r2) == true) { $pc9 = 30; continue $sw9; }
                    return 1;
                }
                case 30: {
                    if (j6(r10, r6) == false) { $pc9 = 32; continue $sw9; }
                    this.EQ = r6;
                    this.we = r11;
                    $pc9 = 32; continue $sw9;
                }
                case 32: {
                    return 1;
                }
                case 23: {
                    if (r5.DW() >= r2) { $pc9 = 25; continue $sw9; }
                    r2 = (int) this.EQ.DW();
                    $pc9 = 33; continue $sw9;
                }
                case 33: {
                    return 0;
                }
                case 40: {
                    DW(r11);
                    return 1;
                }
                case 34: {
                    e = $ex9;
                    if (r10.j6.P8() == false) { $pc9 = 39; continue $sw9; }
                    DW(r11);
                    return 1;
                }
                case 39: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(abcd.JH r0, int r1, abcd.JH r2) {
        return (((r0.FH() / 2) - 20) * (r1 - r2.j6())) / r1;
    }

    private static long j6(abcd.MH r2) {
        return abcd.EH.j6(r2.gW());
    }

    private java.util.zip.Deflater j6() {
        java.util.zip.Deflater r0 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = this.J0;
                    if (r0 != null) { $pc10 = 5; continue $sw10; }
                    this.J0 = new java.util.zip.Deflater(this.j6.DW());
                    $pc10 = 7; continue $sw10;
                }
                case 7: {
                    return this.J0;
                }
                case 5: {
                    r0.reset();
                    { $pc10 = 7; continue $sw10; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.MH r6, abcd.MH r7) {
        int r1 = 0;
        byte[] r8 = null;
        abcd.IH.a r0 = null;
        int r2 = 0;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    if (2147483647L >= this.EQ.DW()) { $pc11 = 5; continue $sw11; }
                    return;
                }
                case 5: {
                    r1 = (int) this.EQ.DW();
                    if (this.DW.j6(r1, r6, r7) == false) { $pc11 = 14; continue $sw11; }
                    try {
                        r8 = new byte[j6(r1)];
                        r0 = new abcd.IH.a(j6(), r8);
                        this.EQ.j6(r0, null);
                        this.EQ = null;
                        r2 = r0.j6();
                        r7.j6(this.DW.j6(r8, r2, r1));
                        r7.FH(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.OutOfMemoryError) { $pc11 = 9; continue $sw11; }
                        if ($t instanceof java.io.IOException) { $pc11 = 10; continue $sw11; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc11 = 16; continue $sw11;
                }
                case 16: {
                    return;
                }
                case 10: {
                    this.DW.j6(r1);
                    return;
                }
                case 9: {
                    this.DW.j6(r1);
                    return;
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean j6(abcd.JH r8, abcd.RK.c r9) {
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if (this.EQ != null) { $pc12 = 6; continue $sw12; }
                    return true;
                }
                case 6: {
                    if (r9.DW() != this.EQ.DW()) { $pc12 = 12; continue $sw12; }
                    if (r8.j6() >= this.Hw[this.we].j6()) { $pc12 = 10; continue $sw12; }
                    return true;
                }
                case 10: {
                    return false;
                }
                case 12: {
                    if (r9.DW() >= this.EQ.DW()) { $pc12 = 14; continue $sw12; }
                    return true;
                }
                case 14: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private byte[] j6(abcd.JH r7) {
        byte[] r0 = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r0 = r7.DW;
                    if (r0 != null) { $pc13 = 8; continue $sw13; }
                    r0 = abcd.TH.j6(this.j6, this.FH, r7.j6);
                    if (0 >= this.v5) { $pc13 = 7; continue $sw13; }
                    this.VH += (long) r0.length;
                    $pc13 = 7; continue $sw13;
                }
                case 7: {
                    r7.DW = r0;
                    $pc13 = 8; continue $sw13;
                }
                case 8: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(abcd.LE r9, abcd.MH[] r10, int r11, int r12) {
        int r13 = 0;
        int r0 = 0;
        long r1 = 0L;
        java.util.zip.Deflater r14 = null;
        java.util.zip.Deflater r15 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r13 = r12 + r11;
                    $pc14 = 3; continue $sw14;
                }
                case 3: {
                    if (r11 >= r13) { $pc14 = 4; continue $sw14; }
                    try {
                        this.tp = this.Hw[this.gn];
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 22; continue $sw14;
                    }
                    if (0 >= this.v5) { $pc14 = 17; continue $sw14; }
                    try {
                        DW(this.tp);
                        r0 = FH(this.gn);
                        r1 = j6(r10[r11]);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 22; continue $sw14;
                    }
                    $pc14 = 12; continue $sw14;
                }
                case 12: {
                    if (this.v5 >= (this.VH + r1)) { $pc14 = 17; continue $sw14; }
                    if (r0 == this.gn) { $pc14 = 17; continue $sw14; }
                    try {
                        DW(this.Hw[r0]);
                        r0 = FH(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 22; continue $sw14;
                    }
                    $pc14 = 17; continue $sw14;
                }
                case 17: {
                    try {
                        this.tp.j6(r10[r11]);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 22; continue $sw14;
                    }
                    if (this.tp.j6.P8() == false) { $pc14 = 20; continue $sw14; }
                    try {
                        DW();
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 22; continue $sw14;
                    }
                    $pc14 = 21; continue $sw14;
                }
                case 21: {
                    r11 = r11 + 1;
                    { $pc14 = 3; continue $sw14; }
                }
                case 20: {
                    try {
                        r9.update(1);
                        FH();
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 22; continue $sw14;
                    }
                    $pc14 = 22; continue $sw14;
                }
                case 22: {
                    th = $ex14;
                    r14 = this.J0;
                    if (r14 == null) { $pc14 = 27; continue $sw14; }
                    r14.end();
                    $pc14 = 27; continue $sw14;
                }
                case 27: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    r15 = this.J0;
                    if (r15 == null) { $pc14 = 36; continue $sw14; }
                    r15.end();
                    return;
                }
                case 36: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
