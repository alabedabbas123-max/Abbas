package abcd;

class Mt implements abcd._t {
    final abcd.Nt DW;
    private int j6;

    Mt(abcd.Nt r2) {
        this.DW = r2;
        this.j6 = abcd.Ot.DW(this.DW.j6, 0);
    }

    @Override
    public boolean hasNext() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.j6 < 0) { $pc0 = 5; continue $sw0; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int next() {
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (hasNext() == false) { $pc1 = 7; continue $sw1; }
                    r0 = this.j6;
                    this.j6 = abcd.Ot.DW(this.DW.j6, r0 + 1);
                    return r0;
                }
                case 7: {
                    throw new java.util.NoSuchElementException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
