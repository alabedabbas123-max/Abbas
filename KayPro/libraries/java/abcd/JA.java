package abcd;

public class JA extends java.io.InputStream {
    int DW;
    int FH;
    abcd.InterfacetA Hw;
    java.io.OutputStream VH;
    boolean Zo;
    java.io.RandomAccessFile j6;
    boolean v5;

    public JA(abcd.IA r7) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.Zo = false;
                    this.VH = null;
                    this.Hw = abcd.uA.j6(abcd.JA.class.getName());
                    this.v5 = this.Hw.isDebugEnabled();
                    this.FH = 0;
                    this.DW = r7.j6();
                    this.j6 = r7.aM().FH;
                    if (r7.gn() >= 0) { $pc0 = 5; continue $sw0; }
                    r7.Mr();
                    return;
                }
                case 5: {
                    if (this.v5 == false) { $pc0 = 7; continue $sw0; }
                    this.Hw.FH(java.lang.String.format("Seeking to %d", new java.lang.Object[]{java.lang.Long.valueOf(r7.gn())}));
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    this.j6.seek(r7.gn());
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int j6(byte[] r6, int r7, int r8) {
        int r0 = 0;
        java.io.OutputStream r3 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((this.DW - this.FH) == 0) { $pc1 = 5; continue $sw1; }
                    r0 = this.j6.read(r6, r7, java.lang.Math.min(r8, available()));
                    if (r0 <= 0) { $pc1 = 17; continue $sw1; }
                    r3 = this.VH;
                    if (r3 == null) { $pc1 = 15; continue $sw1; }
                    r3.write(r6, r7, r0);
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    this.FH += r0;
                    $pc1 = 17; continue $sw1;
                }
                case 17: {
                    if (this.v5 == false) { $pc1 = 19; continue $sw1; }
                    this.Hw.FH(java.lang.String.format("Read %d bytes for read(b,%d,%d)", new java.lang.Object[]{java.lang.Integer.valueOf(r0), java.lang.Integer.valueOf(r7), java.lang.Integer.valueOf(r8)}));
                    $pc1 = 19; continue $sw1;
                }
                case 19: {
                    return r0;
                }
                case 5: {
                    if (this.Zo == false) { $pc1 = 8; continue $sw1; }
                    this.Zo = false;
                    r6[r7] = 0;
                    return 1;
                }
                case 8: {
                    return -1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int available() {
        int r0 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.DW - this.FH;
                    if (this.v5 == false) { $pc2 = 5; continue $sw2; }
                    this.Hw.FH(java.lang.String.format("Available = %d", new java.lang.Object[]{java.lang.Integer.valueOf(r0)}));
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    if (r0 == 0) { $pc2 = 7; continue $sw2; }
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    return r0;
                }
                case 7: {
                    if (this.Zo == false) { $pc2 = 9; continue $sw2; }
                    return 1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void close() {
    }

    public void j6(java.io.OutputStream r1) {
        this.VH = r1;
    }

    public void j6(boolean r1) {
        this.Zo = r1;
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    public int read() {
        int r0 = 0;
        java.io.OutputStream r1 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if ((this.DW - this.FH) == 0) { $pc3 = 5; continue $sw3; }
                    r0 = this.j6.read();
                    if (r0 < 0) { $pc3 = 20; continue $sw3; }
                    r1 = this.VH;
                    if (r1 == null) { $pc3 = 16; continue $sw3; }
                    r1.write(r0);
                    $pc3 = 16; continue $sw3;
                }
                case 16: {
                    if (this.v5 == false) { $pc3 = 18; continue $sw3; }
                    this.Hw.FH("Read 1 byte");
                    $pc3 = 18; continue $sw3;
                }
                case 18: {
                    this.FH++;
                    $pc3 = 22; continue $sw3;
                }
                case 22: {
                    return r0;
                }
                case 20: {
                    if (this.v5 == false) { $pc3 = 22; continue $sw3; }
                    this.Hw.FH("Read 0 bytes");
                    { $pc3 = 22; continue $sw3; }
                }
                case 5: {
                    if (this.Zo == false) { $pc3 = 8; continue $sw3; }
                    this.Zo = false;
                    return 0;
                }
                case 8: {
                    return -1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int read(byte[] r3) {
        return j6(r3, 0, r3.length);
    }

    @Override
    public int read(byte[] r1, int r2, int r3) {
        return j6(r1, r2, r3);
    }

    @Override
    public long skip(long r5) {
        long r6 = 0L;
        java.io.RandomAccessFile r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r6 = java.lang.Math.min(r5, available());
                    r0 = this.j6;
                    r0.seek(r0.getFilePointer() + r6);
                    if (this.v5 == false) { $pc4 = 5; continue $sw4; }
                    this.Hw.FH(java.lang.String.format("Skipped %d bytes", new java.lang.Object[]{java.lang.Long.valueOf(r6)}));
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    return r6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
