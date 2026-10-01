package abcd;

public final class XP {
    private static int j6 = 512;

    public static int j6(java.io.InputStream r2, byte[] r3) {
        return j6(r2, r3, 0, r3.length);
    }

    public static int j6(java.io.InputStream r3, byte[] r4, int r5, int r6) {
        int r0 = 0;
    L3:
        if (r0 >= r6) goto L7;
        int r1 = r3.read(r4, r5 + r0, r6 - r0);
        if (r1 < 0) goto L7;
        r0 = r0 + r1;
    L7:
        return r0;
    }

    public static void j6(java.io.InputStream r3, java.io.OutputStream r4) {
        byte[] r0 = new byte[j6];
    L3:
        int r1 = r3.read(r0, 0, r0.length);
        if (r1 < 0) goto L5;
        r4.write(r0, 0, r1);
        goto L3
    }

    public static byte[] j6(java.io.InputStream r1) {
        java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream();
        j6(r1, r0);
        return r0.toByteArray();
    }
}
