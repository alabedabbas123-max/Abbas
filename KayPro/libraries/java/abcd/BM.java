package abcd;

public class BM extends abcd.EL implements abcd.KL {
    private static final char[] j6 = null;
    private byte[] DW;

    static {
        j6 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public BM(byte[] r1) {
        this.DW = r1;
    }

    @Override
    boolean Zo() {
        return false;
    }

    @Override
    public java.lang.String getString() {
        java.lang.StringBuffer r0 = null;
        java.io.ByteArrayOutputStream r1 = null;
        byte[] r2 = null;
        int r3 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new java.lang.StringBuffer("#");
                    r1 = new java.io.ByteArrayOutputStream();
                    try {
                        new abcd.CL(r1).j6(this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 10; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r2 = r1.toByteArray();
                    r3 = 0;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r3 == r2.length) { $pc0 = 8; continue $sw0; }
                    r0.append(j6[(r2[r3] >>> 4) & 15]);
                    r0.append(j6[r2[r3] & 15]);
                    r3 = r3 + 1;
                    { $pc0 = 6; continue $sw0; }
                }
                case 8: {
                    return r0.toString();
                }
                case 11: {
                    throw new java.lang.RuntimeException("internal error encoding BitString");
                }
                case 10: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int hashCode() {
        return abcd.OP.DW(this.DW);
    }

    @Override
    void j6(abcd.CL r3) {
        r3.j6(28, u7());
    }

    @Override
    boolean j6(abcd.EL r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r2 instanceof abcd.BM) == true) { $pc1 = 7; continue $sw1; }
                    return false;
                }
                case 7: {
                    return abcd.OP.j6(this.DW, ((abcd.BM) r2).DW);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return getString();
    }

    public byte[] u7() {
        return this.DW;
    }

    @Override
    int v5() {
        return (abcd.OM.j6(this.DW.length) + 1) + this.DW.length;
    }
}
