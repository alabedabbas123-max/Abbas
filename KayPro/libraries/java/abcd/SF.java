package abcd;

class SF extends abcd.XF {
    private final int DW;
    private final abcd.qG FH;
    private final abcd.fG Hw;
    private final abcd.UF j6;
    private final abcd.fG v5;

    /* JADX WARN: Multi-variable type inference failed */
    SF(abcd.TF r2, abcd.XF r3) {
        this.j6 = new abcd.UF();
        this.FH = (abcd.qG) r2;
        this.DW = r2.getDepth();
        this.Hw = r2.DW();
        this.v5 = r2.j6();
        r3.j6(this.j6);
    L3:
        abcd.dG r4 = r3.j6();
        if (r4 == null) goto L5;
        if (((abcd.TF.a) r4).BT() != 0) goto L3;
        this.j6.j6(r4);
        goto L3
    }

    @Override
    int DW() {
        return this.j6.DW() | 16;
    }

    @Override
    abcd.dG j6() {
    L2:
        abcd.TF.a r0 = (abcd.TF.a) this.j6.j6();
        if (r0 == null) goto L4;
        boolean r2 = true;
        if ((r0.EQ & 1) != 0) goto L9;
        r0.j6(this.FH);
    L9:
        int r1 = r0.aM + 1;
        abcd.dG[] r3 = r0.J8;
        int r4 = r3.length;
        int r6 = 0;
    L10:
        if (r6 >= r4) goto L12;
        abcd.dG r7 = r3[r6];
        abcd.TF.a r8 = (abcd.TF.a) r7;
        if (r8.aM != (-1)) goto L28;
        r8.aM = r1;
        if (r1 > this.DW) goto L28;
        this.j6.j6(r7);
    L28:
        if (r0.DW(this.Hw) == false) goto L30;
    L31:
        r7.j6(this.v5);
        r7.EQ &= -5;
    L32:
        r6 = r6 + 1;
        goto L10
    L30:
        if (r0.DW(this.v5) == false) goto L32;
    L12:
        if (r0.aM <= this.DW) goto L16;
        r2 = false;
    L16:
        if ((r0.EQ & 4) == 0) goto L20;
        if (r0.DW(this.Hw) == true) goto L20;
        r2 = false;
    L20:
        if (r2 == false) goto L2;
        return r0;
    L4:
        return null;
    }

    @Override
    void j6(abcd.OF r2) {
        this.j6.j6(r2);
    }
}
