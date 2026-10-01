package abcd;

public class CN extends abcd.AbstractyL {
    private abcd.cM DW;
    private abcd.wN j6;

    public CN(abcd.FL r4) {
        java.util.Enumeration r5 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r4.tp() != 2) { $pc0 = 7; continue $sw0; }
                    r5 = r4.u7();
                    this.j6 = abcd.wN.j6(r5.nextElement());
                    this.DW = abcd.cM.j6(r5.nextElement());
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("Bad sequence size: " + r4.tp());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public CN(abcd.wN r2, abcd.InterfaceqL r3) {
        this.DW = new abcd.cM(r3);
        this.j6 = r2;
    }

    public static abcd.CN j6(java.lang.Object r1) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r1 instanceof abcd.CN) == true) { $pc1 = 5; continue $sw1; }
                    if (r1 != null) { $pc1 = 8; continue $sw1; }
                    return null;
                }
                case 8: {
                    return new abcd.CN(abcd.FL.j6(r1));
                }
                case 5: {
                    return (abcd.CN) r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.EL DW() {
        abcd.rL r0 = new abcd.rL();
        r0.j6(this.j6);
        r0.j6(this.DW);
        return new abcd.tM(r0);
    }

    public abcd.EL Zo() {
        return new abcd.C1419vL(this.DW.u7()).Hw();
    }

    public abcd.wN v5() {
        return this.j6;
    }
}
