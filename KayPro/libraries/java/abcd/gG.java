package abcd;

class gG implements java.util.Iterator<abcd.fG> {
    final abcd.hG DW;
    private final java.util.Iterator FH;
    private abcd.fG j6;

    gG(abcd.hG r1, java.util.Iterator r2) {
        this.DW = r1;
        this.FH = r2;
    }

    @Override
    public boolean hasNext() {
        return this.FH.hasNext();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public abcd.fG next() {
        abcd.fG r0 = (abcd.fG) this.FH.next();
        this.j6 = r0;
        return r0;
    }

    @Override
    public abcd.fG next() {
        return next();
    }

    @Override
    public void remove() {
        this.DW.j6 &= this.j6.Hw ^ (-1);
        this.FH.remove();
    }
}
