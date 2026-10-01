package abcd;

class rG extends abcd.XF {
    private final abcd.XF j6;

    rG(abcd.XF r1) {
        this.j6 = r1;
    }

    private abcd.dG j6(abcd.dG r4) {
    L2:
        abcd.dG[] r0 = r4.J8;
        if (r0.length > 1) goto L4;
        int r1 = r4.EQ;
        if ((r1 & 4) != 0) goto L7;
        if ((r1 & 8) == 0) goto L10;
        if (r0.length == 0) goto L13;
        r4 = r0[0];
        goto L2
    L13:
        return null;
    L10:
        return r4;
    L7:
        return r4;
    L4:
        return r4;
    }

    private abcd.dG[] j6(abcd.dG[] r7) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
    L4:
        if (r1 >= r7.length) goto L6;
        abcd.dG r3 = r7[r1];
        if (r3 == null) goto L25;
        int r4 = r3.EQ;
        if ((r4 & 16) == 0) goto L24;
        r7[r1] = null;
        goto L25
    L24:
        r3.EQ = r4 | 16;
        r2 = r2 + 1;
    L25:
        r1 = r1 + 1;
        goto L4
    L6:
        if (r2 != r7.length) goto L11;
        int r5 = r7.length;
    L8:
        if (r0 >= r5) goto L9;
        r7[r0].EQ &= -17;
        r0 = r0 + 1;
        goto L8
    L9:
        return r7;
    L11:
        abcd.dG[] r6 = new abcd.dG[r2];
        int r8 = r7.length;
        int r9 = 0;
    L12:
        if (r0 >= r8) goto L13;
        abcd.dG r10 = r7[r0];
        if (r10 == null) goto L17;
        r6[r9] = r10;
        r10.EQ &= -17;
        r9 = r9 + 1;
    L17:
        r0 = r0 + 1;
        goto L12
    L13:
        return r6;
    }

    @Override
    int DW() {
        return this.j6.DW() & (-5);
    }

    @Override
    abcd.dG j6() {
        abcd.dG r0 = this.j6.j6();
        if (r0 != null) goto L6;
        return null;
    L6:
        abcd.dG[] r1 = r0.J8;
        int r2 = r1.length;
        int r3 = 0;
        boolean r4 = false;
    L7:
        if (r3 >= r2) goto L8;
        abcd.dG r5 = r1[r3];
        abcd.dG r6 = j6(r5);
        if (r5 == r6) goto L14;
        r1[r3] = r6;
        r4 = true;
    L14:
        r3 = r3 + 1;
        goto L7
    L8:
        if (r4 == false) goto L10;
        r0.J8 = j6(r1);
    L10:
        return r0;
    }

    @Override
    void j6(abcd.OF r2) {
        this.j6.j6(r2);
    }
}
