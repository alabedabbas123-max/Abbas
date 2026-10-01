package abcd;

public class ClassO {
    public static void j6(java.lang.Object r2, java.lang.StringBuilder r3) {
        java.lang.String r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 != null) { $pc0 = 4; continue $sw0; }
                    r3.append("null");
                    return;
                }
                case 4: {
                    r0 = r2.getClass().getSimpleName();
                    if (r0 != null) { $pc0 = 7; continue $sw0; }
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    r0 = r2.getClass().getName();
                    r1 = r0.lastIndexOf(46);
                    if (r1 <= 0) { $pc0 = 11; continue $sw0; }
                    r0 = r0.substring(r1 + 1);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    r3.append(r0);
                    r3.append('{');
                    r3.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(r2)));
                    return;
                }
                case 7: {
                    if (r0.length() > 0) { $pc0 = 11; continue $sw0; }
                    { $pc0 = 8; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
