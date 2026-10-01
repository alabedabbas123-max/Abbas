package abcd;

public final class Qp extends abcd.AbstractSp {
    private final java.util.TreeMap<abcd.Qs, abcd.Pp> Zo;

    public Qp(abcd.jp r3) {
        super("type_ids", r3, 4);
        this.Zo = new java.util.TreeMap();
    }

    public abcd.Pp DW(abcd.Ks r3) {
        if (r3 == null) goto L8;
        gn();
        abcd.Qs r0 = r3.VH();
        abcd.Pp r1 = this.Zo.get(r0);
        if (r1 != null) goto L9;
        abcd.Pp r2 = new abcd.Pp(r3);
        this.Zo.put(r0, r2);
        return r2;
    L9:
        return r1;
    L8:
        throw new java.lang.NullPointerException("type == null");
    }

    public abcd.Pp DW(abcd.Qs r3) {
        if (r3 == null) goto L8;
        gn();
        abcd.Pp r0 = this.Zo.get(r3);
        if (r0 != null) goto L9;
        abcd.Pp r1 = new abcd.Pp(new abcd.Ks(r3));
        this.Zo.put(r3, r1);
        return r1;
    L9:
        return r0;
    L8:
        throw new java.lang.NullPointerException("type == null");
    }

    @Override
    public java.util.Collection<? extends abcd.Abstractvp> Hw() {
        return this.Zo.values();
    }

    public void Hw(abcd.Lt r6) {
        VH();
        int r0 = this.Zo.size();
        if (r0 != 0) goto L5;
        int r1 = 0;
    L7:
        if (r0 > 65536) goto L14;
        if (r6.Hw() == false) goto L11;
        r6.j6(4, "type_ids_size:   " + abcd.Yt.gn(r0));
        r6.j6(4, "type_ids_off:    " + abcd.Yt.gn(r1));
    L11:
        r6.writeInt(r0);
        r6.writeInt(r1);
        return;
    L14:
        throw new java.lang.UnsupportedOperationException("too many type ids");
    L5:
        r1 = FH();
        goto L7
    }

    public int j6(abcd.Ks r2) {
        if (r2 == null) goto L6;
        return j6(r2.VH());
    L6:
        throw new java.lang.NullPointerException("type == null");
    }

    public int j6(abcd.Qs r4) {
        if (r4 == null) goto L10;
        VH();
        abcd.Pp r0 = this.Zo.get(r4);
        if (r0 == null) goto L8;
        return r0.we();
    L8:
        throw new java.lang.IllegalArgumentException("not found: " + r4);
    L10:
        throw new java.lang.NullPointerException("type == null");
    }

    public abcd.Abstractup j6(abcd.Abstractms r4) {
        if (r4 == null) goto L9;
        VH();
        abcd.Pp r0 = this.Zo.get(((abcd.Ks) r4).VH());
        if (r0 == null) goto L7;
        return r0;
    L7:
        throw new java.lang.IllegalArgumentException("not found: " + r4);
    L9:
        throw new java.lang.NullPointerException("cst == null");
    }

    @Override
    protected void tp() {
        java.util.Iterator<? extends abcd.Abstractvp> r0 = Hw().iterator();
        int r1 = 0;
    L4:
        if (r0.hasNext() == false) goto L6;
        ((abcd.Pp) r0.next()).j6(r1);
        r1 = r1 + 1;
        goto L4
    }
}
