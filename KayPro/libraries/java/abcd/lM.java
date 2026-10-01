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
        abcd.EL r0 = r1.u7();
        if (r2 == true) goto L10;
        if ((r0 instanceof abcd.lM) == true) goto L10;
        return new abcd.wL(abcd.AL.j6(r1.u7()).u7());
    L10:
        return j6(r0);
    }

    public static abcd.wL j6(java.lang.Object r3) {
        if (r3 == null) goto L13;
        if ((r3 instanceof abcd.wL) == true) goto L13;
        if ((r3 instanceof abcd.lM) == false) goto L11;
        return new abcd.wL(((abcd.lM) r3).tp());
    L11:
        throw new java.lang.IllegalArgumentException("illegal object in getInstance: " + r3.getClass().getName());
    L13:
        return (abcd.wL) r3;
    }

    @Override
    boolean Zo() {
        return false;
    }

    @Override
    public int hashCode() {
        int r0 = 0;
        int r1 = 0;
    L3:
        byte[] r2 = this.j6;
        if (r0 == r2.length) goto L5;
        r1 = r1 ^ ((r2[r0] & 255) << (r0 % 4));
        r0 = r0 + 1;
        goto L3
    L5:
        return r1;
    }

    @Override
    void j6(abcd.CL r3) {
        r3.j6(2, this.j6);
    }

    @Override
    boolean j6(abcd.EL r2) {
        if ((r2 instanceof abcd.lM) == true) goto L7;
        return false;
    L7:
        return abcd.OP.j6(this.j6, ((abcd.lM) r2).j6);
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
