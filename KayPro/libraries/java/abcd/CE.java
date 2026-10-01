package abcd;

class CE<V> implements java.util.Iterator<V> {
    private int DW;
    final abcd.DE FH;
    private int j6;

    CE(abcd.DE r1) {
        this.FH = r1;
    }

    @Override
    public boolean hasNext() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.j6 >= abcd.DE.j6(this.FH)) { $pc0 = 6; continue $sw0; }
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
    public abcd.yE next() {
        abcd.yE[] r0 = null;
        int r1 = 0;
        abcd.yE r2 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 3: {
                    if (this.DW >= abcd.DE.DW(this.FH).length) { $pc1 = 9; continue $sw1; }
                    r0 = abcd.DE.DW(this.FH);
                    r1 = this.DW;
                    this.DW = r1 + 1;
                    r2 = r0[r1];
                    if (r2 == null) { $pc1 = 3; continue $sw1; }
                    this.j6++;
                    return r2;
                }
                case 9: {
                    throw new java.util.NoSuchElementException();
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
