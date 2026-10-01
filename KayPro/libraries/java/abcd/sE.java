package abcd;

public class sE {
    private final abcd.mG DW;
    private java.util.Set<java.lang.String> EQ;
    private abcd.AbstractjK FH;
    private final abcd._J Hw;
    private abcd.KC J0;
    private abcd.dK J8;
    private java.util.Set<java.lang.String> VH;
    private java.util.Set<java.lang.String> Zo;
    private java.util.Set<java.lang.String> gn;
    private final abcd.UE j6;
    private java.util.Set<java.lang.String> tp;
    private java.util.Set<java.lang.String> u7;
    private java.util.Set<java.lang.String> v5;
    private java.util.Set<java.lang.String> we;

    private static final class a extends abcd.AbstractjK {
        private final abcd.LE FH;
        private int Hw;
        private final int Zo;
        private int v5;

        private a(abcd.LE r2, int r3) {
            this.Hw = 0;
            this.FH = r2;
            this.Zo = r3;
            this.v5 = r3 / 100;
            if (this.v5 != 0) goto L6;
            this.v5 = 1000;
            return;
        }

        a(abcd.LE r1, int r2, abcd.sE.a r3) {
            this(r1, r2);
        }

        @Override
        public abcd.AbstractjK clone() {
            throw new java.lang.IllegalStateException("Do not clone this kind of filter: " + abcd.sE.a.class.getName());
        }

        @Override
        public boolean j6() {
            return false;
        }

        @Override
        public boolean j6(abcd.YJ r4) {
            this.Hw++;
            int r5 = this.Hw;
            int r1 = this.v5;
            if ((r5 % r1) == 0) goto L5;
        L12:
            return true;
        L5:
            if (r5 > this.Zo) goto L8;
            this.FH.update(r1);
        L8:
            if (this.FH.isCancelled() == false) goto L12;
            throw abcd.sD.j6;
        }
    }

    public sE(abcd.UE r3, java.lang.String r4, abcd._J r5) {
        this.FH = null;
        this.v5 = new java.util.HashSet();
        this.Zo = new java.util.HashSet();
        this.VH = new java.util.HashSet();
        this.gn = new java.util.HashSet();
        this.u7 = new java.util.HashSet();
        this.tp = new java.util.HashSet();
        this.EQ = new java.util.HashSet();
        this.j6 = r3;
        abcd.yE r6 = r3.FH(r4);
        if (r6 == null) goto L5;
        this.DW = new abcd.qG(r3).gn(r6);
    L6:
        this.Hw = r5;
        return;
    L5:
        this.DW = null;
        goto L6
    }

    public java.util.Set<java.lang.String> DW() {
        return this.v5;
    }

    public java.util.Set<java.lang.String> FH() {
        return this.Zo;
    }

    public java.util.Set<java.lang.String> Hw() {
        return this.EQ;
    }

    public java.util.Set<java.lang.String> VH() {
        return this.VH;
    }

    public java.util.Set<java.lang.String> Zo() {
        return this.u7;
    }

    public java.util.Set<java.lang.String> gn() {
        return this.tp;
    }

    public boolean j6() {
        return j6(null, 0, 0, "");
    }

    public boolean j6(abcd.LE r5, int r6, int r7, java.lang.String r8) {
        this.J0 = this.j6.U2();
        abcd.YJ r0 = new abcd.YJ(this.j6);
        r0.j6(true);
        abcd.mG r2 = this.DW;
        if (r2 == null) goto L5;
        r0.j6(r2);
    L6:
        r0.j6(new abcd.RC(this.J0));
        r0.j6(this.Hw);
        java.util.ArrayList r3 = new java.util.ArrayList(4);
        if (r5 == null) goto L11;
        if (r7 != 0) goto L10;
        r7 = this.J0.v5();
    L10:
        int r9 = java.lang.Math.max((r7 * 10) / 9, (r6 * 10) / 9);
        r5.j6(r8, r9);
        r3.add(new abcd.sE.a(r5, r9, null));
    L11:
        abcd.AbstractjK r10 = this.FH;
        if (r10 == null) goto L14;
        r3.add(r10);
    L14:
        r3.add(new abcd.iK(1));
        this.J8 = new abcd.dK(1, 2);
        r3.add(this.J8);
        r0.j6(abcd.AbstractcK.j6(r3));
    L16:
        if (r0.EQ() == false) goto L17;
        abcd.TJ r11 = r0.j6(0, abcd.TJ.class);
        abcd.RC r12 = (abcd.RC) r0.j6(1, abcd.RC.class);
        abcd._J r4 = (abcd._J) r0.j6(2, abcd._J.class);
        if (r12 == null) goto L40;
        abcd.QC r13 = r12.J8();
        if (r13 == null) goto L40;
        if (r13.VH() <= 0) goto L40;
        this.EQ.add(r0.Hw());
    L40:
        if (r11 == null) goto L50;
        if (r12 != null) goto L43;
        this.VH.add(r0.Hw());
        if (r4 == null) goto L56;
        this.tp.add(r0.Hw());
    L56:
        if (r12 == null) goto L16;
        if (r4 == null) goto L58;
        if (r4.j6(r12.J8(), true) == false) goto L16;
        this.u7.add(r0.Hw());
        goto L16
    L58:
        this.gn.add(r0.Hw());
        goto L16
    L43:
        if (r11.j6(r12) == true) goto L45;
    L46:
        this.Zo.add(r0.Hw());
        goto L56
    L45:
        if (r11.VH() == r12.VH()) goto L56;
    L50:
        if (r12 == null) goto L52;
        this.v5.add(r0.Hw());
        goto L56
    L52:
        if (r4 == null) goto L56;
        if (r4.U2() == true) goto L56;
        this.tp.add(r0.Hw());
        goto L56
    L17:
        if (r5 == null) goto L19;
        r5.j6();
    L19:
        this.we = this.J8.DW();
        if (this.v5.isEmpty() == true) goto L22;
    L32:
        return true;
    L22:
        if (this.Zo.isEmpty() == false) goto L32;
        if (this.VH.isEmpty() == false) goto L32;
        if (this.gn.isEmpty() == false) goto L32;
        if (this.u7.isEmpty() == false) goto L32;
        if (this.tp.isEmpty() == false) goto L32;
        return false;
    L5:
        r0.j6(new abcd.VJ());
        goto L6
    }

    public java.util.Set<java.lang.String> v5() {
        return this.gn;
    }
}
