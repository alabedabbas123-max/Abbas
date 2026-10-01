package abcd;

public class iK extends abcd.AbstractjK {
    private final int FH;

    public iK(int r1) {
        this.FH = r1;
    }

    @Override
    public abcd.AbstractjK clone() {
        return this;
    }

    @Override
    public boolean j6() {
        return false;
    }

    @Override
    public boolean j6(abcd.YJ r3) {
        abcd.RC r4 = null;
        abcd.QC r5 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r4 = (abcd.RC) r3.j6(this.FH, abcd.RC.class);
                    if (r4 != null) { $pc0 = 5; continue $sw0; }
                    return true;
                }
                case 5: {
                    r5 = r4.J8();
                    if (r5 != null) { $pc0 = 8; continue $sw0; }
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    return true;
                }
                case 8: {
                    if (r5.we() == false) { $pc0 = 11; continue $sw0; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String toString() {
        return "SkipWorkTree(" + this.FH + ")";
    }
}
