package abcd;

public class yE extends abcd.YD implements java.io.Serializable {
    private static final abcd.yE gn = null;
    private static final java.lang.String u7 = null;

    static {
        gn = new abcd.yE(0, 0, 0, 0, 0);
        u7 = gn.we();
    }

    yE(int r1, int r2, int r3, int r4, int r5) {
        this.FH = r1;
        this.Hw = r2;
        this.v5 = r3;
        this.Zo = r4;
        this.VH = r5;
    }

    protected yE(abcd.YD r2) {
        this.FH = r2.FH;
        this.Hw = r2.Hw;
        this.v5 = r2.v5;
        this.Zo = r2.Zo;
        this.VH = r2.VH;
    }

    public static final abcd.yE DW(int[] r7, int r8) {
        return new abcd.yE(r7[r8], r7[r8 + 1], r7[r8 + 2], r7[r8 + 3], r7[r8 + 4]);
    }

    public static final boolean DW(java.lang.String r4) {
        if (r4.length() == 40) goto L5;
        return false;
    L5:
        int r0 = 0;
    L6:
        if (r0 >= 40) goto L7;
        abcd.IK.j6((byte) r4.charAt(r0));     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L11
        r0 = r0 + 1;
    L11:
        return false;
    L7:
        return true;
    }

    public static final abcd.yE Hw(byte[] r6, int r7) {
        return new abcd.yE(abcd.FK.j6(r6, r7), abcd.FK.j6(r6, r7 + 4), abcd.FK.j6(r6, r7 + 8), abcd.FK.j6(r6, r7 + 12), abcd.FK.j6(r6, r7 + 16));
    }

    public static final abcd.yE Ws() {
        return gn;
    }

    private static final abcd.yE Zo(byte[] r7, int r8) {
        return new abcd.yE(abcd.IK.gn(r7, r8), abcd.IK.gn(r7, r8 + 8), abcd.IK.gn(r7, r8 + 16), abcd.IK.gn(r7, r8 + 24), abcd.IK.gn(r7, r8 + 32));
    L5:
        throw new abcd.aD(r7, r8, 40);
    }

    public static abcd.yE j6(java.lang.String r3) {
        if (r3.length() != 40) goto L7;
        return Zo(abcd.hE.DW(r3), 0);
    L7:
        throw new java.lang.IllegalArgumentException("Invalid id: " + r3);
    }

    public static final abcd.yE j6(byte[] r1) {
        return Hw(r1, 0);
    }

    public static final java.lang.String j6(abcd.yE r0) {
        if (r0 == null) goto L5;
        return r0.we();
    L5:
        return u7;
    }

    public static boolean j6(byte[] r2, int r3, byte[] r4, int r5) {
        if (r2[r3] == r4[r5]) goto L5;
        return false;
    L5:
        if (r2[r3 + 1] == r4[r5 + 1]) goto L7;
        return false;
    L7:
        if (r2[r3 + 2] == r4[r5 + 2]) goto L9;
        return false;
    L9:
        if (r2[r3 + 3] == r4[r5 + 3]) goto L11;
        return false;
    L11:
        if (r2[r3 + 4] == r4[r5 + 4]) goto L13;
        return false;
    L13:
        if (r2[r3 + 5] == r4[r5 + 5]) goto L15;
        return false;
    L15:
        if (r2[r3 + 6] == r4[r5 + 6]) goto L17;
        return false;
    L17:
        if (r2[r3 + 7] == r4[r5 + 7]) goto L19;
        return false;
    L19:
        if (r2[r3 + 8] == r4[r5 + 8]) goto L21;
        return false;
    L21:
        if (r2[r3 + 9] == r4[r5 + 9]) goto L23;
        return false;
    L23:
        if (r2[r3 + 10] == r4[r5 + 10]) goto L25;
        return false;
    L25:
        if (r2[r3 + 11] == r4[r5 + 11]) goto L27;
        return false;
    L27:
        if (r2[r3 + 12] == r4[r5 + 12]) goto L29;
        return false;
    L29:
        if (r2[r3 + 13] == r4[r5 + 13]) goto L31;
        return false;
    L31:
        if (r2[r3 + 14] == r4[r5 + 14]) goto L33;
        return false;
    L33:
        if (r2[r3 + 15] == r4[r5 + 15]) goto L35;
        return false;
    L35:
        if (r2[r3 + 16] == r4[r5 + 16]) goto L37;
        return false;
    L37:
        if (r2[r3 + 17] == r4[r5 + 17]) goto L39;
        return false;
    L39:
        if (r2[r3 + 18] == r4[r5 + 18]) goto L41;
        return false;
    L41:
        if (r2[r3 + 19] != r4[r5 + 19]) goto L64;
        return true;
    L64:
        return false;
    }

    public static final abcd.yE v5(byte[] r0, int r1) {
        return Zo(r0, r1);
    }

    @Override
    public abcd.yE J8() {
        return this;
    }
}
