package abcd;

public class JL {
    private final int DW;
    private final byte[][] FH;
    private final java.io.InputStream j6;

    public JL(java.io.InputStream r2) {
        this(r2, abcd.OM.j6(r2));
    }

    public JL(java.io.InputStream r1, int r2) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = new byte[11][];
    }

    private void j6(boolean r3) {
        java.io.InputStream r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = this.j6;
                    if ((r0 instanceof abcd.JM) == false) { $pc0 = 6; continue $sw0; }
                    ((abcd.JM) r0).DW(r3);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    abcd.rL DW() {
        abcd.rL r0 = null;
        abcd.InterfaceqL r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new abcd.rL();
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    r1 = j6();
                    if (r1 == null) { $pc1 = 5; continue $sw1; }
                    if ((r1 instanceof abcd.IM) == true) { $pc1 = 8; continue $sw1; }
                    r0.j6(r1.DW());
                    { $pc1 = 3; continue $sw1; }
                }
                case 8: {
                    r0.j6(((abcd.IM) r1).j6());
                    { $pc1 = 3; continue $sw1; }
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    abcd.EL j6(boolean r4, int r5) {
        abcd.rL r6 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r4 == false) { $pc2 = 5; continue $sw2; }
                    r6 = DW();
                    if ((this.j6 instanceof abcd.JM) == false) { $pc2 = 14; continue $sw2; }
                    if (r6.j6() != 1) { $pc2 = 12; continue $sw2; }
                    return new abcd.YL(true, r5, r6.j6(0));
                }
                case 12: {
                    return new abcd.YL(false, r5, abcd.QL.j6(r6));
                }
                case 14: {
                    if (r6.j6() != 1) { $pc2 = 17; continue $sw2; }
                    return new abcd.yM(true, r5, r6.j6(0));
                }
                case 17: {
                    return new abcd.yM(false, r5, abcd.hM.j6(r6));
                }
                case 5: {
                    return new abcd.yM(false, r5, new abcd.pM(((abcd.HM) this.j6).DW()));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.InterfaceqL j6() {
        int r0 = 0;
        boolean r1 = false;
        int r2 = 0;
        int r3 = 0;
        abcd.JL r4 = null;
        abcd.HM r5 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.j6.read();
                    if (r0 != (-1)) { $pc3 = 6; continue $sw3; }
                    return null;
                }
                case 6: {
                    r1 = false;
                    j6(false);
                    r2 = abcd.C1419vL.DW(this.j6, r0);
                    if ((r0 & 32) == 0) { $pc3 = 9; continue $sw3; }
                    r1 = true;
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    r3 = abcd.C1419vL.j6(this.j6, this.DW);
                    if (r3 >= 0) { $pc3 = 24; continue $sw3; }
                    if (r1 == false) { $pc3 = 23; continue $sw3; }
                    r4 = new abcd.JL(new abcd.JM(this.j6, this.DW), this.DW);
                    if ((r0 & 64) == 0) { $pc3 = 17; continue $sw3; }
                    return new abcd.PL(r2, r4);
                }
                case 17: {
                    if ((r0 & 128) == 0) { $pc3 = 21; continue $sw3; }
                    return new abcd.ZL(true, r2, r4);
                }
                case 21: {
                    return r4.j6(r2);
                }
                case 23: {
                    throw new java.io.IOException("indefinite length primitive encoding encountered");
                }
                case 24: {
                    r5 = new abcd.HM(this.j6, r3);
                    if ((r0 & 64) == 0) { $pc3 = 29; continue $sw3; }
                    return new abcd.aM(r1, r2, r5.DW());
                }
                case 29: {
                    if ((r0 & 128) == 0) { $pc3 = 33; continue $sw3; }
                    return new abcd.ZL(r1, r2, new abcd.JL(r5));
                }
                case 33: {
                    if (r1 == false) { $pc3 = 51; continue $sw3; }
                    if (r2 == 4) { $pc3 = 50; continue $sw3; }
                    if (r2 == 8) { $pc3 = 48; continue $sw3; }
                    if (r2 == 16) { $pc3 = 46; continue $sw3; }
                    if (r2 != 17) { $pc3 = 44; continue $sw3; }
                    return new abcd.wM(new abcd.JL(r5));
                }
                case 44: {
                    throw new java.io.IOException("unknown tag " + r2 + " encountered");
                }
                case 46: {
                    return new abcd.uM(new abcd.JL(r5));
                }
                case 48: {
                    return new abcd.gM(new abcd.JL(r5));
                }
                case 50: {
                    return new abcd.TL(new abcd.JL(r5));
                }
                case 51: {
                    if (r2 == 4) { $pc3 = 58; continue $sw3; }
                    return abcd.C1419vL.j6(r2, r5, this.FH);
                }
                case 54: {
                    e = $ex3;
                    throw new abcd.tL("corrupted stream detected", e);
                }
                case 58: {
                    return new abcd.qM(r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    abcd.InterfaceqL j6(int r4) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r4 == 4) { $pc4 = 19; continue $sw4; }
                    if (r4 == 8) { $pc4 = 17; continue $sw4; }
                    if (r4 == 16) { $pc4 = 15; continue $sw4; }
                    if (r4 != 17) { $pc4 = 13; continue $sw4; }
                    return new abcd.XL(this);
                }
                case 13: {
                    throw new abcd.tL("unknown BER object encountered: 0x" + java.lang.Integer.toHexString(r4));
                }
                case 15: {
                    return new abcd.VL(this);
                }
                case 17: {
                    return new abcd.gM(this);
                }
                case 19: {
                    return new abcd.TL(this);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
