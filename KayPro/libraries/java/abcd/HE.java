package abcd;

class HE<T> implements _D<T> {
    private long DW;
    final abcd.IE FH;
    private final java.util.Iterator Hw;

    private abcd.yE j6;

    HE(abcd.IE r1, java.util.Iterator r2) {
        this.FH = r1;
        this.Hw = r2;
    }

    public abcd.yE DW() {
        return this.j6;
    }

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    public abcd.yE Hw() {
        return this.j6;
    }

    public void j6() {
    }

    public boolean next() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.Hw.hasNext() == false) { $pc0 = 6; continue $sw0; }
                    this.j6 = (abcd.yE) this.Hw.next();
                    this.DW = this.FH.DW(this.j6, -1);
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public long v5() {
        return this.DW;
    }
}
