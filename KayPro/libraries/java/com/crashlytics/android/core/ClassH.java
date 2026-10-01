package com.crashlytics.android.core;

final class ClassH implements java.io.Flushable {
    private final int DW;
    private int FH;
    private final java.io.OutputStream Hw;
    private final byte[] j6;

    static class a extends java.io.IOException {
        a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private ClassH(java.io.OutputStream r1, byte[] r2) {
        this.Hw = r1;
        this.j6 = r2;
        this.FH = 0;
        this.DW = r2.length;
    }

    public static int DW(int r0) {
        if (r0 >= 0) goto L4;
        return 10;
    L4:
        return FH(r0);
    }

    public static int DW(int r0, int r1) {
        return v5(r0) + Hw(r1);
    }

    public static int DW(long r0) {
        return j6(r0);
    }

    public static int FH(int r1) {
        if ((r1 & (-128)) != 0) goto L7;
        return 1;
    L7:
        if ((r1 & (-16384)) != 0) goto L11;
        return 2;
    L11:
        if (((-2097152) & r1) != 0) goto L15;
        return 3;
    L15:
        if ((r1 & (-268435456)) != 0) goto L18;
        return 4;
    L18:
        return 5;
    }

    public static int FH(int r0, int r1) {
        return v5(r0) + Zo(r1);
    }

    public static int Hw(int r0) {
        return FH(VH(r0));
    }

    public static int VH(int r1) {
        int r0 = r1 << 1;
        return (r1 >> 31) ^ r0;
    }

    public static int Zo(int r0) {
        return FH(r0);
    }

    public static int j6(float r0) {
        return 4;
    }

    public static int j6(int r0) {
        return DW(r0);
    }

    public static int j6(int r0, float r1) {
        return v5(r0) + j6(r1);
    }

    public static int j6(int r0, int r1) {
        return v5(r0) + j6(r1);
    }

    public static int j6(int r0, long r1) {
        return v5(r0) + DW(r1);
    }

    public static int j6(int r0, com.crashlytics.android.core.ClassD r1) {
        return v5(r0) + j6(r1);
    }

    public static int j6(int r0, boolean r1) {
        return v5(r0) + j6(r1);
    }

    public static int j6(long r5) {
        if (((-128) & r5) != 0) goto L7;
        return 1;
    L7:
        if (((-16384) & r5) != 0) goto L11;
        return 2;
    L11:
        if (((-2097152) & r5) != 0) goto L15;
        return 3;
    L15:
        if (((-268435456) & r5) != 0) goto L19;
        return 4;
    L19:
        if (((-34359738368L) & r5) != 0) goto L23;
        return 5;
    L23:
        if (((-4398046511104L) & r5) != 0) goto L27;
        return 6;
    L27:
        if (((-562949953421312L) & r5) != 0) goto L31;
        return 7;
    L31:
        if (((-72057594037927936L) & r5) != 0) goto L35;
        return 8;
    L35:
        if ((r5 & Long.MIN_VALUE) != 0) goto L38;
        return 9;
    L38:
        return 10;
    }

    public static int j6(com.crashlytics.android.core.ClassD r1) {
        return FH(r1.DW()) + r1.DW();
    }

    public static int j6(boolean r0) {
        return 1;
    }

    public static com.crashlytics.android.core.ClassH j6(java.io.OutputStream r1) {
        return j6(r1, 4096);
    }

    public static com.crashlytics.android.core.ClassH j6(java.io.OutputStream r1, int r2) {
        return new com.crashlytics.android.core.ClassH(r1, new byte[r2]);
    }

    private void j6() {
        java.io.OutputStream r0 = this.Hw;
        if (r0 == null) goto L7;
        r0.write(this.j6, 0, this.FH);
        this.FH = 0;
        return;
    L7:
        throw new com.crashlytics.android.core.ClassH.a();
    }

    public static int v5(int r1) {
        return FH(com.crashlytics.android.core.Wa.j6(r1, 0));
    }

    public void DW(float r1) {
        EQ(java.lang.Float.floatToRawIntBits(r1));
    }

    public void DW(int r2, float r3) {
        Zo(r2, 5);
        DW(r3);
    }

    public void DW(int r2, long r3) {
        Zo(r2, 0);
        Hw(r3);
    }

    public void DW(int r2, com.crashlytics.android.core.ClassD r3) {
        Zo(r2, 2);
        DW(r3);
    }

    public void DW(int r2, boolean r3) {
        Zo(r2, 0);
        DW(r3);
    }

    public void DW(com.crashlytics.android.core.ClassD r2) {
        we(r2.DW());
        FH(r2);
    }

    public void DW(boolean r1) {
        tp(r1 ? 1 : 0);
    }

    public void EQ(int r2) {
        tp(r2 & 255);
        tp((r2 >> 8) & 255);
        tp((r2 >> 16) & 255);
        tp((r2 >> 24) & 255);
    }

    public void FH(long r6) {
    L3:
        if (((-128) & r6) == 0) goto L4;
        tp((((int) r6) & 127) | 128);
        r6 = r6 >>> 7;
        goto L3
    L4:
        tp((int) r6);
    }

    public void FH(com.crashlytics.android.core.ClassD r3) {
        j6(r3, 0, r3.DW());
    }

    public void Hw(int r2, int r3) {
        Zo(r2, 0);
        gn(r3);
    }

    public void Hw(long r1) {
        FH(r1);
    }

    public void J0(int r1) {
        we(VH(r1));
    }

    public void J8(int r1) {
        we(r1);
    }

    public void VH(int r2, int r3) {
        Zo(r2, 0);
        J8(r3);
    }

    public void Zo(int r1, int r2) {
        we(com.crashlytics.android.core.Wa.j6(r1, r2));
    }

    @Override
    public void flush() {
        if (this.Hw == null) goto L6;
        j6();
        return;
    }

    public void gn(int r1) {
        u7(r1);
    }

    public void j6(byte r4) {
        if (this.FH != this.DW) goto L5;
        j6();
    L5:
        byte[] r0 = this.j6;
        int r1 = this.FH;
        this.FH = r1 + 1;
        r0[r1] = r4;
    }

    public void j6(com.crashlytics.android.core.ClassD r7, int r8, int r9) {
        int r0 = this.DW;
        int r1 = this.FH;
        if ((r0 - r1) < r9) goto L5;
        r7.j6(this.j6, r8, r1, r9);
        this.FH += r9;
        return;
    L5:
        int r2 = r0 - r1;
        r7.j6(this.j6, r8, r1, r2);
        int r10 = r8 + r2;
        int r11 = r9 - r2;
        this.FH = this.DW;
        j6();
        if (r11 > this.DW) goto L8;
        r7.j6(this.j6, r10, 0, r11);
        this.FH = r11;
        return;
    L8:
        java.io.InputStream r12 = r7.j6();
        long r3 = r10;
        if (r3 != r12.skip(r3)) goto L18;
    L10:
        if (r11 <= 0) goto L23;
        int r13 = java.lang.Math.min(r11, this.DW);
        int r4 = r12.read(this.j6, 0, r13);
        if (r4 != r13) goto L15;
        this.Hw.write(this.j6, 0, r4);
        r11 = r11 - r4;
        goto L10
    L15:
        throw new java.lang.IllegalStateException("Read failed.");
    L23:
        return;
    L18:
        throw new java.lang.IllegalStateException("Skip failed.");
    }

    public void j6(byte[] r3) {
        j6(r3, 0, r3.length);
    }

    public void j6(byte[] r4, int r5, int r6) {
        int r0 = this.DW;
        int r1 = this.FH;
        if ((r0 - r1) < r6) goto L5;
        java.lang.System.arraycopy(r4, r5, this.j6, r1, r6);
        this.FH += r6;
        return;
    L5:
        int r2 = r0 - r1;
        java.lang.System.arraycopy(r4, r5, this.j6, r1, r2);
        int r7 = r5 + r2;
        int r8 = r6 - r2;
        this.FH = this.DW;
        j6();
        if (r8 > this.DW) goto L8;
        java.lang.System.arraycopy(r4, r7, this.j6, 0, r8);
        this.FH = r8;
        return;
    L8:
        this.Hw.write(r4, r7, r8);
    }

    public void tp(int r1) {
        j6((byte) r1);
    }

    public void u7(int r3) {
        if (r3 < 0) goto L4;
        we(r3);
        return;
    L4:
        FH(r3);
    }

    public void v5(int r2, int r3) {
        Zo(r2, 0);
        J0(r3);
    }

    public void we(int r2) {
    L3:
        if ((r2 & (-128)) == 0) goto L4;
        tp((r2 & 127) | 128);
        r2 = r2 >>> 7;
        goto L3
    L4:
        tp(r2);
    }
}
