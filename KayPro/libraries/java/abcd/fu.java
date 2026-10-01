package abcd;

class fu implements abcd._t {
    final abcd.gu DW;
    private int j6;

    fu(abcd.gu r1) {
        this.DW = r1;
        this.j6 = 0;
    }

    @Override
    public boolean hasNext() {
        if (this.j6 >= this.DW.j6.size()) goto L5;
        return true;
    L5:
        return false;
    }

    @Override
    public int next() {
        if (hasNext() == false) goto L7;
        abcd.au r0 = this.DW.j6;
        int r1 = this.j6;
        this.j6 = r1 + 1;
        return r0.get(r1);
    L7:
        throw new java.util.NoSuchElementException();
    }
}
