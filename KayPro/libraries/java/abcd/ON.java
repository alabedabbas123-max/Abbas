package abcd;

public class ON extends abcd.AbstractyL {
    private abcd.wL DW;
    private abcd.wL FH;
    private abcd.wL Hw;
    private abcd.wL j6;
    private abcd.PN v5;

    private ON(abcd.FL r4) {
        java.util.Enumeration r5 = null;
        abcd.InterfaceqL r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r4.tp() < 3) { $pc0 = 15; continue $sw0; }
                    if (r4.tp() > 5) { $pc0 = 15; continue $sw0; }
                    r5 = r4.u7();
                    this.j6 = abcd.lM.j6(r5.nextElement());
                    this.DW = abcd.lM.j6(r5.nextElement());
                    this.FH = abcd.lM.j6(r5.nextElement());
                    r0 = j6(r5);
                    if (r0 != null) { $pc0 = 9; continue $sw0; }
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    if (r0 == null) { $pc0 = 16; continue $sw0; }
                    this.v5 = abcd.PN.j6(r0.DW());
                    return;
                }
                case 16: {
                    return;
                }
                case 9: {
                    if ((r0 instanceof abcd.wL) == false) { $pc0 = 11; continue $sw0; }
                    this.Hw = abcd.lM.j6(r0);
                    r0 = j6(r5);
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    throw new java.lang.IllegalArgumentException("Bad sequence size: " + r4.tp());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.ON j6(java.lang.Object r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r3 == null) { $pc1 = 13; continue $sw1; }
                    if ((r3 instanceof abcd.ON) == true) { $pc1 = 13; continue $sw1; }
                    if ((r3 instanceof abcd.FL) == false) { $pc1 = 11; continue $sw1; }
                    return new abcd.ON((abcd.FL) r3);
                }
                case 11: {
                    throw new java.lang.IllegalArgumentException("Invalid DHDomainParameters: " + r3.getClass().getName());
                }
                case 13: {
                    return (abcd.ON) r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static abcd.InterfaceqL j6(java.util.Enumeration r1) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r1.hasMoreElements() == true) { $pc2 = 7; continue $sw2; }
                    return null;
                }
                case 7: {
                    return (abcd.InterfaceqL) r1.nextElement();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.EL DW() {
        abcd.rL r0 = null;
        abcd.wL r1 = null;
        abcd.PN r2 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = new abcd.rL();
                    r0.j6(this.j6);
                    r0.j6(this.DW);
                    r0.j6(this.FH);
                    r1 = this.Hw;
                    if (r1 == null) { $pc3 = 5; continue $sw3; }
                    r0.j6(r1);
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    r2 = this.v5;
                    if (r2 == null) { $pc3 = 9; continue $sw3; }
                    r0.j6(r2);
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    return new abcd.tM(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.wL Zo() {
        return this.j6;
    }

    public abcd.wL v5() {
        return this.DW;
    }
}
