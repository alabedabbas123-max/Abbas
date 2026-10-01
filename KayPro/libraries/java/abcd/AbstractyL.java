package abcd;

public abstract class AbstractyL implements abcd.InterfaceqL {
    public AbstractyL() {
    }

    @Override
    public abstract abcd.EL DW();

    public byte[] Hw() {
        java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream();
        new abcd.CL(r0).j6(this);
        return r0.toByteArray();
    }

    public boolean equals(java.lang.Object r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this != r2) { $pc0 = 6; continue $sw0; }
                    return true;
                }
                case 6: {
                    if ((r2 instanceof abcd.InterfaceqL) == true) { $pc0 = 10; continue $sw0; }
                    return false;
                }
                case 10: {
                    return DW().equals(((abcd.InterfaceqL) r2).DW());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        return DW().hashCode();
    }

    public byte[] j6(java.lang.String r2) {
        java.io.ByteArrayOutputStream r3 = null;
        java.io.ByteArrayOutputStream r4 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r2.equals("DER") == false) { $pc1 = 7; continue $sw1; }
                    r3 = new java.io.ByteArrayOutputStream();
                    new abcd.rM(r3).j6(this);
                    return r3.toByteArray();
                }
                case 7: {
                    if (r2.equals("DL") == false) { $pc1 = 11; continue $sw1; }
                    r4 = new java.io.ByteArrayOutputStream();
                    new abcd.DM(r4).j6(this);
                    return r4.toByteArray();
                }
                case 11: {
                    return Hw();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
