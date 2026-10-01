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
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.j6.containsKey(r2) == false) { $pc0 = 5; continue $sw0; }
                    this.j6.put(r2, r3);
                    return;
                }
                case 5: {
                    this.j6.put(r2, r3);
                    this.DW.addElement(r2);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
