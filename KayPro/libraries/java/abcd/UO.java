package abcd;

public class UO extends abcd.SO {
    private java.math.BigInteger FH;

    public UO(java.math.BigInteger r2, abcd.TO r3) {
        super(true, r3);
        this.FH = r2;
    }

    public java.math.BigInteger FH() {
        return this.FH;
    }

    @Override
    public boolean equals(java.lang.Object r4) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r4 instanceof abcd.UO) == true) { $pc0 = 6; continue $sw0; }
                    return false;
                }
                case 6: {
                    if (((abcd.UO) r4).FH().equals(this.FH) == true) { $pc0 = 8; continue $sw0; }
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    return false;
                }
                case 8: {
                    if (super.equals(r4) == false) { $pc0 = 11; continue $sw0; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int hashCode() {
        return this.FH.hashCode() ^ super.hashCode();
    }
}
