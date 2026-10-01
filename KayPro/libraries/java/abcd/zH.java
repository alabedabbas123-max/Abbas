package abcd;

class zH {
    private static final int DW = 0;
    private static final int j6 = 0;
    private final abcd.uE EQ;
    private final abcd.LE FH;
    private final abcd.IE Hw;
    private final java.util.List<abcd.MH> VH;
    private final AE<abcd.MH> Zo;
    private final abcd.KH gn;
    private final abcd.UJ tp;
    private final AE<abcd.zH.a> u7;
    private final abcd.yE[] v5;

    private static class a extends abcd.AE.a {
        final byte[] EQ;

        a(abcd.YD r1, byte[] r2) {
            super(r1);
            this.EQ = r2;
        }
    }

    static {
        j6 = abcd.AbstractrE.FH.DW();
        DW = abcd.AbstractrE.j6.DW();
    }

    zH(abcd.LE r1, java.util.Set<abcd.mG> r2, AE<abcd.MH> r3, java.util.List<abcd.MH> r4, abcd.IE r5) {
        this.FH = r1;
        this.Hw = r5;
        this.v5 = (abcd.yE[]) r2.toArray(new abcd.yE[r2.size()]);
        this.Zo = r3;
        this.VH = r4;
        this.gn = new abcd.KH();
        this.u7 = new abcd.AE();
        this.tp = new abcd.UJ();
        this.EQ = new abcd.uE();
    }

    private static int j6(int r1) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r1 == 2) { $pc0 = 11; continue $sw0; }
                    if (r1 == 3) { $pc0 = 9; continue $sw0; }
                    return 0;
                }
                case 9: {
                    return j6;
                }
                case 11: {
                    return DW;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(byte[] r2, int r3, int r4) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = 2;
        $sw1: while (true) {
            switch ($pc1) {
                case 2: {
                    if (r3 >= r4) { $pc1 = 7; continue $sw1; }
                    if (r2[r3] == 47) { $pc1 = 7; continue $sw1; }
                    r3 = r3 + 1;
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.YD r2, int r3, int r4) {
        abcd.MH r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new abcd.MH(r2, r3);
                    r0.ro();
                    r0.v5(r4);
                    if (this.Zo.DW(r0) != r0) { $pc2 = 6; continue $sw2; }
                    this.VH.add(r0);
                    this.FH.update(1);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private byte[] j6(abcd.YD r4) {
        abcd.zH.a r0 = null;
        byte[] r1 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = (abcd.zH.a) this.u7.DW(r4);
                    if (r0 != null) { $pc3 = 5; continue $sw3; }
                    r1 = this.Hw.Hw(r4, 2).DW(Integer.MAX_VALUE);
                    this.u7.j6(new abcd.zH.a(r4, r1));
                    return r1;
                }
                case 5: {
                    return r0.EQ;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(int r17, byte[] r18, int r19, int r20) {
        int r5 = 0;
        int r6 = 0;
        abcd.yE[] r7 = null;
        int r8 = 0;
        int r9 = 0;
        abcd.yE[] r10 = null;
        int r11 = 0;
        int r12 = 0;
        abcd.yE r13 = null;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        int r110 = 0;
        int r111 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r5 = j6(r17);
                    if (r5 != 0) { $pc4 = 6; continue $sw4; }
                    return;
                }
                case 6: {
                    if (this.gn.j6(r20) == true) { $pc4 = 8; continue $sw4; }
                    return;
                }
                case 8: {
                    r6 = 0;
                    if (r19 != 0) { $pc4 = 14; continue $sw4; }
                    r7 = this.v5;
                    r8 = r7.length;
                    $pc4 = 11; continue $sw4;
                }
                case 11: {
                    if (r6 >= r8) { $pc4 = 12; continue $sw4; }
                    j6(r7[r6], 2, r20);
                    r6 = r6 + 1;
                    { $pc4 = 11; continue $sw4; }
                }
                case 12: {
                    return;
                }
                case 14: {
                    r9 = j6(r18, 0, r19);
                    r10 = this.v5;
                    r11 = r10.length;
                    r12 = 0;
                    $pc4 = 15; continue $sw4;
                }
                case 15: {
                    if (r12 >= r11) { $pc4 = 16; continue $sw4; }
                    r13 = r10[r12];
                    if (r9 == r19) { $pc4 = 20; continue $sw4; }
                    r14 = DW;
                    $pc4 = 21; continue $sw4;
                }
                case 21: {
                    this.tp.j6(j6(r13));
                    r15 = r14;
                    r16 = 0;
                    r110 = r9;
                    $pc4 = 23; continue $sw4;
                }
                case 23: {
                    if (this.tp.DW() == true) { $pc4 = 36; continue $sw4; }
                    r111 = this.tp.j6(r18, r16, r110, r15);
                    if (r111 < 0) { $pc4 = 27; continue $sw4; }
                    if (r111 > 0) { $pc4 = 36; continue $sw4; }
                    if (r110 == r19) { $pc4 = 32; continue $sw4; }
                    if (abcd.AbstractrE.j6.j6(this.tp.VH()) == false) { $pc4 = 36; continue $sw4; }
                    r16 = r110 + 1;
                    r110 = j6(r18, r16, r19);
                    if (r110 == r19) { $pc4 = 40; continue $sw4; }
                    r15 = DW;
                    $pc4 = 41; continue $sw4;
                }
                case 41: {
                    this.EQ.Hw(this.tp.u7(), this.tp.tp());
                    this.tp.j6(j6(this.EQ));
                    { $pc4 = 23; continue $sw4; }
                }
                case 40: {
                    r15 = r5;
                    { $pc4 = 41; continue $sw4; }
                }
                case 32: {
                    if (this.tp.Hw().FH() != r17) { $pc4 = 36; continue $sw4; }
                    this.EQ.Hw(this.tp.u7(), this.tp.tp());
                    j6(this.EQ, r17, r20);
                    { $pc4 = 36; continue $sw4; }
                }
                case 27: {
                    this.tp.J8();
                    $pc4 = 36; continue $sw4;
                }
                case 36: {
                    r12 = r12 + 1;
                    { $pc4 = 15; continue $sw4; }
                }
                case 20: {
                    r14 = r5;
                    { $pc4 = 21; continue $sw4; }
                }
                case 16: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
