package abcd;

public class ZL implements abcd.ML {
    private int DW;
    private abcd.JL FH;
    private boolean j6;

    ZL(boolean r1, int r2, abcd.JL r3) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
    }

    @Override
    public abcd.EL DW() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    return j6();
                }
                case 4: {
                    e = $ex0;
                    throw new abcd.DL(e.getMessage());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.EL j6() {
        return this.FH.j6(this.j6, this.DW);
    }
}
