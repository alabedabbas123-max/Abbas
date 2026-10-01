package abcd;

public final class Hs extends abcd.Abstractms {
    public static final abcd.Hs j6 = null;
    private final abcd.Js DW;
    private final abcd.Js FH;

    static {
        j6 = new abcd.Hs(new abcd.Js("TYPE"), new abcd.Js("Ljava/lang/Class;"));
    }

    public Hs(abcd.Js r1, abcd.Js r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r1 == null) { $pc0 = 10; continue $sw0; }
                    if (r2 == null) { $pc0 = 8; continue $sw0; }
                    this.DW = r1;
                    this.FH = r2;
                    return;
                }
                case 8: {
                    throw new java.lang.NullPointerException("descriptor == null");
                }
                case 10: {
                    throw new java.lang.NullPointerException("name == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected int DW(abcd.Abstractms r3) {
        abcd.Hs r4 = null;
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r4 = (abcd.Hs) r3;
                    r0 = this.DW.j6(r4.DW);
                    if (r0 == 0) { $pc1 = 6; continue $sw1; }
                    return r0;
                }
                case 6: {
                    return this.FH.j6(r4.FH);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean Hw() {
        return false;
    }

    public abcd.Js J8() {
        return this.DW;
    }

    public abcd.Js VH() {
        return this.FH;
    }

    public final boolean Ws() {
        return this.DW.we().equals("<clinit>");
    }

    @Override
    public java.lang.String Zo() {
        return "nat";
    }

    @Override
    public java.lang.String aM() {
        return this.DW.aM() + ':' + this.FH.aM();
    }

    public boolean equals(java.lang.Object r4) {
        abcd.Hs r5 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if ((r4 instanceof abcd.Hs) == true) { $pc2 = 5; continue $sw2; }
                    return false;
                }
                case 5: {
                    r5 = (abcd.Hs) r4;
                    if (this.DW.equals(r5.DW) == true) { $pc2 = 8; continue $sw2; }
                    return false;
                }
                case 8: {
                    if (this.FH.equals(r5.FH) == false) { $pc2 = 12; continue $sw2; }
                    return true;
                }
                case 12: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        return (this.DW.hashCode() * 31) ^ this.FH.hashCode();
    }

    public final boolean lg() {
        return this.DW.we().equals("<init>");
    }

    public java.lang.String toString() {
        return "nat{" + aM() + '}';
    }

    public abcd.Qs we() {
        return abcd.Qs.j6(this.FH.we());
    }
}
