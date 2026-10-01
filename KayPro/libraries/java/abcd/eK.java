package abcd;

public class eK extends abcd.AbstractjK {
    private final int FH;

    public eK(int r1) {
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
        abcd._J r4 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r4 = (abcd._J) r3.j6(this.FH, abcd._J.class);
                    if (r4 != null) { $pc0 = 5; continue $sw0; }
                    return true;
                }
                case 5: {
                    if (r4.U2() == false) { $pc0 = 10; continue $sw0; }
                    return false;
                }
                case 10: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String toString() {
        return "NotIgnored(" + this.FH + ")";
    }
}
