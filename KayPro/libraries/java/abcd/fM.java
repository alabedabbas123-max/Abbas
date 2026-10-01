package abcd;

public class fM extends abcd.EL {
    private abcd.wL DW;
    private abcd.EL FH;
    private int Hw;
    private abcd.zL j6;
    private abcd.EL v5;

    public fM(abcd.rL r5) {
        int r0 = 0;
        abcd.EL r1 = null;
        abcd.yM r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = 0;
                    r1 = j6(r5, 0);
                    if ((r1 instanceof abcd.zL) == false) { $pc0 = 6; continue $sw0; }
                    this.j6 = (abcd.zL) r1;
                    r1 = j6(r5, 1);
                    r0 = 1;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if ((r1 instanceof abcd.wL) == false) { $pc0 = 9; continue $sw0; }
                    this.DW = (abcd.wL) r1;
                    r0 = r0 + 1;
                    r1 = j6(r5, r0);
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if ((r1 instanceof abcd.yM) == true) { $pc0 = 12; continue $sw0; }
                    this.FH = r1;
                    r0 = r0 + 1;
                    r1 = j6(r5, r0);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    if (r5.j6() != (r0 + 1)) { $pc0 = 20; continue $sw0; }
                    if ((r1 instanceof abcd.yM) == false) { $pc0 = 18; continue $sw0; }
                    r2 = (abcd.yM) r1;
                    j6(r2.tp());
                    this.v5 = r2.u7();
                    return;
                }
                case 18: {
                    throw new java.lang.IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
                }
                case 20: {
                    throw new java.lang.IllegalArgumentException("input vector too large");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.EL j6(abcd.rL r2, int r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r2.j6() <= r3) { $pc1 = 7; continue $sw1; }
                    return r2.j6(r3).DW();
                }
                case 7: {
                    throw new java.lang.IllegalArgumentException("too few objects in input vector");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(int r4) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r4 < 0) { $pc2 = 8; continue $sw2; }
                    if (r4 > 2) { $pc2 = 8; continue $sw2; }
                    this.Hw = r4;
                    return;
                }
                case 8: {
                    throw new java.lang.IllegalArgumentException("invalid encoding value: " + r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int EQ() {
        return this.Hw;
    }

    public abcd.wL J0() {
        return this.DW;
    }

    @Override
    boolean Zo() {
        return true;
    }

    @Override
    public int hashCode() {
        abcd.zL r0 = null;
        int r1 = 0;
        abcd.wL r2 = null;
        abcd.EL r3 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.j6;
                    if (r0 == null) { $pc3 = 5; continue $sw3; }
                    r1 = r0.hashCode();
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    r2 = this.DW;
                    if (r2 == null) { $pc3 = 9; continue $sw3; }
                    r1 = r1 ^ r2.hashCode();
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    r3 = this.FH;
                    if (r3 == null) { $pc3 = 13; continue $sw3; }
                    r1 = r1 ^ r3.hashCode();
                    $pc3 = 13; continue $sw3;
                }
                case 13: {
                    return r1 ^ this.v5.hashCode();
                }
                case 5: {
                    r1 = 0;
                    { $pc3 = 6; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    void j6(abcd.CL r7) {
        java.io.ByteArrayOutputStream r0 = null;
        abcd.zL r1 = null;
        abcd.wL r2 = null;
        abcd.EL r3 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = new java.io.ByteArrayOutputStream();
                    r1 = this.j6;
                    if (r1 == null) { $pc4 = 5; continue $sw4; }
                    r0.write(r1.j6("DER"));
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    r2 = this.DW;
                    if (r2 == null) { $pc4 = 8; continue $sw4; }
                    r0.write(r2.j6("DER"));
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    r3 = this.FH;
                    if (r3 == null) { $pc4 = 11; continue $sw4; }
                    r0.write(r3.j6("DER"));
                    $pc4 = 11; continue $sw4;
                }
                case 11: {
                    r0.write(new abcd.yM(true, this.Hw, this.v5).j6("DER"));
                    r7.j6(32, 8, r0.toByteArray());
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    boolean j6(abcd.EL r4) {
        abcd.fM r5 = null;
        abcd.zL r0 = null;
        abcd.zL r2 = null;
        abcd.wL r1 = null;
        abcd.wL r3 = null;
        abcd.EL r6 = null;
        abcd.EL r7 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if ((r4 instanceof abcd.fM) == true) { $pc5 = 5; continue $sw5; }
                    return false;
                }
                case 5: {
                    if (this != r4) { $pc5 = 8; continue $sw5; }
                    return true;
                }
                case 8: {
                    r5 = (abcd.fM) r4;
                    r0 = this.j6;
                    if (r0 == null) { $pc5 = 15; continue $sw5; }
                    r2 = r5.j6;
                    if (r2 != null) { $pc5 = 13; continue $sw5; }
                    $pc5 = 14; continue $sw5;
                }
                case 14: {
                    return false;
                }
                case 13: {
                    if (r2.equals(r0) == false) { $pc5 = 14; continue $sw5; }
                    $pc5 = 15; continue $sw5;
                }
                case 15: {
                    r1 = this.DW;
                    if (r1 == null) { $pc5 = 22; continue $sw5; }
                    r3 = r5.DW;
                    if (r3 != null) { $pc5 = 20; continue $sw5; }
                    $pc5 = 21; continue $sw5;
                }
                case 21: {
                    return false;
                }
                case 20: {
                    if (r3.equals(r1) == false) { $pc5 = 21; continue $sw5; }
                    $pc5 = 22; continue $sw5;
                }
                case 22: {
                    r6 = this.FH;
                    if (r6 == null) { $pc5 = 30; continue $sw5; }
                    r7 = r5.FH;
                    if (r7 != null) { $pc5 = 27; continue $sw5; }
                    $pc5 = 28; continue $sw5;
                }
                case 28: {
                    return false;
                }
                case 27: {
                    if (r7.equals(r6) == false) { $pc5 = 28; continue $sw5; }
                    $pc5 = 30; continue $sw5;
                }
                case 30: {
                    return this.v5.equals(r5.v5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.zL tp() {
        return this.j6;
    }

    public abcd.EL u7() {
        return this.FH;
    }

    @Override
    int v5() {
        return Hw().length;
    }

    public abcd.EL we() {
        return this.v5;
    }
}
