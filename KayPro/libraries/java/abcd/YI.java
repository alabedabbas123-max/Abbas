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

    public static final enum a extends java.lang.Enum<abcd.YI.a> {
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
            return (abcd.YI.a) java.lang.Enum.valueOf(abcd.YI.a.class, r1);
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
        if (r12 == null) goto L28;
        if (r11 != null) goto L10;
        if (r10 == null) goto L10;
        throw new java.io.IOException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().sourceRefDoesntResolveToAnyObject, new java.lang.Object[]{r10}));
    L10:
        if (r10 == null) goto L12;
        this.v5 = r10;
    L17:
        if (r11 == null) goto L19;
        this.DW = r11;
    L20:
        this.FH = r12;
        this.Zo = r13;
        if (r14 == null) goto L24;
        if (r9 == null) goto L24;
        this.Hw = new abcd.C0773gJ(r9, r14, r12, true, this.DW, "push");
    L25:
        this.tp = r9;
        this.j6 = r15;
        this.VH = abcd.YI.a.j6;
        return;
    L24:
        this.Hw = null;
        goto L25
    L19:
        this.DW = abcd.yE.Ws();
        goto L20
    L12:
        if (r11 != null) goto L14;
    L16:
        this.v5 = null;
        goto L17
    L14:
        if (r11.DW(abcd.yE.Ws()) == true) goto L16;
        this.v5 = r11.we();
        goto L17
    L28:
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().remoteNameCantBeNull);
    }

    public YI(abcd.UE r10, java.lang.String r11, java.lang.String r12, boolean r13, java.lang.String r14, abcd.yE r15) {
        if (r11 == null) goto L4;
        abcd.yE r0 = r10.FH(r11);
    L5:
        this(r10, r11, r0, r12, r13, r14, r15);
        return;
    L4:
        r0 = abcd.yE.Ws();
        goto L5
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
        if (this.Hw == null) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean gn() {
        if (this.j6 == null) goto L6;
        return true;
    L6:
        return false;
    }

    public abcd.yE j6() {
        return this.j6;
    }

    void j6(abcd.YI.a r1) {
        this.VH = r1;
    }

    protected void j6(abcd.qG r2) {
        if (VH() == false) goto L5;
        this.Hw.j6(r2);
        return;
    L5:
        this.Hw.DW(r2);
    }

    void j6(java.lang.String r1) {
        this.u7 = r1;
    }

    void j6(boolean r1) {
        this.gn = r1;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = new java.lang.StringBuilder("RemoteRefUpdate[remoteName=");
        r0.append(this.FH);
        r0.append(", ");
        r0.append(this.VH);
        r0.append(", ");
        abcd.yE r1 = this.j6;
        java.lang.String r2 = "(null)";
        if (r1 == null) goto L5;
        java.lang.String r3 = r1.we();
    L6:
        r0.append(r3);
        r0.append("...");
        abcd.yE r4 = this.DW;
        if (r4 == null) goto L9;
        r2 = r4.we();
    L9:
        r0.append(r2);
        java.lang.String r5 = "";
        if (this.gn == false) goto L12;
        java.lang.String r6 = ", fastForward";
    L13:
        r0.append(r6);
        r0.append(", srcRef=");
        r0.append(this.v5);
        if (this.Zo == false) goto L16;
        r5 = ", forceUpdate";
    L16:
        r0.append(r5);
        r0.append(", message=");
        if (this.u7 == null) goto L19;
        java.lang.String r7 = "\"" + this.u7 + "\"";
    L20:
        r0.append(r7);
        r0.append("]");
        return r0.toString();
    L19:
        r7 = "null";
        goto L20
    L12:
        r6 = "";
        goto L13
    L5:
        r3 = "(null)";
        goto L6
    }

    public boolean u7() {
        return this.Zo;
    }

    public abcd.C0773gJ v5() {
        return this.Hw;
    }
}
