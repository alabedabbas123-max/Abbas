package abcd;

public class BN extends abcd.cM {
    public BN(abcd.cM r2) {
        super(r2.u7(), r2.tp());
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder r0 = null;
        byte[] r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.DW.length == 1) { $pc0 = 5; continue $sw0; }
                    r0 = new java.lang.StringBuilder("KeyUsage: 0x");
                    r2 = this.DW;
                    r0.append(java.lang.Integer.toHexString((r2[0] & 255) | ((r2[1] & 255) << 8)));
                    return r0.toString();
                }
                case 5: {
                    return "KeyUsage: 0x" + java.lang.Integer.toHexString(this.DW[0] & 255);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
