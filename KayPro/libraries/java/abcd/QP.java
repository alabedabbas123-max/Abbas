package abcd;

public class QP implements abcd.SP {
    private java.util.Collection j6;

    public QP(java.util.Collection r2) {
        this.j6 = new java.util.ArrayList(r2);
    }

    @Override
    public java.util.Collection j6(abcd.RP r5) {
        java.util.ArrayList r0 = null;
        java.util.Iterator r1 = null;
        java.lang.Object r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r5 == null) { $pc0 = 4; continue $sw0; }
                    r0 = new java.util.ArrayList();
                    r1 = this.j6.iterator();
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r1.hasNext() == false) { $pc0 = 8; continue $sw0; }
                    r2 = r1.next();
                    if (r5.j6(r2) == false) { $pc0 = 7; continue $sw0; }
                    r0.add(r2);
                    { $pc0 = 7; continue $sw0; }
                }
                case 8: {
                    return r0;
                }
                case 4: {
                    return new java.util.ArrayList(this.j6);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
