package abcd;

public class nC<S extends abcd.CC> {
    private final S DW;
    private final S FH;
    private lC<S> Hw;
    private final DC<? super S> j6;
    private lC<S> v5;

    public nC(DC<? super S> r1, S r2, S r3) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
    }

    private lC<S> j6(S r5) {
        int r0 = 0;
        int[] r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r5.j6();
                    r1 = new int[r0];
                    r2 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r2 >= r0) { $pc0 = 5; continue $sw0; }
                    r1[r2] = this.j6.j6(r5, r2);
                    r2 = r2 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    return new abcd.lC(r5, r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public lC<S> DW() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.v5 != null) { $pc1 = 6; continue $sw1; }
                    this.v5 = j6(this.FH);
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return this.v5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public mC<S> FH() {
        return new abcd.mC(this.j6);
    }

    public lC<S> j6() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.Hw != null) { $pc2 = 6; continue $sw2; }
                    this.Hw = j6(this.DW);
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    return this.Hw;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
