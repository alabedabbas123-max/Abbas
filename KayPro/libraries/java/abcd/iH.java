package abcd;

class iH extends abcd.AbstractgH {
    iH(java.io.OutputStream r1) {
        super(r1);
    }

    private void Hw() {
        java.util.Iterator<? extends abcd.CI> r0 = this.Hw.iterator();
    L4:
        if (r0.hasNext() == false) goto L5;
        abcd.CI r1 = r0.next();
        abcd.FK.DW(this.FH, 0, r1.aM());
        this.DW.write(this.FH, 0, 4);
        goto L4
    }

    private void VH() {
        java.util.Iterator<? extends abcd.CI> r0 = this.Hw.iterator();
    L4:
        if (r0.hasNext() == false) goto L5;
        long r1 = r0.next().getOffset();
        if (2147483647L >= r1) goto L4;
        abcd.FK.j6(this.FH, 0, r1);
        this.DW.write(this.FH, 0, 8);
        goto L4
    }

    private void Zo() {
        java.util.Iterator<? extends abcd.CI> r0 = this.Hw.iterator();
        int r2 = 0;
    L4:
        if (r0.hasNext() == false) goto L5;
        long r3 = r0.next().getOffset();
        if (r3 > 2147483647L) goto L9;
        abcd.FK.DW(this.FH, 0, (int) r3);
    L10:
        this.DW.write(this.FH, 0, 4);
        goto L4
    L9:
        int r5 = r2 + 1;
        abcd.FK.DW(this.FH, 0, r2 | Integer.MIN_VALUE);
        r2 = r5;
        goto L10
    }

    private void v5() {
        java.util.Iterator<? extends abcd.CI> r0 = this.Hw.iterator();
    L4:
        if (r0.hasNext() == false) goto L5;
        r0.next().j6(this.DW);
        goto L4
    }

    @Override
    protected void FH() {
        j6(2);
        DW();
        v5();
        Hw();
        Zo();
        VH();
        j6();
    }
}
