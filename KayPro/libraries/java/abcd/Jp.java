package abcd;

public final class Jp extends abcd.AbstractSp {
    private final java.util.TreeMap<abcd.Os, abcd.Ip> Zo;

    public Jp(abcd.jp r3) {
        super("proto_ids", r3, 4);
        this.Zo = new java.util.TreeMap();
    }

    public abcd.Ip DW(abcd.Os r3) {
        if (r3 == null) goto L8;
        gn();
        abcd.Ip r0 = this.Zo.get(r3);
        if (r0 != null) goto L9;
        abcd.Ip r1 = new abcd.Ip(r3);
        this.Zo.put(r3, r1);
        return r1;
    L9:
        return r0;
    L8:
        throw new java.lang.NullPointerException("prototype == null");
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
        r6.j6(4, "proto_ids_size:  " + abcd.Yt.gn(r0));
        r6.j6(4, "proto_ids_off:   " + abcd.Yt.gn(r1));
    L11:
        r6.writeInt(r0);
        r6.writeInt(r1);
        return;
    L14:
        throw new java.lang.UnsupportedOperationException("too many proto ids");
    L5:
        r1 = FH();
        goto L7
    }

    public int j6(abcd.Os r2) {
        if (r2 == null) goto L10;
        VH();
        abcd.Ip r3 = this.Zo.get(r2);
        if (r3 == null) goto L8;
        return r3.we();
    L8:
        throw new java.lang.IllegalArgumentException("not found");
    L10:
        throw new java.lang.NullPointerException("prototype == null");
    }

    @Override
    protected void tp() {
        java.util.Iterator<? extends abcd.Abstractvp> r0 = Hw().iterator();
        int r1 = 0;
    L4:
        if (r0.hasNext() == false) goto L6;
        ((abcd.Ip) r0.next()).j6(r1);
        r1 = r1 + 1;
        goto L4
    }
}
