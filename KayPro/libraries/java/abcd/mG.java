package abcd;

public class mG extends abcd.AbstractiG {
    protected mG(abcd.YD r1) {
        super(r1);
    }

    @Override
    public final int aM() {
        return 2;
    }

    @Override
    void j6(abcd.qG r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2.DW.DW(this) == false) { $pc0 = 7; continue $sw0; }
                    this.EQ |= 1;
                    return;
                }
                case 7: {
                    throw new abcd.fD(this, aM());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
