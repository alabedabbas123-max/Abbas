package abcd;

public class qM implements abcd.BL {
    private abcd.HM j6;

    qM(abcd.HM r1) {
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
                    throw new abcd.DL("IOException converting stream to byte array: " + e.getMessage(), e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.io.InputStream FH() {
        return this.j6;
    }

    @Override
    public abcd.EL j6() {
        return new abcd.pM(this.j6.DW());
    }
}
