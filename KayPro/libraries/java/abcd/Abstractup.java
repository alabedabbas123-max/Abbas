package abcd;

public abstract class Abstractup extends abcd.Abstractvp {
    private int j6;

    public Abstractup() {
        this.j6 = -1;
    }

    public final boolean J8() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.j6 < 0) { $pc0 = 5; continue $sw0; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final java.lang.String Ws() {
        return '[' + java.lang.Integer.toHexString(this.j6) + ']';
    }

    public final void j6(int r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.j6 != (-1)) { $pc1 = 7; continue $sw1; }
                    this.j6 = r3;
                    return;
                }
                case 7: {
                    throw new java.lang.RuntimeException("index already set");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final int we() {
        int r0 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.j6;
                    if (r0 < 0) { $pc2 = 6; continue $sw2; }
                    return r0;
                }
                case 6: {
                    throw new java.lang.RuntimeException("index not yet set");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
