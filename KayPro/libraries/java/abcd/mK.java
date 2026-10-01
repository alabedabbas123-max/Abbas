package abcd;

public class mK {
    private static final java.util.regex.Pattern DW = null;
    private static final java.util.regex.Pattern FH = null;
    private static final java.util.regex.Pattern j6 = null;

    static {
        j6 = java.util.regex.Pattern.compile("^(Bug|Issue)[a-zA-Z0-9-]*:.*$");
        DW = java.util.regex.Pattern.compile("(^[a-zA-Z0-9-]+:(?!//).*$)");
        FH = java.util.regex.Pattern.compile("^[ \\[].*$");
    }

    public static abcd.yE j6(abcd.yE r2, abcd.yE r3, abcd.KE r4, abcd.KE r5, java.lang.String r6) {
        java.lang.String r7 = null;
        java.lang.StringBuilder r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r7 = j6(r6);
                    if (r7.length() != 0) { $pc0 = 6; continue $sw0; }
                    return null;
                }
                case 6: {
                    r0 = new java.lang.StringBuilder();
                    r0.append("tree ");
                    r0.append(abcd.yE.j6(r2));
                    r0.append("\n");
                    if (r3 == null) { $pc0 = 9; continue $sw0; }
                    r0.append("parent ");
                    r0.append(abcd.yE.j6(r3));
                    r0.append("\n");
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    r0.append("author ");
                    r0.append(r4.Hw());
                    r0.append("\n");
                    r0.append("committer ");
                    r0.append(r5.Hw());
                    r0.append("\n\n");
                    r0.append(r7);
                    return new abcd.EE.a().j6(1, r0.toString().getBytes("UTF-8"));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String j6(java.lang.String r3) {
        return r3.replaceAll("(?i)(?m)^Signed-off-by:.*$\n?", "").replaceAll("(?m)^#.*$\n?", "").replaceAll("(?m)\n\n\n+", "\\\n").replaceAll("\\n*$", "").replaceAll("(?s)\ndiff --git.*", "").trim();
    }

    public static java.lang.String j6(java.lang.String r1, abcd.yE r2) {
        return j6(r1, r2, false);
    }

    public static java.lang.String j6(java.lang.String r6, abcd.yE r7, boolean r8) {
        int r9 = 0;
        java.lang.String r10 = null;
        java.lang.String[] r11 = null;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        java.lang.StringBuilder r5 = null;
        int r12 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r6.indexOf("Change-Id:") <= 0) { $pc1 = 15; continue $sw1; }
                    if (r8 == false) { $pc1 = 14; continue $sw1; }
                    r9 = r6.indexOf("Change-Id:") + 10;
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (r6.charAt(r9) != ' ') { $pc1 = 9; continue $sw1; }
                    r9 = r9 + 1;
                    { $pc1 = 7; continue $sw1; }
                }
                case 9: {
                    if (r6.length() != (r9 + 40)) { $pc1 = 11; continue $sw1; }
                    r10 = r6.substring(r9);
                    $pc1 = 64; continue $sw1;
                }
                case 64: {
                    return r6.replace(r10, "I" + r7.VH());
                }
                case 11: {
                    r10 = r6.substring(r9, r9 + 41);
                    { $pc1 = 64; continue $sw1; }
                }
                case 14: {
                    return r6;
                }
                case 15: {
                    r11 = r6.split("\n");
                    r1 = r11.length;
                    r2 = r11.length - 1;
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    if (r2 <= 1) { $pc1 = 33; continue $sw1; }
                    if (DW.matcher(r11[r2]).matches() == false) { $pc1 = 22; continue $sw1; }
                    r1 = r2;
                    $pc1 = 31; continue $sw1;
                }
                case 31: {
                    r2 = r2 - 1;
                    { $pc1 = 16; continue $sw1; }
                }
                case 22: {
                    if (r1 == r11.length) { $pc1 = 27; continue $sw1; }
                    if (r11[r2].length() == 0) { $pc1 = 33; continue $sw1; }
                    $pc1 = 27; continue $sw1;
                }
                case 27: {
                    if (r1 == r11.length) { $pc1 = 32; continue $sw1; }
                    if (FH.matcher(r11[r2]).matches() == false) { $pc1 = 32; continue $sw1; }
                    r1 = r2 + 1;
                    $pc1 = 32; continue $sw1;
                }
                case 32: {
                    r1 = r11.length;
                    $pc1 = 33; continue $sw1;
                }
                case 33: {
                    r3 = r1;
                    r4 = r3;
                    $pc1 = 35; continue $sw1;
                }
                case 35: {
                    if (r3 >= r11.length) { $pc1 = 40; continue $sw1; }
                    if (j6.matcher(r11[r3]).matches() == false) { $pc1 = 40; continue $sw1; }
                    r4 = r3 + 1;
                    r3 = r4;
                    $pc1 = 40; continue $sw1;
                }
                case 40: {
                    r5 = new java.lang.StringBuilder();
                    r12 = 0;
                    $pc1 = 41; continue $sw1;
                }
                case 41: {
                    if (r12 >= r4) { $pc1 = 43; continue $sw1; }
                    r5.append(r11[r12]);
                    r5.append("\n");
                    r12 = r12 + 1;
                    { $pc1 = 41; continue $sw1; }
                }
                case 43: {
                    if (r4 != r11.length) { $pc1 = 46; continue $sw1; }
                    if (r4 != r1) { $pc1 = 46; continue $sw1; }
                    r5.append("\n");
                    $pc1 = 46; continue $sw1;
                }
                case 46: {
                    r5.append("Change-Id:");
                    r5.append(" I");
                    r5.append(abcd.yE.j6(r7));
                    r5.append("\n");
                    $pc1 = 48; continue $sw1;
                }
                case 48: {
                    if (r12 >= r11.length) { $pc1 = 50; continue $sw1; }
                    r5.append(r11[r12]);
                    r5.append("\n");
                    r12 = r12 + 1;
                    { $pc1 = 48; continue $sw1; }
                }
                case 50: {
                    return r5.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
