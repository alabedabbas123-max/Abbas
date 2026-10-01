package abcd;

public class HF extends abcd.hC {
    private static final byte[] EQ = null;
    static final byte[] J0 = null;
    static final byte[] J8 = null;
    private static final byte[] Mr = null;
    private static final byte[] QX = null;
    private static final byte[] U2 = null;
    private static final byte[] Ws = null;
    private static final byte[] XL = null;
    private static final byte[] a8 = null;
    private static final byte[] aM = null;
    static final byte[] er = null;
    private static final byte[] j3 = null;
    static final byte[] lg = null;
    static final byte[] rN = null;
    private static final byte[] we = null;
    int BT;
    private java.util.List<abcd.JF> P8;
    final int gW;
    abcd.HF.a vy;
    final byte[] yS;

    public static final enum a extends java.lang.Enum<abcd.HF.a> {
        public static final abcd.HF.a DW = null;
        public static final abcd.HF.a FH = null;
        private static final abcd.HF.a[] Hw = null;
        public static final abcd.HF.a j6 = null;

        static {
            j6 = new abcd.HF.a("UNIFIED", 0);
            DW = new abcd.HF.a("BINARY", 1);
            FH = new abcd.HF.a("GIT_BINARY", 2);
            Hw = new abcd.HF.a[]{j6, DW, FH};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.HF.a valueOf(java.lang.String r1) {
            return (abcd.HF.a) java.lang.Enum.valueOf(abcd.HF.a.class, r1);
        }

        public static abcd.HF.a[] values() {
            abcd.HF.a[] r0 = Hw;
            int r1 = r0.length;
            abcd.HF.a[] r2 = new abcd.HF.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    static {
        EQ = abcd.hE.DW("old mode ");
        we = abcd.hE.DW("new mode ");
        J0 = abcd.hE.DW("deleted file mode ");
        J8 = abcd.hE.DW("new file mode ");
        Ws = abcd.hE.DW("copy from ");
        QX = abcd.hE.DW("copy to ");
        XL = abcd.hE.DW("rename old ");
        aM = abcd.hE.DW("rename new ");
        j3 = abcd.hE.DW("rename from ");
        Mr = abcd.hE.DW("rename to ");
        U2 = abcd.hE.DW("similarity index ");
        a8 = abcd.hE.DW("dissimilarity index ");
        lg = abcd.hE.DW("index ");
        rN = abcd.hE.DW("--- ");
        er = abcd.hE.DW("+++ ");
    }

    HF(byte[] r1, int r2) {
        this.yS = r1;
        this.gW = r2;
        this.VH = abcd.hC.a.DW;
        this.vy = abcd.HF.a.j6;
    }

    public HF(byte[] r3, abcd.kC r4, abcd.HF.a r5) {
        this(r3, 0);
        this.BT = r3.length;
        FH(DW(abcd.KF.j6.length, r3.length), r3.length);
        this.vy = r5;
        j6(new abcd.JF(this, r4));
    }

    static int j6(byte[] r4, int r5, int r6) {
        int r0 = r5;
    L3:
        if (r0 >= r6) goto L9;
        if (r4[r0] != 64) goto L9;
        r0 = r0 + 1;
    L9:
        if ((r0 - r5) >= 2) goto L11;
        return 0;
    L11:
        if (r0 == r6) goto L21;
        int r1 = r0 + 1;
        if (r4[r0] != 32) goto L21;
        if (r1 == r6) goto L21;
        int r7 = r1 + 1;
        if (r4[r1] != 45) goto L21;
        return (r7 - 3) - r5;
    L21:
        return 0;
    }

    private static java.lang.String j6(java.lang.String r1) {
        int r0 = r1.indexOf(47);
        if (r0 > 0) goto L5;
        return r1;
    L5:
        return r1.substring(r0 + 1);
    }

    private java.lang.String j6(java.lang.String r3, int r4, int r5) {
        if (r4 != r5) goto L4;
        return r3;
    L4:
        byte[] r6 = this.yS;
        if (r6[r4] != 34) goto L7;
        java.lang.String r7 = abcd.GK.j6.j6(r6, r4, r5 - 1);
    L17:
        if (r7.equals("/dev/null") == true) goto L19;
        return r7;
    L19:
        return "/dev/null";
    L7:
        int r8 = r5;
    L8:
        if (r4 >= r8) goto L13;
        if (this.yS[r8 - 1] == 9) goto L13;
        r8 = r8 - 1;
    L13:
        if (r4 != r8) goto L15;
        r8 = r5;
    L15:
        r7 = abcd.IK.j6(abcd.hE.Zo, this.yS, r4, r8 - 1);
        goto L17
    }

    private boolean j6(int r4, int r5, int r6, int r7) {
        if ((r5 - r4) == (r7 - r6)) goto L5;
        return false;
    L5:
        if (r4 >= r5) goto L6;
        byte[] r8 = this.yS;
        int r0 = r4 + 1;
        int r2 = r6 + 1;
        if (r8[r4] != r8[r6]) goto L10;
        r4 = r0;
        r6 = r2;
        goto L5
    L10:
        return false;
    L6:
        return true;
    }

    int DW(int r7, int r8) {
        int r0 = abcd.IK.Zo(this.yS, r7);
        if (r0 < r8) goto L6;
        return -1;
    L6:
        int r9 = abcd.IK.DW(this.yS, r7, '/');
        if (r9 < r0) goto L9;
        return r0;
    L9:
        int r2 = r7;
    L10:
        if (r2 >= r0) goto L11;
        r2 = abcd.IK.DW(this.yS, r2, ' ');
        if (r2 >= r0) goto L14;
        int r3 = abcd.IK.DW(this.yS, r2, '/');
        if (r3 >= r0) goto L17;
        int r4 = r2 - 1;
        if (j6(r9, r4, r3, r0 - 1) == false) goto L10;
        byte[] r1 = this.yS;
        if (r1[r7] == 34) goto L23;
        this.FH = abcd.IK.j6(abcd.hE.Zo, r1, r9, r4);
    L27:
        this.Hw = this.FH;
        return r0;
    L23:
        if (r1[r2 - 2] == 34) goto L25;
        return r0;
    L25:
        this.FH = abcd.GK.j6.j6(r1, r7, r4);
        this.FH = j6(this.FH);
        goto L27
    L17:
        return r0;
    L14:
        return r0;
    L11:
        return r0;
    }

    public int EQ() {
        return this.BT;
    }

    int FH(int r5, int r6) {
    L2:
        if (r5 >= r6) goto L53;
        int r0 = abcd.IK.Zo(this.yS, r5);
        if (j6(this.yS, r5, r0) >= 1) goto L53;
        if (abcd.IK.j6(this.yS, r5, rN) < 0) goto L11;
        VH(r5, r0);
    L52:
        r5 = r0;
        goto L2
    L11:
        if (abcd.IK.j6(this.yS, r5, er) < 0) goto L14;
        Zo(r5, r0);
        goto L52
    L14:
        if (abcd.IK.j6(this.yS, r5, EQ) < 0) goto L17;
        this.v5 = j6(r5 + EQ.length, r0);
        goto L52
    L17:
        if (abcd.IK.j6(this.yS, r5, we) < 0) goto L20;
        this.Zo = j6(r5 + we.length, r0);
        goto L52
    L20:
        if (abcd.IK.j6(this.yS, r5, J0) < 0) goto L23;
        this.v5 = j6(r5 + J0.length, r0);
        this.Zo = abcd.AbstractrE.Zo;
        this.VH = abcd.hC.a.FH;
        goto L52
    L23:
        if (abcd.IK.j6(this.yS, r5, J8) < 0) goto L26;
        v5(r5, r0);
        goto L52
    L26:
        if (abcd.IK.j6(this.yS, r5, Ws) < 0) goto L29;
        this.FH = j6(this.FH, r5 + Ws.length, r0);
        this.VH = abcd.hC.a.v5;
        goto L52
    L29:
        if (abcd.IK.j6(this.yS, r5, QX) < 0) goto L32;
        this.Hw = j6(this.Hw, r5 + QX.length, r0);
        this.VH = abcd.hC.a.v5;
        goto L52
    L32:
        if (abcd.IK.j6(this.yS, r5, XL) < 0) goto L35;
        this.FH = j6(this.FH, r5 + XL.length, r0);
        this.VH = abcd.hC.a.Hw;
        goto L52
    L35:
        if (abcd.IK.j6(this.yS, r5, aM) < 0) goto L38;
        this.Hw = j6(this.Hw, r5 + aM.length, r0);
        this.VH = abcd.hC.a.Hw;
        goto L52
    L38:
        if (abcd.IK.j6(this.yS, r5, j3) < 0) goto L41;
        this.FH = j6(this.FH, r5 + j3.length, r0);
        this.VH = abcd.hC.a.Hw;
        goto L52
    L41:
        if (abcd.IK.j6(this.yS, r5, Mr) < 0) goto L44;
        this.Hw = j6(this.Hw, r5 + Mr.length, r0);
        this.VH = abcd.hC.a.Hw;
        goto L52
    L44:
        if (abcd.IK.j6(this.yS, r5, U2) < 0) goto L47;
        this.gn = abcd.IK.j6(this.yS, r5 + U2.length, null);
        goto L52
    L47:
        if (abcd.IK.j6(this.yS, r5, a8) < 0) goto L50;
        this.gn = abcd.IK.j6(this.yS, r5 + a8.length, null);
        goto L52
    L50:
        if (abcd.IK.j6(this.yS, r5, lg) < 0) goto L53;
        Hw(r5 + lg.length, r0);
    L53:
        return r5;
    }

    void Hw(int r5, int r6) {
        int r0 = abcd.IK.DW(this.yS, r5, '.');
        int r1 = abcd.IK.DW(this.yS, r0, ' ');
        this.u7 = abcd.WD.j6(this.yS, r5, r0 - 1);
        this.tp = abcd.WD.j6(this.yS, r0 + 1, r1 - 1);
        if (r1 >= r6) goto L6;
        abcd.AbstractrE r7 = j6(r1, r6);
        this.v5 = r7;
        this.Zo = r7;
        return;
    }

    public abcd.HF.a J0() {
        return this.vy;
    }

    public int J8() {
        return this.gW;
    }

    void VH(int r3, int r4) {
        this.FH = j6(j6(this.FH, r3 + rN.length, r4));
        if (this.FH != "/dev/null") goto L6;
        this.VH = abcd.hC.a.j6;
        return;
    }

    public abcd.kC Ws() {
        abcd.kC r0 = new abcd.kC();
        java.util.Iterator<abcd.JF> r1 = this.P8.iterator();
    L4:
        if (r1.hasNext() == false) goto L5;
        r0.addAll(r1.next().Zo());
        goto L4
    L5:
        return r0;
    }

    void Zo(int r3, int r4) {
        this.Hw = j6(j6(this.Hw, r3 + er.length, r4));
        if (this.Hw != "/dev/null") goto L6;
        this.VH = abcd.hC.a.FH;
        return;
    }

    abcd.AbstractrE j6(int r4, int r5) {
        int r0 = 0;
    L4:
        if (r4 >= (r5 - 1)) goto L6;
        r0 = (r0 << 3) + (this.yS[r4] - 48);
        r4 = r4 + 1;
        goto L4
    L6:
        return abcd.AbstractrE.DW(r0);
    }

    void j6(abcd.JF r2) {
        if (r2.j6() != this) goto L10;
        if (this.P8 != null) goto L7;
        this.P8 = new java.util.ArrayList();
    L7:
        this.P8.add(r2);
        return;
    L10:
        throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().hunkBelongsToAnotherFile);
    }

    public byte[] tp() {
        return this.yS;
    }

    void v5(int r2, int r3) {
        this.v5 = abcd.AbstractrE.Zo;
        this.Zo = j6(r2 + J8.length, r3);
        this.VH = abcd.hC.a.j6;
    }

    public java.util.List<? extends abcd.JF> we() {
        java.util.List<abcd.JF> r0 = this.P8;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return java.util.Collections.emptyList();
    }
}
