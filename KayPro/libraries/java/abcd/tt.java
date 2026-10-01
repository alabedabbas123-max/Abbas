package abcd;

public final class tt {
    public static final java.util.Comparator<abcd.tt> j6 = null;
    private java.util.ArrayList<abcd.Abstractvt> DW;
    private int EQ;
    private java.util.BitSet FH;
    private java.util.BitSet Hw;
    private int J0;
    private abcd.Interfacebu J8;
    private int VH;
    private abcd.Interfacebu Ws;
    private int Zo;
    private abcd.yt gn;
    private final java.util.ArrayList<abcd.tt> tp;
    private int u7;
    private abcd.au v5;
    private int we;

    public static final class a implements java.util.Comparator<abcd.tt> {
        public a() {
        }

        @Override
        public int compare(abcd.tt r1, abcd.tt r2) {
            return j6(r1, r2);
        }

        public int j6(abcd.tt r1, abcd.tt r2) {
            int r3 = 0;
            int r4 = 0;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r3 = abcd.tt.j6(r1);
                        r4 = abcd.tt.j6(r2);
                        if (r3 >= r4) { $pc0 = 6; continue $sw0; }
                        return -1;
                    }
                    case 6: {
                        if (r3 <= r4) { $pc0 = 9; continue $sw0; }
                        return 1;
                    }
                    case 9: {
                        return 0;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    public interface b {
        void j6(abcd.tt r1, abcd.tt r2);
    }

    static {
        j6 = new abcd.tt.a();
    }

    public tt(int r3, int r4, abcd.yt r5) {
        this.Zo = -1;
        this.EQ = 0;
        this.we = 0;
        this.J0 = -1;
        this.gn = r5;
        this.u7 = r3;
        this.DW = new java.util.ArrayList();
        this.VH = r4;
        this.FH = new java.util.BitSet(r5.DW().size());
        this.Hw = new java.util.BitSet(r5.DW().size());
        this.v5 = new abcd.au();
        this.tp = new java.util.ArrayList();
    }

    private static void DW(java.util.BitSet r2, abcd.bs r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r2.set(r3.we());
                    if (r3.Hw() <= 1) { $pc1 = 6; continue $sw1; }
                    r2.set(r3.we() + 1);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int U2() {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.DW.size();
                    r1 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r1 >= r0) { $pc2 = 8; continue $sw2; }
                    if ((this.DW.get(r1) instanceof abcd.ot) == false) { $pc2 = 8; continue $sw2; }
                    r1 = r1 + 1;
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int j6(abcd.tt r0) {
        return r0.VH;
    }

    public static abcd.tt j6(abcd.fs r7, int r8, abcd.yt r9) {
        abcd.Or r0 = null;
        abcd.Nr r1 = null;
        abcd.tt r2 = null;
        abcd.Ur r10 = null;
        int r11 = 0;
        int r3 = 0;
        int r12 = 0;
        int r13 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = r7.j6();
                    r1 = r0.get(r8);
                    r2 = new abcd.tt(r8, r1.DW(), r9);
                    r10 = r1.Hw();
                    r2.DW.ensureCapacity(r10.size());
                    r11 = r10.size();
                    r3 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r3 >= r11) { $pc3 = 5; continue $sw3; }
                    r2.DW.add(new abcd.mt(r10.get(r3), r2));
                    r3 = r3 + 1;
                    { $pc3 = 3; continue $sw3; }
                }
                case 5: {
                    r2.FH = abcd.yt.j6(r0, r7.j6(r1.DW()));
                    r2.Hw = abcd.yt.j6(r0, r1.gn());
                    r2.v5 = abcd.yt.DW(r0, r1.gn());
                    if (r2.v5.size() == 0) { $pc3 = 12; continue $sw3; }
                    r12 = r1.Zo();
                    if (r12 >= 0) { $pc3 = 10; continue $sw3; }
                    r13 = -1;
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    r2.Zo = r13;
                    { $pc3 = 12; continue $sw3; }
                }
                case 10: {
                    r13 = r0.Hw(r12);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.util.List<abcd.Abstractvt> r12) {
        java.util.BitSet r0 = null;
        java.util.BitSet r1 = null;
        int r4 = 0;
        int r2 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        abcd.Abstractvt r3 = null;
        int r8 = 0;
        abcd.Abstractvt r9 = null;
        abcd.bs r10 = null;
        abcd.bs r11 = null;
        abcd.mt r13 = null;
        abcd.cs r14 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = new java.util.BitSet(this.gn.u7());
                    r1 = new java.util.BitSet(this.gn.u7());
                    r4 = r12.size();
                    r2 = 0;
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    if (r2 >= r4) { $pc4 = 25; continue $sw4; }
                    r5 = r2;
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    if (r5 >= r4) { $pc4 = 7; continue $sw4; }
                    DW(r0, r12.get(r5).tp().get(0));
                    DW(r1, r12.get(r5).u7());
                    r5 = r5 + 1;
                    { $pc4 = 5; continue $sw4; }
                }
                case 7: {
                    r6 = r2;
                    r7 = r6;
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    if (r6 >= r4) { $pc4 = 13; continue $sw4; }
                    if (j6(r0, r12.get(r6).u7()) == true) { $pc4 = 12; continue $sw4; }
                    java.util.Collections.swap(r12, r6, r7);
                    r7 = r7 + 1;
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    r6 = r6 + 1;
                    { $pc4 = 8; continue $sw4; }
                }
                case 13: {
                    if (r2 != r7) { $pc4 = 23; continue $sw4; }
                    r3 = null;
                    r8 = r7;
                    $pc4 = 15; continue $sw4;
                }
                case 15: {
                    if (r8 >= r4) { $pc4 = 22; continue $sw4; }
                    r9 = r12.get(r8);
                    if (j6(r0, r9.u7()) == false) { $pc4 = 21; continue $sw4; }
                    if (j6(r1, r9.tp().get(0)) == false) { $pc4 = 21; continue $sw4; }
                    java.util.Collections.swap(r12, r7, r8);
                    r3 = r9;
                    $pc4 = 21; continue $sw4;
                }
                case 21: {
                    r8 = r8 + 1;
                    $pc4 = 22; continue $sw4;
                }
                case 22: {
                    r10 = r3.u7();
                    r11 = r10.FH(this.gn.DW(r10.Hw()));
                    r13 = new abcd.mt(new abcd.Zr(abcd.gs.u7(r10.getType()), abcd.hs.j6, r11, r3.tp()), this);
                    r2 = r7 + 1;
                    r12.add(r7, r13);
                    r14 = abcd.cs.j6(r11);
                    r12.set(r2, new abcd.mt(new abcd.Zr(abcd.gs.u7(r10.getType()), abcd.hs.j6, r10, r14), this));
                    r4 = r12.size();
                    $pc4 = 24; continue $sw4;
                }
                case 24: {
                    r0.clear();
                    r1.clear();
                    { $pc4 = 3; continue $sw4; }
                }
                case 23: {
                    r2 = r7;
                    { $pc4 = 24; continue $sw4; }
                }
                case 25: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean j6(java.util.BitSet r3, abcd.bs r4) {
        int r0 = 0;
        int r5 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = r4.we();
                    r5 = r4.Hw();
                    if (r3.get(r0) == false) { $pc5 = 5; continue $sw5; }
                    return true;
                }
                case 5: {
                    if (r5 == 2) { $pc5 = 7; continue $sw5; }
                    $pc5 = 9; continue $sw5;
                }
                case 9: {
                    return false;
                }
                case 7: {
                    if (r3.get(r0 + 1) == false) { $pc5 = 9; continue $sw5; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int DW() {
        return this.u7;
    }

    public void DW(int r2) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (this.Ws != null) { $pc6 = 5; continue $sw6; }
                    this.Ws = abcd.st.FH(this.gn.u7());
                    $pc6 = 5; continue $sw6;
                }
                case 5: {
                    this.Ws.add(r2);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(abcd.Tr r5) {
        java.util.ArrayList<abcd.Abstractvt> r0 = null;
        abcd.Abstractvt r1 = null;
        abcd.Abstractvt r6 = null;
        java.util.ArrayList<abcd.Abstractvt> r2 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (r5.v5().DW() == 1) { $pc7 = 7; continue $sw7; }
                    r0 = this.DW;
                    r1 = r0.get(r0.size() - 1);
                    r6 = abcd.Abstractvt.j6(r5, this);
                    r2 = this.DW;
                    r2.set(r2.size() - 1, r6);
                    this.gn.DW(r1);
                    this.gn.j6(r6);
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("last insn must branch");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(abcd.bs r5, abcd.bs r6) {
        java.util.ArrayList<abcd.Abstractvt> r0 = null;
        abcd.mt r1 = null;
        int r2 = 0;
        abcd.mt r3 = null;
        java.util.ArrayList<abcd.Abstractvt> r7 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (r5.we() != r6.we()) { $pc8 = 5; continue $sw8; }
                    return;
                }
                case 5: {
                    r0 = this.DW;
                    r1 = (abcd.mt) r0.get(r0.size() - 1);
                    if (r1.u7() == null) { $pc8 = 8; continue $sw8; }
                    $pc8 = 11; continue $sw8;
                }
                case 11: {
                    r2 = this.Hw.nextSetBit(0);
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    if (r2 < 0) { $pc8 = 16; continue $sw8; }
                    this.gn.DW().get(r2).j6(r5, r6);
                    r2 = this.Hw.nextSetBit(r2 + 1);
                    { $pc8 = 12; continue $sw8; }
                }
                case 16: {
                    return;
                }
                case 8: {
                    if (r1.tp().size() > 0) { $pc8 = 11; continue $sw8; }
                    r3 = new abcd.mt(new abcd.Zr(abcd.gs.u7(r5.getType()), abcd.hs.j6, r5, abcd.cs.j6(r6)), this);
                    r7 = this.DW;
                    r7.add(r7.size() - 1, r3);
                    this.EQ++;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(abcd.tt r2) {
        this.tp.add(r2);
    }

    public int EQ() {
        return this.VH;
    }

    public java.util.ArrayList<abcd.Abstractvt> FH() {
        return this.DW;
    }

    public void FH(int r3) {
        this.DW.add(0, new abcd.ot(r3, this));
    }

    public void FH(abcd.tt r3) {
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (this != r3) { $pc9 = 5; continue $sw9; }
                    return;
                }
                case 5: {
                    if (this.v5.size() != 0) { $pc9 = 8; continue $sw9; }
                    this.Hw.set(r3.u7);
                    this.v5.DW(r3.u7);
                    this.Zo = r3.u7;
                    r3.FH.set(this.u7);
                    return;
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Interfacebu Hw() {
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (this.Ws != null) { $pc10 = 6; continue $sw10; }
                    this.Ws = abcd.st.FH(this.gn.u7());
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    return this.Ws;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.tt Hw(abcd.tt r5) {
        abcd.tt r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = this.gn.we();
                    if (this.Hw.get(r5.u7) == false) { $pc11 = 16; continue $sw11; }
                    r0.FH.set(this.u7);
                    r0.Hw.set(r5.u7);
                    r0.v5.DW(r5.u7);
                    r0.Zo = r5.u7;
                    r1 = this.v5.size() - 1;
                    $pc11 = 5; continue $sw11;
                }
                case 5: {
                    if (r1 < 0) { $pc11 = 11; continue $sw11; }
                    if (this.v5.get(r1) != r5.u7) { $pc11 = 9; continue $sw11; }
                    this.v5.FH(r1, r0.u7);
                    $pc11 = 9; continue $sw11;
                }
                case 9: {
                    r1 = r1 - 1;
                    { $pc11 = 5; continue $sw11; }
                }
                case 11: {
                    if (this.Zo != r5.u7) { $pc11 = 13; continue $sw11; }
                    this.Zo = r0.u7;
                    $pc11 = 13; continue $sw11;
                }
                case 13: {
                    this.Hw.clear(r5.u7);
                    this.Hw.set(r0.u7);
                    r5.FH.set(r0.u7);
                    r5.FH.set(this.u7, this.Hw.get(r5.u7));
                    return r0;
                }
                case 16: {
                    throw new java.lang.RuntimeException("Block " + r5.we() + " not successor of " + we());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Hw(int r4) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r0 = this.v5.size() - 1;
                    r1 = 0;
                    $pc12 = 3; continue $sw12;
                }
                case 3: {
                    if (r0 < 0) { $pc12 = 9; continue $sw12; }
                    if (this.v5.get(r0) != r4) { $pc12 = 7; continue $sw12; }
                    r1 = r0;
                    $pc12 = 8; continue $sw12;
                }
                case 8: {
                    r0 = r0 - 1;
                    { $pc12 = 3; continue $sw12; }
                }
                case 7: {
                    this.Zo = this.v5.get(r0);
                    { $pc12 = 8; continue $sw12; }
                }
                case 9: {
                    this.v5.VH(r1);
                    this.Hw.clear(r4);
                    this.gn.DW().get(r4).FH.clear(this.u7);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.au J0() {
        abcd.au r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r0 = new abcd.au(this.v5.size());
                    r1 = this.v5.size();
                    r2 = 0;
                    $pc13 = 3; continue $sw13;
                }
                case 3: {
                    if (r2 >= r1) { $pc13 = 5; continue $sw13; }
                    r0.DW(this.gn.j6(this.v5.get(r2)));
                    r2 = r2 + 1;
                    { $pc13 = 3; continue $sw13; }
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.au J8() {
        return this.v5;
    }

    public void Mr() {
        int r0 = 0;
        java.util.ArrayList<abcd.Abstractvt> r1 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r0 = this.we;
                    if (r0 <= 1) { $pc14 = 10; continue $sw14; }
                    j6(this.DW.subList(0, r0));
                    if (this.DW.get(this.we).J0() == false) { $pc14 = 10; continue $sw14; }
                    throw new java.lang.RuntimeException("Unexpected: moves from phis before move-exception");
                }
                case 10: {
                    if (this.EQ <= 1) { $pc14 = 12; continue $sw14; }
                    r1 = this.DW;
                    j6(r1.subList((r1.size() - this.EQ) - 1, this.DW.size() - 1));
                    $pc14 = 12; continue $sw14;
                }
                case 12: {
                    this.gn.Ws();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.tt QX() {
        abcd.tt r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    r0 = this.gn.we();
                    r0.FH = this.FH;
                    r0.Hw.set(this.u7);
                    r0.v5.DW(this.u7);
                    r0.Zo = this.u7;
                    this.FH = new java.util.BitSet(this.gn.DW().size());
                    this.FH.set(r0.u7);
                    r1 = r0.FH.nextSetBit(0);
                    $pc15 = 3; continue $sw15;
                }
                case 3: {
                    if (r1 < 0) { $pc15 = 5; continue $sw15; }
                    this.gn.DW().get(r1).j6(this.u7, r0.u7);
                    r1 = r0.FH.nextSetBit(r1 + 1);
                    { $pc15 = 3; continue $sw15; }
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.BitSet VH() {
        return this.FH;
    }

    public java.util.BitSet Ws() {
        return this.Hw;
    }

    public boolean XL() {
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    if (this.u7 != this.gn.VH()) { $pc16 = 5; continue $sw16; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.List<abcd.Abstractvt> Zo() {
        return this.DW.subList(0, U2());
    }

    public boolean aM() {
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    if (this.J0 != (-1)) { $pc17 = 6; continue $sw17; }
                    this.gn.j6();
                    $pc17 = 6; continue $sw17;
                }
                case 6: {
                    if (this.J0 == 1) { $pc17 = 10; continue $sw17; }
                    return false;
                }
                case 10: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.tt gn() {
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    if (this.Zo >= 0) { $pc18 = 7; continue $sw18; }
                    return null;
                }
                case 7: {
                    return this.gn.DW().get(this.Zo);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j3() {
        this.DW.subList(0, U2()).clear();
    }

    public java.util.ArrayList<abcd.tt> j6() {
        return this.tp;
    }

    public void j6(int r2) {
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    if (this.J8 != null) { $pc19 = 5; continue $sw19; }
                    this.J8 = abcd.st.FH(this.gn.u7());
                    $pc19 = 5; continue $sw19;
                }
                case 5: {
                    this.J8.add(r2);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r3, int r4) {
        int r0 = 0;
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    if (r3 != r4) { $pc20 = 4; continue $sw20; }
                    return;
                }
                case 4: {
                    this.Hw.set(r4);
                    if (this.Zo != r3) { $pc20 = 7; continue $sw20; }
                    this.Zo = r4;
                    $pc20 = 7; continue $sw20;
                }
                case 7: {
                    r0 = this.v5.size() - 1;
                    $pc20 = 8; continue $sw20;
                }
                case 8: {
                    if (r0 < 0) { $pc20 = 13; continue $sw20; }
                    if (this.v5.get(r0) != r3) { $pc20 = 12; continue $sw20; }
                    this.v5.FH(r0, r4);
                    $pc20 = 12; continue $sw20;
                }
                case 12: {
                    r0 = r0 - 1;
                    { $pc20 = 8; continue $sw20; }
                }
                case 13: {
                    this.Hw.clear(r3);
                    this.gn.DW().get(r4).FH.set(this.u7);
                    this.gn.DW().get(r3).FH.clear(this.u7);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.Tr r3) {
        abcd.Abstractvt r4 = abcd.Abstractvt.j6(r3, this);
        this.DW.add(U2(), r4);
        this.gn.j6(r4);
    }

    public void j6(abcd.bs r3) {
        this.DW.add(0, new abcd.ot(r3, this));
    }

    public void j6(abcd.bs r5, abcd.bs r6) {
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    if (r5.we() != r6.we()) { $pc21 = 5; continue $sw21; }
                    return;
                }
                case 5: {
                    this.DW.add(U2(), new abcd.mt(new abcd.Zr(abcd.gs.u7(r5.getType()), abcd.hs.j6, r5, abcd.cs.j6(r6)), this));
                    this.we++;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.ot.b r5) {
        int r0 = 0;
        int r1 = 0;
        abcd.Abstractvt r2 = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = -1;
        $sw22: while (true) {
            switch ($pc22) {
                case -1: {
                    r0 = this.DW.size();
                    r1 = 0;
                    $pc22 = 3; continue $sw22;
                }
                case 3: {
                    if (r1 >= r0) { $pc22 = 7; continue $sw22; }
                    r2 = this.DW.get(r1);
                    if ((r2 instanceof abcd.ot) == false) { $pc22 = 10; continue $sw22; }
                    r5.j6((abcd.ot) r2);
                    r1 = r1 + 1;
                    { $pc22 = 3; continue $sw22; }
                }
                case 10: {
                    return;
                }
                case 7: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.Abstractvt.a r4) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex23 = null;
        int $pc23 = -1;
        $sw23: while (true) {
            switch ($pc23) {
                case -1: {
                    r0 = this.DW.size();
                    r1 = 0;
                    $pc23 = 3; continue $sw23;
                }
                case 3: {
                    if (r1 >= r0) { $pc23 = 5; continue $sw23; }
                    this.DW.get(r1).j6(r4);
                    r1 = r1 + 1;
                    { $pc23 = 3; continue $sw23; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return "{" + this.u7 + ":" + abcd.Yt.v5(this.VH) + '}';
    }

    public int tp() {
        return this.gn.j6(this.Zo);
    }

    public int u7() {
        return this.Zo;
    }

    public abcd.yt v5() {
        return this.gn;
    }

    public void v5(int r1) {
        this.J0 = r1;
    }

    public java.lang.String we() {
        return abcd.Yt.v5(this.VH);
    }
}
