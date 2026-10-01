package abcd;

public final class OP {
    public static int DW(byte[] r3) {
        if (r3 != null) goto L5;
        return 0;
    L5:
        int r0 = r3.length;
        int r1 = r0 + 1;
    L6:
        r0 = r0 - 1;
        if (r0 < 0) goto L8;
        r1 = (r1 * 257) ^ r3[r0];
        goto L6
    L8:
        return r1;
    }

    public static int j6(char[] r3) {
        if (r3 != null) goto L5;
        return 0;
    L5:
        int r0 = r3.length;
        int r1 = r0 + 1;
    L6:
        r0 = r0 - 1;
        if (r0 < 0) goto L8;
        r1 = (r1 * 257) ^ r3[r0];
        goto L6
    L8:
        return r1;
    }

    public static boolean j6(byte[] r5, byte[] r6) {
        if (r5 != r6) goto L6;
        return true;
    L6:
        if (r5 == null) goto L20;
        if (r6 == null) goto L20;
        if (r5.length == r6.length) goto L12;
        return false;
    L12:
        int r2 = 0;
    L14:
        if (r2 == r5.length) goto L15;
        if (r5[r2] != r6[r2]) goto L18;
        r2 = r2 + 1;
        goto L14
    L18:
        return false;
    L15:
        return true;
    L20:
        return false;
    }

    public static boolean j6(char[] r5, char[] r6) {
        if (r5 != r6) goto L6;
        return true;
    L6:
        if (r5 == null) goto L20;
        if (r6 == null) goto L20;
        if (r5.length == r6.length) goto L12;
        return false;
    L12:
        int r2 = 0;
    L14:
        if (r2 == r5.length) goto L15;
        if (r5[r2] != r6[r2]) goto L18;
        r2 = r2 + 1;
        goto L14
    L18:
        return false;
    L15:
        return true;
    L20:
        return false;
    }

    public static byte[] j6(byte[] r3) {
        if (r3 != null) goto L5;
        return null;
    L5:
        byte[] r0 = new byte[r3.length];
        java.lang.System.arraycopy(r3, 0, r0, 0, r3.length);
        return r0;
    }
}
