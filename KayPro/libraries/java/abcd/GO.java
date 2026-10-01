package abcd;

public class GO extends abcd.AbstractxO {
    static final int[] Hw = null;
    private int EQ;
    private int[] J0;
    private int J8;
    private int VH;
    private int Zo;
    private int gn;
    private int tp;
    private int u7;
    private int v5;
    private int we;

    static {
        Hw = new int[]{1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    }

    public GO() {
        this.J0 = new int[64];
        reset();
    }

    private int DW(int r4) {
        int r0 = ((r4 >>> 6) | (r4 << 26)) ^ ((r4 >>> 11) | (r4 << 21));
        int r1 = r4 >>> 25;
        return ((r4 << 7) | r1) ^ r0;
    }

    private int DW(int r2, int r3, int r4) {
        int r0 = r2 & r3;
        return ((r2 & r4) ^ r0) ^ (r3 & r4);
    }

    private int FH(int r4) {
        int r0 = ((r4 >>> 7) | (r4 << 25)) ^ ((r4 >>> 18) | (r4 << 14));
        return (r4 >>> 3) ^ r0;
    }

    private int Hw(int r4) {
        int r0 = ((r4 >>> 17) | (r4 << 15)) ^ ((r4 >>> 19) | (r4 << 13));
        return (r4 >>> 10) ^ r0;
    }

    private int j6(int r4) {
        int r0 = ((r4 >>> 2) | (r4 << 30)) ^ ((r4 >>> 13) | (r4 << 19));
        int r1 = r4 >>> 22;
        return ((r4 << 10) | r1) ^ r0;
    }

    private int j6(int r1, int r2, int r3) {
        int r4 = r2 & r1;
        return ((r1 ^ (-1)) & r3) ^ r4;
    }

    @Override
    public int DW() {
        return 28;
    }

    @Override
    protected void DW(byte[] r4, int r5) {
        int r0 = r4[r5] << 24;
        int r6 = r5 + 1;
        int r1 = r0 | ((r4[r6] & 255) << 16);
        int r7 = r6 + 1;
        int r2 = r1 | ((r4[r7] & 255) << 8);
        int r8 = (r4[r7 + 1] & 255) | r2;
        int[] r9 = this.J0;
        int r3 = this.J8;
        r9[r3] = r8;
        int r10 = r3 + 1;
        this.J8 = r10;
        if (r10 != 16) goto L6;
        Hw();
        return;
    }

    @Override
    protected void Hw() {
        int r1 = 16;
    L4:
        if (r1 > 63) goto L5;
        int[] r2 = this.J0;
        int r3 = Hw(r2[r1 - 2]);
        int[] r4 = this.J0;
        r2[r1] = ((r3 + r4[r1 - 7]) + FH(r4[r1 - 15])) + this.J0[r1 - 16];
        r1 = r1 + 1;
        goto L4
    L5:
        int r5 = this.v5;
        int r6 = this.Zo;
        int r7 = this.VH;
        int r8 = this.gn;
        int r9 = this.u7;
        int r10 = this.tp;
        int r11 = this.EQ;
        int r12 = this.we;
        int r13 = r6;
        int r14 = r7;
        int r15 = 0;
        int r16 = r5;
        int r17 = 0;
    L7:
        if (r17 >= 8) goto L8;
        int r18 = r12 + (((DW(r9) + j6(r9, r10, r11)) + Hw[r15]) + this.J0[r15]);
        int r19 = r8 + r18;
        int r20 = r18 + (j6(r16) + DW(r16, r13, r14));
        int r21 = r15 + 1;
        int r22 = r11 + (((DW(r19) + j6(r19, r9, r10)) + Hw[r21]) + this.J0[r21]);
        int r110 = r14 + r22;
        int r23 = r22 + (j6(r20) + DW(r20, r16, r13));
        int r24 = r21 + 1;
        int r25 = r10 + (((DW(r110) + j6(r110, r19, r9)) + Hw[r24]) + this.J0[r24]);
        int r111 = r13 + r25;
        int r26 = r25 + (j6(r23) + DW(r23, r20, r16));
        int r27 = r24 + 1;
        int r28 = r9 + (((DW(r111) + j6(r111, r110, r19)) + Hw[r27]) + this.J0[r27]);
        int r29 = r16 + r28;
        int r30 = r28 + (j6(r26) + DW(r26, r23, r20));
        int r31 = r27 + 1;
        int r32 = r19 + (((DW(r29) + j6(r29, r111, r110)) + Hw[r31]) + this.J0[r31]);
        r12 = r20 + r32;
        r8 = r32 + (j6(r30) + DW(r30, r26, r23));
        int r33 = r31 + 1;
        int r112 = r110 + (((DW(r12) + j6(r12, r29, r111)) + Hw[r33]) + this.J0[r33]);
        r11 = r23 + r112;
        r14 = r112 + (j6(r8) + DW(r8, r30, r26));
        int r34 = r33 + 1;
        int r113 = r111 + (((DW(r11) + j6(r11, r12, r29)) + Hw[r34]) + this.J0[r34]);
        r10 = r26 + r113;
        r13 = r113 + (j6(r14) + DW(r14, r8, r30));
        int r35 = r34 + 1;
        int r36 = r29 + (((DW(r10) + j6(r10, r11, r12)) + Hw[r35]) + this.J0[r35]);
        r9 = r30 + r36;
        r16 = r36 + (j6(r13) + DW(r13, r14, r8));
        r15 = r35 + 1;
        r17 = r17 + 1;
        goto L7
    L8:
        this.v5 += r16;
        this.Zo += r13;
        this.VH += r14;
        this.gn += r8;
        this.u7 += r9;
        this.tp += r10;
        this.EQ += r11;
        this.we += r12;
        this.J8 = 0;
        int r37 = 0;
    L9:
        if (r37 >= 16) goto L10;
        this.J0[r37] = 0;
        r37 = r37 + 1;
        goto L9
    }

    @Override
    public int j6(byte[] r3, int r4) {
        FH();
        abcd.ZO.j6(this.v5, r3, r4);
        abcd.ZO.j6(this.Zo, r3, r4 + 4);
        abcd.ZO.j6(this.VH, r3, r4 + 8);
        abcd.ZO.j6(this.gn, r3, r4 + 12);
        abcd.ZO.j6(this.u7, r3, r4 + 16);
        abcd.ZO.j6(this.tp, r3, r4 + 20);
        abcd.ZO.j6(this.EQ, r3, r4 + 24);
        reset();
        return 28;
    }

    @Override
    public java.lang.String j6() {
        return "SHA-224";
    }

    @Override
    protected void j6(long r5) {
        if (this.J8 <= 14) goto L5;
        Hw();
    L5:
        int[] r0 = this.J0;
        r0[14] = (int) (r5 >>> 32);
        r0[15] = (int) (r5 & (-1));
    }

    @Override
    public void reset() {
        super.reset();
        this.v5 = -1056596264;
        this.Zo = 914150663;
        this.VH = 812702999;
        this.gn = -150054599;
        this.u7 = -4191439;
        this.tp = 1750603025;
        this.EQ = 1694076839;
        this.we = -1090891868;
        this.J8 = 0;
        int r1 = 0;
    L3:
        int[] r2 = this.J0;
        if (r1 == r2.length) goto L5;
        r2[r1] = 0;
        r1 = r1 + 1;
        goto L3
    }
}
