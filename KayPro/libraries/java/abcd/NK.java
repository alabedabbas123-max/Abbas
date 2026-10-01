package abcd;

public final class NK {
    private static final char[] j6 = null;

    static {
        char r0 = 0;
        char[] r1 = null;
        char r2 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    j6 = new char[91];
                    r0 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    r1 = j6;
                    if (r0 >= r1.length) { $pc0 = 5; continue $sw0; }
                    r1[r0] = r0;
                    r0 = (char) (r0 + 1);
                    { $pc0 = 3; continue $sw0; }
                }
                case 5: {
                    r2 = 'A';
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (r2 > 'Z') { $pc0 = 8; continue $sw0; }
                    j6[r2] = (char) ((r2 - 'A') + 97);
                    r2 = (char) (r2 + 1);
                    { $pc0 = 7; continue $sw0; }
                }
                case 8: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean DW(java.lang.String r4) {
        java.lang.Boolean r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r4 == null) { $pc1 = 10; continue $sw1; }
                    r0 = FH(r4);
                    if (r0 == null) { $pc1 = 8; continue $sw1; }
                    return r0.booleanValue();
                }
                case 8: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().notABoolean, new java.lang.Object[]{r4}));
                }
                case 10: {
                    throw new java.lang.NullPointerException(org.eclipse.jgit.JGitText.j6().expectedBooleanStringValue);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.Boolean FH(java.lang.String r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2 != null) { $pc2 = 6; continue $sw2; }
                    return null;
                }
                case 6: {
                    if (j6("yes", r2) == true) { $pc2 = 27; continue $sw2; }
                    if (j6("true", r2) == true) { $pc2 = 27; continue $sw2; }
                    if (j6("1", r2) == true) { $pc2 = 27; continue $sw2; }
                    if (j6("on", r2) == true) { $pc2 = 27; continue $sw2; }
                    if (j6("no", r2) == true) { $pc2 = 25; continue $sw2; }
                    if (j6("false", r2) == true) { $pc2 = 25; continue $sw2; }
                    if (j6("0", r2) == true) { $pc2 = 25; continue $sw2; }
                    if (j6("off", r2) == true) { $pc2 = 25; continue $sw2; }
                    return null;
                }
                case 25: {
                    return java.lang.Boolean.FALSE;
                }
                case 27: {
                    return java.lang.Boolean.TRUE;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String Hw(java.lang.String r3) {
        java.lang.StringBuilder r0 = null;
        int r1 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = new java.lang.StringBuilder(r3.length());
                    r1 = 0;
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r1 >= r3.length()) { $pc3 = 6; continue $sw3; }
                    r0.append(j6(r3.charAt(r1)));
                    r1 = r1 + 1;
                    { $pc3 = 4; continue $sw3; }
                }
                case 6: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static char j6(char r1) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r1 <= 'Z') { $pc4 = 5; continue $sw4; }
                    return r1;
                }
                case 5: {
                    return j6[r1];
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(java.util.Collection<java.lang.String> r0, java.lang.String r1) {
        return j6(r0, r1, r1);
    }

    public static java.lang.String j6(java.util.Collection<java.lang.String> r4, java.lang.String r5, java.lang.String r6) {
        java.lang.StringBuilder r0 = null;
        int r1 = 0;
        java.util.Iterator<java.lang.String> r7 = null;
        int r2 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r1 = r4.size() - 1;
                    r7 = r4.iterator();
                    r2 = 0;
                    $pc5 = 4; continue $sw5;
                }
                case 4: {
                    if (r7.hasNext() == false) { $pc5 = 6; continue $sw5; }
                    r0.append(r7.next());
                    if (r2 != (r1 - 1)) { $pc5 = 10; continue $sw5; }
                    r0.append(r6);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    r2 = r2 + 1;
                    { $pc5 = 4; continue $sw5; }
                }
                case 10: {
                    if (r2 == r1) { $pc5 = 12; continue $sw5; }
                    r0.append(r5);
                    { $pc5 = 12; continue $sw5; }
                }
                case 6: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(java.lang.String r0) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (r0 != null) { $pc6 = 4; continue $sw6; }
                    return true;
                }
                case 4: {
                    if (r0.length() == 0) { $pc6 = 9; continue $sw6; }
                    return false;
                }
                case 9: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(java.lang.String r5, java.lang.String r6) {
        int r1 = 0;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (r5 != r6) { $pc7 = 6; continue $sw7; }
                    return true;
                }
                case 6: {
                    if (r5.length() == r6.length()) { $pc7 = 8; continue $sw7; }
                    return false;
                }
                case 8: {
                    r1 = 0;
                    $pc7 = 10; continue $sw7;
                }
                case 10: {
                    if (r1 >= r5.length()) { $pc7 = 11; continue $sw7; }
                    if (j6(r5.charAt(r1)) != j6(r6.charAt(r1))) { $pc7 = 14; continue $sw7; }
                    r1 = r1 + 1;
                    { $pc7 = 10; continue $sw7; }
                }
                case 14: {
                    return false;
                }
                case 11: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
