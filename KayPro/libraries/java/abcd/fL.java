package abcd;

public class fL extends java.util.HashMap implements java.util.Map, abcd.InterfaceeL, abcd.InterfacegL {
    public fL() {
    }

    private static java.lang.String j6(java.lang.String r1, java.lang.Object r2, java.lang.StringBuffer r3) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r3.append('\"');
                    if (r1 != null) { $pc0 = 5; continue $sw0; }
                    r3.append("null");
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    r3.append('\"');
                    r3.append(':');
                    r3.append(abcd.hL.j6(r2));
                    return r3.toString();
                }
                case 5: {
                    abcd.hL.j6(r1, r3);
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(java.util.Map r4) {
        java.lang.StringBuffer r0 = null;
        boolean r1 = false;
        java.util.Iterator r5 = null;
        java.util.Map.Entry r2 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r4 != null) { $pc1 = 5; continue $sw1; }
                    return "null";
                }
                case 5: {
                    r0 = new java.lang.StringBuffer();
                    r1 = true;
                    r5 = r4.entrySet().iterator();
                    r0.append('{');
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (r5.hasNext() == false) { $pc1 = 12; continue $sw1; }
                    if (r1 == false) { $pc1 = 10; continue $sw1; }
                    r1 = false;
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    r2 = (java.util.Map.Entry) r5.next();
                    j6(java.lang.String.valueOf(r2.getKey()), r2.getValue(), r0);
                    { $pc1 = 7; continue $sw1; }
                }
                case 10: {
                    r0.append(',');
                    { $pc1 = 11; continue $sw1; }
                }
                case 12: {
                    r0.append('}');
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String j6() {
        return j6(this);
    }

    @Override
    public java.lang.String toString() {
        return j6();
    }
}
