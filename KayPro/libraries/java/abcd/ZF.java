package abcd;

class ZF extends abcd.XF {
    private final abcd.QF DW;
    private int FH;
    private int Hw;
    private final abcd.qG j6;
    private int v5;

    ZF(abcd.qG r1) {
        this.j6 = r1;
        this.DW = new abcd.QF();
    }

    private boolean DW(abcd.dG r5, int r6) {
        if ((r5.EQ & r6) != r6) goto L5;
        boolean r0 = true;
    L6:
        r5.EQ = r6 | r5.EQ;
        int r7 = r5.EQ;
        if ((this.v5 & r7) != this.Hw) goto L10;
        r5.EQ = r7 & (-17);
        this.DW.j6(r5);
        j6(r5, this.FH | 8);
        return true;
    L10:
        return r0;
    L5:
        r0 = false;
        goto L6
    }

    private void j6(abcd.dG r5) {
        int r0 = this.j6.FH();
        this.FH |= r0;
        int r1 = r5.EQ;
        if ((this.FH & r1) != 0) goto L7;
        r5.EQ = r0 | r1;
        this.DW.j6(r5);
        return;
    L7:
        throw new java.lang.IllegalStateException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().staleRevFlagsOn, new java.lang.Object[]{r5.we()}));
    }

    private void j6(abcd.dG r5, int r6) {
    L2:
        abcd.dG[] r7 = r5.J8;
        if (r7 == null) goto L4;
        int r0 = r7.length;
        if (r0 == 0) goto L7;
        int r1 = 1;
    L9:
        if (r1 >= r0) goto L10;
        abcd.dG r2 = r7[r1];
        if (DW(r2, r6) == true) goto L16;
        j6(r2, r6);
    L16:
        r1 = r1 + 1;
        goto L9
    L10:
        r5 = r7[0];
        if (DW(r5, r6) == false) goto L2;
        return;
    L7:
        return;
    }

    @Override
    int DW() {
        return 0;
    }

    @Override
    abcd.dG j6() {
    L2:
        abcd.dG r0 = this.DW.j6();
        if (r0 == null) goto L4;
        abcd.dG[] r2 = r0.J8;
        int r3 = r2.length;
        boolean r4 = false;
        int r5 = 0;
    L7:
        if (r5 >= r3) goto L8;
        abcd.dG r6 = r2[r5];
        int r7 = r6.EQ;
        if ((r7 & 2) != 0) goto L29;
        if ((r7 & 1) != 0) goto L28;
        r6.j6(this.j6);
    L28:
        r6.EQ |= 2;
        this.DW.j6(r6);
    L29:
        r5 = r5 + 1;
        goto L7
    L8:
        int r8 = r0.EQ;
        int r9 = this.FH;
        int r10 = r8 & r9;
        if (r10 != r9) goto L11;
        r4 = true;
    L11:
        if (r4 == false) goto L13;
        r10 = r10 | 8;
    L13:
        j6(r0, r10);
        int r11 = r0.EQ;
        if ((r11 & 8) != 0) goto L16;
        r0.EQ = r11 | 16;
        if (r4 == false) goto L2;
        r0.EQ |= 8;
        return r0;
    L16:
        if (this.DW.DW(8) == false) goto L2;
        return null;
    L4:
        this.j6.DW.Hw();
        return null;
    }

    void j6(abcd.LF r3) {
    L12:
        abcd.dG r0 = r3.j6();     // Catch: java.lang.Throwable -> L8
        if (r0 == null) goto L4;
        j6(r0);     // Catch: java.lang.Throwable -> L8
        goto L12
    L4:
        this.j6.v5(this.FH);
        int r4 = this.FH;
        this.Hw = r4 | 16;
        this.v5 = (r4 | 16) | 8;
        return;
    L8:
        th = move-exception;
        this.j6.v5(this.FH);
        int r1 = this.FH;
        this.Hw = r1 | 16;
        this.v5 = (r1 | 16) | 8;
        throw th;
    }
}
