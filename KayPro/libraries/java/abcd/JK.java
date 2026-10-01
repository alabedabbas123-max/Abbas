package abcd;

class JK implements java.util.Iterator<abcd.ME> {
    final abcd.KK DW;
    private int j6;

    JK(abcd.KK r1) {
        this.DW = r1;
    }

    @Override
    public boolean hasNext() {
        if (this.j6 >= abcd.KK.j6(this.DW)) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public abcd.ME next() {
        if (this.j6 >= abcd.KK.j6(this.DW)) goto L7;
        abcd.ME[] r0 = abcd.KK.DW(this.DW);
        int r1 = this.j6;
        this.j6 = r1 + 1;
        return r0[r1];
    L7:
        throw new java.util.NoSuchElementException();
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
