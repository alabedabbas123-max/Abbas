package abcd;

public final class TP {
    public static java.lang.String DW(java.lang.String r5) {
        char[] r0 = r5.toCharArray();
        int r1 = 0;
        boolean r2 = false;
    L4:
        if (r1 == r0.length) goto L5;
        char r3 = r0[r1];
        if ('A' > r3) goto L13;
        if ('Z' < r3) goto L13;
        r0[r1] = (char) ((r3 - 'A') + 97);
        r2 = true;
    L13:
        r1 = r1 + 1;
        goto L4
    L5:
        if (r2 == true) goto L7;
        return r5;
    L7:
        return new java.lang.String(r0);
    }

    public static java.lang.String DW(byte[] r1) {
        return new java.lang.String(j6(r1));
    }

    public static java.lang.String FH(java.lang.String r5) {
        char[] r0 = r5.toCharArray();
        int r1 = 0;
        boolean r2 = false;
    L4:
        if (r1 == r0.length) goto L5;
        char r3 = r0[r1];
        if ('a' > r3) goto L13;
        if ('z' < r3) goto L13;
        r0[r1] = (char) ((r3 - 'a') + 65);
        r2 = true;
    L13:
        r1 = r1 + 1;
        goto L4
    L5:
        if (r2 == true) goto L7;
        return r5;
    L7:
        return new java.lang.String(r0);
    }

    public static java.lang.String FH(byte[] r9) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
    L4:
        if (r1 >= r9.length) goto L5;
        r2 = r2 + 1;
        if ((r9[r1] & 240) == 240) goto L27;
        if ((r9[r1] & 224) == 224) goto L30;
        if ((r9[r1] & 192) == 192) goto L33;
        r1 = r1 + 1;
        goto L4
    L33:
        r1 = r1 + 2;
        goto L4
    L30:
        r1 = r1 + 3;
        goto L4
    L27:
        r2 = r2 + 1;
        r1 = r1 + 4;
        goto L4
    L5:
        char[] r3 = new char[r2];
        int r4 = 0;
    L7:
        if (r0 >= r9.length) goto L9;
        if ((r9[r0] & 240) != 240) goto L14;
        int r5 = (((((r9[r0] & 3) << 18) | ((r9[r0 + 1] & 63) << 12)) | ((r9[r0 + 2] & 63) << 6)) | (r9[r0 + 3] & 63)) - 65536;
        char r7 = (char) (55296 | (r5 >> 10));
        char r6 = (char) ((r5 & 1023) | 56320);
        r3[r4] = r7;
        r0 = r0 + 4;
        r4 = r4 + 1;
    L24:
        r3[r4] = r6;
        r4 = r4 + 1;
        goto L7
    L14:
        if ((r9[r0] & 224) != 224) goto L17;
        r6 = (char) ((((r9[r0] & 15) << 12) | ((r9[r0 + 1] & 63) << 6)) | (r9[r0 + 2] & 63));
        r0 = r0 + 3;
        goto L24
    L17:
        if ((r9[r0] & 208) != 208) goto L21;
        int r8 = (r9[r0] & 31) << 6;
        byte r10 = r9[r0 + 1];
    L19:
        r6 = (char) (r8 | (r10 & 63));
        r0 = r0 + 2;
        goto L24
    L21:
        if ((r9[r0] & 192) != 192) goto L23;
        r8 = (r9[r0] & 31) << 6;
        r10 = r9[r0 + 1];
        goto L19
    L23:
        r6 = (char) (r9[r0] & 255);
        r0 = r0 + 1;
        goto L24
    L9:
        return new java.lang.String(r3);
    }

    public static byte[] j6(java.lang.String r3) {
        byte[] r0 = new byte[r3.length()];
        int r1 = 0;
    L4:
        if (r1 == r0.length) goto L5;
        r0[r1] = (byte) r3.charAt(r1);
        r1 = r1 + 1;
        goto L4
    L5:
        return r0;
    }

    public static char[] j6(byte[] r3) {
        char[] r0 = new char[r3.length];
        int r1 = 0;
    L4:
        if (r1 == r0.length) goto L5;
        r0[r1] = (char) (r3[r1] & 255);
        r1 = r1 + 1;
        goto L4
    L5:
        return r0;
    }
}
