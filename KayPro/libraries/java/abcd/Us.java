package abcd;

class Us implements java.util.Comparator<abcd.Abstractms> {
    final abcd.Ws DW;
    final java.util.HashMap j6;

    Us(abcd.Ws r1, java.util.HashMap r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public int compare(abcd.Abstractms r1, abcd.Abstractms r2) {
        return j6(r1, r2);
    }

    @Override
    public boolean equals(java.lang.Object r1) {
        if (r1 != this) goto L4;
        return true;
    L4:
        return false;
    }

    public int j6(abcd.Abstractms r3, abcd.Abstractms r4) {
        int r0 = ((java.lang.Integer) this.j6.get(r4)).intValue() - ((java.lang.Integer) this.j6.get(r3)).intValue();
        if (r0 == 0) goto L5;
        return r0;
    L5:
        return r3.j6(r4);
    }
}
