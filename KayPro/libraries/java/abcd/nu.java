package abcd;

public final class nu {
    public static int j6(int r4, int r5) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r4 != r5) { $pc0 = 6; continue $sw0; }
                    return 0;
                }
                case 6: {
                    if ((((long) r4) & 4294967295L) >= (((long) r5) & 4294967295L)) { $pc0 = 8; continue $sw0; }
                    return -1;
                }
                case 8: {
                    return 1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int j6(short r1, short r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r1 != r2) { $pc1 = 6; continue $sw1; }
                    return 0;
                }
                case 6: {
                    if ((r1 & 65535) >= (r2 & 65535)) { $pc1 = 8; continue $sw1; }
                    return -1;
                }
                case 8: {
                    return 1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
