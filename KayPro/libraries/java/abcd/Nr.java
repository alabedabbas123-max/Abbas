package abcd;

public final class Nr implements abcd.Interfacecu {
    private final abcd.Ur DW;
    private final abcd.au FH;
    private final int Hw;
    private final int j6;

    public interface a {
        void j6(abcd.Nr r1);
    }

    public Nr(int r5, abcd.Ur r6, abcd.au r7, int r8) {
        int r0 = 0;
        int r1 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r5 < 0) { $pc0 = 39; continue $sw0; }
                    try {
                        r6.Ws();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NullPointerException) { $pc0 = 36; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r0 = r6.size();
                    if (r0 == 0) { $pc0 = 35; continue $sw0; }
                    r1 = r0 - 2;
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if (r1 < 0) { $pc0 = 16; continue $sw0; }
                    if (r6.get(r1).v5().DW() != 1) { $pc0 = 14; continue $sw0; }
                    r1 = r1 - 1;
                    { $pc0 = 9; continue $sw0; }
                }
                case 14: {
                    throw new java.lang.IllegalArgumentException("insns[" + r1 + "] is a branch or can throw");
                }
                case 16: {
                    if (r6.get(r0 - 1).v5().DW() == 1) { $pc0 = 33; continue $sw0; }
                    try {
                        r7.Ws();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NullPointerException) { $pc0 = 30; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r8 < (-1)) { $pc0 = 29; continue $sw0; }
                    if (r8 >= 0) { $pc0 = 22; continue $sw0; }
                    $pc0 = 26; continue $sw0;
                }
                case 26: {
                    this.j6 = r5;
                    this.DW = r6;
                    this.FH = r7;
                    this.Hw = r8;
                    return;
                }
                case 22: {
                    if (r7.Hw(r8) == true) { $pc0 = 26; continue $sw0; }
                    throw new java.lang.IllegalArgumentException("primarySuccessor " + r8 + " not in successors " + r7);
                }
                case 29: {
                    throw new java.lang.IllegalArgumentException("primarySuccessor < -1");
                }
                case 31: {
                    throw new java.lang.NullPointerException("successors == null");
                }
                case 33: {
                    throw new java.lang.IllegalArgumentException("insns does not end with a branch or throwing instruction");
                }
                case 35: {
                    throw new java.lang.IllegalArgumentException("insns.size() == 0");
                }
                case 37: {
                    throw new java.lang.NullPointerException("insns == null");
                }
                case 39: {
                    throw new java.lang.IllegalArgumentException("label < 0");
                }
                case 30: {
                    $pc0 = 36; continue $sw0;
                }
                case 36: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int DW() {
        return this.j6;
    }

    public abcd.Tr FH() {
        return this.DW.get(0);
    }

    public abcd.Ur Hw() {
        return this.DW;
    }

    public int VH() {
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.FH.size() != 2) { $pc1 = 9; continue $sw1; }
                    r0 = this.FH.get(0);
                    if (r0 == this.Hw) { $pc1 = 7; continue $sw1; }
                    return r0;
                }
                case 7: {
                    return this.FH.get(1);
                }
                case 9: {
                    throw new java.lang.UnsupportedOperationException("block doesn't have exactly two successors");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int Zo() {
        return this.Hw;
    }

    public boolean equals(java.lang.Object r1) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this != r1) { $pc2 = 4; continue $sw2; }
                    return true;
                }
                case 4: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.au gn() {
        return this.FH;
    }

    public int hashCode() {
        return java.lang.System.identityHashCode(this);
    }

    public boolean j6() {
        return this.DW.rN().j6();
    }

    public java.lang.String toString() {
        return '{' + abcd.Yt.v5(this.j6) + '}';
    }

    public boolean u7() {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.DW.rN().DW().size() == 0) { $pc3 = 5; continue $sw3; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Tr v5() {
        return this.DW.rN();
    }
}
