package abcd;

public class AN extends abcd.AbstractyL {
    private java.util.Vector DW;
    private java.util.Hashtable j6;

    private AN(abcd.FL r9) {
        java.util.Enumeration r10 = null;
        abcd.FL r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.j6 = new java.util.Hashtable();
                    this.DW = new java.util.Vector();
                    r10 = r9.u7();
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r10.hasMoreElements() == false) { $pc0 = 5; continue $sw0; }
                    r0 = abcd.FL.j6(r10.nextElement());
                    if (r0.tp() != 3) { $pc0 = 10; continue $sw0; }
                    this.j6.put(r0.j6(0), new abcd.zN(abcd.oM.j6(r0.j6(0)), abcd.dM.j6(r0.j6(1)), abcd.AL.j6(r0.j6(2))));
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    this.DW.addElement(r0.j6(0));
                    { $pc0 = 4; continue $sw0; }
                }
                case 10: {
                    if (r0.tp() != 2) { $pc0 = 14; continue $sw0; }
                    this.j6.put(r0.j6(0), new abcd.zN(abcd.oM.j6(r0.j6(0)), false, abcd.AL.j6(r0.j6(1))));
                    { $pc0 = 12; continue $sw0; }
                }
                case 14: {
                    throw new java.lang.IllegalArgumentException("Bad sequence size: " + r0.tp());
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.AN j6(java.lang.Object r1) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if ((r1 instanceof abcd.AN) == true) { $pc1 = 5; continue $sw1; }
                    if (r1 != null) { $pc1 = 8; continue $sw1; }
                    return null;
                }
                case 8: {
                    return new abcd.AN(abcd.FL.j6(r1));
                }
                case 5: {
                    return (abcd.AN) r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.EL DW() {
        abcd.rL r0 = null;
        java.util.Enumeration r1 = null;
        abcd.zL r2 = null;
        abcd.zN r3 = null;
        abcd.rL r4 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new abcd.rL();
                    r1 = this.DW.elements();
                    $pc2 = 4; continue $sw2;
                }
                case 4: {
                    if (r1.hasMoreElements() == false) { $pc2 = 6; continue $sw2; }
                    r2 = (abcd.zL) r1.nextElement();
                    r3 = (abcd.zN) this.j6.get(r2);
                    r4 = new abcd.rL();
                    r4.j6(r2);
                    if (r3.DW() == false) { $pc2 = 10; continue $sw2; }
                    r4.j6(abcd.dM.j6(true));
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    r4.j6(r3.j6());
                    r0.j6(new abcd.tM(r4));
                    { $pc2 = 4; continue $sw2; }
                }
                case 6: {
                    return new abcd.tM(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.zN j6(abcd.zL r2) {
        return (abcd.zN) this.j6.get(r2);
    }
}
