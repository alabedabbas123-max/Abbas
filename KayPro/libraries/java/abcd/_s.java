package abcd;

public final class _s {
    private final abcd.yt DW;
    private final java.util.ArrayList<abcd.tt> FH;
    private final abcd._s.a[] Hw;
    private final abcd.Ys.a[] Zo;
    private final boolean j6;
    private final java.util.ArrayList<abcd.tt> v5;

    private static final class a {
        public abcd.tt DW;
        public abcd.tt FH;
        public abcd.tt Hw;
        public int j6;
        public java.util.ArrayList<abcd.tt> v5;

        public a() {
            this.v5 = new java.util.ArrayList();
        }
    }

    private class b implements abcd.tt.b {
        final abcd._s DW;
        private int j6;

        private b(abcd._s r1) {
            this.DW = r1;
            this.j6 = 0;
        }

        b(abcd._s r1, abcd.Zs r2) {
            this(r1);
        }

        @Override
        public void j6(abcd.tt r3, abcd.tt r4) {
            abcd._s.a r0 = new abcd._s.a();
            int r1 = this.j6 + 1;
            this.j6 = r1;
            r0.j6 = r1;
            r0.FH = r3;
            r0.DW = r4;
            abcd._s.j6(this.DW).add(r3);
            abcd._s.DW(this.DW)[r3.DW()] = r0;
        }
    }

    private _s(abcd.yt r1, abcd.Ys.a[] r2, boolean r3) {
        this.DW = r1;
        this.Zo = r2;
        this.j6 = r3;
        this.FH = r1.DW();
        this.Hw = new abcd._s.a[this.FH.size() + 2];
        this.v5 = new java.util.ArrayList();
    }

    private abcd.tt DW(abcd.tt r3) {
        abcd._s.a r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.Hw[r3.DW()];
                    if (r0.Hw != null) { $pc0 = 5; continue $sw0; }
                    return r3;
                }
                case 5: {
                    j6(r3);
                    return r0.FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static abcd._s.a[] DW(abcd._s r0) {
        return r0.Hw;
    }

    private java.util.BitSet FH(abcd.tt r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.j6 == false) { $pc1 = 7; continue $sw1; }
                    return r2.Ws();
                }
                case 7: {
                    return r2.VH();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd._s j6(abcd.yt r1, abcd.Ys.a[] r2, boolean r3) {
        abcd._s r0 = new abcd._s(r1, r2, r3);
        r0.j6();
        return r0;
    }

    static java.util.ArrayList j6(abcd._s r0) {
        return r0.v5;
    }

    private void j6() {
        abcd.tt r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        abcd.tt r4 = null;
        abcd._s.a r5 = null;
        java.util.BitSet r6 = null;
        int r7 = 0;
        abcd.tt r8 = null;
        int r9 = 0;
        abcd.tt r10 = null;
        java.util.ArrayList<abcd.tt> r11 = null;
        abcd.tt r12 = null;
        abcd.tt r13 = null;
        abcd.tt r14 = null;
        abcd.Ys.a r15 = null;
        abcd.Ys.a[] r16 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.j6 == false) { $pc2 = 5; continue $sw2; }
                    r0 = this.DW.Zo();
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (r0 == null) { $pc2 = 8; continue $sw2; }
                    this.v5.add(r0);
                    this.Zo[r0.DW()].DW = r0.DW();
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    this.DW.j6(this.j6, new abcd._s.b(this, null));
                    r1 = this.v5.size() - 1;
                    r2 = r1;
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    r3 = 2;
                    if (r2 < 2) { $pc2 = 27; continue $sw2; }
                    r4 = this.v5.get(r2);
                    r5 = this.Hw[r4.DW()];
                    r6 = FH(r4);
                    r7 = r6.nextSetBit(0);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    if (r7 < 0) { $pc2 = 19; continue $sw2; }
                    r8 = this.FH.get(r7);
                    if (this.Hw[r8.DW()] == null) { $pc2 = 18; continue $sw2; }
                    r9 = this.Hw[DW(r8).DW()].j6;
                    if (r9 >= r5.j6) { $pc2 = 18; continue $sw2; }
                    r5.j6 = r9;
                    $pc2 = 18; continue $sw2;
                }
                case 18: {
                    r7 = r6.nextSetBit(r7 + 1);
                    { $pc2 = 12; continue $sw2; }
                }
                case 19: {
                    this.Hw[this.v5.get(r5.j6).DW()].v5.add(r4);
                    r10 = r5.DW;
                    r5.Hw = r10;
                    r11 = this.Hw[r10.DW()].v5;
                    $pc2 = 21; continue $sw2;
                }
                case 21: {
                    if (r11.isEmpty() == true) { $pc2 = 26; continue $sw2; }
                    r12 = r11.remove(r11.size() - 1);
                    r13 = DW(r12);
                    if (this.Hw[r13.DW()].j6 < this.Hw[r12.DW()].j6) { $pc2 = 24; continue $sw2; }
                    this.Zo[r12.DW()].DW = r5.DW.DW();
                    { $pc2 = 21; continue $sw2; }
                }
                case 24: {
                    this.Zo[r12.DW()].DW = r13.DW();
                    { $pc2 = 21; continue $sw2; }
                }
                case 26: {
                    r2 = r2 - 1;
                    $pc2 = 27; continue $sw2;
                }
                case 27: {
                    if (r3 > r1) { $pc2 = 32; continue $sw2; }
                    r14 = this.v5.get(r3);
                    if (this.Zo[r14.DW()].DW == this.v5.get(this.Hw[r14.DW()].j6).DW()) { $pc2 = 31; continue $sw2; }
                    r15 = this.Zo[r14.DW()];
                    r16 = this.Zo;
                    r15.DW = r16[r16[r14.DW()].DW].DW;
                    $pc2 = 31; continue $sw2;
                }
                case 31: {
                    r3 = r3 + 1;
                    { $pc2 = 27; continue $sw2; }
                }
                case 32: {
                    return;
                }
                case 5: {
                    r0 = this.DW.Hw();
                    { $pc2 = 6; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.tt r8) {
        java.util.ArrayList r0 = null;
        java.util.HashSet r1 = null;
        int r9 = 0;
        abcd._s.a r2 = null;
        abcd.tt r3 = null;
        abcd._s.a r4 = null;
        abcd.tt r10 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.Hw[this.Hw[r8.DW()].Hw.DW()].Hw == null) { $pc3 = 19; continue $sw3; }
                    r0 = new java.util.ArrayList();
                    r1 = new java.util.HashSet();
                    r0.add(r8);
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    if (r0.isEmpty() == true) { $pc3 = 29; continue $sw3; }
                    r9 = r0.size() - 1;
                    r2 = this.Hw[((abcd.tt) r0.get(r9)).DW()];
                    r3 = r2.Hw;
                    r4 = this.Hw[r3.DW()];
                    if (r1.add(r3) == false) { $pc3 = 12; continue $sw3; }
                    if (r4.Hw == null) { $pc3 = 12; continue $sw3; }
                    r0.add(r3);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    r0.remove(r9);
                    if (r4.Hw == null) { $pc3 = 6; continue $sw3; }
                    r10 = r4.FH;
                    if (this.Hw[r10.DW()].j6 >= this.Hw[r2.FH.DW()].j6) { $pc3 = 18; continue $sw3; }
                    r2.FH = r10;
                    $pc3 = 18; continue $sw3;
                }
                case 18: {
                    r2.Hw = r4.Hw;
                    { $pc3 = 6; continue $sw3; }
                }
                case 29: {
                    return;
                }
                case 19: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
