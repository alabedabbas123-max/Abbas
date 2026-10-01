package abcd;

class RL implements java.util.Enumeration {
    final abcd.SL DW;
    int j6;

    RL(abcd.SL r1) {
        this.DW = r1;
        this.j6 = 0;
    }

    @Override
    public boolean hasMoreElements() {
        if (this.j6 >= abcd.SL.j6(this.DW).length) goto L6;
        return true;
    L6:
        return false;
    }

    @Override
    public java.lang.Object nextElement() {
        abcd.AL[] r0 = abcd.SL.j6(this.DW);
        int r1 = this.j6;
        this.j6 = r1 + 1;
        return r0[r1];
    }
}
