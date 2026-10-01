package abcd;

public class PN extends abcd.AbstractyL {
    private abcd.wL DW;
    private abcd.cM j6;

    private PN(abcd.FL r4) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r4.tp() != 2) { $pc0 = 7; continue $sw0; }
                    this.j6 = abcd.cM.j6(r4.j6(0));
                    this.DW = abcd.lM.j6(r4.j6(1));
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("Bad sequence size: " + r4.tp());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.PN j6(java.lang.Object r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r3 == null) { $pc1 = 13; continue $sw1; }
                    if ((r3 instanceof abcd.ON) == true) { $pc1 = 13; continue $sw1; }
                    if ((r3 instanceof abcd.FL) == false) { $pc1 = 11; continue $sw1; }
                    return new abcd.PN((abcd.FL) r3);
                }
                case 11: {
                    throw new java.lang.IllegalArgumentException("Invalid DHValidationParms: " + r3.getClass().getName());
                }
                case 13: {
                    return (abcd.PN) r3;
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
}
