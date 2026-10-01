package abcd;

public abstract class Cs extends abcd.Ds {
    private final long j6;

    Cs(long r1) {
        this.j6 = r1;
    }

    @Override
    protected int DW(abcd.Abstractms r5) {
        long r0 = 0L;
        long r2 = 0L;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = ((abcd.Cs) r5).j6;
                    r2 = this.j6;
                    if (r2 >= r0) { $pc0 = 7; continue $sw0; }
                    return -1;
                }
                case 7: {
                    if (r2 <= r0) { $pc0 = 10; continue $sw0; }
                    return 1;
                }
                case 10: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public final boolean Hw() {
        return true;
    }

    @Override
    public final boolean J8() {
        long r0 = 0L;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.j6;
                    if (((int) r0) != r0) { $pc1 = 5; continue $sw1; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public final int Ws() {
        return (int) this.j6;
    }

    public final boolean equals(java.lang.Object r5) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r5 != null) { $pc2 = 4; continue $sw2; }
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    return false;
                }
                case 4: {
                    if (getClass() != r5.getClass()) { $pc2 = 8; continue $sw2; }
                    if (this.j6 != ((abcd.Cs) r5).j6) { $pc2 = 8; continue $sw2; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final int hashCode() {
        long r0 = this.j6;
        return ((int) r0) ^ ((int) (r0 >> 32));
    }

    @Override
    public final long lg() {
        return this.j6;
    }
}
