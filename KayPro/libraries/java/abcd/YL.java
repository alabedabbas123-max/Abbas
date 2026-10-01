package abcd;

public class YL extends abcd.LL {
    public YL(int r2, abcd.InterfaceqL r3) {
        super(true, r2, r3);
    }

    public YL(boolean r1, int r2, abcd.InterfaceqL r3) {
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
                    return this.Hw.DW().VH().Zo();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    void j6(abcd.CL r3) {
        abcd.InterfaceqL r0 = null;
        java.util.Enumeration r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r3.j6(160, this.j6);
                    r3.j6(128);
                    if (this.DW == false) { $pc1 = 5; continue $sw1; }
                    $pc1 = 25; continue $sw1;
                }
                case 25: {
                    r3.j6(0);
                    r3.j6(0);
                    return;
                }
                case 5: {
                    if (this.FH == true) { $pc1 = 24; continue $sw1; }
                    r0 = this.Hw;
                    if ((r0 instanceof abcd.AL) == false) { $pc1 = 13; continue $sw1; }
                    if ((r0 instanceof abcd.SL) == false) { $pc1 = 11; continue $sw1; }
                    r1 = ((abcd.SL) r0).tp();
                    $pc1 = 19; continue $sw1;
                }
                case 19: {
                    if (r1.hasMoreElements() == false) { $pc1 = 25; continue $sw1; }
                    r3.j6((abcd.InterfaceqL) r1.nextElement());
                    { $pc1 = 19; continue $sw1; }
                }
                case 11: {
                    r1 = new abcd.SL(((abcd.AL) r0).u7()).tp();
                    { $pc1 = 19; continue $sw1; }
                }
                case 13: {
                    if ((r0 instanceof abcd.FL) == false) { $pc1 = 16; continue $sw1; }
                    r1 = ((abcd.FL) r0).u7();
                    { $pc1 = 19; continue $sw1; }
                }
                case 16: {
                    if ((r0 instanceof abcd.HL) == false) { $pc1 = 23; continue $sw1; }
                    r1 = ((abcd.HL) r0).u7();
                    { $pc1 = 19; continue $sw1; }
                }
                case 23: {
                    throw new java.lang.RuntimeException("not implemented: " + this.Hw.getClass().getName());
                }
                case 24: {
                    r3.j6(this.Hw);
                    { $pc1 = 25; continue $sw1; }
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
                    r0 = this.Hw.DW().v5();
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
