package abcd;

public final class Ey implements abcd.Fy {
    private static int[] j6;
    private int DW;

    static {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    j6 = new int[256];
                    r1 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r1 >= 256) { $pc0 = 4; continue $sw0; }
                    r2 = 8;
                    r3 = r1;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    r2 = r2 - 1;
                    if (r2 < 0) { $pc0 = 8; continue $sw0; }
                    if ((r3 & 1) != 0) { $pc0 = 11; continue $sw0; }
                    r3 = r3 >>> 1;
                    { $pc0 = 6; continue $sw0; }
                }
                case 11: {
                    r3 = (r3 >>> 1) ^ (-306674912);
                    { $pc0 = 6; continue $sw0; }
                }
                case 8: {
                    j6[r1] = r3;
                    r1 = r1 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 4: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public Ey() {
        this.DW = 0;
    }

    @Override
    public long getValue() {
        return ((long) this.DW) & 4294967295L;
    }

    @Override
    public void j6(long r3) {
        this.DW = (int) (r3 & 4294967295L);
    }

    @Override
    public void reset() {
        this.DW = 0;
    }

    @Override
    public void update(byte[] r4, int r5, int r6) {
        int r0 = 0;
        int r2 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.DW ^ (-1);
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    r6 = r6 - 1;
                    if (r6 < 0) { $pc1 = 5; continue $sw1; }
                    r2 = r5 + 1;
                    r0 = (r0 >>> 8) ^ j6[(r4[r5] ^ r0) & 255];
                    r5 = r2;
                    { $pc1 = 3; continue $sw1; }
                }
                case 5: {
                    this.DW = r0 ^ (-1);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
