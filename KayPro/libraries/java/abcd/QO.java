package abcd;

public class QO extends abcd.XO {
    private static byte[] DW;

    static {
        DW = new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 31, 31, 31, 31, 14, 14, 14, 14, -32, -32, -32, -32, -15, -15, -15, -15, -2, -2, -2, -2, -2, -2, -2, -2, 1, -2, 1, -2, 1, -2, 1, -2, 31, -32, 31, -32, 14, -15, 14, -15, 1, -32, 1, -32, 1, -15, 1, -15, 31, -2, 31, -2, 14, -2, 14, -2, 1, 31, 1, 31, 1, 14, 1, 14, -32, -2, -32, -2, -15, -2, -15, -2, -2, 1, -2, 1, -2, 1, -2, 1, -32, 31, -32, 31, -15, 14, -15, 14, -32, 1, -32, 1, -15, 1, -15, 1, -2, 31, -2, 31, -2, 14, -2, 14, 31, 1, 31, 1, 14, 1, 14, 1, -2, -32, -2, -32, -2, -15, -2, -15};
    }

    public static void j6(byte[] r5) {
        int r0 = 0;
        byte r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0 >= r5.length) { $pc0 = 5; continue $sw0; }
                    r1 = r5[r0];
                    r2 = r1 & 254;
                    r3 = (((((r1 >> 1) ^ (r1 >> 2)) ^ (r1 >> 3)) ^ (r1 >> 4)) ^ (r1 >> 5)) ^ (r1 >> 6);
                    r5[r0] = (byte) (((((r1 >> 7) ^ r3) ^ 1) & 1) | r2);
                    r0 = r0 + 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
