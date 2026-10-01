package abcd;

public class UM extends abcd.AbstractyL implements abcd.TM {
    private abcd.InterfaceqL DW;
    private abcd.zL j6;

    public UM(abcd.FL r4) {
        abcd.LL r5 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r4.tp() < 1) { $pc0 = 17; continue $sw0; }
                    if (r4.tp() > 2) { $pc0 = 17; continue $sw0; }
                    this.j6 = (abcd.zL) r4.j6(0);
                    if (r4.tp() <= 1) { $pc0 = 15; continue $sw0; }
                    r5 = (abcd.LL) r4.j6(1);
                    if (r5.we() == false) { $pc0 = 14; continue $sw0; }
                    if (r5.tp() != 0) { $pc0 = 14; continue $sw0; }
                    this.DW = r5.u7();
                    return;
                }
                case 14: {
                    throw new java.lang.IllegalArgumentException("Bad tag for 'content'");
                }
                case 15: {
                    return;
                }
                case 17: {
                    throw new java.lang.IllegalArgumentException("Bad sequence size: " + r4.tp());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public UM(abcd.zL r1, abcd.InterfaceqL r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    public static abcd.UM j6(java.lang.Object r1) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r1 instanceof abcd.UM) == true) { $pc1 = 5; continue $sw1; }
                    if (r1 != null) { $pc1 = 8; continue $sw1; }
                    return null;
                }
                case 8: {
                    return new abcd.UM(abcd.FL.j6(r1));
                }
                case 5: {
                    return (abcd.UM) r1;
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
                    r1 = this.DW;
                    if (r1 == null) { $pc2 = 6; continue $sw2; }
                    r0.j6(new abcd.YL(0, r1));
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    return new abcd.UL(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.zL Zo() {
        return this.j6;
    }

    public abcd.InterfaceqL v5() {
        return this.DW;
    }
}
