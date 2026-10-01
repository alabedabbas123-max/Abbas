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
        if (this.j6 >= abcd.DE.j6(this.FH)) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX WARN: Incorrect return type in method signature: ()TV; */
    @Override
    public abcd.yE next() {
    L3:
        if (this.DW >= abcd.DE.DW(this.FH).length) goto L9;
        abcd.yE[] r0 = abcd.DE.DW(this.FH);
        int r1 = this.DW;
        this.DW = r1 + 1;
        abcd.yE r2 = r0[r1];
        if (r2 == null) goto L3;
        this.j6++;
        return r2;
    L9:
        throw new java.util.NoSuchElementException();
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
