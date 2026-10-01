package abcd;

public class UD {
    private final java.util.List<abcd.VD> j6;

    public static final enum a extends java.lang.Enum<abcd.UD.a> {
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
            return (abcd.UD.a) java.lang.Enum.valueOf(abcd.UD.a.class, r1);
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
        if (this.j6.isEmpty() == true) goto L5;
        int r0 = this.j6.size();
    L7:
        r0 = r0 - 1;
        if (r0 <= (-1)) goto L10;
        abcd.VD r1 = this.j6.get(r0);
        if (r1.j6(r4, r5) == false) goto L7;
        if (r1.j6() == false) goto L18;
        return abcd.UD.a.DW;
    L18:
        return abcd.UD.a.j6;
    L10:
        return abcd.UD.a.FH;
    L5:
        return abcd.UD.a.FH;
    }

    public java.util.List<abcd.VD> j6() {
        return java.util.Collections.unmodifiableList(this.j6);
    }

    public void j6(java.io.InputStream r4) {
        java.io.BufferedReader r5 = DW(r4);
    L3:
        java.lang.String r0 = r5.readLine();
        if (r0 == null) goto L5;
        java.lang.String r1 = r0.trim();
        if (r1.length() <= 0) goto L3;
        if (r1.startsWith("#") == true) goto L3;
        this.j6.add(new abcd.VD(r1));
        goto L3
    }
}
