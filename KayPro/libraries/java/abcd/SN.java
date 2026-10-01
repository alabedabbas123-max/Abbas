package abcd;

public class SN {
    private abcd.AN DW;
    private abcd.yN j6;

    public SN(abcd.yN r1) {
        this.j6 = r1;
        this.DW = r1.VH().v5();
    }

    public SN(byte[] r1) {
        this(j6(r1));
    }

    private static abcd.yN j6(byte[] r3) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    return abcd.yN.j6(abcd.EL.j6(r3));
                }
                case 8: {
                    e = $ex0;
                    throw new abcd.RN("malformed data: " + e.getMessage(), e);
                }
                case 5: {
                    e = $ex0;
                    throw new abcd.RN("malformed data: " + e.getMessage(), e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean equals(java.lang.Object r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r2 != this) { $pc1 = 6; continue $sw1; }
                    return true;
                }
                case 6: {
                    if ((r2 instanceof abcd.SN) == true) { $pc1 = 10; continue $sw1; }
                    return false;
                }
                case 10: {
                    return this.j6.equals(((abcd.SN) r2).j6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int hashCode() {
        return this.j6.hashCode();
    }

    public abcd.yN j6() {
        return this.j6;
    }
}
