package abcd;

public class Uv {
    private static final java.lang.ThreadLocal<java.util.zip.CRC32> DW = null;
    private static final java.lang.ThreadLocal<java.util.zip.Adler32> j6 = null;

    static {
        j6 = new abcd.Sv();
        DW = new abcd.Tv();
    }

    public static java.lang.String j6(java.lang.CharSequence r9) {
        if (r9 != null) goto L5;
        return null;
    L5:
        java.lang.String r10 = r9.toString();
        int r1 = 0;
        int r2 = 0;
    L7:
        if (r1 >= r10.length()) goto L9;
        r2 = (r2 * 31) + r10.charAt(r1);
        r1 = r1 + 1;
        goto L7
    L9:
        j6.get().reset();
        byte[] r3 = r10.getBytes();
        j6.get().update(r3, 0, r3.length);
        long r4 = j6.get().getValue() * ((long) ((r2 * 31) + 1));
        if (r10.length() >= 10) goto L13;
        DW.get().reset();
        DW.get().update(r3, 0, r3.length);
        r4 = ((r4 * 31) + 1) * DW.get().getValue();
    L13:
        return "Text_" + java.lang.Long.toHexString(r4);
    }
}
