package abcd;

public abstract class CF extends abcd.AbstractwF {
    private abcd.mG gn;

    protected CF(abcd.UE r1) {
        super(r1);
    }

    public void DW(abcd.YD r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 == null) { $pc0 = 4; continue $sw0; }
                    this.gn = this.FH.gn(r2);
                    return;
                }
                case 4: {
                    this.gn = null;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean j6(abcd.YD... r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r3.length == 2) { $pc1 = 7; continue $sw1; }
                    return false;
                }
                case 7: {
                    return super.j6(r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abcd.TJ v5() {
        abcd.mG r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.gn;
                    if (r0 == null) { $pc2 = 7; continue $sw2; }
                    return j6(r0);
                }
                case 7: {
                    return DW(0, 1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
