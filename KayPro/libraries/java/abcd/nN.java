package abcd;

public class nN extends abcd.AbstractyL {
    public static final abcd.wN DW = null;
    public static final abcd.wL FH = null;
    public static final abcd.wL Hw = null;
    public static final abcd.wN j6 = null;
    private abcd.wL VH;
    private abcd.wN Zo;
    private abcd.wL gn;
    private abcd.wN v5;

    static {
        j6 = new abcd.wN(abcd.InterfacejN.u7, new abcd.mM());
        DW = new abcd.wN(abcd.InterfacelN.u7, j6);
        FH = new abcd.wL(20);
        Hw = new abcd.wL(1);
    }

    public nN() {
        this.v5 = j6;
        this.Zo = DW;
        this.VH = FH;
        this.gn = Hw;
    }

    private nN(abcd.FL r6) {
        int r0 = 0;
        abcd.LL r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.v5 = j6;
                    this.Zo = DW;
                    this.VH = FH;
                    this.gn = Hw;
                    r0 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0 == r6.tp()) { $pc0 = 5; continue $sw0; }
                    r1 = (abcd.LL) r6.j6(r0);
                    r2 = r1.tp();
                    if (r2 == 0) { $pc0 = 18; continue $sw0; }
                    if (r2 != 1) { $pc0 = 10; continue $sw0; }
                    this.Zo = abcd.wN.j6(r1, true);
                    $pc0 = 19; continue $sw0;
                }
                case 19: {
                    r0 = r0 + 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 10: {
                    if (r2 != 2) { $pc0 = 12; continue $sw0; }
                    this.VH = abcd.lM.j6(r1, true);
                    { $pc0 = 19; continue $sw0; }
                }
                case 12: {
                    if (r2 != 3) { $pc0 = 15; continue $sw0; }
                    this.gn = abcd.lM.j6(r1, true);
                    { $pc0 = 19; continue $sw0; }
                }
                case 15: {
                    throw new java.lang.IllegalArgumentException("unknown tag");
                }
                case 18: {
                    this.v5 = abcd.wN.j6(r1, true);
                    { $pc0 = 19; continue $sw0; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public nN(abcd.wN r1, abcd.wN r2, abcd.wL r3, abcd.wL r4) {
        this.v5 = r1;
        this.Zo = r2;
        this.VH = r3;
        this.gn = r4;
    }

    public static abcd.nN j6(java.lang.Object r1) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r1 instanceof abcd.nN) == true) { $pc1 = 5; continue $sw1; }
                    if (r1 != null) { $pc1 = 8; continue $sw1; }
                    return null;
                }
                case 8: {
                    return new abcd.nN(abcd.FL.j6(r1));
                }
                case 5: {
                    return (abcd.nN) r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.EL DW() {
        abcd.rL r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new abcd.rL();
                    if (this.v5.equals(j6) == true) { $pc2 = 6; continue $sw2; }
                    r0.j6(new abcd.yM(true, 0, this.v5));
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (this.Zo.equals(DW) == true) { $pc2 = 9; continue $sw2; }
                    r0.j6(new abcd.yM(true, 1, this.Zo));
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    if (this.VH.equals(FH) == true) { $pc2 = 12; continue $sw2; }
                    r0.j6(new abcd.yM(true, 2, this.VH));
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    if (this.gn.equals(Hw) == true) { $pc2 = 15; continue $sw2; }
                    r0.j6(new abcd.yM(true, 3, this.gn));
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    return new abcd.tM(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.wN v5() {
        return this.v5;
    }
}
