package abcd;

public final class yt {
    private int DW;
    private java.util.ArrayList<abcd.Abstractvt>[] EQ;
    private int FH;
    private int Hw;
    private boolean J0;
    private int VH;
    private int Zo;
    private final int gn;
    private java.util.ArrayList<abcd.tt> j6;
    private abcd.Abstractvt[] tp;
    private final boolean u7;
    private int v5;
    private java.util.List<abcd.Abstractvt>[] we;

    private yt(abcd.fs r1, int r2, boolean r3) {
        this.gn = r2;
        this.u7 = r3;
        this.J0 = false;
        this.VH = r1.j6().rN();
        this.Hw = r1.j6().BT();
        this.v5 = this.Hw;
    }

    public static abcd.au DW(abcd.Or r4, abcd.au r5) {
        abcd.au r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new abcd.au(r5.size());
                    r1 = r5.size();
                    r2 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r2 >= r1) { $pc0 = 5; continue $sw0; }
                    r0.DW(r4.Hw(r5.get(r2)));
                    r2 = r2 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW(abcd.Abstractvt r5, abcd.cs r6) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r6 != null) { $pc1 = 4; continue $sw1; }
                    return;
                }
                case 4: {
                    r0 = r6.size();
                    r1 = 0;
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    if (r1 >= r0) { $pc1 = 11; continue $sw1; }
                    if (this.EQ[r6.get(r1).we()].remove(r5) == false) { $pc1 = 10; continue $sw1; }
                    r1 = r1 + 1;
                    { $pc1 = 5; continue $sw1; }
                }
                case 10: {
                    throw new java.lang.RuntimeException("use not found");
                }
                case 11: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.util.ArrayList[] DW(abcd.yt r0) {
        return r0.EQ;
    }

    private void XL() {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.J0 == true) { $pc2 = 14; continue $sw2; }
                    this.EQ = new java.util.ArrayList[this.Hw];
                    r0 = 0;
                    r1 = 0;
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (r1 >= this.Hw) { $pc2 = 8; continue $sw2; }
                    this.EQ[r1] = new java.util.ArrayList();
                    r1 = r1 + 1;
                    { $pc2 = 6; continue $sw2; }
                }
                case 8: {
                    j6(new abcd.xt(this));
                    this.we = new java.util.List[this.Hw];
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    if (r0 >= this.Hw) { $pc2 = 12; continue $sw2; }
                    this.we[r0] = java.util.Collections.unmodifiableList(this.EQ[r0]);
                    r0 = r0 + 1;
                    { $pc2 = 10; continue $sw2; }
                }
                case 12: {
                    return;
                }
                case 14: {
                    throw new java.lang.RuntimeException("No use list in back mode");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static abcd.Abstractvt j6(abcd.tt r6) {
        return new abcd.mt(new abcd.Zr(abcd.gs.j3, abcd.hs.j6, null, abcd.cs.FH), r6);
    }

    public static abcd.yt j6(abcd.fs r1, int r2, boolean r3) {
        abcd.yt r0 = new abcd.yt(r1, r2, r3);
        r0.j6(r1);
        return r0;
    }

    static java.util.BitSet j6(abcd.Or r4, abcd.au r5) {
        java.util.BitSet r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = new java.util.BitSet(r4.size());
                    r1 = r5.size();
                    r2 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r2 >= r1) { $pc3 = 5; continue $sw3; }
                    r0.set(r4.Hw(r5.get(r2)));
                    r2 = r2 + 1;
                    { $pc3 = 3; continue $sw3; }
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.fs r5) {
        int r0 = 0;
        int r1 = 0;
        abcd.tt r2 = null;
        int r6 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = r5.j6().size();
                    this.j6 = new java.util.ArrayList(r0 + 2);
                    r1 = 0;
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    if (r1 >= r0) { $pc4 = 5; continue $sw4; }
                    r2 = abcd.tt.j6(r5, r1, this);
                    this.j6.add(r2);
                    r1 = r1 + 1;
                    { $pc4 = 3; continue $sw4; }
                }
                case 5: {
                    r6 = r5.j6().Hw(r5.DW());
                    this.DW = this.j6.get(r6).QX().DW();
                    this.FH = -1;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static abcd.Abstractvt[] j6(abcd.yt r0) {
        return r0.tp;
    }

    public int DW(int r3) {
        int r0 = this.v5;
        int r1 = this.Zo;
        int r2 = r0 + r1;
        this.Zo = r1 + r3;
        this.Hw = java.lang.Math.max(this.Hw, r3 + r2);
        return r2;
    }

    public java.util.ArrayList<abcd.tt> DW() {
        return this.j6;
    }

    void DW(abcd.Abstractvt r3) {
        abcd.bs r4 = null;
        abcd.Abstractvt[] r0 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (this.EQ == null) { $pc5 = 5; continue $sw5; }
                    DW(r3, r3.tp());
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    r4 = r3.u7();
                    r0 = this.tp;
                    if (r0 == null) { $pc5 = 10; continue $sw5; }
                    if (r4 == null) { $pc5 = 11; continue $sw5; }
                    r0[r4.we()] = null;
                    return;
                }
                case 11: {
                    return;
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void EQ() {
        int r1 = 0;
        int r2 = 0;
        abcd.tt r0 = null;
        java.util.Iterator<abcd.tt> r3 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (this.FH >= 0) { $pc6 = 13; continue $sw6; }
                    this.FH = this.j6.size();
                    r1 = this.FH;
                    r2 = this.VH;
                    this.VH = r2 + 1;
                    r0 = new abcd.tt(r1, r2, this);
                    this.j6.add(r0);
                    r3 = this.j6.iterator();
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    if (r3.hasNext() == false) { $pc6 = 9; continue $sw6; }
                    r3.next().FH(r0);
                    { $pc6 = 6; continue $sw6; }
                }
                case 9: {
                    if (r0.VH().cardinality() != 0) { $pc6 = 16; continue $sw6; }
                    this.j6.remove(this.FH);
                    this.FH = -1;
                    this.VH--;
                    return;
                }
                case 16: {
                    return;
                }
                case 13: {
                    throw new java.lang.RuntimeException("must be called at most once");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int FH() {
        java.util.Iterator<abcd.tt> r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = this.j6.iterator();
                    r1 = 0;
                    $pc7 = 4; continue $sw7;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc7 = 8; continue $sw7; }
                    if (r0.next().aM() == false) { $pc7 = 4; continue $sw7; }
                    r1 = r1 + 1;
                    { $pc7 = 4; continue $sw7; }
                }
                case 8: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Abstractvt FH(int r2) {
        abcd.Abstractvt[] r0 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (this.J0 == true) { $pc8 = 11; continue $sw8; }
                    r0 = this.tp;
                    if (r0 != null) { $pc8 = 7; continue $sw8; }
                    this.tp = new abcd.Abstractvt[u7()];
                    j6(new abcd.wt(this));
                    return this.tp[r2];
                }
                case 7: {
                    return r0[r2];
                }
                case 11: {
                    throw new java.lang.RuntimeException("No def list in back mode");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.tt Hw() {
        return this.j6.get(this.DW);
    }

    public java.util.List<abcd.Abstractvt> Hw(int r2) {
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (this.we != null) { $pc9 = 6; continue $sw9; }
                    XL();
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    return this.we[r2];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int J0() {
        int r0 = this.Hw;
        this.Hw = r0 + 1;
        this.v5 = this.Hw;
        J8();
        return r0;
    }

    public void J8() {
        this.tp = null;
        this.EQ = null;
        this.we = null;
    }

    public void QX() {
        this.J0 = true;
        this.EQ = null;
        this.tp = null;
    }

    public int VH() {
        return this.FH;
    }

    public void Ws() {
        this.Zo = 0;
    }

    public abcd.tt Zo() {
        int r0 = 0;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = this.FH;
                    if (r0 >= 0) { $pc10 = 6; continue $sw10; }
                    return null;
                }
                case 6: {
                    return this.j6.get(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int gn() {
        return this.gn;
    }

    public int j6(int r2) {
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    if (r2 >= 0) { $pc11 = 6; continue $sw11; }
                    return -1;
                }
                case 6: {
                    return this.j6.get(r2).EQ();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        java.util.Iterator<abcd.tt> r0 = null;
        java.util.ArrayList r1 = null;
        abcd.tt r2 = null;
        java.util.BitSet r3 = null;
        int r4 = 0;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r0 = this.j6.iterator();
                    $pc12 = 4; continue $sw12;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc12 = 6; continue $sw12; }
                    r0.next().v5(0);
                    { $pc12 = 4; continue $sw12; }
                }
                case 6: {
                    r1 = new java.util.ArrayList();
                    r1.add(Hw());
                    $pc12 = 8; continue $sw12;
                }
                case 8: {
                    if (r1.isEmpty() == true) { $pc12 = 15; continue $sw12; }
                    r2 = (abcd.tt) r1.remove(0);
                    if (r2.aM() == true) { $pc12 = 8; continue $sw12; }
                    r2.v5(1);
                    r3 = r2.Ws();
                    r4 = r3.nextSetBit(0);
                    $pc12 = 13; continue $sw12;
                }
                case 13: {
                    if (r4 < 0) { $pc12 = 8; continue $sw12; }
                    r1.add(this.j6.get(r4));
                    r4 = r3.nextSetBit(r4 + 1);
                    { $pc12 = 13; continue $sw12; }
                }
                case 15: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.Abstractqt r4) {
        java.util.Iterator<abcd.tt> r0 = null;
        java.util.Iterator<abcd.Abstractvt> r1 = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    r0 = DW().iterator();
                    $pc13 = 4; continue $sw13;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc13 = 9; continue $sw13; }
                    r1 = r0.next().FH().iterator();
                    $pc13 = 7; continue $sw13;
                }
                case 7: {
                    if (r1.hasNext() == false) { $pc13 = 4; continue $sw13; }
                    r1.next().j6(r4);
                    { $pc13 = 7; continue $sw13; }
                }
                case 9: {
                    this.Hw = r4.j6();
                    this.v5 = this.Hw;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.tt.b r7) {
        java.util.BitSet r0 = null;
        java.util.Stack r1 = null;
        abcd.tt r2 = null;
        java.util.ArrayList<abcd.tt> r3 = null;
        int r4 = 0;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r0 = new java.util.BitSet(DW().size());
                    r1 = new java.util.Stack();
                    r1.add(Hw());
                    $pc14 = 4; continue $sw14;
                }
                case 4: {
                    if (r1.size() <= 0) { $pc14 = 11; continue $sw14; }
                    r2 = (abcd.tt) r1.pop();
                    r3 = r2.j6();
                    if (r0.get(r2.DW()) == true) { $pc14 = 4; continue $sw14; }
                    r4 = r3.size() - 1;
                    $pc14 = 8; continue $sw14;
                }
                case 8: {
                    if (r4 < 0) { $pc14 = 10; continue $sw14; }
                    r1.add(r3.get(r4));
                    r4 = r4 - 1;
                    { $pc14 = 8; continue $sw14; }
                }
                case 10: {
                    r0.set(r2.DW());
                    r7.j6(r2, null);
                    { $pc14 = 4; continue $sw14; }
                }
                case 11: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.Abstractvt.a r3) {
        java.util.Iterator<abcd.tt> r0 = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    r0 = this.j6.iterator();
                    $pc15 = 4; continue $sw15;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc15 = 6; continue $sw15; }
                    r0.next().j6(r3);
                    { $pc15 = 4; continue $sw15; }
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(abcd.Abstractvt r2) {
        j6(r2, null);
        j6(r2, null);
    }

    void j6(abcd.Abstractvt r3, abcd.bs r4) {
        int r5 = 0;
        abcd.bs r6 = null;
        int r0 = 0;
        abcd.Abstractvt[] r1 = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    if (this.tp != null) { $pc16 = 5; continue $sw16; }
                    return;
                }
                case 5: {
                    if (r4 == null) { $pc16 = 7; continue $sw16; }
                    r5 = r4.we();
                    this.tp[r5] = null;
                    $pc16 = 7; continue $sw16;
                }
                case 7: {
                    r6 = r3.u7();
                    if (r6 == null) { $pc16 = 14; continue $sw16; }
                    r0 = r6.we();
                    r1 = this.tp;
                    if (r1[r0] != null) { $pc16 = 13; continue $sw16; }
                    r1[r6.we()] = r3;
                    return;
                }
                case 13: {
                    throw new java.lang.RuntimeException("Duplicate add of insn");
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(abcd.Abstractvt r2, abcd.bs r3, abcd.bs r4) {
        int r5 = 0;
        int r6 = 0;
        java.util.ArrayList<abcd.Abstractvt>[] r7 = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    if (this.EQ != null) { $pc17 = 5; continue $sw17; }
                    return;
                }
                case 5: {
                    if (r3 == null) { $pc17 = 7; continue $sw17; }
                    r5 = r3.we();
                    this.EQ[r5].remove(r2);
                    $pc17 = 7; continue $sw17;
                }
                case 7: {
                    r6 = r4.we();
                    r7 = this.EQ;
                    if (r7.length > r6) { $pc17 = 11; continue $sw17; }
                    this.EQ = null;
                    return;
                }
                case 11: {
                    r7[r6].add(r2);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(abcd.Abstractvt r5, abcd.cs r6) {
        abcd.cs r7 = null;
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    if (this.EQ != null) { $pc18 = 5; continue $sw18; }
                    return;
                }
                case 5: {
                    if (r6 == null) { $pc18 = 7; continue $sw18; }
                    DW(r5, r6);
                    $pc18 = 7; continue $sw18;
                }
                case 7: {
                    r7 = r5.tp();
                    r0 = r7.size();
                    r1 = 0;
                    $pc18 = 8; continue $sw18;
                }
                case 8: {
                    if (r1 >= r0) { $pc18 = 10; continue $sw18; }
                    r2 = r7.get(r1).we();
                    this.EQ[r2].add(r5);
                    r1 = r1 + 1;
                    { $pc18 = 8; continue $sw18; }
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.util.Set<abcd.Abstractvt> r9) {
        java.util.Iterator<abcd.tt> r0 = null;
        abcd.tt r1 = null;
        java.util.ArrayList<abcd.Abstractvt> r2 = null;
        int r3 = 0;
        abcd.Abstractvt r5 = null;
        int r4 = 0;
        abcd.Abstractvt r6 = null;
        java.util.BitSet r7 = null;
        int r8 = 0;
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    r0 = DW().iterator();
                    $pc19 = 4; continue $sw19;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc19 = 28; continue $sw19; }
                    r1 = r0.next();
                    r2 = r1.FH();
                    r3 = r2.size() - 1;
                    $pc19 = 6; continue $sw19;
                }
                case 6: {
                    if (r3 < 0) { $pc19 = 11; continue $sw19; }
                    r5 = r2.get(r3);
                    if (r9.contains(r5) == false) { $pc19 = 10; continue $sw19; }
                    DW(r5);
                    r2.remove(r3);
                    $pc19 = 10; continue $sw19;
                }
                case 10: {
                    r3 = r3 - 1;
                    { $pc19 = 6; continue $sw19; }
                }
                case 11: {
                    r4 = r2.size();
                    if (r4 != 0) { $pc19 = 14; continue $sw19; }
                    r6 = null;
                    $pc19 = 16; continue $sw19;
                }
                case 16: {
                    if (r1 == Zo()) { $pc19 = 4; continue $sw19; }
                    if (r4 == 0) { $pc19 = 22; continue $sw19; }
                    if (r6.gn() == null) { $pc19 = 22; continue $sw19; }
                    if (r6.gn().v5().DW() != 1) { $pc19 = 4; continue $sw19; }
                    $pc19 = 22; continue $sw19;
                }
                case 22: {
                    r2.add(abcd.Abstractvt.j6(new abcd.Zr(abcd.gs.j3, abcd.hs.j6, null, abcd.cs.FH), r1));
                    r7 = r1.Ws();
                    r8 = r7.nextSetBit(0);
                    $pc19 = 23; continue $sw19;
                }
                case 23: {
                    if (r8 < 0) { $pc19 = 4; continue $sw19; }
                    if (r8 == r1.u7()) { $pc19 = 27; continue $sw19; }
                    r1.Hw(r8);
                    $pc19 = 27; continue $sw19;
                }
                case 27: {
                    r8 = r7.nextSetBit(r8 + 1);
                    { $pc19 = 23; continue $sw19; }
                }
                case 14: {
                    r6 = r2.get(r4 - 1);
                    { $pc19 = 16; continue $sw19; }
                }
                case 28: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(boolean r8, abcd.tt.b r9) {
        java.util.BitSet r0 = null;
        java.util.Stack r1 = null;
        abcd.tt r2 = null;
        abcd.tt r3 = null;
        abcd.tt r4 = null;
        java.util.BitSet r5 = null;
        int r6 = 0;
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    r0 = new java.util.BitSet(this.j6.size());
                    r1 = new java.util.Stack();
                    if (r8 == false) { $pc20 = 5; continue $sw20; }
                    r2 = Zo();
                    $pc20 = 6; continue $sw20;
                }
                case 6: {
                    if (r2 != null) { $pc20 = 8; continue $sw20; }
                    return;
                }
                case 8: {
                    r1.add(null);
                    r1.add(r2);
                    $pc20 = 10; continue $sw20;
                }
                case 10: {
                    if (r1.size() <= 0) { $pc20 = 20; continue $sw20; }
                    r3 = (abcd.tt) r1.pop();
                    r4 = (abcd.tt) r1.pop();
                    if (r0.get(r3.DW()) == true) { $pc20 = 10; continue $sw20; }
                    if (r8 == false) { $pc20 = 15; continue $sw20; }
                    r5 = r3.VH();
                    $pc20 = 16; continue $sw20;
                }
                case 16: {
                    r6 = r5.nextSetBit(0);
                    $pc20 = 17; continue $sw20;
                }
                case 17: {
                    if (r6 < 0) { $pc20 = 19; continue $sw20; }
                    r1.add(r3);
                    r1.add(this.j6.get(r6));
                    r6 = r5.nextSetBit(r6 + 1);
                    { $pc20 = 17; continue $sw20; }
                }
                case 19: {
                    r0.set(r3.DW());
                    r9.j6(r3, r4);
                    { $pc20 = 10; continue $sw20; }
                }
                case 15: {
                    r5 = r3.Ws();
                    { $pc20 = 16; continue $sw20; }
                }
                case 20: {
                    return;
                }
                case 5: {
                    r2 = Hw();
                    { $pc20 = 6; continue $sw20; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(abcd.bs r5) {
        abcd.Abstractvt r0 = null;
        java.util.Iterator<abcd.Abstractvt> r6 = null;
        abcd.Tr r1 = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    r0 = FH(r5.we());
                    if (r0 != null) { $pc21 = 6; continue $sw21; }
                    return false;
                }
                case 6: {
                    if (r0.FH() == null) { $pc21 = 8; continue $sw21; }
                    return true;
                }
                case 8: {
                    r6 = Hw(r5.we()).iterator();
                    $pc21 = 10; continue $sw21;
                }
                case 10: {
                    if (r6.hasNext() == false) { $pc21 = 16; continue $sw21; }
                    r1 = r6.next().gn();
                    if (r1 == null) { $pc21 = 10; continue $sw21; }
                    if (r1.v5().Hw() != 54) { $pc21 = 10; continue $sw21; }
                    return true;
                }
                case 16: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.ArrayList<abcd.Abstractvt>[] tp() {
        java.util.ArrayList<abcd.Abstractvt>[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex22 = null;
        int $pc22 = -1;
        $sw22: while (true) {
            switch ($pc22) {
                case -1: {
                    if (this.EQ != null) { $pc22 = 5; continue $sw22; }
                    XL();
                    $pc22 = 5; continue $sw22;
                }
                case 5: {
                    r0 = new java.util.ArrayList[this.Hw];
                    r1 = 0;
                    $pc22 = 7; continue $sw22;
                }
                case 7: {
                    if (r1 >= this.Hw) { $pc22 = 9; continue $sw22; }
                    r0[r1] = new java.util.ArrayList(this.EQ[r1]);
                    r1 = r1 + 1;
                    { $pc22 = 7; continue $sw22; }
                }
                case 9: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int u7() {
        return this.Hw;
    }

    public int v5() {
        return this.DW;
    }

    void v5(int r1) {
        this.Hw = r1;
        this.v5 = this.Hw;
        J8();
    }

    public abcd.tt we() {
        int r0 = this.j6.size();
        int r2 = this.VH;
        this.VH = r2 + 1;
        abcd.tt r1 = new abcd.tt(r0, r2, this);
        r1.FH().add(j6(r1));
        this.j6.add(r1);
        return r1;
    }
}
