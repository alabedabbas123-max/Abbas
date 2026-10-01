package abcd;

public class qF {
    private final int DW;
    private final int FH;
    private final abcd.qF.a Hw;
    private final int j6;

    public static final enum a extends java.lang.Enum<abcd.qF.a> {
        public static final abcd.qF.a DW = null;
        public static final abcd.qF.a FH = null;
        private static final abcd.qF.a[] Hw = null;
        public static final abcd.qF.a j6 = null;

        static {
            j6 = new abcd.qF.a("NO_CONFLICT", 0);
            DW = new abcd.qF.a("FIRST_CONFLICTING_RANGE", 1);
            FH = new abcd.qF.a("NEXT_CONFLICTING_RANGE", 2);
            Hw = new abcd.qF.a[]{j6, DW, FH};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.qF.a valueOf(java.lang.String r1) {
            return (abcd.qF.a) java.lang.Enum.valueOf(abcd.qF.a.class, r1);
        }

        public static abcd.qF.a[] values() {
            abcd.qF.a[] r0 = Hw;
            int r1 = r0.length;
            abcd.qF.a[] r2 = new abcd.qF.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    protected qF(int r1, int r2, int r3, abcd.qF.a r4) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
    }

    public abcd.qF.a DW() {
        return this.Hw;
    }

    public int FH() {
        return this.FH;
    }

    public int Hw() {
        return this.j6;
    }

    public int j6() {
        return this.DW;
    }
}
