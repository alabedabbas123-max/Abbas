package abcd;

public class rB {
    private final abcd.pB DW;
    private final abcd.AB FH;
    private final java.lang.String Hw;
    private final abcd.qI j6;

    rB(abcd.qI r1, java.lang.String r2, abcd.AB r3) {
        this.j6 = r1;
        this.Hw = r2;
        this.DW = null;
        this.FH = r3;
    }

    rB(abcd.qI r1, java.lang.String r2, abcd.pB r3) {
        this.j6 = r1;
        this.Hw = r2;
        this.DW = r3;
        this.FH = null;
    }

    public boolean DW() {
        abcd.pB r0 = null;
        abcd.AB r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.DW;
                    if (r0 != null) { $pc0 = 5; continue $sw0; }
                    r1 = this.FH;
                    if (r1 != null) { $pc0 = 9; continue $sw0; }
                    return true;
                }
                case 9: {
                    return r1.j6().Hw();
                }
                case 5: {
                    return r0.j6().Hw();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.pB j6() {
        return this.DW;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = null;
        abcd.qI r1 = null;
        abcd.pB r2 = null;
        abcd.AB r3 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r1 = this.j6;
                    if (r1 == null) { $pc1 = 5; continue $sw1; }
                    r0.append(r1.toString());
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    r0.append("\n");
                    r2 = this.DW;
                    if (r2 == null) { $pc1 = 9; continue $sw1; }
                    r0.append(r2.toString());
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    return r0.toString();
                }
                case 9: {
                    r3 = this.FH;
                    if (r3 == null) { $pc1 = 12; continue $sw1; }
                    r0.append(r3.toString());
                    { $pc1 = 14; continue $sw1; }
                }
                case 12: {
                    r0.append("No update result");
                    { $pc1 = 14; continue $sw1; }
                }
                case 5: {
                    r0.append("No fetch result");
                    { $pc1 = 6; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
