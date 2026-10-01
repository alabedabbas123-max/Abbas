package abcd;

abstract class CG {
    protected final long DW;
    protected final long FH;
    protected final abcd.aH j6;

    protected CG(abcd.aH r1, long r2, int r4) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = this.DW + ((long) r4);
    }

    final int j6() {
        return (int) (this.FH - this.DW);
    }

    protected abstract int j6(int r1, java.util.zip.Inflater r2);

    protected abstract int j6(int r1, byte[] r2, int r3, int r4);

    final int j6(long r3, java.util.zip.Inflater r5) {
        return j6((int) (r3 - this.DW), r5);
    }

    final int j6(long r3, byte[] r5, int r6, int r7) {
        return j6((int) (r3 - this.DW), r5, r6, r7);
    }

    abstract void j6(abcd.OH r1, long r2, int r4, java.security.MessageDigest r5);

    final boolean j6(abcd.aH r3, long r4) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.j6 == r3) { $pc0 = 5; continue $sw0; }
                    return false;
                }
                case 5: {
                    if (this.DW <= r4) { $pc0 = 7; continue $sw0; }
                    return false;
                }
                case 7: {
                    if (r4 >= this.FH) { $pc0 = 13; continue $sw0; }
                    return true;
                }
                case 13: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
