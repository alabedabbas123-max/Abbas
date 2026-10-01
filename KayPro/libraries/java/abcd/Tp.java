package abcd;

public final class Tp<T extends abcd.AbstractGp> extends abcd.AbstractGp {
    private final java.util.List<T> Zo;
    private final abcd.Enumwp v5;

    public Tp(abcd.Enumwp r3, java.util.List<T> r4) {
        super(j6(r4), DW(r4));
        if (r3 == null) goto L7;
        this.Zo = r4;
        this.v5 = r3;
        return;
    L7:
        throw new java.lang.NullPointerException("itemType == null");
    }

    private static int DW(java.util.List<? extends abcd.AbstractGp> r2) {
        abcd.AbstractGp r0 = r2.get(0);
        return (r2.size() * r0.VH()) + j6(r2);
    }

    private int Mr() {
        return J8();
    }

    private static int j6(java.util.List<? extends abcd.AbstractGp> r2) {
        return java.lang.Math.max(4, r2.get(0).J8());
    L8:
        throw new java.lang.IllegalArgumentException("items.size() == 0");
    L6:
        throw new java.lang.NullPointerException("items == null");
    }

    @Override
    protected void DW(abcd.AbstractKp r8, int r9) {
        int r10 = r9 + Mr();
        java.util.Iterator<T> r0 = this.Zo.iterator();
        int r1 = -1;
        boolean r2 = true;
        int r3 = r10;
        int r11 = -1;
    L4:
        if (r0.hasNext() == false) goto L16;
        T r4 = r0.next();
        int r5 = r4.VH();
        if (r2 == false) goto L8;
        r11 = r4.J8();
        r1 = r5;
        r2 = false;
    L11:
        r3 = r4.j6(r8, r3) + r5;
        goto L4
    L8:
        if (r5 != r1) goto L15;
        if (r4.J8() == r11) goto L11;
        throw new java.lang.UnsupportedOperationException("item alignment mismatch");
    L15:
        throw new java.lang.UnsupportedOperationException("item size mismatch");
    }

    @Override
    protected void DW(abcd.jp r5, abcd.Lt r6) {
        int r0 = this.Zo.size();
        if (r6.Hw() == false) goto L5;
        r6.j6(0, Ws() + " " + Zo());
        java.lang.StringBuilder r2 = new java.lang.StringBuilder();
        r2.append("  size: ");
        r2.append(abcd.Yt.gn(r0));
        r6.j6(4, r2.toString());
    L5:
        r6.writeInt(r0);
        java.util.Iterator<T> r1 = this.Zo.iterator();
    L7:
        if (r1.hasNext() == false) goto L9;
        r1.next().j6(r5, r6);
        goto L7
    }

    @Override
    public abcd.Enumwp Hw() {
        return this.v5;
    }

    @Override
    public final java.lang.String aM() {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer(100);
        r0.append("{");
        java.util.Iterator<T> r1 = this.Zo.iterator();
        boolean r2 = true;
    L4:
        if (r1.hasNext() == false) goto L10;
        T r3 = r1.next();
        if (r2 == false) goto L8;
        r2 = false;
    L9:
        r0.append(r3.aM());
        goto L4
    L8:
        r0.append(", ");
        goto L9
    L10:
        r0.append("}");
        return r0.toString();
    }

    public final java.util.List<T> j3() {
        return this.Zo;
    }

    @Override
    public void j6(abcd.jp r3) {
        java.util.Iterator<T> r0 = this.Zo.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        r0.next().j6(r3);
        goto L4
    }

    public java.lang.String toString() {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer(100);
        r0.append(abcd.Tp.class.getName());
        r0.append(this.Zo);
        return r0.toString();
    }
}
