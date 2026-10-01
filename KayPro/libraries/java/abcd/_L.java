package abcd;

class _L extends java.io.InputStream {
    private boolean DW;
    private java.io.InputStream FH;
    private final abcd.JL j6;

    _L(abcd.JL r2) {
        this.DW = true;
        this.j6 = r2;
    }

    @Override
    public int read() {
        abcd.BL r0 = null;
        int r1 = 0;
        abcd.BL r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.FH != null) { $pc0 = 11; continue $sw0; }
                    if (this.DW == true) { $pc0 = 7; continue $sw0; }
                    return -1;
                }
                case 7: {
                    r0 = (abcd.BL) this.j6.j6();
                    if (r0 != null) { $pc0 = 10; continue $sw0; }
                    return -1;
                }
                case 10: {
                    this.DW = false;
                    this.FH = r0.FH();
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    r1 = this.FH.read();
                    if (r1 >= 0) { $pc0 = 13; continue $sw0; }
                    r2 = (abcd.BL) this.j6.j6();
                    if (r2 == null) { $pc0 = 16; continue $sw0; }
                    this.FH = r2.FH();
                    { $pc0 = 11; continue $sw0; }
                }
                case 16: {
                    this.FH = null;
                    return -1;
                }
                case 13: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int read(byte[] r6, int r7, int r8) {
        int r1 = 0;
        abcd.BL r0 = null;
        int r2 = 0;
        abcd.BL r3 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r1 = 0;
                    if (this.FH != null) { $pc1 = 11; continue $sw1; }
                    if (this.DW == true) { $pc1 = 7; continue $sw1; }
                    return -1;
                }
                case 7: {
                    r0 = (abcd.BL) this.j6.j6();
                    if (r0 != null) { $pc1 = 10; continue $sw1; }
                    return -1;
                }
                case 10: {
                    this.DW = false;
                    this.FH = r0.FH();
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    r2 = this.FH.read(r6, r7 + r1, r8 - r1);
                    if (r2 >= 0) { $pc1 = 13; continue $sw1; }
                    r3 = (abcd.BL) this.j6.j6();
                    if (r3 == null) { $pc1 = 18; continue $sw1; }
                    this.FH = r3.FH();
                    { $pc1 = 11; continue $sw1; }
                }
                case 18: {
                    this.FH = null;
                    if (r1 >= 1) { $pc1 = 31; continue $sw1; }
                    return -1;
                }
                case 31: {
                    return r1;
                }
                case 13: {
                    r1 = r1 + r2;
                    if (r1 != r8) { $pc1 = 11; continue $sw1; }
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
