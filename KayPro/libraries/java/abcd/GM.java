package abcd;

public class GM extends abcd.LL {
    private static final byte[] v5 = null;

    static {
        v5 = new byte[0];
    }

    public GM(boolean r1, int r2, abcd.InterfaceqL r3) {
        super(r1, r2, r3);
    }

    @Override
    boolean Zo() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.DW == false) { $pc0 = 5; continue $sw0; }
                    return true;
                }
                case 5: {
                    if (this.FH == false) { $pc0 = 8; continue $sw0; }
                    return true;
                }
                case 8: {
                    return this.Hw.DW().gn().Zo();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    void j6(abcd.CL r4) {
        int r1 = 0;
        abcd.EL r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r1 = 160;
                    if (this.DW == true) { $pc1 = 12; continue $sw1; }
                    r0 = this.Hw.DW().gn();
                    if (this.FH == false) { $pc1 = 8; continue $sw1; }
                    r4.j6(160, this.j6);
                    r4.DW(r0.v5());
                    r4.j6(r0);
                    return;
                }
                case 8: {
                    if (r0.Zo() == true) { $pc1 = 11; continue $sw1; }
                    r1 = 128;
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    r4.j6(r1, this.j6);
                    r4.j6(r0);
                    return;
                }
                case 12: {
                    r4.j6(160, this.j6, v5);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    int v5() {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.DW == true) { $pc2 = 11; continue $sw2; }
                    r0 = this.Hw.DW().gn().v5();
                    if (this.FH == false) { $pc2 = 9; continue $sw2; }
                    r1 = abcd.OM.DW(this.j6) + abcd.OM.j6(r0);
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    return r1 + r0;
                }
                case 9: {
                    r0 = r0 - 1;
                    r1 = abcd.OM.DW(this.j6);
                    { $pc2 = 8; continue $sw2; }
                }
                case 11: {
                    return abcd.OM.DW(this.j6) + 1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
