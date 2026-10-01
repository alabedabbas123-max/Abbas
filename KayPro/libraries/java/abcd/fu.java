package abcd;

class fu implements abcd._t {
    final abcd.gu DW;
    private int j6;

    fu(abcd.gu r1) {
        this.DW = r1;
        this.j6 = 0;
    }

    @Override
    public boolean hasNext() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.j6 >= this.DW.j6.size()) { $pc0 = 5; continue $sw0; }
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
        abcd.au r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (hasNext() == false) { $pc1 = 7; continue $sw1; }
                    r0 = this.DW.j6;
                    r1 = this.j6;
                    this.j6 = r1 + 1;
                    return r0.get(r1);
                }
                case 7: {
                    throw new java.util.NoSuchElementException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
