package abcd;

public final class Sr extends abcd.Tr {
    private final abcd.Abstractms Zo;
    private final java.util.ArrayList<abcd.Abstractms> v5;

    public Sr(abcd.es r2, abcd.hs r3, abcd.cs r4, java.util.ArrayList<abcd.Abstractms> r5, abcd.Abstractms r6) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(r2, r3, null, r4);
                    if (r2.DW() != 1) { $pc0 = 7; continue $sw0; }
                    this.v5 = r5;
                    this.Zo = r6;
                    return;
                }
                case 7: {
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

    public java.util.ArrayList<abcd.Abstractms> EQ() {
        return this.v5;
    }

    @Override
    public abcd.Tr j6(abcd.Qs r2) {
        throw new java.lang.UnsupportedOperationException("unsupported");
    }

    @Override
    public abcd.Tr j6(abcd.bs r7, abcd.cs r8) {
        return new abcd.Sr(v5(), Zo(), r8, this.v5, this.Zo);
    }

    @Override
    public void j6(abcd.Tr.b r1) {
        r1.j6(this);
    }

    public abcd.Abstractms tp() {
        return this.Zo;
    }
}
