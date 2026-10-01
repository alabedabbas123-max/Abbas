package abcd;

public final class En {
    public static int j6(byte[] r3) {
        java.lang.String r4 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r3.length == 8) { $pc0 = 6; continue $sw0; }
                    return -1;
                }
                case 6: {
                    if (r3[0] == 100) { $pc0 = 8; continue $sw0; }
                    $pc0 = 24; continue $sw0;
                }
                case 24: {
                    return -1;
                }
                case 8: {
                    if (r3[1] != 101) { $pc0 = 24; continue $sw0; }
                    if (r3[2] != 120) { $pc0 = 24; continue $sw0; }
                    if (r3[3] != 10) { $pc0 = 24; continue $sw0; }
                    if (r3[7] != 0) { $pc0 = 24; continue $sw0; }
                    r4 = "" + ((char) r3[4]) + ((char) r3[5]) + ((char) r3[6]);
                    if (r4.equals("036") == false) { $pc0 = 21; continue $sw0; }
                    return 14;
                }
                case 21: {
                    if (r4.equals("035") == false) { $pc0 = 24; continue $sw0; }
                    return 13;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(int r2) {
        java.lang.String r3 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r2 < 14) { $pc1 = 5; continue $sw1; }
                    r3 = "036";
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    return "dex\n" + r3 + "\u0000";
                }
                case 5: {
                    r3 = "035";
                    { $pc1 = 7; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
