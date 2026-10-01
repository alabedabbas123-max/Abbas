package abcd;

public final class Zm {
    private final abcd.Im DW;
    private boolean EQ;
    private final int FH;
    private final int Hw;
    private boolean J0;
    private final abcd.Om[] VH;
    private final abcd.C0575bn Zo;
    private final java.util.ArrayList<abcd.Nr> gn;
    private final abcd.C0272Mm j6;
    private final abcd.Qs[] tp;
    private final java.util.ArrayList<abcd.au> u7;
    private final abcd.C0496_m v5;
    private final abcd.Zm.b[] we;

    private static class a {
        int j6;

        a(int r1) {
            this.j6 = r1;
        }

        int j6() {
            int r0 = this.j6;
            this.j6 = r0 + 1;
            return r0;
        }
    }

    private class b {
        private java.util.BitSet DW;
        private int FH;
        final abcd.Zm Hw;
        private java.util.BitSet j6;

        b(abcd.Zm r2, int r3) {
            this.Hw = r2;
            this.FH = r3;
            this.DW = new java.util.BitSet(abcd.Zm.j6(r2));
            this.j6 = new java.util.BitSet(abcd.Zm.j6(r2));
            abcd.Zm.j6(r2, true);
        }

        b(abcd.Zm r1, int r2, int r3) {
            this(r1, r2);
            DW(r3);
        }

        static int DW(abcd.Zm.b r0) {
            return r0.FH;
        }

        static java.util.BitSet j6(abcd.Zm.b r0) {
            return r0.DW;
        }

        abcd.au DW() {
            abcd.au r0 = null;
            int r1 = 0;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = new abcd.au(this.j6.size());
                        r1 = this.j6.nextSetBit(0);
                        $pc0 = 3; continue $sw0;
                    }
                    case 3: {
                        if (r1 < 0) { $pc0 = 5; continue $sw0; }
                        r0.DW(abcd.Zm.j6(this.Hw, r1).gn().get(0));
                        r1 = this.j6.nextSetBit(r1 + 1);
                        { $pc0 = 3; continue $sw0; }
                    }
                    case 5: {
                        r0.we();
                        return r0;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        void DW(int r2) {
            this.DW.set(r2);
        }

        int j6() {
            return this.FH;
        }

        void j6(int r2) {
            this.j6.set(r2);
        }

        void j6(abcd.Om r10, int[] r11) {
            int r0 = 0;
            int r4 = 0;
            abcd.Om r7 = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r0 = this.j6.nextSetBit(0);
                        $pc1 = 3; continue $sw1;
                    }
                    case 3: {
                        if (r0 < 0) { $pc1 = 9; continue $sw1; }
                        r4 = abcd.Zm.j6(this.Hw, r0).gn().get(0);
                        r7 = r10.DW(this.FH, r0);
                        if (r7 == null) { $pc1 = 7; continue $sw1; }
                        abcd.Zm.j6(this.Hw, r4, -1, null, r7, r11);
                        $pc1 = 8; continue $sw1;
                    }
                    case 8: {
                        r0 = this.j6.nextSetBit(r0 + 1);
                        { $pc1 = 3; continue $sw1; }
                    }
                    case 7: {
                        abcd.Ot.Hw(r11, r0);
                        { $pc1 = 8; continue $sw1; }
                    }
                    case 9: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    private class c {
        private final java.util.BitSet DW;
        private int FH;
        private int Hw;
        final abcd.Zm VH;
        private final java.util.ArrayList<abcd.au> Zo;
        private final java.util.HashMap<java.lang.Integer, java.lang.Integer> j6;
        private final abcd.Zm.a v5;

        c(abcd.Zm r2, abcd.Zm.a r3, java.util.ArrayList<abcd.au> r4) {
            this.VH = r2;
            this.j6 = new java.util.HashMap();
            this.DW = new java.util.BitSet(abcd.Zm.j6(r2));
            this.v5 = r3;
            this.Zo = r4;
        }

        private boolean DW(int r2, int r3) {
            abcd.au r4 = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        r4 = this.Zo.get(r2);
                        if (r4 != null) { $pc2 = 5; continue $sw2; }
                        $pc2 = 9; continue $sw2;
                    }
                    case 9: {
                        return false;
                    }
                    case 5: {
                        if (r4.size() <= 0) { $pc2 = 9; continue $sw2; }
                        if (r4.yS() != r3) { $pc2 = 9; continue $sw2; }
                        return true;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private int j6(int r5) {
            java.lang.Integer r0 = null;
            int r1 = 0;
            java.util.ArrayList<abcd.au> r2 = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        r0 = this.j6.get(java.lang.Integer.valueOf(r5));
                        if (r0 == null) { $pc3 = 6; continue $sw3; }
                        return r0.intValue();
                    }
                    case 6: {
                        if (DW(r5, this.FH) == false) { $pc3 = 16; continue $sw3; }
                        r1 = this.v5.j6();
                        this.DW.set(r5);
                        this.j6.put(java.lang.Integer.valueOf(r5), java.lang.Integer.valueOf(r1));
                        $pc3 = 10; continue $sw3;
                    }
                    case 10: {
                        if (this.Zo.size() > r1) { $pc3 = 12; continue $sw3; }
                        this.Zo.add(null);
                        { $pc3 = 10; continue $sw3; }
                    }
                    case 12: {
                        r2 = this.Zo;
                        r2.set(r1, r2.get(r5));
                        return r1;
                    }
                    case 16: {
                        return r5;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private void j6(int r9, int r10) {
            abcd.Nr r0 = null;
            abcd.au r1 = null;
            int r3 = 0;
            int r4 = 0;
            abcd.au r11 = null;
            abcd.Zm r2 = null;
            abcd.Zm.b r12 = null;
            int r13 = 0;
            int r5 = 0;
            abcd.au r6 = null;
            int r7 = 0;
            int r8 = 0;
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        r0 = abcd.Zm.j6(this.VH, r9);
                        r1 = r0.gn();
                        r3 = 0;
                        r4 = -1;
                        if (abcd.Zm.j6(this.VH, r0) == false) { $pc4 = 5; continue $sw4; }
                        r11 = abcd.au.DW(j6(r1.get(0)), r1.get(1));
                        $pc4 = 19; continue $sw4;
                    }
                    case 19: {
                        r2 = this.VH;
                        abcd.Zm.DW(r2, new abcd.Nr(r10, abcd.Zm.j6(r2, r0.Hw()), r11, r4), this.Zo.get(r10));
                        return;
                    }
                    case 5: {
                        r12 = abcd.Zm.DW(this.VH, r9);
                        if (r12 != null) { $pc4 = 8; continue $sw4; }
                        r13 = r0.Zo();
                        r5 = r1.size();
                        r6 = new abcd.au(r5);
                        $pc4 = 13; continue $sw4;
                    }
                    case 13: {
                        if (r3 >= r5) { $pc4 = 18; continue $sw4; }
                        r7 = r1.get(r3);
                        r8 = j6(r7);
                        r6.DW(r8);
                        if (r13 != r7) { $pc4 = 17; continue $sw4; }
                        r4 = r8;
                        $pc4 = 17; continue $sw4;
                    }
                    case 17: {
                        r3 = r3 + 1;
                        { $pc4 = 13; continue $sw4; }
                    }
                    case 18: {
                        r6.we();
                        r11 = r6;
                        { $pc4 = 19; continue $sw4; }
                    }
                    case 8: {
                        if (abcd.Zm.b.DW(r12) != this.FH) { $pc4 = 11; continue $sw4; }
                        r11 = abcd.au.Zo(this.Hw);
                        r4 = this.Hw;
                        { $pc4 = 19; continue $sw4; }
                    }
                    case 11: {
                        throw new java.lang.RuntimeException("ret instruction returns to label " + abcd.Yt.v5(abcd.Zm.b.DW(r12)) + " expected: " + abcd.Yt.v5(this.FH));
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        void j6(abcd.Nr r8) {
            int r0 = 0;
            int r2 = 0;
            int r3 = 0;
            abcd.Zm r4 = null;
            java.lang.Throwable $ex5 = null;
            int $pc5 = -1;
            $sw5: while (true) {
                switch ($pc5) {
                    case -1: {
                        this.Hw = r8.gn().get(0);
                        this.FH = r8.gn().get(1);
                        r0 = j6(this.FH);
                        r2 = this.DW.nextSetBit(0);
                        $pc5 = 3; continue $sw5;
                    }
                    case 3: {
                        if (r2 < 0) { $pc5 = 8; continue $sw5; }
                        this.DW.clear(r2);
                        r3 = this.j6.get(java.lang.Integer.valueOf(r2)).intValue();
                        j6(r2, r3);
                        r4 = this.VH;
                        if (abcd.Zm.j6(r4, abcd.Zm.j6(r4, r2)) == false) { $pc5 = 7; continue $sw5; }
                        new abcd.Zm.c(this.VH, this.v5, this.Zo).j6(abcd.Zm.j6(this.VH, r3));
                        $pc5 = 7; continue $sw5;
                    }
                    case 7: {
                        r2 = this.DW.nextSetBit(0);
                        { $pc5 = 3; continue $sw5; }
                    }
                    case 8: {
                        abcd.Zm.j6(this.VH, new abcd.Nr(r8.DW(), r8.Hw(), abcd.au.Zo(r0), r0), this.Zo.get(r8.DW()));
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    private Zm(abcd.C0272Mm r4, abcd.Interfacels r5) {
        int r6 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (r4 == null) { $pc6 = 10; continue $sw6; }
                    if (r5 == null) { $pc6 = 8; continue $sw6; }
                    this.j6 = r4;
                    this.DW = abcd.C0177Gm.j6(r4);
                    this.Hw = this.DW.rN();
                    this.FH = r4.tp();
                    this.v5 = new abcd.C0496_m(this, r4, r5);
                    this.Zo = new abcd.C0575bn(this.v5, r4);
                    r6 = this.Hw;
                    this.VH = new abcd.Om[r6];
                    this.we = new abcd.Zm.b[r6];
                    this.gn = new java.util.ArrayList((this.DW.size() * 2) + 10);
                    this.u7 = new java.util.ArrayList((this.DW.size() * 2) + 10);
                    this.tp = new abcd.Qs[this.Hw];
                    this.EQ = false;
                    this.VH[0] = new abcd.Om(this.FH, r4.EQ());
                    return;
                }
                case 8: {
                    throw new java.lang.NullPointerException("advice == null");
                }
                case 10: {
                    throw new java.lang.NullPointerException("method == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int DW(int r2) {
        return (this.Hw * 2) + (r2 ^ (-1));
    }

    static abcd.Zm.b DW(abcd.Zm r0, int r1) {
        return r0.Zo(r1);
    }

    private void DW() {
        int r0 = 0;
        int r2 = 0;
        abcd.Qs r3 = null;
        abcd.hs r4 = null;
        abcd.Ur r5 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = this.tp.length;
                    r2 = 0;
                    $pc7 = 3; continue $sw7;
                }
                case 3: {
                    if (r2 >= r0) { $pc7 = 8; continue $sw7; }
                    r3 = this.tp[r2];
                    if (r3 == null) { $pc7 = 7; continue $sw7; }
                    r4 = FH(r2).FH().Zo();
                    r5 = new abcd.Ur(2);
                    r5.j6(0, new abcd.Zr(abcd.gs.tp(r3), r4, abcd.bs.j6(this.FH, r3), abcd.cs.FH));
                    r5.j6(1, new abcd.Zr(abcd.gs.j3, r4, null, abcd.cs.FH));
                    r5.we();
                    j6(new abcd.Nr(j6(r2), r5, abcd.au.Zo(r2), r2), this.VH[r2].Hw());
                    $pc7 = 7; continue $sw7;
                }
                case 7: {
                    r2 = r2 + 1;
                    { $pc7 = 3; continue $sw7; }
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void DW(abcd.Zm r0, abcd.Nr r1, abcd.au r2) {
        r0.j6(r1, r2);
    }

    private boolean DW(abcd.Nr r3, abcd.au r4) {
        int r0 = 0;
        boolean r1 = false;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (r3 == null) { $pc8 = 10; continue $sw8; }
                    r0 = Hw(r3.DW());
                    if (r0 >= 0) { $pc8 = 6; continue $sw8; }
                    r1 = false;
                    $pc8 = 7; continue $sw8;
                }
                case 7: {
                    this.gn.add(r3);
                    r4.Ws();
                    this.u7.add(r4);
                    return r1;
                }
                case 6: {
                    v5(r0);
                    r1 = true;
                    { $pc8 = 7; continue $sw8; }
                }
                case 10: {
                    throw new java.lang.NullPointerException("block == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.fs EQ() {
        int r0 = 0;
        abcd.Or r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = this.gn.size();
                    r1 = new abcd.Or(r0);
                    r2 = 0;
                    $pc9 = 3; continue $sw9;
                }
                case 3: {
                    if (r2 >= r0) { $pc9 = 5; continue $sw9; }
                    r1.j6(r2, this.gn.get(r2));
                    r2 = r2 + 1;
                    { $pc9 = 3; continue $sw9; }
                }
                case 5: {
                    r1.we();
                    return new abcd.fs(r1, DW(-1));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.Nr FH(int r4) {
        int r0 = 0;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = Hw(r4);
                    if (r0 < 0) { $pc10 = 7; continue $sw10; }
                    return this.gn.get(r0);
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("no such label " + abcd.Yt.v5(r4));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void FH() {
        abcd.es r0 = null;
        abcd.hs r1 = null;
        int r2 = 0;
        abcd.Ur r3 = null;
        int r6 = 0;
        abcd.Ur r4 = null;
        abcd.Ss r5 = null;
        abcd.cs r7 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = this.v5.aM();
                    if (r0 != null) { $pc11 = 5; continue $sw11; }
                    return;
                }
                case 5: {
                    r1 = this.v5.j3();
                    r2 = DW(-2);
                    if (Ws() == false) { $pc11 = 8; continue $sw11; }
                    r3 = new abcd.Ur(1);
                    r3.j6(0, new abcd.ks(abcd.gs.Yi, r1, abcd.cs.j6(we()), abcd.Ps.FH));
                    r3.we();
                    r6 = DW(-3);
                    j6(new abcd.Nr(r2, r3, abcd.au.Zo(r6), r6), abcd.au.DW);
                    r2 = r6;
                    $pc11 = 8; continue $sw11;
                }
                case 8: {
                    r4 = new abcd.Ur(1);
                    r5 = r0.Zo();
                    if (r5.size() != 0) { $pc11 = 11; continue $sw11; }
                    r7 = abcd.cs.FH;
                    $pc11 = 12; continue $sw11;
                }
                case 12: {
                    r4.j6(0, new abcd.Zr(r0, r1, null, r7));
                    r4.we();
                    j6(new abcd.Nr(r2, r4, abcd.au.DW, -1), abcd.au.DW);
                    return;
                }
                case 11: {
                    r7 = abcd.cs.j6(abcd.bs.j6(0, r5.getType(0)));
                    { $pc11 = 12; continue $sw11; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean FH(abcd.Nr r3, abcd.au r4) {
        int r0 = 0;
        boolean r1 = false;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if (r3 == null) { $pc12 = 10; continue $sw12; }
                    r0 = Hw(r3.DW());
                    if (r0 >= 0) { $pc12 = 6; continue $sw12; }
                    r1 = false;
                    $pc12 = 7; continue $sw12;
                }
                case 7: {
                    this.gn.add(r3);
                    r4.Ws();
                    this.u7.add(r4);
                    return r1;
                }
                case 6: {
                    this.gn.remove(r0);
                    this.u7.remove(r0);
                    r1 = true;
                    { $pc12 = 7; continue $sw12; }
                }
                case 10: {
                    throw new java.lang.NullPointerException("block == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int Hw(int r4) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r0 = this.gn.size();
                    r1 = 0;
                    $pc13 = 3; continue $sw13;
                }
                case 3: {
                    if (r1 >= r0) { $pc13 = 8; continue $sw13; }
                    if (this.gn.get(r1).DW() == r4) { $pc13 = 6; continue $sw13; }
                    r1 = r1 + 1;
                    { $pc13 = 3; continue $sw13; }
                }
                case 6: {
                    return r1;
                }
                case 8: {
                    return -1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Hw() {
        abcd.Qm r1 = null;
        int r3 = 0;
        abcd.hs r2 = null;
        abcd.Ps r10 = null;
        int r11 = 0;
        abcd.Ur r12 = null;
        int r13 = 0;
        int r14 = 0;
        abcd.Qs r15 = null;
        abcd.Qm.a r4 = null;
        abcd.bs r5 = null;
        abcd.es r6 = null;
        boolean r7 = false;
        int r8 = 0;
        abcd.bs r9 = null;
        int r16 = 0;
        abcd.js r17 = null;
        abcd.Ur r18 = null;
        int r19 = 0;
        abcd.Ur r20 = null;
        abcd.ks r21 = null;
        abcd.Ur r110 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r1 = this.j6.u7();
                    r3 = 0;
                    r2 = this.j6.j6(0);
                    r10 = this.j6.v5().VH();
                    r11 = r10.size();
                    r12 = new abcd.Ur(r11 + 1);
                    r13 = 0;
                    r14 = 0;
                    $pc14 = 3; continue $sw14;
                }
                case 3: {
                    if (r13 >= r11) { $pc14 = 9; continue $sw14; }
                    r15 = r10.get(r13);
                    r4 = r1.j6(r3, r14);
                    if (r4 != null) { $pc14 = 7; continue $sw14; }
                    r5 = abcd.bs.j6(r14, r15);
                    $pc14 = 8; continue $sw14;
                }
                case 8: {
                    r6 = abcd.gs.EQ(r15);
                    r12.j6(r13, new abcd.Yr(r6, r2, r5, abcd.cs.FH, abcd.ys.j6(r14)));
                    r14 = r14 + r15.Zo();
                    r13 = r13 + 1;
                    r3 = 0;
                    { $pc14 = 3; continue $sw14; }
                }
                case 7: {
                    r5 = abcd.bs.FH(r14, r15, r4.j6());
                    { $pc14 = 8; continue $sw14; }
                }
                case 9: {
                    r12.j6(r11, new abcd.Zr(abcd.gs.j3, r2, null, abcd.cs.FH));
                    r12.we();
                    r7 = Ws();
                    if (r7 == false) { $pc14 = 12; continue $sw14; }
                    r8 = DW(-4);
                    $pc14 = 13; continue $sw14;
                }
                case 13: {
                    j6(new abcd.Nr(DW(-1), r12, abcd.au.Zo(r8), r8), abcd.au.DW);
                    if (r7 == false) { $pc14 = 31; continue $sw14; }
                    r9 = we();
                    r16 = 2;
                    if (J8() == false) { $pc14 = 18; continue $sw14; }
                    r17 = new abcd.js(abcd.gs.XL, r2, abcd.cs.FH, abcd.Ps.FH, this.j6.DW());
                    r18 = new abcd.Ur(1);
                    r18.j6(0, r17);
                    $pc14 = 19; continue $sw14;
                }
                case 19: {
                    r19 = DW(-5);
                    r18.we();
                    j6(new abcd.Nr(r8, r18, abcd.au.Zo(r19), r19), abcd.au.DW);
                    if (J8() == true) { $pc14 = 23; continue $sw14; }
                    r16 = 1;
                    $pc14 = 23; continue $sw14;
                }
                case 23: {
                    r20 = new abcd.Ur(r16);
                    if (J8() == false) { $pc14 = 26; continue $sw14; }
                    r20.j6(0, new abcd.Zr(abcd.gs.J0(r9), r2, r9, abcd.cs.FH));
                    $pc14 = 26; continue $sw14;
                }
                case 26: {
                    r21 = new abcd.ks(abcd.gs.dW, r2, abcd.cs.j6(r9), abcd.Ps.FH);
                    r20.j6(J8() ? 1 : 0, r21);
                    r20.we();
                    j6(new abcd.Nr(r19, r20, abcd.au.Zo(0), 0), abcd.au.DW);
                    return;
                }
                case 18: {
                    r110 = new abcd.Ur(2);
                    r110.j6(0, new abcd.Yr(abcd.gs.we, r2, r9, abcd.cs.FH, abcd.ys.Hw));
                    r110.j6(1, new abcd.Zr(abcd.gs.j3, r2, null, abcd.cs.FH));
                    r18 = r110;
                    { $pc14 = 19; continue $sw14; }
                }
                case 31: {
                    return;
                }
                case 12: {
                    r8 = 0;
                    { $pc14 = 13; continue $sw14; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void J0() {
        abcd.au r0 = null;
        int r2 = 0;
        int r1 = 0;
        java.util.ArrayList r3 = null;
        int r4 = 0;
        int r5 = 0;
        abcd.Nr r6 = null;
        abcd.au r7 = null;
        int r8 = 0;
        int r9 = 0;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    r0 = new abcd.au(4);
                    r2 = 0;
                    j6(0, new abcd.Xm(this, r0));
                    r1 = gn();
                    r3 = new java.util.ArrayList(r1);
                    r4 = 0;
                    $pc15 = 3; continue $sw15;
                }
                case 3: {
                    if (r4 >= r1) { $pc15 = 5; continue $sw15; }
                    r3.add(null);
                    r4 = r4 + 1;
                    { $pc15 = 3; continue $sw15; }
                }
                case 5: {
                    r5 = 0;
                    $pc15 = 7; continue $sw15;
                }
                case 7: {
                    if (r5 >= this.gn.size()) { $pc15 = 13; continue $sw15; }
                    r6 = this.gn.get(r5);
                    if (r6 == null) { $pc15 = 12; continue $sw15; }
                    r7 = this.u7.get(r5);
                    r3.set(r6.DW(), r7);
                    $pc15 = 12; continue $sw15;
                }
                case 12: {
                    r5 = r5 + 1;
                    { $pc15 = 7; continue $sw15; }
                }
                case 13: {
                    r8 = r0.size();
                    $pc15 = 14; continue $sw15;
                }
                case 14: {
                    if (r2 >= r8) { $pc15 = 16; continue $sw15; }
                    r9 = r0.get(r2);
                    new abcd.Zm.c(this, new abcd.Zm.a(gn()), r3).j6(FH(r9));
                    r2 = r2 + 1;
                    { $pc15 = 14; continue $sw15; }
                }
                case 16: {
                    Zo();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean J8() {
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    if ((this.j6.j6() & 8) == 0) { $pc16 = 5; continue $sw16; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void QX() {
        abcd.Os r0 = this.j6.v5();
        this.VH[0].j6(r0.VH());
        this.VH[0].v5();
    }

    private void VH() {
        int[] r0 = null;
        int r2 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    r0 = abcd.Ot.j6(this.Hw);
                    abcd.Ot.Hw(r0, 0);
                    Hw();
                    QX();
                    $pc17 = 3; continue $sw17;
                }
                case 3: {
                    r2 = abcd.Ot.DW(r0, 0);
                    if (r2 < 0) { $pc17 = 5; continue $sw17; }
                    abcd.Ot.j6(r0, r2);
                    try {
                        j6(this.DW.v5(r2), this.VH[r2], r0);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        if ($t instanceof abcd.an) { $pc17 = 12; continue $sw17; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc17 = 12; continue $sw17;
                }
                case 12: {
                    e = $ex17;
                    e.j6("...while working on block " + abcd.Yt.v5(r2));
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 5: {
                    FH();
                    v5();
                    DW();
                    if (this.J0 == false) { $pc17 = 20; continue $sw17; }
                    J0();
                    return;
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean Ws() {
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    if ((this.j6.j6() & 32) == 0) { $pc18 = 5; continue $sw18; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.Zm.b Zo(int r4) {
        int r0 = 0;
        abcd.Zm.b[] r1 = null;
        abcd.Zm.b r2 = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    r0 = this.we.length - 1;
                    $pc19 = 3; continue $sw19;
                }
                case 3: {
                    if (r0 < 0) { $pc19 = 10; continue $sw19; }
                    r1 = this.we;
                    if (r1[r0] == null) { $pc19 = 9; continue $sw19; }
                    r2 = r1[r0];
                    if (abcd.Zm.b.j6(r2).get(r4) == false) { $pc19 = 9; continue $sw19; }
                    return r2;
                }
                case 9: {
                    r0 = r0 - 1;
                    { $pc19 = 3; continue $sw19; }
                }
                case 10: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Zo() {
        abcd.au r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    r0 = new abcd.au(this.gn.size());
                    this.u7.clear();
                    j6(DW(-1), new abcd.Ym(this, r0));
                    r0.er();
                    r1 = this.gn.size() - 1;
                    $pc20 = 3; continue $sw20;
                }
                case 3: {
                    if (r1 < 0) { $pc20 = 8; continue $sw20; }
                    if (r0.v5(this.gn.get(r1).DW()) >= 0) { $pc20 = 7; continue $sw20; }
                    this.gn.remove(r1);
                    $pc20 = 7; continue $sw20;
                }
                case 7: {
                    r1 = r1 - 1;
                    { $pc20 = 3; continue $sw20; }
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int gn() {
        int r0 = 0;
        java.util.Iterator<abcd.Nr> r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    r0 = u7();
                    r1 = this.gn.iterator();
                    $pc21 = 4; continue $sw21;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc21 = 8; continue $sw21; }
                    r2 = r1.next().DW();
                    if (r2 < r0) { $pc21 = 4; continue $sw21; }
                    r0 = r2 + 1;
                    { $pc21 = 4; continue $sw21; }
                }
                case 8: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int j6(int r2) {
        return this.Hw + r2;
    }

    static int j6(abcd.Zm r0) {
        return r0.Hw;
    }

    static abcd.Nr j6(abcd.Zm r0, int r1) {
        return r0.FH(r1);
    }

    private abcd.Ur j6(abcd.Ur r8) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        abcd.Ur r4 = null;
        int r5 = 0;
        abcd.Tr r6 = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = -1;
        $sw22: while (true) {
            switch ($pc22) {
                case -1: {
                    r0 = r8.size();
                    r1 = 0;
                    r2 = 0;
                    r3 = 0;
                    $pc22 = 3; continue $sw22;
                }
                case 3: {
                    if (r2 >= r0) { $pc22 = 8; continue $sw22; }
                    if (r8.get(r2).v5() == abcd.gs.VH) { $pc22 = 7; continue $sw22; }
                    r3 = r3 + 1;
                    $pc22 = 7; continue $sw22;
                }
                case 7: {
                    r2 = r2 + 1;
                    { $pc22 = 3; continue $sw22; }
                }
                case 8: {
                    if (r3 != r0) { $pc22 = 10; continue $sw22; }
                    return r8;
                }
                case 10: {
                    r4 = new abcd.Ur(r3);
                    r5 = 0;
                    $pc22 = 11; continue $sw22;
                }
                case 11: {
                    if (r1 >= r0) { $pc22 = 16; continue $sw22; }
                    r6 = r8.get(r1);
                    if (r6.v5() == abcd.gs.VH) { $pc22 = 15; continue $sw22; }
                    r4.j6(r5, r6);
                    r5 = r5 + 1;
                    $pc22 = 15; continue $sw22;
                }
                case 15: {
                    r1 = r1 + 1;
                    { $pc22 = 11; continue $sw22; }
                }
                case 16: {
                    r4.we();
                    return r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static abcd.Ur j6(abcd.Zm r0, abcd.Ur r1) {
        return r0.j6(r1);
    }

    public static abcd.fs j6(abcd.C0272Mm r2, abcd.Interfacels r3) {
        abcd.Zm r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex23 = null;
        int $pc23 = -1;
        $sw23: while (true) {
            switch ($pc23) {
                case -1: {
                    try {
                        r0 = new abcd.Zm(r2, r3);
                        r0.VH();
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        if ($t instanceof abcd.an) { $pc23 = 4; continue $sw23; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r0.EQ();
                }
                case 4: {
                    e = $ex23;
                    e.j6("...while working on method " + r2.FH().aM());
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(int r3, int r4, abcd.Zm.b r5, abcd.Om r6, int[] r7) {
        abcd.Om[] r0 = null;
        abcd.Om r1 = null;
        abcd.Om r8 = null;
        java.lang.Throwable $ex24 = null;
        int $pc24 = -1;
        $sw24: while (true) {
            switch ($pc24) {
                case -1: {
                    r0 = this.VH;
                    r1 = r0[r3];
                    if (r1 == null) { $pc24 = 9; continue $sw24; }
                    if (r5 == null) { $pc24 = 6; continue $sw24; }
                    r8 = r1.j6(r6, r5.j6(), r4);
                    $pc24 = 7; continue $sw24;
                }
                case 7: {
                    if (r8 == r1) { $pc24 = 14; continue $sw24; }
                    this.VH[r3] = r8;
                    abcd.Ot.Hw(r7, r3);
                    return;
                }
                case 14: {
                    return;
                }
                case 6: {
                    r8 = r1.j6(r6);
                    { $pc24 = 7; continue $sw24; }
                }
                case 9: {
                    if (r5 == null) { $pc24 = 11; continue $sw24; }
                    r0[r3] = r6.j6(r3, r4);
                    $pc24 = 12; continue $sw24;
                }
                case 12: {
                    abcd.Ot.Hw(r7, r3);
                    return;
                }
                case 11: {
                    r0[r3] = r6;
                    { $pc24 = 12; continue $sw24; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(int r3, abcd.Nr.a r4) {
        j6(FH(r3), r4, new java.util.BitSet(this.Hw));
    }

    private void j6(abcd.Hm r24, abcd.Om r25, int[] r26) {
        abcd.Jm r0 = null;
        abcd.Om r8 = null;
        int r10 = 0;
        java.util.ArrayList<abcd.Tr> r11 = null;
        int r12 = 0;
        int r13 = 0;
        abcd.au r1 = null;
        int r2 = 0;
        abcd.Zm.b[] r3 = null;
        abcd.au r4 = null;
        abcd.Zm.b r16 = null;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r17 = 0;
        int r19 = 0;
        int r20 = 0;
        abcd.au r18 = null;
        int r21 = 0;
        abcd.au r110 = null;
        abcd.au r9 = null;
        int r14 = 0;
        int r15 = 0;
        boolean r111 = false;
        abcd.au r112 = null;
        int r22 = 0;
        int r23 = 0;
        abcd.Tr r27 = null;
        boolean r28 = false;
        int r29 = 0;
        abcd.Ur r30 = null;
        abcd.au r31 = null;
        int r32 = 0;
        int r33 = 0;
        abcd.Tr r34 = null;
        abcd.hs r35 = null;
        abcd.Ur r36 = null;
        abcd.au r37 = null;
        boolean r38 = false;
        int r39 = 0;
        abcd.Jm.a r40 = null;
        abcd.Ks r41 = null;
        int r42 = 0;
        boolean r113 = false;
        boolean r114 = false;
        int r115 = 0;
        abcd.au r116 = null;
        abcd.Jm r117 = null;
        int r43 = 0;
        abcd.Qs[] r44 = null;
        abcd.Qs r45 = null;
        int r46 = 0;
        abcd.Tr r47 = null;
        int r48 = 0;
        int r49 = 0;
        abcd.Zm.b[] r50 = null;
        abcd.au r51 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex25 = null;
        int $pc25 = -1;
        $sw25: while (true) {
            switch ($pc25) {
                case -1: {
                    r0 = r24.j6();
                    this.v5.j6(r0.rN());
                    r8 = r25.j6();
                    this.Zo.j6(r24, r8);
                    r8.v5();
                    r10 = this.v5.J8();
                    r11 = this.v5.Ws();
                    r12 = r11.size();
                    r13 = r0.size();
                    r1 = r24.v5();
                    if (this.v5.Mr() == false) { $pc25 = 9; continue $sw25; }
                    r2 = r1.get(1);
                    r3 = this.we;
                    if (r3[r2] != null) { $pc25 = 7; continue $sw25; }
                    r3[r2] = new abcd.Zm.b(this, r2);
                    $pc25 = 7; continue $sw25;
                }
                case 7: {
                    this.we[r2].j6(r24.DW());
                    r4 = r1;
                    r16 = this.we[r2];
                    r5 = 1;
                    $pc25 = 20; continue $sw25;
                }
                case 20: {
                    r6 = r4.size();
                    r7 = r5;
                    $pc25 = 21; continue $sw25;
                }
                case 21: {
                    if (r7 >= r6) { $pc25 = 28; continue $sw25; }
                    r17 = r4.get(r7);
                    r19 = r7;
                    r20 = r6;
                    r18 = r4;
                    try {
                        j6(r17, r24.DW(), r16, r8, r26);
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        if ($t instanceof abcd.an) { $pc25 = 25; continue $sw25; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r7 = r19 + 1;
                    r4 = r18;
                    r6 = r20;
                    $pc25 = 25; continue $sw25;
                }
                case 25: {
                    e = $ex25;
                    e.j6("...while merging to block " + abcd.Yt.v5(r17));
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 28: {
                    r21 = r6;
                    r110 = r4;
                    if (r21 == 0) { $pc25 = 31; continue $sw25; }
                    $pc25 = 33; continue $sw25;
                }
                case 33: {
                    r9 = r110;
                    r14 = r21;
                    $pc25 = 34; continue $sw25;
                }
                case 34: {
                    if (r14 != 0) { $pc25 = 36; continue $sw25; }
                    r15 = -1;
                    $pc25 = 41; continue $sw25;
                }
                case 41: {
                    if (Ws() == true) { $pc25 = 43; continue $sw25; }
                    $pc25 = 45; continue $sw25;
                }
                case 45: {
                    r111 = false;
                    $pc25 = 46; continue $sw25;
                }
                case 46: {
                    if (r111 == true) { $pc25 = 50; continue $sw25; }
                    if (r13 != 0) { $pc25 = 50; continue $sw25; }
                    r112 = r9;
                    r22 = r15;
                    $pc25 = 84; continue $sw25;
                }
                case 84: {
                    r23 = r112.v5(r22);
                    $pc25 = 85; continue $sw25;
                }
                case 85: {
                    if (r10 <= 0) { $pc25 = 99; continue $sw25; }
                    r12 = r12 - 1;
                    r27 = r11.get(r12);
                    if (r27.v5().DW() != 1) { $pc25 = 89; continue $sw25; }
                    r28 = true;
                    $pc25 = 91; continue $sw25;
                }
                case 91: {
                    if (r28 == false) { $pc25 = 93; continue $sw25; }
                    r29 = 2;
                    $pc25 = 94; continue $sw25;
                }
                case 94: {
                    r30 = new abcd.Ur(r29);
                    r30.j6(0, r27);
                    if (r28 == false) { $pc25 = 97; continue $sw25; }
                    r30.j6(1, new abcd.Zr(abcd.gs.j3, r27.Zo(), null, abcd.cs.FH));
                    r31 = abcd.au.Zo(r22);
                    $pc25 = 98; continue $sw25;
                }
                case 98: {
                    r30.we();
                    r32 = gn();
                    j6(new abcd.Nr(r32, r30, r31, r22), r8.Hw());
                    r112 = r112.lg();
                    r112.FH(r23, r32);
                    r112.we();
                    r10 = r10 - 1;
                    r22 = r32;
                    { $pc25 = 85; continue $sw25; }
                }
                case 97: {
                    r31 = r112;
                    { $pc25 = 98; continue $sw25; }
                }
                case 93: {
                    r29 = 1;
                    { $pc25 = 94; continue $sw25; }
                }
                case 89: {
                    r28 = false;
                    { $pc25 = 91; continue $sw25; }
                }
                case 99: {
                    r33 = 0;
                    if (r12 != 0) { $pc25 = 102; continue $sw25; }
                    r34 = null;
                    $pc25 = 103; continue $sw25;
                }
                case 103: {
                    if (r34 != null) { $pc25 = 105; continue $sw25; }
                    $pc25 = 106; continue $sw25;
                }
                case 106: {
                    if (r34 != null) { $pc25 = 108; continue $sw25; }
                    r35 = abcd.hs.j6;
                    $pc25 = 109; continue $sw25;
                }
                case 109: {
                    r11.add(new abcd.Zr(abcd.gs.j3, r35, null, abcd.cs.FH));
                    r12 = r12 + 1;
                    $pc25 = 110; continue $sw25;
                }
                case 110: {
                    r36 = new abcd.Ur(r12);
                    $pc25 = 111; continue $sw25;
                }
                case 111: {
                    if (r33 >= r12) { $pc25 = 113; continue $sw25; }
                    r36.j6(r33, r11.get(r33));
                    r33 = r33 + 1;
                    { $pc25 = 111; continue $sw25; }
                }
                case 113: {
                    r36.we();
                    DW(new abcd.Nr(r24.DW(), r36, r112, r22), r8.Hw());
                    return;
                }
                case 108: {
                    r35 = r34.Zo();
                    { $pc25 = 109; continue $sw25; }
                }
                case 105: {
                    if (r34.v5().DW() != 1) { $pc25 = 110; continue $sw25; }
                    $pc25 = 102; continue $sw25;
                }
                case 102: {
                    r34 = r11.get(r12 - 1);
                    $pc25 = 50; continue $sw25;
                }
                case 50: {
                    r37 = new abcd.au(r14);
                    r38 = false;
                    r39 = 0;
                    $pc25 = 51; continue $sw25;
                }
                case 51: {
                    if (r39 >= r13) { $pc25 = 72; continue $sw25; }
                    r40 = r0.get(r39);
                    r41 = r40.DW();
                    r42 = r40.FH();
                    if (r41 != abcd.Ks.DW) { $pc25 = 55; continue $sw25; }
                    r113 = true;
                    $pc25 = 56; continue $sw25;
                }
                case 56: {
                    r114 = r113 | r38;
                    r115 = r39;
                    r116 = r37;
                    r117 = r0;
                    r43 = r15;
                    try {
                        j6(r42, r24.DW(), null, r8.j6(r41), r26);
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        if ($t instanceof abcd.an) { $pc25 = 67; continue $sw25; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r44 = this.tp;
                    r45 = r44[r42];
                    if (r45 != null) { $pc25 = 64; continue $sw25; }
                    r44[r42] = r41.VH();
                    $pc25 = 66; continue $sw25;
                }
                case 66: {
                    r116.DW(j6(r42));
                    r39 = r115 + 1;
                    r15 = r43;
                    r37 = r116;
                    r38 = r114;
                    r0 = r117;
                    { $pc25 = 51; continue $sw25; }
                }
                case 64: {
                    if (r45 == r41.VH()) { $pc25 = 66; continue $sw25; }
                    this.tp[r42] = abcd.Qs.QX;
                    $pc25 = 67; continue $sw25;
                }
                case 67: {
                    e = e;
                    r42 = r42;
                    $pc25 = 70; continue $sw25;
                }
                case 70: {
                    e.j6("...while merging exception to block " + abcd.Yt.v5(r42));
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 69: {
                    e = e;
                    { $pc25 = 70; continue $sw25; }
                }
                case 55: {
                    r113 = false;
                    { $pc25 = 56; continue $sw25; }
                }
                case 72: {
                    r112 = r37;
                    r22 = r15;
                    if (r111 == false) { $pc25 = 81; continue $sw25; }
                    if (r38 == true) { $pc25 = 81; continue $sw25; }
                    r112.DW(DW(-6));
                    this.EQ = true;
                    r46 = (r12 - r10) - 1;
                    $pc25 = 76; continue $sw25;
                }
                case 76: {
                    if (r46 >= r12) { $pc25 = 81; continue $sw25; }
                    r47 = r11.get(r46);
                    if (r47.j6() == false) { $pc25 = 80; continue $sw25; }
                    r11.set(r46, r47.j6(abcd.Qs.QX));
                    $pc25 = 80; continue $sw25;
                }
                case 80: {
                    r46 = r46 + 1;
                    $pc25 = 81; continue $sw25;
                }
                case 81: {
                    if (r22 < 0) { $pc25 = 83; continue $sw25; }
                    r112.DW(r22);
                    $pc25 = 83; continue $sw25;
                }
                case 83: {
                    r112.we();
                    { $pc25 = 84; continue $sw25; }
                }
                case 43: {
                    if (this.v5.J0() == false) { $pc25 = 45; continue $sw25; }
                    r111 = true;
                    { $pc25 = 46; continue $sw25; }
                }
                case 36: {
                    r48 = this.v5.QX();
                    if (r48 < 0) { $pc25 = 39; continue $sw25; }
                    r48 = r9.get(r48);
                    $pc25 = 39; continue $sw25;
                }
                case 39: {
                    r15 = r48;
                    { $pc25 = 41; continue $sw25; }
                }
                case 31: {
                    if (this.v5.a8() == false) { $pc25 = 33; continue $sw25; }
                    r9 = abcd.au.Zo(DW(-2));
                    r14 = 1;
                    { $pc25 = 34; continue $sw25; }
                }
                case 9: {
                    if (this.v5.U2() == false) { $pc25 = 16; continue $sw25; }
                    r49 = this.v5.XL().j6();
                    r50 = this.we;
                    if (r50[r49] != null) { $pc25 = 13; continue $sw25; }
                    r50[r49] = new abcd.Zm.b(this, r49, r24.DW());
                    $pc25 = 14; continue $sw25;
                }
                case 14: {
                    r51 = this.we[r49].DW();
                    this.we[r49].j6(r8, r26);
                    r5 = r51.size();
                    r4 = r51;
                    $pc25 = 19; continue $sw25;
                }
                case 19: {
                    r16 = null;
                    { $pc25 = 20; continue $sw25; }
                }
                case 13: {
                    r50[r49].DW(r24.DW());
                    { $pc25 = 14; continue $sw25; }
                }
                case 16: {
                    if (this.v5.lg() == false) { $pc25 = 18; continue $sw25; }
                    r4 = r1;
                    r5 = r13;
                    { $pc25 = 19; continue $sw25; }
                }
                case 18: {
                    r4 = r1;
                    r5 = 0;
                    { $pc25 = 19; continue $sw25; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.Nr r6, abcd.Nr.a r7, java.util.BitSet r8) {
        abcd.au r0 = null;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex26 = null;
        int $pc26 = -1;
        $sw26: while (true) {
            switch ($pc26) {
                case -1: {
                    r7.j6(r6);
                    r8.set(r6.DW());
                    r0 = r6.gn();
                    r1 = r0.size();
                    r2 = 0;
                    $pc26 = 3; continue $sw26;
                }
                case 3: {
                    if (r2 >= r1) { $pc26 = 15; continue $sw26; }
                    r3 = r0.get(r2);
                    if (r8.get(r3) == true) { $pc26 = 14; continue $sw26; }
                    if (j6(r6) == false) { $pc26 = 11; continue $sw26; }
                    if (r2 > 0) { $pc26 = 14; continue $sw26; }
                    $pc26 = 11; continue $sw26;
                }
                case 11: {
                    r4 = Hw(r3);
                    if (r4 < 0) { $pc26 = 14; continue $sw26; }
                    j6(this.gn.get(r4), r7, r8);
                    $pc26 = 14; continue $sw26;
                }
                case 14: {
                    r2 = r2 + 1;
                    { $pc26 = 3; continue $sw26; }
                }
                case 15: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.Nr r2, abcd.au r3) {
        java.lang.Throwable $ex27 = null;
        int $pc27 = -1;
        $sw27: while (true) {
            switch ($pc27) {
                case -1: {
                    if (r2 == null) { $pc27 = 6; continue $sw27; }
                    this.gn.add(r2);
                    r3.Ws();
                    this.u7.add(r3);
                    return;
                }
                case 6: {
                    throw new java.lang.NullPointerException("block == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(abcd.Zm r0, int r1, int r2, abcd.Zm.b r3, abcd.Om r4, int[] r5) {
        r0.j6(r1, r2, r3, r4, r5);
    }

    private boolean j6(abcd.Nr r5) {
        abcd.au r6 = null;
        int r7 = 0;
        abcd.Zm.b[] r2 = null;
        java.lang.Throwable $ex28 = null;
        int $pc28 = -1;
        $sw28: while (true) {
            switch ($pc28) {
                case -1: {
                    r6 = r5.gn();
                    if (r6.size() >= 2) { $pc28 = 5; continue $sw28; }
                    return false;
                }
                case 5: {
                    r7 = r6.get(1);
                    r2 = this.we;
                    if (r7 < r2.length) { $pc28 = 8; continue $sw28; }
                    $pc28 = 10; continue $sw28;
                }
                case 10: {
                    return false;
                }
                case 8: {
                    if (r2[r7] == null) { $pc28 = 10; continue $sw28; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean j6(abcd.Zm r0, abcd.Nr r1) {
        return r0.j6(r1);
    }

    static boolean j6(abcd.Zm r0, abcd.Nr r1, abcd.au r2) {
        return r0.FH(r1, r2);
    }

    static boolean j6(abcd.Zm r0, boolean r1) {
        r0.J0 = r1;
        return r1;
    }

    private int tp() {
        return this.FH + this.j6.EQ();
    }

    private int u7() {
        return (this.Hw * 2) + 7;
    }

    private void v5() {
        abcd.hs r0 = null;
        abcd.bs r2 = null;
        abcd.Ur r3 = null;
        int r4 = 0;
        abcd.Ur r5 = null;
        java.lang.Throwable $ex29 = null;
        int $pc29 = -1;
        $sw29: while (true) {
            switch ($pc29) {
                case -1: {
                    if (this.EQ == true) { $pc29 = 5; continue $sw29; }
                    return;
                }
                case 5: {
                    r0 = this.j6.j6(0);
                    r2 = abcd.bs.j6(0, abcd.Qs.j3);
                    r3 = new abcd.Ur(2);
                    r3.j6(0, new abcd.Zr(abcd.gs.tp(abcd.Qs.j3), r0, r2, abcd.cs.FH));
                    r3.j6(1, new abcd.ks(abcd.gs.Yi, r0, abcd.cs.j6(we()), abcd.Ps.FH));
                    r3.we();
                    r4 = DW(-7);
                    j6(new abcd.Nr(DW(-6), r3, abcd.au.Zo(r4), r4), abcd.au.DW);
                    r5 = new abcd.Ur(1);
                    r5.j6(0, new abcd.ks(abcd.gs.GK, r0, abcd.cs.j6(r2), abcd.Ps.FH));
                    r5.we();
                    j6(new abcd.Nr(r4, r5, abcd.au.DW, -1), abcd.au.DW);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void v5(int r6) {
        int r0 = 0;
        abcd.au r1 = null;
        int r2 = 0;
        int r7 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex30 = null;
        int $pc30 = -1;
        $sw30: while (true) {
            switch ($pc30) {
                case -1: {
                    r0 = u7();
                    r1 = this.gn.get(r6).gn();
                    r2 = r1.size();
                    this.gn.remove(r6);
                    this.u7.remove(r6);
                    r7 = 0;
                    $pc30 = 3; continue $sw30;
                }
                case 3: {
                    if (r7 >= r2) { $pc30 = 12; continue $sw30; }
                    r3 = r1.get(r7);
                    if (r3 < r0) { $pc30 = 11; continue $sw30; }
                    r4 = Hw(r3);
                    if (r4 < 0) { $pc30 = 10; continue $sw30; }
                    v5(r4);
                    { $pc30 = 11; continue $sw30; }
                }
                case 10: {
                    throw new java.lang.RuntimeException("Invalid label " + abcd.Yt.v5(r3));
                }
                case 11: {
                    r7 = r7 + 1;
                    { $pc30 = 3; continue $sw30; }
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.bs we() {
        int r0 = 0;
        java.lang.Throwable $ex31 = null;
        int $pc31 = -1;
        $sw31: while (true) {
            switch ($pc31) {
                case -1: {
                    r0 = tp();
                    if (r0 >= 1) { $pc31 = 6; continue $sw31; }
                    r0 = 1;
                    $pc31 = 6; continue $sw31;
                }
                case 6: {
                    return abcd.bs.j6(r0, abcd.Qs.QX);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int j6() {
        int r0 = 0;
        java.lang.Throwable $ex32 = null;
        int $pc32 = -1;
        $sw32: while (true) {
            switch ($pc32) {
                case -1: {
                    r0 = tp();
                    if (Ws() == true) { $pc32 = 5; continue $sw32; }
                    return r0;
                }
                case 5: {
                    return r0 + 1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
