package abcd;

class JM extends abcd.MM {
    private int FH;
    private int Hw;
    private boolean Zo;
    private boolean v5;

    JM(java.io.InputStream r1, int r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(r1, r2);
                    this.v5 = false;
                    this.Zo = true;
                    this.FH = r1.read();
                    this.Hw = r1.read();
                    if (this.Hw < 0) { $pc0 = 7; continue $sw0; }
                    DW();
                    return;
                }
                case 7: {
                    throw new java.io.EOFException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean DW() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.v5 == true) { $pc1 = 12; continue $sw1; }
                    if (this.Zo == false) { $pc1 = 12; continue $sw1; }
                    if (this.FH != 0) { $pc1 = 12; continue $sw1; }
                    if (this.Hw != 0) { $pc1 = 12; continue $sw1; }
                    this.v5 = true;
                    j6(true);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    return this.v5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void DW(boolean r1) {
        this.Zo = r1;
        DW();
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
                    if (DW() == false) { $pc2 = 6; continue $sw2; }
                    return -1;
                }
                case 6: {
                    r0 = this.j6.read();
                    if (r0 < 0) { $pc2 = 11; continue $sw2; }
                    r1 = this.FH;
                    this.FH = this.Hw;
                    this.Hw = r0;
                    return r1;
                }
                case 11: {
                    throw new java.io.EOFException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int read(byte[] r3, int r4, int r5) {
        int r6 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.Zo == true) { $pc3 = 22; continue $sw3; }
                    if (r5 < 3) { $pc3 = 22; continue $sw3; }
                    if (this.v5 == false) { $pc3 = 11; continue $sw3; }
                    return -1;
                }
                case 11: {
                    r6 = this.j6.read(r3, r4 + 2, r5 - 2);
                    if (r6 < 0) { $pc3 = 20; continue $sw3; }
                    r3[r4] = (byte) this.FH;
                    r3[r4 + 1] = (byte) this.Hw;
                    this.FH = this.j6.read();
                    this.Hw = this.j6.read();
                    if (this.Hw < 0) { $pc3 = 18; continue $sw3; }
                    return r6 + 2;
                }
                case 18: {
                    throw new java.io.EOFException();
                }
                case 20: {
                    throw new java.io.EOFException();
                }
                case 22: {
                    return super.read(r3, r4, r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
