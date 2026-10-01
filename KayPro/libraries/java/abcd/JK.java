package abcd;

class JK implements java.util.Iterator<abcd.ME> {
    final abcd.KK DW;
    private int j6;

    JK(abcd.KK r1) {
        this.DW = r1;
    }

    @Override
    public boolean hasNext() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.j6 >= abcd.KK.j6(this.DW)) { $pc0 = 6; continue $sw0; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public abcd.ME next() {
        abcd.ME[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.j6 >= abcd.KK.j6(this.DW)) { $pc1 = 7; continue $sw1; }
                    r0 = abcd.KK.DW(this.DW);
                    r1 = this.j6;
                    this.j6 = r1 + 1;
                    return r0[r1];
                }
                case 7: {
                    throw new java.util.NoSuchElementException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.ME next() {
        return next();
    }

    @Override
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
