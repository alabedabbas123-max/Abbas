package abcd;

class uG extends abcd.XF {
    private final int DW;
    private final abcd.UF j6;

    uG(abcd.XF r7) {
        this.j6 = new abcd.UF();
        this.DW = r7.DW() | 8;
        r7.j6(this.j6);
    L3:
        abcd.dG r0 = r7.j6();
        if (r0 == null) goto L5;
        abcd.dG[] r1 = r0.J8;
        int r2 = r1.length;
        int r3 = 0;
    L7:
        if (r3 >= r2) goto L8;
        r1[r3].QX++;
        r3 = r3 + 1;
        goto L7
    L8:
        this.j6.j6(r0);
        goto L3
    }

    @Override
    int DW() {
        return this.DW;
    }

    @Override
    abcd.dG j6() {
    L2:
        abcd.dG r0 = this.j6.j6();
        if (r0 == null) goto L4;
        if (r0.QX <= 0) goto L9;
        r0.EQ |= 32;
        goto L2
    L9:
        abcd.dG[] r1 = r0.J8;
        int r2 = r1.length;
        int r3 = 0;
    L10:
        if (r3 >= r2) goto L11;
        abcd.dG r4 = r1[r3];
        int r5 = r4.QX - 1;
        r4.QX = r5;
        if (r5 != 0) goto L17;
        int r6 = r4.EQ;
        if ((r6 & 32) == 0) goto L17;
        r4.EQ = r6 & (-33);
        this.j6.DW(r4);
    L17:
        r3 = r3 + 1;
        goto L10
    L11:
        return r0;
    L4:
        return null;
    }

    @Override
    void j6(abcd.OF r2) {
        r2.j6(this.j6);
    }
}
