package abcd;

public class wO implements abcd.InterfacetO {
    private static final byte[] j6 = null;
    private byte[] DW;
    private byte[] EQ;
    private byte[] FH;
    private byte[] Hw;
    byte[] J0;
    short[] J8;
    byte[] QX;
    private byte[] VH;
    short[] Ws;
    byte[] XL;
    private byte[][] Zo;
    byte[] aM;
    private int gn;
    byte[] j3;
    private abcd.InterfacepO tp;
    private long u7;
    private byte[] v5;
    private byte[] we;

    static {
        j6 = new byte[]{0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};
    }

    public wO() {
        this.DW = new byte[32];
        this.FH = new byte[32];
        this.Hw = new byte[32];
        this.v5 = new byte[32];
        this.Zo = (byte[][]) java.lang.reflect.Array.newInstance(byte.class, new int[]{4, 32});
        this.VH = new byte[32];
        this.tp = new abcd.KO();
        this.we = new byte[32];
        this.J0 = new byte[8];
        this.J8 = new short[16];
        this.Ws = new short[16];
        this.QX = new byte[32];
        this.XL = new byte[32];
        this.aM = new byte[32];
        this.j3 = new byte[32];
        this.EQ = abcd.KO.j6("D-A");
        this.tp.j6(true, new abcd.YO(null, this.EQ));
        reset();
    }

    private byte[] DW(byte[] r6) {
        int r0 = 0;
    L4:
        if (r0 >= 8) goto L6;
        byte[] r1 = this.we;
        int r2 = r0 * 4;
        r1[r2] = r6[r0];
        r1[r2 + 1] = r6[r0 + 8];
        r1[r2 + 2] = r6[r0 + 16];
        r1[r2 + 3] = r6[r0 + 24];
        r0 = r0 + 1;
        goto L4
    L6:
        return this.we;
    }

    private void FH() {
        abcd.ZO.DW(this.u7 * 8, this.FH, 0);
    L4:
        if (this.gn == 0) goto L5;
        j6((byte) 0);
        goto L4
    L5:
        DW(this.FH, 0);
        DW(this.v5, 0);
    }

    private void FH(byte[] r8) {
        j6(r8, this.J8);
        short[] r0 = this.Ws;
        short[] r1 = this.J8;
        r0[15] = (short) (((((r1[0] ^ r1[1]) ^ r1[2]) ^ r1[3]) ^ r1[12]) ^ r1[15]);
        java.lang.System.arraycopy(r1, 1, r0, 0, 15);
        j6(this.Ws, r8);
    }

    private void Hw(byte[] r6) {
        int r0 = 0;
        int r1 = 0;
    L3:
        byte[] r2 = this.v5;
        if (r0 == r2.length) goto L5;
        int r3 = ((r2[r0] & 255) + (r6[r0] & 255)) + r1;
        r2[r0] = (byte) r3;
        r1 = r3 >>> 8;
        r0 = r0 + 1;
        goto L3
    }

    private void j6(byte[] r3, byte[] r4, int r5, byte[] r6, int r7) {
        this.tp.j6(true, new abcd.XO(r3));
        this.tp.j6(r6, r7, r4, r5);
    }

    private void j6(byte[] r5, short[] r6) {
        int r0 = 0;
    L4:
        if (r0 >= (r5.length / 2)) goto L5;
        int r1 = r0 * 2;
        int r2 = (r5[r1 + 1] << 8) & 65280;
        r6[r0] = (short) ((r5[r1] & 255) | r2);
        r0 = r0 + 1;
        goto L4
    }

    private void j6(short[] r5, byte[] r6) {
        int r0 = 0;
    L4:
        if (r0 >= (r6.length / 2)) goto L5;
        int r1 = r0 * 2;
        r6[r1 + 1] = (byte) (r5[r0] >> 8);
        r6[r1] = (byte) r5[r0];
        r0 = r0 + 1;
        goto L4
    }

    private byte[] j6(byte[] r6) {
        int r1 = 0;
    L4:
        if (r1 >= 8) goto L5;
        this.J0[r1] = (byte) (r6[r1] ^ r6[r1 + 8]);
        r1 = r1 + 1;
        goto L4
    L5:
        java.lang.System.arraycopy(r6, 8, r6, 0, 24);
        java.lang.System.arraycopy(this.J0, 0, r6, 24, 8);
        return r6;
    }

    @Override
    public int DW() {
        return 32;
    }

    protected void DW(byte[] r10, int r11) {
        java.lang.System.arraycopy(r10, r11, this.Hw, 0, 32);
        java.lang.System.arraycopy(this.DW, 0, this.XL, 0, 32);
        java.lang.System.arraycopy(this.Hw, 0, this.aM, 0, 32);
        int r12 = 0;
    L3:
        if (r12 >= 32) goto L4;
        this.j3[r12] = (byte) (this.XL[r12] ^ this.aM[r12]);
        r12 = r12 + 1;
        goto L3
    L4:
        j6(DW(this.j3), this.QX, 0, this.DW, 0);
        int r13 = 1;
    L6:
        if (r13 >= 4) goto L7;
        byte[] r0 = this.XL;
        j6(r0);
        int r14 = 0;
    L24:
        if (r14 >= 32) goto L25;
        this.XL[r14] = (byte) (r0[r14] ^ this.Zo[r13][r14]);
        r14 = r14 + 1;
        goto L24
    L25:
        byte[] r15 = this.aM;
        j6(r15);
        j6(r15);
        this.aM = r15;
        int r16 = 0;
    L26:
        if (r16 >= 32) goto L27;
        this.j3[r16] = (byte) (this.XL[r16] ^ this.aM[r16]);
        r16 = r16 + 1;
        goto L26
    L27:
        int r8 = r13 * 8;
        j6(DW(this.j3), this.QX, r8, this.DW, r8);
        r13 = r13 + 1;
        goto L6
    L7:
        int r17 = 0;
    L9:
        if (r17 >= 12) goto L10;
        FH(this.QX);
        r17 = r17 + 1;
        goto L9
    L10:
        int r18 = 0;
    L11:
        if (r18 >= 32) goto L12;
        byte[] r19 = this.QX;
        r19[r18] = (byte) (r19[r18] ^ this.Hw[r18]);
        r18 = r18 + 1;
        goto L11
    L12:
        FH(this.QX);
        int r110 = 0;
    L13:
        if (r110 >= 32) goto L14;
        byte[] r111 = this.QX;
        r111[r110] = (byte) (this.DW[r110] ^ r111[r110]);
        r110 = r110 + 1;
        goto L13
    L14:
        int r112 = 0;
    L16:
        if (r112 >= 61) goto L17;
        FH(this.QX);
        r112 = r112 + 1;
        goto L16
    L17:
        byte[] r113 = this.QX;
        byte[] r114 = this.DW;
        java.lang.System.arraycopy(r113, 0, r114, 0, r114.length);
    }

    @Override
    public int j6(byte[] r4, int r5) {
        FH();
        byte[] r0 = this.DW;
        java.lang.System.arraycopy(r0, 0, r4, r5, r0.length);
        reset();
        return 32;
    }

    @Override
    public java.lang.String j6() {
        return "GOST3411";
    }

    @Override
    public void j6(byte r5) {
        byte[] r0 = this.VH;
        int r1 = this.gn;
        this.gn = r1 + 1;
        r0[r1] = r5;
        if (this.gn != r0.length) goto L5;
        Hw(r0);
        DW(this.VH, 0);
        this.gn = 0;
    L5:
        this.u7++;
    }

    @Override
    public void reset() {
        this.u7 = 0;
        this.gn = 0;
        int r1 = 0;
    L3:
        byte[] r2 = this.DW;
        if (r1 >= r2.length) goto L5;
        r2[r1] = 0;
        r1 = r1 + 1;
        goto L3
    L5:
        int r3 = 0;
    L6:
        byte[] r4 = this.FH;
        if (r3 >= r4.length) goto L8;
        r4[r3] = 0;
        r3 = r3 + 1;
        goto L6
    L8:
        int r5 = 0;
    L9:
        byte[] r6 = this.Hw;
        if (r5 >= r6.length) goto L11;
        r6[r5] = 0;
        r5 = r5 + 1;
        goto L9
    L11:
        int r7 = 0;
    L12:
        byte[][] r8 = this.Zo;
        if (r7 >= r8[1].length) goto L14;
        r8[1][r7] = 0;
        r7 = r7 + 1;
        goto L12
    L14:
        int r9 = 0;
    L15:
        byte[][] r10 = this.Zo;
        if (r9 >= r10[3].length) goto L17;
        r10[3][r9] = 0;
        r9 = r9 + 1;
        goto L15
    L17:
        int r11 = 0;
    L18:
        byte[] r12 = this.v5;
        if (r11 >= r12.length) goto L20;
        r12[r11] = 0;
        r11 = r11 + 1;
        goto L18
    L20:
        int r13 = 0;
    L21:
        byte[] r14 = this.VH;
        if (r13 >= r14.length) goto L23;
        r14[r13] = 0;
        r13 = r13 + 1;
        goto L21
    L23:
        byte[] r15 = j6;
        java.lang.System.arraycopy(r15, 0, this.Zo[2], 0, r15.length);
    }

    @Override
    public void update(byte[] r6, int r7, int r8) {
    L3:
        if (this.gn == 0) goto L7;
        if (r8 <= 0) goto L7;
        j6(r6[r7]);
        r7 = r7 + 1;
        r8 = r8 - 1;
    L7:
        byte[] r0 = this.VH;
        if (r8 <= r0.length) goto L9;
        java.lang.System.arraycopy(r6, r7, r0, 0, r0.length);
        Hw(this.VH);
        DW(this.VH, 0);
        byte[] r1 = this.VH;
        r7 = r7 + r1.length;
        r8 = r8 - r1.length;
        this.u7 += (long) r1.length;
    L9:
        if (r8 <= 0) goto L10;
        j6(r6[r7]);
        r7 = r7 + 1;
        r8 = r8 - 1;
        goto L9
    }
}
