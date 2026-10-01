package abcd;

public class YH {
    private final abcd.YJ DW;
    private abcd.AbstractjF FH;
    private abcd.FG Hw;
    private final abcd.UE j6;
    private java.lang.String v5;

    public YH(abcd.UE r2) {
        this.j6 = r2;
        this.FH = r2.Zo();
        this.DW = new abcd.YJ(r2);
        this.DW.j6(true);
    }

    public static java.lang.String DW(abcd.UE r8, java.lang.String r9) {
        if (r9.startsWith("./") == false) goto L5;
    L7:
        java.lang.String r1 = null;
        abcd.ME r3 = r8.j6("HEAD");
        if (r3 != null) goto L10;
    L13:
        if (r1 != null) goto L15;
        r1 = "origin";
    L15:
        java.lang.String r2 = r8.Zo().j6("remote", r1, "url");
        if (r2 != null) goto L21;
        r2 = r8.J8().getAbsolutePath();
        if ('\\' != java.io.File.separatorChar) goto L21;
        r2 = r2.replace('\\', '/');
    L21:
        if (r2.charAt(r2.length() - 1) != '/') goto L23;
        r2 = r2.substring(0, r2.length() - 1);
    L23:
        char r10 = '/';
    L25:
        if (r9.length() <= 0) goto L40;
        if (r9.startsWith("./") == true) goto L29;
        if (r9.startsWith("../") == false) goto L40;
        int r6 = r2.lastIndexOf(47);
        if (r6 >= 1) goto L35;
        r6 = r2.lastIndexOf(58);
        r10 = ':';
    L35:
        if (r6 < 1) goto L38;
        r2 = r2.substring(0, r6);
        r9 = r9.substring(3);
        goto L25
    L38:
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().submoduleParentRemoteUrlInvalid, new java.lang.Object[]{r2}));
    L29:
        r9 = r9.substring(2);
    L40:
        return java.lang.String.valueOf(r2) + r10 + r9;
    L10:
        if (r3.Zo() == false) goto L12;
        r3 = r3.v5();
    L12:
        r1 = r8.Zo().j6("branch", abcd.UE.Hw(r3.getName()), "remote");
        goto L13
    L5:
        if (r9.startsWith("../") == true) goto L7;
        return r9;
    }

    public static abcd.UE FH(abcd.UE r0, java.lang.String r1) {
        return j6(r0.J8(), r1);
    }

    public static abcd.UE j6(java.io.File r2, java.lang.String r3) {
        if (new java.io.File(r2, r3).isDirectory() == true) goto L5;
        return null;
    L5:
        java.io.File r0 = new java.io.File(r2, r3);
        abcd.VE r4 = new abcd.VE();     // Catch: abcd.pD -> L8
        r4.j6(true);     // Catch: abcd.pD -> L8
        abcd.VE r5 = r4;     // Catch: abcd.pD -> L8
        r5.j6(abcd.AbstractpK.j6);     // Catch: abcd.pD -> L8
        abcd.VE r6 = r5;     // Catch: abcd.pD -> L8
        r6.Zo(r0);     // Catch: abcd.pD -> L8
        return r6.j6();
    L8:
        return null;
    }

    public static abcd.YH j6(abcd.UE r2) {
        abcd.YH r0 = new abcd.YH(r2);
        r0.j6(new abcd.RC(r2.U2()));
        return r0;
    }

    public static java.io.File j6(abcd.UE r1, java.lang.String r2) {
        return new java.io.File(r1.J8(), r2);
    }

    private void we() {
        if (this.Hw != null) goto L6;
        abcd.FG r1 = new abcd.FG(new java.io.File(this.j6.J8(), ".gitmodules"), this.j6.gn());
        r1.gn();
        this.Hw = r1;
        return;
    }

    public java.lang.String DW() {
        return this.FH.j6("submodule", this.v5, "url");
    }

    public boolean EQ() {
    L3:
        if (this.DW.EQ() == false) goto L4;
        if (abcd.AbstractrE.v5 != this.DW.j6(0)) goto L3;
        this.v5 = this.DW.Hw();
        return true;
    L4:
        this.v5 = null;
        return false;
    }

    public java.io.File FH() {
        return j6(this.j6, this.v5);
    }

    public java.lang.String Hw() {
        we();
        return this.Hw.j6("submodule", this.v5, "path");
    }

    public abcd.yE VH() {
        return this.DW.DW(0);
    }

    public java.lang.String Zo() {
        we();
        return this.Hw.j6("submodule", this.v5, "url");
    }

    public java.lang.String gn() {
        return this.v5;
    }

    public abcd.YH j6(abcd.TJ r2) {
        this.DW.j6(r2);
        return this;
    }

    public abcd.YH j6(abcd.AbstractjK r2) {
        this.DW.j6(r2);
        return this;
    }

    public java.lang.String j6() {
        return this.FH.j6("submodule", this.v5, "update");
    }

    public abcd.UE tp() {
        return FH(this.j6, this.v5);
    }

    public java.lang.String u7() {
        java.lang.String r0 = Zo();
        if (r0 != null) goto L7;
        return null;
    L7:
        return DW(this.j6, r0);
    }

    public java.lang.String v5() {
        we();
        return this.Hw.j6("submodule", this.v5, "update");
    }
}
