package abcd;

public class ClassW {
    public static <T> T j6(T r0) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r0 == null) { $pc0 = 5; continue $sw0; }
                    return r0;
                }
                case 5: {
                    throw new java.lang.NullPointerException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
