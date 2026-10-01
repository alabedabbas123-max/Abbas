package abcd;

public class AM extends abcd.EL implements abcd.KL {
    private byte[] j6;

    AM(byte[] r1) {
        this.j6 = r1;
    }

    @Override
    boolean Zo() {
        return false;
    }

    @Override
    public java.lang.String getString() {
        return abcd.TP.FH(this.j6);
    }

    @Override
    public int hashCode() {
        return abcd.OP.DW(this.j6);
    }

    @Override
    void j6(abcd.CL r3) {
        r3.j6(12, this.j6);
    }

    @Override
    boolean j6(abcd.EL r2) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if ((r2 instanceof abcd.AM) == true) { $pc0 = 7; continue $sw0; }
                    return false;
                }
                case 7: {
                    return abcd.OP.j6(this.j6, ((abcd.AM) r2).j6);
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
