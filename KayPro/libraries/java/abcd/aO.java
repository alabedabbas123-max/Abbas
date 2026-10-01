package abcd;

public class aO {
    private static final abcd.eO j6 = null;
    abcd.WM DW;
    abcd.UM FH;
    abcd.YN Hw;

    static {
        j6 = abcd.eO.j6;
    }

    public aO(abcd.YN r1, abcd.UM r2) {
        this.Hw = r1;
        this.FH = r2;
        this.DW = DW();
    }

    private abcd.WM DW() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    return abcd.WM.j6(this.FH.v5());
                }
                case 8: {
                    e = $ex0;
                    throw new abcd.XN("Malformed content.", e);
                }
                case 5: {
                    e = $ex0;
                    throw new abcd.XN("Malformed content.", e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.UM j6() {
        return this.FH;
    }
}
