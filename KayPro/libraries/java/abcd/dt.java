package abcd;

public class dt {
    private int DW;
    private java.util.ArrayList<abcd.dt.a> FH;
    private abcd.yt j6;

    static class a {
        abcd.dt.b DW;
        java.util.ArrayList<abcd.dt.a> FH;
        java.util.ArrayList<abcd.dt.a> Hw;
        java.util.BitSet j6;
        boolean v5;

        a(int r2, int r3, abcd.dt.b r4) {
            this.j6 = new java.util.BitSet(r3);
            this.j6.set(r2);
            this.DW = r4;
            this.FH = new java.util.ArrayList();
            this.Hw = new java.util.ArrayList();
            this.v5 = false;
        }
    }

    public static final class b extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.dt.b DW = null;
        public static final abcd.dt.b FH = null;
        public static final abcd.dt.b Hw = null;
        private static final abcd.dt.b[] Zo = null;
        public static final abcd.dt.b j6 = null;
        public static final abcd.dt.b v5 = null;

        static {
            j6 = new abcd.dt.b("TOP", 0);
            DW = new abcd.dt.b("NONE", 1);
            FH = new abcd.dt.b("METHOD", 2);
            Hw = new abcd.dt.b("INTER", 3);
            v5 = new abcd.dt.b("GLOBAL", 4);
            Zo = new abcd.dt.b[]{j6, DW, FH, Hw, v5};
        }

        private b(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.dt.b valueOf(java.lang.String r1) {
            return (abcd.dt.b) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.dt.b.values(), r1);
        }

        public static abcd.dt.b[] values() {
            return (abcd.dt.b[]) Zo.clone();
        }
    }

    private dt(abcd.yt r1) {
        this.j6 = r1;
        this.DW = r1.u7();
        this.FH = new java.util.ArrayList();
    }

    private abcd.Abstractvt DW(abcd.Abstractvt r3) {
        int r4 = r3.DW().Ws().nextSetBit(0);
        return this.j6.DW().get(r4).FH().get(0);
    }

    private void DW() {
        java.util.Iterator<abcd.dt.a> r0 = null;
        abcd.dt.a r1 = null;
        java.util.Iterator<abcd.dt.a> r2 = null;
        abcd.dt.a r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.j6.j6(new abcd.ct(this));
                    r0 = this.FH.iterator();
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc0 = 13; continue $sw0; }
                    r1 = r0.next();
                    if (r1.DW == abcd.dt.b.DW) { $pc0 = 4; continue $sw0; }
                    r2 = r1.FH.iterator();
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if (r2.hasNext() == false) { $pc0 = 4; continue $sw0; }
                    r3 = r2.next();
                    if (r1.DW.compareTo(r3.DW) <= 0) { $pc0 = 9; continue $sw0; }
                    r3.DW = r1.DW;
                    { $pc0 = 9; continue $sw0; }
                }
                case 13: {
                    FH();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW(abcd.dt.a r4, abcd.dt.a r5) {
        java.util.Iterator<abcd.dt.a> r0 = null;
        abcd.dt.a r1 = null;
        java.util.Iterator<abcd.dt.a> r2 = null;
        abcd.dt.a r3 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = r5.Hw.iterator();
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc1 = 6; continue $sw1; }
                    r1 = r0.next();
                    r1.FH.remove(r5);
                    r1.FH.add(r4);
                    r4.Hw.add(r1);
                    { $pc1 = 4; continue $sw1; }
                }
                case 6: {
                    r2 = r5.FH.iterator();
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    if (r2.hasNext() == false) { $pc1 = 10; continue $sw1; }
                    r3 = r2.next();
                    r3.Hw.remove(r5);
                    r3.Hw.add(r4);
                    r4.FH.add(r3);
                    { $pc1 = 8; continue $sw1; }
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW(abcd.Abstractvt r8, abcd.cs r9, abcd.bs r10, int r11, abcd.Abstractms r12) {
        abcd.Tr r0 = null;
        abcd.es r2 = null;
        abcd.Tr r13 = null;
        abcd.mt r14 = null;
        java.util.ArrayList<abcd.Abstractvt> r15 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = r8.gn();
                    r2 = abcd.gs.j6(r11, r10, r9, r12);
                    if (r12 != null) { $pc2 = 5; continue $sw2; }
                    r13 = new abcd.ks(r2, r0.Zo(), r9, abcd.Ps.FH);
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    r14 = new abcd.mt(r13, r8.DW());
                    r15 = r8.DW().FH();
                    r15.add(r15.lastIndexOf(r8), r14);
                    this.j6.j6(r14);
                    return;
                }
                case 5: {
                    r13 = new abcd.js(r2, r0.Zo(), r9, abcd.Ps.FH, r12);
                    { $pc2 = 6; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void FH() {
        java.util.Iterator<abcd.dt.a> r0 = null;
        abcd.dt.a r1 = null;
        int r2 = 0;
        abcd.Abstractvt r3 = null;
        abcd.Abstractvt r4 = null;
        int r5 = 0;
        java.util.ArrayList<abcd.bs> r6 = null;
        java.util.HashSet<abcd.Abstractvt> r7 = null;
        java.util.Iterator<abcd.Abstractvt> r8 = null;
        abcd.Abstractvt r9 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.FH.iterator();
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc3 = 15; continue $sw3; }
                    r1 = r0.next();
                    if (r1.v5 == false) { $pc3 = 4; continue $sw3; }
                    if (r1.DW != abcd.dt.b.DW) { $pc3 = 4; continue $sw3; }
                    r2 = r1.j6.nextSetBit(0);
                    r3 = this.j6.FH(r2);
                    r4 = j6(r3);
                    r5 = ((abcd.Ds) r4.tp().get(0).J8()).Ws();
                    r6 = new java.util.ArrayList(r5);
                    r7 = new java.util.HashSet();
                    j6(r3, r4, r5, r6);
                    r7.add(r4);
                    r7.add(r3);
                    r8 = this.j6.Hw(r2).iterator();
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    if (r8.hasNext() == false) { $pc3 = 14; continue $sw3; }
                    r9 = r8.next();
                    j6(r9, r4, r6, r7);
                    r7.add(r9);
                    { $pc3 = 12; continue $sw3; }
                }
                case 14: {
                    this.j6.j6(r7);
                    this.j6.J8();
                    abcd.C1400ut.j6(this.j6, this.DW);
                    j6();
                    { $pc3 = 4; continue $sw3; }
                }
                case 15: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void FH(abcd.Abstractvt r5) {
        int r0 = 0;
        abcd.bs r1 = null;
        abcd.dt.a r6 = null;
        abcd.dt.a r7 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = r5.v5().Hw();
                    r1 = r5.u7();
                    if (r0 != 56) { $pc4 = 8; continue $sw4; }
                    if (r1.J8().j3() != 9) { $pc4 = 8; continue $sw4; }
                    j6(r1, Hw(r5));
                    return;
                }
                case 8: {
                    if (r0 != 3) { $pc4 = 13; continue $sw4; }
                    if (r1.J8().j3() != 9) { $pc4 = 13; continue $sw4; }
                    r6 = new abcd.dt.a(r1.we(), this.DW, abcd.dt.b.DW);
                    this.FH.add(r6);
                    j6(r1, r6);
                    return;
                }
                case 13: {
                    if (r0 == 55) { $pc4 = 15; continue $sw4; }
                    return;
                }
                case 15: {
                    if (r1.J8().j3() != 9) { $pc4 = 21; continue $sw4; }
                    r7 = new abcd.dt.a(r1.we(), this.DW, abcd.dt.b.DW);
                    this.FH.add(r7);
                    j6(r1, r7);
                    return;
                }
                case 21: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.dt.a Hw(abcd.Abstractvt r5) {
        abcd.bs r0 = null;
        abcd.Abstractvt r6 = null;
        int r1 = 0;
        abcd.dt.a r7 = null;
        abcd.bs r8 = null;
        int r2 = 0;
        abcd.dt.a r9 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = r5.u7();
                    r6 = j6(r5);
                    r1 = r6.v5().Hw();
                    if (r1 != 5) { $pc5 = 5; continue $sw5; }
                    $pc5 = 26; continue $sw5;
                }
                case 26: {
                    r7 = new abcd.dt.a(r0.we(), this.DW, abcd.dt.b.DW);
                    $pc5 = 27; continue $sw5;
                }
                case 27: {
                    this.FH.add(r7);
                    return r7;
                }
                case 5: {
                    if (r1 != 38) { $pc5 = 7; continue $sw5; }
                    $pc5 = 18; continue $sw5;
                }
                case 18: {
                    r8 = r6.tp().get(0);
                    r2 = j6(r8);
                    if (r2 == this.FH.size()) { $pc5 = 23; continue $sw5; }
                    r9 = this.FH.get(r2);
                    r9.j6.set(r0.we());
                    return r9;
                }
                case 23: {
                    if (r8.getType() != abcd.Qs.EQ) { $pc5 = 25; continue $sw5; }
                    r7 = new abcd.dt.a(r0.we(), this.DW, abcd.dt.b.DW);
                    { $pc5 = 27; continue $sw5; }
                }
                case 25: {
                    r7 = new abcd.dt.a(r0.we(), this.DW, abcd.dt.b.v5);
                    { $pc5 = 27; continue $sw5; }
                }
                case 7: {
                    if (r1 == 45) { $pc5 = 18; continue $sw5; }
                    if (r1 == 46) { $pc5 = 17; continue $sw5; }
                    switch(r1) {
                        case 40: { $pc5 = 26; continue $sw5; }
                        case 41: { $pc5 = 14; continue $sw5; }
                        case 42: { $pc5 = 14; continue $sw5; }
                        case 43: { $pc5 = 18; continue $sw5; }
                        default: { $pc5 = 11; continue $sw5; }
                    };
                }
                case 11: {
                    return null;
                }
                case 14: {
                    if (r6.tp().get(0).J8().a8() == false) { $pc5 = 16; continue $sw5; }
                    r7 = new abcd.dt.a(r0.we(), this.DW, abcd.dt.b.DW);
                    r7.v5 = true;
                    { $pc5 = 27; continue $sw5; }
                }
                case 16: {
                    r7 = new abcd.dt.a(r0.we(), this.DW, abcd.dt.b.v5);
                    { $pc5 = 27; continue $sw5; }
                }
                case 17: {
                    r7 = new abcd.dt.a(r0.we(), this.DW, abcd.dt.b.v5);
                    { $pc5 = 27; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int j6(abcd.bs r4) {
        int r0 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = 0;
                    $pc6 = 4; continue $sw6;
                }
                case 4: {
                    if (r0 >= this.FH.size()) { $pc6 = 9; continue $sw6; }
                    if (this.FH.get(r0).j6.get(r4.we()) == true) { $pc6 = 7; continue $sw6; }
                    r0 = r0 + 1;
                    { $pc6 = 4; continue $sw6; }
                }
                case 7: {
                    return r0;
                }
                case 9: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.Abstractvt j6(abcd.Abstractvt r2) {
        java.util.ArrayList<abcd.Abstractvt> r3 = this.j6.DW().get(r2.DW().VH().nextSetBit(0)).FH();
        return r3.get(r3.size() - 1);
    }

    static abcd.yt j6(abcd.dt r0) {
        return r0.j6;
    }

    private void j6() {
        int r1 = 0;
        abcd.Abstractvt r2 = null;
        java.util.ArrayList<abcd.Abstractvt>[] r3 = null;
        abcd.bs r4 = null;
        abcd.bs r5 = null;
        abcd.at r6 = null;
        java.util.Iterator<abcd.Abstractvt> r7 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r1 = 0;
                    $pc7 = 4; continue $sw7;
                }
                case 4: {
                    if (r1 >= this.j6.u7()) { $pc7 = 22; continue $sw7; }
                    r2 = this.j6.FH(r1);
                    if (r2 == null) { $pc7 = 21; continue $sw7; }
                    if (r2.v5() == null) { $pc7 = 21; continue $sw7; }
                    if (r2.v5().Hw() != 2) { $pc7 = 21; continue $sw7; }
                    r3 = this.j6.tp();
                    r4 = r2.tp().get(0);
                    r5 = r2.u7();
                    if (r4.we() < this.DW) { $pc7 = 15; continue $sw7; }
                    $pc7 = 17; continue $sw7;
                }
                case 17: {
                    r6 = new abcd.at(this, r5, r4);
                    r7 = r3[r5.we()].iterator();
                    $pc7 = 19; continue $sw7;
                }
                case 19: {
                    if (r7.hasNext() == false) { $pc7 = 21; continue $sw7; }
                    r7.next().DW(r6);
                    { $pc7 = 19; continue $sw7; }
                }
                case 15: {
                    if (r5.we() >= this.DW) { $pc7 = 17; continue $sw7; }
                    $pc7 = 21; continue $sw7;
                }
                case 21: {
                    r1 = r1 + 1;
                    { $pc7 = 4; continue $sw7; }
                }
                case 22: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.bs r5, abcd.dt.a r6) {
        java.util.ArrayList<abcd.bs> r0 = null;
        abcd.bs r7 = null;
        java.util.Iterator<abcd.Abstractvt> r1 = null;
        abcd.Abstractvt r2 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = new java.util.ArrayList();
                    r0.add(r5);
                    $pc8 = 4; continue $sw8;
                }
                case 4: {
                    if (r0.isEmpty() == true) { $pc8 = 12; continue $sw8; }
                    r7 = r0.remove(r0.size() - 1);
                    r1 = this.j6.Hw(r7.we()).iterator();
                    $pc8 = 7; continue $sw8;
                }
                case 7: {
                    if (r1.hasNext() == false) { $pc8 = 4; continue $sw8; }
                    r2 = r1.next();
                    if (r2.v5() == null) { $pc8 = 10; continue $sw8; }
                    j6(r7, r2, r6, r0);
                    { $pc8 = 7; continue $sw8; }
                }
                case 10: {
                    j6(r2, r6, r0);
                    { $pc8 = 7; continue $sw8; }
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.bs r5, abcd.Abstractvt r6, abcd.dt.a r7, java.util.ArrayList<abcd.bs> r8) {
        int r0 = 0;
        abcd.cs r9 = null;
        int r10 = 0;
        abcd.dt.a r11 = null;
        int r12 = 0;
        abcd.dt.a r13 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = r6.v5().Hw();
                    if (r0 != 2) { $pc9 = 5; continue $sw9; }
                    r7.j6.set(r6.u7().we());
                    r8.add(r6.u7());
                    return;
                }
                case 5: {
                    if (r0 != 33) { $pc9 = 7; continue $sw9; }
                    $pc9 = 45; continue $sw9;
                }
                case 45: {
                    r7.DW = abcd.dt.b.Hw;
                    return;
                }
                case 7: {
                    if (r0 == 35) { $pc9 = 45; continue $sw9; }
                    if (r0 == 43) { $pc9 = 43; continue $sw9; }
                    if (r0 == 7) { $pc9 = 43; continue $sw9; }
                    if (r0 == 8) { $pc9 = 43; continue $sw9; }
                    if (r0 == 38) { $pc9 = 40; continue $sw9; }
                    if (r0 == 39) { $pc9 = 22; continue $sw9; }
                    switch(r0) {
                        case 47: { $pc9 = 25; continue $sw9; }
                        case 48: { $pc9 = 20; continue $sw9; }
                        case 49: { $pc9 = 45; continue $sw9; }
                        case 50: { $pc9 = 45; continue $sw9; }
                        case 51: { $pc9 = 45; continue $sw9; }
                        case 52: { $pc9 = 45; continue $sw9; }
                        case 53: { $pc9 = 45; continue $sw9; }
                        default: { $pc9 = 60; continue $sw9; }
                    };
                }
                case 20: {
                    r7.DW = abcd.dt.b.v5;
                    return;
                }
                case 60: {
                    return;
                }
                case 25: {
                    if (r6.tp().get(0).J8().j3() != 9) { $pc9 = 61; continue $sw9; }
                    r7.v5 = false;
                    r9 = r6.tp();
                    if (r9.get(0).we() != r5.we()) { $pc9 = 34; continue $sw9; }
                    r10 = j6(r9.get(1));
                    if (r10 == this.FH.size()) { $pc9 = 49; continue $sw9; }
                    r11 = this.FH.get(r10);
                    j6(r11, r7);
                    if (r7.DW.compareTo(r11.DW) >= 0) { $pc9 = 50; continue $sw9; }
                    r7.DW = r11.DW;
                    return;
                }
                case 50: {
                    return;
                }
                case 49: {
                    return;
                }
                case 34: {
                    r12 = j6(r9.get(0));
                    if (r12 == this.FH.size()) { $pc9 = 52; continue $sw9; }
                    r13 = this.FH.get(r12);
                    j6(r7, r13);
                    if (r13.DW.compareTo(r7.DW) >= 0) { $pc9 = 53; continue $sw9; }
                    r13.DW = r7.DW;
                    return;
                }
                case 53: {
                    return;
                }
                case 52: {
                    return;
                }
                case 61: {
                    return;
                }
                case 22: {
                    if (r6.tp().get(2).J8().a8() == true) { $pc9 = 25; continue $sw9; }
                    r7.v5 = false;
                    { $pc9 = 25; continue $sw9; }
                }
                case 40: {
                    if (r6.tp().get(1).J8().a8() == true) { $pc9 = 55; continue $sw9; }
                    r7.v5 = false;
                    return;
                }
                case 55: {
                    return;
                }
                case 43: {
                    if (r7.DW.compareTo(abcd.dt.b.FH) >= 0) { $pc9 = 57; continue $sw9; }
                    r7.DW = abcd.dt.b.FH;
                    return;
                }
                case 57: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.dt.a r2, abcd.dt.a r3) {
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (r3.Hw.contains(r2) == true) { $pc10 = 6; continue $sw10; }
                    r3.Hw.add(r2);
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    if (r2.FH.contains(r3) == true) { $pc10 = 9; continue $sw10; }
                    r2.FH.add(r3);
                    return;
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(abcd.dt r0, abcd.Abstractvt r1) {
        r0.FH(r1);
    }

    private void j6(abcd.Abstractvt r14, abcd.bs r15, java.util.HashSet<abcd.Abstractvt> r16) {
        abcd.Ks r8 = new abcd.Ks(abcd.Rr.DW);
        DW(r14, abcd.cs.FH, null, 40, r8);
        abcd.tt r0 = r14.DW();
        abcd.tt r9 = r0.Hw(r0.gn());
        abcd.Abstractvt r1 = r9.FH().get(0);
        abcd.bs r11 = abcd.bs.j6(this.j6.J0(), r8);
        j6(r1, abcd.cs.FH, r11, 56, null);
        abcd.tt r10 = r9.Hw(r9.gn());
        abcd.Abstractvt r12 = r10.FH().get(0);
        abcd.Abstractms r5 = new abcd.Gs(r8, new abcd.Hs(new abcd.Js("<init>"), new abcd.Js("(I)V")));
        DW(r12, abcd.cs.j6(r11, r15), null, 52, r5);
        r16.add(r12);
        abcd.tt r13 = r10.Hw(r10.gn());
        abcd.Abstractvt r17 = r13.FH().get(0);
        DW(r17, abcd.cs.j6(r11), null, 35, null);
        r13.j6(r13.u7(), this.j6.Zo().DW());
        r16.add(r17);
    }

    private void j6(abcd.Abstractvt r8, abcd.cs r9, abcd.bs r10, int r11, abcd.Abstractms r12) {
        abcd.Tr r0 = null;
        abcd.es r13 = null;
        abcd.es r2 = null;
        abcd.Tr r14 = null;
        abcd.mt r15 = null;
        java.util.ArrayList<abcd.Abstractvt> r16 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = r8.gn();
                    if (r11 != 56) { $pc11 = 5; continue $sw11; }
                    r13 = abcd.gs.J0(r10.getType());
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    r2 = r13;
                    if (r12 != null) { $pc11 = 9; continue $sw11; }
                    r14 = new abcd.Zr(r2, r0.Zo(), r10, r9);
                    $pc11 = 10; continue $sw11;
                }
                case 10: {
                    r15 = new abcd.mt(r14, r8.DW());
                    r16 = r8.DW().FH();
                    r16.add(r16.lastIndexOf(r8), r15);
                    this.j6.j6(r15);
                    return;
                }
                case 9: {
                    r14 = new abcd.Yr(r2, r0.Zo(), r10, r9, r12);
                    { $pc11 = 10; continue $sw11; }
                }
                case 5: {
                    r13 = abcd.gs.j6(r11, r10, r9, r12);
                    { $pc11 = 6; continue $sw11; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.Abstractvt r3, abcd.dt.a r4, java.util.ArrayList<abcd.bs> r5) {
        int r0 = 0;
        abcd.dt.a r6 = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r0 = j6(r3.u7());
                    if (r0 == this.FH.size()) { $pc12 = 10; continue $sw12; }
                    r6 = this.FH.get(r0);
                    if (r6 == r4) { $pc12 = 12; continue $sw12; }
                    r4.v5 = false;
                    r4.j6.or(r6.j6);
                    if (r4.DW.compareTo(r6.DW) >= 0) { $pc12 = 9; continue $sw12; }
                    r4.DW = r6.DW;
                    $pc12 = 9; continue $sw12;
                }
                case 9: {
                    DW(r4, r6);
                    this.FH.remove(r0);
                    return;
                }
                case 12: {
                    return;
                }
                case 10: {
                    r4.j6.set(r3.u7().we());
                    r5.add(r3.u7());
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.Abstractvt r9, abcd.Abstractvt r10, int r11, java.util.ArrayList<abcd.bs> r12) {
        abcd.Qs r13 = null;
        int r0 = 0;
        abcd.Abstractms r7 = null;
        int r2 = 0;
        abcd.bs r5 = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r13 = r9.u7().getType();
                    r0 = 0;
                    $pc13 = 3; continue $sw13;
                }
                case 3: {
                    if (r0 >= r11) { $pc13 = 5; continue $sw13; }
                    r7 = abcd.Ns.j6(r13.we());
                    r2 = this.j6.J0();
                    r5 = abcd.bs.j6(r2, (abcd.Ms) r7);
                    r12.add(r5);
                    j6(r9, abcd.cs.FH, r5, 5, r7);
                    r0 = r0 + 1;
                    { $pc13 = 3; continue $sw13; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.Abstractvt r11, abcd.Abstractvt r12, java.util.ArrayList<abcd.bs> r13, java.util.HashSet<abcd.Abstractvt> r14) {
        int r0 = 0;
        int r1 = 0;
        int r3 = 0;
        java.lang.Object r15 = null;
        abcd.Abstractvt r16 = null;
        java.util.ArrayList<abcd.Abstractms> r17 = null;
        abcd.bs r18 = null;
        abcd.Abstractvt r19 = null;
        abcd.cs r110 = null;
        int r4 = 0;
        abcd.bs r111 = null;
        abcd.bs r5 = null;
        abcd.cs r112 = null;
        int r2 = 0;
        abcd.bs r113 = null;
        abcd.bs r114 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r0 = r13.size();
                    r1 = r11.v5().Hw();
                    r3 = 0;
                    if (r1 != 34) { $pc14 = 5; continue $sw14; }
                    r15 = r12.tp().get(0).J8();
                    r16 = DW(r11);
                    j6(r16, abcd.cs.FH, r16.u7(), 5, (abcd.Abstractms) r15);
                    r14.add(r16);
                    return;
                }
                case 5: {
                    if (r1 != 54) { $pc14 = 7; continue $sw14; }
                    return;
                }
                case 7: {
                    if (r1 != 57) { $pc14 = 9; continue $sw14; }
                    r17 = ((abcd.Sr) r11.gn()).EQ();
                    $pc14 = 23; continue $sw14;
                }
                case 23: {
                    if (r3 >= r0) { $pc14 = 33; continue $sw14; }
                    r18 = abcd.bs.j6(r13.get(r3).we(), (abcd.Rs) r17.get(r3));
                    j6(r11, abcd.cs.FH, r18, 5, r17.get(r3));
                    r13.set(r3, r18);
                    r3 = r3 + 1;
                    { $pc14 = 23; continue $sw14; }
                }
                case 33: {
                    return;
                }
                case 9: {
                    if (r1 != 38) { $pc14 = 11; continue $sw14; }
                    r19 = DW(r11);
                    r110 = r11.tp();
                    r4 = ((abcd.Ds) r110.get(1).J8()).Ws();
                    if (r4 >= r0) { $pc14 = 20; continue $sw14; }
                    r111 = r13.get(r4);
                    r5 = r111.FH(r19.u7().we());
                    j6(r19, abcd.cs.j6(r111), r5, 2, null);
                    $pc14 = 21; continue $sw14;
                }
                case 21: {
                    r14.add(r19);
                    return;
                }
                case 20: {
                    j6(r19, r110.get(1), r14);
                    r14.add(r19.DW().FH().get(2));
                    { $pc14 = 21; continue $sw14; }
                }
                case 11: {
                    if (r1 != 39) { $pc14 = 32; continue $sw14; }
                    r112 = r11.tp();
                    r2 = ((abcd.Ds) r112.get(2).J8()).Ws();
                    if (r2 >= r0) { $pc14 = 16; continue $sw14; }
                    r113 = r112.get(0);
                    r114 = r113.FH(r13.get(r2).we());
                    j6(r11, abcd.cs.j6(r113), r114, 2, null);
                    r13.set(r2, r114.rN());
                    return;
                }
                case 16: {
                    j6(r11, r112.get(2), r14);
                    return;
                }
                case 32: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(abcd.yt r1) {
        new abcd.dt(r1).DW();
    }
}
