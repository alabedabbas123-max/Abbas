package abcd;

class tF implements java.util.Iterator<abcd.qF> {
    final abcd.uF DW;
    int j6;

    tF(abcd.uF r1) {
        this.DW = r1;
    }

    @Override
    public boolean hasNext() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.j6 >= abcd.uF.j6(this.DW).DW()) { $pc0 = 6; continue $sw0; }
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
    public abcd.qF next() {
        abcd.qF.a[] r0 = abcd.uF.j6();
        abcd.CK r1 = abcd.uF.j6(this.DW);
        int r2 = this.j6;
        this.j6 = r2 + 1;
        abcd.qF.a r3 = r0[r1.DW(r2)];
        abcd.CK r4 = abcd.uF.j6(this.DW);
        int r5 = this.j6;
        this.j6 = r5 + 1;
        int r6 = r4.DW(r5);
        abcd.CK r7 = abcd.uF.j6(this.DW);
        int r8 = this.j6;
        this.j6 = r8 + 1;
        int r9 = r7.DW(r8);
        abcd.CK r10 = abcd.uF.j6(this.DW);
        int r11 = this.j6;
        this.j6 = r11 + 1;
        return new abcd.qF(r6, r9, r10.DW(r11), r3);
    }

    @Override
    public abcd.qF next() {
        return next();
    }

    @Override
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
