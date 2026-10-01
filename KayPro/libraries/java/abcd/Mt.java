package abcd;

class Mt implements abcd._t {
    final abcd.Nt DW;
    private int j6;

    Mt(abcd.Nt r2) {
        this.DW = r2;
        this.j6 = abcd.Ot.DW(this.DW.j6, 0);
    }

    @Override
    public boolean hasNext() {
        if (this.j6 < 0) goto L5;
        return true;
    L5:
        return false;
    }

    @Override
    public int next() {
        if (hasNext() == false) goto L7;
        int r0 = this.j6;
        this.j6 = abcd.Ot.DW(this.DW.j6, r0 + 1);
        return r0;
    L7:
        throw new java.util.NoSuchElementException();
    }
}
