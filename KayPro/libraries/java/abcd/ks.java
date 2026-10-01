package abcd;

public final class ks extends abcd.Tr {
    private final abcd.Ss v5;

    public ks(abcd.es r2, abcd.hs r3, abcd.cs r4, abcd.Ss r5) {
        super(r2, r3, null, r4);
        if (r2.DW() != 6) goto L10;
        if (r5 == null) goto L8;
        this.v5 = r5;
        return;
    L8:
        throw new java.lang.NullPointerException("catches == null");
    L10:
        throw new java.lang.IllegalArgumentException("bogus branchingness");
    }

    public static java.lang.String j6(abcd.Ss r4) {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer(100);
        r0.append("catch");
        int r1 = r4.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L6;
        r0.append(" ");
        r0.append(r4.getType(r2).aM());
        r2 = r2 + 1;
        goto L3
    L6:
        return r0.toString();
    }

    @Override
    public abcd.Ss DW() {
        return this.v5;
    }

    @Override
    public java.lang.String FH() {
        return j6(this.v5);
    }

    @Override
    public abcd.Tr j6(abcd.Qs r6) {
        return new abcd.ks(v5(), Zo(), gn(), this.v5.j6(r6));
    }

    @Override
    public abcd.Tr j6(abcd.bs r4, abcd.cs r5) {
        return new abcd.ks(v5(), Zo(), r5, this.v5);
    }

    @Override
    public void j6(abcd.Tr.b r1) {
        r1.j6(this);
    }
}
