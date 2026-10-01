package abcd;

public class UF extends abcd.OF {
    private abcd.OF.a Hw;
    private abcd.OF.a v5;

    public UF() {
    }

    UF(abcd.XF r1) {
        super(r1);
    }

    void DW(int r5) {
        int r6 = r5 ^ (-1);
        abcd.OF.a r0 = this.Hw;
    L3:
        if (r0 == null) goto L4;
        int r1 = r0.FH;
    L7:
        if (r1 >= r0.Hw) goto L8;
        r0.DW[r1].EQ &= r6;
        r1 = r1 + 1;
        goto L7
    L8:
        r0 = r0.j6;
        goto L3
    }

    public void DW(abcd.dG r3) {
        abcd.OF.a r0 = this.Hw;
        if (r0 != null) goto L7;
        abcd.OF.a r1 = this.FH.j6();
        r1.VH();
        r1.j6(r3);
        this.Hw = r1;
        this.v5 = r1;
        return;
    L7:
        if (r0.j6() == false) goto L10;
        r0.DW(r3);
        return;
    L10:
        abcd.OF.a r2 = this.FH.j6();
        r2.Zo();
        r2.DW(r3);
        r2.j6 = this.Hw;
        this.Hw = r2;
    }

    @Override
    public abcd.dG j6() {
        abcd.OF.a r0 = this.Hw;
        if (r0 != null) goto L5;
        return null;
    L5:
        abcd.dG r2 = r0.v5();
        if (r0.FH() == false) goto L11;
        this.Hw = r0.j6;
        if (this.Hw != null) goto L10;
        this.v5 = null;
    L10:
        this.FH.j6(r0);
    L11:
        return r2;
    }

    @Override
    public void j6(abcd.dG r3) {
        abcd.OF.a r0 = this.v5;
        if (r0 != null) goto L7;
        abcd.OF.a r1 = this.FH.j6();
        r1.j6(r3);
        this.Hw = r1;
        this.v5 = r1;
        return;
    L7:
        if (r0.Hw() == false) goto L9;
        r0 = this.FH.j6();
        this.v5.j6 = r0;
        this.v5 = r0;
    L9:
        r0.j6(r3);
    }

    @Override
    boolean j6(int r4) {
        abcd.OF.a r0 = this.Hw;
    L3:
        if (r0 == null) goto L4;
        int r1 = r0.FH;
    L8:
        if (r1 >= r0.Hw) goto L9;
        if ((r0.DW[r1].EQ & r4) != 0) goto L12;
        r1 = r1 + 1;
        goto L8
    L12:
        return true;
    L9:
        r0 = r0.j6;
        goto L3
    L4:
        return false;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        abcd.OF.a r1 = this.Hw;
    L3:
        if (r1 == null) goto L5;
        int r2 = r1.FH;
    L8:
        if (r2 >= r1.Hw) goto L9;
        abcd.LF.j6(r0, r1.DW[r2]);
        r2 = r2 + 1;
        goto L8
    L9:
        r1 = r1.j6;
        goto L3
    L5:
        return r0.toString();
    }
}
