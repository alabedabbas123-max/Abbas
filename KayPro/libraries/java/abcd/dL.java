package abcd;

public class dL extends java.util.ArrayList implements java.util.List, abcd.InterfaceeL, abcd.InterfacegL {
    public dL() {
    }

    public static java.lang.String j6(java.util.List r4) {
        boolean r1 = false;
        java.lang.StringBuffer r2 = null;
        java.util.Iterator r5 = null;
        java.lang.Object r3 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r4 != null) { $pc0 = 5; continue $sw0; }
                    return "null";
                }
                case 5: {
                    r1 = true;
                    r2 = new java.lang.StringBuffer();
                    r5 = r4.iterator();
                    r2.append('[');
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r5.hasNext() == false) { $pc0 = 15; continue $sw0; }
                    if (r1 == false) { $pc0 = 10; continue $sw0; }
                    r1 = false;
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    r3 = r5.next();
                    if (r3 == null) { $pc0 = 13; continue $sw0; }
                    r2.append(abcd.hL.j6(r3));
                    { $pc0 = 7; continue $sw0; }
                }
                case 13: {
                    r2.append("null");
                    { $pc0 = 7; continue $sw0; }
                }
                case 10: {
                    r2.append(',');
                    { $pc0 = 11; continue $sw0; }
                }
                case 15: {
                    r2.append(']');
                    return r2.toString();
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
