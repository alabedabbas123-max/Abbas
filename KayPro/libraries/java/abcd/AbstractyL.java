package abcd;

public abstract class AbstractyL implements abcd.InterfaceqL {
    public AbstractyL() {
    }

    @Override
    public abstract abcd.EL DW();

    public byte[] Hw() {
        java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream();
        new abcd.CL(r0).j6(this);
        return r0.toByteArray();
    }

    public boolean equals(java.lang.Object r2) {
        if (this != r2) goto L6;
        return true;
    L6:
        if ((r2 instanceof abcd.InterfaceqL) == true) goto L10;
        return false;
    L10:
        return DW().equals(((abcd.InterfaceqL) r2).DW());
    }

    public int hashCode() {
        return DW().hashCode();
    }

    public byte[] j6(java.lang.String r2) {
        if (r2.equals("DER") == false) goto L7;
        java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream();
        new abcd.rM(r3).j6(this);
        return r3.toByteArray();
    L7:
        if (r2.equals("DL") == false) goto L11;
        java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream();
        new abcd.DM(r4).j6(this);
        return r4.toByteArray();
    L11:
        return Hw();
    }
}
