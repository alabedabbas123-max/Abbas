package abcd;

public class cM extends abcd.EL implements abcd.KL {
    private static final char[] j6 = null;
    protected byte[] DW;
    protected int FH;

    static {
        j6 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public cM(abcd.InterfaceqL r4) {
        this.DW = r4.DW().j6("DER");     // Catch: java.io.IOException -> L5
        this.FH = 0;     // Catch: java.io.IOException -> L5
        return;
    L5:
        e = move-exception;
        throw new java.lang.IllegalArgumentException("Error processing object : " + e.toString());
    }

    public cM(byte[] r2) {
        this(r2, 0);
    }

    public cM(byte[] r1, int r2) {
        this.DW = r1;
        this.FH = r2;
    }

    static abcd.cM DW(byte[] r5) {
        if (r5.length < 1) goto L10;
        byte r2 = r5[0];
        byte[] r3 = new byte[r5.length - 1];
        if (r3.length == 0) goto L8;
        java.lang.System.arraycopy(r5, 1, r3, 0, r5.length - 1);
    L8:
        return new abcd.cM(r3, r2);
    L10:
        throw new java.lang.IllegalArgumentException("truncated BIT STRING detected");
    }

    static abcd.cM j6(int r2, java.io.InputStream r3) {
        if (r2 < 1) goto L14;
        int r1 = r3.read();
        byte[] r4 = new byte[r2 - 1];
        if (r4.length == 0) goto L12;
        if (abcd.XP.j6(r3, r4) == r4.length) goto L12;
        throw new java.io.EOFException("EOF encountered in middle of BIT STRING");
    L12:
        return new abcd.cM(r4, r1);
    L14:
        throw new java.lang.IllegalArgumentException("truncated BIT STRING detected");
    }

    public static abcd.cM j6(abcd.LL r0, boolean r1) {
        abcd.EL r2 = r0.u7();
        if (r1 == true) goto L10;
        if ((r2 instanceof abcd.cM) == true) goto L10;
        return DW(((abcd.AL) r2).u7());
    L10:
        return j6(r2);
    }

    public static abcd.cM j6(java.lang.Object r3) {
        if (r3 == null) goto L9;
        if ((r3 instanceof abcd.cM) == true) goto L9;
        throw new java.lang.IllegalArgumentException("illegal object in getInstance: " + r3.getClass().getName());
    L9:
        return (abcd.cM) r3;
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
        return this.FH ^ abcd.OP.DW(this.DW);
    }

    @Override
    void j6(abcd.CL r6) {
        byte[] r0 = new byte[u7().length + 1];
        r0[0] = (byte) tp();
        java.lang.System.arraycopy(u7(), 0, r0, 1, r0.length - 1);
        r6.j6(3, r0);
    }

    @Override
    protected boolean j6(abcd.EL r4) {
        if ((r4 instanceof abcd.cM) == true) goto L5;
        return false;
    L5:
        abcd.cM r5 = (abcd.cM) r4;
        if (this.FH == r5.FH) goto L8;
    L11:
        return false;
    L8:
        if (abcd.OP.j6(this.DW, r5.DW) == false) goto L11;
        return true;
    }

    public java.lang.String toString() {
        return getString();
    }

    public int tp() {
        return this.FH;
    }

    public byte[] u7() {
        return this.DW;
    }

    @Override
    int v5() {
        return ((abcd.OM.j6(this.DW.length + 1) + 1) + this.DW.length) + 1;
    }
}
