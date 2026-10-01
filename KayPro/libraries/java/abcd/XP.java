package abcd;

public final class XP {
    private static int j6 = 512;

    public static int j6(java.io.InputStream r2, byte[] r3) {
        return j6(r2, r3, 0, r3.length);
    }

    public static int j6(java.io.InputStream r3, byte[] r4, int r5, int r6) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r0 >= r6) { $pc0 = 7; continue $sw0; }
                    r1 = r3.read(r4, r5 + r0, r6 - r0);
                    if (r1 < 0) { $pc0 = 7; continue $sw0; }
                    r0 = r0 + r1;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.io.InputStream r3, java.io.OutputStream r4) {
        byte[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new byte[j6];
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    r1 = r3.read(r0, 0, r0.length);
                    if (r1 < 0) { $pc1 = 5; continue $sw1; }
                    r4.write(r0, 0, r1);
                    { $pc1 = 3; continue $sw1; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static byte[] j6(java.io.InputStream r1) {
        java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream();
        j6(r1, r0);
        return r0.toByteArray();
    }
}
