package abcd;

public abstract class TI {
    private final char[] DW;
    private final java.util.Set<java.lang.String> FH;
    private final java.util.Set<abcd.yE> Hw;
    private boolean VH;
    private boolean Zo;
    private final java.lang.StringBuilder j6;
    private abcd.UE v5;

    public static class a extends abcd.TI {
        private final abcd.EI gn;

        public a(abcd.EI r1) {
            this.gn = r1;
        }

        @Override
        protected void j6() {
            this.gn.j6();
        }

        @Override
        protected void j6(java.lang.CharSequence r2) {
            this.gn.j6(r2.toString());
        }
    }

    public TI() {
        this.j6 = new java.lang.StringBuilder(100);
        this.DW = new char[40];
        this.FH = new java.util.LinkedHashSet();
        this.Hw = new java.util.HashSet();
        this.VH = true;
    }

    private java.lang.Iterable<abcd.ME> DW(java.util.Map<java.lang.String, abcd.ME> r2) {
        if ((r2 instanceof abcd.MK) == true) goto L12;
        if ((r2 instanceof java.util.SortedMap) == false) goto L10;
        if (((java.util.SortedMap) r2).comparator() == null) goto L12;
    L10:
        return abcd.NE.j6(r2.values());
    L12:
        return r2.values();
    }

    private void DW(abcd.YD r3, java.lang.String r4) {
        this.Hw.add(r3.J8());
        j6(r3, r4);
    }

    private void FH(abcd.YD r2, java.lang.String r3) {
        if (this.Hw.contains(r2) == true) goto L6;
        DW(r2, r3);
        return;
    }

    public boolean DW() {
        return this.VH;
    }

    public java.util.Set<abcd.yE> j6(java.util.Map<java.lang.String, abcd.ME> r4) {
        java.util.Iterator<abcd.ME> r5 = DW(r4).iterator();
    L4:
        if (r5.hasNext() == false) goto L6;
        abcd.ME r0 = r5.next();
        if (r0.DW() == null) goto L4;
        DW(r0.DW(), r0.getName());
        if (this.Zo == false) goto L4;
        if (r0.Hw() == true) goto L20;
        abcd.UE r1 = this.v5;
        if (r1 == null) goto L4;
        r0 = r1.j6(r0);
    L20:
        if (r0.FH() == null) goto L4;
        DW(r0.FH(), java.lang.String.valueOf(r0.getName()) + "^{}");
        goto L4
    L6:
        return this.Hw;
    }

    protected abstract void j6();

    public void j6(abcd.UE r1) {
        this.v5 = r1;
    }

    public void j6(abcd.YD r2) {
        FH(r2, ".have");
    }

    public void j6(abcd.YD r4, java.lang.String r5) {
        this.j6.setLength(0);
        r4.j6(this.DW, this.j6);
        this.j6.append(' ');
        this.j6.append(r5);
        if (this.VH == false) goto L11;
        this.VH = false;
        if (this.FH.isEmpty() == true) goto L11;
        this.j6.append(0);
        java.util.Iterator<java.lang.String> r6 = this.FH.iterator();
    L8:
        if (r6.hasNext() == false) goto L9;
        java.lang.String r7 = r6.next();
        this.j6.append(' ');
        this.j6.append(r7);
        goto L8
    L9:
        this.j6.append(' ');
    L11:
        this.j6.append('\n');
        j6(this.j6);
    }

    protected abstract void j6(java.lang.CharSequence r1);

    public void j6(java.lang.String r2) {
        this.FH.add(r2);
    }

    public void j6(boolean r1) {
        this.Zo = r1;
    }
}
