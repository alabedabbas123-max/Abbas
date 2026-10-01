package abcd;

public class eM extends abcd.EL {
    private static abcd.sL[] j6;
    byte[] DW;

    static {
        j6 = new abcd.sL[12];
    }

    public eM(byte[] r1) {
        this.DW = r1;
    }

    static abcd.sL DW(byte[] r3) {
        int r0 = 0;
        abcd.sL[] r1 = null;
        abcd.sL r2 = null;
        abcd.sL r4 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r3.length <= 1) { $pc0 = 7; continue $sw0; }
                    return new abcd.sL(abcd.OP.j6(r3));
                }
                case 7: {
                    if (r3.length == 0) { $pc0 = 17; continue $sw0; }
                    r0 = r3[0] & 255;
                    r1 = j6;
                    if (r0 >= r1.length) { $pc0 = 11; continue $sw0; }
                    r2 = r1[r0];
                    if (r2 != null) { $pc0 = 18; continue $sw0; }
                    r4 = new abcd.sL(abcd.OP.j6(r3));
                    r1[r0] = r4;
                    return r4;
                }
                case 18: {
                    return r2;
                }
                case 11: {
                    return new abcd.sL(abcd.OP.j6(r3));
                }
                case 17: {
                    throw new java.lang.IllegalArgumentException("ENUMERATED has zero length");
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
        return abcd.OP.DW(this.DW);
    }

    @Override
    void j6(abcd.CL r3) {
        r3.j6(10, this.DW);
    }

    @Override
    boolean j6(abcd.EL r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r2 instanceof abcd.eM) == true) { $pc1 = 7; continue $sw1; }
                    return false;
                }
                case 7: {
                    return abcd.OP.j6(this.DW, ((abcd.eM) r2).DW);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.math.BigInteger u7() {
        return new java.math.BigInteger(this.DW);
    }

    @Override
    int v5() {
        return (abcd.OM.j6(this.DW.length) + 1) + this.DW.length;
    }
}
