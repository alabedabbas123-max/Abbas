package abcd;

public abstract class HL extends abcd.EL {
    private boolean DW;
    private java.util.Vector j6;

    protected HL() {
        this.j6 = new java.util.Vector();
        this.DW = false;
    }

    protected HL(abcd.InterfaceqL r2) {
        this.j6 = new java.util.Vector();
        this.DW = false;
        this.j6.addElement(r2);
    }

    protected HL(abcd.rL r4, boolean r5) {
        this.j6 = new java.util.Vector();
        int r0 = 0;
        this.DW = false;
    L4:
        if (r0 == r4.j6()) goto L5;
        this.j6.addElement(r4.j6(r0));
        r0 = r0 + 1;
        goto L4
    L5:
        if (r5 == false) goto L10;
        EQ();
        return;
    }

    protected HL(abcd.InterfaceqL[] r4, boolean r5) {
        this.j6 = new java.util.Vector();
        int r0 = 0;
        this.DW = false;
    L4:
        if (r0 == r4.length) goto L5;
        this.j6.addElement(r4[r0]);
        r0 = r0 + 1;
        goto L4
    L5:
        if (r5 == false) goto L10;
        EQ();
        return;
    }

    public static abcd.HL j6(abcd.LL r2, boolean r3) {
        if (r3 == false) goto L10;
        if (r2.we() == false) goto L8;
        return (abcd.HL) r2.u7();
    L8:
        throw new java.lang.IllegalArgumentException("object implicit - explicit expected.");
    L10:
        if (r2.we() == false) goto L18;
        if ((r2 instanceof abcd.YL) == false) goto L16;
        return new abcd.WL(r2.u7());
    L16:
        return new abcd.FM(r2.u7());
    L18:
        if ((r2.u7() instanceof abcd.HL) == true) goto L20;
        new abcd.rL();
        if ((r2.u7() instanceof abcd.FL) == false) goto L30;
        abcd.FL r4 = (abcd.FL) r2.u7();
        if ((r2 instanceof abcd.YL) == false) goto L28;
        return new abcd.WL(r4.EQ());
    L28:
        return new abcd.FM(r4.EQ());
    L30:
        throw new java.lang.IllegalArgumentException("unknown object in getInstance: " + r2.getClass().getName());
    L20:
        return (abcd.HL) r2.u7();
    }

    public static abcd.HL j6(java.lang.Object r3) {
        if (r3 == null) goto L26;
        if ((r3 instanceof abcd.HL) == true) goto L26;
        if ((r3 instanceof abcd.IL) == false) goto L11;
        return j6(((abcd.IL) r3).DW());
    L11:
        if ((r3 instanceof byte[]) == false) goto L18;
        return j6(abcd.EL.j6((byte[]) r3));
    L14:
        e = move-exception;
        throw new java.lang.IllegalArgumentException("failed to construct set from byte[]: " + e.getMessage());
    L18:
        if ((r3 instanceof abcd.InterfaceqL) == false) goto L24;
        abcd.EL r0 = ((abcd.InterfaceqL) r3).DW();
        if ((r0 instanceof abcd.HL) == false) goto L24;
        return (abcd.HL) r0;
    L24:
        throw new java.lang.IllegalArgumentException("unknown object in getInstance: " + r3.getClass().getName());
    L26:
        return (abcd.HL) r3;
    }

    private abcd.InterfaceqL j6(java.util.Enumeration r1) {
        abcd.InterfaceqL r2 = (abcd.InterfaceqL) r1.nextElement();
        if (r2 == null) goto L5;
        return r2;
    L5:
        return abcd.mM.j6;
    }

    private boolean j6(byte[] r7, byte[] r8) {
        int r0 = java.lang.Math.min(r7.length, r8.length);
        int r2 = 0;
    L4:
        if (r2 == r0) goto L6;
        if (r7[r2] != r8[r2]) goto L12;
        r2 = r2 + 1;
        goto L4
    L12:
        if ((r7[r2] & 255) >= (r8[r2] & 255)) goto L14;
        return true;
    L14:
        return false;
    L6:
        if (r0 != r7.length) goto L8;
        return true;
    L8:
        return false;
    }

    private byte[] j6(abcd.InterfaceqL r3) {
        java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream();
        new abcd.CL(r0).j6(r3);     // Catch: java.io.IOException -> L6
        return r0.toByteArray();
    L7:
        throw new java.lang.IllegalArgumentException("cannot encode object added to SET");
    }

    protected void EQ() {
        if (this.DW == true) goto L17;
        this.DW = true;
        if (this.j6.size() <= 1) goto L22;
        int r2 = this.j6.size() - 1;
        boolean r1 = true;
    L7:
        if (r1 == false) goto L23;
        int r3 = 0;
        byte[] r4 = j6((abcd.InterfaceqL) this.j6.elementAt(0));
        int r5 = 0;
        boolean r6 = false;
    L10:
        if (r3 == r2) goto L11;
        int r7 = r3 + 1;
        byte[] r8 = j6((abcd.InterfaceqL) this.j6.elementAt(r7));
        if (j6(r4, r8) == false) goto L15;
        r4 = r8;
    L16:
        r3 = r7;
        goto L10
    L15:
        java.lang.Object r9 = this.j6.elementAt(r3);
        java.util.Vector r10 = this.j6;
        r10.setElementAt(r10.elementAt(r7), r3);
        this.j6.setElementAt(r9, r7);
        r5 = r3;
        r6 = true;
        goto L16
    L11:
        r2 = r5;
        r1 = r6;
        goto L7
    L23:
        return;
    L22:
        return;
    }

    @Override
    abcd.EL VH() {
        if (this.DW == false) goto L6;
        abcd.vM r0 = new abcd.vM();
        r0.j6 = this.j6;
        return r0;
    L6:
        java.util.Vector r1 = new java.util.Vector();
        int r2 = 0;
    L8:
        if (r2 == this.j6.size()) goto L9;
        r1.addElement(this.j6.elementAt(r2));
        r2 = r2 + 1;
        goto L8
    L9:
        abcd.vM r3 = new abcd.vM();
        r3.j6 = r1;
        r3.EQ();
        return r3;
    }

    @Override
    boolean Zo() {
        return true;
    }

    @Override
    abcd.EL gn() {
        abcd.FM r0 = new abcd.FM();
        r0.j6 = this.j6;
        return r0;
    }

    @Override
    public int hashCode() {
        java.util.Enumeration r0 = u7();
        int r1 = tp();
    L4:
        if (r0.hasMoreElements() == false) goto L5;
        r1 = (r1 * 17) ^ j6(r0).hashCode();
        goto L4
    L5:
        return r1;
    }

    public abcd.InterfaceqL j6(int r2) {
        return (abcd.InterfaceqL) this.j6.elementAt(r2);
    }

    @Override
    boolean j6(abcd.EL r5) {
        if ((r5 instanceof abcd.HL) == true) goto L5;
        return false;
    L5:
        abcd.HL r6 = (abcd.HL) r5;
        if (tp() == r6.tp()) goto L8;
        return false;
    L8:
        java.util.Enumeration r0 = u7();
        java.util.Enumeration r7 = r6.u7();
    L10:
        if (r0.hasMoreElements() == false) goto L11;
        abcd.InterfaceqL r2 = j6(r0);
        abcd.InterfaceqL r3 = j6(r7);
        abcd.EL r4 = r2.DW();
        abcd.EL r8 = r3.DW();
        if (r4 == r8) goto L10;
        if (r4.equals(r8) == true) goto L10;
        return false;
    L11:
        return true;
    }

    public java.lang.String toString() {
        return this.j6.toString();
    }

    public int tp() {
        return this.j6.size();
    }

    public java.util.Enumeration u7() {
        return this.j6.elements();
    }
}
