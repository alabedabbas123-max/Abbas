package abcd;

public class Uv {
    private static final java.lang.ThreadLocal<java.util.zip.CRC32> DW = null;
    private static final java.lang.ThreadLocal<java.util.zip.Adler32> j6 = null;

    static {
        j6 = new abcd.Sv();
        DW = new abcd.Tv();
    }

    public static java.lang.String j6(java.lang.CharSequence r9) {
        java.lang.String r10 = null;
        int r1 = 0;
        int r2 = 0;
        byte[] r3 = null;
        long r4 = 0L;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r9 != null) { $pc0 = 5; continue $sw0; }
                    return null;
                }
                case 5: {
                    r10 = r9.toString();
                    r1 = 0;
                    r2 = 0;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r1 >= r10.length()) { $pc0 = 9; continue $sw0; }
                    r2 = (r2 * 31) + r10.charAt(r1);
                    r1 = r1 + 1;
                    { $pc0 = 7; continue $sw0; }
                }
                case 9: {
                    j6.get().reset();
                    r3 = r10.getBytes();
                    j6.get().update(r3, 0, r3.length);
                    r4 = j6.get().getValue() * ((long) ((r2 * 31) + 1));
                    if (r10.length() >= 10) { $pc0 = 13; continue $sw0; }
                    DW.get().reset();
                    DW.get().update(r3, 0, r3.length);
                    r4 = ((r4 * 31) + 1) * DW.get().getValue();
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    return "Text_" + java.lang.Long.toHexString(r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
