package abcd;

public class YM extends abcd.AbstractyL {
    private abcd.XM DW;
    private abcd.wN FH;
    private abcd.HL Hw;
    private abcd.HL VH;
    private abcd.AL Zo;
    private abcd.wL j6;
    private abcd.wN v5;

    public YM(abcd.FL r5) {
        java.util.Enumeration r6 = null;
        java.lang.Object r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r6 = r5.u7();
                    this.j6 = (abcd.wL) r6.nextElement();
                    this.DW = abcd.XM.j6(r6.nextElement());
                    this.FH = abcd.wN.j6(r6.nextElement());
                    r0 = r6.nextElement();
                    if ((r0 instanceof abcd.LL) == false) { $pc0 = 5; continue $sw0; }
                    this.Hw = abcd.HL.j6((abcd.LL) r0, false);
                    this.v5 = abcd.wN.j6(r6.nextElement());
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    this.Zo = abcd.AL.j6(r6.nextElement());
                    if (r6.hasMoreElements() == false) { $pc0 = 9; continue $sw0; }
                    this.VH = abcd.HL.j6((abcd.LL) r6.nextElement(), false);
                    return;
                }
                case 9: {
                    this.VH = null;
                    return;
                }
                case 5: {
                    this.Hw = null;
                    this.v5 = abcd.wN.j6(r0);
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public YM(abcd.XM r3, abcd.wN r4, abcd.HL r5, abcd.wN r6, abcd.AL r7, abcd.HL r8) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r3.v5() == false) { $pc1 = 5; continue $sw1; }
                    this.j6 = new abcd.wL(3);
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    this.DW = r3;
                    this.FH = r4;
                    this.Hw = r5;
                    this.v5 = r6;
                    this.Zo = r7;
                    this.VH = r8;
                    return;
                }
                case 5: {
                    this.j6 = new abcd.wL(1);
                    { $pc1 = 6; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.YM j6(java.lang.Object r3) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r3 == null) { $pc2 = 13; continue $sw2; }
                    if ((r3 instanceof abcd.YM) == true) { $pc2 = 13; continue $sw2; }
                    if ((r3 instanceof abcd.FL) == false) { $pc2 = 11; continue $sw2; }
                    return new abcd.YM((abcd.FL) r3);
                }
                case 11: {
                    throw new java.lang.IllegalArgumentException("unknown object in factory: " + r3.getClass().getName());
                }
                case 13: {
                    return (abcd.YM) r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.EL DW() {
        abcd.rL r0 = null;
        abcd.HL r1 = null;
        abcd.HL r2 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = new abcd.rL();
                    r0.j6(this.j6);
                    r0.j6(this.DW);
                    r0.j6(this.FH);
                    r1 = this.Hw;
                    if (r1 == null) { $pc3 = 5; continue $sw3; }
                    r0.j6(new abcd.yM(false, 0, r1));
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    r0.j6(this.v5);
                    r0.j6(this.Zo);
                    r2 = this.VH;
                    if (r2 == null) { $pc3 = 9; continue $sw3; }
                    r0.j6(new abcd.yM(false, 1, r2));
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    return new abcd.tM(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.wL Zo() {
        return this.j6;
    }

    public abcd.wN v5() {
        return this.FH;
    }
}
