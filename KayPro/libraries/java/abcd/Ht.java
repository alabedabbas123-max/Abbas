package abcd;

public class Ht {
    private final java.util.BitSet DW;
    private final int FH;
    private final abcd.yt Hw;
    private int VH;
    private abcd.tt Zo;
    private abcd.Ht.a gn;
    private final java.util.BitSet j6;
    private final abcd.Ft v5;

    private static final class a extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.Ht.a DW = null;
        public static final abcd.Ht.a FH = null;
        public static final abcd.Ht.a Hw = null;
        public static final abcd.Ht.a j6 = null;
        private static final abcd.Ht.a[] v5 = null;

        static {
            j6 = new abcd.Ht.a("LIVE_IN_AT_STATEMENT", 0);
            DW = new abcd.Ht.a("LIVE_OUT_AT_STATEMENT", 1);
            FH = new abcd.Ht.a("LIVE_OUT_AT_BLOCK", 2);
            Hw = new abcd.Ht.a("DONE", 3);
            v5 = new abcd.Ht.a[]{j6, DW, FH, Hw};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.Ht.a valueOf(java.lang.String r1) {
            return (abcd.Ht.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.Ht.a.values(), r1);
        }

        public static abcd.Ht.a[] values() {
            return (abcd.Ht.a[]) v5.clone();
        }
    }

    private Ht(abcd.yt r2, int r3, abcd.Ft r4) {
        int r0 = r2.DW().size();
        this.Hw = r2;
        this.FH = r3;
        this.j6 = new java.util.BitSet(r0);
        this.DW = new java.util.BitSet(r0);
        this.v5 = r4;
    }

    private void DW() {
        abcd.Ht.a r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 2;
        $sw0: while (true) {
            switch ($pc0) {
                case 2: {
                    r0 = this.gn;
                    if (r0 == abcd.Ht.a.Hw) { $pc0 = 14; continue $sw0; }
                    r1 = abcd.Gt.j6[r0.ordinal()];
                    if (r1 != 1) { $pc0 = 7; continue $sw0; }
                    this.gn = abcd.Ht.a.Hw;
                    FH();
                    { $pc0 = 2; continue $sw0; }
                }
                case 7: {
                    if (r1 != 2) { $pc0 = 9; continue $sw0; }
                    this.gn = abcd.Ht.a.Hw;
                    v5();
                    { $pc0 = 2; continue $sw0; }
                }
                case 9: {
                    if (r1 != 3) { $pc0 = 2; continue $sw0; }
                    this.gn = abcd.Ht.a.Hw;
                    Hw();
                    { $pc0 = 2; continue $sw0; }
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void FH() {
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.VH;
                    if (r0 != 0) { $pc1 = 5; continue $sw1; }
                    this.Zo.j6(this.FH);
                    this.DW.or(this.Zo.VH());
                    return;
                }
                case 5: {
                    this.VH = r0 - 1;
                    this.gn = abcd.Ht.a.DW;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Hw() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.j6.get(this.Zo.DW()) == true) { $pc2 = 6; continue $sw2; }
                    this.j6.set(this.Zo.DW());
                    this.Zo.DW(this.FH);
                    this.VH = this.Zo.FH().size() - 1;
                    this.gn = abcd.Ht.a.DW;
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.Ft j6(abcd.yt r4) {
        int r0 = 0;
        abcd.Ft r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = r4.u7();
                    r1 = new abcd.Ft(r0);
                    r2 = 0;
                    $pc3 = 3; continue $sw3;
                }
                case 3: {
                    if (r2 >= r0) { $pc3 = 5; continue $sw3; }
                    new abcd.Ht(r4, r2, r1).j6();
                    r2 = r2 + 1;
                    { $pc3 = 3; continue $sw3; }
                }
                case 5: {
                    j6(r4, r1);
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(abcd.yt r7, abcd.Ft r8) {
        java.util.Iterator<abcd.tt> r9 = null;
        java.util.List<abcd.Abstractvt> r0 = null;
        int r1 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r9 = r7.DW().iterator();
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r9.hasNext() == false) { $pc4 = 14; continue $sw4; }
                    r0 = r9.next().Zo();
                    r1 = r0.size();
                    r3 = 0;
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if (r3 >= r1) { $pc4 = 4; continue $sw4; }
                    r4 = 0;
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    if (r4 >= r1) { $pc4 = 13; continue $sw4; }
                    if (r3 == r4) { $pc4 = 12; continue $sw4; }
                    r8.j6(r0.get(r3).u7().we(), r0.get(r4).u7().we());
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    r4 = r4 + 1;
                    { $pc4 = 8; continue $sw4; }
                }
                case 13: {
                    r3 = r3 + 1;
                    { $pc4 = 6; continue $sw4; }
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void v5() {
        abcd.Abstractvt r0 = null;
        abcd.bs r1 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.Zo.FH().get(this.VH);
                    r1 = r0.u7();
                    if (r0.DW(this.FH) == true) { $pc5 = 8; continue $sw5; }
                    if (r1 == null) { $pc5 = 6; continue $sw5; }
                    this.v5.j6(this.FH, r1.we());
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    this.gn = abcd.Ht.a.j6;
                    return;
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        java.util.Iterator<abcd.Abstractvt> r0 = null;
        abcd.Abstractvt r1 = null;
        java.util.Iterator<abcd.tt> r2 = null;
        int r3 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = this.Hw.Hw(this.FH).iterator();
                    $pc6 = 4; continue $sw6;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc6 = 16; continue $sw6; }
                    r1 = r0.next();
                    this.gn = abcd.Ht.a.Hw;
                    if ((r1 instanceof abcd.ot) == true) { $pc6 = 7; continue $sw6; }
                    this.Zo = r1.DW();
                    this.VH = this.Zo.FH().indexOf(r1);
                    if (this.VH < 0) { $pc6 = 15; continue $sw6; }
                    this.gn = abcd.Ht.a.j6;
                    DW();
                    { $pc6 = 4; continue $sw6; }
                }
                case 15: {
                    throw new java.lang.RuntimeException("insn not found in it's own block");
                }
                case 7: {
                    r2 = ((abcd.ot) r1).j6(this.FH, this.Hw).iterator();
                    $pc6 = 9; continue $sw6;
                }
                case 9: {
                    if (r2.hasNext() == false) { $pc6 = 4; continue $sw6; }
                    this.Zo = r2.next();
                    this.gn = abcd.Ht.a.FH;
                    DW();
                    $pc6 = 16; continue $sw6;
                }
                case 16: {
                    r3 = this.DW.nextSetBit(0);
                    if (r3 < 0) { $pc6 = 19; continue $sw6; }
                    this.Zo = this.Hw.DW().get(r3);
                    this.DW.clear(r3);
                    this.gn = abcd.Ht.a.FH;
                    DW();
                    { $pc6 = 16; continue $sw6; }
                }
                case 19: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
