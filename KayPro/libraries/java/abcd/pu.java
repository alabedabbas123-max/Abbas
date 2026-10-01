package abcd;

public final class pu {
    public static void DW(java.lang.String r1, java.lang.String r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (android.util.Log.isLoggable(r1, 5) == false) { $pc0 = 6; continue $sw0; }
                    android.util.Log.w(r1, r2);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.lang.String r1, java.lang.String r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (android.util.Log.isLoggable(r1, 2) == false) { $pc1 = 6; continue $sw1; }
                    android.util.Log.v(r1, r2);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
