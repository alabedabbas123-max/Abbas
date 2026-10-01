package abcd;

public class YF extends abcd.OF {
    private abcd.OF.a Hw;

    YF(abcd.XF r1) {
        super(r1);
    }

    @Override
    public abcd.dG j6() {
        abcd.OF.a r0 = this.Hw;
        if (r0 != null) goto L6;
        return null;
    L6:
        abcd.dG r1 = r0.v5();
        if (r0.FH() == false) goto L9;
        this.Hw = r0.j6;
        this.FH.j6(r0);
    L9:
        return r1;
    }

    @Override
    public void j6(abcd.dG r3) {
        abcd.OF.a r0 = this.Hw;
        if (r0 != null) goto L5;
    L6:
        r0 = this.FH.j6();
        r0.Zo();
        r0.j6 = this.Hw;
        this.Hw = r0;
    L7:
        r0.DW(r3);
        return;
    L5:
        if (r0.j6() == true) goto L7;
        goto L6
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
