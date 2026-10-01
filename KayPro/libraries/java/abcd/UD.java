package abcd;

public class UD {
    private final java.util.List<abcd.VD> j6;

    public static final class a extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.UD.a DW = null;
        public static final abcd.UD.a FH = null;
        private static final abcd.UD.a[] Hw = null;
        public static final abcd.UD.a j6 = null;

        static {
            j6 = new abcd.UD.a("NOT_IGNORED", 0);
            DW = new abcd.UD.a("IGNORED", 1);
            FH = new abcd.UD.a("CHECK_PARENT", 2);
            Hw = new abcd.UD.a[]{j6, DW, FH};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.UD.a valueOf(java.lang.String r1) {
            return (abcd.UD.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.UD.a.values(), r1);
        }

        public static abcd.UD.a[] values() {
            abcd.UD.a[] r0 = Hw;
            int r1 = r0.length;
            abcd.UD.a[] r2 = new abcd.UD.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    public UD() {
        this.j6 = new java.util.ArrayList();
    }

    public UD(java.util.List<abcd.VD> r1) {
        this.j6 = r1;
    }

    private static java.io.BufferedReader DW(java.io.InputStream r3) {
        return new java.io.BufferedReader(new java.io.InputStreamReader(r3, abcd.hE.Zo));
    }

    public abcd.UD.a j6(java.lang.String r4, boolean r5) {
        int r0 = 0;
        abcd.VD r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.j6.isEmpty() == true) { $pc0 = 5; continue $sw0; }
                    r0 = this.j6.size();
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    r0 = r0 - 1;
                    if (r0 <= (-1)) { $pc0 = 10; continue $sw0; }
                    r1 = this.j6.get(r0);
                    if (r1.j6(r4, r5) == false) { $pc0 = 7; continue $sw0; }
                    if (r1.j6() == false) { $pc0 = 18; continue $sw0; }
                    return abcd.UD.a.DW;
                }
                case 18: {
                    return abcd.UD.a.j6;
                }
                case 10: {
                    return abcd.UD.a.FH;
                }
                case 5: {
                    return abcd.UD.a.FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.util.List<abcd.VD> j6() {
        return java.util.Collections.unmodifiableList(this.j6);
    }

    public void j6(java.io.InputStream r4) {
        java.io.BufferedReader r5 = null;
        java.lang.String r0 = null;
        java.lang.String r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r5 = DW(r4);
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    r0 = r5.readLine();
                    if (r0 == null) { $pc1 = 5; continue $sw1; }
                    r1 = r0.trim();
                    if (r1.length() <= 0) { $pc1 = 3; continue $sw1; }
                    if (r1.startsWith("#") == true) { $pc1 = 3; continue $sw1; }
                    this.j6.add(new abcd.VD(r1));
                    { $pc1 = 3; continue $sw1; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
