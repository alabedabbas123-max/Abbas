package abcd;

class dH extends abcd.AbstractbH {
    private final long[] DW;
    private byte[][] FH;
    private long Hw;

    private class a extends abcd.AbstractbH.a {
        private int Hw;
        final abcd.dH Zo;
        private int v5;

        private a(abcd.dH r1) {
            this.Zo = r1;
            super(r1);
        }

        a(abcd.dH r1, abcd.dH.a r2) {
            this(r1);
        }

        @Override
        protected abcd.AbstractbH.b j6() {
            return new abcd.cH(this);
        }

        @Override
        public abcd.AbstractbH.b next() {
        L3:
            if (this.Hw >= abcd.dH.j6(this.Zo).length) goto L14;
            if (abcd.dH.j6(this.Zo)[this.Hw] == null) goto L12;
            if (this.v5 < abcd.dH.j6(this.Zo)[this.Hw].length) goto L9;
            this.v5 = 0;
            goto L12
        L9:
            this.j6.DW = abcd.FK.FH(abcd.dH.j6(this.Zo)[this.Hw], this.v5);
            this.v5 += 24;
            this.DW++;
            return this.j6;
        L12:
            this.Hw++;
            goto L3
        L14:
            throw new java.util.NoSuchElementException();
        }
    }

    dH(java.io.InputStream r7, byte[] r8) {
        byte[] r1 = new byte[1024];
        java.lang.System.arraycopy(r8, 0, r1, 0, r8.length);
        abcd.BK.j6(r7, r1, r8.length, 1024 - r8.length);
        this.DW = new long[256];
        int r9 = 0;
    L3:
        long[] r0 = this.DW;
        if (r9 >= r0.length) goto L5;
        r0[r9] = abcd.FK.FH(r1, r9 * 4);
        r9 = r9 + 1;
        goto L3
    L5:
        this.FH = new byte[r0.length][];
        int r10 = 0;
    L6:
        long[] r2 = this.DW;
        if (r10 >= r2.length) goto L8;
        if (r10 != 0) goto L12;
        long r3 = r2[r10];
    L13:
        int r4 = (int) r3;
        if (r4 <= 0) goto L16;
        byte[][] r5 = this.FH;
        r5[r10] = new byte[r4 * 24];
        abcd.BK.j6(r7, r5[r10], 0, r5[r10].length);
    L16:
        r10 = r10 + 1;
        goto L6
    L12:
        r3 = r2[r10] - r2[r10 - 1];
        goto L13
    L8:
        this.Hw = r2[255(0xff, float:3.57E-43)];
        this.j6 = new byte[20];
        byte[] r11 = this.j6;
        abcd.BK.j6(r7, r11, 0, r11.length);
    }

    private static int Zo(int r0) {
        return (r0 * 24) + 4;
    }

    static byte[][] j6(abcd.dH r0) {
        return r0.FH;
    }

    @Override
    public long DW() {
        java.util.Iterator<abcd.AbstractbH.b> r0 = iterator();
        long r1 = 0;
    L4:
        if (r0.hasNext() == false) goto L5;
        if (r0.next().j6() < 2147483647L) goto L4;
        r1 = r1 + 1;
        goto L4
    L5:
        return r1;
    }

    @Override
    public long DW(abcd.YD r10) {
        byte[] r0 = this.FH[r10.Zo()];
        if (r0 != null) goto L5;
        return -1;
    L5:
        int r3 = r0.length / 24;
        int r5 = 0;
    L6:
        int r6 = (r5 + r3) >>> 1;
        int r7 = Zo(r6);
        int r8 = r10.j6(r0, r7);
        if (r8 >= 0) goto L9;
        r3 = r6;
    L13:
        if (r5 < r3) goto L6;
        return -1;
    L9:
        if (r8 == 0) goto L10;
        r5 = r6 + 1;
        goto L13
    L10:
        int r11 = r0[r7 - 4] & 255;
        int r1 = r0[r7 - 3] & 255;
        return (((long) ((r0[r7 - 2] & 255) << 8)) | ((((long) r11) << 24) | ((long) (r1 << 16)))) | ((long) (r0[r7 - 1] & 255));
    }

    @Override
    public boolean FH() {
        return false;
    }

    @Override
    public java.util.Iterator<abcd.AbstractbH.b> iterator() {
        return new abcd.dH.a(this, null);
    }

    @Override
    public long j6() {
        return this.Hw;
    }

    @Override
    public long j6(abcd.YD r1) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public abcd.yE j6(long r7) {
        int r0 = java.util.Arrays.binarySearch(this.DW, 1 + r7);
        if (r0 < 0) goto L10;
        long r2 = this.DW[r0];
    L5:
        if (r0 <= 0) goto L11;
        if (r2 != this.DW[r0 - 1]) goto L11;
        r0 = r0 - 1;
    L11:
        if (r0 <= 0) goto L13;
        long r3 = this.DW[r0 - 1];
    L15:
        return abcd.yE.Hw(this.FH[r0], Zo((int) (r7 - r3)));
    L13:
        r3 = 0;
        goto L15
    L10:
        r0 = -(r0 + 1);
        goto L11
    }

    @Override
    public void j6(java.util.Set<abcd.yE> r7, abcd.WD r8, int r9) {
        byte[] r0 = this.FH[r8.j6()];
        if (r0 != null) goto L5;
        return;
    L5:
        int r1 = r0.length / 24;
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
        r7.add(abcd.yE.Hw(r0, Zo(r4)));
        if (r7.size() > r9) goto L38;
        r4 = r4 + 1;
        goto L15
    L38:
        return;
    L23:
        return;
    }
}
