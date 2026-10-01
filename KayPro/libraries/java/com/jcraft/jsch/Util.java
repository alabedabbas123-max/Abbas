package com.jcraft.jsch;

class Util {
    private static java.lang.String[] DW;
    static final byte[] FH = null;
    private static final byte[] j6 = null;

    static {
        j6 = FH("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=");
        DW = new java.lang.String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
        FH = FH("");
    }

    Util() {
    }

    private static byte DW(byte r4) {
        if (r4 != 61) goto L5;
        return 0;
    L5:
        int r1 = 0;
    L6:
        byte[] r2 = j6;
        if (r1 >= r2.length) goto L8;
        if (r4 == r2[r1]) goto L12;
        r1 = r1 + 1;
        goto L6
    L12:
        return (byte) r1;
    L8:
        return 0;
    }

    static void DW(byte[] r3) {
        if (r3 != null) goto L4;
        return;
    L4:
        int r1 = 0;
    L6:
        if (r1 >= r3.length) goto L7;
        r3[r1] = 0;
        r1 = r1 + 1;
        goto L6
    }

    private static boolean DW(byte[] r3, int r4, byte[] r5, int r6) {
        if (r5.length <= 0) goto L19;
        if (r5[0] != 46) goto L19;
        if (r3.length > 0) goto L9;
    L17:
        return false;
    L9:
        if (r3[0] != 46) goto L17;
        if (r3.length != 2) goto L16;
        if (r3[1] != 42) goto L16;
        return true;
    L16:
        return j6(r3, r4 + 1, r5, r6 + 1);
    L19:
        return j6(r3, r4, r5, r6);
    }

    static boolean DW(byte[] r1, byte[] r2) {
        return DW(r1, 0, r2, 0);
    }

    static byte[] DW(java.lang.String r4) {
        java.lang.String r5 = j6(r4);
        java.io.File r0 = new java.io.File(r5);
        java.io.FileInputStream r1 = new java.io.FileInputStream(r5);
        byte[] r6 = new byte[(int) r0.length()];     // Catch: java.lang.Throwable -> L10
        int r2 = 0;
    L4:
        int r3 = r1.read(r6, r2, r6.length - r2);     // Catch: java.lang.Throwable -> L10
        if (r3 <= 0) goto L6;
        r2 = r2 + r3;
        goto L4
    L6:
        r1.close();     // Catch: java.lang.Throwable -> L10
        r1.close();
        return r6;
    L10:
        th = move-exception;
        r1.close();
        throw th;
    }

    static byte[] DW(java.lang.String r0, java.lang.String r1) {
        if (r0 != null) goto L9;
        return null;
    L9:
        return r0.getBytes(r1);
    L8:
        return r0.getBytes();
    }

    static byte[] DW(byte[] r9, int r10, int r11) {
        byte[] r0 = new byte[r11];     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L16
        int r2 = r10;
        int r3 = 0;
    L4:
        if (r2 >= (r10 + r11)) goto L12;
        int r5 = r2 + 1;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L16
        r0[r3] = (byte) ((DW(r9[r2]) << 2) | ((DW(r9[r5]) & 48) >>> 4));     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L16
        int r4 = r2 + 2;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L16
        if (r9[r4] == 61) goto L8;
        r0[r3 + 1] = (byte) (((DW(r9[r5]) & 15) << 4) | ((DW(r9[r4]) & 60) >>> 2));     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L16
        int r6 = r2 + 3;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L16
        if (r9[r6] == 61) goto L11;
        r0[r3 + 2] = (byte) (((DW(r9[r4]) & 3) << 6) | (DW(r9[r6]) & 63));     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L16
        r3 = r3 + 3;
        r2 = r2 + 4;
        goto L4
    L11:
        r3 = r3 + 2;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L16
        goto L12
    L8:
        r3 = r3 + 1;     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L16
    L12:
        byte[] r12 = new byte[r3];     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L16
        java.lang.System.arraycopy(r0, 0, r12, 0, r3);     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L16
        return r12;
    L16:
        e = move-exception;
        throw new com.jcraft.jsch.JSchException("fromBase64: invalid base64 data", e);
    }

    static java.lang.String FH(byte[] r6) {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer();
        int r1 = 0;
    L4:
        if (r1 >= r6.length) goto L6;
        java.lang.String r2 = java.lang.Integer.toHexString(r6[r1] & 255);
        java.lang.StringBuilder r3 = new java.lang.StringBuilder("0x");
        if (r2.length() != 1) goto L10;
        java.lang.String r4 = "0";
    L11:
        r3.append(r4);
        r3.append(r2);
        r0.append(r3.toString());
        r1 = r1 + 1;
        if (r1 >= r6.length) goto L4;
        r0.append(":");
        goto L4
    L10:
        r4 = "";
        goto L11
    L6:
        return r0.toString();
    }

    static byte[] FH(java.lang.String r1) {
        return DW(r1, "UTF-8");
    }

    static byte[] FH(byte[] r10, int r11, int r12) {
        byte[] r0 = new byte[r12 * 2];
        int r1 = ((r12 / 3) * 3) + r11;
        int r3 = r11;
        int r4 = 0;
    L4:
        if (r3 >= r1) goto L5;
        int r6 = (r10[r3] >>> 2) & 63;
        int r7 = r4 + 1;
        byte[] r8 = j6;
        r0[r4] = r8[r6];
        int r9 = r3 + 1;
        int r5 = ((r10[r3] & 3) << 4) | ((r10[r9] >>> 4) & 15);
        int r13 = r7 + 1;
        r0[r7] = r8[r5];
        int r14 = r3 + 2;
        int r15 = ((r10[r9] & 15) << 2) | ((r10[r14] >>> 6) & 3);
        int r16 = r13 + 1;
        r0[r13] = r8[r15];
        int r17 = r10[r14] & 63;
        r0[r16] = r8[r17];
        r3 = r3 + 3;
        r4 = r16 + 1;
        goto L4
    L5:
        int r18 = (r11 + r12) - r1;
        if (r18 != 1) goto L8;
        int r19 = (r10[r3] >>> 2) & 63;
        int r2 = r4 + 1;
        byte[] r20 = j6;
        r0[r4] = r20[r19];
        int r110 = r2 + 1;
        r0[r2] = r20[((r10[r3] & 3) << 4) & 63];
        int r111 = r110 + 1;
        r0[r110] = 61;
        r4 = r111 + 1;
        r0[r111] = 61;
    L10:
        byte[] r112 = new byte[r4];
        java.lang.System.arraycopy(r0, 0, r112, 0, r4);
        return r112;
    L8:
        if (r18 != 2) goto L10;
        int r113 = (r10[r3] >>> 2) & 63;
        int r21 = r4 + 1;
        byte[] r22 = j6;
        r0[r4] = r22[r113];
        int r114 = (r10[r3] & 3) << 4;
        int r23 = r3 + 1;
        int r115 = r114 | ((r10[r23] >>> 4) & 15);
        int r24 = r21 + 1;
        r0[r21] = r22[r115];
        int r116 = r24 + 1;
        r0[r24] = r22[((r10[r23] & 15) << 2) & 63];
        r4 = r116 + 1;
        r0[r116] = 61;
        goto L10
    }

    static java.lang.String Hw(java.lang.String r3) {
        byte[] r0 = FH(r3);
        byte[] r1 = Hw(r0);
        if (r0.length != r1.length) goto L6;
        return r3;
    L6:
        return j6(r1);
    }

    static byte[] Hw(byte[] r5) {
        int r2 = r5.length;
        int r0 = 0;
    L3:
        if (r0 >= r2) goto L10;
        if (r5[r0] == 92) goto L7;
        r0 = r0 + 1;
        goto L3
    L7:
        int r3 = r0 + 1;
        if (r3 == r2) goto L10;
        java.lang.System.arraycopy(r5, r3, r5, r0, r5.length - r3);
        r2 = r2 - 1;
        r0 = r3;
    L10:
        if (r2 != r5.length) goto L12;
        return r5;
    L12:
        byte[] r1 = new byte[r2];
        java.lang.System.arraycopy(r5, 0, r1, 0, r2);
        return r1;
    }

    private static int j6(byte r3) {
        if (((byte) (r3 & 128)) != 0) goto L6;
        return 1;
    L6:
        if (((byte) (r3 & 224)) != (-64)) goto L10;
        return 2;
    L10:
        if (((byte) (r3 & 240)) != (-32)) goto L13;
        return 3;
    L13:
        return 1;
    }

    static java.lang.String j6(com.jcraft.jsch.HASH r4, byte[] r5) {
        r4.DW();     // Catch: java.lang.Exception -> L11
        int r1 = 0;
        r4.update(r5, 0, r5.length);     // Catch: java.lang.Exception -> L11
        byte[] r6 = r4.FH();     // Catch: java.lang.Exception -> L11
        java.lang.StringBuffer r7 = new java.lang.StringBuffer();     // Catch: java.lang.Exception -> L11
    L4:
        if (r1 >= r6.length) goto L5;
        int r0 = r6[r1] & 255;     // Catch: java.lang.Exception -> L11
        r7.append(DW[(r0 >>> 4) & 15]);     // Catch: java.lang.Exception -> L11
        r7.append(DW[r0 & 15]);     // Catch: java.lang.Exception -> L11
        r1 = r1 + 1;     // Catch: java.lang.Exception -> L11
        if (r1 >= r6.length) goto L4;
        r7.append(":");     // Catch: java.lang.Exception -> L11
        goto L4
    L5:
        return r7.toString();
    L11:
        return "???";
    }

    static java.lang.String j6(java.lang.String r2) {
        if (r2.startsWith("~") == false) goto L10;
        return r2.replace("~", java.lang.System.getProperty("user.home"));
    L10:
        return r2;
    L11:
        return r2;
    }

    static java.lang.String j6(java.lang.String r7, java.lang.String[] r8) {
        java.lang.String[] r9 = j6(r7, ",");
        java.lang.String r3 = null;
        int r2 = 0;
    L4:
        if (r2 >= r9.length) goto L5;
        int r4 = 0;
    L8:
        if (r4 >= r8.length) goto L9;
        if (r9[r2].equals(r8[r4]) == true) goto L14;
        r4 = r4 + 1;
    L14:
        r2 = r2 + 1;
        goto L4
    L9:
        if (r3 != null) goto L11;
        r3 = r9[r2];
        goto L14
    L11:
        r3 = java.lang.String.valueOf(r3) + "," + r9[r2];
        goto L14
    L5:
        return r3;
    }

    static java.lang.String j6(byte[] r3) {
        return j6(r3, 0, r3.length, "UTF-8");
    }

    static java.lang.String j6(byte[] r1, int r2, int r3) {
        return j6(r1, r2, r3, "UTF-8");
    }

    static java.lang.String j6(byte[] r1, int r2, int r3, java.lang.String r4) {
        return new java.lang.String(r1, r2, r3, r4);
    L5:
        return new java.lang.String(r1, r2, r3);
    }

    static java.lang.String j6(byte[] r2, java.lang.String r3) {
        return j6(r2, 0, r2.length, r3);
    }

    static java.net.Socket j6(final java.lang.String r4, final int r5, int r6) {
        if (r6 == 0) goto L23;
        final java.net.Socket[] r1 = new java.net.Socket[1];
        final java.lang.Exception[] r0 = new java.lang.Exception[1];
        java.lang.Thread r2 = new java.lang.Thread(new com.jcraft.jsch.Util.AnonymousClass1(r1, r4, r5, r0));
        r2.setName("Opening Socket " + r4);
        r2.start();
        r2.join(r6);     // Catch: java.lang.InterruptedException -> L11
        java.lang.String r7 = "timeout: ";
    L13:
        if (r1[0] != null) goto L15;
    L18:
        java.lang.String r8 = r7 + "socket is not established";
        if (r0[0] == null) goto L21;
        r8 = r0[0].toString();
    L21:
        r2.interrupt();
        throw new com.jcraft.jsch.JSchException(r8, r0[0]);
    L15:
        if (r1[0].isConnected() == false) goto L18;
        return r1[0];
    L11:
        r7 = "";
        goto L13
    L23:
        return new java.net.Socket(r4, r5);
    L5:
        e = move-exception;
        throw new com.jcraft.jsch.JSchException(e.toString(), e);
    }

    private static boolean j6(byte[] r9, int r10, byte[] r11, int r12) {
        int r0 = r9.length;
        if (r0 != 0) goto L5;
        return false;
    L5:
        int r2 = r11.length;
    L7:
        if (r10 >= r0) goto L71;
        if (r12 >= r2) goto L71;
        if (r9[r10] == 92) goto L12;
        if (r9[r10] == 42) goto L21;
        if (r9[r10] == 63) goto L60;
        if (r9[r10] != r11[r12]) goto L64;
        r10 = r10 + j6(r9[r10]);
        r12 = r12 + j6(r11[r12]);
        if (r12 < r2) goto L7;
        if (r10 >= r0) goto L68;
        if (r9[r10] != 42) goto L7;
    L68:
        return true;
    L64:
        return false;
    L60:
        r10 = r10 + 1;
        int r3 = j6(r11[r12]);
    L61:
        r12 = r12 + r3;
        goto L7
    L21:
        int r5 = r10;
    L22:
        if (r5 >= r0) goto L27;
        if (r9[r5] != 42) goto L27;
        r5 = r5 + 1;
    L27:
        if (r0 != r5) goto L29;
        return true;
    L29:
        byte r8 = r9[r5];
        if (r8 != 63) goto L37;
    L31:
        if (r12 >= r2) goto L32;
        if (j6(r9, r5, r11, r12) == true) goto L35;
        r12 = r12 + j6(r11[r12]);
        goto L31
    L35:
        return true;
    L32:
        return false;
    L37:
        if (r8 != 92) goto L50;
        int r13 = r5 + 1;
        if (r13 != r0) goto L41;
        return false;
    L41:
        byte r1 = r9[r13];
    L42:
        if (r12 >= r2) goto L43;
        if (r1 != r11[r12]) goto L49;
        if (j6(r9, j6(r1) + r13, r11, j6(r11[r12]) + r12) == false) goto L49;
        return true;
    L49:
        r12 = r12 + j6(r11[r12]);
        goto L42
    L43:
        return false;
    L50:
        if (r12 >= r2) goto L51;
        if (r8 != r11[r12]) goto L57;
        if (j6(r9, r5, r11, r12) == false) goto L57;
        return true;
    L57:
        r12 = r12 + j6(r11[r12]);
        goto L50
    L51:
        return false;
    L12:
        int r14 = r10 + 1;
        if (r14 == r0) goto L14;
        if (r9[r14] != r11[r12]) goto L17;
        r10 = r14 + j6(r9[r14]);
        r3 = j6(r11[r12]);
        goto L61
    L17:
        return false;
    L14:
        return false;
    L71:
        if (r10 != r0) goto L74;
        if (r12 != r2) goto L74;
        return true;
    L74:
        if (r12 >= r2) goto L76;
    L83:
        return false;
    L76:
        if (r9[r10] != 42) goto L83;
    L77:
        if (r10 >= r0) goto L78;
        int r15 = r10 + 1;
        if (r9[r10] != 42) goto L114;
        r10 = r15;
        goto L77
    L114:
        return false;
    L78:
        return true;
    }

    static boolean j6(byte[] r5, byte[] r6) {
        int r0 = r5.length;
        if (r0 == r6.length) goto L5;
        return false;
    L5:
        int r1 = 0;
    L6:
        if (r1 >= r0) goto L7;
        if (r5[r1] != r6[r1]) goto L11;
        r1 = r1 + 1;
        goto L6
    L11:
        return false;
    L7:
        return true;
    }

    static java.lang.String[] j6(java.lang.String r6, java.lang.String r7) {
        if (r6 != null) goto L5;
        return null;
    L5:
        byte[] r0 = FH(r6);
        java.util.Vector r1 = new java.util.Vector();
        int r2 = 0;
        int r3 = 0;
    L6:
        int r4 = r6.indexOf(r7, r3);
        if (r4 < 0) goto L9;
        r1.addElement(j6(r0, r3, r4 - r3));
        r3 = r4 + 1;
        goto L6
    L9:
        r1.addElement(j6(r0, r3, r0.length - r3));
        java.lang.String[] r8 = new java.lang.String[r1.size()];
    L11:
        if (r2 >= r8.length) goto L12;
        r8[r2] = (java.lang.String) r1.elementAt(r2);
        r2 = r2 + 1;
        goto L11
    L12:
        return r8;
    }
}
