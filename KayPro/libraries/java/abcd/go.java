package abcd;

public final class go {
    private java.util.ArrayList<abcd.AbstractVn> DW;
    private final abcd.ho j6;

    public go(abcd.Fn r2, int r3, int r4, int r5) {
        this.j6 = new abcd.ho(r2, r3, r5);
        this.DW = new java.util.ArrayList(r4);
    }

    private void DW() {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.DW.size();
                    r1 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r1 >= r0) { $pc0 = 5; continue $sw0; }
                    this.j6.j6(this.DW.get(r1));
                    r1 = r1 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    this.DW = null;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(abcd.AbstractVn r2) {
        this.DW.add(r2);
    }

    public abcd.ho j6() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.DW == null) { $pc1 = 7; continue $sw1; }
                    DW();
                    return this.j6;
                }
                case 7: {
                    throw new java.lang.UnsupportedOperationException("already processed");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r2, abcd.Sn r3) {
        this.j6.j6(r2, r3);
    }

    public void j6(abcd.AbstractVn r2) {
        this.j6.j6(r2);
    }
}
