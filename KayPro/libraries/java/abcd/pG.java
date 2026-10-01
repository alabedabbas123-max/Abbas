package abcd;

class pG implements java.util.Iterator<abcd.dG> {
    final abcd.qG DW;
    abcd.dG j6;

    pG(abcd.qG r1, abcd.dG r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    @Override
    public boolean hasNext() {
        if (this.j6 == null) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public abcd.dG next() {
        abcd.dG r0 = this.j6;     // Catch: java.io.IOException -> L4 abcd.ZC -> L7 abcd.fD -> L10
        this.j6 = this.DW.tp();     // Catch: java.io.IOException -> L4 abcd.ZC -> L7 abcd.fD -> L10
        return r0;
    L7:
        e = move-exception;
        throw new abcd.qD(e);
    L10:
        e = move-exception;
        throw new abcd.qD(e);
    L4:
        e = move-exception;
        throw new abcd.qD(e);
    }

    @Override
    public abcd.dG next() {
        return next();
    }

    @Override
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
