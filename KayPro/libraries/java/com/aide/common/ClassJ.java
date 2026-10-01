package com.aide.common;

@abcd.Interfacexu
public class ClassJ {

    @abcd.Interfaceru(field = 2232362214247671792L)
    private static final char[] DW = null;

    @abcd.Interfaceru(field = 2232468409789294999L)
    private static final byte[] FH = null;

    @abcd.Interfacetu
    private static boolean Hw;

    @abcd.Interfaceru(field = -2038483916975259315L)
    private static final java.lang.String j6 = null;

    @abcd.Interfaceuu
    private static boolean v5;

    static {
        abcd.wu.j6(com.aide.common.ClassJ.class, 3652670998646084835L, 3652670998646084835L);     // Catch: java.lang.Throwable -> L26
        if (Hw == false) goto L6;
        abcd.wu.j6(817984480114782529L, null);     // Catch: java.lang.Throwable -> L26
    L6:
        j6 = java.lang.System.getProperty("line.separator");     // Catch: java.lang.Throwable -> L26
        DW = new char[64];     // Catch: java.lang.Throwable -> L26
        char r4 = 'A';
        int r5 = 0;
        int r6 = 0;
    L8:
        if (r4 > 'Z') goto L10;
        DW[r6] = r4;     // Catch: java.lang.Throwable -> L26
        r4 = (char) (r4 + 1);     // Catch: java.lang.Throwable -> L26
        r6 = r6 + 1;     // Catch: java.lang.Throwable -> L26
        goto L8
    L10:
        char r7 = 'a';
    L12:
        if (r7 > 'z') goto L14;
        DW[r6] = r7;     // Catch: java.lang.Throwable -> L26
        r7 = (char) (r7 + 1);     // Catch: java.lang.Throwable -> L26
        r6 = r6 + 1;     // Catch: java.lang.Throwable -> L26
        goto L12
    L14:
        char r8 = '0';
    L16:
        if (r8 > '9') goto L18;
        DW[r6] = r8;     // Catch: java.lang.Throwable -> L26
        r8 = (char) (r8 + 1);     // Catch: java.lang.Throwable -> L26
        r6 = r6 + 1;     // Catch: java.lang.Throwable -> L26
        goto L16
    L18:
        DW[r6] = '+';     // Catch: java.lang.Throwable -> L26
        char[] r9 = DW;     // Catch: java.lang.Throwable -> L26
        r9[r6 + 1] = '/';     // Catch: java.lang.Throwable -> L26
        FH = new byte[128];     // Catch: java.lang.Throwable -> L26
        int r10 = 0;
    L20:
        if (r10 >= FH.length) goto L22;
        FH[r10] = -1;     // Catch: java.lang.Throwable -> L26
        r10 = r10 + 1;     // Catch: java.lang.Throwable -> L26
    L22:
        if (r5 >= 64) goto L25;
        FH[DW[r5]] = (byte) r5;     // Catch: java.lang.Throwable -> L26
        r5 = r5 + 1;
        goto L22
    L25:
        return;
    L26:
        th = move-exception;
        if (v5 == false) goto L31;
        abcd.wu.j6(th, 817984480114782529L, null);
    L31:
        throw th;
    }

    @abcd.Interfacesu(method = -486250662208906560L)
    private ClassJ() {
    L8:
        th = move-exception;
        if (v5 == false) goto L12;
        abcd.wu.j6(th, 3560877588869042785L, null);
    L12:
        throw th;
    L4:
        if (Hw == false) goto L6;
        abcd.wu.j6(3560877588869042785L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static byte[] j6(java.lang.String r5) {
    L8:
        th = move-exception;
        if (v5 == false) goto L12;
        abcd.wu.j6(th, 144228122012975121L, null, r5);
    L12:
        throw th;
    L4:
        if (Hw == false) goto L6;
        abcd.wu.j6(144228122012975121L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return j6(r5.toCharArray());
    }

    public static byte[] j6(char[] r5) {
    L8:
        th = move-exception;
        if (v5 == false) goto L12;
        abcd.wu.j6(th, -580864727814534699L, null, r5);
    L12:
        throw th;
    L4:
        if (Hw == false) goto L6;
        abcd.wu.j6(-580864727814534699L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return j6(r5, 0, r5.length);
    }

    public static byte[] j6(char[] r12, int r13, int r14) {
    L45:
        th = move-exception;
        if (v5 == false) goto L50;
        abcd.wu.j6(th, -1329082667528528781L, null, r12, new java.lang.Integer(r13), new java.lang.Integer(r14));
    L50:
        throw th;
    L3:
        if (Hw == false) goto L6;
        abcd.wu.j6(-1329082667528528781L, null, r12, new java.lang.Integer(r13), new java.lang.Integer(r14));     // Catch: java.lang.Throwable -> L45
    L6:
        if ((r14 % 4) != 0) goto L44;
    L7:
        if (r14 <= 0) goto L11;
        if (r12[(r13 + r14) - 1] != '=') goto L11;
        r14 = r14 - 1;     // Catch: java.lang.Throwable -> L45
    L11:
        int r0 = (r14 * 3) / 4;     // Catch: java.lang.Throwable -> L45
        byte[] r1 = new byte[r0];     // Catch: java.lang.Throwable -> L45
        int r2 = r13 + r14;     // Catch: java.lang.Throwable -> L45
        int r3 = r13;
        int r4 = 0;
    L12:
        if (r3 >= r2) goto L42;
        int r5 = r3 + 1;     // Catch: java.lang.Throwable -> L45
        char r6 = r12[r3];     // Catch: java.lang.Throwable -> L45
        int r7 = r5 + 1;     // Catch: java.lang.Throwable -> L45
        char r8 = r12[r5];     // Catch: java.lang.Throwable -> L45
        char r9 = 'A';
        if (r7 >= r2) goto L16;
        int r10 = r7 + 1;     // Catch: java.lang.Throwable -> L45
        char r11 = r12[r7];     // Catch: java.lang.Throwable -> L45
    L17:
        if (r10 >= r2) goto L21;
        int r15 = r10 + 1;     // Catch: java.lang.Throwable -> L45
        char r16 = r12[r10];     // Catch: java.lang.Throwable -> L45
        r10 = r15;
        r9 = r16;
    L21:
        if (r6 > 127) goto L41;
        if (r8 > 127) goto L41;
        if (r11 > 127) goto L41;
        if (r9 > 127) goto L41;
        byte r17 = FH[r6];     // Catch: java.lang.Throwable -> L45
        byte r18 = FH[r8];     // Catch: java.lang.Throwable -> L45
        byte r19 = FH[r11];     // Catch: java.lang.Throwable -> L45
        byte r20 = FH[r9];     // Catch: java.lang.Throwable -> L45
        if (r17 < 0) goto L39;
        if (r18 < 0) goto L39;
        if (r19 < 0) goto L39;
        if (r20 < 0) goto L39;
        int r21 = (r17 << 2) | (r18 >>> 4);     // Catch: java.lang.Throwable -> L45
        int r22 = ((r18 & 15) << 4) | (r19 >>> 2);     // Catch: java.lang.Throwable -> L45
        int r23 = ((r19 & 3) << 6) | r20;     // Catch: java.lang.Throwable -> L45
        int r24 = r4 + 1;     // Catch: java.lang.Throwable -> L45
        r1[r4] = (byte) r21;     // Catch: java.lang.Throwable -> L45
        if (r24 >= r0) goto L33;
        int r25 = r24 + 1;     // Catch: java.lang.Throwable -> L45
        r1[r24] = (byte) r22;     // Catch: java.lang.Throwable -> L45
    L34:
        if (r25 >= r0) goto L36;
        r4 = r25 + 1;     // Catch: java.lang.Throwable -> L45
        r1[r25] = (byte) r23;     // Catch: java.lang.Throwable -> L45
    L37:
        r3 = r10;
        goto L12
    L36:
        r4 = r25;
        goto L37
    L33:
        r25 = r24;
    L39:
        throw new java.lang.IllegalArgumentException("Illegal character in Base64 encoded data.");     // Catch: java.lang.Throwable -> L45
    L41:
        throw new java.lang.IllegalArgumentException("Illegal character in Base64 encoded data.");     // Catch: java.lang.Throwable -> L45
    L16:
        r10 = r7;
        r11 = 'A';
        goto L17
    L42:
        return r1;
    L44:
        throw new java.lang.IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");     // Catch: java.lang.Throwable -> L45
    }

    public static char[] j6(byte[] r5) {
    L8:
        th = move-exception;
        if (v5 == false) goto L12;
        abcd.wu.j6(th, -11316083948896048L, null, r5);
    L12:
        throw th;
    L4:
        if (Hw == false) goto L6;
        abcd.wu.j6(-11316083948896048L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return j6(r5, 0, r5.length);
    }

    public static char[] j6(byte[] r12, int r13, int r14) {
    L24:
        th = move-exception;
        if (v5 == false) goto L29;
        abcd.wu.j6(th, 77141844226625856L, null, r12, new java.lang.Integer(r13), new java.lang.Integer(r14));
    L29:
        throw th;
    L3:
        if (Hw == false) goto L5;
        abcd.wu.j6(77141844226625856L, null, r12, new java.lang.Integer(r13), new java.lang.Integer(r14));     // Catch: java.lang.Throwable -> L24
    L5:
        int r0 = ((r14 * 4) + 2) / 3;     // Catch: java.lang.Throwable -> L24
        char[] r1 = new char[((r14 + 2) / 3) * 4];     // Catch: java.lang.Throwable -> L24
        int r2 = r13 + r14;     // Catch: java.lang.Throwable -> L24
        int r4 = r13;
        int r5 = 0;
    L6:
        if (r4 >= r2) goto L23;
        int r6 = r4 + 1;     // Catch: java.lang.Throwable -> L24
        int r7 = r12[r4] & 255;     // Catch: java.lang.Throwable -> L24
        if (r6 >= r2) goto L10;
        int r8 = r6 + 1;     // Catch: java.lang.Throwable -> L24
        int r9 = r12[r6] & 255;     // Catch: java.lang.Throwable -> L24
    L11:
        if (r8 >= r2) goto L13;
        int r10 = r8 + 1;     // Catch: java.lang.Throwable -> L24
        int r11 = r12[r8] & 255;     // Catch: java.lang.Throwable -> L24
    L14:
        int r15 = r7 >>> 2;     // Catch: java.lang.Throwable -> L24
        int r16 = ((r7 & 3) << 4) | (r9 >>> 4);     // Catch: java.lang.Throwable -> L24
        int r17 = ((r9 & 15) << 2) | (r11 >>> 6);     // Catch: java.lang.Throwable -> L24
        int r18 = r11 & 63;     // Catch: java.lang.Throwable -> L24
        int r19 = r5 + 1;     // Catch: java.lang.Throwable -> L24
        r1[r5] = DW[r15];     // Catch: java.lang.Throwable -> L24
        int r20 = r19 + 1;     // Catch: java.lang.Throwable -> L24
        r1[r19] = DW[r16];     // Catch: java.lang.Throwable -> L24
        char r21 = '=';
        if (r20 >= r0) goto L17;
        char r22 = DW[r17];     // Catch: java.lang.Throwable -> L24
    L18:
        r1[r20] = r22;     // Catch: java.lang.Throwable -> L24
        int r23 = r20 + 1;     // Catch: java.lang.Throwable -> L24
        if (r23 >= r0) goto L21;
        r21 = DW[r18];     // Catch: java.lang.Throwable -> L24
    L21:
        r1[r23] = r21;     // Catch: java.lang.Throwable -> L24
        r5 = r23 + 1;
        r4 = r10;
        goto L6
    L17:
        r22 = '=';
        goto L18
    L13:
        r10 = r8;
        r11 = 0;
        goto L14
    L10:
        r8 = r6;
        r9 = 0;
        goto L11
    L23:
        return r1;
    }
}
