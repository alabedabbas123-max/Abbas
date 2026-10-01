package abcd;

public class kM extends abcd.EL implements abcd.KL {
    private byte[] j6;

    public kM(java.lang.String r2) {
        this(r2, false);
    }

    public kM(java.lang.String r1, boolean r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r1 == null) { $pc0 = 13; continue $sw0; }
                    if (r2 == true) { $pc0 = 6; continue $sw0; }
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    this.j6 = abcd.TP.j6(r1);
                    return;
                }
                case 6: {
                    if (DW(r1) == true) { $pc0 = 10; continue $sw0; }
                    throw new java.lang.IllegalArgumentException("string contains illegal characters");
                }
                case 13: {
                    throw new java.lang.NullPointerException("string cannot be null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    kM(byte[] r1) {
        this.j6 = r1;
    }

    public static boolean DW(java.lang.String r4) {
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = r4.length() - 1;
                    $pc1 = 3; continue $sw1;
                }
                case 3: {
                    if (r0 < 0) { $pc1 = 4; continue $sw1; }
                    if (r4.charAt(r0) > 127) { $pc1 = 7; continue $sw1; }
                    r0 = r0 - 1;
                    { $pc1 = 3; continue $sw1; }
                }
                case 7: {
                    return false;
                }
                case 4: {
                    return true;
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
    public java.lang.String getString() {
        return abcd.TP.DW(this.j6);
    }

    @Override
    public int hashCode() {
        return abcd.OP.DW(this.j6);
    }

    @Override
    void j6(abcd.CL r3) {
        r3.j6(22, this.j6);
    }

    @Override
    boolean j6(abcd.EL r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if ((r2 instanceof abcd.kM) == true) { $pc2 = 7; continue $sw2; }
                    return false;
                }
                case 7: {
                    return abcd.OP.j6(this.j6, ((abcd.kM) r2).j6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return getString();
    }

    @Override
    int v5() {
        return (abcd.OM.j6(this.j6.length) + 1) + this.j6.length;
    }
}
