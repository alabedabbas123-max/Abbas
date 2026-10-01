package abcd;

public class SO extends abcd.PO {
    private abcd.TO DW;

    protected SO(boolean r1, abcd.TO r2) {
        super(r1);
        this.DW = r2;
    }

    public abcd.TO DW() {
        return this.DW;
    }

    public boolean equals(java.lang.Object r3) {
        abcd.SO r4 = null;
        abcd.TO r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r3 instanceof abcd.SO) == true) { $pc0 = 5; continue $sw0; }
                    return false;
                }
                case 5: {
                    r4 = (abcd.SO) r3;
                    r0 = this.DW;
                    if (r0 != null) { $pc0 = 13; continue $sw0; }
                    if (r4.DW() != null) { $pc0 = 11; continue $sw0; }
                    return true;
                }
                case 11: {
                    return false;
                }
                case 13: {
                    return r0.equals(r4.DW());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        int r0 = 0;
        abcd.TO r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (j6() == false) { $pc1 = 5; continue $sw1; }
                    r0 = 0;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    r1 = this.DW;
                    if (r1 != null) { $pc1 = 9; continue $sw1; }
                    return r0;
                }
                case 9: {
                    return r0 ^ r1.hashCode();
                }
                case 5: {
                    r0 = 1;
                    { $pc1 = 6; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
