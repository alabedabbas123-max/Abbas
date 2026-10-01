package abcd;

public final class fs {
    private final int DW;
    private abcd.au[] FH;
    private abcd.au Hw;
    private final abcd.Or j6;

    public fs(abcd.Or r1, int r2) {
        if (r1 == null) goto L10;
        if (r2 < 0) goto L8;
        this.j6 = r1;
        this.DW = r2;
        this.FH = null;
        this.Hw = null;
        return;
    L8:
        throw new java.lang.IllegalArgumentException("firstLabel < 0");
    L10:
        throw new java.lang.NullPointerException("blocks == null");
    }

    private void FH() {
        int r0 = this.j6.rN();
        abcd.au[] r1 = new abcd.au[r0];
        abcd.au r2 = new abcd.au(10);
        int r4 = this.j6.size();
        int r5 = 0;
        int r6 = 0;
    L3:
        if (r6 >= r4) goto L14;
        abcd.Nr r7 = this.j6.get(r6);
        int r8 = r7.DW();
        abcd.au r9 = r7.gn();
        int r10 = r9.size();
        if (r10 != 0) goto L7;
        r2.DW(r8);
    L13:
        r6 = r6 + 1;
        goto L3
    L7:
        int r11 = 0;
    L8:
        if (r11 >= r10) goto L13;
        int r12 = r9.get(r11);
        abcd.au r13 = r1[r12];
        if (r13 != null) goto L12;
        r13 = new abcd.au(10);
        r1[r12] = r13;
    L12:
        r13.DW(r8);
        r11 = r11 + 1;
    L14:
        if (r5 >= r0) goto L19;
        abcd.au r3 = r1[r5];
        if (r3 == null) goto L18;
        r3.er();
        r3.we();
    L18:
        r5 = r5 + 1;
        goto L14
    L19:
        r2.er();
        r2.we();
        int r14 = this.DW;
        if (r1[r14] != null) goto L22;
        r1[r14] = abcd.au.DW;
    L22:
        this.FH = r1;
        this.Hw = r2;
    }

    public int DW() {
        return this.DW;
    }

    public abcd.Or j6() {
        return this.j6;
    }

    public abcd.au j6(int r4) {
        if (this.Hw != null) goto L5;
        FH();
    L5:
        abcd.au r0 = this.FH[r4];
        if (r0 == null) goto L9;
        return r0;
    L9:
        throw new java.lang.RuntimeException("no such block: " + abcd.Yt.v5(r4));
    }
}
