package abcd;

public class BM extends abcd.EL implements abcd.KL {
    private static final char[] j6 = null;
    private byte[] DW;

    static {
        j6 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public BM(byte[] r1) {
        this.DW = r1;
    }

    @Override
    boolean Zo() {
        return false;
    }

    @Override
    public java.lang.String getString() {
        java.lang.StringBuffer r0 = new java.lang.StringBuffer("#");
        java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream();
        new abcd.CL(r1).j6(this);     // Catch: java.io.IOException -> L10
        byte[] r2 = r1.toByteArray();
        int r3 = 0;
    L6:
        if (r3 == r2.length) goto L8;
        r0.append(j6[(r2[r3] >>> 4) & 15]);
        r0.append(j6[r2[r3] & 15]);
        r3 = r3 + 1;
        goto L6
    L8:
        return r0.toString();
    L11:
        throw new java.lang.RuntimeException("internal error encoding BitString");
    }

    @Override
    public int hashCode() {
        return abcd.OP.DW(this.DW);
    }

    @Override
    void j6(abcd.CL r3) {
        r3.j6(28, u7());
    }

    @Override
    boolean j6(abcd.EL r2) {
        if ((r2 instanceof abcd.BM) == true) goto L7;
        return false;
    L7:
        return abcd.OP.j6(this.DW, ((abcd.BM) r2).DW);
    }

    public java.lang.String toString() {
        return getString();
    }

    public byte[] u7() {
        return this.DW;
    }

    @Override
    int v5() {
        return (abcd.OM.j6(this.DW.length) + 1) + this.DW.length;
    }
}
