package abcd;

public class RM {
    private java.util.Hashtable j6;

    public RM(java.util.Hashtable r2) {
        this.j6 = new java.util.Hashtable();
        this.j6 = j6(r2);
    }

    private java.util.Hashtable j6(java.util.Hashtable r5) {
        java.util.Hashtable r0 = new java.util.Hashtable();
        java.util.Enumeration r1 = r5.keys();
    L4:
        if (r1.hasMoreElements() == false) goto L5;
        java.lang.Object r2 = r1.nextElement();
        r0.put(r2, r5.get(r2));
        goto L4
    L5:
        return r0;
    }

    public abcd.rL j6() {
        abcd.rL r0 = new abcd.rL();
        java.util.Enumeration r1 = this.j6.elements();
    L4:
        if (r1.hasMoreElements() == false) goto L5;
        java.lang.Object r2 = r1.nextElement();
        if ((r2 instanceof java.util.Vector) == true) goto L8;
        r0.j6(abcd.QM.j6(r2));
        goto L4
    L8:
        java.util.Enumeration r3 = ((java.util.Vector) r2).elements();
    L10:
        if (r3.hasMoreElements() == false) goto L4;
        r0.j6(abcd.QM.j6(r3.nextElement()));
        goto L10
    L5:
        return r0;
    }
}
