package abcd;

public final class ho {
    private final int DW;
    private java.util.ArrayList<abcd.AbstractVn> FH;
    private boolean Hw;
    private int Zo;
    private final abcd.Fn j6;
    private boolean v5;

    public ho(abcd.Fn r1, int r2, int r3) {
        this.j6 = r1;
        this.DW = r3;
        this.FH = new java.util.ArrayList(r2);
        this.Zo = -1;
        this.Hw = false;
        this.v5 = false;
    }

    private abcd.Xn DW(abcd.AbstractVn r4) {
        abcd.Xn r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = j6(r4.Hw(), r4.Zo());
                    if (r0 == null) { $pc0 = 6; continue $sw0; }
                    return r0;
                }
                case 6: {
                    throw new abcd.Ut("No expanded opcode for " + r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW(abcd.Xn[] r6) {
        int r0 = 0;
        int r1 = 0;
        abcd.AbstractVn r2 = null;
        abcd.Xn r3 = null;
        abcd.Xn r4 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.Zo != 0) { $pc1 = 10; continue $sw1; }
                    r0 = this.FH.size();
                    r1 = 0;
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    if (r1 >= r0) { $pc1 = 15; continue $sw1; }
                    r2 = this.FH.get(r1);
                    r3 = r2.Zo();
                    r4 = r6[r1];
                    if (r3 == r4) { $pc1 = 9; continue $sw1; }
                    this.FH.set(r1, r2.j6(r4));
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    r1 = r1 + 1;
                    { $pc1 = 5; continue $sw1; }
                }
                case 15: {
                    return;
                }
                case 10: {
                    this.FH = FH(r6);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.util.ArrayList<abcd.AbstractVn> FH(abcd.Xn[] r10) {
        int r0 = 0;
        java.util.ArrayList<abcd.AbstractVn> r1 = null;
        int r2 = 0;
        abcd.AbstractVn r3 = null;
        abcd.Xn r4 = null;
        abcd.Xn r5 = null;
        abcd.AbstractVn r6 = null;
        abcd.AbstractVn r8 = null;
        java.util.BitSet r7 = null;
        abcd.AbstractVn r9 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.FH.size();
                    r1 = new java.util.ArrayList(r0 * 2);
                    r2 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    if (r2 >= r0) { $pc2 = 16; continue $sw2; }
                    r3 = this.FH.get(r2);
                    r4 = r3.Zo();
                    r5 = r10[r2];
                    r6 = null;
                    if (r5 == null) { $pc2 = 7; continue $sw2; }
                    r8 = null;
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    if (r6 == null) { $pc2 = 10; continue $sw2; }
                    r1.add(r6);
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    if (r5 == r4) { $pc2 = 12; continue $sw2; }
                    r3 = r3.j6(r5);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    r1.add(r3);
                    if (r8 == null) { $pc2 = 15; continue $sw2; }
                    r1.add(r8);
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    r2 = r2 + 1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 7: {
                    r5 = DW(r3);
                    r7 = r5.DW().FH(r3);
                    r9 = r3.j6(r7);
                    r8 = r3.DW(r7);
                    r3 = r3.FH(r7);
                    r6 = r9;
                    { $pc2 = 8; continue $sw2; }
                }
                case 16: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean FH(abcd.AbstractVn r5) {
        abcd.ds r6 = null;
        int r0 = 0;
        int r3 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if ((r5 instanceof abcd.Cdo) == false) { $pc3 = 11; continue $sw3; }
                    r6 = ((abcd.Cdo) r5).we();
                    r0 = r6.size();
                    r3 = 0;
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    if (r3 >= r0) { $pc3 = 15; continue $sw3; }
                    if (j6(r6.get(r3)) == true) { $pc3 = 8; continue $sw3; }
                    r3 = r3 + 1;
                    { $pc3 = 5; continue $sw3; }
                }
                case 8: {
                    return true;
                }
                case 15: {
                    return false;
                }
                case 11: {
                    if ((r5 instanceof abcd.eo) == false) { $pc3 = 15; continue $sw3; }
                    if (j6(((abcd.eo) r5).we()) == false) { $pc3 = 15; continue $sw3; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Hw(abcd.AbstractVn r3) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (this.Hw == true) { $pc4 = 8; continue $sw4; }
                    if (r3.VH().j6() < 0) { $pc4 = 8; continue $sw4; }
                    this.Hw = true;
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    if (this.v5 == false) { $pc4 = 10; continue $sw4; }
                    return;
                }
                case 10: {
                    if (FH(r3) == false) { $pc4 = 14; continue $sw4; }
                    this.v5 = true;
                    return;
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Hw(abcd.Xn[] r8) {
        int r0 = 0;
        int r2 = 0;
        int r1 = 0;
        int r3 = 0;
        int r4 = 0;
        abcd.AbstractVn r5 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.Zo;
                    if (r0 >= 0) { $pc5 = 5; continue $sw5; }
                    r0 = 0;
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    r2 = j6(r8);
                    if (r0 >= r2) { $pc5 = 7; continue $sw5; }
                    r1 = r2 - r0;
                    r3 = this.FH.size();
                    r4 = 0;
                    $pc5 = 10; continue $sw5;
                }
                case 10: {
                    if (r4 >= r3) { $pc5 = 15; continue $sw5; }
                    r5 = this.FH.get(r4);
                    if ((r5 instanceof abcd.Sn) == true) { $pc5 = 14; continue $sw5; }
                    this.FH.set(r4, r5.DW(r1));
                    $pc5 = 14; continue $sw5;
                }
                case 14: {
                    r4 = r4 + 1;
                    { $pc5 = 10; continue $sw5; }
                }
                case 15: {
                    r0 = r2;
                    { $pc5 = 5; continue $sw5; }
                }
                case 7: {
                    this.Zo = r0;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean VH() {
        int r0 = 0;
        int r1 = 0;
        boolean r2 = false;
        abcd.AbstractVn r3 = null;
        abcd.Xn r4 = null;
        abcd.po r6 = null;
        abcd.Xn r5 = null;
        int r7 = 0;
        abcd.Sn r8 = null;
        abcd.po r9 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = this.FH.size();
                    r1 = 0;
                    r2 = false;
                    $pc6 = 3; continue $sw6;
                }
                case 3: {
                    if (r1 >= r0) { $pc6 = 25; continue $sw6; }
                    r3 = this.FH.get(r1);
                    if ((r3 instanceof abcd.po) == false) { $pc6 = 20; continue $sw6; }
                    r4 = r3.Zo();
                    r6 = (abcd.po) r3;
                    if (r4.DW().j6(r6) == true) { $pc6 = 20; continue $sw6; }
                    if (r4.j6() != 40) { $pc6 = 26; continue $sw6; }
                    r5 = j6(r3, r4);
                    if (r5 == null) { $pc6 = 16; continue $sw6; }
                    this.FH.set(r1, r3.j6(r5));
                    $pc6 = 19; continue $sw6;
                }
                case 19: {
                    r2 = true;
                    { $pc6 = 20; continue $sw6; }
                }
                case 16: {
                    throw new java.lang.UnsupportedOperationException("method too long");
                }
                case 26: {
                    try {
                        r7 = r1 + 1;
                        r8 = (abcd.Sn) this.FH.get(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.ClassCastException) { $pc6 = 21; continue $sw6; }
                        if ($t instanceof java.lang.IndexOutOfBoundsException) { $pc6 = 23; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r9 = new abcd.po(abcd.C0465Yn.vJ, r6.VH(), abcd.cs.FH, r6.we());
                    this.FH.set(r1, r9);
                    this.FH.add(r1, r6.j6(r8));
                    r0 = r0 + 1;
                    r1 = r7;
                    { $pc6 = 19; continue $sw6; }
                }
                case 22: {
                    throw new java.lang.IllegalStateException("unpaired TargetInsn");
                }
                case 24: {
                    throw new java.lang.IllegalStateException("unpaired TargetInsn (dangling)");
                }
                case 20: {
                    r1 = r1 + 1;
                    { $pc6 = 3; continue $sw6; }
                }
                case 25: {
                    return r2;
                }
                case 21: {
                    $pc6 = 23; continue $sw6;
                }
                case 23: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Zo() {
        java.lang.Throwable $ex7 = null;
        int $pc7 = 2;
        $sw7: while (true) {
            switch ($pc7) {
                case 2: {
                    v5();
                    if (VH() == true) { $pc7 = 2; continue $sw7; }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.Xn[] gn() {
        int r0 = 0;
        abcd.Xn[] r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = this.FH.size();
                    r1 = new abcd.Xn[r0];
                    r2 = 0;
                    $pc8 = 3; continue $sw8;
                }
                case 3: {
                    if (r2 >= r0) { $pc8 = 5; continue $sw8; }
                    r1[r2] = this.FH.get(r2).Zo();
                    r2 = r2 + 1;
                    { $pc8 = 3; continue $sw8; }
                }
                case 5: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int j6(abcd.Xn[] r7) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        abcd.AbstractVn r3 = null;
        abcd.Xn r4 = null;
        abcd.Xn r5 = null;
        int r6 = 0;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = this.FH.size();
                    r1 = this.Zo;
                    r2 = 0;
                    $pc9 = 3; continue $sw9;
                }
                case 3: {
                    if (r2 >= r0) { $pc9 = 13; continue $sw9; }
                    r3 = this.FH.get(r2);
                    r4 = r7[r2];
                    r5 = j6(r3, r4);
                    if (r5 != null) { $pc9 = 9; continue $sw9; }
                    r6 = r3.Hw(DW(r3).DW().FH(r3));
                    if (r6 <= r1) { $pc9 = 11; continue $sw9; }
                    r1 = r6;
                    $pc9 = 11; continue $sw9;
                }
                case 11: {
                    r7[r2] = r5;
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    r2 = r2 + 1;
                    { $pc9 = 3; continue $sw9; }
                }
                case 9: {
                    if (r4 != r5) { $pc9 = 11; continue $sw9; }
                    $pc9 = 13; continue $sw9;
                }
                case 13: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.Xn j6(abcd.AbstractVn r2, abcd.Xn r3) {
        java.lang.Throwable $ex10 = null;
        int $pc10 = 2;
        $sw10: while (true) {
            switch ($pc10) {
                case 2: {
                    if (r3 == null) { $pc10 = 7; continue $sw10; }
                    if (r3.DW().VH(r2) == true) { $pc10 = 7; continue $sw10; }
                    r3 = abcd.C0465Yn.j6(r3, this.j6);
                    $pc10 = 7; continue $sw10;
                }
                case 7: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(abcd.Tn r2, abcd.Un.a r3) {
        abcd.Abstractms r0 = null;
        int r1 = 0;
        int r4 = 0;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = r2.we();
                    r1 = r3.j6(r0);
                    if (r1 < 0) { $pc11 = 6; continue $sw11; }
                    r2.Hw(r1);
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    if ((r0 instanceof abcd.Fs) == false) { $pc11 = 11; continue $sw11; }
                    r4 = r3.j6(((abcd.Fs) r0).VH());
                    if (r4 < 0) { $pc11 = 12; continue $sw11; }
                    r2.FH(r4);
                    return;
                }
                case 12: {
                    return;
                }
                case 11: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(java.util.HashSet<abcd.Abstractms> r3, abcd.AbstractVn r4) {
        abcd.ds r5 = null;
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if ((r4 instanceof abcd.Tn) == false) { $pc12 = 6; continue $sw12; }
                    r3.add(((abcd.Tn) r4).we());
                    return;
                }
                case 6: {
                    if ((r4 instanceof abcd.Cdo) == false) { $pc12 = 11; continue $sw12; }
                    r5 = ((abcd.Cdo) r4).we();
                    r0 = r5.size();
                    r1 = 0;
                    $pc12 = 8; continue $sw12;
                }
                case 8: {
                    if (r1 >= r0) { $pc12 = 17; continue $sw12; }
                    j6(r3, r5.get(r1));
                    r1 = r1 + 1;
                    { $pc12 = 8; continue $sw12; }
                }
                case 17: {
                    return;
                }
                case 11: {
                    if ((r4 instanceof abcd.eo) == false) { $pc12 = 16; continue $sw12; }
                    j6(r3, ((abcd.eo) r4).we());
                    return;
                }
                case 16: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(java.util.HashSet<abcd.Abstractms> r3, abcd.bs r4) {
        abcd.Vr r0 = null;
        abcd.Js r1 = null;
        abcd.Js r2 = null;
        abcd.Qs r5 = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    if (r4 != null) { $pc13 = 4; continue $sw13; }
                    return;
                }
                case 4: {
                    r0 = r4.Zo();
                    r1 = r0.Hw();
                    r2 = r0.Zo();
                    r5 = r4.getType();
                    if (r5 == abcd.Qs.EQ) { $pc13 = 7; continue $sw13; }
                    r3.add(abcd.Ks.DW(r5));
                    $pc13 = 7; continue $sw13;
                }
                case 7: {
                    if (r1 == null) { $pc13 = 9; continue $sw13; }
                    r3.add(r1);
                    $pc13 = 9; continue $sw13;
                }
                case 9: {
                    if (r2 == null) { $pc13 = 12; continue $sw13; }
                    r3.add(r2);
                    return;
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean j6(abcd.bs r0) {
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    if (r0 != null) { $pc14 = 4; continue $sw14; }
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    return false;
                }
                case 4: {
                    if (r0.Zo().Hw() == null) { $pc14 = 6; continue $sw14; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void v5() {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        abcd.AbstractVn r3 = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    r0 = this.FH.size();
                    r1 = 0;
                    r2 = 0;
                    $pc15 = 3; continue $sw15;
                }
                case 3: {
                    if (r1 >= r0) { $pc15 = 5; continue $sw15; }
                    r3 = this.FH.get(r1);
                    r3.j6(r2);
                    r2 = r2 + r3.DW();
                    r1 = r1 + 1;
                    { $pc15 = 3; continue $sw15; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.HashSet<abcd.Abstractms> DW() {
        java.util.HashSet<abcd.Abstractms> r0 = null;
        java.util.Iterator<abcd.AbstractVn> r1 = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    r0 = new java.util.HashSet(20);
                    r1 = this.FH.iterator();
                    $pc16 = 4; continue $sw16;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc16 = 6; continue $sw16; }
                    j6(r0, r1.next());
                    { $pc16 = 4; continue $sw16; }
                }
                case 6: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean FH() {
        return this.v5;
    }

    public boolean Hw() {
        return this.Hw;
    }

    public abcd.Wn j6() {
        abcd.Xn[] r0 = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    if (this.Zo >= 0) { $pc17 = 7; continue $sw17; }
                    r0 = gn();
                    Hw(r0);
                    DW(r0);
                    Zo();
                    return abcd.Wn.j6(this.FH, this.Zo + this.DW);
                }
                case 7: {
                    throw new java.lang.UnsupportedOperationException("already processed");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r3, abcd.Sn r4) {
        int r0 = 0;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    r0 = (this.FH.size() - r3) - 1;
                    this.FH.set(r0, ((abcd.po) this.FH.get(r0)).j6(r4));
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("non-reversible instruction");
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException("too few instructions");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.Un.a r4) {
        java.util.Iterator<abcd.AbstractVn> r0 = null;
        abcd.AbstractVn r1 = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    r0 = this.FH.iterator();
                    $pc19 = 4; continue $sw19;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc19 = 8; continue $sw19; }
                    r1 = r0.next();
                    if ((r1 instanceof abcd.Tn) == false) { $pc19 = 4; continue $sw19; }
                    j6((abcd.Tn) r1, r4);
                    { $pc19 = 4; continue $sw19; }
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.AbstractVn r2) {
        this.FH.add(r2);
        Hw(r2);
    }
}
