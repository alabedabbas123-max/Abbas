package abcd;

public class EI {
    private static final byte[] j6 = null;
    private final java.io.OutputStream DW;
    private final byte[] FH;
    private boolean Hw;

    static {
        j6 = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    }

    public EI(java.io.OutputStream r1) {
        this.DW = r1;
        this.FH = new byte[5];
        this.Hw = true;
    }

    private void j6(int r2) {
        j6(this.FH, r2);
    }

    static void j6(byte[] r4, int r5) {
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = 3;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r0 < 0) { $pc0 = 7; continue $sw0; }
                    if (r5 == 0) { $pc0 = 7; continue $sw0; }
                    r4[r0] = j6[r5 & 15];
                    r5 = r5 >>> 4;
                    r0 = r0 - 1;
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r0 < 0) { $pc0 = 8; continue $sw0; }
                    r4[r0] = 48;
                    r0 = r0 - 1;
                    { $pc0 = 7; continue $sw0; }
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW() {
        this.DW.flush();
    }

    public void j6() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    j6(0);
                    this.DW.write(this.FH, 0, 4);
                    if (this.Hw == false) { $pc1 = 6; continue $sw1; }
                    DW();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.lang.String r1) {
        j6(abcd.hE.j6(r1));
    }

    public void j6(boolean r1) {
        this.Hw = r1;
    }

    public void j6(byte[] r5) {
        j6(r5.length + 4);
        this.DW.write(this.FH, 0, 4);
        this.DW.write(r5);
    }
}
