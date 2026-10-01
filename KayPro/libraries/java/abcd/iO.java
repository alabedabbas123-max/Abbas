package abcd;

public class iO implements abcd.WN {
    private final java.util.Hashtable j6;

    public iO() {
        this.j6 = new java.util.Hashtable();
    }

    @Override
    public abcd.RM getAttributes(java.util.Map r2) {
        return new abcd.RM(j6(r2));
    }

    protected java.util.Hashtable j6(java.util.Map r7) {
        java.util.Hashtable r0 = null;
        abcd.oM r1 = null;
        abcd.QM r2 = null;
        java.util.Date r3 = null;
        abcd.QM r4 = null;
        byte[] r8 = null;
        abcd.QM r5 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = (java.util.Hashtable) this.j6.clone();
                    if (r0.containsKey(abcd.SM.j6) == true) { $pc0 = 8; continue $sw0; }
                    r1 = (abcd.oM) r7.get("contentType");
                    if (r1 == null) { $pc0 = 8; continue $sw0; }
                    r2 = new abcd.QM(abcd.SM.j6, new abcd.vM(r1));
                    r0.put(r2.v5(), r2);
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    if (r0.containsKey(abcd.SM.FH) == true) { $pc0 = 11; continue $sw0; }
                    r3 = new java.util.Date();
                    r4 = new abcd.QM(abcd.SM.FH, new abcd.vM(new abcd.ZM(r3)));
                    r0.put(r4.v5(), r4);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    if (r0.containsKey(abcd.SM.DW) == true) { $pc0 = 13; continue $sw0; }
                    r8 = (byte[]) r7.get("digest");
                    r5 = new abcd.QM(abcd.SM.DW, new abcd.vM(new abcd.pM(r8)));
                    r0.put(r5.v5(), r5);
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
