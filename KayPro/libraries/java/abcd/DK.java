package abcd;

public class DK {
    private int DW;
    private long[] j6;

    public DK() {
        this(10);
    }

    public DK(int r1) {
        this.j6 = new long[r1];
    }

    private void DW() {
        long[] r0 = this.j6;
        long[] r1 = new long[((r0.length + 16) * 3) / 2];
        java.lang.System.arraycopy(r0, 0, r1, 0, this.DW);
        this.j6 = r1;
    }

    public boolean DW(long r6) {
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r1 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r1 >= this.DW) { $pc0 = 5; continue $sw0; }
                    if (this.j6[r1] == r6) { $pc0 = 8; continue $sw0; }
                    r1 = r1 + 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 8: {
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public long j6(int r4) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.DW <= r4) { $pc1 = 7; continue $sw1; }
                    return this.j6[r4];
                }
                case 7: {
                    throw new java.lang.ArrayIndexOutOfBoundsException(r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        this.DW = 0;
    }

    public void j6(int r2, long r3) {
        int r0 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.DW;
                    if (r0 < r2) { $pc2 = 9; continue $sw2; }
                    if (r0 != r2) { $pc2 = 6; continue $sw2; }
                    j6(r3);
                    return;
                }
                case 6: {
                    this.j6[r2] = r3;
                    return;
                }
                case 9: {
                    throw new java.lang.ArrayIndexOutOfBoundsException(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(long r4) {
        long[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.DW != this.j6.length) { $pc3 = 5; continue $sw3; }
                    DW();
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    r0 = this.j6;
                    r1 = this.DW;
                    this.DW = r1 + 1;
                    r0[r1] = r4;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r0.append('[');
                    r1 = 0;
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r1 >= this.DW) { $pc4 = 5; continue $sw4; }
                    if (r1 <= 0) { $pc4 = 9; continue $sw4; }
                    r0.append(", ");
                    $pc4 = 9; continue $sw4;
                }
                case 9: {
                    r0.append(this.j6[r1]);
                    r1 = r1 + 1;
                    { $pc4 = 4; continue $sw4; }
                }
                case 5: {
                    r0.append(']');
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
