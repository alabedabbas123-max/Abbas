package abcd;

public abstract class Bs extends abcd.Ds {
    private final int j6;

    Bs(int r1) {
        this.j6 = r1;
    }

    @Override
    protected int DW(abcd.Abstractms r2) {
        int r3 = 0;
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r3 = ((abcd.Bs) r2).j6;
                    r0 = this.j6;
                    if (r0 >= r3) { $pc0 = 6; continue $sw0; }
                    return -1;
                }
                case 6: {
                    if (r0 <= r3) { $pc0 = 9; continue $sw0; }
                    return 1;
                }
                case 9: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public final boolean Hw() {
        return false;
    }

    @Override
    public final boolean J8() {
        return true;
    }

    @Override
    public final int Ws() {
        return this.j6;
    }

    public final boolean equals(java.lang.Object r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r3 != null) { $pc1 = 4; continue $sw1; }
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    return false;
                }
                case 4: {
                    if (getClass() != r3.getClass()) { $pc1 = 8; continue $sw1; }
                    if (this.j6 != ((abcd.Bs) r3).j6) { $pc1 = 8; continue $sw1; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final int hashCode() {
        return this.j6;
    }

    @Override
    public final long lg() {
        return this.j6;
    }
}
