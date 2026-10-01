package abcd;

public class gC {
    public static final gE.b<abcd.gC> j6 = null;
    private final boolean DW;
    private final abcd.gC.a FH;
    private final int Hw;

    public static final class a extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.gC.a DW = null;
        public static final abcd.gC.a FH = null;
        private static final abcd.gC.a[] Hw = null;
        public static final abcd.gC.a j6 = null;

        static {
            j6 = new abcd.gC.a("FALSE", 0);
            DW = new abcd.gC.a("TRUE", 1);
            FH = new abcd.gC.a("COPY", 2);
            Hw = new abcd.gC.a[]{j6, DW, FH};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.gC.a valueOf(java.lang.String r1) {
            return (abcd.gC.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.gC.a.values(), r1);
        }

        public static abcd.gC.a[] values() {
            abcd.gC.a[] r0 = Hw;
            int r1 = r0.length;
            abcd.gC.a[] r2 = new abcd.gC.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    static {
        j6 = new abcd.fC();
    }

    private gC(abcd.gE r4) {
        this.DW = r4.j6("diff", "noprefix", false);
        this.FH = j6(r4.j6("diff", null, "renames"));
        this.Hw = r4.j6("diff", "renamelimit", 200);
    }

    gC(abcd.gE r1, abcd.gC r2) {
        this(r1);
    }

    private static abcd.gC.a j6(java.lang.String r5) {
        java.lang.Boolean r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r5 != null) { $pc0 = 6; continue $sw0; }
                    return abcd.gC.a.j6;
                }
                case 6: {
                    if (abcd.NK.j6("copy", r5) == true) { $pc0 = 21; continue $sw0; }
                    if (abcd.NK.j6("copies", r5) == true) { $pc0 = 21; continue $sw0; }
                    r0 = abcd.NK.FH(r5);
                    if (r0 == null) { $pc0 = 19; continue $sw0; }
                    if (r0.booleanValue() == false) { $pc0 = 17; continue $sw0; }
                    return abcd.gC.a.DW;
                }
                case 17: {
                    return abcd.gC.a.j6;
                }
                case 19: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().enumValueNotSupported2, new java.lang.Object[]{"diff", "renames", r5}));
                }
                case 21: {
                    return abcd.gC.a.FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean DW() {
        return this.DW;
    }

    public boolean FH() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.FH == abcd.gC.a.j6) { $pc1 = 6; continue $sw1; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6() {
        return this.Hw;
    }
}
