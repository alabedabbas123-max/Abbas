package abcd;

public class kM extends abcd.EL implements abcd.KL {
    private byte[] j6;

    public kM(java.lang.String r2) {
        this(r2, false);
    }

    public kM(java.lang.String r1, boolean r2) {
        if (r1 == null) goto L13;
        if (r2 == true) goto L6;
    L10:
        this.j6 = abcd.TP.j6(r1);
        return;
    L6:
        if (DW(r1) == true) goto L10;
        throw new java.lang.IllegalArgumentException("string contains illegal characters");
    L13:
        throw new java.lang.NullPointerException("string cannot be null");
    }

    kM(byte[] r1) {
        this.j6 = r1;
    }

    public static boolean DW(java.lang.String r4) {
        int r0 = r4.length() - 1;
    L3:
        if (r0 < 0) goto L4;
        if (r4.charAt(r0) > 127) goto L7;
        r0 = r0 - 1;
        goto L3
    L7:
        return false;
    L4:
        return true;
    }

    @Override
    boolean Zo() {
        return false;
    }

    @Override
    public java.lang.String getString() {
        return abcd.TP.DW(this.j6);
    }

    @Override
    public int hashCode() {
        return abcd.OP.DW(this.j6);
    }

    @Override
    void j6(abcd.CL r3) {
        r3.j6(22, this.j6);
    }

    @Override
    boolean j6(abcd.EL r2) {
        if ((r2 instanceof abcd.kM) == true) goto L7;
        return false;
    L7:
        return abcd.OP.j6(this.j6, ((abcd.kM) r2).j6);
    }

    public java.lang.String toString() {
        return getString();
    }

    @Override
    int v5() {
        return (abcd.OM.j6(this.j6.length) + 1) + this.j6.length;
    }
}
