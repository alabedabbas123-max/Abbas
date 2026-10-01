package abcd;

public class oF {
    public static final gE.b<abcd.oF> j6 = null;
    private java.lang.String DW;
    private java.lang.String FH;
    private java.lang.String Hw;
    private boolean VH;
    private boolean Zo;
    private boolean gn;
    private boolean u7;
    private java.lang.String v5;

    static {
        j6 = new abcd.nF();
    }

    private oF(abcd.gE r3) {
        this.DW = DW(r3, "GIT_AUTHOR_NAME");
        if (this.DW != null) goto L5;
        this.DW = Hw();
        this.Zo = true;
    L5:
        this.FH = j6(r3, "GIT_AUTHOR_EMAIL");
        if (this.FH != null) goto L8;
        this.FH = FH();
        this.VH = true;
    L8:
        this.Hw = DW(r3, "GIT_COMMITTER_NAME");
        if (this.Hw != null) goto L11;
        this.Hw = Hw();
        this.gn = true;
    L11:
        this.v5 = j6(r3, "GIT_COMMITTER_EMAIL");
        if (this.v5 != null) goto L15;
        this.v5 = FH();
        this.u7 = true;
        return;
    }

    oF(abcd.gE r1, abcd.oF r2) {
        this(r1);
    }

    private static java.lang.String DW(abcd.gE r3, java.lang.String r4) {
        java.lang.String r5 = r3.j6("user", null, "name");
        if (r5 == null) goto L5;
        return r5;
    L5:
        return v5().DW(r4);
    }

    private static java.lang.String FH() {
        return java.lang.String.valueOf(Hw()) + "@" + v5().DW();
    }

    private static java.lang.String Hw() {
        java.lang.String r0 = v5().j6("user.name");
        if (r0 != null) goto L6;
        return "unknown-user";
    L6:
        return r0;
    }

    private static java.lang.String j6(abcd.gE r3, java.lang.String r4) {
        java.lang.String r5 = r3.j6("user", null, "email");
        if (r5 == null) goto L5;
        return r5;
    L5:
        return v5().DW(r4);
    }

    private static abcd.QK v5() {
        return abcd.QK.FH();
    }

    public java.lang.String DW() {
        return this.Hw;
    }

    public java.lang.String j6() {
        return this.v5;
    }
}
