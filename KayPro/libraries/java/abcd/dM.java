package abcd;

public class dM extends abcd.EL {
    private static final byte[] DW = null;
    public static final abcd.oL FH = null;
    public static final abcd.oL Hw = null;
    private static final byte[] j6 = null;
    private byte[] v5;

    static {
        j6 = new byte[]{-1};
        DW = new byte[1];
        FH = new abcd.oL(false);
        Hw = new abcd.oL(true);
    }

    public dM(boolean r1) {
        if (r1 == false) goto L5;
        byte[] r2 = j6;
    L6:
        this.v5 = r2;
        return;
    L5:
        r2 = DW;
        goto L6
    }

    dM(byte[] r3) {
        if (r3.length != 1) goto L13;
        if (r3[0] != 0) goto L8;
        this.v5 = DW;
        return;
    L8:
        if (r3[0] != 255) goto L10;
        this.v5 = j6;
        return;
    L10:
        this.v5 = abcd.OP.j6(r3);
        return;
    L13:
        throw new java.lang.IllegalArgumentException("byte value should have 1 byte in it");
    }

    static abcd.oL DW(byte[] r2) {
        if (r2.length != 1) goto L15;
        if (r2[0] != 0) goto L9;
        return FH;
    L9:
        if (r2[0] != 255) goto L13;
        return Hw;
    L13:
        return new abcd.oL(r2);
    L15:
        throw new java.lang.IllegalArgumentException("byte value should have 1 byte in it");
    }

    public static abcd.oL j6(java.lang.Object r3) {
        if (r3 == null) goto L16;
        if ((r3 instanceof abcd.oL) == true) goto L16;
        if ((r3 instanceof abcd.dM) == false) goto L14;
        if (((abcd.dM) r3).u7() == false) goto L12;
        return Hw;
    L12:
        return FH;
    L14:
        throw new java.lang.IllegalArgumentException("illegal object in getInstance: " + r3.getClass().getName());
    L16:
        return (abcd.oL) r3;
    }

    public static abcd.oL j6(boolean r0) {
        if (r0 == false) goto L5;
        return Hw;
    L5:
        return FH;
    }

    @Override
    boolean Zo() {
        return false;
    }

    @Override
    public int hashCode() {
        return this.v5[0];
    }

    @Override
    void j6(abcd.CL r3) {
        r3.j6(1, this.v5);
    }

    @Override
    protected boolean j6(abcd.EL r3) {
        if (r3 != null) goto L5;
    L11:
        return false;
    L5:
        if ((r3 instanceof abcd.dM) == false) goto L11;
        if (this.v5[0] != ((abcd.dM) r3).v5[0]) goto L11;
        return true;
    }

    public java.lang.String toString() {
        if (this.v5[0] == 0) goto L5;
        return "TRUE";
    L5:
        return "FALSE";
    }

    public boolean u7() {
        if (this.v5[0] == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override
    int v5() {
        return 3;
    }
}
