package abcd;

class At implements abcd.ot.b {
    final abcd.Bt.a j6;

    At(abcd.Bt.a r1) {
        this.j6 = r1;
    }

    @Override
    public void j6(abcd.ot r4) {
        int r0 = 0;
        abcd.bs r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r4.rN();
                    if (abcd.Bt.DW(this.j6.Zo, r0) == false) { $pc0 = 5; continue $sw0; }
                    return;
                }
                case 5: {
                    r1 = abcd.Bt.a.DW(this.j6)[r0];
                    if (abcd.Bt.FH(this.j6.Zo, r1.we()) == true) { $pc0 = 9; continue $sw0; }
                    r4.j6(r1, abcd.Bt.a.j6(this.j6));
                    return;
                }
                case 9: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
