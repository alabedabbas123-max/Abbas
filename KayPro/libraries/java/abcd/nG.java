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
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.DW.hasNext() == true) { $pc0 = 7; continue $sw0; }
                    return null;
                }
                case 7: {
                    return (abcd.AbstractiG) this.DW.next();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
