package abcd;

class EG {
    private static volatile int DW;
    private static final java.lang.ref.SoftReference<abcd.EG.a> j6 = null;
    private final int FH;
    private final abcd.EG.b[] Hw;
    private int VH;
    private abcd.EG.b Zo;
    private abcd.EG.b v5;

    static class a {
        final int DW;
        final byte[] j6;

        a(byte[] r1, int r2) {
            this.j6 = r1;
            this.DW = r2;
        }
    }

    private static class b {
        abcd.EG.b DW;
        abcd.aH FH;
        long Hw;
        java.lang.ref.SoftReference<abcd.EG.a> Zo;
        abcd.EG.b j6;
        int v5;

        private b() {
            this.Zo = abcd.EG.j6();
        }

        b(abcd.EG.b r1) {
            this();
        }
    }

    static {
        j6 = new java.lang.ref.SoftReference(null);
        j6(new abcd.vH());
    }

    EG() {
        this.FH = DW;
        this.Hw = new abcd.EG.b[1024];
    }

    private void DW() {
        abcd.EG.b r0 = null;
        abcd.EG.b r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 3: {
                    if (this.VH <= this.FH) { $pc0 = 12; continue $sw0; }
                    r0 = this.Zo;
                    if (r0 == null) { $pc0 = 17; continue $sw0; }
                    r1 = r0.j6;
                    j6(r0);
                    r0.j6 = null;
                    r0.DW = null;
                    if (r1 != null) { $pc0 = 10; continue $sw0; }
                    this.v5 = null;
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    this.Zo = r1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 10: {
                    r1.DW = null;
                    { $pc0 = 11; continue $sw0; }
                }
                case 17: {
                    return;
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW(abcd.EG.b r2) {
        abcd.EG.b r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    FH(r2);
                    r2.j6 = null;
                    r0 = this.v5;
                    r2.DW = r0;
                    if (r0 == null) { $pc1 = 5; continue $sw1; }
                    r0.j6 = r2;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    this.v5 = r2;
                    return;
                }
                case 5: {
                    this.Zo = r2;
                    { $pc1 = 6; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void FH(abcd.EG.b r2) {
        abcd.EG.b r0 = null;
        abcd.EG.b r3 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = r2.j6;
                    r3 = r2.DW;
                    if (r0 == null) { $pc2 = 5; continue $sw2; }
                    r0.DW = r3;
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    if (r3 == null) { $pc2 = 8; continue $sw2; }
                    r3.j6 = r0;
                    return;
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static int j6(long r0) {
        return (((int) r0) << 22) >>> 22;
    }

    static java.lang.ref.SoftReference j6() {
        return j6;
    }

    private void j6(abcd.EG.b r3) {
        this.VH -= r3.v5;
        r3.FH = null;
        r3.Zo = j6;
        r3.v5 = 0;
    }

    static void j6(abcd.vH r0) {
        DW = r0.j6();
    }

    abcd.EG.a j6(abcd.aH r5, long r6) {
        abcd.EG.b r0 = null;
        abcd.EG.a r7 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.Hw[j6(r6)];
                    if (r0 != null) { $pc3 = 6; continue $sw3; }
                    return null;
                }
                case 6: {
                    if (r0.FH == r5) { $pc3 = 8; continue $sw3; }
                    $pc3 = 13; continue $sw3;
                }
                case 13: {
                    return null;
                }
                case 8: {
                    if (r0.Hw != r6) { $pc3 = 13; continue $sw3; }
                    r7 = r0.Zo.get();
                    if (r7 == null) { $pc3 = 13; continue $sw3; }
                    DW(r0);
                    return r7;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(abcd.aH r4, long r5, byte[] r7, int r8) {
        abcd.EG.b r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r7.length <= this.FH) { $pc4 = 5; continue $sw4; }
                    return;
                }
                case 5: {
                    r0 = this.Hw[j6(r5)];
                    if (r0 != null) { $pc4 = 8; continue $sw4; }
                    r0 = new abcd.EG.b(null);
                    this.Hw[j6(r5)] = r0;
                    $pc4 = 9; continue $sw4;
                }
                case 9: {
                    this.VH += r7.length;
                    DW();
                    r0.FH = r4;
                    r0.Hw = r5;
                    r0.v5 = r7.length;
                    r0.Zo = new java.lang.ref.SoftReference(new abcd.EG.a(r7, r8));
                    DW(r0);
                    return;
                }
                case 8: {
                    j6(r0);
                    { $pc4 = 9; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
