package abcd;

public class Ht {
    private final java.util.BitSet DW;
    private final int FH;
    private final abcd.yt Hw;
    private int VH;
    private abcd.tt Zo;
    private abcd.Ht.a gn;
    private final java.util.BitSet j6;
    private final abcd.Ft v5;

    private static final enum a extends java.lang.Enum<abcd.Ht.a> {
        public static final abcd.Ht.a DW = null;
        public static final abcd.Ht.a FH = null;
        public static final abcd.Ht.a Hw = null;
        public static final abcd.Ht.a j6 = null;
        private static final abcd.Ht.a[] v5 = null;

        static {
            j6 = new abcd.Ht.a("LIVE_IN_AT_STATEMENT", 0);
            DW = new abcd.Ht.a("LIVE_OUT_AT_STATEMENT", 1);
            FH = new abcd.Ht.a("LIVE_OUT_AT_BLOCK", 2);
            Hw = new abcd.Ht.a("DONE", 3);
            v5 = new abcd.Ht.a[]{j6, DW, FH, Hw};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.Ht.a valueOf(java.lang.String r1) {
            return (abcd.Ht.a) java.lang.Enum.valueOf(abcd.Ht.a.class, r1);
        }

        public static abcd.Ht.a[] values() {
            return (abcd.Ht.a[]) v5.clone();
        }
    }

    private Ht(abcd.yt r2, int r3, abcd.Ft r4) {
        int r0 = r2.DW().size();
        this.Hw = r2;
        this.FH = r3;
        this.j6 = new java.util.BitSet(r0);
        this.DW = new java.util.BitSet(r0);
        this.v5 = r4;
    }

    private void DW() {
    L2:
        abcd.Ht.a r0 = this.gn;
        if (r0 == abcd.Ht.a.Hw) goto L14;
        int r1 = abcd.Gt.j6[r0.ordinal()];
        if (r1 != 1) goto L7;
        this.gn = abcd.Ht.a.Hw;
        FH();
        goto L2
    L7:
        if (r1 != 2) goto L9;
        this.gn = abcd.Ht.a.Hw;
        v5();
        goto L2
    L9:
        if (r1 != 3) goto L2;
        this.gn = abcd.Ht.a.Hw;
        Hw();
        goto L2
    }

    private void FH() {
        int r0 = this.VH;
        if (r0 != 0) goto L5;
        this.Zo.j6(this.FH);
        this.DW.or(this.Zo.VH());
        return;
    L5:
        this.VH = r0 - 1;
        this.gn = abcd.Ht.a.DW;
    }

    private void Hw() {
        if (this.j6.get(this.Zo.DW()) == true) goto L6;
        this.j6.set(this.Zo.DW());
        this.Zo.DW(this.FH);
        this.VH = this.Zo.FH().size() - 1;
        this.gn = abcd.Ht.a.DW;
        return;
    }

    public static abcd.Ft j6(abcd.yt r4) {
        int r0 = r4.u7();
        abcd.Ft r1 = new abcd.Ft(r0);
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        new abcd.Ht(r4, r2, r1).j6();
        r2 = r2 + 1;
        goto L3
    L5:
        j6(r4, r1);
        return r1;
    }

    private static void j6(abcd.yt r7, abcd.Ft r8) {
        java.util.Iterator<abcd.tt> r9 = r7.DW().iterator();
    L4:
        if (r9.hasNext() == false) goto L14;
        java.util.List<abcd.Abstractvt> r0 = r9.next().Zo();
        int r1 = r0.size();
        int r3 = 0;
    L6:
        if (r3 >= r1) goto L4;
        int r4 = 0;
    L8:
        if (r4 >= r1) goto L13;
        if (r3 == r4) goto L12;
        r8.j6(r0.get(r3).u7().we(), r0.get(r4).u7().we());
    L12:
        r4 = r4 + 1;
        goto L8
    L13:
        r3 = r3 + 1;
        goto L6
    }

    private void v5() {
        abcd.Abstractvt r0 = this.Zo.FH().get(this.VH);
        abcd.bs r1 = r0.u7();
        if (r0.DW(this.FH) == true) goto L8;
        if (r1 == null) goto L6;
        this.v5.j6(this.FH, r1.we());
    L6:
        this.gn = abcd.Ht.a.j6;
        return;
    }

    public void j6() {
        java.util.Iterator<abcd.Abstractvt> r0 = this.Hw.Hw(this.FH).iterator();
    L4:
        if (r0.hasNext() == false) goto L16;
        abcd.Abstractvt r1 = r0.next();
        this.gn = abcd.Ht.a.Hw;
        if ((r1 instanceof abcd.ot) == true) goto L7;
        this.Zo = r1.DW();
        this.VH = this.Zo.FH().indexOf(r1);
        if (this.VH < 0) goto L15;
        this.gn = abcd.Ht.a.j6;
        DW();
        goto L4
    L15:
        throw new java.lang.RuntimeException("insn not found in it's own block");
    L7:
        java.util.Iterator<abcd.tt> r2 = ((abcd.ot) r1).j6(this.FH, this.Hw).iterator();
    L9:
        if (r2.hasNext() == false) goto L4;
        this.Zo = r2.next();
        this.gn = abcd.Ht.a.FH;
        DW();
    L16:
        int r3 = this.DW.nextSetBit(0);
        if (r3 < 0) goto L19;
        this.Zo = this.Hw.DW().get(r3);
        this.DW.clear(r3);
        this.gn = abcd.Ht.a.FH;
        DW();
        goto L16
    }
}
