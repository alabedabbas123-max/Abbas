package com.jcraft.jsch.jcraft;

public class Compression implements com.jcraft.jsch.Compression {
    private int DW;
    private abcd.Oy FH;
    private byte[] Hw;
    private final int j6;
    private byte[] v5;

    public Compression() {
        this.j6 = 52;
        this.Hw = new byte[4096];
        this.FH = new abcd.Oy();
    }

    @Override
    public byte[] DW(byte[] r9, int r10, int[] r11) {
        abcd.Oy r0 = this.FH;
        r0.j6 = r9;
        r0.DW = r10;
        r0.FH = r11[0];
        int r1 = 0;
    L3:
        abcd.Oy r2 = this.FH;
        r2.v5 = this.Hw;
        r2.Zo = 0;
        r2.VH = 4096;
        int r3 = r2.FH(1);
        if (r3 == (-5)) goto L16;
        if (r3 != 0) goto L6;
        byte[] r4 = this.v5;
        int r5 = r4.length;
        int r6 = r1 + 4096;
        int r7 = this.FH.VH;
        if (r5 >= (r6 - r7)) goto L14;
        int r8 = r4.length * 2;
        if (r8 >= (r6 - r7)) goto L13;
        r8 = r6 - r7;
    L13:
        byte[] r12 = new byte[r8];
        java.lang.System.arraycopy(this.v5, 0, r12, 0, r1);
        this.v5 = r12;
    L14:
        java.lang.System.arraycopy(this.Hw, 0, this.v5, r1, 4096 - this.FH.VH);
        r1 = r1 + (4096 - this.FH.VH);
        r11[0] = r1;
        goto L3
    L6:
        java.lang.System.err.println("uncompress: inflate returnd " + r3);
        return null;
    L16:
        if (r1 <= (r9.length - r10)) goto L18;
        byte[] r13 = new byte[r1 + r10];
        java.lang.System.arraycopy(r9, 0, r13, 0, r10);
        java.lang.System.arraycopy(this.v5, 0, r13, r10, r1);
        r9 = r13;
    L19:
        r11[0] = r1;
        return r9;
    L18:
        java.lang.System.arraycopy(this.v5, 0, r9, r10, r1);
        goto L19
    }

    @Override
    public void j6(int r2, int r3) {
        if (r2 != 1) goto L5;
        this.FH.DW(r3);
        this.DW = 1;
        return;
    L5:
        if (r2 != 0) goto L9;
        this.FH.DW();
        this.v5 = new byte[4096];
        this.DW = 0;
        return;
    }

    @Override
    public byte[] j6(byte[] r6, int r7, int[] r8) {
        abcd.Oy r0 = this.FH;
        r0.j6 = r6;
        r0.DW = r7;
        r0.FH = r8[0] - r7;
    L3:
        abcd.Oy r1 = this.FH;
        r1.v5 = this.Hw;
        r1.Zo = 0;
        r1.VH = 4096;
        int r2 = r1.j6(1);
        if (r2 == 0) goto L6;
        java.lang.System.err.println("compress: deflate returnd " + r2);
    L11:
        if (this.FH.VH == 0) goto L3;
        r8[0] = r7;
        return r6;
    L6:
        int r3 = 4096 - this.FH.VH;
        int r4 = r7 + r3;
        int r5 = r4 + 52;
        if (r6.length >= r5) goto L9;
        byte[] r9 = new byte[r5 * 2];
        java.lang.System.arraycopy(r6, 0, r9, 0, r6.length);
        r6 = r9;
    L9:
        java.lang.System.arraycopy(this.Hw, 0, r6, r7, r3);
        r7 = r4;
        goto L11
    }
}
