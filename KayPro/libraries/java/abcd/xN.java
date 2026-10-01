package abcd;

public class xN extends abcd.AbstractyL {
    abcd.wL DW;
    abcd.dM j6;

    private xN(abcd.FL r4) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.j6 = new abcd.dM(false);
                    this.DW = null;
                    if (r4.tp() != 0) { $pc0 = 6; continue $sw0; }
                    this.j6 = null;
                    this.DW = null;
                    return;
                }
                case 6: {
                    if ((r4.j6(0) instanceof abcd.dM) == false) { $pc0 = 8; continue $sw0; }
                    this.j6 = abcd.dM.j6(r4.j6(0));
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    if (r4.tp() > 1) { $pc0 = 12; continue $sw0; }
                    return;
                }
                case 12: {
                    if (this.j6 == null) { $pc0 = 15; continue $sw0; }
                    this.DW = abcd.lM.j6(r4.j6(1));
                    return;
                }
                case 15: {
                    throw new java.lang.IllegalArgumentException("wrong sequence in constructor");
                }
                case 8: {
                    this.j6 = null;
                    this.DW = abcd.lM.j6(r4.j6(0));
                    { $pc0 = 10; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.xN j6(java.lang.Object r1) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r1 instanceof abcd.xN) == false) { $pc1 = 7; continue $sw1; }
                    return (abcd.xN) r1;
                }
                case 7: {
                    if ((r1 instanceof abcd.IN) == true) { $pc1 = 9; continue $sw1; }
                    if (r1 != null) { $pc1 = 12; continue $sw1; }
                    return null;
                }
                case 12: {
                    return new abcd.xN(abcd.FL.j6(r1));
                }
                case 9: {
                    return j6(abcd.IN.j6((abcd.IN) r1));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.EL DW() {
        abcd.rL r0 = null;
        abcd.dM r1 = null;
        abcd.wL r2 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new abcd.rL();
                    r1 = this.j6;
                    if (r1 == null) { $pc2 = 5; continue $sw2; }
                    r0.j6(r1);
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    r2 = this.DW;
                    if (r2 == null) { $pc2 = 9; continue $sw2; }
                    r0.j6(r2);
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    return new abcd.tM(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean Zo() {
        abcd.dM r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.j6;
                    if (r0 != null) { $pc3 = 5; continue $sw3; }
                    return false;
                }
                case 5: {
                    if (r0.u7() == false) { $pc3 = 10; continue $sw3; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (this.DW != null) { $pc4 = 11; continue $sw4; }
                    if (this.j6 != null) { $pc4 = 9; continue $sw4; }
                    return "BasicConstraints: isCa(false)";
                }
                case 9: {
                    return "BasicConstraints: isCa(" + Zo() + ")";
                }
                case 11: {
                    return "BasicConstraints: isCa(" + Zo() + "), pathLenConstraint = " + this.DW.tp();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.math.BigInteger v5() {
        abcd.wL r0 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.DW;
                    if (r0 != null) { $pc5 = 5; continue $sw5; }
                    return null;
                }
                case 5: {
                    return r0.tp();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
