package abcd;

public abstract class Pr extends abcd.Tr {
    private final abcd.Abstractms v5;

    public Pr(abcd.es r1, abcd.hs r2, abcd.bs r3, abcd.cs r4, abcd.Abstractms r5) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(r1, r2, r3, r4);
                    if (r5 == null) { $pc0 = 7; continue $sw0; }
                    this.v5 = r5;
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("cst == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String FH() {
        return this.v5.aM();
    }

    @Override
    public boolean j6(abcd.Tr r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (super.j6(r2) == true) { $pc1 = 5; continue $sw1; }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    return false;
                }
                case 5: {
                    if (this.v5.equals(((abcd.Pr) r2).tp()) == false) { $pc1 = 7; continue $sw1; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Abstractms tp() {
        return this.v5;
    }
}
