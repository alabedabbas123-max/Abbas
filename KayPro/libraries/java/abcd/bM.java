package abcd;

public class bM extends abcd.EL implements abcd.KL {
    private char[] j6;

    bM(char[] r1) {
        this.j6 = r1;
    }

    @Override
    boolean Zo() {
        return false;
    }

    @Override
    public java.lang.String getString() {
        return new java.lang.String(this.j6);
    }

    @Override
    public int hashCode() {
        return abcd.OP.j6(this.j6);
    }

    @Override
    void j6(abcd.CL r4) {
        int r0 = 0;
        char[] r1 = null;
        char r2 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r4.j6(30);
                    r4.DW(this.j6.length * 2);
                    r0 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    r1 = this.j6;
                    if (r0 == r1.length) { $pc0 = 5; continue $sw0; }
                    r2 = r1[r0];
                    r4.j6((byte) (r2 >> '\b'));
                    r4.j6((byte) r2);
                    r0 = r0 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected boolean j6(abcd.EL r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r2 instanceof abcd.bM) == true) { $pc1 = 7; continue $sw1; }
                    return false;
                }
                case 7: {
                    return abcd.OP.j6(this.j6, ((abcd.bM) r2).j6);
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
        return (abcd.OM.j6(this.j6.length * 2) + 1) + (this.j6.length * 2);
    }
}
