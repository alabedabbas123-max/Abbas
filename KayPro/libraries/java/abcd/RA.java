package abcd;

public class RA {
    public static final abcd.RA DW = null;
    public static final abcd.RA FH = null;
    public static final abcd.RA j6 = null;
    private final abcd.RA.a Hw;
    private final java.util.List<java.lang.String> Zo;
    private final java.util.List<java.lang.String> v5;

    public static final class a extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.RA.a DW = null;
        public static final abcd.RA.a FH = null;
        public static final abcd.RA.a Hw = null;
        private static final abcd.RA.a[] Zo = null;
        public static final abcd.RA.a j6 = null;
        public static final abcd.RA.a v5 = null;

        static {
            j6 = new abcd.RA.a("NOT_TRIED", 0);
            DW = new abcd.RA.a("OK", 1);
            FH = new abcd.RA.a("CONFLICTS", 2);
            Hw = new abcd.RA.a("NONDELETED", 3);
            v5 = new abcd.RA.a("ERROR", 4);
            Zo = new abcd.RA.a[]{j6, DW, FH, Hw, v5};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.RA.a valueOf(java.lang.String r1) {
            return (abcd.RA.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.RA.a.values(), r1);
        }

        public static abcd.RA.a[] values() {
            abcd.RA.a[] r0 = Zo;
            int r1 = r0.length;
            abcd.RA.a[] r2 = new abcd.RA.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    static {
        j6 = new abcd.RA(abcd.RA.a.DW, null);
        DW = new abcd.RA(abcd.RA.a.v5, null);
        FH = new abcd.RA(abcd.RA.a.j6, null);
    }

    RA(abcd.RA.a r3, java.util.List<java.lang.String> r4) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.Hw = r3;
                    if (r3 != abcd.RA.a.FH) { $pc0 = 5; continue $sw0; }
                    this.v5 = r4;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r3 != abcd.RA.a.Hw) { $pc0 = 9; continue $sw0; }
                    this.Zo = r4;
                    return;
                }
                case 9: {
                    this.Zo = new java.util.ArrayList(0);
                    return;
                }
                case 5: {
                    this.v5 = new java.util.ArrayList(0);
                    { $pc0 = 7; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.RA.a j6() {
        return this.Hw;
    }
}
