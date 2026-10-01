package abcd;

public class mN extends abcd.AbstractyL {
    private abcd.wN DW;
    private abcd.HL FH;
    private abcd.AL j6;

    public mN(abcd.FL r2) {
        java.util.Enumeration r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r3 = r2.u7();
                    if (((abcd.wL) r3.nextElement()).tp().intValue() != 0) { $pc0 = 9; continue $sw0; }
                    this.DW = abcd.wN.j6(r3.nextElement());
                    this.j6 = abcd.AL.j6(r3.nextElement());
                    if (r3.hasMoreElements() == false) { $pc0 = 10; continue $sw0; }
                    this.FH = abcd.HL.j6((abcd.LL) r3.nextElement(), false);
                    return;
                }
                case 10: {
                    return;
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException("wrong version for private key info");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public mN(abcd.wN r2, abcd.InterfaceqL r3) {
        this(r2, r3, null);
    }

    public mN(abcd.wN r3, abcd.InterfaceqL r4, abcd.HL r5) {
        this.j6 = new abcd.pM(r4.DW().j6("DER"));
        this.DW = r3;
        this.FH = r5;
    }

    public static abcd.mN j6(java.lang.Object r1) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r1 instanceof abcd.mN) == true) { $pc1 = 5; continue $sw1; }
                    if (r1 != null) { $pc1 = 8; continue $sw1; }
                    return null;
                }
                case 8: {
                    return new abcd.mN(abcd.FL.j6(r1));
                }
                case 5: {
                    return (abcd.mN) r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.EL DW() {
        abcd.rL r0 = null;
        abcd.HL r1 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new abcd.rL();
                    r0.j6(new abcd.wL(0));
                    r0.j6(this.DW);
                    r0.j6(this.j6);
                    r1 = this.FH;
                    if (r1 == null) { $pc2 = 6; continue $sw2; }
                    r0.j6(new abcd.yM(false, 0, r1));
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    return new abcd.tM(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.InterfaceqL Zo() {
        return abcd.EL.j6(this.j6.u7());
    }

    public abcd.wN v5() {
        return this.DW;
    }
}
