package abcd;

public class IJ {
    private static int[] DW;
    private static int[] j6;
    private final abcd.fG BT;
    private abcd.DI EQ;
    private final abcd.UE FH;
    private final abcd.qG Hw;
    private java.util.Map<java.lang.String, abcd.ME> J0;
    private abcd.VI J8;
    private boolean KD;
    private final java.util.Set<abcd.yE> Mr;
    private final abcd.fG P8;
    private final java.util.Set<java.lang.String> QX;
    private abcd.AbstracteI.c SI;
    private final java.util.List<abcd.yE> U2;
    private boolean VH;
    private abcd.KI Ws;
    private final java.util.Set<abcd.yE> XL;
    private int Zo;
    private int a8;
    private final java.util.Set<abcd.AbstractiG> aM;
    private abcd.LJ cn;
    private final abcd.hG ei;
    private boolean er;
    private final abcd.fG gW;
    private abcd.VK gn;
    private final java.util.Set<abcd.AbstractiG> j3;
    private int lg;
    private abcd.IJ.a nw;
    private java.lang.Boolean rN;
    private abcd.TH.c ro;
    private java.io.OutputStream tp;
    private java.io.InputStream u7;
    private abcd.NH v5;
    private final abcd.fG vy;
    private abcd.EI we;
    private java.util.Set<abcd.yE> yS;

    public static final class a extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.IJ.a DW = null;
        public static final abcd.IJ.a FH = null;
        private static final abcd.IJ.a[] Hw = null;
        public static final abcd.IJ.a j6 = null;

        static {
            j6 = new abcd.IJ.a("ADVERTISED", 0);
            DW = new abcd.IJ.a("REACHABLE_COMMIT", 1);
            FH = new abcd.IJ.a("ANY", 2);
            Hw = new abcd.IJ.a[]{j6, DW, FH};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.IJ.a valueOf(java.lang.String r1) {
            return (abcd.IJ.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.IJ.a.values(), r1);
        }

        public static abcd.IJ.a[] values() {
            abcd.IJ.a[] r0 = Hw;
            int r1 = r0.length;
            abcd.IJ.a[] r2 = new abcd.IJ.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    public IJ(abcd.UE r2) {
        this.VH = true;
        this.Ws = abcd.KI.j6;
        this.QX = new java.util.HashSet();
        this.XL = new java.util.HashSet();
        this.aM = new java.util.HashSet();
        this.j3 = new java.util.HashSet();
        this.Mr = new java.util.HashSet();
        this.U2 = new java.util.ArrayList();
        this.nw = abcd.IJ.a.j6;
        this.SI = abcd.AbstracteI.c.j6;
        this.cn = abcd.LJ.j6;
        this.FH = r2;
        this.Hw = new abcd.qG(this.FH);
        this.Hw.j6(false);
        this.gW = this.Hw.j6("WANT");
        this.BT = this.Hw.j6("PEER_HAS");
        this.vy = this.Hw.j6("COMMON");
        this.P8 = this.Hw.j6("SATISFIED");
        this.Hw.j6(this.BT);
        this.ei = new abcd.hG();
        this.ei.j6(this.gW);
        this.ei.j6(this.BT);
        this.ei.j6(this.vy);
        this.ei.j6(this.P8);
        this.J8 = abcd.VI.j6;
    }

    private boolean DW(abcd.AbstractiG r8) {
        int r0 = 0;
        abcd.dG r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r8.DW(this.P8) == false) { $pc0 = 5; continue $sw0; }
                    return true;
                }
                case 5: {
                    this.Hw.j6(this.ei);
                    this.Hw.DW((abcd.dG) r8);
                    r0 = this.lg;
                    if (r0 == 0) { $pc0 = 8; continue $sw0; }
                    this.Hw.j6(abcd.AbstractwG.j6(((long) r0) * 1000));
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    r1 = this.Hw.tp();
                    if (r1 == null) { $pc0 = 10; continue $sw0; }
                    if (r1.DW(this.BT) == false) { $pc0 = 8; continue $sw0; }
                    j6(r1);
                    r8.j6(this.P8);
                    return true;
                }
                case 10: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int[] DW() {
        int[] r0 = null;
        int[] r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = DW;
                    if (r0 == null) { $pc1 = 5; continue $sw1; }
                    return r0;
                }
                case 5: {
                    r1 = new int[abcd.IJ.a.values().length];
                    try {
                        r1[abcd.IJ.a.j6.ordinal()] = 1;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc1 = 11; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    try {
                        r1[abcd.IJ.a.FH.ordinal()] = 3;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc1 = 12; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 18; continue $sw1;
                }
                case 18: {
                    try {
                        r1[abcd.IJ.a.DW.ordinal()] = 2;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc1 = 13; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 9; continue $sw1;
                }
                case 9: {
                    DW = r1;
                    return r1;
                }
                case 11: {
                    throw new java.lang.IllegalStateException();
                }
                case 12: {
                    throw new java.lang.IllegalStateException();
                }
                case 13: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void EQ() {
        java.util.Iterator<abcd.ME> r0 = null;
        abcd.ME r1 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.VH == false) { $pc2 = 6; continue $sw2; }
                    j6(new abcd.TI.a(this.we));
                    $pc2 = 47; continue $sw2;
                }
                case 47: {
                    try {
                        gn();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Error) { $pc2 = 29; continue $sw2; }
                        if ($t instanceof java.lang.RuntimeException) { $pc2 = 32; continue $sw2; }
                        if ($t instanceof java.io.IOException) { $pc2 = 35; continue $sw2; }
                        if ($t instanceof abcd.MJ) { $pc2 = 38; continue $sw2; }
                        if ($t instanceof abcd.nD) { $pc2 = 41; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.XL.isEmpty() == false) { $pc2 = 16; continue $sw2; }
                    try {
                        this.Ws.j6(this, this.XL, 0);
                        this.Ws.j6(this, this.XL, 0, 0, false);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Error) { $pc2 = 29; continue $sw2; }
                        if ($t instanceof java.lang.RuntimeException) { $pc2 = 32; continue $sw2; }
                        if ($t instanceof java.io.IOException) { $pc2 = 35; continue $sw2; }
                        if ($t instanceof abcd.MJ) { $pc2 = 38; continue $sw2; }
                        if ($t instanceof abcd.nD) { $pc2 = 41; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 16: {
                    if (this.QX.contains("multi_ack_detailed") == false) { $pc2 = 19; continue $sw2; }
                    try {
                        this.SI = abcd.AbstracteI.c.FH;
                        this.KD = this.QX.contains("no-done");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Error) { $pc2 = 29; continue $sw2; }
                        if ($t instanceof java.lang.RuntimeException) { $pc2 = 32; continue $sw2; }
                        if ($t instanceof java.io.IOException) { $pc2 = 35; continue $sw2; }
                        if ($t instanceof abcd.MJ) { $pc2 = 38; continue $sw2; }
                        if ($t instanceof abcd.nD) { $pc2 = 41; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 23; continue $sw2;
                }
                case 23: {
                    if (this.a8 == 0) { $pc2 = 26; continue $sw2; }
                    try {
                        VH();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Error) { $pc2 = 29; continue $sw2; }
                        if ($t instanceof java.lang.RuntimeException) { $pc2 = 32; continue $sw2; }
                        if ($t instanceof java.io.IOException) { $pc2 = 35; continue $sw2; }
                        if ($t instanceof abcd.MJ) { $pc2 = 38; continue $sw2; }
                        if ($t instanceof abcd.nD) { $pc2 = 41; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 26; continue $sw2;
                }
                case 26: {
                    if (Hw() == false) { $pc2 = 52; continue $sw2; }
                    tp();
                    return;
                }
                case 52: {
                    return;
                }
                case 19: {
                    if (this.QX.contains("multi_ack") == false) { $pc2 = 21; continue $sw2; }
                    try {
                        this.SI = abcd.AbstracteI.c.DW;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Error) { $pc2 = 29; continue $sw2; }
                        if ($t instanceof java.lang.RuntimeException) { $pc2 = 32; continue $sw2; }
                        if ($t instanceof java.io.IOException) { $pc2 = 35; continue $sw2; }
                        if ($t instanceof abcd.MJ) { $pc2 = 38; continue $sw2; }
                        if ($t instanceof abcd.nD) { $pc2 = 41; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc2 = 23; continue $sw2; }
                }
                case 21: {
                    try {
                        this.SI = abcd.AbstracteI.c.j6;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Error) { $pc2 = 29; continue $sw2; }
                        if ($t instanceof java.lang.RuntimeException) { $pc2 = 32; continue $sw2; }
                        if ($t instanceof java.io.IOException) { $pc2 = 35; continue $sw2; }
                        if ($t instanceof abcd.MJ) { $pc2 = 38; continue $sw2; }
                        if ($t instanceof abcd.nD) { $pc2 = 41; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 38: {
                    e = $ex2;
                    e.j6();
                    throw null;
                }
                case 41: {
                    e = $ex2;
                    j6(e.getMessage());
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 35: {
                    e = $ex2;
                    j6(org.eclipse.jgit.JGitText.j6().internalServerError);
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 29: {
                    e = $ex2;
                    j6(org.eclipse.jgit.JGitText.j6().internalServerError);
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 32: {
                    e = $ex2;
                    j6(org.eclipse.jgit.JGitText.j6().internalServerError);
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 6: {
                    if (this.nw != abcd.IJ.a.FH) { $pc2 = 8; continue $sw2; }
                    this.yS = java.util.Collections.emptySet();
                    { $pc2 = 47; continue $sw2; }
                }
                case 8: {
                    this.yS = new java.util.HashSet();
                    r0 = FH().values().iterator();
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    if (r0.hasNext() == false) { $pc2 = 47; continue $sw2; }
                    r1 = r0.next();
                    if (r1.DW() == null) { $pc2 = 10; continue $sw2; }
                    this.yS.add(r1.DW());
                    { $pc2 = 10; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean Hw() {
        abcd.yE r0 = null;
        java.util.ArrayList r1 = null;
        java.lang.String r3 = null;
        abcd.yE r2 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    this.rN = java.lang.Boolean.FALSE;
                    r0 = abcd.yE.Ws();
                    r1 = new java.util.ArrayList(64);
                    $pc3 = 47; continue $sw3;
                }
                case 47: {
                    try {
                        r3 = this.EQ.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.io.EOFException) { $pc3 = 38; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r3 == abcd.DI.j6) { $pc3 = 7; continue $sw3; }
                    if (r3.startsWith("have ") == false) { $pc3 = 28; continue $sw3; }
                    if (r3.length() != 45) { $pc3 = 28; continue $sw3; }
                    r1.add(abcd.yE.j6(r3.substring(5)));
                    $pc3 = 28; continue $sw3;
                }
                case 28: {
                    if (r3.equals("done") == false) { $pc3 = 37; continue $sw3; }
                    r2 = j6(r1, r0);
                    if (this.j3.isEmpty() == false) { $pc3 = 33; continue $sw3; }
                    this.we.j6("NAK\n");
                    $pc3 = 35; continue $sw3;
                }
                case 35: {
                    return true;
                }
                case 33: {
                    if (this.SI == abcd.AbstracteI.c.j6) { $pc3 = 35; continue $sw3; }
                    this.we.j6("ACK " + r2.we() + "\n");
                    { $pc3 = 35; continue $sw3; }
                }
                case 37: {
                    throw new abcd.nD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().expectedGot, new java.lang.Object[]{"have", r3}));
                }
                case 7: {
                    r0 = j6(r1, r0);
                    if (this.j3.isEmpty() == false) { $pc3 = 10; continue $sw3; }
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    this.we.j6("NAK\n");
                    $pc3 = 13; continue $sw3;
                }
                case 13: {
                    if (this.KD == false) { $pc3 = 19; continue $sw3; }
                    if (this.er == false) { $pc3 = 19; continue $sw3; }
                    this.we.j6("ACK " + r0.we() + "\n");
                    return true;
                }
                case 19: {
                    if (this.VH == false) { $pc3 = 20; continue $sw3; }
                    this.we.DW();
                    { $pc3 = 47; continue $sw3; }
                }
                case 20: {
                    return false;
                }
                case 10: {
                    if (this.SI == abcd.AbstracteI.c.j6) { $pc3 = 13; continue $sw3; }
                    $pc3 = 45; continue $sw3;
                }
                case 38: {
                    e = $ex3;
                    if (this.VH == false) { $pc3 = 42; continue $sw3; }
                    $pc3 = 45; continue $sw3;
                }
                case 45: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 42: {
                    if (this.a8 <= 0) { $pc3 = 45; continue $sw3; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void VH() {
        abcd.TF.c r0 = null;
        java.util.Iterator<abcd.yE> r1 = null;
        abcd.dG r2 = null;
        abcd.TF.a r3 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = new abcd.TF.c(this.Hw.Zo(), this.a8);
                    r1 = this.XL.iterator();
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc4 = 5; continue $sw4; }
                    try {
                        r0.Hw(r0.VH(r1.next()));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof abcd.ZC) { $pc4 = 22; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    r2 = r0.tp();
                    if (r2 == null) { $pc4 = 7; continue $sw4; }
                    r3 = (abcd.TF.a) r2;
                    if (r3.BT() != this.a8) { $pc4 = 15; continue $sw4; }
                    if (this.Mr.contains(r3) == true) { $pc4 = 15; continue $sw4; }
                    this.we.j6("shallow " + r2.we());
                    $pc4 = 15; continue $sw4;
                }
                case 15: {
                    if (r3.BT() >= this.a8) { $pc4 = 5; continue $sw4; }
                    if (this.Mr.contains(r3) == false) { $pc4 = 5; continue $sw4; }
                    this.U2.add(r3.Hw());
                    this.we.j6("unshallow " + r3.we());
                    { $pc4 = 5; continue $sw4; }
                }
                case 7: {
                    this.we.j6();
                    return;
                }
                case 22: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean Zo() {
        java.util.Iterator<abcd.AbstractiG> r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (this.j3.isEmpty() == false) { $pc5 = 17; continue $sw5; }
                    return false;
                }
                case 17: {
                    try {
                        r0 = this.aM.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 13; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc5 = 7; continue $sw5;
                }
                case 7: {
                    if (r0.hasNext() == false) { $pc5 = 8; continue $sw5; }
                    if (DW(r0.next()) == true) { $pc5 = 7; continue $sw5; }
                    return false;
                }
                case 8: {
                    return true;
                }
                case 13: {
                    e = $ex5;
                    throw new abcd.nD(org.eclipse.jgit.JGitText.j6().internalRevisionError, e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void gn() {
        boolean r2 = false;
        java.lang.String r3 = null;
        java.lang.String r4 = null;
        java.lang.String[] r5 = null;
        int r6 = 0;
        int r7 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r2 = true;
                    $pc6 = 36; continue $sw6;
                }
                case 36: {
                    try {
                        r3 = this.EQ.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.io.EOFException) { $pc6 = 30; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r3 == abcd.DI.j6) { $pc6 = 50; continue $sw6; }
                    if (r3.startsWith("deepen ") == true) { $pc6 = 9; continue $sw6; }
                    if (r3.startsWith("shallow ") == true) { $pc6 = 12; continue $sw6; }
                    if (r3.startsWith("want ") == false) { $pc6 = 29; continue $sw6; }
                    if (r3.length() < 45) { $pc6 = 29; continue $sw6; }
                    if (r2 == true) { $pc6 = 19; continue $sw6; }
                    $pc6 = 27; continue $sw6;
                }
                case 27: {
                    this.XL.add(abcd.yE.j6(r3.substring(5)));
                    r2 = false;
                    { $pc6 = 36; continue $sw6; }
                }
                case 19: {
                    if (r3.length() <= 45) { $pc6 = 27; continue $sw6; }
                    r4 = r3.substring(45);
                    if (r4.startsWith(" ") == false) { $pc6 = 23; continue $sw6; }
                    r4 = r4.substring(1);
                    $pc6 = 23; continue $sw6;
                }
                case 23: {
                    r5 = r4.split(" ");
                    r6 = r5.length;
                    r7 = 0;
                    $pc6 = 24; continue $sw6;
                }
                case 24: {
                    if (r7 >= r6) { $pc6 = 25; continue $sw6; }
                    this.QX.add(r5[r7]);
                    r7 = r7 + 1;
                    { $pc6 = 24; continue $sw6; }
                }
                case 25: {
                    r3 = r3.substring(0, 45);
                    $pc6 = 29; continue $sw6;
                }
                case 29: {
                    throw new abcd.nD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().expectedGot, new java.lang.Object[]{"want", r3}));
                }
                case 12: {
                    this.Mr.add(abcd.yE.j6(r3.substring(8)));
                    { $pc6 = 36; continue $sw6; }
                }
                case 9: {
                    this.a8 = java.lang.Integer.parseInt(r3.substring(7));
                    { $pc6 = 36; continue $sw6; }
                }
                case 50: {
                    return;
                }
                case 30: {
                    e = $ex6;
                    if (r2 == false) { $pc6 = 34; continue $sw6; }
                    return;
                }
                case 34: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.yE j6(java.util.List<abcd.yE> r14, abcd.yE r15) {
        boolean r0 = false;
        java.util.HashSet r2 = null;
        java.util.List r5 = null;
        java.util.HashSet r4 = null;
        boolean r1 = false;
        abcd.MF r3 = null;
        int r8 = 0;
        abcd.AbstractiG r6 = null;
        abcd.AbstractiG r11 = null;
        abcd.dG r16 = null;
        int r17 = 0;
        int r7 = 0;
        int r9 = 0;
        abcd.yE r10 = null;
        int r12 = 0;
        abcd.yE r13 = null;
        int r18 = 0;
        abcd.yE r19 = null;
        java.util.HashSet r20 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    this.Ws.j6(this, this.XL, r14.size());
                    if (r14.isEmpty() == false) { $pc7 = 5; continue $sw7; }
                    return r15;
                }
                case 5: {
                    r0 = false;
                    this.er = false;
                    r2 = null;
                    if (this.aM.isEmpty() == true) { $pc7 = 8; continue $sw7; }
                    $pc7 = 10; continue $sw7;
                }
                case 10: {
                    r5 = r14;
                    r4 = null;
                    r1 = false;
                    $pc7 = 11; continue $sw7;
                }
                case 11: {
                    r3 = this.Hw.j6(r5, r1);
                    r8 = 0;
                    $pc7 = 112; continue $sw7;
                }
                case 112: {
                    try {
                        r6 = r3.next();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof abcd.fD) { $pc7 = 103; continue $sw7; }
                        $pc7 = 101; continue $sw7;
                    }
                    $pc7 = 14; continue $sw7;
                }
                case 14: {
                    if (r6 == null) { $pc7 = 15; continue $sw7; }
                    if (this.XL.remove(r6) == false) { $pc7 = 77; continue $sw7; }
                    if (this.yS.contains(r6) == true) { $pc7 = 62; continue $sw7; }
                    if (this.nw == abcd.IJ.a.FH) { $pc7 = 62; continue $sw7; }
                    if (r2 != null) { $pc7 = 60; continue $sw7; }
                    try {
                        r2 = new java.util.HashSet();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 101; continue $sw7;
                    }
                    $pc7 = 60; continue $sw7;
                }
                case 60: {
                    try {
                        r2.add(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 101; continue $sw7;
                    }
                    $pc7 = 62; continue $sw7;
                }
                case 62: {
                    if (r6.DW(this.gW) == true) { $pc7 = 65; continue $sw7; }
                    try {
                        r6.j6(this.gW);
                        this.aM.add(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 101; continue $sw7;
                    }
                    $pc7 = 65; continue $sw7;
                }
                case 65: {
                    if ((r6 instanceof abcd.dG) == true) { $pc7 = 68; continue $sw7; }
                    try {
                        r6.j6(this.P8);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 101; continue $sw7;
                    }
                    $pc7 = 68; continue $sw7;
                }
                case 68: {
                    if ((r6 instanceof abcd.lG) == false) { $pc7 = 75; continue $sw7; }
                    try {
                        r11 = this.Hw.FH(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 101; continue $sw7;
                    }
                    if ((r11 instanceof abcd.dG) == false) { $pc7 = 75; continue $sw7; }
                    if (r11.DW(this.gW) == true) { $pc7 = 75; continue $sw7; }
                    try {
                        r11.j6(this.gW);
                        this.aM.add(r11);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 101; continue $sw7;
                    }
                    $pc7 = 75; continue $sw7;
                }
                case 75: {
                    if (r4.contains(r6) == false) { $pc7 = 112; continue $sw7; }
                    $pc7 = 77; continue $sw7;
                }
                case 77: {
                    try {
                        r8 = r8 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 101; continue $sw7;
                    }
                    if ((r6 instanceof abcd.dG) == false) { $pc7 = 85; continue $sw7; }
                    try {
                        r16 = (abcd.dG) r6;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 101; continue $sw7;
                    }
                    if (this.lg != 0) { $pc7 = 82; continue $sw7; }
                    $pc7 = 83; continue $sw7;
                }
                case 83: {
                    try {
                        this.lg = r16.U2();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 101; continue $sw7;
                    }
                    { $pc7 = 85; continue $sw7; }
                }
                case 82: {
                    if (r16.U2() < this.lg) { $pc7 = 83; continue $sw7; }
                    $pc7 = 85; continue $sw7;
                }
                case 85: {
                    if (r6.DW(this.BT) == true) { $pc7 = 100; continue $sw7; }
                    try {
                        r6.j6(this.BT);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 101; continue $sw7;
                    }
                    if ((r6 instanceof abcd.dG) == false) { $pc7 = 90; continue $sw7; }
                    try {
                        ((abcd.dG) r6).FH(this.BT);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 101; continue $sw7;
                    }
                    $pc7 = 90; continue $sw7;
                }
                case 90: {
                    try {
                        j6(r6);
                        r17 = j6()[this.SI.ordinal()];
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 101; continue $sw7;
                    }
                    if (r17 == 1) { $pc7 = 98; continue $sw7; }
                    if (r17 == 2) { $pc7 = 96; continue $sw7; }
                    if (r17 != 3) { $pc7 = 100; continue $sw7; }
                    try {
                        this.we.j6("ACK " + r6.we() + " common\n");
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 101; continue $sw7;
                    }
                    { $pc7 = 100; continue $sw7; }
                }
                case 96: {
                    try {
                        this.we.j6("ACK " + r6.we() + " continue\n");
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 101; continue $sw7;
                    }
                    { $pc7 = 100; continue $sw7; }
                }
                case 98: {
                    if (this.j3.size() != 1) { $pc7 = 100; continue $sw7; }
                    try {
                        this.we.j6("ACK " + r6.we() + "\n");
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 101; continue $sw7;
                    }
                    $pc7 = 100; continue $sw7;
                }
                case 100: {
                    r15 = r6;
                    { $pc7 = 112; continue $sw7; }
                }
                case 15: {
                    r3.j6();
                    if (r2 != null) { $pc7 = 18; continue $sw7; }
                    $pc7 = 26; continue $sw7;
                }
                case 26: {
                    r7 = r14.size() - r8;
                    if (r7 <= 0) { $pc7 = 45; continue $sw7; }
                    r9 = r14.size() - 1;
                    $pc7 = 29; continue $sw7;
                }
                case 29: {
                    if (r9 < 0) { $pc7 = 45; continue $sw7; }
                    r10 = r14.get(r9);
                    if (this.Hw.Hw(r10) == null) { $pc7 = 34; continue $sw7; }
                    r9 = r9 - 1;
                    { $pc7 = 29; continue $sw7; }
                }
                case 34: {
                    if (v5() == false) { $pc7 = 42; continue $sw7; }
                    r12 = j6()[this.SI.ordinal()];
                    if (r12 == 1) { $pc7 = 42; continue $sw7; }
                    if (r12 == 2) { $pc7 = 41; continue $sw7; }
                    if (r12 != 3) { $pc7 = 42; continue $sw7; }
                    this.we.j6("ACK " + r10.we() + " ready\n");
                    this.er = true;
                    { $pc7 = 42; continue $sw7; }
                }
                case 41: {
                    this.we.j6("ACK " + r10.we() + " continue\n");
                    $pc7 = 42; continue $sw7;
                }
                case 42: {
                    r0 = true;
                    $pc7 = 45; continue $sw7;
                }
                case 45: {
                    if (this.SI != abcd.AbstracteI.c.FH) { $pc7 = 50; continue $sw7; }
                    if (r0 == true) { $pc7 = 50; continue $sw7; }
                    if (v5() == false) { $pc7 = 50; continue $sw7; }
                    r13 = r14.get(r14.size() - 1);
                    this.er = true;
                    this.we.j6("ACK " + r13.we() + " ready\n");
                    this.er = true;
                    $pc7 = 50; continue $sw7;
                }
                case 50: {
                    this.Ws.j6(this, this.aM, r8, r7, this.er);
                    r14.clear();
                    return r15;
                }
                case 18: {
                    if (r2.isEmpty() == true) { $pc7 = 26; continue $sw7; }
                    r18 = DW()[this.nw.ordinal()];
                    if (r18 == 2) { $pc7 = 25; continue $sw7; }
                    if (r18 == 3) { $pc7 = 26; continue $sw7; }
                    throw new abcd.nD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().wantNotValid, new java.lang.Object[]{r2.iterator().next().we()}));
                }
                case 25: {
                    j6(r2);
                    $pc7 = 8; continue $sw7;
                }
                case 103: {
                    e = $ex7;
                    try {
                        r19 = e.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 101; continue $sw7;
                    }
                    if (this.XL.contains(r19) == false) { $pc7 = 112; continue $sw7; }
                    try {
                        throw new abcd.nD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().wantNotValid, new java.lang.Object[]{r19.we()}), e);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 101; continue $sw7;
                    }
                }
                case 101: {
                    th = $ex7;
                    r3.j6();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 8: {
                    if (this.XL.isEmpty() == true) { $pc7 = 10; continue $sw7; }
                    r20 = new java.util.HashSet(r14);
                    r5 = new java.util.ArrayList(this.XL.size() + r20.size());
                    r5.addAll(this.XL);
                    r5.addAll(r20);
                    r4 = r20;
                    r1 = true;
                    { $pc7 = 11; continue $sw7; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.AbstractiG r2) {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (r2.DW(this.vy) == true) { $pc8 = 6; continue $sw8; }
                    r2.j6(this.vy);
                    this.j3.add(r2);
                    this.rN = null;
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.lang.String r4) {
        this.we.j6("ERR " + r4 + "\n");     // Catch: java.lang.Throwable -> L4
        return;
    }

    private void j6(java.util.Set<abcd.AbstractiG> r6) {
        java.util.Iterator<abcd.AbstractiG> r0 = null;
        abcd.AbstractiG r1 = null;
        java.util.Iterator<abcd.yE> r2 = null;
        abcd.dG r7 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = r6.iterator();
                    $pc9 = 4; continue $sw9;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc9 = 5; continue $sw9; }
                    r1 = r0.next();
                    if ((r1 instanceof abcd.dG) == false) { $pc9 = 22; continue $sw9; }
                    this.Hw.DW((abcd.dG) r1);
                    { $pc9 = 4; continue $sw9; }
                }
                case 22: {
                    throw new abcd.nD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().wantNotValid, new java.lang.Object[]{r6.iterator().next().we()}));
                }
                case 5: {
                    r2 = this.yS.iterator();
                    $pc9 = 7; continue $sw9;
                }
                case 7: {
                    if (r2.hasNext() == false) { $pc9 = 8; continue $sw9; }
                    try {
                        this.Hw.FH(this.Hw.VH(r2.next()));
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        if ($t instanceof abcd.ZC) { $pc9 = 17; continue $sw9; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc9 = 7; continue $sw9; }
                }
                case 8: {
                    r7 = this.Hw.tp();
                    if (r7 != null) { $pc9 = 13; continue $sw9; }
                    this.Hw.we();
                    return;
                }
                case 13: {
                    throw new abcd.nD(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().wantNotValid, new java.lang.Object[]{r7.we()}));
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(boolean r11) {
        abcd.LE r0 = null;
        java.io.OutputStream r1 = null;
        int r2 = 0;
        java.io.OutputStream r4 = null;
        abcd.aJ r3 = null;
        abcd.aJ r5 = null;
        abcd.NH r6 = null;
        abcd.TH r7 = null;
        java.util.HashSet r8 = null;
        java.util.Iterator<abcd.ME> r9 = null;
        abcd.ME r10 = null;
        abcd.qG r12 = null;
        abcd.qG r13 = null;
        abcd.TH.c r14 = null;
        java.util.Iterator<abcd.ME> r15 = null;
        abcd.ME r16 = null;
        abcd.yE r17 = null;
        abcd.AbstractiG r18 = null;
        abcd.yE r19 = null;
        abcd.yE r20 = null;
        abcd._F r21 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = abcd.vE.j6;
                    r1 = this.tp;
                    if (r11 == false) { $pc10 = 10; continue $sw10; }
                    r2 = 1000;
                    if (this.QX.contains("side-band-64k") == false) { $pc10 = 7; continue $sw10; }
                    r2 = 65520;
                    $pc10 = 7; continue $sw10;
                }
                case 7: {
                    r4 = new abcd.aJ(1, r2, this.tp);
                    if (this.QX.contains("no-progress") == true) { $pc10 = 11; continue $sw10; }
                    r3 = new abcd.aJ(2, r2, this.tp);
                    r5 = r3;
                    r0 = new abcd.bJ(r3);
                    $pc10 = 97; continue $sw10;
                }
                case 97: {
                    $pc10 = 93; continue $sw10;
                }
                case 86: {
                    e = $ex10;
                    if (r11 == true) { $pc10 = 89; continue $sw10; }
                    $pc10 = 93; continue $sw10;
                }
                case 93: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 89: {
                    if (e.getMessage() == null) { $pc10 = 93; continue $sw10; }
                    e.DW();
                    throw null;
                }
                case 13: {
                    if (this.aM.isEmpty() == false) { $pc10 = 15; continue $sw10; }
                    try {
                        this.Ws.j6(this, this.XL, this.j3);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof abcd.MJ) { $pc10 = 86; continue $sw10; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc10 = 16; continue $sw10;
                }
                case 16: {
                    r6 = this.v5;
                    if (r6 != null) { $pc10 = 19; continue $sw10; }
                    r6 = new abcd.NH(this.FH);
                    $pc10 = 19; continue $sw10;
                }
                case 19: {
                    r7 = new abcd.TH(r6, this.Hw.Zo());
                    try {
                        r7.v5(true);
                        r7.DW(true);
                        r7.j6(this.QX.contains("ofs-delta"));
                        r7.Hw(this.QX.contains("thin-pack"));
                        r7.FH(false);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 83; continue $sw10;
                    }
                    if (this.j3.isEmpty() == false) { $pc10 = 38; continue $sw10; }
                    if (this.J0 == null) { $pc10 = 38; continue $sw10; }
                    try {
                        r8 = new java.util.HashSet();
                        r9 = this.J0.values().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 83; continue $sw10;
                    }
                    $pc10 = 26; continue $sw10;
                }
                case 26: {
                    if (r9.hasNext() == false) { $pc10 = 27; continue $sw10; }
                    try {
                        r10 = r9.next();
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 83; continue $sw10;
                    }
                    if (r10.FH() != null) { $pc10 = 30; continue $sw10; }
                    if (r10.DW() == null) { $pc10 = 26; continue $sw10; }
                    if (r10.getName().startsWith("refs/heads/") == false) { $pc10 = 26; continue $sw10; }
                    try {
                        r8.add(r10.DW());
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 83; continue $sw10;
                    }
                    { $pc10 = 26; continue $sw10; }
                }
                case 30: {
                    try {
                        r8.add(r10.FH());
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 83; continue $sw10;
                    }
                    { $pc10 = 26; continue $sw10; }
                }
                case 27: {
                    try {
                        r7.j6(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 83; continue $sw10;
                    }
                    $pc10 = 38; continue $sw10;
                }
                case 38: {
                    if (this.a8 <= 0) { $pc10 = 40; continue $sw10; }
                    try {
                        r7.j6(this.a8, this.U2);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 83; continue $sw10;
                    }
                    $pc10 = 40; continue $sw10;
                }
                case 40: {
                    try {
                        r12 = this.Hw;
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 83; continue $sw10;
                    }
                    if (this.aM.isEmpty() == false) { $pc10 = 43; continue $sw10; }
                    try {
                        r7.j6(r0, this.XL, this.j3);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 83; continue $sw10;
                    }
                    r13 = r12;
                    $pc10 = 45; continue $sw10;
                }
                case 45: {
                    if (this.QX.contains("include-tag") == true) { $pc10 = 47; continue $sw10; }
                    $pc10 = 73; continue $sw10;
                }
                case 73: {
                    try {
                        r7.j6(r0, abcd.vE.j6, r4);
                        this.ro = r7.v5();
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 83; continue $sw10;
                    }
                    if (r5 == null) { $pc10 = 76; continue $sw10; }
                    try {
                        r5.write(abcd.hE.j6(java.lang.String.valueOf(r7.v5().j6()) + '\n'));
                        r5.flush();
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 83; continue $sw10;
                    }
                    $pc10 = 76; continue $sw10;
                }
                case 76: {
                    r7.VH();
                    if (r11 == false) { $pc10 = 79; continue $sw10; }
                    this.we.j6();
                    $pc10 = 79; continue $sw10;
                }
                case 79: {
                    r14 = this.ro;
                    if (r14 == null) { $pc10 = 128; continue $sw10; }
                    this.cn.j6(r14);
                    return;
                }
                case 128: {
                    return;
                }
                case 47: {
                    if (this.J0 == null) { $pc10 = 73; continue $sw10; }
                    try {
                        r15 = this.J0.values().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 83; continue $sw10;
                    }
                    $pc10 = 50; continue $sw10;
                }
                case 50: {
                    if (r15.hasNext() == false) { $pc10 = 73; continue $sw10; }
                    try {
                        r16 = r15.next();
                        r17 = r16.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 83; continue $sw10;
                    }
                    if (this.aM.isEmpty() == true) { $pc10 = 55; continue $sw10; }
                    try {
                        r18 = r13.Hw(r17);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 83; continue $sw10;
                    }
                    if (r18 == null) { $pc10 = 63; continue $sw10; }
                    if (r18.DW(this.gW) == true) { $pc10 = 50; continue $sw10; }
                    $pc10 = 63; continue $sw10;
                }
                case 63: {
                    if (r16.Hw() == true) { $pc10 = 65; continue $sw10; }
                    try {
                        r16 = this.FH.j6(r16);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 83; continue $sw10;
                    }
                    $pc10 = 65; continue $sw10;
                }
                case 65: {
                    try {
                        r19 = r16.FH();
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 83; continue $sw10;
                    }
                    if (r19 == null) { $pc10 = 50; continue $sw10; }
                    try {
                        r20 = r16.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 83; continue $sw10;
                    }
                    if (r7.j6(r19) == false) { $pc10 = 50; continue $sw10; }
                    if (r7.j6(r20) == true) { $pc10 = 50; continue $sw10; }
                    try {
                        r7.j6(r13.Zo(r20));
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 83; continue $sw10;
                    }
                    { $pc10 = 50; continue $sw10; }
                }
                case 55: {
                    if (this.XL.contains(r17) == false) { $pc10 = 63; continue $sw10; }
                    $pc10 = 43; continue $sw10;
                }
                case 43: {
                    try {
                        this.Hw.we();
                        r21 = this.Hw.J0();
                        r7.j6(r0, r21, this.aM, this.j3);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 83; continue $sw10;
                    }
                    r13 = r21;
                    $pc10 = 15; continue $sw10;
                }
                case 83: {
                    th = $ex10;
                    r7.VH();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 15: {
                    try {
                        this.Ws.j6(this, this.aM, this.j3);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof abcd.MJ) { $pc10 = 86; continue $sw10; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc10 = 11; continue $sw10;
                }
                case 11: {
                    r5 = null;
                    { $pc10 = 97; continue $sw10; }
                }
                case 10: {
                    r4 = r1;
                    { $pc10 = 11; continue $sw10; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int[] j6() {
        int[] r0 = null;
        int[] r1 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = j6;
                    if (r0 == null) { $pc11 = 5; continue $sw11; }
                    return r0;
                }
                case 5: {
                    r1 = new int[abcd.AbstracteI.c.values().length];
                    try {
                        r1[abcd.AbstracteI.c.DW.ordinal()] = 2;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc11 = 11; continue $sw11; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc11 = 14; continue $sw11;
                }
                case 14: {
                    try {
                        r1[abcd.AbstracteI.c.FH.ordinal()] = 3;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc11 = 12; continue $sw11; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc11 = 18; continue $sw11;
                }
                case 18: {
                    try {
                        r1[abcd.AbstracteI.c.j6.ordinal()] = 1;
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc11 = 13; continue $sw11; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc11 = 9; continue $sw11;
                }
                case 9: {
                    j6 = r1;
                    return r1;
                }
                case 11: {
                    throw new java.lang.IllegalStateException();
                }
                case 12: {
                    throw new java.lang.IllegalStateException();
                }
                case 13: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void tp() {
        boolean r0 = false;
        int r3 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    if (this.QX.contains("side-band") == false) { $pc12 = 5; continue $sw12; }
                    $pc12 = 7; continue $sw12;
                }
                case 7: {
                    r0 = true;
                    $pc12 = 9; continue $sw12;
                }
                case 9: {
                    if (this.VH == true) { $pc12 = 15; continue $sw12; }
                    r3 = this.u7.read();
                    if (r3 < 0) { $pc12 = 15; continue $sw12; }
                    throw new abcd.YC(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().expectedEOFReceived, new java.lang.Object[]{"\\x" + java.lang.Integer.toHexString(r3)}));
                }
                case 15: {
                    if (r0 == true) { $pc12 = 40; continue $sw12; }
                    j6(false);
                    return;
                }
                case 40: {
                    try {
                        j6(true);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        if ($t instanceof java.lang.Error) { $pc12 = 18; continue $sw12; }
                        if ($t instanceof java.lang.RuntimeException) { $pc12 = 24; continue $sw12; }
                        if ($t instanceof java.io.IOException) { $pc12 = 30; continue $sw12; }
                        if ($t instanceof abcd.MJ) { $pc12 = 36; continue $sw12; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc12 = 42; continue $sw12;
                }
                case 42: {
                    return;
                }
                case 36: {
                    e = $ex12;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 30: {
                    e = $ex12;
                    if (u7() == true) { $pc12 = 34; continue $sw12; }
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 34: {
                    throw new abcd.JJ(e);
                }
                case 18: {
                    e = $ex12;
                    if (u7() == true) { $pc12 = 22; continue $sw12; }
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 22: {
                    throw new abcd.JJ(e);
                }
                case 24: {
                    e = $ex12;
                    if (u7() == true) { $pc12 = 28; continue $sw12; }
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 28: {
                    throw new abcd.JJ(e);
                }
                case 5: {
                    if (this.QX.contains("side-band-64k") == true) { $pc12 = 7; continue $sw12; }
                    r0 = false;
                    { $pc12 = 9; continue $sw12; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean u7() {
        abcd.aJ r0 = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    try {
                        r0 = new abcd.aJ(3, 1000, this.tp);
                        r0.write(abcd.hE.j6(org.eclipse.jgit.JGitText.j6().internalServerError));
                        r0.flush();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 5; continue $sw13;
                    }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean v5() {
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    if (this.rN != null) { $pc14 = 6; continue $sw14; }
                    this.rN = java.lang.Boolean.valueOf(Zo());
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    return this.rN.booleanValue();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final java.util.Map<java.lang.String, abcd.ME> FH() {
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    if (this.J0 != null) { $pc15 = 6; continue $sw15; }
                    j6(this.FH.v5());
                    $pc15 = 6; continue $sw15;
                }
                case 6: {
                    return this.J0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.TI r4) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    try {
                        this.Ws.j6(this);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        if ($t instanceof abcd.MJ) { $pc16 = 8; continue $sw16; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r4.j6(this.FH);
                    r4.j6("include-tag");
                    r4.j6("multi_ack_detailed");
                    r4.j6("multi_ack");
                    r4.j6("ofs-delta");
                    r4.j6("side-band");
                    r4.j6("side-band-64k");
                    r4.j6("thin-pack");
                    r4.j6("no-progress");
                    r4.j6("shallow");
                    if (this.VH == true) { $pc16 = 6; continue $sw16; }
                    r4.j6("no-done");
                    $pc16 = 6; continue $sw16;
                }
                case 6: {
                    r4.j6(true);
                    this.yS = r4.j6(FH());
                    r4.j6();
                    return;
                }
                case 8: {
                    e = $ex16;
                    if (e.getMessage() == null) { $pc16 = 13; continue $sw16; }
                    r4.j6("ERR " + e.getMessage());
                    e.DW();
                    throw null;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.io.InputStream r3, java.io.OutputStream r4, java.io.OutputStream r5) {
        abcd._K r6 = null;
        abcd.aL r7 = null;
        abcd.VK r8 = null;
        abcd.VK r9 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    try {
                        this.u7 = r3;
                        this.tp = r4;
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 15; continue $sw17;
                    }
                    if (this.Zo <= 0) { $pc17 = 6; continue $sw17; }
                    try {
                        this.gn = new abcd.VK(java.lang.String.valueOf(java.lang.Thread.currentThread().getName()) + "-Timer");
                        r6 = new abcd._K(this.u7, this.gn);
                        r7 = new abcd.aL(this.tp, this.gn);
                        r6.j6(this.Zo * 1000);
                        r7.j6(this.Zo * 1000);
                        this.u7 = r6;
                        this.tp = r7;
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 15; continue $sw17;
                    }
                    $pc17 = 6; continue $sw17;
                }
                case 6: {
                    try {
                        this.EQ = new abcd.DI(this.u7);
                        this.we = new abcd.EI(this.tp);
                        EQ();
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 15; continue $sw17;
                    }
                    this.Hw.EQ();
                    r8 = this.gn;
                    if (r8 != null) { $pc17 = 24; continue $sw17; }
                    return;
                }
                case 24: {
                    try {
                        r8.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 11; continue $sw17;
                    }
                    this.gn = null;
                    return;
                }
                case 11: {
                    th = $ex17;
                    this.gn = null;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 15: {
                    th = $ex17;
                    this.Hw.EQ();
                    r9 = this.gn;
                    if (r9 != null) { $pc17 = 26; continue $sw17; }
                    $pc17 = 23; continue $sw17;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 26: {
                    try {
                        r9.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 20; continue $sw17;
                    }
                    this.gn = null;
                    return;
                }
                case 20: {
                    th = $ex17;
                    this.gn = null;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.util.Map<java.lang.String, abcd.ME> r2) {
        this.J8.j6(r2);
        this.J0 = r2;
    }
}
