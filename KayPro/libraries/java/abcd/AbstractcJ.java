package abcd;

public abstract class AbstractcJ {
    private static abcd.AbstractcJ j6;

    static {
        j6 = new abcd.mI();
    }

    public AbstractcJ() {
    }

    public static abcd.AbstractcJ j6() {
        return j6;
    }

    public static void j6(abcd.AbstractcJ r0) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r0 == null) { $pc0 = 4; continue $sw0; }
                    j6 = r0;
                    return;
                }
                case 4: {
                    j6 = new abcd.mI();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract abcd.ZI j6(abcd.HJ r1, abcd.AbstractkI r2, abcd.AbstractpK r3, int r4);

    public void j6(abcd.ZI r1) {
        r1.disconnect();
    }
}
