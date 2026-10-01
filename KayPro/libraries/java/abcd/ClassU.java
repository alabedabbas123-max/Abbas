package abcd;

public class ClassU<T> implements t<T> {
    private int DW;
    private final java.lang.Object[] j6;

    public ClassU(int r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 <= 0) { $pc0 = 7; continue $sw0; }
                    this.j6 = new java.lang.Object[r2];
                    return;
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("The max pool size must be > 0");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean DW(T r4) {
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r1 = 0;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r1 >= this.DW) { $pc1 = 10; continue $sw1; }
                    if (this.j6[r1] == r4) { $pc1 = 7; continue $sw1; }
                    r1 = r1 + 1;
                    { $pc1 = 4; continue $sw1; }
                }
                case 7: {
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(T r4) {
        int r0 = 0;
        java.lang.Object[] r1 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (DW(r4) == true) { $pc2 = 11; continue $sw2; }
                    r0 = this.DW;
                    r1 = this.j6;
                    if (r0 >= r1.length) { $pc2 = 8; continue $sw2; }
                    r1[r0] = r4;
                    this.DW = r0 + 1;
                    return true;
                }
                case 8: {
                    return false;
                }
                case 11: {
                    throw new java.lang.IllegalStateException("Already in the pool!");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
