package abcd;

public final class mt extends abcd.Abstractvt implements java.lang.Cloneable {
    private abcd.Tr FH;

    mt(abcd.Tr r2, abcd.tt r3) {
        super(r2.VH(), r3);
        this.FH = r2;
    }

    @Override
    public final void DW(abcd.Abstractqt r4) {
        abcd.cs r0 = this.FH.gn();
        abcd.cs r5 = r4.j6(r0);
        if (r5 == r0) goto L6;
        this.FH = this.FH.j6(u7(), r5);
        DW().v5().j6(this, r0);
        return;
    }

    @Override
    public boolean EQ() {
        abcd.es r0 = v5();
        if (r0.DW() == 1) goto L6;
        return true;
    L6:
        if (abcd.C1102nt.DW() == true) goto L8;
    L10:
        boolean r1 = false;
    L11:
        int r2 = r0.Hw();
        if (r2 != 2) goto L14;
    L18:
        return r1;
    L14:
        if (r2 == 5) goto L18;
        if (r2 == 55) goto L18;
        return true;
    L8:
        if (FH() == null) goto L10;
        r1 = true;
        goto L11
    }

    @Override
    public abcd.bs FH() {
        if (this.FH.v5().Hw() != 54) goto L5;
        abcd.bs r0 = this.FH.gn().get(0);
    L7:
        if (r0 != null) goto L10;
        return null;
    L10:
        if (r0.Zo() != null) goto L12;
        return null;
    L12:
        return r0;
    L5:
        r0 = u7();
        goto L7
    }

    @Override
    public boolean J0() {
        if (this.FH.v5().Hw() != 4) goto L5;
        return true;
    L5:
        return false;
    }

    @Override
    public boolean QX() {
        if (this.FH.v5().Hw() != 2) goto L5;
        return true;
    L5:
        return false;
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
        abcd.cs r0 = this.FH.gn();
        int r1 = r0.size();
        abcd.cs r2 = new abcd.cs(r1);
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L8;
        if (r3 != r6) goto L6;
        abcd.bs r4 = r7;
    L7:
        r2.j6(r3, r4);
        r3 = r3 + 1;
        goto L3
    L6:
        r4 = r0.get(r3);
        goto L7
    L8:
        r2.we();
        abcd.bs r8 = r0.get(r6);
        if (r8.we() == r7.we()) goto L11;
        DW().v5().j6(this, r8, r7);
    L11:
        this.FH = this.FH.j6(u7(), r2);
    }

    public final void j6(abcd.cs r3) {
        if (this.FH.gn().size() != r3.size()) goto L7;
        this.FH = this.FH.j6(u7(), r3);
        return;
    L7:
        throw new java.lang.RuntimeException("Sources counts don't match");
    }

    @Override
    public void j6(abcd.Abstractvt.a r2) {
        if (QX() == false) goto L5;
        r2.j6(this);
        return;
    L5:
        r2.DW(this);
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
