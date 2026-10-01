package abcd;

class zE<V> implements java.util.Iterator<V> {
    private int DW;
    private int FH;

    private abcd.AE.a Hw;
    private int j6;
    final abcd.AE v5;

    zE(abcd.AE r1) {
        this.v5 = r1;
    }

    /* JADX WARN: Incorrect return type in method signature: (TV;)TV; */
    private abcd.AE.a j6(abcd.AE.a r2) {
        this.j6++;
        this.Hw = r2.tp;
        return r2;
    }

    @Override
    public boolean hasNext() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.j6 >= abcd.AE.j6(this.v5)) { $pc0 = 6; continue $sw0; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Incorrect return type in method signature: ()TV; */
    @Override
    public abcd.AE.a next() {
        abcd.AE.a r0 = null;
        abcd.AE.a[][] r1 = null;
        int r2 = 0;
        abcd.AE.a[] r3 = null;
        int r4 = 0;
        int r5 = 0;
        abcd.AE.a r6 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.Hw;
                    if (r0 == null) { $pc1 = 6; continue $sw1; }
                    j6(r0);
                    return r0;
                }
                case 6: {
                    r1 = abcd.AE.DW(this.v5);
                    r2 = this.DW;
                    r3 = r1[r2];
                    if (this.FH != r3.length) { $pc1 = 13; continue $sw1; }
                    r4 = r2 + 1;
                    this.DW = r4;
                    if (r4 >= (1 << abcd.AE.FH(this.v5))) { $pc1 = 12; continue $sw1; }
                    r3 = abcd.AE.DW(this.v5)[this.DW];
                    this.FH = 0;
                    { $pc1 = 13; continue $sw1; }
                }
                case 12: {
                    throw new java.util.NoSuchElementException();
                }
                case 13: {
                    r5 = this.FH;
                    if (r5 >= r3.length) { $pc1 = 6; continue $sw1; }
                    this.FH = r5 + 1;
                    r6 = r3[r5];
                    if (r6 == null) { $pc1 = 13; continue $sw1; }
                    j6(r6);
                    return r6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.Object next() {
        return next();
    }

    @Override
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
