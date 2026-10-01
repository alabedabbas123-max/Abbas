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

    public static abstract enum a extends java.lang.Enum<abcd.pB.a> {
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
            return (abcd.pB.a) java.lang.Enum.valueOf(abcd.pB.a.class, r1);
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
        this.FH = r1;
        this.j6 = r3;
        this.DW = r2;
        this.v5 = r4;
        this.VH = r5;
        this.Zo = r8;
        this.gn = r7;
        if (r6 == null) goto L9;
        java.util.Iterator<java.util.Map.Entry<java.lang.String, uF<?>>> r9 = r6.entrySet().iterator();
    L6:
        if (r9.hasNext() == false) goto L11;
        java.util.Map.Entry<java.lang.String, uF<?>> r10 = r9.next();
        j6(r10.getKey(), r10.getValue());
        goto L6
    L11:
        return;
    }

    public abcd.pB.a j6() {
        return this.v5;
    }

    public void j6(java.lang.String r10, uF<?> r11) {
        if (r11.DW() == true) goto L6;
        return;
    L6:
        if (this.Hw != null) goto L8;
        this.Hw = new java.util.HashMap();
    L8:
        java.util.Iterator<abcd.qF> r0 = r11.iterator();
        int r2 = 0;
    L10:
        if (r0.hasNext() == false) goto L11;
        if (r0.next().DW().equals(abcd.qF.a.DW) == false) goto L10;
        r2 = r2 + 1;
        goto L10
    L11:
        int[][] r3 = (int[][]) java.lang.reflect.Array.newInstance(int.class, new int[]{r2, this.j6.length + 1});
        java.util.Iterator<abcd.qF> r4 = r11.iterator();
        int r12 = -1;
    L13:
        if (r4.hasNext() == false) goto L14;
        abcd.qF r1 = r4.next();
        if (r1.DW().equals(abcd.qF.a.DW) == false) goto L21;
        if (r12 <= (-1)) goto L20;
        r3[r12][this.j6.length] = 0;
    L20:
        r12 = r12 + 1;
        int r5 = r1.FH();
        r3[r12][r1.Hw()] = r1.j6();
    L23:
        if (r1.DW().equals(abcd.qF.a.FH) == false) goto L13;
        if (r1.FH() <= r5) goto L27;
        r1.FH();
    L27:
        r3[r12][r1.Hw()] = r1.j6();
        goto L13
    L21:
        r5 = 0;
        goto L23
    L14:
        this.Hw.put(r10, r3);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder();
        abcd.yE[] r1 = this.j6;
        int r2 = r1.length;
        int r5 = 0;
        boolean r6 = true;
    L4:
        if (r5 >= r2) goto L5;
        abcd.yE r8 = r1[r5];
        if (r6 == true) goto L14;
        r0.append(", ");
    L15:
        r0.append(abcd.yE.j6(r8));
        r5 = r5 + 1;
        goto L4
    L14:
        r6 = false;
        goto L15
    L5:
        java.lang.String r3 = org.eclipse.jgit.JGitText.j6().mergeUsingStrategyResultedInDescription;
        java.lang.Object[] r4 = new java.lang.Object[5];
        r4[0] = r0;
        r4[1] = abcd.yE.j6(this.DW);
        r4[2] = this.VH.j6();
        r4[3] = this.v5;
        if (this.Zo != null) goto L8;
        java.lang.String r7 = "";
    L9:
        r4[4] = r7;
        return java.text.MessageFormat.format(r3, r4);
    L8:
        r7 = ", " + this.Zo;
        goto L9
    }
}
