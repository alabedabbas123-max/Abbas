package abcd;

public final class qp extends abcd.Abstractzp {
    private final java.util.TreeMap<abcd.ws, abcd.pp> Zo;

    public qp(abcd.jp r2) {
        super("field_ids", r2);
        this.Zo = new java.util.TreeMap();
    }

    public abcd.pp DW(abcd.ws r3) {
        if (r3 == null) goto L8;
        gn();
        abcd.pp r0 = this.Zo.get(r3);
        if (r0 != null) goto L9;
        abcd.pp r1 = new abcd.pp(r3);
        this.Zo.put(r3, r1);
        return r1;
    L9:
        return r0;
    L8:
        throw new java.lang.NullPointerException("field == null");
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
        if (r6.Hw() == false) goto L9;
        r6.j6(4, "field_ids_size:  " + abcd.Yt.gn(r0));
        r6.j6(4, "field_ids_off:   " + abcd.Yt.gn(r1));
    L9:
        r6.writeInt(r0);
        r6.writeInt(r1);
        return;
    L5:
        r1 = FH();
        goto L7
    }

    public int j6(abcd.ws r2) {
        if (r2 == null) goto L10;
        VH();
        abcd.pp r3 = this.Zo.get(r2);
        if (r3 == null) goto L8;
        return r3.we();
    L8:
        throw new java.lang.IllegalArgumentException("not found");
    L10:
        throw new java.lang.NullPointerException("ref == null");
    }

    public abcd.Abstractup j6(abcd.Abstractms r2) {
        if (r2 == null) goto L9;
        VH();
        abcd.pp r3 = this.Zo.get((abcd.ws) r2);
        if (r3 == null) goto L7;
        return r3;
    L7:
        throw new java.lang.IllegalArgumentException("not found");
    L9:
        throw new java.lang.NullPointerException("cst == null");
    }
}
