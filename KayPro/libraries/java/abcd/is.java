package abcd;

public final class is extends abcd.Tr {
    private final abcd.au v5;

    public is(abcd.es r1, abcd.hs r2, abcd.bs r3, abcd.cs r4, abcd.au r5) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(r1, r2, r3, r4);
                    if (r1.DW() != 5) { $pc0 = 10; continue $sw0; }
                    if (r5 == null) { $pc0 = 8; continue $sw0; }
                    this.v5 = r5;
                    return;
                }
                case 8: {
                    throw new java.lang.NullPointerException("cases == null");
                }
                case 10: {
                    throw new java.lang.IllegalArgumentException("bogus branchingness");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
