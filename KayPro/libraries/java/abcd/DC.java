package abcd;

public abstract class DC<S extends abcd.CC> {
    public DC() {
    }

    public abstract int j6(S r1, int r2);

    public abcd.jC j6(S r4, S r5, abcd.jC r6) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r7 = 0;
        int r8 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 2;
        $sw0: while (true) {
            switch ($pc0) {
                case 2: {
                    r0 = r6.j6;
                    if (r0 >= r6.DW) { $pc0 = 10; continue $sw0; }
                    r1 = r6.FH;
                    if (r1 >= r6.Hw) { $pc0 = 10; continue $sw0; }
                    if (j6(r4, r0, r5, r1) == false) { $pc0 = 10; continue $sw0; }
                    r6.j6++;
                    r6.FH++;
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    r2 = r6.j6;
                    r3 = r6.DW;
                    if (r2 >= r3) { $pc0 = 18; continue $sw0; }
                    r7 = r6.FH;
                    r8 = r6.Hw;
                    if (r7 >= r8) { $pc0 = 18; continue $sw0; }
                    if (j6(r4, r3 - 1, r5, r8 - 1) == false) { $pc0 = 18; continue $sw0; }
                    r6.DW--;
                    r6.Hw--;
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    return r6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract boolean j6(S r1, int r2, S r3, int r4);
}
