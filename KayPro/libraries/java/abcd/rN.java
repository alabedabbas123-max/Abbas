package abcd;

public class rN extends abcd.AbstractyL {
    private abcd.HL j6;

    private rN(abcd.HL r1) {
        this.j6 = r1;
    }

    public static abcd.rN j6(java.lang.Object r1) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r1 instanceof abcd.rN) == true) { $pc0 = 5; continue $sw0; }
                    if (r1 != null) { $pc0 = 8; continue $sw0; }
                    return null;
                }
                case 8: {
                    return new abcd.rN(abcd.HL.j6(r1));
                }
                case 5: {
                    return (abcd.rN) r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.EL DW() {
        return this.j6;
    }

    public boolean VH() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.j6.tp() <= 1) { $pc1 = 5; continue $sw1; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.qN[] Zo() {
        abcd.qN[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new abcd.qN[this.j6.tp()];
                    r1 = 0;
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r1 == r0.length) { $pc2 = 5; continue $sw2; }
                    r0[r1] = abcd.qN.j6(this.j6.j6(r1));
                    r1 = r1 + 1;
                    { $pc2 = 4; continue $sw2; }
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.qN v5() {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.j6.tp() != 0) { $pc3 = 7; continue $sw3; }
                    return null;
                }
                case 7: {
                    return abcd.qN.j6(this.j6.j6(0));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
