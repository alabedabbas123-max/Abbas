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
        java.lang.String r1 = null;
        abcd.ME r3 = null;
        java.lang.String r2 = null;
        char r10 = 0;
        int r6 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r9.startsWith("./") == false) { $pc0 = 5; continue $sw0; }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    r1 = null;
                    r3 = r8.j6("HEAD");
                    if (r3 != null) { $pc0 = 10; continue $sw0; }
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    if (r1 != null) { $pc0 = 15; continue $sw0; }
                    r1 = "origin";
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    r2 = r8.Zo().j6("remote", r1, "url");
                    if (r2 != null) { $pc0 = 21; continue $sw0; }
                    r2 = r8.J8().getAbsolutePath();
                    if ('\\' != java.io.File.separatorChar) { $pc0 = 21; continue $sw0; }
                    r2 = r2.replace('\\', '/');
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    if (r2.charAt(r2.length() - 1) != '/') { $pc0 = 23; continue $sw0; }
                    r2 = r2.substring(0, r2.length() - 1);
                    $pc0 = 23; continue $sw0;
                }
                case 23: {
                    r10 = '/';
                    $pc0 = 25; continue $sw0;
                }
                case 25: {
                    if (r9.length() <= 0) { $pc0 = 40; continue $sw0; }
                    if (r9.startsWith("./") == true) { $pc0 = 29; continue $sw0; }
                    if (r9.startsWith("../") == false) { $pc0 = 40; continue $sw0; }
                    r6 = r2.lastIndexOf(47);
                    if (r6 >= 1) { $pc0 = 35; continue $sw0; }
                    r6 = r2.lastIndexOf(58);
                    r10 = ':';
                    $pc0 = 35; continue $sw0;
                }
                case 35: {
                    if (r6 < 1) { $pc0 = 38; continue $sw0; }
                    r2 = r2.substring(0, r6);
                    r9 = r9.substring(3);
                    { $pc0 = 25; continue $sw0; }
                }
                case 38: {
                    throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().submoduleParentRemoteUrlInvalid, new java.lang.Object[]{r2}));
                }
                case 29: {
                    r9 = r9.substring(2);
                    $pc0 = 40; continue $sw0;
                }
                case 40: {
                    return java.lang.String.valueOf(r2) + r10 + r9;
                }
                case 10: {
                    if (r3.Zo() == false) { $pc0 = 12; continue $sw0; }
                    r3 = r3.v5();
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    r1 = r8.Zo().j6("branch", abcd.UE.Hw(r3.getName()), "remote");
                    { $pc0 = 13; continue $sw0; }
                }
                case 5: {
                    if (r9.startsWith("../") == true) { $pc0 = 7; continue $sw0; }
                    return r9;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.UE FH(abcd.UE r0, java.lang.String r1) {
        return j6(r0.J8(), r1);
    }

    public static abcd.UE j6(java.io.File r2, java.lang.String r3) {
        java.io.File r0 = null;
        abcd.VE r4 = null;
        abcd.VE r5 = null;
        abcd.VE r6 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (new java.io.File(r2, r3).isDirectory() == true) { $pc1 = 5; continue $sw1; }
                    return null;
                }
                case 5: {
                    r0 = new java.io.File(r2, r3);
                    try {
                        r4 = new abcd.VE();
                        r4.j6(true);
                        r5 = r4;
                        r5.j6(abcd.AbstractpK.j6);
                        r6 = r5;
                        r6.Zo(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof abcd.pD) { $pc1 = 8; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r6.j6();
                }
                case 8: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        abcd.FG r1 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.Hw != null) { $pc2 = 6; continue $sw2; }
                    r1 = new abcd.FG(new java.io.File(this.j6.J8(), ".gitmodules"), this.j6.gn());
                    r1.gn();
                    this.Hw = r1;
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String DW() {
        return this.FH.j6("submodule", this.v5, "url");
    }

    public boolean EQ() {
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 3: {
                    if (this.DW.EQ() == false) { $pc3 = 4; continue $sw3; }
                    if (abcd.AbstractrE.v5 != this.DW.j6(0)) { $pc3 = 3; continue $sw3; }
                    this.v5 = this.DW.Hw();
                    return true;
                }
                case 4: {
                    this.v5 = null;
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.lang.String r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = Zo();
                    if (r0 != null) { $pc4 = 7; continue $sw4; }
                    return null;
                }
                case 7: {
                    return DW(this.j6, r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String v5() {
        we();
        return this.Hw.j6("submodule", this.v5, "update");
    }
}
