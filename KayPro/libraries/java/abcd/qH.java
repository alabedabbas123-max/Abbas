package abcd;

public class qH {
    private java.io.File j6;

    public qH(abcd.UE r4, java.lang.String r5) {
        this.j6 = new java.io.File(r4.VH(), "logs/" + r5);
    }

    public abcd.pH j6(int r6) {
        byte[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r6 < 0) { $pc0 = 19; continue $sw0; }
                    try {
                        r1 = abcd.BK.j6(this.j6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.FileNotFoundException) { $pc0 = 17; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r2 = abcd.IK.we(r1, r1.length);
                    r3 = 0;
                    r4 = 0;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r2 < 0) { $pc0 = 7; continue $sw0; }
                    r2 = abcd.IK.we(r1, r2);
                    if (r6 == r4) { $pc0 = 11; continue $sw0; }
                    r4 = r4 + 1;
                    { $pc0 = 6; continue $sw0; }
                }
                case 11: {
                    if (r2 < 0) { $pc0 = 15; continue $sw0; }
                    r3 = r2 + 2;
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    return new abcd.pH(r1, r3);
                }
                case 7: {
                    return null;
                }
                case 17: {
                    return null;
                }
                case 19: {
                    throw new java.lang.IllegalArgumentException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
