package abcd;

public final class On {
    private final abcd.Sn[] DW;
    private final abcd.Sn[] FH;
    private final abcd.Sn[] j6;

    public On(abcd.fs r3) {
        int r0 = r3.j6().rN();
        this.j6 = new abcd.Sn[r0];
        this.DW = new abcd.Sn[r0];
        this.FH = new abcd.Sn[r0];
        j6(r3);
    }

    private void j6(abcd.fs r9) {
        abcd.Or r10 = null;
        int r0 = 0;
        int r2 = 0;
        abcd.Nr r3 = null;
        int r4 = 0;
        abcd.Tr r5 = null;
        abcd.hs r6 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r10 = r9.j6();
                    r0 = r10.size();
                    r2 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r2 >= r0) { $pc0 = 5; continue $sw0; }
                    r3 = r10.get(r2);
                    r4 = r3.DW();
                    r5 = r3.Hw().get(0);
                    this.j6[r4] = new abcd.Sn(r5.Zo());
                    r6 = r3.v5().Zo();
                    this.DW[r4] = new abcd.Sn(r6);
                    this.FH[r4] = new abcd.Sn(r6);
                    r2 = r2 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Sn DW(abcd.Nr r2) {
        return this.DW[r2.DW()];
    }

    public abcd.Sn FH(abcd.Nr r2) {
        return this.j6[r2.DW()];
    }

    public abcd.Sn j6(int r2) {
        return this.j6[r2];
    }

    public abcd.Sn j6(abcd.Nr r2) {
        return this.FH[r2.DW()];
    }
}
