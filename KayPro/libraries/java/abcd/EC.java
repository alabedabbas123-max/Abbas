package abcd;

class EC {
    private static final abcd.EC.a j6 = null;
    private long DW;
    private int FH;
    private int Hw;
    private int Zo;
    private long[] v5;

    static class a extends java.lang.Exception {
        a() {
        }
    }

    static {
        j6 = new abcd.EC.a();
    }

    EC() {
        this.Zo = 8;
        int r0 = this.Zo;
        this.v5 = new long[1 << r0];
        this.Hw = j6(r0);
    }

    private int DW(int r3) {
        return (this.v5.length - this.FH) + r3;
    }

    private static long DW(long r2) {
        return r2 & 4294967295L;
    }

    private void DW() {
        int r0 = this.Zo;
        if (r0 == 30) goto L22;
        long[] r1 = this.v5;
        int r2 = r1.length;
        this.Zo = r0 + 1;
        this.Hw = j6(this.Zo);
        this.v5 = new long[1 << this.Zo];     // Catch: java.lang.OutOfMemoryError -> L19
        int r3 = 0;
    L7:
        if (r3 >= r2) goto L8;
        long r4 = r1[r3];
        if (r4 == 0) goto L18;
        int r8 = FH(FH(r4));
    L12:
        long[] r9 = this.v5;
        if (r9[r8] == 0) goto L14;
        r8 = r8 + 1;
        if (r8 < r9.length) goto L12;
        r8 = 0;
        goto L12
    L14:
        r9[r8] = r4;
    L18:
        r3 = r3 + 1;
        goto L7
    L8:
        return;
    L20:
        throw j6;
    L22:
        throw new abcd.EC.a();
    }

    private int FH(int r2) {
        return r2 >>> (31 - this.Zo);
    }

    private static int FH(long r1) {
        return (int) (r1 >>> 32);
    }

    private static int j6(int r2) {
        return ((1 << r2) * (r2 - 3)) / r2;
    }

    private static long j6(int r3, long r4) {
        if (4294967295L < r4) goto L7;
        return r4 | (((long) r3) << 32);
    L7:
        throw new abcd.EC.a();
    }

    private static long j6(abcd.EC r2, abcd.EC r3) {
        int r1 = r2.DW(0);
        int r0 = r3.DW(0);
        return j6(r2.v5, r1, r3.v5, r0);
    }

    private static long j6(long[] r7, int r8, long[] r9, int r10) {
        long r1 = 0;
        if (r8 != r7.length) goto L5;
    L25:
        return 0;
    L5:
        if (r10 == r9.length) goto L25;
        int r0 = FH(r7[r8]);
        int r3 = FH(r9[r10]);
    L8:
        if (r0 == r3) goto L9;
        if (r0 < r3) goto L17;
        r10 = r10 + 1;
        if (r10 == r9.length) goto L23;
        r3 = FH(r9[r10]);
    L23:
        return r1;
    L17:
        r8 = r8 + 1;
        if (r8 == r7.length) goto L23;
        r0 = FH(r7[r8]);
        goto L8
    L9:
        r1 = r1 + java.lang.Math.min(DW(r7[r8]), DW(r9[r10]));
        r8 = r8 + 1;
        if (r8 == r7.length) goto L23;
        r0 = FH(r7[r8]);
        r10 = r10 + 1;
        if (r10 == r9.length) goto L23;
        r3 = FH(r9[r10]);
        goto L8
    }

    int j6(abcd.EC r6, int r7) {
        long r0 = java.lang.Math.max(this.DW, r6.DW);
        if (r0 != 0) goto L6;
        return r7;
    L6:
        return (int) ((j6(r6) * ((long) r7)) / r0);
    }

    long j6(abcd.EC r3) {
        return j6(this, r3);
    }

    void j6() {
        java.util.Arrays.sort(this.v5);
    }

    void j6(int r8, int r9) {
        int r10 = (r8 * (-1640562687)) >>> 1;
        int r0 = FH(r10);
    L3:
        long[] r1 = this.v5;
        long r2 = r1[r0];
        if (r2 == 0) goto L6;
        if (FH(r2) == r10) goto L12;
        r0 = r0 + 1;
        if (r0 < this.v5.length) goto L3;
        r0 = 0;
        goto L3
    L12:
        this.v5[r0] = j6(r10, DW(r2) + ((long) r9));
        return;
    L6:
        if (this.Hw > this.FH) goto L8;
        DW();
        r0 = FH(r10);
        goto L3
    L8:
        r1[r0] = j6(r10, r9);
        this.FH++;
    }

    void j6(long r1) {
        this.DW = r1;
    }

    void j6(abcd.FE r3) {
        if (r3.Hw() == false) goto L10;
        abcd.JE r4 = r3.v5();
        j6(r4.j6());     // Catch: java.lang.Throwable -> L7
        j6(r4, this.DW);     // Catch: java.lang.Throwable -> L7
        r4.close();
        return;
    L7:
        th = move-exception;
        r4.close();
        throw th;
    L10:
        byte[] r5 = r3.j6();
        j6(r5.length);
        j6(r5, 0, r5.length);
    }

    void j6(java.io.InputStream r10, long r11) {
        byte[] r0 = new byte[4096];
        int r2 = 0;
        int r3 = 0;
    L4:
        if (0 >= r11) goto L5;
        int r4 = 5381;
        int r5 = 0;
    L7:
        if (r3 != r2) goto L13;
        r2 = r10.read(r0, 0, r0.length);
        if (r2 <= 0) goto L12;
        r3 = 0;
        goto L13
    L12:
        throw new java.io.EOFException();
    L13:
        r5 = r5 + 1;
        int r6 = r3 + 1;
        int r7 = r0[r3] & 255;
        if (r7 == 10) goto L22;
        r4 = ((r4 << 5) + r4) + r7;
        if (r5 >= 64) goto L22;
        if (r5 >= r11) goto L22;
        r3 = r6;
    L22:
        j6(r4, r5);
        r11 = r11 - ((long) r5);
        r3 = r6;
        goto L4
    }

    void j6(byte[] r5, int r6, int r7) {
    L2:
        if (r6 >= r7) goto L3;
        int r0 = r6;
        int r1 = 5381;
    L5:
        int r2 = r0 + 1;
        int r3 = r5[r0] & 255;
        if (r3 == 10) goto L14;
        r1 = ((r1 << 5) + r1) + r3;
        if (r2 >= r7) goto L14;
        if ((r2 - r6) >= 64) goto L14;
        r0 = r2;
    L14:
        j6(r1, r2 - r6);
        r6 = r2;
        goto L2
    }
}
