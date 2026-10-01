package abcd;

public class yN extends abcd.AbstractyL {
    abcd.DN DW;
    abcd.wN FH;
    abcd.cM Hw;
    abcd.FL j6;

    private yN(abcd.FL r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.j6 = r3;
                    if (r3.tp() != 3) { $pc0 = 7; continue $sw0; }
                    this.DW = abcd.DN.j6(r3.j6(0));
                    this.FH = abcd.wN.j6(r3.j6(1));
                    this.Hw = abcd.cM.j6(r3.j6(2));
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("sequence wrong size for a certificate");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.yN j6(java.lang.Object r1) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r1 instanceof abcd.yN) == true) { $pc1 = 5; continue $sw1; }
                    if (r1 != null) { $pc1 = 8; continue $sw1; }
                    return null;
                }
                case 8: {
                    return new abcd.yN(abcd.FL.j6(r1));
                }
                case 5: {
                    return (abcd.yN) r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.EL DW() {
        return this.j6;
    }

    public abcd.DN VH() {
        return this.DW;
    }

    public abcd.wL Zo() {
        return this.DW.VH();
    }

    public abcd.sN v5() {
        return this.DW.Zo();
    }
}
