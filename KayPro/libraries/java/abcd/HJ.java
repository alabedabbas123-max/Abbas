package abcd;

public class HJ implements java.io.Serializable {
    private static final java.util.regex.Pattern DW = null;
    private static final java.util.regex.Pattern FH = null;
    private static final java.util.regex.Pattern Hw = null;
    private static final java.util.BitSet Zo = null;
    private static final java.util.regex.Pattern j6 = null;
    private static final java.util.regex.Pattern v5 = null;
    private java.lang.String EQ;
    private java.lang.String J0;
    private java.lang.String VH;
    private java.lang.String gn;
    private java.lang.String tp;
    private java.lang.String u7;
    private int we;

    static {
        byte[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        byte r3 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    j6 = java.util.regex.Pattern.compile("^([a-z][a-z0-9+-]+)://(?:(?:([^/:@]+)(?::([^\\\\/]+))?@)?([^\\\\/:]+)(?::(\\d+))?((?:/~(?:[^\\\\/]+))?[\\\\/]))?(.+)?$");
                    DW = java.util.regex.Pattern.compile("^([\\\\/]?((?:[A-Za-z]:)?[\\\\/]?(?:(?:[^\\\\/]+[\\\\/])*[^\\\\/]+[\\\\/]?)))$");
                    FH = java.util.regex.Pattern.compile("^(file):([\\\\/](?![\\\\/])((?:[A-Za-z]:)?[\\\\/]?(?:(?:[^\\\\/]+[\\\\/])*[^\\\\/]+[\\\\/]?)))$");
                    Hw = java.util.regex.Pattern.compile("^(?:([^/:@]+)(?::([^\\\\/]+))?@)?([^\\\\/:]+):((?:(?:/~(?:[^\\\\/]+))[\\\\/])?(?:(?:[^\\\\/]+[\\\\/])*[^\\\\/]+[\\\\/]?))$");
                    v5 = java.util.regex.Pattern.compile("^(?:([^/:@]+)(?::([^\\\\/]+))?@)?([^\\\\/:]{2,}):([\\\\/](?:(?:[^\\\\/]+[\\\\/])*[^\\\\/]+[\\\\/]?))$");
                    Zo = new java.util.BitSet(127);
                    r0 = abcd.hE.DW("!*'();:@&=+$,/?#[]");
                    r1 = r0.length;
                    r2 = 0;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r2 >= r1) { $pc0 = 4; continue $sw0; }
                    r3 = r0[r2];
                    Zo.set(r3);
                    r2 = r2 + 1;
                    { $pc0 = 3; continue $sw0; }
                }
                case 4: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public HJ() {
        this.we = -1;
    }

    private HJ(abcd.HJ r2) {
        this.we = -1;
        this.VH = r2.VH;
        this.u7 = r2.u7;
        this.gn = r2.gn;
        this.tp = r2.tp;
        this.EQ = r2.EQ;
        this.we = r2.we;
        this.J0 = r2.J0;
    }

    public HJ(java.lang.String r7) {
        java.util.regex.Matcher r0 = null;
        java.util.regex.Matcher r1 = null;
        java.util.regex.Matcher r2 = null;
        java.util.regex.Matcher r3 = null;
        java.util.regex.Matcher r4 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    this.we = -1;
                    if (abcd.NK.j6(r7) == true) { $pc1 = 30; continue $sw1; }
                    r0 = FH.matcher(r7);
                    if (r0.matches() == false) { $pc1 = 8; continue $sw1; }
                    this.VH = r0.group(1);
                    this.u7 = j6(r0.group(2), this.VH);
                    this.gn = VH(this.u7);
                    return;
                }
                case 8: {
                    r1 = j6.matcher(r7);
                    if (r1.matches() == false) { $pc1 = 15; continue $sw1; }
                    this.VH = r1.group(1);
                    this.tp = VH(r1.group(2));
                    this.EQ = VH(r1.group(3));
                    this.J0 = VH(r1.group(4));
                    if (r1.group(5) == null) { $pc1 = 13; continue $sw1; }
                    this.we = java.lang.Integer.parseInt(r1.group(5));
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    this.u7 = j6(java.lang.String.valueOf(Zo(r1.group(6))) + Zo(r1.group(7)), this.VH);
                    this.gn = VH(this.u7);
                    return;
                }
                case 15: {
                    r2 = Hw.matcher(r7);
                    if (r2.matches() == false) { $pc1 = 19; continue $sw1; }
                    this.tp = r2.group(1);
                    this.EQ = r2.group(2);
                    this.J0 = r2.group(3);
                    this.u7 = r2.group(4);
                    this.gn = this.u7;
                    return;
                }
                case 19: {
                    r3 = v5.matcher(r7);
                    if (r3.matches() == false) { $pc1 = 23; continue $sw1; }
                    this.tp = r3.group(1);
                    this.EQ = r3.group(2);
                    this.J0 = r3.group(3);
                    this.u7 = r3.group(4);
                    this.gn = this.u7;
                    return;
                }
                case 23: {
                    r4 = DW.matcher(r7);
                    if (r4.matches() == false) { $pc1 = 28; continue $sw1; }
                    this.u7 = r4.group(1);
                    this.gn = this.u7;
                    return;
                }
                case 28: {
                    throw new java.net.URISyntaxException(r7, org.eclipse.jgit.JGitText.j6().cannotParseGitURIish);
                }
                case 30: {
                    throw new java.net.URISyntaxException("The uri was empty or null", org.eclipse.jgit.JGitText.j6().cannotParseGitURIish);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public HJ(java.net.URL r4) {
        java.lang.String r0 = null;
        int r1 = 0;
        java.lang.String r2 = null;
        java.lang.String r3 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    this.we = -1;
                    this.VH = r4.getProtocol();
                    this.gn = r4.getPath();
                    try {
                        this.u7 = r4.toURI().getRawPath();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.net.URISyntaxException) { $pc2 = 17; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r0 = r4.getUserInfo();
                    if (r0 == null) { $pc2 = 15; continue $sw2; }
                    r1 = r0.indexOf(58);
                    if (r1 >= 0) { $pc2 = 9; continue $sw2; }
                    r2 = r0;
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    this.tp = r2;
                    if (r1 >= 0) { $pc2 = 13; continue $sw2; }
                    r3 = null;
                    $pc2 = 14; continue $sw2;
                }
                case 14: {
                    this.EQ = r3;
                    { $pc2 = 15; continue $sw2; }
                }
                case 13: {
                    r3 = r0.substring(r1 + 1);
                    { $pc2 = 14; continue $sw2; }
                }
                case 9: {
                    r2 = r0.substring(0, r1);
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    this.we = r4.getPort();
                    this.J0 = r4.getHost();
                    return;
                }
                case 17: {
                    e = $ex2;
                    throw new java.lang.RuntimeException(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean DW(java.lang.String r0, java.lang.String r1) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r0 != r1) { $pc3 = 5; continue $sw3; }
                    return true;
                }
                case 5: {
                    if (r0 == null) { $pc3 = 10; continue $sw3; }
                    if (r1 != null) { $pc3 = 9; continue $sw3; }
                    return false;
                }
                case 9: {
                    return r0.equals(r1);
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String VH(java.lang.String r8) {
        byte[] r1 = null;
        byte[] r2 = null;
        int r4 = 0;
        int r5 = 0;
        byte r6 = 0;
        int r7 = 0;
        int r9 = 0;
        int r10 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r8 != null) { $pc4 = 6; continue $sw4; }
                    return null;
                }
                case 6: {
                    if (r8.indexOf(37) >= 0) { $pc4 = 27; continue $sw4; }
                    return r8;
                }
                case 27: {
                    try {
                        r1 = r8.getBytes("UTF-8");
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.UnsupportedEncodingException) { $pc4 = 23; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r2 = new byte[r1.length];
                    r4 = 0;
                    r5 = 0;
                    $pc4 = 11; continue $sw4;
                }
                case 11: {
                    if (r4 >= r1.length) { $pc4 = 13; continue $sw4; }
                    r6 = r1[r4];
                    if (r6 != 37) { $pc4 = 21; continue $sw4; }
                    r7 = r4 + 2;
                    if (r7 >= r1.length) { $pc4 = 20; continue $sw4; }
                    r9 = (abcd.IK.j6(r1[r4 + 1]) << 4) | abcd.IK.j6(r1[r7]);
                    r10 = r5 + 1;
                    r2[r5] = (byte) r9;
                    r4 = r7;
                    $pc4 = 22; continue $sw4;
                }
                case 22: {
                    r5 = r10;
                    r4 = r4 + 1;
                    { $pc4 = 11; continue $sw4; }
                }
                case 20: {
                    throw new java.net.URISyntaxException(r8, org.eclipse.jgit.JGitText.j6().cannotParseGitURIish);
                }
                case 21: {
                    r10 = r5 + 1;
                    r2[r5] = r6;
                    { $pc4 = 22; continue $sw4; }
                }
                case 13: {
                    return abcd.IK.j6(r2, 0, r5);
                }
                case 23: {
                    e = $ex4;
                    throw new java.lang.RuntimeException(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.String Zo(java.lang.String r1) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r1 != null) { $pc5 = 5; continue $sw5; }
                    return "";
                }
                case 5: {
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.String j6(java.lang.String r7, java.lang.String r8) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (r7.length() >= 3) { $pc6 = 5; continue $sw6; }
                    $pc6 = 18; continue $sw6;
                }
                case 18: {
                    if (r8 != null) { $pc6 = 20; continue $sw6; }
                    return r7;
                }
                case 20: {
                    if (r7.length() >= 2) { $pc6 = 22; continue $sw6; }
                    return r7;
                }
                case 22: {
                    if (r7.charAt(0) == '/') { $pc6 = 24; continue $sw6; }
                    return r7;
                }
                case 24: {
                    if (r7.charAt(1) == '~') { $pc6 = 26; continue $sw6; }
                    return r7;
                }
                case 26: {
                    return r7.substring(1);
                }
                case 5: {
                    if (r7.charAt(0) != '/') { $pc6 = 18; continue $sw6; }
                    if (r7.charAt(2) != ':') { $pc6 = 18; continue $sw6; }
                    if (r7.charAt(1) < 'A') { $pc6 = 13; continue $sw6; }
                    if (r7.charAt(1) > 'Z') { $pc6 = 13; continue $sw6; }
                    $pc6 = 17; continue $sw6;
                }
                case 17: {
                    return r7.substring(1);
                }
                case 13: {
                    if (r7.charAt(1) < 'a') { $pc6 = 18; continue $sw6; }
                    if (r7.charAt(1) > 'z') { $pc6 = 18; continue $sw6; }
                    { $pc6 = 18; continue $sw6; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String j6(java.lang.String r6, boolean r7, boolean r8) {
        java.io.ByteArrayOutputStream r0 = null;
        byte[] r9 = null;
        int r2 = 0;
        int r3 = 0;
        byte[] r4 = null;
        byte[] r10 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (r6 != null) { $pc7 = 5; continue $sw7; }
                    return null;
                }
                case 5: {
                    r0 = new java.io.ByteArrayOutputStream(r6.length());
                    try {
                        r9 = r6.getBytes("UTF-8");
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.io.UnsupportedEncodingException) { $pc7 = 25; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r2 = 0;
                    $pc7 = 9; continue $sw7;
                }
                case 9: {
                    if (r2 >= r9.length) { $pc7 = 10; continue $sw7; }
                    r3 = r9[r2] & 255;
                    if (r3 <= 32) { $pc7 = 23; continue $sw7; }
                    if (r8 == true) { $pc7 = 16; continue $sw7; }
                    $pc7 = 17; continue $sw7;
                }
                case 17: {
                    if (r3 == 37) { $pc7 = 23; continue $sw7; }
                    if (r7 == true) { $pc7 = 20; continue $sw7; }
                    $pc7 = 22; continue $sw7;
                }
                case 22: {
                    r0.write(r3);
                    $pc7 = 24; continue $sw7;
                }
                case 24: {
                    r2 = r2 + 1;
                    { $pc7 = 9; continue $sw7; }
                }
                case 20: {
                    if (Zo.get(r3) == false) { $pc7 = 22; continue $sw7; }
                    $pc7 = 16; continue $sw7;
                }
                case 16: {
                    if (r3 <= 127) { $pc7 = 17; continue $sw7; }
                    $pc7 = 23; continue $sw7;
                }
                case 23: {
                    r0.write(37);
                    r4 = abcd.hE.DW(java.lang.String.format("%02x", new java.lang.Object[]{java.lang.Integer.valueOf(r3)}));
                    r0.write(r4[0]);
                    r0.write(r4[1]);
                    { $pc7 = 24; continue $sw7; }
                }
                case 10: {
                    r10 = r0.toByteArray();
                    return abcd.IK.j6(r10, 0, r10.length);
                }
                case 25: {
                    e = $ex7;
                    throw new java.lang.RuntimeException(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.String j6(boolean r4, boolean r5, boolean r6) {
        java.lang.StringBuilder r7 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r7 = new java.lang.StringBuilder();
                    if (VH() == null) { $pc8 = 6; continue $sw8; }
                    r7.append(VH());
                    r7.append("://");
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    if (gn() == null) { $pc8 = 13; continue $sw8; }
                    r7.append(j6(gn(), true, r6));
                    if (r4 == false) { $pc8 = 13; continue $sw8; }
                    if (FH() == null) { $pc8 = 13; continue $sw8; }
                    r7.append(':');
                    r7.append(j6(FH(), true, r6));
                    $pc8 = 13; continue $sw8;
                }
                case 13: {
                    if (j6() == null) { $pc8 = 23; continue $sw8; }
                    if (gn() == null) { $pc8 = 17; continue $sw8; }
                    r7.append('@');
                    $pc8 = 17; continue $sw8;
                }
                case 17: {
                    r7.append(j6(j6(), false, r6));
                    if (VH() == null) { $pc8 = 23; continue $sw8; }
                    if (v5() <= 0) { $pc8 = 23; continue $sw8; }
                    r7.append(':');
                    r7.append(v5());
                    $pc8 = 23; continue $sw8;
                }
                case 23: {
                    if (Hw() == null) { $pc8 = 39; continue $sw8; }
                    if (VH() == null) { $pc8 = 30; continue $sw8; }
                    if (Hw().startsWith("/") == true) { $pc8 = 33; continue $sw8; }
                    r7.append('/');
                    $pc8 = 33; continue $sw8;
                }
                case 33: {
                    if (VH() == null) { $pc8 = 37; continue $sw8; }
                    if (r6 == false) { $pc8 = 36; continue $sw8; }
                    r7.append(j6(Hw(), false, r6));
                    { $pc8 = 39; continue $sw8; }
                }
                case 36: {
                    r7.append(Zo());
                    { $pc8 = 39; continue $sw8; }
                }
                case 37: {
                    r7.append(Hw());
                    { $pc8 = 39; continue $sw8; }
                }
                case 30: {
                    if (j6() == null) { $pc8 = 33; continue $sw8; }
                    r7.append(':');
                    $pc8 = 39; continue $sw8;
                }
                case 39: {
                    return r7.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.HJ DW(java.lang.String r2) {
        abcd.HJ r0 = new abcd.HJ(this);
        r0.EQ = r2;
        return r0;
    }

    public java.lang.String DW() {
        java.lang.String r0 = null;
        java.lang.String[] r1 = null;
        java.lang.String r2 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if ("".equals(Hw()) == true) { $pc9 = 25; continue $sw9; }
                    if (Hw() == null) { $pc9 = 25; continue $sw9; }
                    r0 = Hw();
                    if ("file".equals(this.VH) == false) { $pc9 = 9; continue $sw9; }
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    r1 = r0.split("[\\" + java.io.File.separatorChar + "/]");
                    $pc9 = 14; continue $sw9;
                }
                case 14: {
                    if (r1.length == 0) { $pc9 = 23; continue $sw9; }
                    r2 = r1[r1.length - 1];
                    if (".git".equals(r2) == false) { $pc9 = 19; continue $sw9; }
                    return r1[r1.length - 2];
                }
                case 19: {
                    if (r2.endsWith(".git") == true) { $pc9 = 21; continue $sw9; }
                    return r2;
                }
                case 21: {
                    return r2.substring(0, r2.length() - 4);
                }
                case 23: {
                    throw new java.lang.IllegalArgumentException();
                }
                case 9: {
                    if (DW.matcher(r0).matches() == true) { $pc9 = 12; continue $sw9; }
                    r1 = r0.split("/");
                    $pc9 = 25; continue $sw9;
                }
                case 25: {
                    throw new java.lang.IllegalArgumentException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.HJ FH(java.lang.String r2) {
        abcd.HJ r0 = new abcd.HJ(this);
        r0.gn = r2;
        r0.u7 = r2;
        return r0;
    }

    public java.lang.String FH() {
        return this.EQ;
    }

    public abcd.HJ Hw(java.lang.String r2) {
        abcd.HJ r0 = new abcd.HJ(this);
        r0.VH = r2;
        return r0;
    }

    public java.lang.String Hw() {
        return this.gn;
    }

    public java.lang.String VH() {
        return this.VH;
    }

    public java.lang.String Zo() {
        return this.u7;
    }

    public boolean equals(java.lang.Object r4) {
        abcd.HJ r5 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if ((r4 instanceof abcd.HJ) == true) { $pc10 = 5; continue $sw10; }
                    return false;
                }
                case 5: {
                    r5 = (abcd.HJ) r4;
                    if (DW(VH(), r5.VH()) == true) { $pc10 = 9; continue $sw10; }
                    return false;
                }
                case 9: {
                    if (DW(gn(), r5.gn()) == true) { $pc10 = 12; continue $sw10; }
                    return false;
                }
                case 12: {
                    if (DW(FH(), r5.FH()) == true) { $pc10 = 15; continue $sw10; }
                    return false;
                }
                case 15: {
                    if (DW(j6(), r5.j6()) == true) { $pc10 = 18; continue $sw10; }
                    return false;
                }
                case 18: {
                    if (v5() == r5.v5()) { $pc10 = 21; continue $sw10; }
                    return false;
                }
                case 21: {
                    if (DW(Hw(), r5.Hw()) == true) { $pc10 = 23; continue $sw10; }
                    return false;
                }
                case 23: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String gn() {
        return this.tp;
    }

    public int hashCode() {
        int r1 = 0;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r1 = 0;
                    if (VH() == null) { $pc11 = 6; continue $sw11; }
                    r1 = 0 + VH().hashCode();
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    if (gn() == null) { $pc11 = 9; continue $sw11; }
                    r1 = (r1 * 31) + gn().hashCode();
                    $pc11 = 9; continue $sw11;
                }
                case 9: {
                    if (FH() == null) { $pc11 = 12; continue $sw11; }
                    r1 = (r1 * 31) + FH().hashCode();
                    $pc11 = 12; continue $sw11;
                }
                case 12: {
                    if (j6() == null) { $pc11 = 15; continue $sw11; }
                    r1 = (r1 * 31) + j6().hashCode();
                    $pc11 = 15; continue $sw11;
                }
                case 15: {
                    if (v5() <= 0) { $pc11 = 18; continue $sw11; }
                    r1 = (r1 * 31) + v5();
                    $pc11 = 18; continue $sw11;
                }
                case 18: {
                    if (Hw() != null) { $pc11 = 20; continue $sw11; }
                    return r1;
                }
                case 20: {
                    return (r1 * 31) + Hw().hashCode();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.HJ j6(int r2) {
        abcd.HJ r0 = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r0 = new abcd.HJ(this);
                    if (r2 > 0) { $pc12 = 6; continue $sw12; }
                    r2 = -1;
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    r0.we = r2;
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.HJ j6(java.lang.String r2) {
        abcd.HJ r0 = new abcd.HJ(this);
        r0.J0 = r2;
        return r0;
    }

    public java.lang.String j6() {
        return this.J0;
    }

    public java.lang.String toString() {
        return j6(false, false, false);
    }

    public java.lang.String u7() {
        return j6(true, false, false);
    }

    public int v5() {
        return this.we;
    }

    public abcd.HJ v5(java.lang.String r2) {
        abcd.HJ r0 = new abcd.HJ(this);
        r0.tp = r2;
        return r0;
    }
}
