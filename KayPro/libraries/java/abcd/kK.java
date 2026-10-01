package abcd;

public class kK {
    private static final byte[] DW = null;
    private static final byte[] j6 = null;

    static {
        j6 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".getBytes("UTF-8");     // Catch: java.io.UnsupportedEncodingException -> L9
        DW = new byte[128];
        java.util.Arrays.fill(DW, (byte) -3);
        int r0 = 0;
    L5:
        if (r0 >= 64) goto L6;
        DW[j6[r0]] = (byte) r0;
        r0 = r0 + 1;
        goto L5
    L6:
        byte[] r1 = DW;
        r1[61] = -1;
        r1[9] = -2;
        r1[10] = -2;
        r1[13] = -2;
        r1[32] = -2;
        return;
    L9:
        e = move-exception;
        throw new java.lang.RuntimeException(e.getMessage(), e);
    }

    public static java.lang.String j6(byte[] r2) {
        return j6(r2, 0, r2.length);
    }

    public static java.lang.String j6(byte[] r7, int r8, int r9) {
        int r0 = (r9 * 4) / 3;
        if ((r9 % 3) <= 0) goto L5;
        int r2 = 4;
    L6:
        byte[] r1 = new byte[r0 + r2];
        int r3 = r9 - 2;
        int r4 = 0;
        int r5 = 0;
    L7:
        if (r4 >= r3) goto L8;
        j6(r7, r4 + r8, 3, r1, r5);
        r4 = r4 + 3;
        r5 = r5 + 4;
        goto L7
    L8:
        if (r4 >= r9) goto L15;
        j6(r7, r8 + r4, r9 - r4, r1, r5);
        r5 = r5 + 4;
    L15:
        return new java.lang.String(r1, 0, r5, "UTF-8");
    L13:
        return new java.lang.String(r1, 0, r5);
    L5:
        r2 = 0;
        goto L6
    }

    private static void j6(byte[] r5, int r6, int r7, byte[] r8, int r9) {
        int r3 = 0;
        if (r7 == 1) goto L9;
        if (r7 == 2) goto L8;
        if (r7 != 3) goto L11;
        r3 = 0 | ((r5[r6 + 2] << 24) >>> 24);
    L11:
        if (r7 == 1) goto L17;
        if (r7 == 2) goto L16;
        if (r7 != 3) goto L21;
        byte[] r10 = j6;
        r8[r9] = r10[r3 >>> 18];
        r8[r9 + 1] = r10[(r3 >>> 12) & 63];
        r8[r9 + 2] = r10[(r3 >>> 6) & 63];
        r8[r9 + 3] = r10[r3 & 63];
        return;
    L21:
        return;
    L16:
        byte[] r11 = j6;
        r8[r9] = r11[r3 >>> 18];
        r8[r9 + 1] = r11[(r3 >>> 12) & 63];
        r8[r9 + 2] = r11[(r3 >>> 6) & 63];
        r8[r9 + 3] = 61;
        return;
    L17:
        byte[] r12 = j6;
        r8[r9] = r12[r3 >>> 18];
        r8[r9 + 1] = r12[(r3 >>> 12) & 63];
        r8[r9 + 2] = 61;
        r8[r9 + 3] = 61;
        return;
    L8:
        r3 = r3 | ((r5[r6 + 1] << 24) >>> 16);
    L9:
        r3 = r3 | ((r5[r6] << 24) >>> 8);
        goto L11
    }
}
