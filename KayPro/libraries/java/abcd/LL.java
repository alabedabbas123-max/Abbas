package abcd;

public abstract class LL extends abcd.EL implements abcd.ML {
    boolean DW;
    boolean FH;
    abcd.InterfaceqL Hw;
    int j6;

    public LL(boolean r3, int r4, abcd.InterfaceqL r5) {
        boolean r6 = false;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.DW = false;
                    this.FH = true;
                    this.Hw = null;
                    if ((r5 instanceof abcd.InterfacepL) == false) { $pc0 = 5; continue $sw0; }
                    this.FH = true;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    this.j6 = r4;
                    if (this.FH == false) { $pc0 = 9; continue $sw0; }
                    this.Hw = r5;
                    return;
                }
                case 9: {
                    r6 = r5.DW() instanceof abcd.HL;
                    this.Hw = r5;
                    return;
                }
                case 5: {
                    this.FH = r3;
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.LL j6(java.lang.Object r3) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r3 == null) { $pc1 = 16; continue $sw1; }
                    if ((r3 instanceof abcd.LL) == true) { $pc1 = 16; continue $sw1; }
                    if ((r3 instanceof byte[]) == false) { $pc1 = 14; continue $sw1; }
                    return j6(abcd.EL.j6((byte[]) r3));
                }
                case 10: {
                    e = $ex1;
                    throw new java.lang.IllegalArgumentException("failed to construct tagged object from byte[]: " + e.getMessage());
                }
                case 14: {
                    throw new java.lang.IllegalArgumentException("unknown object in getInstance: " + r3.getClass().getName());
                }
                case 16: {
                    return (abcd.LL) r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean EQ() {
        return this.DW;
    }

    @Override
    abcd.EL VH() {
        return new abcd.yM(this.FH, this.j6, this.Hw);
    }

    @Override
    abcd.EL gn() {
        return new abcd.GM(this.FH, this.j6, this.Hw);
    }

    @Override
    public int hashCode() {
        int r0 = 0;
        abcd.InterfaceqL r1 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = this.j6;
                    r1 = this.Hw;
                    if (r1 != null) { $pc2 = 5; continue $sw2; }
                    return r0;
                }
                case 5: {
                    return r0 ^ r1.hashCode();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.EL j6() {
        DW();
        return this;
    }

    @Override
    boolean j6(abcd.EL r4) {
        abcd.LL r5 = null;
        abcd.InterfaceqL r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if ((r4 instanceof abcd.LL) == true) { $pc3 = 5; continue $sw3; }
                    return false;
                }
                case 5: {
                    r5 = (abcd.LL) r4;
                    if (this.j6 == r5.j6) { $pc3 = 8; continue $sw3; }
                    $pc3 = 22; continue $sw3;
                }
                case 22: {
                    return false;
                }
                case 8: {
                    if (this.DW != r5.DW) { $pc3 = 22; continue $sw3; }
                    if (this.FH != r5.FH) { $pc3 = 22; continue $sw3; }
                    r0 = this.Hw;
                    if (r0 != null) { $pc3 = 18; continue $sw3; }
                    if (r5.Hw == null) { $pc3 = 20; continue $sw3; }
                    return false;
                }
                case 20: {
                    return true;
                }
                case 18: {
                    if (r0.DW().equals(r5.Hw.DW()) == true) { $pc3 = 23; continue $sw3; }
                    return false;
                }
                case 23: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return "[" + this.j6 + "]" + this.Hw;
    }

    public int tp() {
        return this.j6;
    }

    public abcd.EL u7() {
        abcd.InterfaceqL r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = this.Hw;
                    if (r0 != null) { $pc4 = 5; continue $sw4; }
                    return null;
                }
                case 5: {
                    return r0.DW();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean we() {
        return this.FH;
    }
}
