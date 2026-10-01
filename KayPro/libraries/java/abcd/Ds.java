package abcd;

public abstract class Ds extends abcd.Ms {
    public Ds() {
    }

    public abstract boolean J8();

    public boolean VH() {
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (J8() == true) { $pc0 = 5; continue $sw0; }
                    return false;
                }
                case 5: {
                    r0 = Ws();
                    if (((short) r0) != r0) { $pc0 = 9; continue $sw0; }
                    return true;
                }
                case 9: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abstract int Ws();

    public abstract long lg();

    public boolean we() {
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (J8() == true) { $pc1 = 5; continue $sw1; }
                    return false;
                }
                case 5: {
                    r0 = Ws();
                    if (((byte) r0) != r0) { $pc1 = 9; continue $sw1; }
                    return true;
                }
                case 9: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
