package abcd;

abstract class IC {
    protected abcd.QC[] DW;
    protected int FH;
    protected abcd.KC j6;

    protected IC(abcd.KC r1, int r2) {
        this.j6 = r1;
        this.DW = new abcd.QC[r2];
    }

    public abstract void DW();

    public abcd.KC FH() {
        return this.j6;
    }

    protected void Hw() {
        int r0 = this.FH;
        abcd.QC[] r1 = this.DW;
        if (r0 >= (r1.length / 2)) goto L5;
        abcd.QC[] r2 = new abcd.QC[r0];
        java.lang.System.arraycopy(r1, 0, r2, 0, r0);
        this.DW = r2;
    L5:
        this.j6.j6(this.DW, this.FH);
    }

    protected void j6(int r5, int r6) {
        int r0 = this.FH;
        if ((r0 + r6) <= this.DW.length) goto L5;
        abcd.QC[] r1 = new abcd.QC[java.lang.Math.max(((r0 + 16) * 3) / 2, r0 + r6)];
        java.lang.System.arraycopy(this.DW, 0, r1, 0, this.FH);
        this.DW = r1;
    L5:
        this.j6.j6(r5, this.DW, this.FH, r6);
        this.FH += r6;
    }

    protected void j6(abcd.QC r5) {
        abcd.QC[] r0 = this.DW;
        int r1 = r0.length;
        int r2 = this.FH;
        if (r1 != r2) goto L5;
        abcd.QC[] r3 = new abcd.QC[((r2 + 16) * 3) / 2];
        java.lang.System.arraycopy(r0, 0, r3, 0, r2);
        this.DW = r3;
    L5:
        abcd.QC[] r4 = this.DW;
        int r6 = this.FH;
        this.FH = r6 + 1;
        r4[r6] = r5;
    }

    public boolean j6() {
        DW();
        this.j6.EQ();
        return this.j6.FH();
    }
}
