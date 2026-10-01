package abcd;

public class pB {
    private abcd.yE DW;
    private abcd.yE FH;
    private java.util.Map<java.lang.String, int[][]> Hw;
    private abcd.AbstractvF VH;
    private java.lang.String Zo;
    private java.util.Map<java.lang.String, abcd.C1498xF.a> gn;
    private abcd.yE[] j6;
    private abcd.pB.a v5;

    public static abstract class a extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.pB.a DW = null;
        public static final abcd.pB.a FH = null;
        public static final abcd.pB.a Hw = null;
        private static final abcd.pB.a[] VH = null;
        public static final abcd.pB.a Zo = null;
        public static final abcd.pB.a j6 = null;
        public static final abcd.pB.a v5 = null;

        static {
            j6 = new abcd.jB("FAST_FORWARD", 0);
            DW = new abcd.kB("ALREADY_UP_TO_DATE", 1);
            FH = new abcd.lB("FAILED", 2);
            Hw = new abcd.mB("MERGED", 3);
            v5 = new abcd.nB("CONFLICTING", 4);
            Zo = new abcd.oB("NOT_SUPPORTED", 5);
            VH = new abcd.pB.a[]{j6, DW, FH, Hw, v5, Zo};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        a(java.lang.String r1, int r2, abcd.pB.a r3) {
            this(r1, r2);
        }

        public static abcd.pB.a valueOf(java.lang.String r1) {
            return (abcd.pB.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.pB.a.values(), r1);
        }

        public static abcd.pB.a[] values() {
            abcd.pB.a[] r0 = VH;
            int r1 = r0.length;
            abcd.pB.a[] r2 = new abcd.pB.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }

        public abstract boolean Hw();
    }

    public pB(abcd.yE r10, abcd.yE r11, abcd.yE[] r12, abcd.pB.a r13, abcd.AbstractvF r14, java.util.Map<java.lang.String, uF<?>> r15, java.lang.String r16) {
        this(r10, r11, r12, r13, r14, r15, null, null);
    }

    public pB(abcd.yE r1, abcd.yE r2, abcd.yE[] r3, abcd.pB.a r4, abcd.AbstractvF r5, java.util.Map<java.lang.String, uF<?>> r6, java.util.Map<java.lang.String, abcd.C1498xF.a> r7, java.lang.String r8) {
        java.util.Map.Entry<java.lang.String, uF<?>> r10 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.FH = r1;
                    this.j6 = r3;
                    this.DW = r2;
                    this.v5 = r4;
                    this.VH = r5;
                    this.Zo = r8;
                    this.gn = r7;
                    if (r6 == null) { $pc0 = 9; continue $sw0; }
                    java.util.Iterator<java.util.Map.Entry<java.lang.String, uF<?>>> r9 = r6.entrySet().iterator();
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r9.hasNext() == false) { $pc0 = 11; continue $sw0; }
                    r10 = r9.next();
                    j6(r10.getKey(), r10.getValue());
                    { $pc0 = 6; continue $sw0; }
                }
                case 11: {
                    return;
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.pB.a j6() {
        return this.v5;
    }

    public void j6(java.lang.String r10, uF<?> r11) {
        java.util.Iterator<abcd.qF> r0 = null;
        int r2 = 0;
        int[][] r3 = null;
        java.util.Iterator<abcd.qF> r4 = null;
        int r12 = 0;
        abcd.qF r1 = null;
        int r5 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r11.DW() == true) { $pc1 = 6; continue $sw1; }
                    return;
                }
                case 6: {
                    if (this.Hw != null) { $pc1 = 8; continue $sw1; }
                    this.Hw = new java.util.HashMap();
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    r0 = r11.iterator();
                    r2 = 0;
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    if (r0.hasNext() == false) { $pc1 = 11; continue $sw1; }
                    if (r0.next().DW().equals(abcd.qF.a.DW) == false) { $pc1 = 10; continue $sw1; }
                    r2 = r2 + 1;
                    { $pc1 = 10; continue $sw1; }
                }
                case 11: {
                    r3 = (int[][]) java.lang.reflect.Array.newInstance(int.class, new int[]{r2, this.j6.length + 1});
                    r4 = r11.iterator();
                    r12 = -1;
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    if (r4.hasNext() == false) { $pc1 = 14; continue $sw1; }
                    r1 = r4.next();
                    if (r1.DW().equals(abcd.qF.a.DW) == false) { $pc1 = 21; continue $sw1; }
                    if (r12 <= (-1)) { $pc1 = 20; continue $sw1; }
                    r3[r12][this.j6.length] = 0;
                    $pc1 = 20; continue $sw1;
                }
                case 20: {
                    r12 = r12 + 1;
                    r5 = r1.FH();
                    r3[r12][r1.Hw()] = r1.j6();
                    $pc1 = 23; continue $sw1;
                }
                case 23: {
                    if (r1.DW().equals(abcd.qF.a.FH) == false) { $pc1 = 13; continue $sw1; }
                    if (r1.FH() <= r5) { $pc1 = 27; continue $sw1; }
                    r1.FH();
                    $pc1 = 27; continue $sw1;
                }
                case 27: {
                    r3[r12][r1.Hw()] = r1.j6();
                    { $pc1 = 13; continue $sw1; }
                }
                case 21: {
                    r5 = 0;
                    { $pc1 = 23; continue $sw1; }
                }
                case 14: {
                    this.Hw.put(r10, r3);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = null;
        abcd.yE[] r1 = null;
        int r2 = 0;
        int r5 = 0;
        boolean r6 = false;
        abcd.yE r8 = null;
        java.lang.String r3 = null;
        java.lang.Object[] r4 = null;
        java.lang.String r7 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r1 = this.j6;
                    r2 = r1.length;
                    r5 = 0;
                    r6 = true;
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r5 >= r2) { $pc2 = 5; continue $sw2; }
                    r8 = r1[r5];
                    if (r6 == true) { $pc2 = 14; continue $sw2; }
                    r0.append(", ");
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    r0.append(abcd.yE.j6(r8));
                    r5 = r5 + 1;
                    { $pc2 = 4; continue $sw2; }
                }
                case 14: {
                    r6 = false;
                    { $pc2 = 15; continue $sw2; }
                }
                case 5: {
                    r3 = org.eclipse.jgit.JGitText.j6().mergeUsingStrategyResultedInDescription;
                    r4 = new java.lang.Object[5];
                    r4[0] = r0;
                    r4[1] = abcd.yE.j6(this.DW);
                    r4[2] = this.VH.j6();
                    r4[3] = this.v5;
                    if (this.Zo != null) { $pc2 = 8; continue $sw2; }
                    r7 = "";
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    r4[4] = r7;
                    return java.text.MessageFormat.format(r3, r4);
                }
                case 8: {
                    r7 = ", " + this.Zo;
                    { $pc2 = 9; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
