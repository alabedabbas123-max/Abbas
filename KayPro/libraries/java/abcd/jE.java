package abcd;

public class jE {
    public static final gE.b<abcd.jE> j6 = null;
    private final int DW;
    private final int FH;
    private final boolean Hw;
    private final java.lang.String v5;

    public static final enum a extends java.lang.Enum<abcd.jE.a> {
        public static final abcd.jE.a DW = null;
        public static final abcd.jE.a FH = null;
        private static final abcd.jE.a[] Hw = null;
        public static final abcd.jE.a j6 = null;

        static {
            j6 = new abcd.jE.a("FALSE", 0);
            DW = new abcd.jE.a("TRUE", 1);
            FH = new abcd.jE.a("INPUT", 2);
            Hw = new abcd.jE.a[]{j6, DW, FH};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.jE.a valueOf(java.lang.String r1) {
            return (abcd.jE.a) java.lang.Enum.valueOf(abcd.jE.a.class, r1);
        }

        public static abcd.jE.a[] values() {
            abcd.jE.a[] r0 = Hw;
            int r1 = r0.length;
            abcd.jE.a[] r2 = new abcd.jE.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    static {
        j6 = new abcd.iE();
    }

    private jE(abcd.gE r5) {
        this.DW = r5.j6("core", "compression", -1);
        this.FH = r5.j6("pack", "indexversion", 2);
        this.Hw = r5.j6("core", "logallrefupdates", true);
        this.v5 = r5.j6("core", null, "excludesfile");
    }

    jE(abcd.gE r1, abcd.jE r2) {
        this(r1);
    }

    public java.lang.String DW() {
        return this.v5;
    }

    public int FH() {
        return this.FH;
    }

    public boolean Hw() {
        return this.Hw;
    }

    public int j6() {
        return this.DW;
    }
}
