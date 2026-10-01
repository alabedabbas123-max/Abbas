package abcd;

public class gC {
    public static final gE.b<abcd.gC> j6 = null;
    private final boolean DW;
    private final abcd.gC.a FH;
    private final int Hw;

    public static final enum a extends java.lang.Enum<abcd.gC.a> {
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
            return (abcd.gC.a) java.lang.Enum.valueOf(abcd.gC.a.class, r1);
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
        if (r5 != null) goto L6;
        return abcd.gC.a.j6;
    L6:
        if (abcd.NK.j6("copy", r5) == true) goto L21;
        if (abcd.NK.j6("copies", r5) == true) goto L21;
        java.lang.Boolean r0 = abcd.NK.FH(r5);
        if (r0 == null) goto L19;
        if (r0.booleanValue() == false) goto L17;
        return abcd.gC.a.DW;
    L17:
        return abcd.gC.a.j6;
    L19:
        throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().enumValueNotSupported2, new java.lang.Object[]{"diff", "renames", r5}));
    L21:
        return abcd.gC.a.FH;
    }

    public boolean DW() {
        return this.DW;
    }

    public boolean FH() {
        if (this.FH == abcd.gC.a.j6) goto L6;
        return true;
    L6:
        return false;
    }

    public int j6() {
        return this.Hw;
    }
}
