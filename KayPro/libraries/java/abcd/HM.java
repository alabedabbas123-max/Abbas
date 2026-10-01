package abcd;

class HM extends abcd.MM {
    private static final byte[] FH = null;
    private final int Hw;
    private int v5;

    static {
        FH = new byte[0];
    }

    HM(java.io.InputStream r1, int r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(r1, r2);
                    if (r2 < 0) { $pc0 = 9; continue $sw0; }
                    this.Hw = r2;
                    this.v5 = r2;
                    if (r2 != 0) { $pc0 = 10; continue $sw0; }
                    j6(true);
                    return;
                }
                case 10: {
                    return;
                }
                case 9: {
                    throw new java.lang.IllegalArgumentException("negative lengths not allowed");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    byte[] DW() {
        int r0 = 0;
        byte[] r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.v5;
                    if (r0 == 0) { $pc1 = 5; continue $sw1; }
                    r1 = new byte[r0];
                    r2 = r0 - abcd.XP.j6(this.j6, r1);
                    this.v5 = r2;
                    if (r2 != 0) { $pc1 = 11; continue $sw1; }
                    j6(true);
                    return r1;
                }
                case 11: {
                    throw new java.io.EOFException("DEF length " + this.Hw + " object truncated by " + this.v5);
                }
                case 5: {
                    return FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    int j6() {
        return this.v5;
    }

    @Override
    public int read() {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.v5 != 0) { $pc2 = 6; continue $sw2; }
                    return -1;
                }
                case 6: {
                    r0 = this.j6.read();
                    if (r0 < 0) { $pc2 = 13; continue $sw2; }
                    r1 = this.v5 - 1;
                    this.v5 = r1;
                    if (r1 != 0) { $pc2 = 11; continue $sw2; }
                    j6(true);
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    return r0;
                }
                case 13: {
                    throw new java.io.EOFException("DEF length " + this.Hw + " object truncated by " + this.v5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int read(byte[] r2, int r3, int r4) {
        int r0 = 0;
        int r5 = 0;
        int r6 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.v5;
                    if (r0 != 0) { $pc3 = 6; continue $sw3; }
                    return -1;
                }
                case 6: {
                    r5 = this.j6.read(r2, r3, java.lang.Math.min(r4, r0));
                    if (r5 < 0) { $pc3 = 13; continue $sw3; }
                    r6 = this.v5 - r5;
                    this.v5 = r6;
                    if (r6 != 0) { $pc3 = 11; continue $sw3; }
                    j6(true);
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    return r5;
                }
                case 13: {
                    throw new java.io.EOFException("DEF length " + this.Hw + " object truncated by " + this.v5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
