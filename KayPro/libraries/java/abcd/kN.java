package abcd;

public class kN extends abcd.AbstractyL {
    abcd.wL DW;
    abcd.wL FH;
    abcd.wL j6;

    private kN(abcd.FL r2) {
        java.util.Enumeration r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r3 = r2.u7();
                    this.j6 = abcd.lM.j6(r3.nextElement());
                    this.DW = abcd.lM.j6(r3.nextElement());
                    if (r3.hasMoreElements() == false) { $pc0 = 5; continue $sw0; }
                    this.FH = (abcd.wL) r3.nextElement();
                    return;
                }
                case 5: {
                    this.FH = null;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public kN(java.math.BigInteger r2, java.math.BigInteger r3, int r4) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    this.j6 = new abcd.wL(r2);
                    this.DW = new abcd.wL(r3);
                    if (r4 == 0) { $pc1 = 5; continue $sw1; }
                    this.FH = new abcd.wL(r4);
                    return;
                }
                case 5: {
                    this.FH = null;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.kN j6(java.lang.Object r1) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if ((r1 instanceof abcd.kN) == true) { $pc2 = 5; continue $sw2; }
                    if (r1 != null) { $pc2 = 8; continue $sw2; }
                    return null;
                }
                case 8: {
                    return new abcd.kN(abcd.FL.j6(r1));
                }
                case 5: {
                    return (abcd.kN) r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.EL DW() {
        abcd.rL r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = new abcd.rL();
                    r0.j6(this.j6);
                    r0.j6(this.DW);
                    if (Zo() == null) { $pc3 = 6; continue $sw3; }
                    r0.j6(this.FH);
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    return new abcd.tM(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.math.BigInteger VH() {
        return this.j6.u7();
    }

    public java.math.BigInteger Zo() {
        abcd.wL r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.FH;
                    if (r0 != null) { $pc4 = 7; continue $sw4; }
                    return null;
                }
                case 7: {
                    return r0.u7();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.math.BigInteger v5() {
        return this.DW.u7();
    }
}
