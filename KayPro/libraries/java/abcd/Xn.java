package abcd;

public final class Xn {
    private final int DW;
    private final int FH;
    private final abcd.Abstractao Hw;
    private final int j6;
    private final boolean v5;

    public Xn(int r2, int r3, int r4, abcd.Abstractao r5, boolean r6) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (abcd.pq.DW(r2) == false) { $pc0 = 18; continue $sw0; }
                    if (abcd.pq.DW(r3) == false) { $pc0 = 16; continue $sw0; }
                    if (abcd.pq.DW(r4) == false) { $pc0 = 14; continue $sw0; }
                    if (r5 == null) { $pc0 = 12; continue $sw0; }
                    this.j6 = r2;
                    this.DW = r3;
                    this.FH = r4;
                    this.Hw = r5;
                    this.v5 = r6;
                    return;
                }
                case 12: {
                    throw new java.lang.NullPointerException("format == null");
                }
                case 14: {
                    throw new java.lang.IllegalArgumentException("bogus nextOpcode");
                }
                case 16: {
                    throw new java.lang.IllegalArgumentException("bogus family");
                }
                case 18: {
                    throw new java.lang.IllegalArgumentException("bogus opcode");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Abstractao DW() {
        return this.Hw;
    }

    public java.lang.String FH() {
        return abcd.oq.DW(this.j6);
    }

    public int Hw() {
        return this.FH;
    }

    public boolean VH() {
        return this.v5;
    }

    public abcd.Xn Zo() {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    switch(this.j6) {
                        case 50: { $pc1 = 29; continue $sw1; }
                        case 51: { $pc1 = 27; continue $sw1; }
                        case 52: { $pc1 = 25; continue $sw1; }
                        case 53: { $pc1 = 23; continue $sw1; }
                        case 54: { $pc1 = 21; continue $sw1; }
                        case 55: { $pc1 = 19; continue $sw1; }
                        case 56: { $pc1 = 17; continue $sw1; }
                        case 57: { $pc1 = 15; continue $sw1; }
                        case 58: { $pc1 = 13; continue $sw1; }
                        case 59: { $pc1 = 11; continue $sw1; }
                        case 60: { $pc1 = 9; continue $sw1; }
                        case 61: { $pc1 = 7; continue $sw1; }
                        default: { $pc1 = 5; continue $sw1; }
                    };
                }
                case 5: {
                    throw new java.lang.IllegalArgumentException("bogus opcode: " + this);
                }
                case 7: {
                    return abcd.C0465Yn.Xa;
                }
                case 9: {
                    return abcd.C0465Yn.Eq;
                }
                case 11: {
                    return abcd.C0465Yn.et;
                }
                case 13: {
                    return abcd.C0465Yn.CU;
                }
                case 15: {
                    return abcd.C0465Yn.jJ;
                }
                case 17: {
                    return abcd.C0465Yn.wc;
                }
                case 19: {
                    return abcd.C0465Yn.yO;
                }
                case 21: {
                    return abcd.C0465Yn.XG;
                }
                case 23: {
                    return abcd.C0465Yn.XX;
                }
                case 25: {
                    return abcd.C0465Yn.kQ;
                }
                case 27: {
                    return abcd.C0465Yn.OW;
                }
                case 29: {
                    return abcd.C0465Yn.br;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int j6() {
        return this.DW;
    }

    public java.lang.String toString() {
        return FH();
    }

    public int v5() {
        return this.j6;
    }
}
