package abcd;

public final class Cdo extends abcd.Abstractro {
    private final abcd.ds v5;

    public Cdo(abcd.hs r1, abcd.ds r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(r1);
                    if (r2 == null) { $pc0 = 7; continue $sw0; }
                    this.v5 = r2;
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("locals == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.AbstractVn DW(int r4) {
        return new abcd.Cdo(VH(), this.v5.DW(r4));
    }

    @Override
    public abcd.AbstractVn j6(abcd.cs r3) {
        return new abcd.Cdo(VH(), this.v5);
    }

    @Override
    protected java.lang.String j6() {
        return this.v5.toString();
    }

    @Override
    protected java.lang.String j6(boolean r5) {
        int r6 = 0;
        int r0 = 0;
        java.lang.StringBuffer r1 = null;
        int r7 = 0;
        abcd.bs r2 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r6 = this.v5.size();
                    r0 = this.v5.lg();
                    r1 = new java.lang.StringBuffer((r6 * 40) + 100);
                    r1.append("local-snapshot");
                    r7 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r7 >= r0) { $pc1 = 9; continue $sw1; }
                    r2 = this.v5.get(r7);
                    if (r2 == null) { $pc1 = 7; continue $sw1; }
                    r1.append("\n  ");
                    r1.append(abcd.eo.j6(r2));
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    r7 = r7 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 9: {
                    return r1.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.ds we() {
        return this.v5;
    }
}
