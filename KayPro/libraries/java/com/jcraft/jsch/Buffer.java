package com.jcraft.jsch;

public class Buffer {
    byte[] DW;
    int FH;
    int Hw;
    final byte[] j6;

    public Buffer() {
        this(20480);
    }

    public Buffer(int r2) {
        this.j6 = new byte[4];
        this.DW = new byte[r2];
        this.FH = 0;
        this.Hw = 0;
    }

    public Buffer(byte[] r2) {
        this.j6 = new byte[4];
        this.DW = r2;
        this.FH = 0;
        this.Hw = 0;
    }

    static com.jcraft.jsch.Buffer j6(byte[][] r4) {
        int r1 = 0;
        int r2 = r4.length * 4;
        int r0 = 0;
    L4:
        if (r0 >= r4.length) goto L5;
        r2 = r2 + r4[r0].length;
        r0 = r0 + 1;
        goto L4
    L5:
        com.jcraft.jsch.Buffer r3 = new com.jcraft.jsch.Buffer(r2);
    L7:
        if (r1 >= r4.length) goto L8;
        r3.Hw(r4[r1]);
        r1 = r1 + 1;
        goto L7
    L8:
        return r3;
    }

    byte DW() {
        return this.DW[5];
    }

    public int DW(int r2) {
        int r0 = this.Hw;
        this.Hw = r2 + r0;
        return r0;
    }

    public void DW(byte[] r3) {
        DW(r3, 0, r3.length);
    }

    public void DW(byte[] r3, int r4, int r5) {
        java.lang.System.arraycopy(r3, r4, this.DW, this.FH, r5);
        this.FH += r5;
    }

    public long EQ() {
        long r0 = ((((long) j6()) << 8) & 65280) | ((long) (j6() & 255));
        return ((r0 << 16) & (-65536)) | (((65280 & (((long) j6()) << 8)) | ((long) (j6() & 255))) & 65535);
    }

    public int FH() {
        return ((u7() << 16) & (-65536)) | (u7() & 65535);
    }

    public void FH(int r5) {
        byte[] r0 = this.j6;
        r0[0] = (byte) (r5 >>> 24);
        r0[1] = (byte) (r5 >>> 16);
        r0[2] = (byte) (r5 >>> 8);
        r0[3] = (byte) r5;
        java.lang.System.arraycopy(r0, 0, this.DW, this.FH, 4);
        this.FH += 4;
    }

    public void FH(byte[] r4) {
        int r0 = r4.length;
        if ((r4[0] & 128) == 0) goto L5;
        FH(r0 + 1);
        j6((byte) 0);
    L6:
        DW(r4);
        return;
    L5:
        FH(r0);
        goto L6
    }

    public void FH(byte[] r1, int r2, int r3) {
        FH(r3);
        DW(r1, r2, r3);
    }

    public int Hw() {
        return this.FH - this.Hw;
    }

    public void Hw(int r1) {
        this.Hw = r1;
    }

    public void Hw(byte[] r3) {
        FH(r3, 0, r3.length);
    }

    void J0() {
        this.Hw = 0;
    }

    public void J8() {
        int r0 = this.Hw;
        if (r0 != 0) goto L5;
        return;
    L5:
        byte[] r1 = this.DW;
        java.lang.System.arraycopy(r1, r0, r1, 0, this.FH - r0);
        this.FH -= this.Hw;
        this.Hw = 0;
    }

    public byte[] VH() {
        int r0 = (FH() + 7) / 8;
        byte[] r1 = new byte[r0];
        j6(r1, 0, r0);
        if ((r1[0] & 128) == 0) goto L6;
        byte[] r2 = new byte[r1.length + 1];
        r2[0] = 0;
        java.lang.System.arraycopy(r1, 0, r2, 1, r1.length);
        return r2;
    L6:
        return r1;
    }

    public byte[] Zo() {
        int r0 = FH();
        if (r0 < 0) goto L5;
        if (r0 > 8192) goto L5;
    L6:
        byte[] r1 = new byte[r0];
        j6(r1, 0, r0);
        return r1;
    L5:
        r0 = 8192;
        goto L6
    }

    public int gn() {
        return this.Hw;
    }

    public int j6() {
        byte[] r0 = this.DW;
        int r1 = this.Hw;
        this.Hw = r1 + 1;
        return r0[r1] & 255;
    }

    public void j6(byte r4) {
        byte[] r0 = this.DW;
        int r1 = this.FH;
        this.FH = r1 + 1;
        r0[r1] = r4;
    }

    void j6(int r4) {
        int r0 = (this.FH + r4) + 84;
        byte[] r5 = this.DW;
        if (r5.length >= r0) goto L9;
        int r6 = r5.length * 2;
        if (r6 >= r0) goto L7;
        r6 = r0;
    L7:
        byte[] r7 = new byte[r6];
        java.lang.System.arraycopy(this.DW, 0, r7, 0, this.FH);
        this.DW = r7;
        return;
    }

    public void j6(long r11) {
        byte[] r0 = this.j6;
        r0[0] = (byte) (r11 >>> 56);
        r0[1] = (byte) (r11 >>> 48);
        r0[2] = (byte) (r11 >>> 40);
        r0[3] = (byte) (r11 >>> 32);
        java.lang.System.arraycopy(r0, 0, this.DW, this.FH, 4);
        byte[] r1 = this.j6;
        r1[0] = (byte) (r11 >>> 24);
        r1[1] = (byte) (r11 >>> 16);
        r1[2] = (byte) (r11 >>> 8);
        r1[3] = (byte) r11;
        java.lang.System.arraycopy(r1, 0, this.DW, this.FH + 4, 4);
        this.FH += 8;
    }

    public void j6(byte[] r3) {
        j6(r3, 0, r3.length);
    }

    void j6(byte[] r3, int r4, int r5) {
        java.lang.System.arraycopy(this.DW, this.Hw, r3, r4, r5);
        this.Hw += r5;
    }

    byte[] j6(int[] r4, int[] r5) {
        int r0 = FH();
        r4[0] = DW(r0);
        r5[0] = r0;
        return this.DW;
    }

    byte[][] j6(int r5, java.lang.String r6) {
        byte[][] r0 = new byte[r5][];
        int r1 = 0;
    L3:
        if (r1 >= r5) goto L4;
        int r2 = FH();
        if (Hw() < r2) goto L9;
        r0[r1] = new byte[r2];
        j6(r0[r1]);
        r1 = r1 + 1;
        goto L3
    L9:
        throw new com.jcraft.jsch.JSchException(r6);
    L4:
        return r0;
    }

    public byte[] tp() {
        int r0 = FH();
        if (r0 < 0) goto L5;
        if (r0 > 262144) goto L5;
    L6:
        byte[] r1 = new byte[r0];
        j6(r1, 0, r0);
        return r1;
    L5:
        r0 = 262144;
        goto L6
    }

    int u7() {
        return ((j6() << 8) & 65280) | (j6() & 255);
    }

    public long v5() {
        return ((((long) FH()) & 4294967295L) << 32) | (4294967295L & ((long) FH()));
    }

    void v5(int r2) {
        this.FH += r2;
    }

    public void we() {
        this.FH = 0;
        this.Hw = 0;
    }
}
