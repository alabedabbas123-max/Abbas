package abcd;

public class iP extends java.security.BasicPermission {
    private final int DW;
    private final java.lang.String j6;

    public iP(java.lang.String r1, java.lang.String r2) {
        super(r1, r2);
        this.j6 = r2;
        this.DW = j6(r2);
    }

    private int j6(java.lang.String r4) {
        java.util.StringTokenizer r0 = null;
        int r5 = 0;
        java.lang.String r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new java.util.StringTokenizer(abcd.TP.DW(r4), " ,");
                    r5 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0.hasMoreTokens() == false) { $pc0 = 5; continue $sw0; }
                    r1 = r0.nextToken();
                    if (r1.equals("threadlocalecimplicitlyca") == true) { $pc0 = 11; continue $sw0; }
                    if (r1.equals("ecimplicitlyca") == true) { $pc0 = 14; continue $sw0; }
                    if (r1.equals("threadlocaldhdefaultparams") == true) { $pc0 = 17; continue $sw0; }
                    if (r1.equals("dhdefaultparams") == true) { $pc0 = 20; continue $sw0; }
                    if (r1.equals("all") == false) { $pc0 = 4; continue $sw0; }
                    r5 = r5 | 15;
                    { $pc0 = 4; continue $sw0; }
                }
                case 20: {
                    r5 = r5 | 8;
                    { $pc0 = 4; continue $sw0; }
                }
                case 17: {
                    r5 = r5 | 4;
                    { $pc0 = 4; continue $sw0; }
                }
                case 14: {
                    r5 = r5 | 2;
                    { $pc0 = 4; continue $sw0; }
                }
                case 11: {
                    r5 = r5 | 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 5: {
                    if (r5 == 0) { $pc0 = 8; continue $sw0; }
                    return r5;
                }
                case 8: {
                    throw new java.lang.IllegalArgumentException("unknown permissions passed to mask");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean equals(java.lang.Object r5) {
        abcd.iP r6 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r5 != this) { $pc1 = 6; continue $sw1; }
                    return true;
                }
                case 6: {
                    if ((r5 instanceof abcd.iP) == false) { $pc1 = 12; continue $sw1; }
                    r6 = (abcd.iP) r5;
                    if (this.DW != r6.DW) { $pc1 = 12; continue $sw1; }
                    if (getName().equals(r6.getName()) == false) { $pc1 = 12; continue $sw1; }
                    return true;
                }
                case 12: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String getActions() {
        return this.j6;
    }

    public int hashCode() {
        return getName().hashCode() + this.DW;
    }

    @Override
    public boolean implies(java.security.Permission r4) {
        int r0 = 0;
        int r5 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if ((r4 instanceof abcd.iP) == true) { $pc2 = 6; continue $sw2; }
                    return false;
                }
                case 6: {
                    if (getName().equals(r4.getName()) == true) { $pc2 = 8; continue $sw2; }
                    return false;
                }
                case 8: {
                    r0 = this.DW;
                    r5 = ((abcd.iP) r4).DW;
                    if ((r0 & r5) != r5) { $pc2 = 12; continue $sw2; }
                    return true;
                }
                case 12: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
