package abcd;

public final class Yr extends abcd.Pr {
    public Yr(abcd.es r1, abcd.hs r2, abcd.bs r3, abcd.cs r4, abcd.Abstractms r5) {
        super(r1, r2, r3, r4, r5);
        if (r1.DW() != 1) goto L6;
        return;
    L6:
        throw new java.lang.IllegalArgumentException("bogus branchingness");
    }

    @Override
    public abcd.Ss DW() {
        return abcd.Ps.FH;
    }

    @Override
    public abcd.Tr j6(abcd.Qs r2) {
        throw new java.lang.UnsupportedOperationException("unsupported");
    }

    @Override
    public abcd.Tr j6(abcd.bs r8, abcd.cs r9) {
        return new abcd.Yr(v5(), Zo(), r8, r9, tp());
    }

    @Override
    public void j6(abcd.Tr.b r1) {
        r1.j6(this);
    }
}
