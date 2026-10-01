package abcd;

public class lG extends abcd.AbstractiG {
    private byte[] J0;
    private java.lang.String J8;
    private abcd.AbstractiG we;

    protected lG(abcd.YD r1) {
        super(r1);
    }

    @Override
    public final int aM() {
        return 4;
    }

    public final abcd.AbstractiG j3() {
        return this.we;
    }

    @Override
    void j6(abcd.qG r2) {
        j6(r2, r2.j6(this));
    }

    void j6(abcd.qG r5, byte[] r6) {
        abcd.EK r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new abcd.EK();
                    r0.j6 = 53;
                    r1 = abcd.hE.j6(this, r6, (byte) 10, r0);
                    r5.FH.v5(r6, 7);
                    this.we = r5.j6(r5.FH, r1);
                    r2 = r0.j6 + 4;
                    r0.j6 = r2;
                    this.J8 = abcd.IK.j6(abcd.hE.Zo, r6, r2, abcd.IK.Zo(r6, r2) - 1);
                    if (r5.u7() == false) { $pc0 = 5; continue $sw0; }
                    this.J0 = r6;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    this.EQ |= 1;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
