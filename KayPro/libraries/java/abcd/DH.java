package abcd;

public class DH {
    private final byte[] DW;
    private final int FH;
    private int Hw;
    private final java.io.OutputStream j6;

    public DH(java.io.OutputStream r2, long r3, long r5, int r7) {
        this.DW = new byte[32];
        this.j6 = r2;
        this.FH = r7;
        j6(r3);
        j6(r5);
    }

    private int j6(int r12, long r13, int r15) {
        int r0 = r12 + 1;
        long r3 = r13 & 255;
        if (r3 == 0) goto L5;
        int r7 = 129;
        this.DW[r0] = (byte) r3;
        r0 = r0 + 1;
    L7:
        if ((65280 & r13) == 0) goto L10;
        r7 = r7 | 2;
        this.DW[r0] = (byte) ((r13 >>> 8) & 255);
        r0 = r0 + 1;
    L10:
        if ((16711680 & r13) == 0) goto L13;
        r7 = r7 | 4;
        this.DW[r0] = (byte) ((r13 >>> 16) & 255);
        r0 = r0 + 1;
    L13:
        if (((-16777216) & r13) == 0) goto L16;
        r7 = r7 | 8;
        this.DW[r0] = (byte) ((r13 >>> 24) & 255);
        r0 = r0 + 1;
    L16:
        if (r15 == 65536) goto L26;
        int r14 = r15 & 255;
        if (r14 == 0) goto L21;
        r7 = r7 | 16;
        this.DW[r0] = (byte) r14;
        r0 = r0 + 1;
    L21:
        if ((65280 & r15) == 0) goto L24;
        this.DW[r0] = (byte) ((r15 >>> 8) & 255);
        r7 = r7 | 32;
        r0 = r0 + 1;
    L24:
        if ((16711680 & r15) == 0) goto L26;
        r7 = r7 | 64;
        this.DW[r0] = (byte) ((r15 >>> 16) & 255);
        r0 = r0 + 1;
    L26:
        this.DW[r12] = (byte) r7;
        return r0;
    L5:
        r7 = 128;
        goto L7
    }

    private void j6(long r6) {
        int r1 = 0;
    L4:
        if (r6 < 128) goto L5;
        this.DW[r1] = (byte) ((((int) r6) & 127) | 128);
        r6 = r6 >>> 7;
        r1 = r1 + 1;
        goto L4
    L5:
        int r3 = r1 + 1;
        this.DW[r1] = (byte) (((int) r6) & 127);
        this.Hw += r3;
        int r7 = this.FH;
        if (r7 > 0) goto L8;
    L9:
        this.j6.write(this.DW, 0, r3);
        return;
    L8:
        if (this.Hw < r7) goto L9;
    }

    public boolean j6(long r7, int r9) {
        if (r9 != 0) goto L5;
        return true;
    L5:
        long r2 = r7;
    L6:
        int r8 = 0;
    L8:
        if (65536 >= r9) goto L9;
        r8 = j6(r8, r2, 65536);
        r2 = r2 + 65536;
        r9 = r9 - 65536;
        if (this.DW.length >= (r8 + 8)) goto L8;
        int r10 = this.FH;
        if (r10 <= 0) goto L23;
        if (r10 >= (this.Hw + r8)) goto L23;
        return false;
    L23:
        this.j6.write(this.DW, 0, r8);
        this.Hw += r8;
        goto L6
    L9:
        int r11 = j6(r8, r2, r9);
        int r12 = this.FH;
        if (r12 > 0) goto L12;
    L14:
        this.j6.write(this.DW, 0, r11);
        this.Hw += r11;
        return true;
    L12:
        if (r12 >= (this.Hw + r11)) goto L14;
        return false;
    }

    public boolean j6(byte[] r3) {
        return j6(r3, 0, r3.length);
    }

    public boolean j6(byte[] r5, int r6, int r7) {
        if (r7 > 0) goto L6;
        return true;
    L6:
        if (this.FH <= 0) goto L14;
        int r1 = r7 / 127;
        if ((r7 % 127) == 0) goto L11;
        r1 = r1 + 1;
    L11:
        if (this.FH >= ((this.Hw + r1) + r7)) goto L14;
        return false;
    L14:
        int r2 = java.lang.Math.min(127, r7);
        this.j6.write((byte) r2);
        this.j6.write(r5, r6, r2);
        r6 = r6 + r2;
        r7 = r7 - r2;
        this.Hw += r2 + 1;
        if (r7 > 0) goto L14;
        return true;
    }
}
