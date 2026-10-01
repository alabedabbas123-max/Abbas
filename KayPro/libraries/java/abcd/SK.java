package abcd;

public class SK extends java.io.OutputStream {
    private int DW;
    private byte[] FH;
    private int Hw;
    private final java.io.OutputStream j6;
    private boolean v5;

    public SK(java.io.OutputStream r2) {
        this.DW = -1;
        this.FH = new byte[8000];
        this.Hw = 0;
        this.j6 = r2;
    }

    private int j6(byte r4) {
        int r0 = 0;
        byte[] r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.Hw;
                    r1 = this.FH;
                    if (r0 <= r1.length) { $pc0 = 6; continue $sw0; }
                    return 1;
                }
                case 6: {
                    this.Hw = r0 + 1;
                    r1[r0] = r4;
                    if (this.Hw != r1.length) { $pc0 = 11; continue $sw0; }
                    j6();
                    return 0;
                }
                case 11: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int j6(byte[] r4, int r5, int r6) {
        int r0 = 0;
        byte[] r1 = null;
        int r2 = 0;
        int r7 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.Hw;
                    r1 = this.FH;
                    if (r0 <= r1.length) { $pc1 = 5; continue $sw1; }
                    return r6;
                }
                case 5: {
                    r2 = java.lang.Math.min(r1.length - r0, r6);
                    java.lang.System.arraycopy(r4, r5, this.FH, this.Hw, r2);
                    this.Hw += r2;
                    r7 = r6 - r2;
                    if (r7 <= 0) { $pc1 = 8; continue $sw1; }
                    j6();
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    return r7;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6() {
        this.v5 = abcd.tC.j6(this.FH, this.Hw);
        int r0 = this.Hw;
        byte[] r1 = this.FH;
        this.Hw = r1.length + 1;
        write(r1, 0, r0);
    }

    @Override
    public void close() {
        flush();
        this.j6.close();
    }

    @Override
    public void flush() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.Hw >= this.FH.length) { $pc2 = 5; continue $sw2; }
                    j6();
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    this.DW = -1;
                    this.j6.flush();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void write(int r4) {
        int r5 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (j6((byte) r4) < 0) { $pc3 = 6; continue $sw3; }
                    return;
                }
                case 6: {
                    if (this.v5 == false) { $pc3 = 10; continue $sw3; }
                    this.j6.write(r4);
                    return;
                }
                case 10: {
                    if (r4 != 10) { $pc3 = 16; continue $sw3; }
                    r5 = this.DW;
                    if (r5 != 13) { $pc3 = 14; continue $sw3; }
                    this.j6.write(10);
                    this.DW = -1;
                    return;
                }
                case 14: {
                    if (r5 != (-1)) { $pc3 = 21; continue $sw3; }
                    this.j6.write(13);
                    this.j6.write(10);
                    this.DW = -1;
                    return;
                }
                case 21: {
                    return;
                }
                case 16: {
                    if (r4 != 13) { $pc3 = 18; continue $sw3; }
                    this.j6.write(r4);
                    this.DW = 13;
                    return;
                }
                case 18: {
                    this.j6.write(r4);
                    this.DW = -1;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void write(byte[] r3) {
        int r0 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = j6(r3, 0, r3.length);
                    if (r0 <= 0) { $pc4 = 6; continue $sw4; }
                    write(r3, r3.length - r0, r0);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void write(byte[] r7, int r8, int r9) {
        int r0 = 0;
        int r10 = 0;
        int r11 = 0;
        int r1 = 0;
        int r2 = 0;
        byte r3 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = j6(r7, r8, r9);
                    if (r0 >= 0) { $pc5 = 5; continue $sw5; }
                    return;
                }
                case 5: {
                    r10 = (r8 + r9) - r0;
                    if (r0 != 0) { $pc5 = 9; continue $sw5; }
                    return;
                }
                case 9: {
                    if (this.v5 == false) { $pc5 = 12; continue $sw5; }
                    this.j6.write(r7, r10, r0);
                    return;
                }
                case 12: {
                    r11 = r10;
                    r1 = r11;
                    $pc5 = 13; continue $sw5;
                }
                case 13: {
                    r2 = r10 + r0;
                    if (r11 >= r2) { $pc5 = 15; continue $sw5; }
                    r3 = r7[r11];
                    if (r3 != 13) { $pc5 = 25; continue $sw5; }
                    this.DW = 13;
                    $pc5 = 33; continue $sw5;
                }
                case 33: {
                    r11 = r11 + 1;
                    { $pc5 = 13; continue $sw5; }
                }
                case 25: {
                    if (r3 == 10) { $pc5 = 27; continue $sw5; }
                    this.DW = -1;
                    { $pc5 = 33; continue $sw5; }
                }
                case 27: {
                    if (this.DW == 13) { $pc5 = 31; continue $sw5; }
                    if (r1 >= r11) { $pc5 = 30; continue $sw5; }
                    this.j6.write(r7, r1, r11 - r1);
                    $pc5 = 30; continue $sw5;
                }
                case 30: {
                    this.j6.write(13);
                    r1 = r11;
                    $pc5 = 31; continue $sw5;
                }
                case 31: {
                    this.DW = -1;
                    { $pc5 = 33; continue $sw5; }
                }
                case 15: {
                    if (r1 >= r2) { $pc5 = 18; continue $sw5; }
                    this.j6.write(r7, r1, r2 - r1);
                    $pc5 = 18; continue $sw5;
                }
                case 18: {
                    if (r7[r2 - 1] != 13) { $pc5 = 38; continue $sw5; }
                    this.DW = 13;
                    return;
                }
                case 38: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
