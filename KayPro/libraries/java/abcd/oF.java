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
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.DW = DW(r3, "GIT_AUTHOR_NAME");
                    if (this.DW != null) { $pc0 = 5; continue $sw0; }
                    this.DW = Hw();
                    this.Zo = true;
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    this.FH = j6(r3, "GIT_AUTHOR_EMAIL");
                    if (this.FH != null) { $pc0 = 8; continue $sw0; }
                    this.FH = FH();
                    this.VH = true;
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    this.Hw = DW(r3, "GIT_COMMITTER_NAME");
                    if (this.Hw != null) { $pc0 = 11; continue $sw0; }
                    this.Hw = Hw();
                    this.gn = true;
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    this.v5 = j6(r3, "GIT_COMMITTER_EMAIL");
                    if (this.v5 != null) { $pc0 = 15; continue $sw0; }
                    this.v5 = FH();
                    this.u7 = true;
                    return;
                }
                case 15: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    oF(abcd.gE r1, abcd.oF r2) {
        this(r1);
    }

    private static java.lang.String DW(abcd.gE r3, java.lang.String r4) {
        java.lang.String r5 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r5 = r3.j6("user", null, "name");
                    if (r5 == null) { $pc1 = 5; continue $sw1; }
                    return r5;
                }
                case 5: {
                    return v5().DW(r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String FH() {
        return java.lang.String.valueOf(Hw()) + "@" + v5().DW();
    }

    private static java.lang.String Hw() {
        java.lang.String r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = v5().j6("user.name");
                    if (r0 != null) { $pc2 = 6; continue $sw2; }
                    return "unknown-user";
                }
                case 6: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String j6(abcd.gE r3, java.lang.String r4) {
        java.lang.String r5 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r5 = r3.j6("user", null, "email");
                    if (r5 == null) { $pc3 = 5; continue $sw3; }
                    return r5;
                }
                case 5: {
                    return v5().DW(r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
