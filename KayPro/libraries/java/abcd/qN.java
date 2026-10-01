package abcd;

public class qN extends abcd.AbstractyL {
    private abcd.InterfaceqL DW;
    private abcd.zL j6;

    private qN(abcd.FL r2) {
        this.j6 = (abcd.zL) r2.j6(0);
        this.DW = r2.j6(1);
    }

    public static abcd.qN j6(java.lang.Object r1) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r1 instanceof abcd.qN) == true) { $pc0 = 5; continue $sw0; }
                    if (r1 == null) { $pc0 = 10; continue $sw0; }
                    return new abcd.qN(abcd.FL.j6(r1));
                }
                case 10: {
                    throw new java.lang.IllegalArgumentException("null value in getInstance()");
                }
                case 5: {
                    return (abcd.qN) r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.EL DW() {
        abcd.rL r0 = new abcd.rL();
        r0.j6(this.j6);
        r0.j6(this.DW);
        return new abcd.tM(r0);
    }

    public abcd.InterfaceqL Zo() {
        return this.DW;
    }

    public abcd.zL v5() {
        return this.j6;
    }
}
