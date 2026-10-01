package abcd;

public final class js extends abcd.Pr {
    private final abcd.Ss Zo;

    public js(abcd.es r7, abcd.hs r8, abcd.cs r9, abcd.Ss r10, abcd.Abstractms r11) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(r7, r8, null, r9, r11);
                    if (r7.DW() != 6) { $pc0 = 10; continue $sw0; }
                    if (r10 == null) { $pc0 = 8; continue $sw0; }
                    this.Zo = r10;
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

    @Override
    public abcd.Ss DW() {
        return this.Zo;
    }

    @Override
    public java.lang.String FH() {
        abcd.Abstractms r0 = null;
        java.lang.String r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = tp();
                    r1 = r0.aM();
                    if ((r0 instanceof abcd.Js) == false) { $pc1 = 6; continue $sw1; }
                    r1 = ((abcd.Js) r0).lg();
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return r1 + " " + abcd.ks.j6(this.Zo);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.Tr j6(abcd.Qs r8) {
        return new abcd.js(v5(), Zo(), gn(), this.Zo.j6(r8), tp());
    }

    @Override
    public abcd.Tr j6(abcd.bs r7, abcd.cs r8) {
        return new abcd.js(v5(), Zo(), r8, this.Zo, tp());
    }

    @Override
    public void j6(abcd.Tr.b r1) {
        r1.j6(this);
    }
}
