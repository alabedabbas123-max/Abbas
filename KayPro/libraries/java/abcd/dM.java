package abcd;

public class dM extends abcd.EL {
    private static final byte[] DW = null;
    public static final abcd.oL FH = null;
    public static final abcd.oL Hw = null;
    private static final byte[] j6 = null;
    private byte[] v5;

    static {
        j6 = new byte[]{-1};
        DW = new byte[1];
        FH = new abcd.oL(false);
        Hw = new abcd.oL(true);
    }

    public dM(boolean r1) {
        byte[] r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r1 == false) { $pc0 = 5; continue $sw0; }
                    r2 = j6;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    this.v5 = r2;
                    return;
                }
                case 5: {
                    r2 = DW;
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    dM(byte[] r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r3.length != 1) { $pc1 = 13; continue $sw1; }
                    if (r3[0] != 0) { $pc1 = 8; continue $sw1; }
                    this.v5 = DW;
                    return;
                }
                case 8: {
                    if (r3[0] != 255) { $pc1 = 10; continue $sw1; }
                    this.v5 = j6;
                    return;
                }
                case 10: {
                    this.v5 = abcd.OP.j6(r3);
                    return;
                }
                case 13: {
                    throw new java.lang.IllegalArgumentException("byte value should have 1 byte in it");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static abcd.oL DW(byte[] r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2.length != 1) { $pc2 = 15; continue $sw2; }
                    if (r2[0] != 0) { $pc2 = 9; continue $sw2; }
                    return FH;
                }
                case 9: {
                    if (r2[0] != 255) { $pc2 = 13; continue $sw2; }
                    return Hw;
                }
                case 13: {
                    return new abcd.oL(r2);
                }
                case 15: {
                    throw new java.lang.IllegalArgumentException("byte value should have 1 byte in it");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.oL j6(java.lang.Object r3) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r3 == null) { $pc3 = 16; continue $sw3; }
                    if ((r3 instanceof abcd.oL) == true) { $pc3 = 16; continue $sw3; }
                    if ((r3 instanceof abcd.dM) == false) { $pc3 = 14; continue $sw3; }
                    if (((abcd.dM) r3).u7() == false) { $pc3 = 12; continue $sw3; }
                    return Hw;
                }
                case 12: {
                    return FH;
                }
                case 14: {
                    throw new java.lang.IllegalArgumentException("illegal object in getInstance: " + r3.getClass().getName());
                }
                case 16: {
                    return (abcd.oL) r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.oL j6(boolean r0) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r0 == false) { $pc4 = 5; continue $sw4; }
                    return Hw;
                }
                case 5: {
                    return FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    boolean Zo() {
        return false;
    }

    @Override
    public int hashCode() {
        return this.v5[0];
    }

    @Override
    void j6(abcd.CL r3) {
        r3.j6(1, this.v5);
    }

    @Override
    protected boolean j6(abcd.EL r3) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r3 != null) { $pc5 = 5; continue $sw5; }
                    $pc5 = 11; continue $sw5;
                }
                case 11: {
                    return false;
                }
                case 5: {
                    if ((r3 instanceof abcd.dM) == false) { $pc5 = 11; continue $sw5; }
                    if (this.v5[0] != ((abcd.dM) r3).v5[0]) { $pc5 = 11; continue $sw5; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (this.v5[0] == 0) { $pc6 = 5; continue $sw6; }
                    return "TRUE";
                }
                case 5: {
                    return "FALSE";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean u7() {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (this.v5[0] == 0) { $pc7 = 6; continue $sw7; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    int v5() {
        return 3;
    }
}
