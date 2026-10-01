package abcd;

public class AA {
    protected final byte[] DW;
    protected final byte[] j6;

    public AA() {
        this.j6 = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
        this.DW = new byte[128];
        j6();
    }

    public int j6(byte[] r5, int r6, int r7, java.io.OutputStream r8) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r6;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0 >= (r6 + r7)) { $pc0 = 7; continue $sw0; }
                    r1 = r5[r0] & 255;
                    r8.write(this.j6[r1 >>> 4]);
                    r8.write(this.j6[r1 & 15]);
                    r0 = r0 + 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 7: {
                    return r7 * 2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected void j6() {
        int r0 = 0;
        byte[] r1 = null;
        byte[] r2 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = 0;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    r1 = this.j6;
                    if (r0 >= r1.length) { $pc1 = 6; continue $sw1; }
                    this.DW[r1[r0]] = (byte) r0;
                    r0 = r0 + 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 6: {
                    r2 = this.DW;
                    r2[65] = r2[97];
                    r2[66] = r2[98];
                    r2[67] = r2[99];
                    r2[68] = r2[100];
                    r2[69] = r2[101];
                    r2[70] = r2[102];
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
