package abcd;

public class hC {
    private static int[] DW;
    static final abcd.WD j6 = null;
    protected java.lang.String FH;
    protected java.lang.String Hw;
    protected abcd.hC.a VH;
    protected abcd.AbstractrE Zo;
    protected int gn;
    protected abcd.WD tp;
    protected abcd.WD u7;
    protected abcd.AbstractrE v5;

    public static final enum a extends java.lang.Enum<abcd.hC.a> {
        public static final abcd.hC.a DW = null;
        public static final abcd.hC.a FH = null;
        public static final abcd.hC.a Hw = null;
        private static final abcd.hC.a[] Zo = null;
        public static final abcd.hC.a j6 = null;
        public static final abcd.hC.a v5 = null;

        static {
            j6 = new abcd.hC.a("ADD", 0);
            DW = new abcd.hC.a("MODIFY", 1);
            FH = new abcd.hC.a("DELETE", 2);
            Hw = new abcd.hC.a("RENAME", 3);
            v5 = new abcd.hC.a("COPY", 4);
            Zo = new abcd.hC.a[]{j6, DW, FH, Hw, v5};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.hC.a valueOf(java.lang.String r1) {
            return (abcd.hC.a) java.lang.Enum.valueOf(abcd.hC.a.class, r1);
        }

        public static abcd.hC.a[] values() {
            abcd.hC.a[] r0 = Zo;
            int r1 = r0.length;
            abcd.hC.a[] r2 = new abcd.hC.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    public static final enum b extends java.lang.Enum<abcd.hC.b> {
        public static final abcd.hC.b DW = null;
        private static final abcd.hC.b[] FH = null;
        public static final abcd.hC.b j6 = null;

        static {
            j6 = new abcd.hC.b("OLD", 0);
            DW = new abcd.hC.b("NEW", 1);
            FH = new abcd.hC.b[]{j6, DW};
        }

        private b(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.hC.b valueOf(java.lang.String r1) {
            return (abcd.hC.b) java.lang.Enum.valueOf(abcd.hC.b.class, r1);
        }

        public static abcd.hC.b[] values() {
            abcd.hC.b[] r0 = FH;
            int r1 = r0.length;
            abcd.hC.b[] r2 = new abcd.hC.b[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    static {
        j6 = abcd.WD.j6(abcd.yE.Ws());
    }

    protected hC() {
    }

    static abcd.hC j6(abcd.hC.a r2, abcd.hC r3, abcd.hC r4, int r5) {
        abcd.hC r0 = new abcd.hC();
        r0.u7 = r3.u7;
        r0.v5 = r3.v5;
        r0.FH = r3.FH;
        r0.tp = r4.tp;
        r0.Zo = r4.Zo;
        r0.Hw = r4.Hw;
        r0.VH = r2;
        r0.gn = r5;
        return r0;
    }

    public static java.util.List<abcd.hC> j6(abcd.YJ r1) {
        return j6(r1, false);
    }

    public static java.util.List<abcd.hC> j6(abcd.YJ r6, boolean r7) {
        if (r6.Zo() != 2) goto L34;
        if (r7 == true) goto L6;
    L10:
        java.util.ArrayList r0 = new java.util.ArrayList();
        abcd.uE r1 = new abcd.uE();
    L12:
        if (r6.EQ() == false) goto L13;
        abcd.hC r2 = new abcd.hC();
        r6.j6(r1, 0);
        r2.u7 = abcd.WD.j6(r1);
        r6.j6(r1, 1);
        r2.tp = abcd.WD.j6(r1);
        r2.v5 = r6.j6(0);
        r2.Zo = r6.j6(1);
        java.lang.String r3 = r6.Hw();
        r2.FH = r3;
        r2.Hw = r3;
        abcd.AbstractrE r4 = r2.v5;
        abcd.AbstractrE r5 = abcd.AbstractrE.Zo;
        if (r4 != r5) goto L18;
        r2.FH = "/dev/null";
        r2.VH = abcd.hC.a.j6;
        r0.add(r2);
    L29:
        if (r7 == false) goto L12;
        if (r6.u7() == false) goto L12;
        r6.j6();
        goto L12
    L18:
        if (r2.Zo != r5) goto L21;
        r2.Hw = "/dev/null";
        r2.VH = abcd.hC.a.FH;
        r0.add(r2);
        goto L29
    L21:
        if (r2.u7.equals(r2.tp) == true) goto L27;
        r2.VH = abcd.hC.a.DW;
        if (abcd.BC.j6(r2.v5, r2.Zo) == false) goto L25;
        r0.add(r2);
        goto L29
    L25:
        r0.addAll(j6(r2));
        goto L29
    L27:
        if (r2.v5 == r2.Zo) goto L29;
        r2.VH = abcd.hC.a.DW;
        r0.add(r2);
        goto L29
    L13:
        return r0;
    L6:
        if (r6.gn() == false) goto L10;
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().cannotBeRecursiveWhenTreesAreIncluded);
    L34:
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().treeWalkMustHaveExactlyTwoTrees);
    }

    static java.util.List<abcd.hC> j6(abcd.hC r4) {
        abcd.hC r0 = new abcd.hC();
        r0.u7 = r4.Zo();
        r0.v5 = r4.VH();
        r0.FH = r4.gn();
        r0.tp = j6;
        r0.Zo = abcd.AbstractrE.Zo;
        r0.Hw = "/dev/null";
        r0.VH = abcd.hC.a.FH;
        abcd.hC r2 = new abcd.hC();
        r2.u7 = j6;
        r2.v5 = abcd.AbstractrE.Zo;
        r2.FH = "/dev/null";
        r2.tp = r4.FH();
        r2.Zo = r4.Hw();
        r2.Hw = r4.v5();
        r2.VH = abcd.hC.a.j6;
        return java.util.Arrays.asList(new abcd.hC[]{r0, r2});
    }

    static int[] j6() {
        int[] r0 = DW;
        if (r0 == null) goto L5;
        return r0;
    L5:
        int[] r1 = new int[abcd.hC.a.values().length];
        r1[abcd.hC.a.j6.ordinal()] = 1;     // Catch: java.lang.NoSuchFieldError -> L13
    L18:
        r1[abcd.hC.a.v5.ordinal()] = 5;     // Catch: java.lang.NoSuchFieldError -> L14
    L24:
        r1[abcd.hC.a.FH.ordinal()] = 3;     // Catch: java.lang.NoSuchFieldError -> L15
    L26:
        r1[abcd.hC.a.DW.ordinal()] = 2;     // Catch: java.lang.NoSuchFieldError -> L16
    L20:
        r1[abcd.hC.a.Hw.ordinal()] = 4;     // Catch: java.lang.NoSuchFieldError -> L17
    L11:
        DW = r1;
        return r1;
    }

    public abcd.hC.a DW() {
        return this.VH;
    }

    public abcd.AbstractrE DW(abcd.hC.b r2) {
        if (r2 != abcd.hC.b.j6) goto L6;
        return VH();
    L6:
        return Hw();
    }

    public abcd.WD FH() {
        return this.tp;
    }

    public java.lang.String FH(abcd.hC.b r2) {
        if (r2 != abcd.hC.b.j6) goto L6;
        return gn();
    L6:
        return v5();
    }

    public abcd.AbstractrE Hw() {
        return this.Zo;
    }

    public abcd.AbstractrE VH() {
        return this.v5;
    }

    public abcd.WD Zo() {
        return this.u7;
    }

    public java.lang.String gn() {
        return this.FH;
    }

    public abcd.WD j6(abcd.hC.b r2) {
        if (r2 != abcd.hC.b.j6) goto L6;
        return Zo();
    L6:
        return FH();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        r0.append("DiffEntry[");
        r0.append(this.VH);
        r0.append(" ");
        int r1 = j6()[this.VH.ordinal()];
        if (r1 != 1) goto L5;
        r0.append(this.Hw);
    L18:
        r0.append("]");
        return r0.toString();
    L5:
        if (r1 != 2) goto L7;
        r0.append(this.FH);
        goto L18
    L7:
        if (r1 != 3) goto L9;
        r0.append(this.FH);
        goto L18
    L9:
        if (r1 != 4) goto L11;
        r0.append(java.lang.String.valueOf(this.FH) + "->" + this.Hw);
        goto L18
    L11:
        if (r1 != 5) goto L18;
        r0.append(java.lang.String.valueOf(this.FH) + "->" + this.Hw);
        goto L18
    }

    public int u7() {
        return this.gn;
    }

    public java.lang.String v5() {
        return this.Hw;
    }
}
