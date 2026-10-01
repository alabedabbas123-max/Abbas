package abcd;

public class OI {
    private final abcd.yE DW;
    private final java.lang.String FH;
    private abcd.OI.b Hw;
    private java.lang.String VH;
    private abcd.OI.a Zo;
    private final abcd.yE j6;
    private abcd.ME v5;

    public static final class a extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.OI.a DW = null;
        public static final abcd.OI.a FH = null;
        public static final abcd.OI.a Hw = null;
        public static final abcd.OI.a VH = null;
        public static final abcd.OI.a Zo = null;
        public static final abcd.OI.a gn = null;
        public static final abcd.OI.a j6 = null;
        private static final abcd.OI.a[] tp = null;
        public static final abcd.OI.a u7 = null;
        public static final abcd.OI.a v5 = null;

        static {
            j6 = new abcd.OI.a("NOT_ATTEMPTED", 0);
            DW = new abcd.OI.a("REJECTED_NOCREATE", 1);
            FH = new abcd.OI.a("REJECTED_NODELETE", 2);
            Hw = new abcd.OI.a("REJECTED_NONFASTFORWARD", 3);
            v5 = new abcd.OI.a("REJECTED_CURRENT_BRANCH", 4);
            Zo = new abcd.OI.a("REJECTED_MISSING_OBJECT", 5);
            VH = new abcd.OI.a("REJECTED_OTHER_REASON", 6);
            gn = new abcd.OI.a("LOCK_FAILURE", 7);
            u7 = new abcd.OI.a("OK", 8);
            tp = new abcd.OI.a[]{j6, DW, FH, Hw, v5, Zo, VH, gn, u7};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.OI.a valueOf(java.lang.String r1) {
            return (abcd.OI.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.OI.a.values(), r1);
        }

        public static abcd.OI.a[] values() {
            abcd.OI.a[] r0 = tp;
            int r1 = r0.length;
            abcd.OI.a[] r2 = new abcd.OI.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    public static final class b extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.OI.b DW = null;
        public static final abcd.OI.b FH = null;
        public static final abcd.OI.b Hw = null;
        public static final abcd.OI.b j6 = null;
        private static final abcd.OI.b[] v5 = null;

        static {
            j6 = new abcd.OI.b("CREATE", 0);
            DW = new abcd.OI.b("UPDATE", 1);
            FH = new abcd.OI.b("UPDATE_NONFASTFORWARD", 2);
            Hw = new abcd.OI.b("DELETE", 3);
            v5 = new abcd.OI.b[]{j6, DW, FH, Hw};
        }

        private b(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.OI.b valueOf(java.lang.String r1) {
            return (abcd.OI.b) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.OI.b.values(), r1);
        }

        public static abcd.OI.b[] values() {
            abcd.OI.b[] r0 = v5;
            int r1 = r0.length;
            abcd.OI.b[] r2 = new abcd.OI.b[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    public OI(abcd.yE r1, abcd.yE r2, java.lang.String r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.j6 = r1;
                    this.DW = r2;
                    this.FH = r3;
                    this.Hw = abcd.OI.b.DW;
                    if (abcd.yE.Ws().DW(r1) == false) { $pc0 = 6; continue $sw0; }
                    this.Hw = abcd.OI.b.j6;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (abcd.yE.Ws().DW(r2) == false) { $pc0 = 8; continue $sw0; }
                    this.Hw = abcd.OI.b.Hw;
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    this.Zo = abcd.OI.a.j6;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.yE DW() {
        return this.DW;
    }

    public abcd.yE FH() {
        return this.j6;
    }

    public abcd.ME Hw() {
        return this.v5;
    }

    public abcd.OI.b VH() {
        return this.Hw;
    }

    public abcd.OI.a Zo() {
        return this.Zo;
    }

    public java.lang.String j6() {
        return this.VH;
    }

    void j6(abcd.ME r1) {
        this.v5 = r1;
    }

    public void j6(abcd.OI.a r2) {
        j6(r2, null);
    }

    public void j6(abcd.OI.a r1, java.lang.String r2) {
        this.Zo = r1;
        this.VH = r2;
    }

    void j6(abcd.OI.b r1) {
        this.Hw = r1;
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(VH().name()) + ": " + FH().we() + " " + DW().we() + " " + v5();
    }

    public java.lang.String v5() {
        return this.FH;
    }
}
