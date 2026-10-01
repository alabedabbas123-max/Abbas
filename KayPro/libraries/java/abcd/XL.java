package abcd;

public class XL implements abcd.IL {
    private abcd.JL j6;

    XL(abcd.JL r1) {
        this.j6 = r1;
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
        return new abcd.WL(this.j6.DW());
    }
}
