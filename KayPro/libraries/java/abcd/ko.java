package abcd;

class ko extends abcd.Tr.a {
    final int DW;
    final int FH;
    final boolean[] j6;

    ko(boolean[] r1, int r2, int r3) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
    }

    @Override
    public void j6(abcd.Yr r6) {
        if (r6.v5().Hw() != 3) goto L12;
        int r0 = ((abcd.ys) r6.tp()).rN();
        boolean[] r1 = this.j6;
        if (r1[0] == true) goto L7;
    L9:
        boolean r7 = false;
    L10:
        r1[0] = r7;
        return;
    L7:
        if (((this.DW - this.FH) + r0) != r6.VH().we()) goto L9;
        r7 = true;
        goto L10
    }
}
