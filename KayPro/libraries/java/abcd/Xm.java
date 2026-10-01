package abcd;

class Xm implements abcd.Nr.a {
    final abcd.Zm DW;
    final abcd.au j6;

    Xm(abcd.Zm r1, abcd.au r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public void j6(abcd.Nr r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (abcd.Zm.j6(this.DW, r2) == false) { $pc0 = 6; continue $sw0; }
                    this.j6.DW(r2.DW());
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
