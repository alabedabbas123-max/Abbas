package abcd;

public final class Op extends abcd.AbstractSp {
    private final java.util.TreeMap<abcd.Js, abcd.Np> Zo;

    public Op(abcd.jp r3) {
        super("string_ids", r3, 4);
        this.Zo = new java.util.TreeMap();
    }

    public abcd.Np DW(abcd.Js r2) {
        return j6(new abcd.Np(r2));
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
        r6.j6(4, "string_ids_size: " + abcd.Yt.gn(r0));
        r6.j6(4, "string_ids_off:  " + abcd.Yt.gn(r1));
    L9:
        r6.writeInt(r0);
        r6.writeInt(r1);
        return;
    L5:
        r1 = FH();
        goto L7
    }

    public int j6(abcd.Js r2) {
        if (r2 == null) goto L10;
        VH();
        abcd.Np r3 = this.Zo.get(r2);
        if (r3 == null) goto L8;
        return r3.we();
    L8:
        throw new java.lang.IllegalArgumentException("not found");
    L10:
        throw new java.lang.NullPointerException("string == null");
    }

    public abcd.Np j6(abcd.Np r3) {
        if (r3 == null) goto L9;
        gn();
        abcd.Js r0 = r3.aM();
        abcd.Np r1 = this.Zo.get(r0);
        if (r1 == null) goto L6;
        return r1;
    L6:
        this.Zo.put(r0, r3);
        return r3;
    L9:
        throw new java.lang.NullPointerException("string == null");
    }

    public abcd.Abstractup j6(abcd.Abstractms r2) {
        if (r2 == null) goto L9;
        VH();
        abcd.Np r3 = this.Zo.get((abcd.Js) r2);
        if (r3 == null) goto L7;
        return r3;
    L7:
        throw new java.lang.IllegalArgumentException("not found");
    L9:
        throw new java.lang.NullPointerException("cst == null");
    }

    @Override
    protected void tp() {
        java.util.Iterator<abcd.Np> r0 = this.Zo.values().iterator();
        int r1 = 0;
    L4:
        if (r0.hasNext() == false) goto L6;
        r0.next().j6(r1);
        r1 = r1 + 1;
        goto L4
    }
}
