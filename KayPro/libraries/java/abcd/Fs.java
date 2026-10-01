package abcd;

public abstract class Fs extends abcd.Ms {
    private final abcd.Hs DW;
    private final abcd.Ks j6;

    Fs(abcd.Ks r1, abcd.Hs r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r1 == null) { $pc0 = 10; continue $sw0; }
                    if (r2 == null) { $pc0 = 8; continue $sw0; }
                    this.j6 = r1;
                    this.DW = r2;
                    return;
                }
                case 8: {
                    throw new java.lang.NullPointerException("nat == null");
                }
                case 10: {
                    throw new java.lang.NullPointerException("definingClass == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected int DW(abcd.Abstractms r3) {
        abcd.Fs r4 = null;
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r4 = (abcd.Fs) r3;
                    r0 = this.j6.j6(r4.j6);
                    if (r0 == 0) { $pc1 = 6; continue $sw1; }
                    return r0;
                }
                case 6: {
                    return this.DW.J8().j6(r4.DW.J8());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public final boolean Hw() {
        return false;
    }

    public final abcd.Ks VH() {
        return this.j6;
    }

    @Override
    public final java.lang.String aM() {
        return this.j6.aM() + '.' + this.DW.aM();
    }

    public final boolean equals(java.lang.Object r4) {
        abcd.Fs r5 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r4 != null) { $pc2 = 5; continue $sw2; }
                    return false;
                }
                case 5: {
                    if (getClass() != r4.getClass()) { $pc2 = 16; continue $sw2; }
                    r5 = (abcd.Fs) r4;
                    if (this.j6.equals(r5.j6) == true) { $pc2 = 10; continue $sw2; }
                    return false;
                }
                case 10: {
                    if (this.DW.equals(r5.DW) == false) { $pc2 = 15; continue $sw2; }
                    return true;
                }
                case 15: {
                    return false;
                }
                case 16: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final int hashCode() {
        return (this.j6.hashCode() * 31) ^ this.DW.hashCode();
    }

    public final java.lang.String toString() {
        return Zo() + '{' + aM() + '}';
    }

    public final abcd.Hs we() {
        return this.DW;
    }
}
