package abcd;

public class tC extends abcd.CC {
    public static final abcd.tC j6 = null;
    protected final byte[] DW;
    protected final abcd.CK FH;

    static {
        j6 = new abcd.tC(new byte[0]);
    }

    public tC(byte[] r3) {
        this.DW = r3;
        byte[] r4 = this.DW;
        this.FH = abcd.IK.Hw(r4, 0, r4.length);
    }

    private int DW(int r2) {
        return this.FH.DW(r2 + 1);
    }

    private int j6(int r2) {
        return this.FH.DW(r2 + 2);
    }

    public static boolean j6(java.io.InputStream r4) {
        byte[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new byte[8000];
                    r1 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r1 >= r0.length) { $pc0 = 9; continue $sw0; }
                    r2 = r4.read(r0, r1, r0.length - r1);
                    if (r2 == (-1)) { $pc0 = 9; continue $sw0; }
                    r1 = r1 + r2;
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    return j6(r0, r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(byte[] r1) {
        return j6(r1, r1.length);
    }

    public static boolean j6(byte[] r3, int r4) {
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r4 <= 8000) { $pc1 = 5; continue $sw1; }
                    r4 = 8000;
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    r1 = 0;
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (r1 >= r4) { $pc1 = 7; continue $sw1; }
                    if (r3[r1] == 0) { $pc1 = 10; continue $sw1; }
                    r1 = r1 + 1;
                    { $pc1 = 6; continue $sw1; }
                }
                case 10: {
                    return true;
                }
                case 7: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean DW() {
        abcd.CK r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.FH;
                    r1 = r0.DW(r0.DW() - 1);
                    if (r1 != 0) { $pc2 = 6; continue $sw2; }
                    return true;
                }
                case 6: {
                    if (this.DW[r1 - 1] == 10) { $pc2 = 8; continue $sw2; }
                    return true;
                }
                case 8: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int j6() {
        return this.FH.DW() - 2;
    }

    public void j6(java.io.OutputStream r4, int r5) {
        int r0 = 0;
        int r6 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = DW(r5);
                    r6 = j6(r5);
                    if (this.DW[r6 - 1] != 10) { $pc3 = 5; continue $sw3; }
                    r6 = r6 - 1;
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    r4.write(this.DW, r0, r6 - r0);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
