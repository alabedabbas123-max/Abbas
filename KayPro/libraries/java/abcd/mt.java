package abcd;

public final class mt extends abcd.Abstractvt implements java.lang.Cloneable {
    private abcd.Tr FH;

    mt(abcd.Tr r2, abcd.tt r3) {
        super(r2.VH(), r3);
        this.FH = r2;
    }

    @Override
    public final void DW(abcd.Abstractqt r4) {
        abcd.cs r0 = null;
        abcd.cs r5 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.FH.gn();
                    r5 = r4.j6(r0);
                    if (r5 == r0) { $pc0 = 6; continue $sw0; }
                    this.FH = this.FH.j6(u7(), r5);
                    DW().v5().j6(this, r0);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean EQ() {
        abcd.es r0 = null;
        boolean r1 = false;
        int r2 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = v5();
                    if (r0.DW() == 1) { $pc1 = 6; continue $sw1; }
                    return true;
                }
                case 6: {
                    if (abcd.C1102nt.DW() == true) { $pc1 = 8; continue $sw1; }
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    r1 = false;
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    r2 = r0.Hw();
                    if (r2 != 2) { $pc1 = 14; continue $sw1; }
                    $pc1 = 18; continue $sw1;
                }
                case 18: {
                    return r1;
                }
                case 14: {
                    if (r2 == 5) { $pc1 = 18; continue $sw1; }
                    if (r2 == 55) { $pc1 = 18; continue $sw1; }
                    return true;
                }
                case 8: {
                    if (FH() == null) { $pc1 = 10; continue $sw1; }
                    r1 = true;
                    { $pc1 = 11; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.bs FH() {
        abcd.bs r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.FH.v5().Hw() != 54) { $pc2 = 5; continue $sw2; }
                    r0 = this.FH.gn().get(0);
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (r0 != null) { $pc2 = 10; continue $sw2; }
                    return null;
                }
                case 10: {
                    if (r0.Zo() != null) { $pc2 = 12; continue $sw2; }
                    return null;
                }
                case 12: {
                    return r0;
                }
                case 5: {
                    r0 = u7();
                    { $pc2 = 7; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean J0() {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.FH.v5().Hw() != 4) { $pc3 = 5; continue $sw3; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean QX() {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (this.FH.v5().Hw() != 2) { $pc4 = 5; continue $sw4; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean XL() {
        return QX();
    }

    @Override
    public java.lang.String aM() {
        return lg().aM();
    }

    @Override
    public abcd.mt clone() {
        return (abcd.mt) super.clone();
    }

    @Override
    public abcd.Abstractvt clone() {
        return clone();
    }

    @Override
    public java.lang.Object mo30clone() {
        return clone();
    }

    @Override
    public abcd.Tr gn() {
        return this.FH;
    }

    public final void j6(int r6, abcd.bs r7) {
        abcd.cs r0 = null;
        int r1 = 0;
        abcd.cs r2 = null;
        int r3 = 0;
        abcd.bs r4 = null;
        abcd.bs r8 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.FH.gn();
                    r1 = r0.size();
                    r2 = new abcd.cs(r1);
                    r3 = 0;
                    $pc5 = 3; continue $sw5;
                }
                case 3: {
                    if (r3 >= r1) { $pc5 = 8; continue $sw5; }
                    if (r3 != r6) { $pc5 = 6; continue $sw5; }
                    r4 = r7;
                    $pc5 = 7; continue $sw5;
                }
                case 7: {
                    r2.j6(r3, r4);
                    r3 = r3 + 1;
                    { $pc5 = 3; continue $sw5; }
                }
                case 6: {
                    r4 = r0.get(r3);
                    { $pc5 = 7; continue $sw5; }
                }
                case 8: {
                    r2.we();
                    r8 = r0.get(r6);
                    if (r8.we() == r7.we()) { $pc5 = 11; continue $sw5; }
                    DW().v5().j6(this, r8, r7);
                    $pc5 = 11; continue $sw5;
                }
                case 11: {
                    this.FH = this.FH.j6(u7(), r2);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final void j6(abcd.cs r3) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (this.FH.gn().size() != r3.size()) { $pc6 = 7; continue $sw6; }
                    this.FH = this.FH.j6(u7(), r3);
                    return;
                }
                case 7: {
                    throw new java.lang.RuntimeException("Sources counts don't match");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(abcd.Abstractvt.a r2) {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (QX() == false) { $pc7 = 5; continue $sw7; }
                    r2.j6(this);
                    return;
                }
                case 5: {
                    r2.DW(this);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean j6() {
        return this.FH.j6();
    }

    @Override
    public abcd.Tr lg() {
        return this.FH.j6(u7(), this.FH.gn());
    }

    public void rN() {
        abcd.cs r0 = this.FH.gn();
        this.FH = this.FH.u7();
        DW().v5().j6(this, r0);
    }

    @Override
    public abcd.cs tp() {
        return this.FH.gn();
    }

    @Override
    public abcd.es v5() {
        return this.FH.v5();
    }
}
