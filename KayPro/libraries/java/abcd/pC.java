package abcd;

final class pC<S extends abcd.CC> {
    private final mC<S> DW;
    private int[] EQ;
    private final lC<S> FH;
    private final lC<S> Hw;
    private abcd.jC J0;
    private int J8;
    private final int VH;
    private boolean Ws;
    private final int[] Zo;
    private long[] gn;
    private final int j6;
    private int[] tp;
    private int u7;
    private final abcd.jC v5;
    private int we;

    pC(int r1, mC<S> r2, lC<S> r3, lC<S> r4, abcd.jC r5) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
        this.v5 = r5;
        if (this.v5.DW >= 268435455) goto L7;
        int r6 = r5.VH();
        int r7 = j6(r6);
        this.Zo = new int[1 << r7];
        this.VH = 32 - r7;
        this.we = r5.j6;
        this.gn = new long[java.lang.Math.max(4, r6 >>> 3)];
        this.tp = new int[r6];
        this.EQ = new int[r6];
        return;
    L7:
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().sequenceTooLargeForDiffAlgorithm);
    }

    private int DW(int r17) {
        int r2 = r17 + 1;
        int r3 = this.Zo[j6(this.Hw, r17)];
        int r4 = r2;
    L3:
        if (r3 == 0) goto L4;
        long r6 = this.gn[r3];
        if (j6(r6) > this.J8) goto L8;
        int r5 = FH(r6);
        if (this.DW.j6(this.FH, r5, this.Hw, r17) == false) goto L52;
        this.Ws = true;
    L14:
        int r8 = this.tp[r5 - this.we];
        int r9 = r5 + 1;
        int r11 = j6(r6);
        int r10 = r17;
    L15:
        abcd.jC r12 = this.v5;
        if (r12.j6 >= r5) goto L25;
        if (r12.FH >= r10) goto L25;
        if (this.DW.j6(this.FH, r5 - 1, this.Hw, r10 - 1) == false) goto L25;
        r5 = r5 - 1;
        r10 = r10 - 1;
        if (1 >= r11) goto L15;
        r11 = java.lang.Math.min(r11, j6(this.gn[this.EQ[r5 - this.we]]));
    L25:
        int r7 = r2;
    L26:
        abcd.jC r13 = this.v5;
        if (r9 >= r13.DW) goto L38;
        if (r7 >= r13.Hw) goto L38;
        if (this.DW.j6(this.FH, r9, this.Hw, r7) == false) goto L38;
        if (1 >= r11) goto L36;
        r11 = java.lang.Math.min(r11, j6(this.gn[this.EQ[r9 - this.we]]));
    L36:
        r9 = r9 + 1;
        r7 = r7 + 1;
    L38:
        if (r4 >= r7) goto L41;
        r4 = r7;
    L41:
        if (this.J0.VH() >= (r9 - r5)) goto L43;
    L44:
        abcd.jC r14 = this.J0;
        r14.j6 = r5;
        r14.FH = r10;
        r14.DW = r9;
        r14.Hw = r7;
        this.J8 = r11;
    L45:
        if (r8 == 0) goto L52;
        r5 = r8;
    L48:
        if (r5 >= r9) goto L14;
        r5 = this.tp[r5 - this.we];
        if (r5 != 0) goto L48;
    L43:
        if (r11 >= this.J8) goto L45;
    L52:
        r3 = DW(r6);
        goto L3
    L8:
        if (this.Ws == true) goto L52;
        this.Ws = this.DW.j6(this.FH, FH(r6), this.Hw, r17);
        goto L52
    L4:
        return r4;
    }

    private static int DW(long r1) {
        return (int) (r1 >>> 36);
    }

    private boolean DW() {
        int r0 = this.v5.DW - 1;
    L4:
        if (this.v5.j6 > r0) goto L5;
        int r2 = j6(this.FH, r0);
        int r3 = this.Zo[r2];
        int r5 = 0;
    L7:
        if (r3 == 0) goto L9;
        long r7 = this.gn[r3];
        if (this.DW.j6(this.FH, FH(r7), this.FH, r0) == true) goto L17;
        r3 = DW(r7);
        r5 = r5 + 1;
        goto L7
    L17:
        int r4 = j6(r7) + 1;
        if (255 >= r4) goto L20;
        r4 = 255;
    L20:
        this.gn[r3] = j6(DW(r7), r0, r4);
        this.tp[r0 - this.we] = FH(r7);
        this.EQ[r0 - this.we] = r3;
    L21:
        r0 = r0 - 1;
        goto L4
    L9:
        if (r5 == this.j6) goto L10;
        int r6 = this.u7 + 1;
        this.u7 = r6;
        long[] r8 = this.gn;
        if (r6 != r8.length) goto L14;
        long[] r9 = new long[java.lang.Math.min(r8.length << 1, this.v5.VH() + 1)];
        long[] r10 = this.gn;
        java.lang.System.arraycopy(r10, 0, r9, 0, r10.length);
        this.gn = r9;
    L14:
        this.gn[r6] = j6(this.Zo[r2], r0, 1);
        this.EQ[r0 - this.we] = r6;
        this.Zo[r2] = r6;
        goto L21
    L10:
        return false;
    L5:
        return true;
    }

    private static int FH(long r1) {
        return 268435455 & ((int) (r1 >>> 8));
    }

    private static int j6(int r2) {
        int r0 = 31 - java.lang.Integer.numberOfLeadingZeros(r2);
        if (r0 != 0) goto L6;
        r0 = 1;
    L6:
        if ((1 << r0) < r2) goto L8;
        return r0;
    L8:
        return r0 + 1;
    }

    private static int j6(long r0) {
        return ((int) r0) & 255;
    }

    private int j6(lC<S> r2, int r3) {
        return (this.DW.j6(r2, r3) * (-1640562687)) >>> this.VH;
    }

    private static long j6(int r3, int r4, int r5) {
        long r0 = ((long) r3) << 36;
        return ((((long) r4) << 8) | r0) | ((long) r5);
    }

    abcd.jC j6() {
        if (DW() == true) goto L5;
        return null;
    L5:
        this.J0 = new abcd.jC(0, 0);
        this.J8 = this.j6 + 1;
        int r0 = this.v5.FH;
    L7:
        if (r0 >= this.v5.Hw) goto L9;
        r0 = DW(r0);
        goto L7
    L9:
        if (this.Ws == false) goto L14;
        if (this.j6 >= this.J8) goto L14;
        return null;
    L14:
        return this.J0;
    }
}
