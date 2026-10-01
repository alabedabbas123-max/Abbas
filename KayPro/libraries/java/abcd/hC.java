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

    public static final class a extends com.almlkaide.kaypro.internal.EnumBase {
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
            return (abcd.hC.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.hC.a.values(), r1);
        }

        public static abcd.hC.a[] values() {
            abcd.hC.a[] r0 = Zo;
            int r1 = r0.length;
            abcd.hC.a[] r2 = new abcd.hC.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    public static final class b extends com.almlkaide.kaypro.internal.EnumBase {
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
            return (abcd.hC.b) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.hC.b.values(), r1);
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
        java.util.ArrayList r0 = null;
        abcd.uE r1 = null;
        abcd.hC r2 = null;
        java.lang.String r3 = null;
        abcd.AbstractrE r4 = null;
        abcd.AbstractrE r5 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r6.Zo() != 2) { $pc0 = 34; continue $sw0; }
                    if (r7 == true) { $pc0 = 6; continue $sw0; }
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    r0 = new java.util.ArrayList();
                    r1 = new abcd.uE();
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    if (r6.EQ() == false) { $pc0 = 13; continue $sw0; }
                    r2 = new abcd.hC();
                    r6.j6(r1, 0);
                    r2.u7 = abcd.WD.j6(r1);
                    r6.j6(r1, 1);
                    r2.tp = abcd.WD.j6(r1);
                    r2.v5 = r6.j6(0);
                    r2.Zo = r6.j6(1);
                    r3 = r6.Hw();
                    r2.FH = r3;
                    r2.Hw = r3;
                    r4 = r2.v5;
                    r5 = abcd.AbstractrE.Zo;
                    if (r4 != r5) { $pc0 = 18; continue $sw0; }
                    r2.FH = "/dev/null";
                    r2.VH = abcd.hC.a.j6;
                    r0.add(r2);
                    $pc0 = 29; continue $sw0;
                }
                case 29: {
                    if (r7 == false) { $pc0 = 12; continue $sw0; }
                    if (r6.u7() == false) { $pc0 = 12; continue $sw0; }
                    r6.j6();
                    { $pc0 = 12; continue $sw0; }
                }
                case 18: {
                    if (r2.Zo != r5) { $pc0 = 21; continue $sw0; }
                    r2.Hw = "/dev/null";
                    r2.VH = abcd.hC.a.FH;
                    r0.add(r2);
                    { $pc0 = 29; continue $sw0; }
                }
                case 21: {
                    if (r2.u7.equals(r2.tp) == true) { $pc0 = 27; continue $sw0; }
                    r2.VH = abcd.hC.a.DW;
                    if (abcd.BC.j6(r2.v5, r2.Zo) == false) { $pc0 = 25; continue $sw0; }
                    r0.add(r2);
                    { $pc0 = 29; continue $sw0; }
                }
                case 25: {
                    r0.addAll(j6(r2));
                    { $pc0 = 29; continue $sw0; }
                }
                case 27: {
                    if (r2.v5 == r2.Zo) { $pc0 = 29; continue $sw0; }
                    r2.VH = abcd.hC.a.DW;
                    r0.add(r2);
                    { $pc0 = 29; continue $sw0; }
                }
                case 13: {
                    return r0;
                }
                case 6: {
                    if (r6.gn() == false) { $pc0 = 10; continue $sw0; }
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().cannotBeRecursiveWhenTreesAreIncluded);
                }
                case 34: {
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().treeWalkMustHaveExactlyTwoTrees);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        int[] r0 = null;
        int[] r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = DW;
                    if (r0 == null) { $pc1 = 5; continue $sw1; }
                    return r0;
                }
                case 5: {
                    r1 = new int[abcd.hC.a.values().length];
                    try {
                        r1[abcd.hC.a.j6.ordinal()] = 1;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc1 = 13; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 18; continue $sw1;
                }
                case 18: {
                    try {
                        r1[abcd.hC.a.v5.ordinal()] = 5;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc1 = 14; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 24; continue $sw1;
                }
                case 24: {
                    try {
                        r1[abcd.hC.a.FH.ordinal()] = 3;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc1 = 15; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 26; continue $sw1;
                }
                case 26: {
                    try {
                        r1[abcd.hC.a.DW.ordinal()] = 2;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc1 = 16; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 20; continue $sw1;
                }
                case 20: {
                    try {
                        r1[abcd.hC.a.Hw.ordinal()] = 4;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc1 = 17; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    DW = r1;
                    return r1;
                }
                case 13: {
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    $pc1 = 17; continue $sw1;
                }
                case 17: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.hC.a DW() {
        return this.VH;
    }

    public abcd.AbstractrE DW(abcd.hC.b r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2 != abcd.hC.b.j6) { $pc2 = 6; continue $sw2; }
                    return VH();
                }
                case 6: {
                    return Hw();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.WD FH() {
        return this.tp;
    }

    public java.lang.String FH(abcd.hC.b r2) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r2 != abcd.hC.b.j6) { $pc3 = 6; continue $sw3; }
                    return gn();
                }
                case 6: {
                    return v5();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r2 != abcd.hC.b.j6) { $pc4 = 6; continue $sw4; }
                    return Zo();
                }
                case 6: {
                    return FH();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r0.append("DiffEntry[");
                    r0.append(this.VH);
                    r0.append(" ");
                    r1 = j6()[this.VH.ordinal()];
                    if (r1 != 1) { $pc5 = 5; continue $sw5; }
                    r0.append(this.Hw);
                    $pc5 = 18; continue $sw5;
                }
                case 18: {
                    r0.append("]");
                    return r0.toString();
                }
                case 5: {
                    if (r1 != 2) { $pc5 = 7; continue $sw5; }
                    r0.append(this.FH);
                    { $pc5 = 18; continue $sw5; }
                }
                case 7: {
                    if (r1 != 3) { $pc5 = 9; continue $sw5; }
                    r0.append(this.FH);
                    { $pc5 = 18; continue $sw5; }
                }
                case 9: {
                    if (r1 != 4) { $pc5 = 11; continue $sw5; }
                    r0.append(java.lang.String.valueOf(this.FH) + "->" + this.Hw);
                    { $pc5 = 18; continue $sw5; }
                }
                case 11: {
                    if (r1 != 5) { $pc5 = 18; continue $sw5; }
                    r0.append(java.lang.String.valueOf(this.FH) + "->" + this.Hw);
                    { $pc5 = 18; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int u7() {
        return this.gn;
    }

    public java.lang.String v5() {
        return this.Hw;
    }
}
