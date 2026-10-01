package abcd;

public class WA {
    public static final abcd.WA j6 = null;
    private final abcd.WA.a DW;
    private final abcd.dG FH;
    private final java.util.List<abcd.ME> Hw;
    private final java.util.Map<java.lang.String, abcd.C1498xF.a> v5;

    public static class a extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.WA.a DW = null;
        public static final abcd.WA.a FH = null;
        private static final abcd.WA.a[] Hw = null;
        public static final abcd.WA.a j6 = null;

        static {
            j6 = new abcd.TA("OK", 0);
            DW = new abcd.UA("FAILED", 1);
            FH = new abcd.VA("CONFLICTING", 2);
            Hw = new abcd.WA.a[]{j6, DW, FH};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        a(java.lang.String r1, int r2, abcd.WA.a r3) {
            this(r1, r2);
        }

        public static abcd.WA.a valueOf(java.lang.String r1) {
            return (abcd.WA.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.WA.a.values(), r1);
        }

        public static abcd.WA.a[] values() {
            abcd.WA.a[] r0 = Hw;
            int r1 = r0.length;
            abcd.WA.a[] r2 = new abcd.WA.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    static {
        j6 = new abcd.WA(abcd.WA.a.FH);
    }

    private WA(abcd.WA.a r1) {
        this.DW = r1;
        this.FH = null;
        this.Hw = null;
        this.v5 = null;
    }

    public WA(abcd.dG r2, java.util.List<abcd.ME> r3) {
        this.DW = abcd.WA.a.j6;
        this.FH = r2;
        this.Hw = r3;
        this.v5 = null;
    }

    public WA(java.util.Map<java.lang.String, abcd.C1498xF.a> r2) {
        this.DW = abcd.WA.a.DW;
        this.FH = null;
        this.Hw = null;
        this.v5 = r2;
    }

    public abcd.dG DW() {
        return this.FH;
    }

    public abcd.WA.a FH() {
        return this.DW;
    }

    public java.util.Map<java.lang.String, abcd.C1498xF.a> j6() {
        return this.v5;
    }
}
