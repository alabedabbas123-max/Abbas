package abcd;

public class VP {
    private static final abcd.UP j6 = null;

    static {
        j6 = new abcd.WP();
    }

    public static byte[] j6(java.lang.String r3) {
        java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream();
        j6.j6(r3, r0);     // Catch: java.io.IOException -> L6
        return r0.toByteArray();
    L6:
        e = move-exception;
        throw new java.lang.RuntimeException("exception decoding Hex string: " + e);
    }

    public static byte[] j6(byte[] r2) {
        return j6(r2, 0, r2.length);
    }

    public static byte[] j6(byte[] r2, int r3, int r4) {
        java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream();
        j6.j6(r2, r3, r4, r0);     // Catch: java.io.IOException -> L6
        return r0.toByteArray();
    L6:
        e = move-exception;
        throw new java.lang.RuntimeException("exception encoding Hex string: " + e);
    }
}
