package abcd;

public class Aw {
    public static final java.util.UUID j6 = null;

    static {
        j6 = new java.util.UUID(0, 0);
    }

    public static java.lang.String j6(java.util.UUID r3) {
        java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(16);
        r0.putLong(r3.getMostSignificantBits());
        r0.putLong(r3.getLeastSignificantBits());
        return android.util.Base64.encodeToString(r0.array(), 11);
    }
}
