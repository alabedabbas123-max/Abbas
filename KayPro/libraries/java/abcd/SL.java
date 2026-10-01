package abcd;

public class SL extends abcd.AL {
    private abcd.AL[] DW;

    public SL(byte[] r1) {
        super(r1);
    }

    public SL(abcd.AL[] r2) {
        super(j6(r2));
        this.DW = r2;
    }

    private java.util.Vector EQ() {
        java.util.Vector r0 = new java.util.Vector();
        int r2 = 0;
    L3:
        byte[] r3 = this.j6;
        if (r2 >= r3.length) goto L5;
        int r4 = r2 + 1000;
        if (r4 <= r3.length) goto L9;
        int r5 = r3.length;
    L10:
        byte[] r6 = new byte[r5 - r2];
        java.lang.System.arraycopy(this.j6, r2, r6, 0, r6.length);
        r0.addElement(new abcd.pM(r6));
        r2 = r4;
        goto L3
    L9:
        r5 = r4;
        goto L10
    L5:
        return r0;
    }

    private static byte[] j6(abcd.AL[] r3) {
        java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream();
        int r1 = 0;
    L4:
        if (r1 == r3.length) goto L6;
        r0.write(((abcd.pM) r3[r1]).u7());     // Catch: java.io.IOException -> L9 java.lang.ClassCastException -> L12
        r1 = r1 + 1;
        goto L4
    L9:
        e = move-exception;
        throw new java.lang.IllegalArgumentException("exception converting octets " + e.toString());
    L13:
        throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(r3[r1].getClass().getName()) + " found in input should only contain DEROctetString");
    L6:
        return r0.toByteArray();
    }

    static abcd.AL[] j6(abcd.SL r0) {
        return r0.DW;
    }

    @Override
    boolean Zo() {
        return true;
    }

    @Override
    public void j6(abcd.CL r3) {
        r3.j6(36);
        r3.j6(128);
        java.util.Enumeration r0 = tp();
    L4:
        if (r0.hasMoreElements() == false) goto L5;
        r3.j6((abcd.InterfaceqL) r0.nextElement());
        goto L4
    L5:
        r3.j6(0);
        r3.j6(0);
    }

    public java.util.Enumeration tp() {
        if (this.DW != null) goto L7;
        return EQ().elements();
    L7:
        return new abcd.RL(this);
    }

    @Override
    public byte[] u7() {
        return this.j6;
    }

    @Override
    int v5() {
        java.util.Enumeration r0 = tp();
        int r1 = 0;
    L4:
        if (r0.hasMoreElements() == false) goto L6;
        r1 = r1 + ((abcd.InterfaceqL) r0.nextElement()).DW().v5();
        goto L4
    L6:
        return (r1 + 2) + 2;
    }
}
