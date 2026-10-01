package abcd;

class nG implements abcd.MF {
    private final java.util.Iterator DW;
    final abcd.qG j6;

    nG(abcd.qG r1, java.util.Iterator r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    @Override
    public void j6() {
    }

    @Override
    public abcd.AbstractiG next() {
        if (this.DW.hasNext() == true) goto L7;
        return null;
    L7:
        return (abcd.AbstractiG) this.DW.next();
    }
}
