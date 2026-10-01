package abcd;

public class PL implements abcd.InterfacenL {
    private final abcd.JL DW;
    private final int j6;

    PL(int r1, abcd.JL r2) {
        this.j6 = r1;
        this.DW = r2;
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
                    throw new abcd.DL(e.getMessage(), e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.EL j6() {
        return new abcd.OL(this.j6, this.DW.DW());
    }
}
