package abcd;

public final class IK {
    private static final byte[] DW = null;
    private static final byte[] FH = null;
    private static final java.util.Map<java.lang.String, java.nio.charset.Charset> Hw = null;
    private static final byte[] j6 = null;
    private static final byte[] v5 = null;

    static {
        Hw = new java.util.HashMap();
        Hw.put("latin-1", java.nio.charset.Charset.forName("ISO-8859-1"));
        j6 = new byte[58];
        java.util.Arrays.fill(j6, (byte) -1);
        char r0 = '0';
        char r2 = '0';
    L4:
        if (r2 > '9') goto L5;
        j6[r2] = (byte) (r2 - '0');
        r2 = (char) (r2 + 1);
        goto L4
    L5:
        DW = new byte[103];
        java.util.Arrays.fill(DW, (byte) -1);
        char r1 = '0';
    L6:
        if (r1 > '9') goto L7;
        DW[r1] = (byte) (r1 - '0');
        r1 = (char) (r1 + 1);
        goto L6
    L7:
        char r3 = 'a';
        char r4 = 'a';
    L9:
        if (r4 > 'f') goto L10;
        DW[r4] = (byte) ((r4 - 'a') + 10);
        r4 = (char) (r4 + 1);
        goto L9
    L10:
        char r5 = 'A';
        char r6 = 'A';
    L12:
        if (r6 > 'F') goto L13;
        DW[r6] = (byte) ((r6 - 'A') + 10);
        r6 = (char) (r6 + 1);
        goto L12
    L13:
        FH = new byte[123];
        FH[45] = 1;
    L14:
        if (r0 > '9') goto L16;
        FH[r0] = 1;
        r0 = (char) (r0 + 1);
    L16:
        if (r5 > 'Z') goto L18;
        FH[r5] = 1;
        r5 = (char) (r5 + 1);
    L18:
        if (r3 > 'z') goto L19;
        FH[r3] = 1;
        r3 = (char) (r3 + 1);
        goto L18
    L19:
        v5 = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
    }

    public static final int DW(byte[] r3, int r4) {
        int r0 = r3.length;
        if (r4 != 0) goto L5;
        r4 = r4 + 46;
    L5:
        if (r4 >= r0) goto L11;
        if (r3[r4] != 112) goto L11;
        r4 = r4 + 48;
    L11:
        return J0(r3, r4);
    }

    public static final int DW(byte[] r3, int r4, char r5) {
        int r0 = r3.length;
    L3:
        if (r4 >= r0) goto L4;
        int r1 = r4 + 1;
        char r6 = r3[r4];
        if (r6 == r5) goto L11;
        if (r6 == '\n') goto L11;
        r4 = r1;
    L11:
        return r1;
    L4:
        return r4;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x001f -> B:18:0x0021). Please report as a decompilation issue!!! */
    public static final long DW(byte[] r7, int r8, abcd.EK r9) {
        long r0 = 0;
        byte r2 = 0;
        int r3 = r7.length;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L29
    L4:
        if (r8 >= r3) goto L9;
        if (r7[r8] != 32) goto L9;
        r8 = r8 + 1;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L29
    L9:
        if (r8 < r3) goto L11;
        return 0;
    L11:
        byte r4 = r7[r8];     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L29
        if (r4 != 43) goto L14;
    L17:
        r8 = r8 + 1;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L29
    L18:
        if (r8 >= r3) goto L24;
        byte r5 = j6[r7[r8]];     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L29
        if (r5 < 0) goto L24;
        r0 = (r0 * 10) + ((long) r5);
        goto L17
    L14:
        if (r4 != 45) goto L18;
        r2 = -1;
    L24:
        if (r9 == null) goto L26;
        r9.j6 = r8;
    L26:
        if (r2 < 0) goto L28;
        return r0;
    L28:
        return -r0;
    }

    public static java.lang.String DW(java.nio.charset.Charset r0, byte[] r1, int r2, int r3) {
        java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r1, r2, r3 - r2);
        r4.mark();
        return j6(r4, abcd.hE.Zo);
    L5:
        r4.reset();
        if (r0.equals(abcd.hE.Zo) == false) goto L21;
    L10:
        java.nio.charset.Charset r5 = java.nio.charset.Charset.defaultCharset();
        if (r5.equals(r0) == true) goto L18;
        if (r5.equals(abcd.hE.Zo) == true) goto L18;
        return j6(r4, r5);
    L16:
        r4.reset();
    L18:
        throw new java.nio.charset.CharacterCodingException();
    L21:
        return j6(r4, r0);
    L9:
        r4.reset();
        goto L10
    }

    public static java.lang.String DW(byte[] r2, int r3, int r4) {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder(r4 - r3);
    L3:
        if (r3 >= r4) goto L5;
        r0.append((char) (r2[r3] & 255));
        r3 = r3 + 1;
        goto L3
    L5:
        return r0.toString();
    }

    public static java.nio.charset.Charset DW(byte[] r3) {
        int r0 = Hw(r3, 0);
        if (r0 < 0) goto L5;
        java.lang.String r4 = j6(abcd.hE.Zo, r3, r0, Zo(r3, r0) - 1);
        return java.nio.charset.Charset.forName(r4);
    L14:
        e = move-exception;
        java.nio.charset.Charset r5 = j6(r4);
        if (r5 == null) goto L18;
        return r5;
    L18:
        throw e;
    L9:
        e = move-exception;
        java.nio.charset.Charset r6 = j6(r4);
        if (r6 == null) goto L13;
        return r6;
    L13:
        throw e;
    L5:
        return abcd.hE.Zo;
    }

    public static final int EQ(byte[] r1, int r2) {
        int r3 = j6(r1, r2, null);
        int r4 = r3 % 100;
        return ((r3 / 100) * 60) + r4;
    }

    public static final int FH(byte[] r3, int r4) {
        int r0 = r3.length;
        if (r4 != 0) goto L5;
        r4 = r4 + 46;
    L5:
        if (r4 >= r0) goto L10;
        if (r3[r4] != 112) goto L10;
        r4 = r4 + 48;
    L10:
        if (r4 >= r0) goto L15;
        if (r3[r4] != 97) goto L15;
        r4 = Zo(r3, r4);
    L15:
        return j6(r3, r4, abcd.wE.Hw);
    }

    public static final int FH(byte[] r1, int r2, char r3) {
        if (r2 != r1.length) goto L5;
        r2 = r2 - 1;
    L5:
        if (r2 < 0) goto L6;
        int r0 = r2 - 1;
        if (r1[r2] == r3) goto L9;
        r2 = r0;
        goto L5
    L9:
        return r0;
    L6:
        return r2;
    }

    public static int FH(byte[] r3, int r4, int r5) {
        if (r5 != 0) goto L5;
        int r6 = r4 - 1;
        r3[r6] = 48;
        return r6;
    L5:
        if (r5 >= 0) goto L7;
        boolean r0 = true;
    L8:
        if (r0 == false) goto L10;
        r5 = -r5;
    L10:
        if (r5 == 0) goto L11;
        r4 = r4 - 1;
        r3[r4] = v5[r5 % 10];
        r5 = r5 / 10;
        goto L10
    L11:
        if (r0 == false) goto L17;
        int r7 = r4 - 1;
        r3[r7] = 45;
        return r7;
    L17:
        return r4;
    L7:
        r0 = false;
        goto L8
    }

    public static final int Hw(byte[] r3, int r4) {
        int r0 = r3.length;
    L3:
        if (r4 >= r0) goto L12;
        if (r3[r4] == 10) goto L7;
        if (r3[r4] == 101) goto L12;
        r4 = Zo(r3, r4);
        goto L3
    L7:
        return -1;
    L12:
        return j6(r3, r4, abcd.wE.v5);
    }

    public static final abcd.CK Hw(byte[] r3, int r4, int r5) {
        abcd.CK r0 = new abcd.CK((r5 - r4) / 36);
        r0.j6(1, Integer.MIN_VALUE);
    L3:
        if (r4 >= r5) goto L4;
        r0.j6(r4);
        r4 = Zo(r3, r4);
        goto L3
    L4:
        r0.j6(r5);
        return r0;
    }

    public static final int J0(byte[] r3, int r4) {
        int r0 = r3.length;
        if (r4 != 0) goto L6;
        r4 = r4 + 48;
    L6:
        if (r4 >= r0) goto L11;
        if (r3[r4] == 10) goto L11;
        r4 = Zo(r3, r4);
    L11:
        if (r4 < r0) goto L13;
        return -1;
    L13:
        if (r3[r4] == 10) goto L15;
        return -1;
    L15:
        return r4 + 1;
    }

    public static final int VH(byte[] r3, int r4) {
        byte[] r0 = DW;
        int r1 = ((((r0[r3[r4]] << 4) | r0[r3[r4 + 1]]) << 4) | r0[r3[r4 + 2]]) << 4;
        int r5 = r0[r3[r4 + 3]] | r1;
        if (r5 < 0) goto L6;
        return r5;
    L6:
        throw new java.lang.ArrayIndexOutOfBoundsException();
    }

    public static final int Zo(byte[] r1, int r2) {
        return j6(r1, r2, '\n');
    }

    public static final int gn(byte[] r3, int r4) {
        byte[] r0 = DW;
        int r1 = (((((((((((r0[r3[r4]] << 4) | r0[r3[r4 + 1]]) << 4) | r0[r3[r4 + 2]]) << 4) | r0[r3[r4 + 3]]) << 4) | r0[r3[r4 + 4]]) << 4) | r0[r3[r4 + 5]]) << 4) | r0[r3[r4 + 6]];
        byte r5 = r0[r3[r4 + 7]];
        if (r1 < 0) goto L8;
        if (r5 < 0) goto L8;
        return r5 | (r1 << 4);
    L8:
        throw new java.lang.ArrayIndexOutOfBoundsException();
    }

    public static final int j6(byte r1) {
        byte r2 = DW[r1];
        if (r2 < 0) goto L6;
        return r2;
    L6:
        throw new java.lang.ArrayIndexOutOfBoundsException();
    }

    private static int j6(byte[] r2, char r3, int r4) {
    L2:
        if (r4 < 0) goto L7;
        if (r2[r4] != 32) goto L7;
        r4 = r4 - 1;
    L7:
        if (r4 < 0) goto L12;
        if (r2[r4] == r3) goto L12;
        r4 = r4 - 1;
    L12:
        return r4;
    }

    public static final int j6(byte[] r3, int r4) {
        int r0 = r3.length;
        if (r4 != 0) goto L5;
        r4 = r4 + 46;
    L5:
        if (r4 >= r0) goto L11;
        if (r3[r4] != 112) goto L11;
        r4 = r4 + 48;
    L11:
        return j6(r3, r4, abcd.wE.FH);
    }

    public static final int j6(byte[] r2, int r3, char r4) {
        int r0 = r2.length;
    L3:
        if (r3 >= r0) goto L4;
        int r1 = r3 + 1;
        if (r2[r3] == r4) goto L7;
        r3 = r1;
        goto L3
    L7:
        return r1;
    L4:
        return r3;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x002f -> B:18:0x001d). Please report as a decompilation issue!!! */
    public static final int j6(byte[] r5, int r6, abcd.EK r7) {
        int r0 = 0;
        int r1 = r5.length;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L27
    L4:
        if (r6 >= r1) goto L9;
        if (r5[r6] != 32) goto L9;
        r6 = r6 + 1;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L27
    L9:
        if (r6 < r1) goto L11;
        return 0;
    L11:
        byte r2 = r5[r6];     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L27
        if (r2 != 43) goto L15;
        r6 = r6 + 1;
    L20:
        byte r3 = 0;
    L21:
        if (r6 < r1) goto L36;
    L28:
        if (r7 == null) goto L30;
        r7.j6 = r6;
    L30:
        if (r3 < 0) goto L32;
        return r0;
    L32:
        return -r0;
    L36:
        byte r4 = j6[r5[r6]];     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L33
        if (r4 < 0) goto L28;
        r0 = (r0 * 10) + r4;
    L18:
        r6 = r6 + 1;
        goto L21
    L15:
        if (r2 != 45) goto L20;
        r3 = -1;
    L27:
        r3 = 0;
        goto L28
    }

    public static final int j6(byte[] r4, int r5, byte[] r6) {
        if ((r6.length + r5) <= r4.length) goto L5;
        return -1;
    L5:
        int r0 = 0;
    L7:
        if (r0 >= r6.length) goto L8;
        if (r4[r5] != r6[r0]) goto L11;
        r0 = r0 + 1;
        r5 = r5 + 1;
        goto L7
    L11:
        return -1;
    L8:
        return r5;
    }

    private static java.lang.String j6(java.nio.ByteBuffer r1, java.nio.charset.Charset r2) {
        java.nio.charset.CharsetDecoder r3 = r2.newDecoder();
        r3.onMalformedInput(java.nio.charset.CodingErrorAction.REPORT);
        r3.onUnmappableCharacter(java.nio.charset.CodingErrorAction.REPORT);
        return r3.decode(r1).toString();
    }

    public static java.lang.String j6(java.nio.charset.Charset r0, byte[] r1, int r2, int r3) {
        return DW(r0, r1, r2, r3);
    L5:
        return DW(r1, r2, r3);
    }

    public static java.lang.String j6(byte[] r2) {
        return j6(r2, 0, r2.length);
    }

    public static java.lang.String j6(byte[] r1, int r2, int r3) {
        return j6(abcd.hE.Zo, r1, r2, r3);
    }

    private static java.nio.charset.Charset j6(java.lang.String r1) {
        return Hw.get(abcd.NK.Hw(r1));
    }

    public static abcd.KE tp(byte[] r10, int r11) {
        int r0 = Zo(r10, r11);
        int r1 = DW(r10, r11, '<');
        int r2 = DW(r10, r1, '>');
        if (r2 >= r0) goto L5;
        java.lang.String r3 = j6(r10, r1, r2 - 1);
    L6:
        java.lang.String r6 = r3;
        if (r1 >= r0) goto L9;
        java.lang.String r12 = j6(r10, r11, r1 - 2);
    L10:
        java.lang.String r5 = r12;
        abcd.EK r13 = new abcd.EK();
        if (r2 >= r0) goto L13;
        long r4 = DW(r10, r2 + 1, r13);
        int r9 = EQ(r10, r13.j6);
    L15:
        return new abcd.KE(r5, r6, r4 * 1000, r9);
    L13:
        r4 = 0;
        r9 = 0;
        goto L15
    L9:
        r12 = j6(r10, r11, r0);
        goto L10
    L5:
        r3 = "invalid";
        goto L6
    }

    public static abcd.KE u7(byte[] r12, int r13) {
        java.nio.charset.Charset r0 = DW(r12);
        int r1 = DW(r12, r13, '<');
        int r3 = DW(r12, r1, '>');
        if (r1 < r12.length) goto L5;
    L27:
        return null;
    L5:
        if (r12[r1] == 10) goto L27;
        if (r3 >= (r12.length - 1)) goto L9;
    L11:
        int r2 = r1 - 2;
        if (r2 >= r13) goto L14;
    L16:
        r2 = r1 - 1;
    L17:
        java.lang.String r7 = j6(r0, r12, r13, r2);
        int r14 = r3 - 1;
        java.lang.String r8 = j6(r0, r12, r1, r14);
        int r15 = j6(r12, ' ', Zo(r12, r14) - 2) + 1;
        if (r15 <= r3) goto L20;
        int r4 = r15 - 1;
        int r5 = java.lang.Math.max(r3, j6(r12, ' ', r4) + 1);
        if (r5 < r4) goto L26;
        return new abcd.KE(r7, r8, 0, 0);
    L26:
        return new abcd.KE(r7, r8, DW(r12, r5, null) * 1000, EQ(r12, r15));
    L20:
        return new abcd.KE(r7, r8, 0, 0);
    L14:
        if (r12[r2] != 32) goto L16;
    L9:
        if (r12[r3 - 1] == 62) goto L11;
        goto L11
    }

    public static final int v5(byte[] r4, int r5) {
        int r0 = r4.length;
        int r1 = r5;
    L4:
        if (r1 >= r0) goto L9;
        if (r4[r1] == 10) goto L9;
        r1 = Zo(r4, r1);
    L9:
        if (r1 <= 0) goto L15;
        if (r5 >= r1) goto L15;
        if (r4[r1 - 1] != 10) goto L15;
        r1 = r1 - 1;
    L15:
        return r1;
    }

    public static final int we(byte[] r1, int r2) {
        return FH(r1, r2, '\n');
    }
}
