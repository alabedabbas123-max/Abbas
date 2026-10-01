package abcd;

public class BN extends abcd.cM {
    public BN(abcd.cM r2) {
        super(r2.u7(), r2.tp());
    }

    @Override
    public java.lang.String toString() {
        if (this.DW.length == 1) goto L5;
        java.lang.StringBuilder r0 = new java.lang.StringBuilder("KeyUsage: 0x");
        byte[] r2 = this.DW;
        r0.append(java.lang.Integer.toHexString((r2[0] & 255) | ((r2[1] & 255) << 8)));
        return r0.toString();
    L5:
        return "KeyUsage: 0x" + java.lang.Integer.toHexString(this.DW[0] & 255);
    }
}
