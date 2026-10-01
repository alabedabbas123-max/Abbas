package abcd;

class PH implements java.util.Iterator<abcd.TH> {
    private abcd.TH DW;
    final abcd.QH FH;
    private final java.util.Iterator<java.lang.ref.WeakReference<abcd.TH>> j6;

    PH(abcd.QH r1) {
        this.FH = r1;
        this.j6 = abcd.TH.DW().keySet().iterator();
    }

    @Override
    public boolean hasNext() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.DW == null) { $pc0 = 6; continue $sw0; }
                    return true;
                }
                case 6: {
                    if (this.j6.hasNext() == false) { $pc0 = 7; continue $sw0; }
                    this.DW = this.j6.next().get();
                    if (this.DW != null) { $pc0 = 11; continue $sw0; }
                    this.j6.remove();
                    { $pc0 = 6; continue $sw0; }
                }
                case 11: {
                    return true;
                }
                case 7: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public abcd.TH next() {
        abcd.TH r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (hasNext() == false) { $pc1 = 7; continue $sw1; }
                    r0 = this.DW;
                    this.DW = null;
                    return r0;
                }
                case 7: {
                    throw new java.util.NoSuchElementException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.TH next() {
        return next();
    }

    @Override
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
