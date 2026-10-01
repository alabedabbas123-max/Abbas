package abcd;

class fH extends abcd.AbstractbH {
    private static final int[] DW = null;
    private static final byte[] FH = null;
    private long Hw;
    private byte[][] VH;
    private int[][] Zo;
    private byte[][] gn;
    private byte[] u7;
    private final long[] v5;

    private class a extends abcd.AbstractbH.a {
        private int Hw;
        final abcd.fH Zo;
        private int v5;

        private a(abcd.fH r1) {
            this.Zo = r1;
            super(r1);
        }

        a(abcd.fH r1, abcd.fH.a r2) {
            this(r1);
        }

        @Override
        protected abcd.AbstractbH.b j6() {
            return new abcd.eH(this);
        }

        @Override
        public abcd.AbstractbH.b next() {
        L3:
            if (this.Hw >= abcd.fH.j6(this.Zo).length) goto L13;
            int r0 = this.v5;
            int[][] r1 = abcd.fH.j6(this.Zo);
            int r2 = this.Hw;
            if (r0 < r1[r2].length) goto L6;
            this.v5 = 0;
            this.Hw = r2 + 1;
            goto L3
        L6:
            long r3 = abcd.FK.FH(abcd.fH.DW(this.Zo)[this.Hw], (this.v5 / 5) * 4);
            if ((2147483648L & r3) == 0) goto L9;
            r3 = abcd.FK.Hw(abcd.fH.FH(this.Zo), ((int) (r3 & (-2147483649L))) * 8);
        L9:
            abcd.AbstractbH.b r4 = this.j6;
            r4.DW = r3;
            this.v5 += 5;
            this.DW++;
            return r4;
        L13:
            throw new java.util.NoSuchElementException();
        }
    }

    static {
        DW = new int[0];
        FH = new byte[0];
    }

    fH(java.io.InputStream r11) {
        byte[] r0 = new byte[1024];
        abcd.BK.j6(r11, r0, 0, r0.length);
        this.v5 = new long[256];
        int r3 = 0;
    L3:
        if (r3 >= 256) goto L4;
        this.v5[r3] = abcd.FK.FH(r0, r3 * 4);
        r3 = r3 + 1;
        goto L3
    L4:
        this.Hw = this.v5[255(0xff, float:3.57E-43)];
        this.Zo = new int[256][];
        this.VH = new byte[256][];
        this.gn = new byte[256][];
        int r1 = 0;
    L5:
        if (r1 >= 256) goto L6;
        if (r1 != 0) goto L26;
        long r4 = this.v5[r1];
    L28:
        if (r4 != 0) goto L30;
        this.Zo[r1] = DW;
        byte[][] r5 = this.VH;
        byte[] r6 = FH;
        r5[r1] = r6;
        this.gn[r1] = r6;
    L36:
        r1 = r1 + 1;
        goto L5
    L30:
        long r7 = 20 * r4;
        if (r7 > 2147483647L) goto L39;
        int r8 = (int) r7;
        byte[] r9 = new byte[r8];
        int[] r10 = new int[r8 >>> 2];
        abcd.BK.j6(r11, r9, 0, r9.length);
        int r12 = 0;
    L34:
        if (r12 >= r10.length) goto L35;
        r10[r12] = abcd.FK.j6(r9, r12 << 2);
        r12 = r12 + 1;
        goto L34
    L35:
        this.Zo[r1] = r10;
        int r13 = (int) (r4 * 4);
        this.VH[r1] = new byte[r13];
        this.gn[r1] = new byte[r13];
        goto L36
    L39:
        throw new java.io.IOException(org.eclipse.jgit.JGitText.j6().indexFileIsTooLargeForJgit);
    L26:
        long[] r14 = this.v5;
        r4 = r14[r1] - r14[r1 - 1];
        goto L28
    L6:
        int r2 = 0;
    L7:
        if (r2 >= 256) goto L8;
        byte[][] r15 = this.gn;
        abcd.BK.j6(r11, r15[r2], 0, r15[r2].length);
        r2 = r2 + 1;
        goto L7
    L8:
        int r16 = 0;
        int r17 = 0;
    L9:
        if (r17 >= 256) goto L10;
        byte[] r18 = this.VH[r17];
        abcd.BK.j6(r11, r18, 0, r18.length);
        int r19 = r16;
        int r20 = 0;
    L17:
        if (r20 >= r18.length) goto L18;
        if (r18[r20] >= 0) goto L22;
        r19 = r19 + 1;
    L22:
        r20 = r20 + 4;
        goto L17
    L18:
        r17 = r17 + 1;
        r16 = r19;
        goto L9
    L10:
        if (r16 <= 0) goto L12;
        this.u7 = new byte[r16 * 8];
        byte[] r21 = this.u7;
        abcd.BK.j6(r11, r21, 0, r21.length);
    L13:
        this.j6 = new byte[20];
        byte[] r22 = this.j6;
        abcd.BK.j6(r11, r22, 0, r22.length);
        return;
    L12:
        this.u7 = FH;
        goto L13
    }

    static byte[][] DW(abcd.fH r0) {
        return r0.VH;
    }

    static byte[] FH(abcd.fH r0) {
        return r0.u7;
    }

    private static int Zo(int r1) {
        return (r1 << 2) + r1;
    }

    private int j6(abcd.YD r6, int r7) {
        int[] r0 = this.Zo[r7];
        int r8 = this.VH[r7].length >>> 2;
        if (r8 != 0) goto L5;
        return -1;
    L5:
        int r2 = 0;
    L6:
        int r3 = (r2 + r8) >>> 1;
        int r4 = r6.j6(r0, (r3 << 2) + r3);
        if (r4 >= 0) goto L9;
        r8 = r3;
    L12:
        if (r2 < r8) goto L6;
        return -1;
    L9:
        if (r4 == 0) goto L10;
        r2 = r3 + 1;
        goto L12
    L10:
        return r3;
    }

    static int[][] j6(abcd.fH r0) {
        return r0.Zo;
    }

    @Override
    public long DW() {
        return this.u7.length / 8;
    }

    @Override
    public long DW(abcd.YD r7) {
        int r0 = r7.Zo();
        int r8 = j6(r7, r0);
        if (r8 != (-1)) goto L6;
        return -1;
    L6:
        long r1 = abcd.FK.FH(this.VH[r0], r8 << 2);
        if ((2147483648L & r1) != 0) goto L9;
        return r1;
    L9:
        return abcd.FK.Hw(this.u7, ((int) (r1 & (-2147483649L))) * 8);
    }

    @Override
    public boolean FH() {
        return true;
    }

    @Override
    public java.util.Iterator<abcd.AbstractbH.b> iterator() {
        return new abcd.fH.a(this, null);
    }

    @Override
    public long j6() {
        return this.Hw;
    }

    @Override
    public long j6(abcd.YD r4) {
        int r0 = r4.Zo();
        int r1 = j6(r4, r0);
        if (r1 == (-1)) goto L7;
        return abcd.FK.FH(this.gn[r0], r1 << 2);
    L7:
        throw new abcd.fD(r4.Hw(), "unknown");
    }

    @Override
    public abcd.yE j6(long r7) {
        int r0 = java.util.Arrays.binarySearch(this.v5, 1 + r7);
        if (r0 < 0) goto L10;
        long r2 = this.v5[r0];
    L5:
        if (r0 <= 0) goto L11;
        if (r2 != this.v5[r0 - 1]) goto L11;
        r0 = r0 - 1;
    L11:
        if (r0 <= 0) goto L13;
        long r3 = this.v5[r0 - 1];
    L14:
        int r8 = (int) (r7 - r3);
        return abcd.yE.DW(this.Zo[r0], (r8 << 2) + r8);
    L13:
        r3 = 0;
        goto L14
    L10:
        r0 = -(r0 + 1);
        goto L11
    }

    @Override
    public void j6(java.util.Set<abcd.yE> r7, abcd.WD r8, int r9) {
        int[] r0 = this.Zo[r8.j6()];
        int r1 = this.VH[r8.j6()].length >>> 2;
        if (r1 != 0) goto L5;
        return;
    L5:
        int r2 = 0;
        int r3 = r1;
    L6:
        int r4 = (r2 + r3) >>> 1;
        int r5 = r8.j6(r0, Zo(r4));
        if (r5 >= 0) goto L9;
        r3 = r4;
    L25:
        if (r2 < r3) goto L6;
        return;
    L9:
        if (r5 == 0) goto L10;
        r2 = r4 + 1;
    L10:
        if (r4 <= 0) goto L15;
        if (r8.j6(r0, Zo(r4 - 1)) != 0) goto L15;
        r4 = r4 - 1;
    L15:
        if (r4 >= r1) goto L39;
        if (r8.j6(r0, Zo(r4)) != 0) goto L23;
        r7.add(abcd.yE.DW(r0, Zo(r4)));
        if (r7.size() > r9) goto L38;
        r4 = r4 + 1;
        goto L15
    L38:
        return;
    L23:
        return;
    }
}
