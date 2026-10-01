package abcd;

public abstract class FL extends abcd.EL {
    protected java.util.Vector j6;

    protected FL() {
        this.j6 = new java.util.Vector();
    }

    protected FL(abcd.InterfaceqL r2) {
        this.j6 = new java.util.Vector();
        this.j6.addElement(r2);
    }

    protected FL(abcd.rL r4) {
        this.j6 = new java.util.Vector();
        int r0 = 0;
    L4:
        if (r0 == r4.j6()) goto L5;
        this.j6.addElement(r4.j6(r0));
        r0 = r0 + 1;
        goto L4
    }

    protected FL(abcd.InterfaceqL[] r4) {
        this.j6 = new java.util.Vector();
        int r0 = 0;
    L4:
        if (r0 == r4.length) goto L5;
        this.j6.addElement(r4[r0]);
        r0 = r0 + 1;
        goto L4
    }

    public static abcd.FL j6(abcd.LL r2, boolean r3) {
        if (r3 == false) goto L10;
        if (r2.we() == false) goto L8;
        abcd.EL r4 = r2.u7();
        r4.DW();
        return j6(r4);
    L8:
        throw new java.lang.IllegalArgumentException("object implicit - explicit expected.");
    L10:
        if (r2.we() == false) goto L18;
        if ((r2 instanceof abcd.YL) == false) goto L16;
        return new abcd.UL(r2.u7());
    L16:
        return new abcd.EM(r2.u7());
    L18:
        if ((r2.u7() instanceof abcd.FL) == false) goto L22;
        return (abcd.FL) r2.u7();
    L22:
        throw new java.lang.IllegalArgumentException("unknown object in getInstance: " + r2.getClass().getName());
    }

    public static abcd.FL j6(java.lang.Object r3) {
        if (r3 == null) goto L26;
        if ((r3 instanceof abcd.FL) == true) goto L26;
        if ((r3 instanceof abcd.GL) == false) goto L11;
        return j6(((abcd.GL) r3).DW());
    L11:
        if ((r3 instanceof byte[]) == false) goto L18;
        return j6(abcd.EL.j6((byte[]) r3));
    L14:
        e = move-exception;
        throw new java.lang.IllegalArgumentException("failed to construct sequence from byte[]: " + e.getMessage());
    L18:
        if ((r3 instanceof abcd.InterfaceqL) == false) goto L24;
        abcd.EL r0 = ((abcd.InterfaceqL) r3).DW();
        if ((r0 instanceof abcd.FL) == false) goto L24;
        return (abcd.FL) r0;
    L24:
        throw new java.lang.IllegalArgumentException("unknown object in getInstance: " + r3.getClass().getName());
    L26:
        return (abcd.FL) r3;
    }

    private abcd.InterfaceqL j6(java.util.Enumeration r1) {
        return (abcd.InterfaceqL) r1.nextElement();
    }

    public abcd.InterfaceqL[] EQ() {
        abcd.InterfaceqL[] r0 = new abcd.InterfaceqL[tp()];
        int r1 = 0;
    L4:
        if (r1 == tp()) goto L5;
        r0[r1] = j6(r1);
        r1 = r1 + 1;
        goto L4
    L5:
        return r0;
    }

    @Override
    abcd.EL VH() {
        abcd.tM r0 = new abcd.tM();
        r0.j6 = this.j6;
        return r0;
    }

    @Override
    boolean Zo() {
        return true;
    }

    @Override
    abcd.EL gn() {
        abcd.EM r0 = new abcd.EM();
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
        if ((r5 instanceof abcd.FL) == true) goto L5;
        return false;
    L5:
        abcd.FL r6 = (abcd.FL) r5;
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
