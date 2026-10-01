package abcd;

public class gM implements abcd.InterfaceqL, abcd.IM {
    private abcd.JL j6;

    public gM(abcd.JL r1) {
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
                case 8: {
                    e = $ex0;
                    throw new abcd.DL("unable to get DER object", e);
                }
                case 5: {
                    e = $ex0;
                    throw new abcd.DL("unable to get DER object", e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.EL j6() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    return new abcd.fM(this.j6.DW());
                }
                case 4: {
                    e = $ex1;
                    throw new abcd.tL(e.getMessage(), e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
