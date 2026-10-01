package abcd;

public final class Em extends abcd.AbstractAm {
    private final abcd.Pt DW;
    private final abcd.Interfacens FH;

    public Em(java.lang.String r1, abcd.Pt r2, int r3, int r4, abcd.Interfacens r5) {
        this(r1, r2.j6(r3, r4 + r3), r5);
    }

    public Em(java.lang.String r1, abcd.Pt r2, abcd.Interfacens r3) {
        super(r1);
        if (r2 == null) goto L7;
        this.DW = r2;
        this.FH = r3;
        return;
    L7:
        throw new java.lang.NullPointerException("data == null");
    }

    @Override
    public int Hw() {
        return this.DW.FH() + 6;
    }
}
