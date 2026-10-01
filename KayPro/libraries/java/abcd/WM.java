package abcd;

public class WM extends abcd.AbstractyL {
    private abcd.HL DW;
    private abcd.UM FH;
    private abcd.HL Hw;
    private boolean VH;
    private abcd.HL Zo;
    private boolean gn;
    private abcd.wL j6;
    private abcd.HL v5;

    private WM(abcd.FL r5) {
        java.util.Enumeration r6 = null;
        abcd.EL r0 = null;
        abcd.LL r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r6 = r5.u7();
                    this.j6 = abcd.lM.j6(r6.nextElement());
                    this.DW = (abcd.HL) r6.nextElement();
                    this.FH = abcd.UM.j6(r6.nextElement());
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r6.hasMoreElements() == false) { $pc0 = 5; continue $sw0; }
                    r0 = (abcd.EL) r6.nextElement();
                    if ((r0 instanceof abcd.LL) == true) { $pc0 = 8; continue $sw0; }
                    this.Zo = (abcd.HL) r0;
                    { $pc0 = 4; continue $sw0; }
                }
                case 8: {
                    r1 = (abcd.LL) r0;
                    r2 = r1.tp();
                    if (r2 != 0) { $pc0 = 11; continue $sw0; }
                    this.VH = r1 instanceof abcd.YL;
                    this.Hw = abcd.HL.j6(r1, false);
                    { $pc0 = 4; continue $sw0; }
                }
                case 11: {
                    if (r2 != 1) { $pc0 = 14; continue $sw0; }
                    this.gn = r1 instanceof abcd.YL;
                    this.v5 = abcd.HL.j6(r1, false);
                    { $pc0 = 4; continue $sw0; }
                }
                case 14: {
                    throw new java.lang.IllegalArgumentException("unknown tag value " + r1.tp());
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public WM(abcd.HL r2, abcd.UM r3, abcd.HL r4, abcd.HL r5, abcd.HL r6) {
        this.j6 = j6(r3.Zo(), r4, r5, r6);
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
        this.v5 = r5;
        this.Zo = r6;
        this.gn = r5 instanceof abcd.WL;
        this.VH = r4 instanceof abcd.WL;
    }

    public static abcd.WM j6(java.lang.Object r1) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r1 instanceof abcd.WM) == true) { $pc1 = 5; continue $sw1; }
                    if (r1 != null) { $pc1 = 8; continue $sw1; }
                    return null;
                }
                case 8: {
                    return new abcd.WM(abcd.FL.j6(r1));
                }
                case 5: {
                    return (abcd.WM) r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.wL j6(abcd.zL r10, abcd.HL r11, abcd.HL r12, abcd.HL r13) {
        boolean r1 = false;
        java.util.Enumeration r14 = null;
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;
        java.lang.Object r6 = null;
        abcd.LL r7 = null;
        java.util.Enumeration r15 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r1 = false;
                    if (r11 == null) { $pc2 = 19; continue $sw2; }
                    r14 = r11.u7();
                    r3 = false;
                    r4 = false;
                    r5 = false;
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    if (r14.hasMoreElements() == false) { $pc2 = 21; continue $sw2; }
                    r6 = r14.nextElement();
                    if ((r6 instanceof abcd.LL) == false) { $pc2 = 6; continue $sw2; }
                    r7 = abcd.LL.j6(r6);
                    if (r7.tp() == 1) { $pc2 = 12; continue $sw2; }
                    if (r7.tp() == 2) { $pc2 = 15; continue $sw2; }
                    if (r7.tp() != 3) { $pc2 = 6; continue $sw2; }
                    r3 = true;
                    { $pc2 = 6; continue $sw2; }
                }
                case 15: {
                    r5 = true;
                    { $pc2 = 6; continue $sw2; }
                }
                case 12: {
                    r4 = true;
                    $pc2 = 21; continue $sw2;
                }
                case 21: {
                    if (r3 == true) { $pc2 = 23; continue $sw2; }
                    if (r12 == null) { $pc2 = 32; continue $sw2; }
                    r15 = r12.u7();
                    $pc2 = 27; continue $sw2;
                }
                case 27: {
                    if (r15.hasMoreElements() == false) { $pc2 = 32; continue $sw2; }
                    if ((r15.nextElement() instanceof abcd.LL) == false) { $pc2 = 27; continue $sw2; }
                    r1 = true;
                    $pc2 = 32; continue $sw2;
                }
                case 32: {
                    if (r1 == true) { $pc2 = 34; continue $sw2; }
                    if (r5 == true) { $pc2 = 37; continue $sw2; }
                    if (r4 == false) { $pc2 = 42; continue $sw2; }
                    return new abcd.wL(3);
                }
                case 42: {
                    if (j6(r13) == false) { $pc2 = 46; continue $sw2; }
                    return new abcd.wL(3);
                }
                case 46: {
                    if (abcd.TM.j6.equals(r10) == true) { $pc2 = 50; continue $sw2; }
                    return new abcd.wL(3);
                }
                case 50: {
                    return new abcd.wL(1);
                }
                case 37: {
                    return new abcd.wL(4);
                }
                case 34: {
                    return new abcd.wL(5);
                }
                case 23: {
                    return new abcd.wL(5);
                }
                case 19: {
                    r3 = false;
                    r4 = false;
                    r5 = false;
                    { $pc2 = 21; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean j6(abcd.HL r3) {
        java.util.Enumeration r4 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r4 = r3.u7();
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r4.hasMoreElements() == false) { $pc3 = 5; continue $sw3; }
                    if (abcd.YM.j6(r4.nextElement()).Zo().tp().intValue() != 3) { $pc3 = 4; continue $sw3; }
                    return true;
                }
                case 5: {
                    return false;
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
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = new abcd.rL();
                    r0.j6(this.j6);
                    r0.j6(this.DW);
                    r0.j6(this.FH);
                    r1 = this.Hw;
                    if (r1 != null) { $pc4 = 5; continue $sw4; }
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    r2 = this.v5;
                    if (r2 != null) { $pc4 = 11; continue $sw4; }
                    $pc4 = 14; continue $sw4;
                }
                case 14: {
                    r0.j6(this.Zo);
                    return new abcd.UL(r0);
                }
                case 11: {
                    if (this.gn == false) { $pc4 = 13; continue $sw4; }
                    r0.j6(new abcd.YL(false, 1, r2));
                    { $pc4 = 14; continue $sw4; }
                }
                case 13: {
                    r0.j6(new abcd.yM(false, 1, r2));
                    { $pc4 = 14; continue $sw4; }
                }
                case 5: {
                    if (this.VH == false) { $pc4 = 7; continue $sw4; }
                    r0.j6(new abcd.YL(false, 0, r1));
                    { $pc4 = 8; continue $sw4; }
                }
                case 7: {
                    r0.j6(new abcd.yM(false, 0, r1));
                    { $pc4 = 8; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
