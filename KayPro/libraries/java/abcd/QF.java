package abcd;

public class QF extends abcd.LF {
    private abcd.QF.a FH;
    private abcd.QF.a Hw;

    static class a {
        abcd.dG DW;
        abcd.QF.a j6;

        a() {
        }
    }

    public QF() {
    }

    QF(abcd.XF r2) {
    L3:
        abcd.dG r0 = r2.j6();
        if (r0 == null) goto L5;
        j6(r0);
        goto L3
    }

    private abcd.QF.a DW(abcd.dG r3) {
        abcd.QF.a r0 = this.Hw;
        if (r0 != null) goto L5;
        r0 = new abcd.QF.a();
    L6:
        r0.DW = r3;
        return r0;
    L5:
        this.Hw = r0.j6;
        goto L6
    }

    private void j6(abcd.QF.a r2) {
        r2.j6 = this.Hw;
        this.Hw = r2;
    }

    @Override
    int DW() {
        return this.DW | 1;
    }

    boolean DW(int r3) {
        abcd.QF.a r0 = this.FH;
    L3:
        if (r0 == null) goto L4;
        if ((r0.DW.EQ & r3) == 0) goto L8;
        r0 = r0.j6;
        goto L3
    L8:
        return false;
    L4:
        return true;
    }

    public void FH() {
        this.FH = null;
        this.Hw = null;
    }

    public abcd.dG Hw() {
        abcd.QF.a r0 = this.FH;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.DW;
    }

    @Override
    public abcd.dG j6() {
        abcd.QF.a r0 = this.FH;
        if (r0 != null) goto L6;
        return null;
    L6:
        this.FH = r0.j6;
        j6(r0);
        return r0.DW;
    }

    @Override
    public void j6(abcd.dG r9) {
        abcd.QF.a r0 = this.FH;
        long r1 = r9.Ws;
        abcd.QF.a r10 = DW(r9);
        if (r0 != null) goto L5;
    L15:
        r10.j6 = r0;
        this.FH = r10;
        return;
    L5:
        if (r1 > r0.DW.Ws) goto L15;
        abcd.QF.a r3 = r0.j6;
    L8:
        abcd.QF.a r7 = r3;
        abcd.QF.a r4 = r0;
        r0 = r7;
        if (r0 == null) goto L14;
        if (r0.DW.Ws <= r1) goto L14;
        r3 = r0.j6;
    L14:
        r10.j6 = r4.j6;
        r4.j6 = r10;
    }

    @Override
    boolean j6(int r3) {
        abcd.QF.a r0 = this.FH;
    L3:
        if (r0 == null) goto L4;
        if ((r0.DW.EQ & r3) != 0) goto L8;
        r0 = r0.j6;
        goto L3
    L8:
        return true;
    L4:
        return false;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        abcd.QF.a r1 = this.FH;
    L3:
        if (r1 == null) goto L5;
        abcd.LF.j6(r0, r1.DW);
        r1 = r1.j6;
        goto L3
    L5:
        return r0.toString();
    }
}
