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
        if (this.j6 >= abcd.AE.j6(this.v5)) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX WARN: Incorrect return type in method signature: ()TV; */
    @Override
    public abcd.AE.a next() {
        abcd.AE.a r0 = this.Hw;
        if (r0 == null) goto L6;
        j6(r0);
        return r0;
    L6:
        abcd.AE.a[][] r1 = abcd.AE.DW(this.v5);
        int r2 = this.DW;
        abcd.AE.a[] r3 = r1[r2];
        if (this.FH != r3.length) goto L13;
        int r4 = r2 + 1;
        this.DW = r4;
        if (r4 >= (1 << abcd.AE.FH(this.v5))) goto L12;
        r3 = abcd.AE.DW(this.v5)[this.DW];
        this.FH = 0;
        goto L13
    L12:
        throw new java.util.NoSuchElementException();
    L13:
        int r5 = this.FH;
        if (r5 >= r3.length) goto L6;
        this.FH = r5 + 1;
        abcd.AE.a r6 = r3[r5];
        if (r6 == null) goto L13;
        j6(r6);
        return r6;
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
