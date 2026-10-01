package abcd;

public class FM extends abcd.HL {
    private int FH;

    public FM() {
        this.FH = -1;
    }

    public FM(abcd.InterfaceqL r1) {
        super(r1);
        this.FH = -1;
    }

    public FM(abcd.rL r2) {
        super(r2, false);
        this.FH = -1;
    }

    public FM(abcd.InterfaceqL[] r2) {
        super(r2, false);
        this.FH = -1;
    }

    private int we() {
        int r0 = 0;
        java.util.Enumeration r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.FH >= 0) { $pc0 = 10; continue $sw0; }
                    r0 = 0;
                    r1 = u7();
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r1.hasMoreElements() == false) { $pc0 = 7; continue $sw0; }
                    r0 = r0 + ((abcd.InterfaceqL) r1.nextElement()).DW().gn().v5();
                    { $pc0 = 6; continue $sw0; }
                }
                case 7: {
                    this.FH = r0;
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    return this.FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    void j6(abcd.CL r4) {
        abcd.CL r0 = null;
        int r1 = 0;
        java.util.Enumeration r5 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = r4.DW();
                    r1 = we();
                    r4.j6(49);
                    r4.DW(r1);
                    r5 = u7();
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r5.hasMoreElements() == false) { $pc1 = 5; continue $sw1; }
                    r0.j6((abcd.InterfaceqL) r5.nextElement());
                    { $pc1 = 4; continue $sw1; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    int v5() {
        int r0 = we();
        return (abcd.OM.j6(r0) + 1) + r0;
    }
}
