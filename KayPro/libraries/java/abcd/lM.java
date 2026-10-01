package abcd;

public class lM extends abcd.EL {
    byte[] j6;

    public lM(int r3) {
        this.j6 = java.math.BigInteger.valueOf(r3).toByteArray();
    }

    public lM(java.math.BigInteger r1) {
        this.j6 = r1.toByteArray();
    }

    public lM(byte[] r1) {
        this.j6 = r1;
    }

    public static abcd.wL j6(abcd.LL r1, boolean r2) {
        abcd.EL r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r1.u7();
                    if (r2 == true) { $pc0 = 10; continue $sw0; }
                    if ((r0 instanceof abcd.lM) == true) { $pc0 = 10; continue $sw0; }
                    return new abcd.wL(abcd.AL.j6(r1.u7()).u7());
                }
                case 10: {
                    return j6(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.wL j6(java.lang.Object r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r3 == null) { $pc1 = 13; continue $sw1; }
                    if ((r3 instanceof abcd.wL) == true) { $pc1 = 13; continue $sw1; }
                    if ((r3 instanceof abcd.lM) == false) { $pc1 = 11; continue $sw1; }
                    return new abcd.wL(((abcd.lM) r3).tp());
                }
                case 11: {
                    throw new java.lang.IllegalArgumentException("illegal object in getInstance: " + r3.getClass().getName());
                }
                case 13: {
                    return (abcd.wL) r3;
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
        int r0 = 0;
        int r1 = 0;
        byte[] r2 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = 0;
                    r1 = 0;
                    $pc2 = 3; continue $sw2;
                }
                case 3: {
                    r2 = this.j6;
                    if (r0 == r2.length) { $pc2 = 5; continue $sw2; }
                    r1 = r1 ^ ((r2[r0] & 255) << (r0 % 4));
                    r0 = r0 + 1;
                    { $pc2 = 3; continue $sw2; }
                }
                case 5: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    void j6(abcd.CL r3) {
        r3.j6(2, this.j6);
    }

    @Override
    boolean j6(abcd.EL r2) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if ((r2 instanceof abcd.lM) == true) { $pc3 = 7; continue $sw3; }
                    return false;
                }
                case 7: {
                    return abcd.OP.j6(this.j6, ((abcd.lM) r2).j6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return tp().toString();
    }

    public java.math.BigInteger tp() {
        return new java.math.BigInteger(this.j6);
    }

    public java.math.BigInteger u7() {
        return new java.math.BigInteger(1, this.j6);
    }

    @Override
    int v5() {
        return (abcd.OM.j6(this.j6.length) + 1) + this.j6.length;
    }
}
