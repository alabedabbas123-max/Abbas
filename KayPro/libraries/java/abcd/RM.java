package abcd;

public class RM {
    private java.util.Hashtable j6;

    public RM(java.util.Hashtable r2) {
        this.j6 = new java.util.Hashtable();
        this.j6 = j6(r2);
    }

    private java.util.Hashtable j6(java.util.Hashtable r5) {
        java.util.Hashtable r0 = null;
        java.util.Enumeration r1 = null;
        java.lang.Object r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new java.util.Hashtable();
                    r1 = r5.keys();
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r1.hasMoreElements() == false) { $pc0 = 5; continue $sw0; }
                    r2 = r1.nextElement();
                    r0.put(r2, r5.get(r2));
                    { $pc0 = 4; continue $sw0; }
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.rL j6() {
        abcd.rL r0 = null;
        java.util.Enumeration r1 = null;
        java.lang.Object r2 = null;
        java.util.Enumeration r3 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = new abcd.rL();
                    r1 = this.j6.elements();
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r1.hasMoreElements() == false) { $pc1 = 5; continue $sw1; }
                    r2 = r1.nextElement();
                    if ((r2 instanceof java.util.Vector) == true) { $pc1 = 8; continue $sw1; }
                    r0.j6(abcd.QM.j6(r2));
                    { $pc1 = 4; continue $sw1; }
                }
                case 8: {
                    r3 = ((java.util.Vector) r2).elements();
                    $pc1 = 10; continue $sw1;
                }
                case 10: {
                    if (r3.hasMoreElements() == false) { $pc1 = 4; continue $sw1; }
                    r0.j6(abcd.QM.j6(r3.nextElement()));
                    { $pc1 = 10; continue $sw1; }
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
