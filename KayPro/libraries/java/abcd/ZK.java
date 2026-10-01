package abcd;

public class ZK extends java.io.InputStream {
    private java.io.InputStream DW;
    private java.io.OutputStream FH;
    private byte[] j6;

    public ZK(java.io.InputStream r1, java.io.OutputStream r2) {
        this.DW = r1;
        this.FH = r2;
    }

    private byte[] j6() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.j6 != null) { $pc0 = 6; continue $sw0; }
                    this.j6 = new byte[2048];
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return this.j6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void close() {
        byte[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = j6();
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    r1 = this.DW.read(r0);
                    if (r1 <= 0) { $pc1 = 5; continue $sw1; }
                    this.FH.write(r0, 0, r1);
                    { $pc1 = 3; continue $sw1; }
                }
                case 5: {
                    this.FH.close();
                    this.DW.close();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int read() {
        byte[] r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = j6();
                    if (read(r0, 0, 1) == 1) { $pc2 = 7; continue $sw2; }
                    return -1;
                }
                case 7: {
                    return r0[0] & 255;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int read(byte[] r2, int r3, int r4) {
        int r5 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r4 != 0) { $pc3 = 5; continue $sw3; }
                    return 0;
                }
                case 5: {
                    r5 = this.DW.read(r2, r3, r4);
                    if (r5 <= 0) { $pc3 = 8; continue $sw3; }
                    this.FH.write(r2, r3, r5);
                    $pc3 = 8; continue $sw3;
                }
                case 8: {
                    return r5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public long skip(long r9) {
        byte[] r0 = null;
        long r3 = 0L;
        int r5 = 0;
        long r6 = 0L;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = j6();
                    r3 = 0;
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (0 >= r9) { $pc4 = 8; continue $sw4; }
                    r5 = this.DW.read(r0, 0, (int) java.lang.Math.min(r0.length, r9));
                    if (r5 <= 0) { $pc4 = 8; continue $sw4; }
                    this.FH.write(r0, 0, r5);
                    r6 = r5;
                    r3 = r3 + r6;
                    r9 = r9 - r6;
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
