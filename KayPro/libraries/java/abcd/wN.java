package abcd;

public class wN extends abcd.AbstractyL {
    private abcd.InterfaceqL DW;
    private boolean FH;
    private abcd.zL j6;

    public wN(abcd.FL r5) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.FH = false;
                    if (r5.tp() < 1) { $pc0 = 12; continue $sw0; }
                    if (r5.tp() > 2) { $pc0 = 12; continue $sw0; }
                    this.j6 = abcd.oM.j6(r5.j6(0));
                    if (r5.tp() != 2) { $pc0 = 9; continue $sw0; }
                    this.FH = true;
                    this.DW = r5.j6(1);
                    return;
                }
                case 9: {
                    this.DW = null;
                    return;
                }
                case 12: {
                    throw new java.lang.IllegalArgumentException("Bad sequence size: " + r5.tp());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public wN(abcd.oM r2) {
        this.FH = false;
        this.j6 = new abcd.zL(r2.tp());
    }

    public wN(abcd.oM r2, abcd.InterfaceqL r3) {
        this.FH = false;
        this.FH = true;
        this.j6 = new abcd.zL(r2.tp());
        this.DW = r3;
    }

    public wN(abcd.zL r2) {
        this.FH = false;
        this.j6 = r2;
    }

    public wN(abcd.zL r2, abcd.InterfaceqL r3) {
        this.FH = false;
        this.FH = true;
        this.j6 = r2;
        this.DW = r3;
    }

    public wN(java.lang.String r2) {
        this.FH = false;
        this.j6 = new abcd.zL(r2);
    }

    public static abcd.wN j6(abcd.LL r0, boolean r1) {
        return j6(abcd.FL.j6(r0, r1));
    }

    public static abcd.wN j6(java.lang.Object r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r3 == null) { $pc1 = 24; continue $sw1; }
                    if ((r3 instanceof abcd.wN) == true) { $pc1 = 24; continue $sw1; }
                    if ((r3 instanceof abcd.zL) == false) { $pc1 = 11; continue $sw1; }
                    return new abcd.wN((abcd.zL) r3);
                }
                case 11: {
                    if ((r3 instanceof java.lang.String) == false) { $pc1 = 15; continue $sw1; }
                    return new abcd.wN((java.lang.String) r3);
                }
                case 15: {
                    if ((r3 instanceof abcd.FL) == true) { $pc1 = 22; continue $sw1; }
                    if ((r3 instanceof abcd.GL) == true) { $pc1 = 22; continue $sw1; }
                    throw new java.lang.IllegalArgumentException("unknown object in factory: " + r3.getClass().getName());
                }
                case 22: {
                    return new abcd.wN(abcd.FL.j6(r3));
                }
                case 24: {
                    return (abcd.wN) r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.EL DW() {
        abcd.rL r0 = null;
        abcd.InterfaceqL r1 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new abcd.rL();
                    r0.j6(this.j6);
                    if (this.FH == false) { $pc2 = 9; continue $sw2; }
                    r1 = this.DW;
                    if (r1 == null) { $pc2 = 7; continue $sw2; }
                    r0.j6(r1);
                    { $pc2 = 9; continue $sw2; }
                }
                case 7: {
                    r0.j6(abcd.mM.j6);
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    return new abcd.tM(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.InterfaceqL VH() {
        return this.DW;
    }

    public abcd.zL Zo() {
        return this.j6;
    }

    public abcd.zL v5() {
        return new abcd.zL(this.j6.tp());
    }
}
