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
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.j6 == null) { $pc0 = 6; continue $sw0; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public abcd.dG next() {
        abcd.dG r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    try {
                        r0 = this.j6;
                        this.j6 = this.DW.tp();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 4; continue $sw1; }
                        if ($t instanceof abcd.ZC) { $pc1 = 7; continue $sw1; }
                        if ($t instanceof abcd.fD) { $pc1 = 10; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r0;
                }
                case 7: {
                    e = $ex1;
                    throw new abcd.qD(e);
                }
                case 10: {
                    e = $ex1;
                    throw new abcd.qD(e);
                }
                case 4: {
                    e = $ex1;
                    throw new abcd.qD(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
