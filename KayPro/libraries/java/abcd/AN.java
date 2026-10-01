package abcd;

public class AN extends abcd.AbstractyL {
    private java.util.Vector DW;
    private java.util.Hashtable j6;

    private AN(abcd.FL r9) {
        this.j6 = new java.util.Hashtable();
        this.DW = new java.util.Vector();
        java.util.Enumeration r10 = r9.u7();
    L4:
        if (r10.hasMoreElements() == false) goto L5;
        abcd.FL r0 = abcd.FL.j6(r10.nextElement());
        if (r0.tp() != 3) goto L10;
        this.j6.put(r0.j6(0), new abcd.zN(abcd.oM.j6(r0.j6(0)), abcd.dM.j6(r0.j6(1)), abcd.AL.j6(r0.j6(2))));
    L12:
        this.DW.addElement(r0.j6(0));
        goto L4
    L10:
        if (r0.tp() != 2) goto L14;
        this.j6.put(r0.j6(0), new abcd.zN(abcd.oM.j6(r0.j6(0)), false, abcd.AL.j6(r0.j6(1))));
        goto L12
    L14:
        throw new java.lang.IllegalArgumentException("Bad sequence size: " + r0.tp());
    }

    public static abcd.AN j6(java.lang.Object r1) {
        if ((r1 instanceof abcd.AN) == true) goto L5;
        if (r1 != null) goto L8;
        return null;
    L8:
        return new abcd.AN(abcd.FL.j6(r1));
    L5:
        return (abcd.AN) r1;
    }

    @Override
    public abcd.EL DW() {
        abcd.rL r0 = new abcd.rL();
        java.util.Enumeration r1 = this.DW.elements();
    L4:
        if (r1.hasMoreElements() == false) goto L6;
        abcd.zL r2 = (abcd.zL) r1.nextElement();
        abcd.zN r3 = (abcd.zN) this.j6.get(r2);
        abcd.rL r4 = new abcd.rL();
        r4.j6(r2);
        if (r3.DW() == false) goto L10;
        r4.j6(abcd.dM.j6(true));
    L10:
        r4.j6(r3.j6());
        r0.j6(new abcd.tM(r4));
        goto L4
    L6:
        return new abcd.tM(r0);
    }

    public abcd.zN j6(abcd.zL r2) {
        return (abcd.zN) this.j6.get(r2);
    }
}
