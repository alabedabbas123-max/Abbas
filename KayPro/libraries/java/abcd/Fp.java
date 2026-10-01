package abcd;

public final class Fp extends abcd.AbstractKp {
    private static final java.util.Comparator<abcd.AbstractGp> Zo = null;
    private final java.util.ArrayList<abcd.AbstractGp> VH;
    private final java.util.HashMap<abcd.AbstractGp, abcd.AbstractGp> gn;
    private int tp;
    private final abcd.Fp.a u7;

    static final enum a extends java.lang.Enum<abcd.Fp.a> {
        public static final abcd.Fp.a DW = null;
        public static final abcd.Fp.a FH = null;
        private static final abcd.Fp.a[] Hw = null;
        public static final abcd.Fp.a j6 = null;

        static {
            j6 = new abcd.Fp.a("NONE", 0);
            DW = new abcd.Fp.a("TYPE", 1);
            FH = new abcd.Fp.a("INSTANCE", 2);
            Hw = new abcd.Fp.a[]{j6, DW, FH};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.Fp.a valueOf(java.lang.String r1) {
            return (abcd.Fp.a) java.lang.Enum.valueOf(abcd.Fp.a.class, r1);
        }

        public static abcd.Fp.a[] values() {
            return (abcd.Fp.a[]) Hw.clone();
        }
    }

    static {
        Zo = new abcd.Dp();
    }

    public Fp(java.lang.String r1, abcd.jp r2, int r3, abcd.Fp.a r4) {
        super(r1, r2, r3);
        this.VH = new java.util.ArrayList(100);
        this.gn = new java.util.HashMap(100);
        this.u7 = r4;
        this.tp = -1;
    }

    public <T extends abcd.AbstractGp> T DW(T r2) {
        gn();
        T r0 = (T) this.gn.get(r2);
        if (r0 == null) goto L5;
        return r0;
    L5:
        j6(r2);
        this.gn.put(r2, r2);
        return r2;
    }

    @Override
    protected void FH(abcd.Lt r11) {
        boolean r0 = r11.Hw();
        abcd.jp r1 = DW();
        java.util.Iterator<abcd.AbstractGp> r2 = this.VH.iterator();
        int r5 = 0;
        boolean r6 = true;
    L4:
        if (r2.hasNext() == false) goto L15;
        abcd.AbstractGp r7 = r2.next();
        if (r0 == false) goto L10;
        if (r6 == false) goto L9;
        r6 = false;
        goto L10
    L9:
        r11.j6(0, "\n");
    L10:
        int r8 = r7.J8() - 1;
        int r9 = r5 + r8;
        int r10 = (r8 ^ (-1)) & r9;
        if (r5 == r10) goto L13;
        r11.j6(r10 - r5);
        r5 = r10;
    L13:
        r7.j6(r1, r11);
        r5 = r5 + r7.VH();
        goto L4
    L15:
        if (r5 != this.tp) goto L18;
        return;
    L18:
        throw new java.lang.RuntimeException("output size mismatch");
    }

    @Override
    public java.util.Collection<? extends abcd.Abstractvp> Hw() {
        return this.VH;
    }

    @Override
    protected void Zo() {
        abcd.jp r0 = DW();
        int r1 = 0;
    L3:
        int r2 = this.VH.size();
        if (r1 < r2) goto L6;
        return;
    L6:
        if (r1 >= r2) goto L3;
        this.VH.get(r1).j6(r0);
        r1 = r1 + 1;
        goto L6
    }

    @Override
    public int j6(abcd.Abstractvp r1) {
        return ((abcd.AbstractGp) r1).we();
    }

    public void j6(abcd.AbstractGp r3) {
        gn();
        if (r3.J8() > j6()) goto L8;
        this.VH.add(r3);
        return;
    L8:
        throw new java.lang.IllegalArgumentException("incompatible item alignment");     // Catch: java.lang.NullPointerException -> L9
    L10:
        throw new java.lang.NullPointerException("item == null");
    }

    public void j6(abcd.Lt r5, abcd.Enumwp r6, java.lang.String r7) {
        VH();
        java.util.TreeMap r0 = new java.util.TreeMap();
        java.util.Iterator<abcd.AbstractGp> r1 = this.VH.iterator();
    L4:
        if (r1.hasNext() == false) goto L9;
        abcd.AbstractGp r2 = r1.next();
        if (r2.Hw() != r6) goto L4;
        r0.put(r2.aM(), r2);
        goto L4
    L9:
        if (r0.size() != 0) goto L11;
        return;
    L11:
        r5.j6(0, r7);
        java.util.Iterator r8 = r0.entrySet().iterator();
    L13:
        if (r8.hasNext() == false) goto L15;
        java.util.Map.Entry r3 = (java.util.Map.Entry) r8.next();
        r5.j6(0, ((abcd.AbstractGp) r3.getValue()).Ws() + ' ' + ((java.lang.String) r3.getKey()) + '\n');
        goto L13
    }

    public void tp() {
        VH();
        int r0 = abcd.Ep.j6[this.u7.ordinal()];
        if (r0 != 1) goto L5;
        java.util.Collections.sort(this.VH);
    L9:
        int r1 = this.VH.size();
        int r2 = 0;
        int r3 = 0;
    L10:
        if (r2 >= r1) goto L20;
        abcd.AbstractGp r4 = this.VH.get(r2);
        int r5 = r4.j6(this, r3);     // Catch: java.lang.RuntimeException -> L17
        if (r5 < r3) goto L16;
        r3 = r4.VH() + r5;     // Catch: java.lang.RuntimeException -> L17
        r2 = r2 + 1;     // Catch: java.lang.RuntimeException -> L17
        goto L10
    L16:
        throw new java.lang.RuntimeException("bogus place() result for " + r4);     // Catch: java.lang.RuntimeException -> L17
    L17:
        e = move-exception;
        throw abcd.Vt.j6(e, "...while placing " + r4);
    L20:
        this.tp = r3;
        return;
    L5:
        if (r0 != 2) goto L9;
        java.util.Collections.sort(this.VH, Zo);
        goto L9
    }

    @Override
    public int u7() {
        VH();
        return this.tp;
    }
}
