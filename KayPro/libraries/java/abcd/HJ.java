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
        j6 = java.util.regex.Pattern.compile("^([a-z][a-z0-9+-]+)://(?:(?:([^/:@]+)(?::([^\\\\/]+))?@)?([^\\\\/:]+)(?::(\\d+))?((?:/~(?:[^\\\\/]+))?[\\\\/]))?(.+)?$");
        DW = java.util.regex.Pattern.compile("^([\\\\/]?((?:[A-Za-z]:)?[\\\\/]?(?:(?:[^\\\\/]+[\\\\/])*[^\\\\/]+[\\\\/]?)))$");
        FH = java.util.regex.Pattern.compile("^(file):([\\\\/](?![\\\\/])((?:[A-Za-z]:)?[\\\\/]?(?:(?:[^\\\\/]+[\\\\/])*[^\\\\/]+[\\\\/]?)))$");
        Hw = java.util.regex.Pattern.compile("^(?:([^/:@]+)(?::([^\\\\/]+))?@)?([^\\\\/:]+):((?:(?:/~(?:[^\\\\/]+))[\\\\/])?(?:(?:[^\\\\/]+[\\\\/])*[^\\\\/]+[\\\\/]?))$");
        v5 = java.util.regex.Pattern.compile("^(?:([^/:@]+)(?::([^\\\\/]+))?@)?([^\\\\/:]{2,}):([\\\\/](?:(?:[^\\\\/]+[\\\\/])*[^\\\\/]+[\\\\/]?))$");
        Zo = new java.util.BitSet(127);
        byte[] r0 = abcd.hE.DW("!*'();:@&=+$,/?#[]");
        int r1 = r0.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L4;
        byte r3 = r0[r2];
        Zo.set(r3);
        r2 = r2 + 1;
        goto L3
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
        this.we = -1;
        if (abcd.NK.j6(r7) == true) goto L30;
        java.util.regex.Matcher r0 = FH.matcher(r7);
        if (r0.matches() == false) goto L8;
        this.VH = r0.group(1);
        this.u7 = j6(r0.group(2), this.VH);
        this.gn = VH(this.u7);
        return;
    L8:
        java.util.regex.Matcher r1 = j6.matcher(r7);
        if (r1.matches() == false) goto L15;
        this.VH = r1.group(1);
        this.tp = VH(r1.group(2));
        this.EQ = VH(r1.group(3));
        this.J0 = VH(r1.group(4));
        if (r1.group(5) == null) goto L13;
        this.we = java.lang.Integer.parseInt(r1.group(5));
    L13:
        this.u7 = j6(java.lang.String.valueOf(Zo(r1.group(6))) + Zo(r1.group(7)), this.VH);
        this.gn = VH(this.u7);
        return;
    L15:
        java.util.regex.Matcher r2 = Hw.matcher(r7);
        if (r2.matches() == false) goto L19;
        this.tp = r2.group(1);
        this.EQ = r2.group(2);
        this.J0 = r2.group(3);
        this.u7 = r2.group(4);
        this.gn = this.u7;
        return;
    L19:
        java.util.regex.Matcher r3 = v5.matcher(r7);
        if (r3.matches() == false) goto L23;
        this.tp = r3.group(1);
        this.EQ = r3.group(2);
        this.J0 = r3.group(3);
        this.u7 = r3.group(4);
        this.gn = this.u7;
        return;
    L23:
        java.util.regex.Matcher r4 = DW.matcher(r7);
        if (r4.matches() == false) goto L28;
        this.u7 = r4.group(1);
        this.gn = this.u7;
        return;
    L28:
        throw new java.net.URISyntaxException(r7, org.eclipse.jgit.JGitText.j6().cannotParseGitURIish);
    L30:
        throw new java.net.URISyntaxException("The uri was empty or null", org.eclipse.jgit.JGitText.j6().cannotParseGitURIish);
    }

    public HJ(java.net.URL r4) {
        this.we = -1;
        this.VH = r4.getProtocol();
        this.gn = r4.getPath();
        this.u7 = r4.toURI().getRawPath();     // Catch: java.net.URISyntaxException -> L17
        java.lang.String r0 = r4.getUserInfo();
        if (r0 == null) goto L15;
        int r1 = r0.indexOf(58);
        if (r1 >= 0) goto L9;
        java.lang.String r2 = r0;
    L10:
        this.tp = r2;
        if (r1 >= 0) goto L13;
        java.lang.String r3 = null;
    L14:
        this.EQ = r3;
        goto L15
    L13:
        r3 = r0.substring(r1 + 1);
        goto L14
    L9:
        r2 = r0.substring(0, r1);
    L15:
        this.we = r4.getPort();
        this.J0 = r4.getHost();
        return;
    L17:
        e = move-exception;
        throw new java.lang.RuntimeException(e);
    }

    private static boolean DW(java.lang.String r0, java.lang.String r1) {
        if (r0 != r1) goto L5;
        return true;
    L5:
        if (r0 == null) goto L10;
        if (r1 != null) goto L9;
        return false;
    L9:
        return r0.equals(r1);
    L10:
        return false;
    }

    private static java.lang.String VH(java.lang.String r8) {
        if (r8 != null) goto L6;
        return null;
    L6:
        if (r8.indexOf(37) >= 0) goto L27;
        return r8;
    L27:
        byte[] r1 = r8.getBytes("UTF-8");     // Catch: java.io.UnsupportedEncodingException -> L23
        byte[] r2 = new byte[r1.length];
        int r4 = 0;
        int r5 = 0;
    L11:
        if (r4 >= r1.length) goto L13;
        byte r6 = r1[r4];
        if (r6 != 37) goto L21;
        int r7 = r4 + 2;
        if (r7 >= r1.length) goto L20;
        int r9 = (abcd.IK.j6(r1[r4 + 1]) << 4) | abcd.IK.j6(r1[r7]);
        int r10 = r5 + 1;
        r2[r5] = (byte) r9;
        r4 = r7;
    L22:
        r5 = r10;
        r4 = r4 + 1;
        goto L11
    L20:
        throw new java.net.URISyntaxException(r8, org.eclipse.jgit.JGitText.j6().cannotParseGitURIish);
    L21:
        r10 = r5 + 1;
        r2[r5] = r6;
        goto L22
    L13:
        return abcd.IK.j6(r2, 0, r5);
    L23:
        e = move-exception;
        throw new java.lang.RuntimeException(e);
    }

    private java.lang.String Zo(java.lang.String r1) {
        if (r1 != null) goto L5;
        return "";
    L5:
        return r1;
    }

    private java.lang.String j6(java.lang.String r7, java.lang.String r8) {
        if (r7.length() >= 3) goto L5;
    L18:
        if (r8 != null) goto L20;
        return r7;
    L20:
        if (r7.length() >= 2) goto L22;
        return r7;
    L22:
        if (r7.charAt(0) == '/') goto L24;
        return r7;
    L24:
        if (r7.charAt(1) == '~') goto L26;
        return r7;
    L26:
        return r7.substring(1);
    L5:
        if (r7.charAt(0) != '/') goto L18;
        if (r7.charAt(2) != ':') goto L18;
        if (r7.charAt(1) < 'A') goto L13;
        if (r7.charAt(1) > 'Z') goto L13;
    L17:
        return r7.substring(1);
    L13:
        if (r7.charAt(1) < 'a') goto L18;
        if (r7.charAt(1) > 'z') goto L18;
        goto L18
    }

    private static java.lang.String j6(java.lang.String r6, boolean r7, boolean r8) {
        if (r6 != null) goto L5;
        return null;
    L5:
        java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream(r6.length());
        byte[] r9 = r6.getBytes("UTF-8");     // Catch: java.io.UnsupportedEncodingException -> L25
        int r2 = 0;
    L9:
        if (r2 >= r9.length) goto L10;
        int r3 = r9[r2] & 255;
        if (r3 <= 32) goto L23;
        if (r8 == true) goto L16;
    L17:
        if (r3 == 37) goto L23;
        if (r7 == true) goto L20;
    L22:
        r0.write(r3);
    L24:
        r2 = r2 + 1;
        goto L9
    L20:
        if (Zo.get(r3) == false) goto L22;
    L16:
        if (r3 <= 127) goto L17;
    L23:
        r0.write(37);
        byte[] r4 = abcd.hE.DW(java.lang.String.format("%02x", new java.lang.Object[]{java.lang.Integer.valueOf(r3)}));
        r0.write(r4[0]);
        r0.write(r4[1]);
        goto L24
    L10:
        byte[] r10 = r0.toByteArray();
        return abcd.IK.j6(r10, 0, r10.length);
    L25:
        e = move-exception;
        throw new java.lang.RuntimeException(e);
    }

    private java.lang.String j6(boolean r4, boolean r5, boolean r6) {
        java.lang.StringBuilder r7 = new java.lang.StringBuilder();
        if (VH() == null) goto L6;
        r7.append(VH());
        r7.append("://");
    L6:
        if (gn() == null) goto L13;
        r7.append(j6(gn(), true, r6));
        if (r4 == false) goto L13;
        if (FH() == null) goto L13;
        r7.append(':');
        r7.append(j6(FH(), true, r6));
    L13:
        if (j6() == null) goto L23;
        if (gn() == null) goto L17;
        r7.append('@');
    L17:
        r7.append(j6(j6(), false, r6));
        if (VH() == null) goto L23;
        if (v5() <= 0) goto L23;
        r7.append(':');
        r7.append(v5());
    L23:
        if (Hw() == null) goto L39;
        if (VH() == null) goto L30;
        if (Hw().startsWith("/") == true) goto L33;
        r7.append('/');
    L33:
        if (VH() == null) goto L37;
        if (r6 == false) goto L36;
        r7.append(j6(Hw(), false, r6));
        goto L39
    L36:
        r7.append(Zo());
        goto L39
    L37:
        r7.append(Hw());
        goto L39
    L30:
        if (j6() == null) goto L33;
        r7.append(':');
    L39:
        return r7.toString();
    }

    public abcd.HJ DW(java.lang.String r2) {
        abcd.HJ r0 = new abcd.HJ(this);
        r0.EQ = r2;
        return r0;
    }

    public java.lang.String DW() {
        if ("".equals(Hw()) == true) goto L25;
        if (Hw() == null) goto L25;
        java.lang.String r0 = Hw();
        if ("file".equals(this.VH) == false) goto L9;
    L12:
        java.lang.String[] r1 = r0.split("[\\" + java.io.File.separatorChar + "/]");
    L14:
        if (r1.length == 0) goto L23;
        java.lang.String r2 = r1[r1.length - 1];
        if (".git".equals(r2) == false) goto L19;
        return r1[r1.length - 2];
    L19:
        if (r2.endsWith(".git") == true) goto L21;
        return r2;
    L21:
        return r2.substring(0, r2.length() - 4);
    L23:
        throw new java.lang.IllegalArgumentException();
    L9:
        if (DW.matcher(r0).matches() == true) goto L12;
        r1 = r0.split("/");
    L25:
        throw new java.lang.IllegalArgumentException();
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
        if ((r4 instanceof abcd.HJ) == true) goto L5;
        return false;
    L5:
        abcd.HJ r5 = (abcd.HJ) r4;
        if (DW(VH(), r5.VH()) == true) goto L9;
        return false;
    L9:
        if (DW(gn(), r5.gn()) == true) goto L12;
        return false;
    L12:
        if (DW(FH(), r5.FH()) == true) goto L15;
        return false;
    L15:
        if (DW(j6(), r5.j6()) == true) goto L18;
        return false;
    L18:
        if (v5() == r5.v5()) goto L21;
        return false;
    L21:
        if (DW(Hw(), r5.Hw()) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public java.lang.String gn() {
        return this.tp;
    }

    public int hashCode() {
        int r1 = 0;
        if (VH() == null) goto L6;
        r1 = 0 + VH().hashCode();
    L6:
        if (gn() == null) goto L9;
        r1 = (r1 * 31) + gn().hashCode();
    L9:
        if (FH() == null) goto L12;
        r1 = (r1 * 31) + FH().hashCode();
    L12:
        if (j6() == null) goto L15;
        r1 = (r1 * 31) + j6().hashCode();
    L15:
        if (v5() <= 0) goto L18;
        r1 = (r1 * 31) + v5();
    L18:
        if (Hw() != null) goto L20;
        return r1;
    L20:
        return (r1 * 31) + Hw().hashCode();
    }

    public abcd.HJ j6(int r2) {
        abcd.HJ r0 = new abcd.HJ(this);
        if (r2 > 0) goto L6;
        r2 = -1;
    L6:
        r0.we = r2;
        return r0;
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
