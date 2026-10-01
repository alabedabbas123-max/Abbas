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

    public static final class a extends com.almlkaide.kaypro.internal.EnumBase {
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
            return (abcd.HF.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.HF.a.values(), r1);
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
        int r0 = 0;
        int r1 = 0;
        int r7 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = r5;
                    $pc0 = 3; continue $sw0;
                }
                case 3: {
                    if (r0 >= r6) { $pc0 = 9; continue $sw0; }
                    if (r4[r0] != 64) { $pc0 = 9; continue $sw0; }
                    r0 = r0 + 1;
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if ((r0 - r5) >= 2) { $pc0 = 11; continue $sw0; }
                    return 0;
                }
                case 11: {
                    if (r0 == r6) { $pc0 = 21; continue $sw0; }
                    r1 = r0 + 1;
                    if (r4[r0] != 32) { $pc0 = 21; continue $sw0; }
                    if (r1 == r6) { $pc0 = 21; continue $sw0; }
                    r7 = r1 + 1;
                    if (r4[r1] != 45) { $pc0 = 21; continue $sw0; }
                    return (r7 - 3) - r5;
                }
                case 21: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String j6(java.lang.String r1) {
        int r0 = 0;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = r1.indexOf(47);
                    if (r0 > 0) { $pc1 = 5; continue $sw1; }
                    return r1;
                }
                case 5: {
                    return r1.substring(r0 + 1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.String j6(java.lang.String r3, int r4, int r5) {
        byte[] r6 = null;
        java.lang.String r7 = null;
        int r8 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r4 != r5) { $pc2 = 4; continue $sw2; }
                    return r3;
                }
                case 4: {
                    r6 = this.yS;
                    if (r6[r4] != 34) { $pc2 = 7; continue $sw2; }
                    r7 = abcd.GK.j6.j6(r6, r4, r5 - 1);
                    $pc2 = 17; continue $sw2;
                }
                case 17: {
                    if (r7.equals("/dev/null") == true) { $pc2 = 19; continue $sw2; }
                    return r7;
                }
                case 19: {
                    return "/dev/null";
                }
                case 7: {
                    r8 = r5;
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    if (r4 >= r8) { $pc2 = 13; continue $sw2; }
                    if (this.yS[r8 - 1] == 9) { $pc2 = 13; continue $sw2; }
                    r8 = r8 - 1;
                    $pc2 = 13; continue $sw2;
                }
                case 13: {
                    if (r4 != r8) { $pc2 = 15; continue $sw2; }
                    r8 = r5;
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    r7 = abcd.IK.j6(abcd.hE.Zo, this.yS, r4, r8 - 1);
                    { $pc2 = 17; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean j6(int r4, int r5, int r6, int r7) {
        byte[] r8 = null;
        int r0 = 0;
        int r2 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if ((r5 - r4) == (r7 - r6)) { $pc3 = 5; continue $sw3; }
                    return false;
                }
                case 5: {
                    if (r4 >= r5) { $pc3 = 6; continue $sw3; }
                    r8 = this.yS;
                    r0 = r4 + 1;
                    r2 = r6 + 1;
                    if (r8[r4] != r8[r6]) { $pc3 = 10; continue $sw3; }
                    r4 = r0;
                    r6 = r2;
                    { $pc3 = 5; continue $sw3; }
                }
                case 10: {
                    return false;
                }
                case 6: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    int DW(int r7, int r8) {
        int r0 = 0;
        int r9 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        byte[] r1 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = abcd.IK.Zo(this.yS, r7);
                    if (r0 < r8) { $pc4 = 6; continue $sw4; }
                    return -1;
                }
                case 6: {
                    r9 = abcd.IK.DW(this.yS, r7, '/');
                    if (r9 < r0) { $pc4 = 9; continue $sw4; }
                    return r0;
                }
                case 9: {
                    r2 = r7;
                    $pc4 = 10; continue $sw4;
                }
                case 10: {
                    if (r2 >= r0) { $pc4 = 11; continue $sw4; }
                    r2 = abcd.IK.DW(this.yS, r2, ' ');
                    if (r2 >= r0) { $pc4 = 14; continue $sw4; }
                    r3 = abcd.IK.DW(this.yS, r2, '/');
                    if (r3 >= r0) { $pc4 = 17; continue $sw4; }
                    r4 = r2 - 1;
                    if (j6(r9, r4, r3, r0 - 1) == false) { $pc4 = 10; continue $sw4; }
                    r1 = this.yS;
                    if (r1[r7] == 34) { $pc4 = 23; continue $sw4; }
                    this.FH = abcd.IK.j6(abcd.hE.Zo, r1, r9, r4);
                    $pc4 = 27; continue $sw4;
                }
                case 27: {
                    this.Hw = this.FH;
                    return r0;
                }
                case 23: {
                    if (r1[r2 - 2] == 34) { $pc4 = 25; continue $sw4; }
                    return r0;
                }
                case 25: {
                    this.FH = abcd.GK.j6.j6(r1, r7, r4);
                    this.FH = j6(this.FH);
                    { $pc4 = 27; continue $sw4; }
                }
                case 17: {
                    return r0;
                }
                case 14: {
                    return r0;
                }
                case 11: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int EQ() {
        return this.BT;
    }

    int FH(int r5, int r6) {
        int r0 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 2;
        $sw5: while (true) {
            switch ($pc5) {
                case 2: {
                    if (r5 >= r6) { $pc5 = 53; continue $sw5; }
                    r0 = abcd.IK.Zo(this.yS, r5);
                    if (j6(this.yS, r5, r0) >= 1) { $pc5 = 53; continue $sw5; }
                    if (abcd.IK.j6(this.yS, r5, rN) < 0) { $pc5 = 11; continue $sw5; }
                    VH(r5, r0);
                    $pc5 = 52; continue $sw5;
                }
                case 52: {
                    r5 = r0;
                    { $pc5 = 2; continue $sw5; }
                }
                case 11: {
                    if (abcd.IK.j6(this.yS, r5, er) < 0) { $pc5 = 14; continue $sw5; }
                    Zo(r5, r0);
                    { $pc5 = 52; continue $sw5; }
                }
                case 14: {
                    if (abcd.IK.j6(this.yS, r5, EQ) < 0) { $pc5 = 17; continue $sw5; }
                    this.v5 = j6(r5 + EQ.length, r0);
                    { $pc5 = 52; continue $sw5; }
                }
                case 17: {
                    if (abcd.IK.j6(this.yS, r5, we) < 0) { $pc5 = 20; continue $sw5; }
                    this.Zo = j6(r5 + we.length, r0);
                    { $pc5 = 52; continue $sw5; }
                }
                case 20: {
                    if (abcd.IK.j6(this.yS, r5, J0) < 0) { $pc5 = 23; continue $sw5; }
                    this.v5 = j6(r5 + J0.length, r0);
                    this.Zo = abcd.AbstractrE.Zo;
                    this.VH = abcd.hC.a.FH;
                    { $pc5 = 52; continue $sw5; }
                }
                case 23: {
                    if (abcd.IK.j6(this.yS, r5, J8) < 0) { $pc5 = 26; continue $sw5; }
                    v5(r5, r0);
                    { $pc5 = 52; continue $sw5; }
                }
                case 26: {
                    if (abcd.IK.j6(this.yS, r5, Ws) < 0) { $pc5 = 29; continue $sw5; }
                    this.FH = j6(this.FH, r5 + Ws.length, r0);
                    this.VH = abcd.hC.a.v5;
                    { $pc5 = 52; continue $sw5; }
                }
                case 29: {
                    if (abcd.IK.j6(this.yS, r5, QX) < 0) { $pc5 = 32; continue $sw5; }
                    this.Hw = j6(this.Hw, r5 + QX.length, r0);
                    this.VH = abcd.hC.a.v5;
                    { $pc5 = 52; continue $sw5; }
                }
                case 32: {
                    if (abcd.IK.j6(this.yS, r5, XL) < 0) { $pc5 = 35; continue $sw5; }
                    this.FH = j6(this.FH, r5 + XL.length, r0);
                    this.VH = abcd.hC.a.Hw;
                    { $pc5 = 52; continue $sw5; }
                }
                case 35: {
                    if (abcd.IK.j6(this.yS, r5, aM) < 0) { $pc5 = 38; continue $sw5; }
                    this.Hw = j6(this.Hw, r5 + aM.length, r0);
                    this.VH = abcd.hC.a.Hw;
                    { $pc5 = 52; continue $sw5; }
                }
                case 38: {
                    if (abcd.IK.j6(this.yS, r5, j3) < 0) { $pc5 = 41; continue $sw5; }
                    this.FH = j6(this.FH, r5 + j3.length, r0);
                    this.VH = abcd.hC.a.Hw;
                    { $pc5 = 52; continue $sw5; }
                }
                case 41: {
                    if (abcd.IK.j6(this.yS, r5, Mr) < 0) { $pc5 = 44; continue $sw5; }
                    this.Hw = j6(this.Hw, r5 + Mr.length, r0);
                    this.VH = abcd.hC.a.Hw;
                    { $pc5 = 52; continue $sw5; }
                }
                case 44: {
                    if (abcd.IK.j6(this.yS, r5, U2) < 0) { $pc5 = 47; continue $sw5; }
                    this.gn = abcd.IK.j6(this.yS, r5 + U2.length, null);
                    { $pc5 = 52; continue $sw5; }
                }
                case 47: {
                    if (abcd.IK.j6(this.yS, r5, a8) < 0) { $pc5 = 50; continue $sw5; }
                    this.gn = abcd.IK.j6(this.yS, r5 + a8.length, null);
                    { $pc5 = 52; continue $sw5; }
                }
                case 50: {
                    if (abcd.IK.j6(this.yS, r5, lg) < 0) { $pc5 = 53; continue $sw5; }
                    Hw(r5 + lg.length, r0);
                    $pc5 = 53; continue $sw5;
                }
                case 53: {
                    return r5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void Hw(int r5, int r6) {
        int r0 = 0;
        int r1 = 0;
        abcd.AbstractrE r7 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = abcd.IK.DW(this.yS, r5, '.');
                    r1 = abcd.IK.DW(this.yS, r0, ' ');
                    this.u7 = abcd.WD.j6(this.yS, r5, r0 - 1);
                    this.tp = abcd.WD.j6(this.yS, r0 + 1, r1 - 1);
                    if (r1 >= r6) { $pc6 = 6; continue $sw6; }
                    r7 = j6(r1, r6);
                    this.v5 = r7;
                    this.Zo = r7;
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.HF.a J0() {
        return this.vy;
    }

    public int J8() {
        return this.gW;
    }

    void VH(int r3, int r4) {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    this.FH = j6(j6(this.FH, r3 + rN.length, r4));
                    if (this.FH != "/dev/null") { $pc7 = 6; continue $sw7; }
                    this.VH = abcd.hC.a.j6;
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.kC Ws() {
        abcd.kC r0 = null;
        java.util.Iterator<abcd.JF> r1 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = new abcd.kC();
                    r1 = this.P8.iterator();
                    $pc8 = 4; continue $sw8;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc8 = 5; continue $sw8; }
                    r0.addAll(r1.next().Zo());
                    { $pc8 = 4; continue $sw8; }
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void Zo(int r3, int r4) {
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    this.Hw = j6(j6(this.Hw, r3 + er.length, r4));
                    if (this.Hw != "/dev/null") { $pc9 = 6; continue $sw9; }
                    this.VH = abcd.hC.a.FH;
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    abcd.AbstractrE j6(int r4, int r5) {
        int r0 = 0;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = 0;
                    $pc10 = 4; continue $sw10;
                }
                case 4: {
                    if (r4 >= (r5 - 1)) { $pc10 = 6; continue $sw10; }
                    r0 = (r0 << 3) + (this.yS[r4] - 48);
                    r4 = r4 + 1;
                    { $pc10 = 4; continue $sw10; }
                }
                case 6: {
                    return abcd.AbstractrE.DW(r0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    void j6(abcd.JF r2) {
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    if (r2.j6() != this) { $pc11 = 10; continue $sw11; }
                    if (this.P8 != null) { $pc11 = 7; continue $sw11; }
                    this.P8 = new java.util.ArrayList();
                    $pc11 = 7; continue $sw11;
                }
                case 7: {
                    this.P8.add(r2);
                    return;
                }
                case 10: {
                    throw new java.lang.IllegalArgumentException(org.eclipse.jgit.JGitText.j6().hunkBelongsToAnotherFile);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
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
        java.util.List<abcd.JF> r0 = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r0 = this.P8;
                    if (r0 == null) { $pc12 = 5; continue $sw12; }
                    return r0;
                }
                case 5: {
                    return java.util.Collections.emptyList();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
