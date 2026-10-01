package abcd;

public class vN {
    public static java.lang.String DW(java.lang.String r5) {
        java.lang.StringBuffer r0 = null;
        char r1 = 0;
        int r2 = 0;
        char r3 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = new java.lang.StringBuffer();
                    if (r5.length() == 0) { $pc0 = 14; continue $sw0; }
                    r1 = r5.charAt(0);
                    r0.append(r1);
                    r2 = 1;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r2 >= r5.length()) { $pc0 = 14; continue $sw0; }
                    r3 = r5.charAt(r2);
                    if (r1 != ' ') { $pc0 = 11; continue $sw0; }
                    if (r3 != ' ') { $pc0 = 11; continue $sw0; }
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    r2 = r2 + 1;
                    r1 = r3;
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    r0.append(r3);
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static abcd.EL FH(java.lang.String r3) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    return abcd.EL.j6(abcd.VP.j6(r3.substring(1)));
                }
                case 5: {
                    e = $ex1;
                    throw new java.lang.IllegalStateException("unknown encoding in name: " + e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(abcd.InterfaceqL r8) {
        java.lang.StringBuffer r0 = null;
        int r4 = 0;
        int r9 = 0;
        java.lang.String r10 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new java.lang.StringBuffer();
                    r4 = 0;
                    if ((r8 instanceof abcd.KL) == true) { $pc2 = 5; continue $sw2; }
                    $pc2 = 44; continue $sw2;
                }
                case 44: {
                    try {
                        r0.append("#" + j6(abcd.VP.j6(r8.DW().j6("DER"))));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 41; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 13; continue $sw2;
                }
                case 13: {
                    r9 = r0.length();
                    if (r0.length() < 2) { $pc2 = 20; continue $sw2; }
                    if (r0.charAt(0) != '\\') { $pc2 = 20; continue $sw2; }
                    if (r0.charAt(1) != '#') { $pc2 = 20; continue $sw2; }
                    r4 = 2;
                    $pc2 = 20; continue $sw2;
                }
                case 20: {
                    if (r4 == r9) { $pc2 = 22; continue $sw2; }
                    if (r0.charAt(r4) != ',') { $pc2 = 26; continue $sw2; }
                    $pc2 = 39; continue $sw2;
                }
                case 39: {
                    r0.insert(r4, "\\");
                    r4 = r4 + 1;
                    r9 = r9 + 1;
                    $pc2 = 40; continue $sw2;
                }
                case 40: {
                    r4 = r4 + 1;
                    { $pc2 = 20; continue $sw2; }
                }
                case 26: {
                    if (r0.charAt(r4) == '\"') { $pc2 = 39; continue $sw2; }
                    if (r0.charAt(r4) == '\\') { $pc2 = 39; continue $sw2; }
                    if (r0.charAt(r4) == '+') { $pc2 = 39; continue $sw2; }
                    if (r0.charAt(r4) == '=') { $pc2 = 39; continue $sw2; }
                    if (r0.charAt(r4) == '<') { $pc2 = 39; continue $sw2; }
                    if (r0.charAt(r4) == '>') { $pc2 = 39; continue $sw2; }
                    if (r0.charAt(r4) != ';') { $pc2 = 40; continue $sw2; }
                    $pc2 = 22; continue $sw2;
                }
                case 22: {
                    return r0.toString();
                }
                case 42: {
                    throw new java.lang.IllegalArgumentException("Other value has no encoded form");
                }
                case 5: {
                    if ((r8 instanceof abcd.BM) == true) { $pc2 = 44; continue $sw2; }
                    r10 = ((abcd.KL) r8).getString();
                    if (r10.length() > 0) { $pc2 = 9; continue $sw2; }
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    r0.append(r10);
                    { $pc2 = 13; continue $sw2; }
                }
                case 9: {
                    if (r10.charAt(0) != '#') { $pc2 = 11; continue $sw2; }
                    r0.append("\\" + r10);
                    { $pc2 = 13; continue $sw2; }
                }
                case 41: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(java.lang.String r2) {
        java.lang.String r3 = null;
        java.lang.Object r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r3 = abcd.TP.DW(r2.trim());
                    if (r3.length() <= 0) { $pc3 = 10; continue $sw3; }
                    if (r3.charAt(0) != '#') { $pc3 = 10; continue $sw3; }
                    r0 = FH(r3);
                    if ((r0 instanceof abcd.KL) == false) { $pc3 = 10; continue $sw3; }
                    r3 = abcd.TP.DW(((abcd.KL) r0).getString().trim());
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    return DW(r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String j6(byte[] r3) {
        char[] r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = new char[r3.length];
                    r1 = 0;
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r1 == r0.length) { $pc4 = 6; continue $sw4; }
                    r0[r1] = (char) (r3[r1] & 255);
                    r1 = r1 + 1;
                    { $pc4 = 4; continue $sw4; }
                }
                case 6: {
                    return new java.lang.String(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.lang.StringBuffer r1, abcd.qN r2, java.util.Hashtable r3) {
        java.lang.String r4 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r4 = (java.lang.String) r3.get(r2.v5());
                    if (r4 == null) { $pc5 = 5; continue $sw5; }
                    r1.append(r4);
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    r1.append('=');
                    r1.append(j6(r2.Zo()));
                    return;
                }
                case 5: {
                    r1.append(r2.v5().tp());
                    { $pc5 = 6; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
