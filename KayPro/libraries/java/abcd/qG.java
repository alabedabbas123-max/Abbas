package abcd;

public class qG implements java.lang.Iterable<abcd.dG> {
    final abcd.IE DW;
    private final java.util.EnumSet<abcd.EnumkG> EQ;
    final abcd.uE FH;
    AE<abcd.AbstractiG> Hw;
    private abcd.AbstractjK J0;
    private boolean J8;
    int VH;
    private int Zo;
    final java.util.ArrayList<abcd.dG> gn;
    final abcd.UE j6;
    abcd.XF tp;
    abcd.LF u7;
    private int v5;
    private abcd.AbstractyG we;

    public qG(abcd.IE r2) {
        this(null, r2);
    }

    public qG(abcd.UE r2) {
        this(r2, r2.j3());
    }

    private qG(abcd.UE r2, abcd.IE r3) {
        this.v5 = -64;
        this.VH = 4;
        this.j6 = r2;
        this.DW = r3;
        this.FH = new abcd.uE();
        this.Hw = new abcd.AE();
        this.gn = new java.util.ArrayList();
        this.u7 = new abcd.QF();
        this.tp = new abcd.C1329tG(this);
        this.EQ = java.util.EnumSet.of(abcd.EnumkG.j6);
        this.we = abcd.AbstractyG.j6;
        this.J0 = abcd.AbstractjK.j6;
        this.J8 = true;
    }

    private void J8() {
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.Zo;
                    if (r0 == 0) { $pc0 = 6; continue $sw0; }
                    this.v5 |= r0;
                    this.VH = (r0 ^ (-1)) & this.VH;
                    this.Zo = 0;
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean Ws() {
        return this.tp instanceof abcd.C1329tG;
    }

    private abcd.AbstractiG j6(abcd.YD r4, abcd.FE r5) {
        int r0 = 0;
        abcd.dG r1 = null;
        abcd.AbstractiG r2 = null;
        abcd.mG r3 = null;
        abcd.cG r6 = null;
        abcd.lG r7 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = r5.FH();
                    if (r0 != 1) { $pc1 = 5; continue $sw1; }
                    r1 = j6(r4);
                    r1.j6(this, j6(r1, r5));
                    r2 = r1;
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    this.Hw.j6(r2);
                    return r2;
                }
                case 5: {
                    if (r0 != 2) { $pc1 = 7; continue $sw1; }
                    r3 = new abcd.mG(r4);
                    r3.EQ |= 1;
                    r2 = r3;
                    { $pc1 = 16; continue $sw1; }
                }
                case 7: {
                    if (r0 != 3) { $pc1 = 9; continue $sw1; }
                    r6 = new abcd.cG(r4);
                    r6.EQ |= 1;
                    r2 = r6;
                    { $pc1 = 16; continue $sw1; }
                }
                case 9: {
                    if (r0 != 4) { $pc1 = 12; continue $sw1; }
                    r7 = new abcd.lG(r4);
                    r7.j6(this, j6(r7, r5));
                    r2 = r7;
                    { $pc1 = 16; continue $sw1; }
                }
                case 12: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().badObjectType, new java.lang.Object[]{java.lang.Integer.valueOf(r0)}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static abcd.AbstractiG j6(abcd.qG r0, abcd.YD r1, abcd.FE r2) {
        return r0.j6(r1, r2);
    }

    public abcd.cG DW(abcd.YD r2) {
        abcd.cG r0 = null;
        abcd.cG r1 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = (abcd.cG) this.Hw.DW(r2);
                    if (r0 != null) { $pc2 = 6; continue $sw2; }
                    r1 = new abcd.cG(r2);
                    this.Hw.j6(r1);
                    return r1;
                }
                case 6: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(abcd.dG r3) {
        int r0 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = r3.EQ;
                    if ((r0 & 2) == 0) { $pc3 = 6; continue $sw3; }
                    return;
                }
                case 6: {
                    if ((r0 & 1) != 0) { $pc3 = 8; continue $sw3; }
                    r3.j6(this);
                    $pc3 = 8; continue $sw3;
                }
                case 8: {
                    r3.EQ |= 2;
                    this.gn.add(r3);
                    this.u7.j6(r3);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(abcd.AbstractiG r2) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if ((r2.EQ & 1) != 0) { $pc4 = 6; continue $sw4; }
                    r2.j6(this);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(abcd.EnumkG r2) {
        Hw();
        this.EQ.clear();
        this.EQ.add(r2);
    }

    public void EQ() {
        this.DW.FH();
    }

    int FH() {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.v5;
                    if (r0 == 0) { $pc5 = 7; continue $sw5; }
                    r1 = java.lang.Integer.lowestOneBit(r0);
                    this.v5 &= r1 ^ (-1);
                    return r1;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().flagsAlreadyCreated, new java.lang.Object[]{26}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.dG FH(abcd.YD r2) {
        abcd.dG r0 = null;
        abcd.dG r1 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = (abcd.dG) this.Hw.DW(r2);
                    if (r0 != null) { $pc6 = 6; continue $sw6; }
                    r1 = j6(r2);
                    this.Hw.j6(r1);
                    return r1;
                }
                case 6: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.AbstractiG FH(abcd.AbstractiG r2) {
        java.lang.Throwable $ex7 = null;
        int $pc7 = 3;
        $sw7: while (true) {
            switch ($pc7) {
                case 3: {
                    if ((r2 instanceof abcd.lG) == false) { $pc7 = 4; continue $sw7; }
                    DW(r2);
                    r2 = ((abcd.lG) r2).j3();
                    { $pc7 = 3; continue $sw7; }
                }
                case 4: {
                    DW(r2);
                    return r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH(abcd.dG r2) {
        r2.EQ |= 4;
        j6(r2);
        DW(r2);
    }

    public abcd.AbstractiG Hw(abcd.YD r2) {
        return (abcd.AbstractiG) this.Hw.DW(r2);
    }

    protected void Hw() {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (Ws() == false) { $pc8 = 6; continue $sw8; }
                    return;
                }
                case 6: {
                    throw new java.lang.IllegalStateException(org.eclipse.jgit.JGitText.j6().outputHasAlreadyBeenStarted);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd._F J0() {
        abcd._F r0 = new abcd._F(this.DW);
        r0.Hw = this.Hw;
        r0.v5 = this.v5;
        return r0;
    }

    public abcd.dG VH(abcd.YD r3) {
        abcd.AbstractiG r0 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = FH(Zo(r3));
                    if ((r0 instanceof abcd.dG) == false) { $pc9 = 7; continue $sw9; }
                    return (abcd.dG) r0;
                }
                case 7: {
                    throw new abcd.ZC(r3.J8(), "commit");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.AbstractyG VH() {
        return this.we;
    }

    public abcd.IE Zo() {
        return this.DW;
    }

    public abcd.AbstractiG Zo(abcd.YD r2) {
        abcd.AbstractiG r0 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = (abcd.AbstractiG) this.Hw.DW(r2);
                    if (r0 == null) { $pc10 = 7; continue $sw10; }
                    DW(r0);
                    return r0;
                }
                case 7: {
                    return j6(r2, this.DW.FH(r2));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected void Zo(int r9) {
        int r10 = 0;
        int r0 = 0;
        abcd.UF r1 = null;
        java.util.Iterator<abcd.dG> r2 = null;
        abcd.dG r3 = null;
        int r4 = 0;
        abcd.dG r5 = null;
        abcd.dG[] r6 = null;
        int r7 = 0;
        int r8 = 0;
        abcd.dG r11 = null;
        int r12 = 0;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    J8();
                    r10 = r9 | 1;
                    r0 = r10 ^ (-1);
                    r1 = new abcd.UF();
                    r2 = this.gn.iterator();
                    $pc11 = 4; continue $sw11;
                }
                case 4: {
                    if (r2.hasNext() == false) { $pc11 = 5; continue $sw11; }
                    r3 = r2.next();
                    r4 = r3.EQ;
                    if ((r4 & r0) == 0) { $pc11 = 4; continue $sw11; }
                    r3.EQ = r4 & r10;
                    r3.gW();
                    r1.j6(r3);
                    $pc11 = 5; continue $sw11;
                }
                case 5: {
                    r5 = r1.j6();
                    if (r5 == null) { $pc11 = 7; continue $sw11; }
                    r6 = r5.J8;
                    if (r6 == null) { $pc11 = 5; continue $sw11; }
                    r7 = r6.length;
                    r8 = 0;
                    $pc11 = 13; continue $sw11;
                }
                case 13: {
                    if (r8 >= r7) { $pc11 = 5; continue $sw11; }
                    r11 = r6[r8];
                    r12 = r11.EQ;
                    if ((r12 & r0) == 0) { $pc11 = 19; continue $sw11; }
                    r11.EQ = r12 & r10;
                    r11.gW();
                    r1.j6(r11);
                    $pc11 = 19; continue $sw11;
                }
                case 19: {
                    r8 = r8 + 1;
                    { $pc11 = 13; continue $sw11; }
                }
                case 7: {
                    this.gn.clear();
                    this.u7 = new abcd.QF();
                    this.tp = new abcd.C1329tG(this);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.AbstractjK gn() {
        return this.J0;
    }

    public abcd.mG gn(abcd.YD r3) {
        abcd.AbstractiG r0 = null;
        abcd.mG r4 = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r0 = FH(Zo(r3));
                    if ((r0 instanceof abcd.dG) == false) { $pc12 = 6; continue $sw12; }
                    r4 = ((abcd.dG) r0).yS();
                    $pc12 = 8; continue $sw12;
                }
                case 8: {
                    DW(r4);
                    return r4;
                }
                case 6: {
                    if ((r0 instanceof abcd.mG) == false) { $pc12 = 11; continue $sw12; }
                    r4 = (abcd.mG) r0;
                    { $pc12 = 8; continue $sw12; }
                }
                case 11: {
                    throw new abcd.ZC(r3.J8(), "tree");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.util.Iterator<abcd.dG> iterator() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 4;
        $sw13: while (true) {
            switch ($pc13) {
                case 4: {
                    return new abcd.pG(this, tp());
                }
                case 8: {
                    e = $ex13;
                    throw new abcd.qD(e);
                }
                case 11: {
                    e = $ex13;
                    throw new abcd.qD(e);
                }
                case 5: {
                    e = $ex13;
                    throw new abcd.qD(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public <T extends abcd.yE> abcd.MF j6(java.lang.Iterable<T> r6, boolean r7) {
        java.util.ArrayList r0 = null;
        java.util.ArrayList r1 = null;
        java.util.Iterator<T> r8 = null;
        T r2 = null;
        abcd.AbstractiG r3 = null;
        java.util.Iterator r9 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    r0 = new java.util.ArrayList();
                    r1 = new java.util.ArrayList();
                    r8 = r6.iterator();
                    $pc14 = 4; continue $sw14;
                }
                case 4: {
                    if (r8.hasNext() == false) { $pc14 = 5; continue $sw14; }
                    r2 = r8.next();
                    r3 = (abcd.AbstractiG) this.Hw.DW(r2);
                    if (r3 == null) { $pc14 = 16; continue $sw14; }
                    if ((r3.EQ & 1) == 0) { $pc14 = 16; continue $sw14; }
                    r1.add(r3);
                    $pc14 = 16; continue $sw14;
                }
                case 16: {
                    r0.add(r2);
                    { $pc14 = 4; continue $sw14; }
                }
                case 5: {
                    r9 = r1.iterator();
                    if (r0.isEmpty() == false) { $pc14 = 10; continue $sw14; }
                    return new abcd.nG(this, r9);
                }
                case 10: {
                    return new abcd.C1116oG(this, r9, this.DW.DW(r0, r7));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abcd.dG j6(abcd.YD r2) {
        return new abcd.dG(r2);
    }

    public abcd.fG j6(java.lang.String r3) {
        return new abcd.fG(this, r3, FH());
    }

    public abcd.AbstractiG j6(abcd.YD r4, int r5) {
        abcd.AbstractiG r0 = null;
        abcd.AbstractiG r6 = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    r0 = (abcd.AbstractiG) this.Hw.DW(r4);
                    if (r0 == null) { $pc15 = 5; continue $sw15; }
                    $pc15 = 20; continue $sw15;
                }
                case 20: {
                    return r0;
                }
                case 5: {
                    if (r5 != 1) { $pc15 = 7; continue $sw15; }
                    r0 = j6(r4);
                    $pc15 = 19; continue $sw15;
                }
                case 19: {
                    this.Hw.j6(r0);
                    { $pc15 = 20; continue $sw15; }
                }
                case 7: {
                    if (r5 != 2) { $pc15 = 9; continue $sw15; }
                    r6 = new abcd.mG(r4);
                    $pc15 = 17; continue $sw15;
                }
                case 17: {
                    r0 = r6;
                    { $pc15 = 19; continue $sw15; }
                }
                case 9: {
                    if (r5 != 3) { $pc15 = 11; continue $sw15; }
                    r6 = new abcd.cG(r4);
                    { $pc15 = 17; continue $sw15; }
                }
                case 11: {
                    if (r5 != 4) { $pc15 = 14; continue $sw15; }
                    r6 = new abcd.lG(r4);
                    { $pc15 = 17; continue $sw15; }
                }
                case 14: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().invalidGitType, new java.lang.Object[]{java.lang.Integer.valueOf(r5)}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(abcd.dG r3) {
        int r0 = 0;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    r0 = r3.EQ & this.VH;
                    if (r0 == 0) { $pc16 = 6; continue $sw16; }
                    abcd.dG.j6(r3, r0);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.fG r5) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    r0 = this.v5;
                    r1 = r5.Hw;
                    if ((r0 & r1) != 0) { $pc17 = 11; continue $sw17; }
                    if (r5.DW != this) { $pc17 = 9; continue $sw17; }
                    this.VH |= r1;
                    return;
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().flagNotFromThis, new java.lang.Object[]{r5.FH}));
                }
                case 11: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().flagIsDisposed, new java.lang.Object[]{r5.FH}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final void j6(abcd.hG r1) {
        Zo(r1.j6);
    }

    public void j6(abcd.AbstractjK r1) {
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    Hw();
                    if (r1 != null) { $pc18 = 6; continue $sw18; }
                    r1 = abcd.AbstractjK.j6;
                    $pc18 = 6; continue $sw18;
                }
                case 6: {
                    this.J0 = r1;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.EnumkG r1, boolean r2) {
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    Hw();
                    if (r2 == false) { $pc19 = 5; continue $sw19; }
                    this.EQ.add(r1);
                    $pc19 = 7; continue $sw19;
                }
                case 7: {
                    if (this.EQ.size() <= 1) { $pc19 = 10; continue $sw19; }
                    this.EQ.remove(abcd.EnumkG.j6);
                    return;
                }
                case 10: {
                    if (this.EQ.size() != 0) { $pc19 = 14; continue $sw19; }
                    this.EQ.add(abcd.EnumkG.j6);
                    return;
                }
                case 14: {
                    return;
                }
                case 5: {
                    this.EQ.remove(r1);
                    { $pc19 = 7; continue $sw19; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.AbstractyG r1) {
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    Hw();
                    if (r1 != null) { $pc20 = 6; continue $sw20; }
                    r1 = abcd.AbstractyG.j6;
                    $pc20 = 6; continue $sw20;
                }
                case 6: {
                    this.we = r1;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.util.Collection<abcd.dG> r2) {
        java.util.Iterator<abcd.dG> r3 = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = -1;
        $sw21: while (true) {
            switch ($pc21) {
                case -1: {
                    r3 = r2.iterator();
                    $pc21 = 4; continue $sw21;
                }
                case 4: {
                    if (r3.hasNext() == false) { $pc21 = 5; continue $sw21; }
                    DW(r3.next());
                    { $pc21 = 4; continue $sw21; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(boolean r1) {
        this.J8 = r1;
    }

    public final void j6(abcd.fG... r5) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex22 = null;
        int $pc22 = -1;
        $sw22: while (true) {
            switch ($pc22) {
                case -1: {
                    r0 = r5.length;
                    r1 = 0;
                    r2 = 0;
                    $pc22 = 3; continue $sw22;
                }
                case 3: {
                    if (r1 >= r0) { $pc22 = 4; continue $sw22; }
                    r2 = r2 | r5[r1].Hw;
                    r1 = r1 + 1;
                    { $pc22 = 3; continue $sw22; }
                }
                case 4: {
                    Zo(r2);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(abcd.dG r4, abcd.dG r5) {
        abcd.AbstractyG r0 = null;
        abcd.AbstractjK r1 = null;
        boolean r6 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex23 = null;
        int $pc23 = -1;
        $sw23: while (true) {
            switch ($pc23) {
                case -1: {
                    r0 = this.we;
                    r1 = this.J0;
                    try {
                        J8();
                        Zo((this.v5 ^ (-1)) & (-64));
                        this.we = abcd.AbstractyG.Hw;
                        this.J0 = abcd.AbstractjK.j6;
                        DW(r5);
                        DW(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 9; continue $sw23;
                    }
                    if (tp() != r4) { $pc23 = 6; continue $sw23; }
                    r6 = true;
                    $pc23 = 7; continue $sw23;
                }
                case 7: {
                    this.we = r0;
                    this.J0 = r1;
                    return r6;
                }
                case 6: {
                    r6 = false;
                    $pc23 = 9; continue $sw23;
                }
                case 9: {
                    th = $ex23;
                    this.we = r0;
                    this.J0 = r1;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(abcd.EnumkG r2) {
        return this.EQ.contains(r2);
    }

    byte[] j6(abcd.AbstractiG r3) {
        return j6(r3, this.DW.Hw(r3, r3.aM()));
    }

    byte[] j6(abcd.AbstractiG r2, abcd.FE r3) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex24 = null;
        int $pc24 = -1;
        $sw24: while (true) {
            switch ($pc24) {
                case -1: {
                    return r3.DW(5242880);
                }
                case 5: {
                    e = $ex24;
                    e.j6(r2);
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.dG tp() {
        return this.tp.j6();
    }

    public boolean u7() {
        return this.J8;
    }

    public abcd.mG v5(abcd.YD r2) {
        abcd.mG r0 = null;
        abcd.mG r1 = null;
        java.lang.Throwable $ex25 = null;
        int $pc25 = -1;
        $sw25: while (true) {
            switch ($pc25) {
                case -1: {
                    r0 = (abcd.mG) this.Hw.DW(r2);
                    if (r0 != null) { $pc25 = 6; continue $sw25; }
                    r1 = new abcd.mG(r2);
                    this.Hw.j6(r1);
                    return r1;
                }
                case 6: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void v5() {
        this.DW.FH();
        this.v5 = -64;
        this.Zo = 0;
        this.VH = 4;
        this.Hw.clear();
        this.DW.FH();
        this.gn.clear();
        this.u7 = new abcd.QF();
        this.tp = new abcd.C1329tG(this);
    }

    void v5(int r2) {
        java.lang.Throwable $ex26 = null;
        int $pc26 = -1;
        $sw26: while (true) {
            switch ($pc26) {
                case -1: {
                    if (Ws() == false) { $pc26 = 5; continue $sw26; }
                    this.v5 |= r2;
                    this.VH = (r2 ^ (-1)) & this.VH;
                    return;
                }
                case 5: {
                    this.Zo = r2 | this.Zo;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final void we() {
        Zo(0);
    }
}
