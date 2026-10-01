package abcd;

public class CK {
    private int DW;
    private int[] j6;

    public CK() {
        this(10);
    }

    public CK(int r1) {
        this.j6 = new int[r1];
    }

    private void FH() {
        int[] r0 = this.j6;
        int[] r1 = new int[((r0.length + 16) * 3) / 2];
        java.lang.System.arraycopy(r0, 0, r1, 0, this.DW);
        this.j6 = r1;
    }

    public int DW() {
        return this.DW;
    }

    public int DW(int r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.DW <= r2) { $pc0 = 7; continue $sw0; }
                    return this.j6[r2];
                }
                case 7: {
                    throw new java.lang.ArrayIndexOutOfBoundsException(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW(int r2, int r3) {
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.DW;
                    if (r0 < r2) { $pc1 = 9; continue $sw1; }
                    if (r0 != r2) { $pc1 = 6; continue $sw1; }
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

    public void j6() {
        this.DW = 0;
    }

    public void j6(int r4) {
        int[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.DW != this.j6.length) { $pc2 = 5; continue $sw2; }
                    FH();
                    $pc2 = 5; continue $sw2;
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

    public void j6(int r2, int r3) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 3: {
                    if (this.DW >= r2) { $pc3 = 4; continue $sw3; }
                    j6(r3);
                    { $pc3 = 3; continue $sw3; }
                }
                case 4: {
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
