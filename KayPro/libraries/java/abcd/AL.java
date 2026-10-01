package abcd;

public abstract class AL extends abcd.EL implements abcd.BL {
    byte[] j6;

    public AL(byte[] r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 == null) { $pc0 = 7; continue $sw0; }
                    this.j6 = r2;
                    return;
                }
                case 7: {
                    throw new java.lang.NullPointerException("string cannot be null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.AL j6(java.lang.Object r3) {
        abcd.EL r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r3 == null) { $pc1 = 22; continue $sw1; }
                    if ((r3 instanceof abcd.AL) == true) { $pc1 = 22; continue $sw1; }
                    if ((r3 instanceof byte[]) == false) { $pc1 = 14; continue $sw1; }
                    return j6(abcd.EL.j6((byte[]) r3));
                }
                case 10: {
                    e = $ex1;
                    throw new java.lang.IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + e.getMessage());
                }
                case 14: {
                    if ((r3 instanceof abcd.InterfaceqL) == false) { $pc1 = 20; continue $sw1; }
                    r0 = ((abcd.InterfaceqL) r3).DW();
                    if ((r0 instanceof abcd.AL) == false) { $pc1 = 20; continue $sw1; }
                    return (abcd.AL) r0;
                }
                case 20: {
                    throw new java.lang.IllegalArgumentException("illegal object in getInstance: " + r3.getClass().getName());
                }
                case 22: {
                    return (abcd.AL) r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.io.InputStream FH() {
        return new java.io.ByteArrayInputStream(this.j6);
    }

    @Override
    abcd.EL VH() {
        return new abcd.pM(this.j6);
    }

    @Override
    abcd.EL gn() {
        return new abcd.pM(this.j6);
    }

    @Override
    public int hashCode() {
        return abcd.OP.DW(u7());
    }

    @Override
    public abcd.EL j6() {
        DW();
        return this;
    }

    @Override
    boolean j6(abcd.EL r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if ((r2 instanceof abcd.AL) == true) { $pc2 = 7; continue $sw2; }
                    return false;
                }
                case 7: {
                    return abcd.OP.j6(this.j6, ((abcd.AL) r2).j6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return "#" + new java.lang.String(abcd.VP.j6(this.j6));
    }

    public byte[] u7() {
        return this.j6;
    }
}
