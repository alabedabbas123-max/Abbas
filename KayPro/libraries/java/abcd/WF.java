package abcd;

public class WF extends abcd.AbstractjK {
    private final abcd.fK FH;
    private abcd.AbstractbG Hw;

    WF(abcd.fK r1) {
        this.FH = r1;
    }

    public static abcd.WF j6(java.lang.String r1) {
        return new abcd.WF(abcd.fK.j6(r1));
    }

    public java.lang.String DW() {
        return this.FH.DW();
    }

    public abcd.AbstractbG FH() {
        return this.Hw;
    }

    @Override
    public abcd.AbstractjK clone() {
        abcd.fK r1 = this.FH;
        r1.clone();
        return new abcd.WF(r1);
    }

    public void j6(abcd.AbstractbG r1) {
        this.Hw = r1;
    }

    @Override
    public boolean j6() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.FH.j6() == false) { $pc0 = 5; continue $sw0; }
                    return true;
                }
                case 5: {
                    if (abcd.AbstractjK.DW.j6() == true) { $pc0 = 10; continue $sw0; }
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
    public boolean j6(abcd.YJ r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.FH.j6(r2) == true) { $pc1 = 5; continue $sw1; }
                    return false;
                }
                case 5: {
                    if (abcd.AbstractjK.DW.j6(r2) == false) { $pc1 = 10; continue $sw1; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String toString() {
        return "(FOLLOW(" + this.FH.toString() + ") AND " + abcd.AbstractjK.DW.toString() + ")";
    }
}
