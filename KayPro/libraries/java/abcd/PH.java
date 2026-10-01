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
        if (this.DW == null) goto L6;
        return true;
    L6:
        if (this.j6.hasNext() == false) goto L7;
        this.DW = this.j6.next().get();
        if (this.DW != null) goto L11;
        this.j6.remove();
        goto L6
    L11:
        return true;
    L7:
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public abcd.TH next() {
        if (hasNext() == false) goto L7;
        abcd.TH r0 = this.DW;
        this.DW = null;
        return r0;
    L7:
        throw new java.util.NoSuchElementException();
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
