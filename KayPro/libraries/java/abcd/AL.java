package abcd;

public abstract class AL extends abcd.EL implements abcd.BL {
    byte[] j6;

    public AL(byte[] r2) {
        if (r2 == null) goto L7;
        this.j6 = r2;
        return;
    L7:
        throw new java.lang.NullPointerException("string cannot be null");
    }

    public static abcd.AL j6(java.lang.Object r3) {
        if (r3 == null) goto L22;
        if ((r3 instanceof abcd.AL) == true) goto L22;
        if ((r3 instanceof byte[]) == false) goto L14;
        return j6(abcd.EL.j6((byte[]) r3));
    L10:
        e = move-exception;
        throw new java.lang.IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + e.getMessage());
    L14:
        if ((r3 instanceof abcd.InterfaceqL) == false) goto L20;
        abcd.EL r0 = ((abcd.InterfaceqL) r3).DW();
        if ((r0 instanceof abcd.AL) == false) goto L20;
        return (abcd.AL) r0;
    L20:
        throw new java.lang.IllegalArgumentException("illegal object in getInstance: " + r3.getClass().getName());
    L22:
        return (abcd.AL) r3;
    }

    @Override
    public java.io.InputStream FH() {
        return new java.io.ByteArrayInputStream(this.j6);
    }

    @Override
    abcd.EL VH() {
        return new abcd.pM(this.j6);
    }

    @Override
    abcd.EL gn() {
        return new abcd.pM(this.j6);
    }

    @Override
    public int hashCode() {
        return abcd.OP.DW(u7());
    }

    @Override
    public abcd.EL j6() {
        DW();
        return this;
    }

    @Override
    boolean j6(abcd.EL r2) {
        if ((r2 instanceof abcd.AL) == true) goto L7;
        return false;
    L7:
        return abcd.OP.j6(this.j6, ((abcd.AL) r2).j6);
    }

    public java.lang.String toString() {
        return "#" + new java.lang.String(abcd.VP.j6(this.j6));
    }

    public byte[] u7() {
        return this.j6;
    }
}
