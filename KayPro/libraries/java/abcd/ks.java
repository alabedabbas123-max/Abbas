package abcd;

public final class ks extends abcd.Tr {
    private final abcd.Ss v5;

    public ks(abcd.es r2, abcd.hs r3, abcd.cs r4, abcd.Ss r5) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(r2, r3, null, r4);
                    if (r2.DW() != 6) { $pc0 = 10; continue $sw0; }
                    if (r5 == null) { $pc0 = 8; continue $sw0; }
                    this.v5 = r5;
                    return;
                }
                case 8: {
                    throw new java.lang.NullPointerException("catches == null");
                }
                case 10: {
                    throw new java.lang.IllegalArgumentException("bogus branchingness");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(abcd.Ss r4) {
        java.lang.StringBuffer r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new java.lang.StringBuffer(100);
                    r0.append("catch");
                    r1 = r4.size();
                    r2 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r2 >= r1) { $pc1 = 6; continue $sw1; }
                    r0.append(" ");
                    r0.append(r4.getType(r2).aM());
                    r2 = r2 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 6: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
