package abcd;

public class hL {
    public static java.lang.Object DW(java.lang.String r1) {
        return j6(new java.io.StringReader(r1));
    }

    public static java.lang.Object j6(java.io.Reader r1) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    return new abcd.jL().j6(r1);
                }
                case 4: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(java.lang.Object r3) {
        java.lang.StringBuffer r0 = null;
        java.lang.Double r1 = null;
        java.lang.Float r2 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r3 != null) { $pc1 = 6; continue $sw1; }
                    return "null";
                }
                case 6: {
                    if ((r3 instanceof java.lang.String) == false) { $pc1 = 10; continue $sw1; }
                    r0 = new java.lang.StringBuffer();
                    r0.append("\"");
                    r0.append(j6((java.lang.String) r3));
                    r0.append("\"");
                    return r0.toString();
                }
                case 10: {
                    if ((r3 instanceof java.lang.Double) == false) { $pc1 = 20; continue $sw1; }
                    r1 = (java.lang.Double) r3;
                    if (r1.isInfinite() == false) { $pc1 = 14; continue $sw1; }
                    $pc1 = 18; continue $sw1;
                }
                case 18: {
                    return "null";
                }
                case 14: {
                    if (r1.isNaN() == true) { $pc1 = 18; continue $sw1; }
                    return r3.toString();
                }
                case 20: {
                    if ((r3 instanceof java.lang.Float) == false) { $pc1 = 30; continue $sw1; }
                    r2 = (java.lang.Float) r3;
                    if (r2.isInfinite() == false) { $pc1 = 24; continue $sw1; }
                    $pc1 = 28; continue $sw1;
                }
                case 28: {
                    return "null";
                }
                case 24: {
                    if (r2.isNaN() == true) { $pc1 = 28; continue $sw1; }
                    return r3.toString();
                }
                case 30: {
                    if ((r3 instanceof java.lang.Number) == false) { $pc1 = 34; continue $sw1; }
                    return r3.toString();
                }
                case 34: {
                    if ((r3 instanceof java.lang.Boolean) == false) { $pc1 = 38; continue $sw1; }
                    return r3.toString();
                }
                case 38: {
                    if ((r3 instanceof abcd.InterfaceeL) == false) { $pc1 = 42; continue $sw1; }
                    return ((abcd.InterfaceeL) r3).j6();
                }
                case 42: {
                    if ((r3 instanceof java.util.Map) == false) { $pc1 = 46; continue $sw1; }
                    return abcd.fL.j6((java.util.Map) r3);
                }
                case 46: {
                    if ((r3 instanceof java.util.List) == false) { $pc1 = 50; continue $sw1; }
                    return abcd.dL.j6((java.util.List) r3);
                }
                case 50: {
                    return r3.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(java.lang.String r1) {
        java.lang.StringBuffer r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r1 != null) { $pc2 = 5; continue $sw2; }
                    return null;
                }
                case 5: {
                    r0 = new java.lang.StringBuffer();
                    j6(r1, r0);
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(java.lang.String r5, java.lang.StringBuffer r6) {
        int r1 = 0;
        char r2 = 0;
        java.lang.String r3 = null;
        java.lang.String r4 = null;
        int r7 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r1 = 0;
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r1 >= r5.length()) { $pc3 = 43; continue $sw3; }
                    r2 = r5.charAt(r1);
                    if (r2 != '\f') { $pc3 = 8; continue $sw3; }
                    r3 = "\\f";
                    $pc3 = 36; continue $sw3;
                }
                case 36: {
                    r6.append(r3);
                    $pc3 = 42; continue $sw3;
                }
                case 42: {
                    r1 = r1 + 1;
                    { $pc3 = 4; continue $sw3; }
                }
                case 8: {
                    if (r2 != '\r') { $pc3 = 10; continue $sw3; }
                    r3 = "\\r";
                    { $pc3 = 36; continue $sw3; }
                }
                case 10: {
                    if (r2 != '\"') { $pc3 = 12; continue $sw3; }
                    r3 = "\\\"";
                    { $pc3 = 36; continue $sw3; }
                }
                case 12: {
                    if (r2 != '/') { $pc3 = 14; continue $sw3; }
                    r3 = "\\/";
                    { $pc3 = 36; continue $sw3; }
                }
                case 14: {
                    if (r2 == '\\') { $pc3 = 37; continue $sw3; }
                    switch(r2) {
                        case 8: { $pc3 = 35; continue $sw3; }
                        case 9: { $pc3 = 34; continue $sw3; }
                        case 10: { $pc3 = 33; continue $sw3; }
                        default: { $pc3 = 16; continue $sw3; }
                    };
                }
                case 16: {
                    if (r2 < 0) { $pc3 = 20; continue $sw3; }
                    if (r2 > 31) { $pc3 = 20; continue $sw3; }
                    $pc3 = 27; continue $sw3;
                }
                case 27: {
                    r4 = java.lang.Integer.toHexString(r2);
                    r6.append("\\u");
                    r7 = 0;
                    $pc3 = 29; continue $sw3;
                }
                case 29: {
                    if (r7 >= (4 - r4.length())) { $pc3 = 31; continue $sw3; }
                    r6.append('0');
                    r7 = r7 + 1;
                    { $pc3 = 29; continue $sw3; }
                }
                case 31: {
                    r3 = r4.toUpperCase();
                    $pc3 = 20; continue $sw3;
                }
                case 20: {
                    if (r2 < 127) { $pc3 = 24; continue $sw3; }
                    if (r2 <= 159) { $pc3 = 27; continue $sw3; }
                    $pc3 = 24; continue $sw3;
                }
                case 24: {
                    if (r2 >= 8192) { $pc3 = 26; continue $sw3; }
                    $pc3 = 32; continue $sw3;
                }
                case 32: {
                    r6.append(r2);
                    { $pc3 = 42; continue $sw3; }
                }
                case 26: {
                    if (r2 > 8447) { $pc3 = 32; continue $sw3; }
                    $pc3 = 33; continue $sw3;
                }
                case 33: {
                    r3 = "\\n";
                    { $pc3 = 36; continue $sw3; }
                }
                case 34: {
                    r3 = "\\t";
                    { $pc3 = 36; continue $sw3; }
                }
                case 35: {
                    r3 = "\\b";
                    { $pc3 = 36; continue $sw3; }
                }
                case 37: {
                    r3 = "\\\\";
                    { $pc3 = 36; continue $sw3; }
                }
                case 43: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
