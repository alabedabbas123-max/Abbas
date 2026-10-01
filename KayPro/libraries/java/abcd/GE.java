package abcd;

class GE<T> implements ZD<T> {
    final abcd.IE DW;
    private final java.util.Iterator FH;

    private abcd.yE j6;

    GE(abcd.IE r1, java.util.Iterator r2) {
        this.DW = r1;
        this.FH = r2;
    }

    public abcd.yE DW() {
        return this.j6;
    }

    public abcd.FE FH() {
        return this.DW.Hw(this.j6, -1);
    }

    public void j6() {
    }

    public boolean next() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.FH.hasNext() == false) { $pc0 = 6; continue $sw0; }
                    this.j6 = (abcd.yE) this.FH.next();
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
