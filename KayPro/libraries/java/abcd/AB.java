package abcd;

public class AB {
    static final abcd.AB DW = null;
    static final abcd.AB FH = null;
    static final abcd.AB Hw = null;
    static final abcd.AB j6 = null;
    private java.util.Map<java.lang.String, abcd.C1498xF.a> VH;
    private final abcd.dG Zo;
    private final abcd.AB.a v5;

    public static abstract class a extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.AB.a DW = null;
        public static final abcd.AB.a FH = null;
        public static final abcd.AB.a Hw = null;
        private static final abcd.AB.a[] VH = null;
        public static final abcd.AB.a Zo = null;
        public static final abcd.AB.a j6 = null;
        public static final abcd.AB.a v5 = null;

        static {
            j6 = new abcd.uB("OK", 0);
            DW = new abcd.vB("ABORTED", 1);
            FH = new abcd.wB("STOPPED", 2);
            Hw = new abcd.xB("FAILED", 3);
            v5 = new abcd.yB("UP_TO_DATE", 4);
            Zo = new abcd.zB("FAST_FORWARD", 5);
            VH = new abcd.AB.a[]{j6, DW, FH, Hw, v5, Zo};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        a(java.lang.String r1, int r2, abcd.AB.a r3) {
            this(r1, r2);
        }

        public static abcd.AB.a valueOf(java.lang.String r1) {
            return (abcd.AB.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.AB.a.values(), r1);
        }

        public static abcd.AB.a[] values() {
            abcd.AB.a[] r0 = VH;
            int r1 = r0.length;
            abcd.AB.a[] r2 = new abcd.AB.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }

        public abstract boolean Hw();
    }

    static {
        j6 = new abcd.AB(abcd.AB.a.j6);
        DW = new abcd.AB(abcd.AB.a.DW);
        FH = new abcd.AB(abcd.AB.a.v5);
        Hw = new abcd.AB(abcd.AB.a.Zo);
    }

    private AB(abcd.AB.a r1) {
        this.v5 = r1;
        this.Zo = null;
    }

    AB(abcd.dG r2) {
        this.v5 = abcd.AB.a.FH;
        this.Zo = r2;
    }

    AB(java.util.Map<java.lang.String, abcd.C1498xF.a> r2) {
        this.v5 = abcd.AB.a.Hw;
        this.Zo = null;
        this.VH = r2;
    }

    public abcd.AB.a j6() {
        return this.v5;
    }
}
