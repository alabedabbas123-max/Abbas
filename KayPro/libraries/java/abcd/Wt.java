package abcd;

public final class Wt {
    public static boolean j6(java.lang.String r1) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r1.endsWith(".zip") == false) { $pc0 = 5; continue $sw0; }
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    return true;
                }
                case 5: {
                    if (r1.endsWith(".jar") == true) { $pc0 = 10; continue $sw0; }
                    if (r1.endsWith(".apk") == true) { $pc0 = 10; continue $sw0; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
