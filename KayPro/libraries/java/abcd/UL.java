package abcd;

public class UL extends abcd.FL {
    public UL() {
    }

    public UL(abcd.InterfaceqL r1) {
        super(r1);
    }

    public UL(abcd.rL r1) {
        super(r1);
    }

    @Override
    void j6(abcd.CL r3) {
        java.util.Enumeration r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r3.j6(48);
                    r3.j6(128);
                    r0 = u7();
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0.hasMoreElements() == false) { $pc0 = 5; continue $sw0; }
                    r3.j6((abcd.InterfaceqL) r0.nextElement());
                    { $pc0 = 4; continue $sw0; }
                }
                case 5: {
                    r3.j6(0);
                    r3.j6(0);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    int v5() {
        java.util.Enumeration r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = u7();
                    r1 = 0;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r0.hasMoreElements() == false) { $pc1 = 6; continue $sw1; }
                    r1 = r1 + ((abcd.InterfaceqL) r0.nextElement()).DW().v5();
                    { $pc1 = 4; continue $sw1; }
                }
                case 6: {
                    return (r1 + 2) + 2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
