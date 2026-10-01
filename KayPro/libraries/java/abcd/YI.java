package abcd;

public class YI {
    private final abcd.yE DW;
    private final java.lang.String FH;
    private final abcd.C0773gJ Hw;
    private abcd.YI.a VH;
    private final boolean Zo;
    private boolean gn;
    private final abcd.yE j6;
    private final abcd.UE tp;
    private java.lang.String u7;
    private final java.lang.String v5;

    public static final class a extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.YI.a DW = null;
        public static final abcd.YI.a FH = null;
        public static final abcd.YI.a Hw = null;
        public static final abcd.YI.a VH = null;
        public static final abcd.YI.a Zo = null;
        public static final abcd.YI.a gn = null;
        public static final abcd.YI.a j6 = null;
        private static final abcd.YI.a[] tp = null;
        public static final abcd.YI.a u7 = null;
        public static final abcd.YI.a v5 = null;

        static {
            j6 = new abcd.YI.a("NOT_ATTEMPTED", 0);
            DW = new abcd.YI.a("UP_TO_DATE", 1);
            FH = new abcd.YI.a("REJECTED_NONFASTFORWARD", 2);
            Hw = new abcd.YI.a("REJECTED_NODELETE", 3);
            v5 = new abcd.YI.a("REJECTED_REMOTE_CHANGED", 4);
            Zo = new abcd.YI.a("REJECTED_OTHER_REASON", 5);
            VH = new abcd.YI.a("NON_EXISTING", 6);
            gn = new abcd.YI.a("AWAITING_REPORT", 7);
            u7 = new abcd.YI.a("OK", 8);
            tp = new abcd.YI.a[]{j6, DW, FH, Hw, v5, Zo, VH, gn, u7};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.YI.a valueOf(java.lang.String r1) {
            return (abcd.YI.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.YI.a.values(), r1);
        }

        public static abcd.YI.a[] values() {
            abcd.YI.a[] r0 = tp;
            int r1 = r0.length;
            abcd.YI.a[] r2 = new abcd.YI.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    public YI(abcd.UE r9, java.lang.String r10, abcd.yE r11, java.lang.String r12, boolean r13, java.lang.String r14, abcd.yE r15) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r12 == null) { $pc0 = 28; continue $sw0; }
                    if (r11 != null) { $pc0 = 10; continue $sw0; }
                    if (r10 == null) { $pc0 = 10; continue $sw0; }
                    throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().sourceRefDoesntResolveToAnyObject, new java.lang.Object[]{r10}));
                }
                case 10: {
                    if (r10 == null) { $pc0 = 12; continue $sw0; }
                    this.v5 = r10;
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    if (r11 == null) { $pc0 = 19; continue $sw0; }
                    this.DW = r11;
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    this.FH = r12;
                    this.Zo = r13;
                    if (r14 == null) { $pc0 = 24; continue $sw0; }
                    if (r9 == null) { $pc0 = 24; continue $sw0; }
                    this.Hw = new abcd.C0773gJ(r9, r14, r12, true, this.DW, "push");
                    $pc0 = 25; continue $sw0;
                }
                case 25: {
                    this.tp = r9;
                    this.j6 = r15;
                    this.VH = abcd.YI.a.j6;
                    return;
                }
                case 24: {
                    this.Hw = null;
                    { $pc0 = 25; continue $sw0; }
                }
                case 19: {
                    this.DW = abcd.yE.Ws();
                    { $pc0 = 20; continue $sw0; }
                }
                case 12: {
                    if (r11 != null) { $pc0 = 14; continue $sw0; }
                    $pc0 = 16; continue $sw0;
                }
                case 16: {
                    this.v5 = null;
                    { $pc0 = 17; continue $sw0; }
                }
                case 14: {
                    if (r11.DW(abcd.yE.Ws()) == true) { $pc0 = 16; continue $sw0; }
                    this.v5 = r11.we();
                    { $pc0 = 17; continue $sw0; }
                }
                case 28: {
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().remoteNameCantBeNull);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public YI(abcd.UE r10, java.lang.String r11, java.lang.String r12, boolean r13, java.lang.String r14, abcd.yE r15) {
        abcd.yE r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r11 == null) { $pc1 = 4; continue $sw1; }
                    r0 = r10.FH(r11);
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    this(r10, r11, r0, r12, r13, r14, r15);
                    return;
                }
                case 4: {
                    r0 = abcd.yE.Ws();
                    { $pc1 = 5; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.yE DW() {
        return this.DW;
    }

    public java.lang.String FH() {
        return this.FH;
    }

    public abcd.YI.a Hw() {
        return this.VH;
    }

    public boolean VH() {
        return abcd.yE.Ws().DW(this.DW);
    }

    public boolean Zo() {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.Hw == null) { $pc2 = 6; continue $sw2; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean gn() {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (this.j6 == null) { $pc3 = 6; continue $sw3; }
                    return true;
                }
                case 6: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.yE j6() {
        return this.j6;
    }

    void j6(abcd.YI.a r1) {
        this.VH = r1;
    }

    protected void j6(abcd.qG r2) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (VH() == false) { $pc4 = 5; continue $sw4; }
                    this.Hw.j6(r2);
                    return;
                }
                case 5: {
                    this.Hw.DW(r2);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(java.lang.String r1) {
        this.u7 = r1;
    }

    void j6(boolean r1) {
        this.gn = r1;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = null;
        abcd.yE r1 = null;
        java.lang.String r2 = null;
        java.lang.String r3 = null;
        abcd.yE r4 = null;
        java.lang.String r5 = null;
        java.lang.String r6 = null;
        java.lang.String r7 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = new java.lang.StringBuilder("RemoteRefUpdate[remoteName=");
                    r0.append(this.FH);
                    r0.append(", ");
                    r0.append(this.VH);
                    r0.append(", ");
                    r1 = this.j6;
                    r2 = "(null)";
                    if (r1 == null) { $pc5 = 5; continue $sw5; }
                    r3 = r1.we();
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    r0.append(r3);
                    r0.append("...");
                    r4 = this.DW;
                    if (r4 == null) { $pc5 = 9; continue $sw5; }
                    r2 = r4.we();
                    $pc5 = 9; continue $sw5;
                }
                case 9: {
                    r0.append(r2);
                    r5 = "";
                    if (this.gn == false) { $pc5 = 12; continue $sw5; }
                    r6 = ", fastForward";
                    $pc5 = 13; continue $sw5;
                }
                case 13: {
                    r0.append(r6);
                    r0.append(", srcRef=");
                    r0.append(this.v5);
                    if (this.Zo == false) { $pc5 = 16; continue $sw5; }
                    r5 = ", forceUpdate";
                    $pc5 = 16; continue $sw5;
                }
                case 16: {
                    r0.append(r5);
                    r0.append(", message=");
                    if (this.u7 == null) { $pc5 = 19; continue $sw5; }
                    r7 = "\"" + this.u7 + "\"";
                    $pc5 = 20; continue $sw5;
                }
                case 20: {
                    r0.append(r7);
                    r0.append("]");
                    return r0.toString();
                }
                case 19: {
                    r7 = "null";
                    { $pc5 = 20; continue $sw5; }
                }
                case 12: {
                    r6 = "";
                    { $pc5 = 13; continue $sw5; }
                }
                case 5: {
                    r3 = "(null)";
                    { $pc5 = 6; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean u7() {
        return this.Zo;
    }

    public abcd.C0773gJ v5() {
        return this.Hw;
    }
}
