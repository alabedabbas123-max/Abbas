package abcd;

public class eM extends abcd.EL {
    private static abcd.sL[] j6;
    byte[] DW;

    static {
        j6 = new abcd.sL[12];
    }

    public eM(byte[] r1) {
        this.DW = r1;
    }

    static abcd.sL DW(byte[] r3) {
        if (r3.length <= 1) goto L7;
        return new abcd.sL(abcd.OP.j6(r3));
    L7:
        if (r3.length == 0) goto L17;
        int r0 = r3[0] & 255;
        abcd.sL[] r1 = j6;
        if (r0 >= r1.length) goto L11;
        abcd.sL r2 = r1[r0];
        if (r2 != null) goto L18;
        abcd.sL r4 = new abcd.sL(abcd.OP.j6(r3));
        r1[r0] = r4;
        return r4;
    L18:
        return r2;
    L11:
        return new abcd.sL(abcd.OP.j6(r3));
    L17:
        throw new java.lang.IllegalArgumentException("ENUMERATED has zero length");
    }

    @Override
    boolean Zo() {
        return false;
    }

    @Override
    public int hashCode() {
        return abcd.OP.DW(this.DW);
    }

    @Override
    void j6(abcd.CL r3) {
        r3.j6(10, this.DW);
    }

    @Override
    boolean j6(abcd.EL r2) {
        if ((r2 instanceof abcd.eM) == true) goto L7;
        return false;
    L7:
        return abcd.OP.j6(this.DW, ((abcd.eM) r2).DW);
    }

    public java.math.BigInteger u7() {
        return new java.math.BigInteger(this.DW);
    }

    @Override
    int v5() {
        return (abcd.OM.j6(this.DW.length) + 1) + this.DW.length;
    }
}
