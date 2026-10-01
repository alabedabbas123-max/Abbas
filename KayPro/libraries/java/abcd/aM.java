package abcd;

public class aM extends abcd.EL {
    private final int DW;
    private final byte[] FH;
    private final boolean j6;

    public aM(int r4, abcd.rL r5) {
        java.io.ByteArrayOutputStream r6 = null;
        int r0 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.DW = r4;
                    this.j6 = true;
                    r6 = new java.io.ByteArrayOutputStream();
                    r0 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r0 == r5.j6()) { $pc0 = 5; continue $sw0; }
                    try {
                        r6.write(((abcd.AbstractyL) r5.j6(r0)).j6("DER"));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 9; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r0 = r0 + 1;
                    $pc0 = 5; continue $sw0;
                }
                case 9: {
                    e = $ex0;
                    throw new abcd.DL("malformed object: " + e, e);
                }
                case 5: {
                    this.FH = r6.toByteArray();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    aM(boolean r1, int r2, byte[] r3) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
    }

    private byte[] j6(int r7, byte[] r8) {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        byte[] r4 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r8[0] & 31) != 31) { $pc1 = 13; continue $sw1; }
                    r1 = 2;
                    r2 = r8[1] & 255;
                    if ((r2 & 127) == 0) { $pc1 = 12; continue $sw1; }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (r2 < 0) { $pc1 = 14; continue $sw1; }
                    if ((r2 & 128) == 0) { $pc1 = 14; continue $sw1; }
                    r3 = r1 + 1;
                    r2 = r8[r1] & 255;
                    r1 = r3;
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    r4 = new byte[(r8.length - r1) + 1];
                    java.lang.System.arraycopy(r8, r1, r4, 1, r4.length - 1);
                    r4[0] = (byte) r7;
                    return r4;
                }
                case 12: {
                    throw new abcd.DL("corrupted stream - invalid high tag number found");
                }
                case 13: {
                    r1 = 1;
                    { $pc1 = 14; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean Zo() {
        return this.j6;
    }

    @Override
    public int hashCode() {
        boolean r0 = this.j6;
        int r1 = this.DW;
        return ((r0 ? 1 : 0) ^ r1) ^ abcd.OP.DW(this.FH);
    }

    public abcd.EL j6(int r3) {
        byte[] r0 = null;
        byte[] r4 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r3 >= 31) { $pc2 = 10; continue $sw2; }
                    r0 = Hw();
                    r4 = j6(r3, r0);
                    if ((r0[0] & 32) == 0) { $pc2 = 8; continue $sw2; }
                    r4[0] = (byte) (r4[0] | 32);
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    return new abcd.C1419vL(r4).Hw();
                }
                case 10: {
                    throw new java.io.IOException("unsupported tag number");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    void j6(abcd.CL r4) {
        int r0 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.j6 == false) { $pc3 = 5; continue $sw3; }
                    r0 = 96;
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    r4.j6(r0, this.DW, this.FH);
                    return;
                }
                case 5: {
                    r0 = 64;
                    { $pc3 = 6; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    boolean j6(abcd.EL r4) {
        abcd.aM r5 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if ((r4 instanceof abcd.aM) == true) { $pc4 = 5; continue $sw4; }
                    return false;
                }
                case 5: {
                    r5 = (abcd.aM) r4;
                    if (this.j6 == r5.j6) { $pc4 = 8; continue $sw4; }
                    $pc4 = 13; continue $sw4;
                }
                case 13: {
                    return false;
                }
                case 8: {
                    if (this.DW != r5.DW) { $pc4 = 13; continue $sw4; }
                    if (abcd.OP.j6(this.FH, r5.FH) == false) { $pc4 = 13; continue $sw4; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public byte[] tp() {
        return this.FH;
    }

    public int u7() {
        return this.DW;
    }

    @Override
    int v5() {
        return (abcd.OM.DW(this.DW) + abcd.OM.j6(this.FH.length)) + this.FH.length;
    }
}
