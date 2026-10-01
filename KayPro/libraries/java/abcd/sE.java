package abcd;

public class sE {
    private final abcd.mG DW;
    private java.util.Set<java.lang.String> EQ;
    private abcd.AbstractjK FH;
    private final abcd._J Hw;
    private abcd.KC J0;
    private abcd.dK J8;
    private java.util.Set<java.lang.String> VH;
    private java.util.Set<java.lang.String> Zo;
    private java.util.Set<java.lang.String> gn;
    private final abcd.UE j6;
    private java.util.Set<java.lang.String> tp;
    private java.util.Set<java.lang.String> u7;
    private java.util.Set<java.lang.String> v5;
    private java.util.Set<java.lang.String> we;

    private static final class a extends abcd.AbstractjK {
        private final abcd.LE FH;
        private int Hw;
        private final int Zo;
        private int v5;

        private a(abcd.LE r2, int r3) {
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        this.Hw = 0;
                        this.FH = r2;
                        this.Zo = r3;
                        this.v5 = r3 / 100;
                        if (this.v5 != 0) { $pc0 = 6; continue $sw0; }
                        this.v5 = 1000;
                        return;
                    }
                    case 6: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        a(abcd.LE r1, int r2, abcd.sE.a r3) {
            this(r1, r2);
        }

        @Override
        public abcd.AbstractjK clone() {
            throw new java.lang.IllegalStateException("Do not clone this kind of filter: " + abcd.sE.a.class.getName());
        }

        @Override
        public boolean j6() {
            return false;
        }

        @Override
        public boolean j6(abcd.YJ r4) {
            int r5 = 0;
            int r1 = 0;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        this.Hw++;
                        r5 = this.Hw;
                        r1 = this.v5;
                        if ((r5 % r1) == 0) { $pc1 = 5; continue $sw1; }
                        $pc1 = 12; continue $sw1;
                    }
                    case 12: {
                        return true;
                    }
                    case 5: {
                        if (r5 > this.Zo) { $pc1 = 8; continue $sw1; }
                        this.FH.update(r1);
                        $pc1 = 8; continue $sw1;
                    }
                    case 8: {
                        if (this.FH.isCancelled() == false) { $pc1 = 12; continue $sw1; }
                        throw abcd.sD.j6;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    public sE(abcd.UE r3, java.lang.String r4, abcd._J r5) {
        abcd.yE r6 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    this.FH = null;
                    this.v5 = new java.util.HashSet();
                    this.Zo = new java.util.HashSet();
                    this.VH = new java.util.HashSet();
                    this.gn = new java.util.HashSet();
                    this.u7 = new java.util.HashSet();
                    this.tp = new java.util.HashSet();
                    this.EQ = new java.util.HashSet();
                    this.j6 = r3;
                    r6 = r3.FH(r4);
                    if (r6 == null) { $pc2 = 5; continue $sw2; }
                    this.DW = new abcd.qG(r3).gn(r6);
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    this.Hw = r5;
                    return;
                }
                case 5: {
                    this.DW = null;
                    { $pc2 = 6; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.Set<java.lang.String> DW() {
        return this.v5;
    }

    public java.util.Set<java.lang.String> FH() {
        return this.Zo;
    }

    public java.util.Set<java.lang.String> Hw() {
        return this.EQ;
    }

    public java.util.Set<java.lang.String> VH() {
        return this.VH;
    }

    public java.util.Set<java.lang.String> Zo() {
        return this.u7;
    }

    public java.util.Set<java.lang.String> gn() {
        return this.tp;
    }

    public boolean j6() {
        return j6(null, 0, 0, "");
    }

    public boolean j6(abcd.LE r5, int r6, int r7, java.lang.String r8) {
        abcd.YJ r0 = null;
        abcd.mG r2 = null;
        java.util.ArrayList r3 = null;
        int r9 = 0;
        abcd.AbstractjK r10 = null;
        abcd.TJ r11 = null;
        abcd.RC r12 = null;
        abcd._J r4 = null;
        abcd.QC r13 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    this.J0 = this.j6.U2();
                    r0 = new abcd.YJ(this.j6);
                    r0.j6(true);
                    r2 = this.DW;
                    if (r2 == null) { $pc3 = 5; continue $sw3; }
                    r0.j6(r2);
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    r0.j6(new abcd.RC(this.J0));
                    r0.j6(this.Hw);
                    r3 = new java.util.ArrayList(4);
                    if (r5 == null) { $pc3 = 11; continue $sw3; }
                    if (r7 != 0) { $pc3 = 10; continue $sw3; }
                    r7 = this.J0.v5();
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    r9 = java.lang.Math.max((r7 * 10) / 9, (r6 * 10) / 9);
                    r5.j6(r8, r9);
                    r3.add(new abcd.sE.a(r5, r9, null));
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    r10 = this.FH;
                    if (r10 == null) { $pc3 = 14; continue $sw3; }
                    r3.add(r10);
                    $pc3 = 14; continue $sw3;
                }
                case 14: {
                    r3.add(new abcd.iK(1));
                    this.J8 = new abcd.dK(1, 2);
                    r3.add(this.J8);
                    r0.j6(abcd.AbstractcK.j6(r3));
                    $pc3 = 16; continue $sw3;
                }
                case 16: {
                    if (r0.EQ() == false) { $pc3 = 17; continue $sw3; }
                    r11 = r0.j6(0, abcd.TJ.class);
                    r12 = (abcd.RC) r0.j6(1, abcd.RC.class);
                    r4 = (abcd._J) r0.j6(2, abcd._J.class);
                    if (r12 == null) { $pc3 = 40; continue $sw3; }
                    r13 = r12.J8();
                    if (r13 == null) { $pc3 = 40; continue $sw3; }
                    if (r13.VH() <= 0) { $pc3 = 40; continue $sw3; }
                    this.EQ.add(r0.Hw());
                    $pc3 = 40; continue $sw3;
                }
                case 40: {
                    if (r11 == null) { $pc3 = 50; continue $sw3; }
                    if (r12 != null) { $pc3 = 43; continue $sw3; }
                    this.VH.add(r0.Hw());
                    if (r4 == null) { $pc3 = 56; continue $sw3; }
                    this.tp.add(r0.Hw());
                    $pc3 = 56; continue $sw3;
                }
                case 56: {
                    if (r12 == null) { $pc3 = 16; continue $sw3; }
                    if (r4 == null) { $pc3 = 58; continue $sw3; }
                    if (r4.j6(r12.J8(), true) == false) { $pc3 = 16; continue $sw3; }
                    this.u7.add(r0.Hw());
                    { $pc3 = 16; continue $sw3; }
                }
                case 58: {
                    this.gn.add(r0.Hw());
                    { $pc3 = 16; continue $sw3; }
                }
                case 43: {
                    if (r11.j6(r12) == true) { $pc3 = 45; continue $sw3; }
                    $pc3 = 46; continue $sw3;
                }
                case 46: {
                    this.Zo.add(r0.Hw());
                    { $pc3 = 56; continue $sw3; }
                }
                case 45: {
                    if (r11.VH() == r12.VH()) { $pc3 = 56; continue $sw3; }
                    $pc3 = 50; continue $sw3;
                }
                case 50: {
                    if (r12 == null) { $pc3 = 52; continue $sw3; }
                    this.v5.add(r0.Hw());
                    { $pc3 = 56; continue $sw3; }
                }
                case 52: {
                    if (r4 == null) { $pc3 = 56; continue $sw3; }
                    if (r4.U2() == true) { $pc3 = 56; continue $sw3; }
                    this.tp.add(r0.Hw());
                    { $pc3 = 56; continue $sw3; }
                }
                case 17: {
                    if (r5 == null) { $pc3 = 19; continue $sw3; }
                    r5.j6();
                    $pc3 = 19; continue $sw3;
                }
                case 19: {
                    this.we = this.J8.DW();
                    if (this.v5.isEmpty() == true) { $pc3 = 22; continue $sw3; }
                    $pc3 = 32; continue $sw3;
                }
                case 32: {
                    return true;
                }
                case 22: {
                    if (this.Zo.isEmpty() == false) { $pc3 = 32; continue $sw3; }
                    if (this.VH.isEmpty() == false) { $pc3 = 32; continue $sw3; }
                    if (this.gn.isEmpty() == false) { $pc3 = 32; continue $sw3; }
                    if (this.u7.isEmpty() == false) { $pc3 = 32; continue $sw3; }
                    if (this.tp.isEmpty() == false) { $pc3 = 32; continue $sw3; }
                    return false;
                }
                case 5: {
                    r0.j6(new abcd.VJ());
                    { $pc3 = 6; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.Set<java.lang.String> v5() {
        return this.gn;
    }
}
