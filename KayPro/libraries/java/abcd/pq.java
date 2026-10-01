package abcd;

public final class pq {
    public static boolean DW(int r4) {
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r4 >= (-1)) { $pc0 = 6; continue $sw0; }
                    return false;
                }
                case 6: {
                    if (r4 != (-1)) { $pc0 = 8; continue $sw0; }
                    return true;
                }
                case 8: {
                    r1 = r4 & 255;
                    if (r1 != 0) { $pc0 = 11; continue $sw0; }
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    return true;
                }
                case 11: {
                    if (r1 == 255) { $pc0 = 17; continue $sw0; }
                    if ((r4 & 65280) != 0) { $pc0 = 18; continue $sw0; }
                    return true;
                }
                case 18: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(int r1) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r1 < 255) { $pc1 = 5; continue $sw1; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
