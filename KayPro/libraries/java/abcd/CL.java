package abcd;

public class CL {
    private java.io.OutputStream j6;

    private class a extends abcd.CL {
        private boolean DW;
        final abcd.CL FH;

        public a(abcd.CL r1, java.io.OutputStream r2) {
            this.FH = r1;
            super(r2);
            this.DW = true;
        }

        @Override
        public void j6(int r2) {
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (this.DW == false) { $pc0 = 5; continue $sw0; }
                        this.DW = false;
                        return;
                    }
                    case 5: {
                        super.j6(r2);
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    public CL(java.io.OutputStream r1) {
        this.j6 = r1;
    }

    abcd.CL DW() {
        return new abcd.DM(this.j6);
    }

    void DW(int r4) {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r4 <= 127) { $pc1 = 12; continue $sw1; }
                    r1 = r4;
                    r2 = 1;
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    r1 = r1 >>> 8;
                    if (r1 == 0) { $pc1 = 7; continue $sw1; }
                    r2 = r2 + 1;
                    { $pc1 = 5; continue $sw1; }
                }
                case 7: {
                    j6((byte) (r2 | 128));
                    r3 = (r2 - 1) * 8;
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    if (r3 < 0) { $pc1 = 16; continue $sw1; }
                    j6((byte) (r4 >> r3));
                    r3 = r3 - 8;
                    { $pc1 = 8; continue $sw1; }
                }
                case 16: {
                    return;
                }
                case 12: {
                    j6((byte) r4);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    abcd.CL j6() {
        return new abcd.rM(this.j6);
    }

    void j6(int r2) {
        this.j6.write(r2);
    }

    void j6(int r4, int r5) {
        byte[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r5 >= 31) { $pc2 = 5; continue $sw2; }
                    j6(r4 | r5);
                    return;
                }
                case 5: {
                    j6(r4 | 31);
                    if (r5 >= 128) { $pc2 = 8; continue $sw2; }
                    j6(r5);
                    return;
                }
                case 8: {
                    r0 = new byte[5];
                    r1 = r0.length - 1;
                    r0[r1] = (byte) (r5 & 127);
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    r5 = r5 >> 7;
                    r1 = r1 - 1;
                    r0[r1] = (byte) ((r5 & 127) | 128);
                    if (r5 > 127) { $pc2 = 9; continue $sw2; }
                    j6(r0, r1, r0.length - r1);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(int r1, int r2, byte[] r3) {
        j6(r1, r2);
        DW(r3.length);
        j6(r3);
    }

    void j6(int r1, byte[] r2) {
        j6(r1);
        DW(r2.length);
        j6(r2);
    }

    void j6(abcd.EL r3) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r3 == null) { $pc3 = 6; continue $sw3; }
                    r3.j6(new abcd.CL.a(this, this.j6));
                    return;
                }
                case 6: {
                    throw new java.io.IOException("null object detected");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.InterfaceqL r2) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r2 == null) { $pc4 = 6; continue $sw4; }
                    r2.DW().j6(this);
                    return;
                }
                case 6: {
                    throw new java.io.IOException("null object detected");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(byte[] r2) {
        this.j6.write(r2);
    }

    void j6(byte[] r2, int r3, int r4) {
        this.j6.write(r2, r3, r4);
    }
}
