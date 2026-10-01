package abcd;

public final class mC<S extends abcd.CC> extends DC<lC<S>> {
    private final DC<? super S> j6;

    mC(DC<? super S> r1) {
        this.j6 = r1;
    }

    public int j6(abcd.CC r1, int r2) {
        return j6((abcd.lC) r1, r2);
    }

    public int j6(lC<S> r1, int r2) {
        return r1.DW[r2];
    }

    public boolean j6(abcd.CC r1, int r2, abcd.CC r3, int r4) {
        return j6((abcd.lC) r1, r2, (abcd.lC) r3, r4);
    }

    public boolean j6(lC<S> r3, int r4, lC<S> r5, int r6) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r3.DW[r4] == r5.DW[r6]) { $pc0 = 5; continue $sw0; }
                    return false;
                }
                case 5: {
                    if (this.j6.j6(r3.j6, r4, r5.j6, r6) == false) { $pc0 = 10; continue $sw0; }
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
