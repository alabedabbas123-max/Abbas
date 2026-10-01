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
        if (this.Hw.hasNext() == false) goto L6;
        this.j6 = (abcd.yE) this.Hw.next();
        this.DW = this.FH.DW(this.j6, -1);
        return true;
    L6:
        return false;
    }

    public long v5() {
        return this.DW;
    }
}
