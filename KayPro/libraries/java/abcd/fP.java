package abcd;

public class fP implements abcd.InterfacenP {
    private java.util.Vector DW;
    private java.util.Hashtable j6;

    public fP() {
        this(new java.util.Hashtable(), new java.util.Vector());
    }

    fP(java.util.Hashtable r1, java.util.Vector r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    public abcd.InterfaceqL j6(abcd.oM r2) {
        return (abcd.InterfaceqL) this.j6.get(r2);
    }

    public java.util.Enumeration j6() {
        return this.DW.elements();
    }

    public void j6(abcd.zL r2, abcd.InterfaceqL r3) {
        if (this.j6.containsKey(r2) == false) goto L5;
        this.j6.put(r2, r3);
        return;
    L5:
        this.j6.put(r2, r3);
        this.DW.addElement(r2);
    }
}
