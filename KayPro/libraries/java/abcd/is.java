package abcd;

public final class is extends abcd.Tr {
    private final abcd.au v5;

    public is(abcd.es r1, abcd.hs r2, abcd.bs r3, abcd.cs r4, abcd.au r5) {
        super(r1, r2, r3, r4);
        if (r1.DW() != 5) goto L10;
        if (r5 == null) goto L8;
        this.v5 = r5;
        return;
    L8:
        throw new java.lang.NullPointerException("cases == null");
    L10:
        throw new java.lang.IllegalArgumentException("bogus branchingness");
    }

    @Override
    public abcd.Ss DW() {
        return abcd.Ps.FH;
    }

    @Override
    public java.lang.String FH() {
        return this.v5.toString();
    }

    @Override
    public abcd.Tr j6(abcd.Qs r2) {
        throw new java.lang.UnsupportedOperationException("unsupported");
    }

    @Override
    public abcd.Tr j6(abcd.bs r8, abcd.cs r9) {
        return new abcd.is(v5(), Zo(), r8, r9, this.v5);
    }

    @Override
    public void j6(abcd.Tr.b r1) {
        r1.j6(this);
    }

    @Override
    public boolean j6(abcd.Tr r1) {
        return false;
    }

    public abcd.au tp() {
        return this.v5;
    }
}
