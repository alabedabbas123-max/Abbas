package abcd;

public class zO implements abcd.InterfacetO {
    private static final byte[] j6 = null;
    private byte[] DW;
    private int FH;
    private byte[] Hw;
    private int VH;
    private byte[] Zo;
    private int v5;

    static {
        j6 = new byte[]{41, 46, 67, -55, -94, -40, 124, 1, 61, 54, 84, -95, -20, -16, 6, 19, 98, -89, 5, -13, -64, -57, 115, -116, -104, -109, 43, -39, -68, 76, -126, -54, 30, -101, 87, 60, -3, -44, -32, 22, 103, 66, 111, 24, -118, 23, -27, 18, -66, 78, -60, -42, -38, -98, -34, 73, -96, -5, -11, -114, -69, 47, -18, 122, -87, 104, 121, -111, 21, -78, 7, 63, -108, -62, 16, -119, 11, 34, 95, 33, -128, 127, 93, -102, 90, -112, 50, 39, 53, 62, -52, -25, -65, -9, -105, 3, -1, 25, 48, -77, 72, -91, -75, -47, -41, 94, -110, 42, -84, 86, -86, -58, 79, -72, 56, -46, -106, -92, 125, -74, 118, -4, 107, -30, -100, 116, 4, -15, 69, -99, 112, 89, 100, 113, -121, 32, -122, 91, -49, 101, -26, 45, -88, 2, 27, 96, 37, -83, -82, -80, -71, -10, 28, 70, 97, 105, 52, 64, 126, 15, 85, 71, -93, 35, -35, 81, -81, 58, -61, 92, -7, -50, -70, -59, -22, 38, 44, 83, 13, 110, -123, 40, -124, 9, -45, -33, -51, -12, 65, -127, 77, 82, 106, -36, 55, -56, 108, -63, -85, -6, 36, -31, 123, 8, 12, -67, -79, 74, 120, -120, -107, -117, -29, 99, -24, 109, -23, -53, -43, -2, 59, 0, 29, 57, -14, -17, -73, 14, 102, 88, -48, -28, -90, 119, 114, -8, -21, 117, 75, 10, 49, 68, 80, -76, -113, -19, 31, 26, -37, -103, -115, 51, -97, 17, -125, 20};
    }

    public zO() {
        this.DW = new byte[48];
        this.Hw = new byte[16];
        this.Zo = new byte[16];
        reset();
    }

    @Override
    public int DW() {
        return 16;
    }

    protected void DW(byte[] r7) {
        byte r0 = this.Zo[15];
        int r1 = 0;
    L4:
        if (r1 >= 16) goto L5;
        byte[] r2 = this.Zo;
        byte r3 = r2[r1];
        r2[r1] = (byte) (j6[(r0 ^ r7[r1]) & 255] ^ r3);
        r0 = r2[r1];
        r1 = r1 + 1;
        goto L4
    }

    @Override
    public int j6(byte[] r5, int r6) {
        int r0 = this.Hw.length;
        int r1 = this.v5;
        byte r2 = (byte) (r0 - r1);
    L3:
        byte[] r3 = this.Hw;
        if (r1 >= r3.length) goto L5;
        r3[r1] = r2;
        r1 = r1 + 1;
        goto L3
    L5:
        DW(r3);
        j6(this.Hw);
        j6(this.Zo);
        java.lang.System.arraycopy(this.DW, this.FH, r5, r6, 16);
        reset();
        return 16;
    }

    @Override
    public java.lang.String j6() {
        return "MD2";
    }

    @Override
    public void j6(byte r4) {
        byte[] r0 = this.Hw;
        int r1 = this.v5;
        this.v5 = r1 + 1;
        r0[r1] = r4;
        if (this.v5 != 16) goto L6;
        DW(r0);
        j6(this.Hw);
        this.v5 = 0;
        return;
    }

    protected void j6(byte[] r7) {
        int r1 = 0;
    L4:
        if (r1 >= 16) goto L5;
        byte[] r2 = this.DW;
        r2[r1 + 16] = r7[r1];
        r2[r1 + 32] = (byte) (r7[r1] ^ r2[r1]);
        r1 = r1 + 1;
        goto L4
    L5:
        int r8 = 0;
        int r3 = 0;
    L7:
        if (r3 >= 18) goto L8;
        int r4 = r8;
        int r9 = 0;
    L11:
        if (r9 >= 48) goto L12;
        byte[] r5 = this.DW;
        byte r6 = r5[r9];
        byte r10 = (byte) (j6[r4] ^ r6);
        r5[r9] = r10;
        r4 = r10 & 255;
        r9 = r9 + 1;
        goto L11
    L12:
        r8 = (r4 + r3) % 256;
        r3 = r3 + 1;
        goto L7
    }

    @Override
    public void reset() {
        this.FH = 0;
        int r1 = 0;
    L3:
        byte[] r2 = this.DW;
        if (r1 == r2.length) goto L5;
        r2[r1] = 0;
        r1 = r1 + 1;
        goto L3
    L5:
        this.v5 = 0;
        int r3 = 0;
    L6:
        byte[] r4 = this.Hw;
        if (r3 == r4.length) goto L8;
        r4[r3] = 0;
        r3 = r3 + 1;
        goto L6
    L8:
        this.VH = 0;
        int r5 = 0;
    L9:
        byte[] r6 = this.Zo;
        if (r5 == r6.length) goto L11;
        r6[r5] = 0;
        r5 = r5 + 1;
        goto L9
    }

    @Override
    public void update(byte[] r4, int r5, int r6) {
    L3:
        if (this.v5 == 0) goto L8;
        if (r6 <= 0) goto L8;
        j6(r4[r5]);
        r5 = r5 + 1;
        r6 = r6 - 1;
    L8:
        if (r6 <= 16) goto L9;
        java.lang.System.arraycopy(r4, r5, this.Hw, 0, 16);
        DW(this.Hw);
        j6(this.Hw);
        r6 = r6 - 16;
        r5 = r5 + 16;
    L9:
        if (r6 <= 0) goto L10;
        j6(r4[r5]);
        r5 = r5 + 1;
        r6 = r6 - 1;
        goto L9
    }
}
