package abcd;

public class SI {
    private static int[] DW;
    private static int[] FH;
    private static int[] j6;
    private java.util.List<abcd.OI> BT;
    private boolean EQ;
    private final abcd.UE Hw;
    private abcd.VI J0;
    private abcd.II J8;
    private boolean KD;
    private java.io.OutputStream Mr;
    private java.lang.Throwable P8;
    private int QX;
    private abcd.kH SI;
    private java.io.OutputStream U2;
    private boolean VH;
    private abcd.GI Ws;
    private abcd.VK XL;
    private boolean Zo;
    private abcd.DI a8;
    private abcd._K aM;
    private boolean ei;
    private java.util.Map<java.lang.String, abcd.ME> er;
    private java.util.Set<java.lang.String> gW;
    private boolean gn;
    private java.io.InputStream j3;
    private abcd.EI lg;
    private boolean nw;
    private abcd.AI rN;
    private long ro;
    private boolean tp;
    private boolean u7;
    private final abcd.qG v5;
    private java.lang.StringBuilder vy;
    private abcd.KE we;
    private java.util.Set<abcd.yE> yS;

    private static class a {
        static final gE.b<abcd.SI.a> j6 = null;
        final boolean DW;
        final boolean FH;
        final boolean Hw;
        final boolean Zo;
        final boolean v5;

        static {
            j6 = new abcd.RI();
        }

        a(abcd.gE r5) {
            this.DW = r5.j6("receive", "fsckobjects", false);
            this.FH = true;
            this.Hw = !r5.j6("receive", "denydeletes", false);
            this.v5 = !r5.j6("receive", "denynonfastforwards", false);
            this.Zo = r5.j6("repack", "usedeltabaseoffset", true);
        }
    }

    static abstract class b {
        b() {
        }

        abstract void j6(java.lang.String r1);
    }

    public SI(abcd.UE r2) {
        this.Zo = true;
        this.Hw = r2;
        this.v5 = new abcd.qG(this.Hw);
        abcd.SI.a r3 = (abcd.SI.a) this.Hw.Zo().j6(abcd.SI.a.j6);
        this.VH = r3.DW;
        this.gn = r3.FH;
        this.u7 = r3.Hw;
        this.tp = r3.v5;
        this.EQ = r3.Zo;
        this.J0 = abcd.VI.j6;
        this.J8 = abcd.II.j6;
        this.Ws = abcd.GI.j6;
        this.yS = new java.util.HashSet();
    }

    static java.io.OutputStream DW(abcd.SI r0) {
        return r0.U2;
    }

    static int[] DW() {
        int[] r0 = null;
        int[] r1 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = FH;
                    if (r0 == null) { $pc0 = 5; continue $sw0; }
                    return r0;
                }
                case 5: {
                    r1 = new int[abcd.OI.a.values().length];
                    try {
                        r1[abcd.OI.a.gn.ordinal()] = 8;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 17; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 30; continue $sw0;
                }
                case 30: {
                    try {
                        r1[abcd.OI.a.j6.ordinal()] = 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 18; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 32; continue $sw0;
                }
                case 32: {
                    try {
                        r1[abcd.OI.a.u7.ordinal()] = 9;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 19; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 42; continue $sw0;
                }
                case 42: {
                    try {
                        r1[abcd.OI.a.v5.ordinal()] = 5;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 20; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 34; continue $sw0;
                }
                case 34: {
                    try {
                        r1[abcd.OI.a.Zo.ordinal()] = 6;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 21; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 36; continue $sw0;
                }
                case 36: {
                    try {
                        r1[abcd.OI.a.DW.ordinal()] = 2;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 22; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 26; continue $sw0;
                }
                case 26: {
                    try {
                        r1[abcd.OI.a.FH.ordinal()] = 3;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 23; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 38; continue $sw0;
                }
                case 38: {
                    try {
                        r1[abcd.OI.a.Hw.ordinal()] = 4;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 24; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 28; continue $sw0;
                }
                case 28: {
                    try {
                        r1[abcd.OI.a.VH.ordinal()] = 7;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc0 = 25; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    FH = r1;
                    return r1;
                }
                case 17: {
                    $pc0 = 18; continue $sw0;
                }
                case 18: {
                    $pc0 = 19; continue $sw0;
                }
                case 19: {
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    $pc0 = 22; continue $sw0;
                }
                case 22: {
                    $pc0 = 23; continue $sw0;
                }
                case 23: {
                    $pc0 = 24; continue $sw0;
                }
                case 24: {
                    $pc0 = 25; continue $sw0;
                }
                case 25: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void EQ() {
        DE<abcd.yE> r0 = null;
        DE<abcd.yE> r2 = null;
        abcd._F r1 = null;
        java.util.Iterator<abcd.OI> r3 = null;
        abcd.OI r4 = null;
        java.util.Iterator<abcd.yE> r5 = null;
        abcd.AbstractiG r6 = null;
        abcd.AbstractiG r7 = null;
        abcd.dG r8 = null;
        abcd.AbstractiG r9 = null;
        java.util.Iterator r10 = null;
        abcd.AbstractiG r11 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.KD == false) { $pc1 = 5; continue $sw1; }
                    r0 = this.rN.FH();
                    r2 = this.rN.v5();
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    this.rN = null;
                    r1 = new abcd._F(this.Hw);
                    r1.j6(false);
                    if (this.KD == false) { $pc1 = 11; continue $sw1; }
                    r1.DW(abcd.EnumkG.FH);
                    if (r0.isEmpty() == true) { $pc1 = 11; continue $sw1; }
                    r1.j6(abcd.EnumkG.v5, true);
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    r3 = this.BT.iterator();
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    if (r3.hasNext() == false) { $pc1 = 14; continue $sw1; }
                    r4 = r3.next();
                    if (r4.Zo() != abcd.OI.a.j6) { $pc1 = 13; continue $sw1; }
                    if (r4.VH() == abcd.OI.b.Hw) { $pc1 = 13; continue $sw1; }
                    r1.Hw(r1.Zo(r4.DW()));
                    { $pc1 = 13; continue $sw1; }
                }
                case 14: {
                    r5 = this.yS.iterator();
                    $pc1 = 16; continue $sw1;
                }
                case 16: {
                    if (r5.hasNext() == false) { $pc1 = 17; continue $sw1; }
                    r6 = r1.Zo(r5.next());
                    r1.v5(r6);
                    if (this.KD == false) { $pc1 = 16; continue $sw1; }
                    if (r0.isEmpty() == true) { $pc1 = 16; continue $sw1; }
                    r7 = r1.FH(r6);
                    if ((r7 instanceof abcd.dG) == false) { $pc1 = 67; continue $sw1; }
                    r7 = ((abcd.dG) r7).yS();
                    $pc1 = 67; continue $sw1;
                }
                case 67: {
                    if ((r7 instanceof abcd.mG) == false) { $pc1 = 16; continue $sw1; }
                    r1.v5(r7);
                    $pc1 = 17; continue $sw1;
                }
                case 17: {
                    r8 = r1.tp();
                    if (r8 == null) { $pc1 = 19; continue $sw1; }
                    if (this.KD == false) { $pc1 = 17; continue $sw1; }
                    if (r8.DW(abcd.fG.j6) == true) { $pc1 = 17; continue $sw1; }
                    if (r2.j6(r8) == true) { $pc1 = 17; continue $sw1; }
                    throw new abcd.fD(r8, "commit");
                }
                case 19: {
                    r9 = r1.yS();
                    if (r9 == null) { $pc1 = 22; continue $sw1; }
                    if (r9.DW(abcd.fG.j6) == true) { $pc1 = 19; continue $sw1; }
                    if (this.KD == true) { $pc1 = 39; continue $sw1; }
                    if ((r9 instanceof abcd.cG) == false) { $pc1 = 19; continue $sw1; }
                    if (this.Hw.j6(r9) == true) { $pc1 = 19; continue $sw1; }
                    throw new abcd.fD(r9, "blob");
                }
                case 39: {
                    if (r2.j6(r9) == true) { $pc1 = 19; continue $sw1; }
                    throw new abcd.fD(r9, r9.aM());
                }
                case 22: {
                    if (this.KD == false) { $pc1 = 32; continue $sw1; }
                    r10 = r0.iterator();
                    $pc1 = 25; continue $sw1;
                }
                case 25: {
                    if (r10.hasNext() == false) { $pc1 = 115; continue $sw1; }
                    r11 = r1.Zo((abcd.yE) r10.next());
                    if (r11.DW(abcd.fG.j6) == true) { $pc1 = 25; continue $sw1; }
                    throw new abcd.fD(r11, r11.aM());
                }
                case 115: {
                    return;
                }
                case 32: {
                    return;
                }
                case 5: {
                    r0 = null;
                    r2 = null;
                    { $pc1 = 6; continue $sw1; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int[] FH() {
        int[] r0 = null;
        int[] r1 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = j6;
                    if (r0 == null) { $pc2 = 5; continue $sw2; }
                    return r0;
                }
                case 5: {
                    r1 = new int[abcd.OI.b.values().length];
                    try {
                        r1[abcd.OI.b.j6.ordinal()] = 1;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc2 = 12; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 16; continue $sw2;
                }
                case 16: {
                    try {
                        r1[abcd.OI.b.Hw.ordinal()] = 4;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc2 = 13; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 20; continue $sw2;
                }
                case 20: {
                    try {
                        r1[abcd.OI.b.DW.ordinal()] = 2;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc2 = 14; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 22; continue $sw2;
                }
                case 22: {
                    try {
                        r1[abcd.OI.b.FH.ordinal()] = 3;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc2 = 15; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    j6 = r1;
                    return r1;
                }
                case 12: {
                    $pc2 = 13; continue $sw2;
                }
                case 13: {
                    $pc2 = 14; continue $sw2;
                }
                case 14: {
                    $pc2 = 15; continue $sw2;
                }
                case 15: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void J0() {
        java.util.List<abcd.OI> r0 = null;
        abcd.vE r1 = null;
        abcd.LE r2 = null;
        abcd.bJ r3 = null;
        java.util.Iterator<abcd.OI> r4 = null;
        abcd.OI r5 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    this.J8.j6(this, j6(abcd.OI.a.j6));
                    r0 = j6(abcd.OI.a.j6);
                    r1 = abcd.vE.j6;
                    r2 = r1;
                    if (this.nw == false) { $pc3 = 5; continue $sw3; }
                    r3 = new abcd.bJ(this.U2);
                    r3.j6(250, java.util.concurrent.TimeUnit.MILLISECONDS);
                    r2 = r3;
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    r2.j6(org.eclipse.jgit.JGitText.j6().updatingReferences, r0.size());
                    r4 = r0.iterator();
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (r4.hasNext() == false) { $pc3 = 8; continue $sw3; }
                    r5 = r4.next();
                    r2.update(1);
                    j6(r5);
                    { $pc3 = 7; continue $sw3; }
                }
                case 8: {
                    r2.j6();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean J8() {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (u7() == false) { $pc4 = 5; continue $sw4; }
                    return true;
                }
                case 5: {
                    if (tp() == true) { $pc4 = 10; continue $sw4; }
                    return false;
                }
                case 10: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Mr() {
        java.util.Iterator<abcd.OI> r0 = null;
        abcd.OI r1 = null;
        abcd.ME r2 = null;
        abcd.AbstractiG r3 = null;
        abcd.AbstractiG r4 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = this.BT.iterator();
                    $pc5 = 4; continue $sw5;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc5 = 5; continue $sw5; }
                    r1 = r0.next();
                    r2 = r1.Hw();
                    if (r1.Zo() != abcd.OI.a.j6) { $pc5 = 4; continue $sw5; }
                    if (r1.VH() != abcd.OI.b.Hw) { $pc5 = 15; continue $sw5; }
                    if (VH() == true) { $pc5 = 15; continue $sw5; }
                    r1.j6(abcd.OI.a.FH);
                    $pc5 = 15; continue $sw5;
                }
                case 15: {
                    if (r1.VH() != abcd.OI.b.j6) { $pc5 = 26; continue $sw5; }
                    if (Zo() == false) { $pc5 = 18; continue $sw5; }
                    if (r2 == null) { $pc5 = 23; continue $sw5; }
                    if (gn() == true) { $pc5 = 23; continue $sw5; }
                    r1.j6(abcd.OI.a.Hw);
                    $pc5 = 23; continue $sw5;
                }
                case 23: {
                    if (r2 == null) { $pc5 = 26; continue $sw5; }
                    r1.j6(abcd.OI.a.VH, java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().refAlreadyExists, new java.lang.Object[]{r2}));
                    { $pc5 = 4; continue $sw5; }
                }
                case 18: {
                    r1.j6(abcd.OI.a.DW);
                    $pc5 = 26; continue $sw5;
                }
                case 26: {
                    if (r1.VH() != abcd.OI.b.Hw) { $pc5 = 34; continue $sw5; }
                    if (r2 == null) { $pc5 = 34; continue $sw5; }
                    if (abcd.yE.Ws().DW(r1.FH()) == true) { $pc5 = 34; continue $sw5; }
                    if (r2.DW().DW(r1.FH()) == true) { $pc5 = 34; continue $sw5; }
                    r1.j6(abcd.OI.a.VH, org.eclipse.jgit.JGitText.j6().invalidOldIdSent);
                    $pc5 = 34; continue $sw5;
                }
                case 34: {
                    if (r1.VH() != abcd.OI.b.DW) { $pc5 = 57; continue $sw5; }
                    if (r2 == null) { $pc5 = 36; continue $sw5; }
                    if (r2.DW().DW(r1.FH()) == false) { $pc5 = 39; continue $sw5; }
                    try {
                        r3 = this.v5.Zo(r1.FH());
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 55; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    try {
                        r4 = this.v5.Zo(r1.DW());
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 54; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if ((r3 instanceof abcd.dG) == true) { $pc5 = 45; continue $sw5; }
                    $pc5 = 53; continue $sw5;
                }
                case 53: {
                    r1.j6(abcd.OI.b.FH);
                    { $pc5 = 57; continue $sw5; }
                }
                case 45: {
                    if ((r4 instanceof abcd.dG) == false) { $pc5 = 53; continue $sw5; }
                    $pc5 = 51; continue $sw5;
                }
                case 51: {
                    e = $ex5;
                    r1.j6(abcd.OI.a.Zo, e.getMessage());
                    $pc5 = 50; continue $sw5;
                }
                case 50: {
                    r1.j6(abcd.OI.a.VH);
                    { $pc5 = 57; continue $sw5; }
                }
                case 47: {
                    if (this.v5.j6((abcd.dG) r3, (abcd.dG) r4) == true) { $pc5 = 57; continue $sw5; }
                    try {
                        r1.j6(abcd.OI.b.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 50; continue $sw5; }
                        if ($t instanceof abcd.fD) { $pc5 = 51; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc5 = 54; continue $sw5;
                }
                case 54: {
                    r1.j6(abcd.OI.a.Zo, r1.DW().we());
                    $pc5 = 55; continue $sw5;
                }
                case 55: {
                    r1.j6(abcd.OI.a.Zo, r1.FH().we());
                    { $pc5 = 4; continue $sw5; }
                }
                case 39: {
                    r1.j6(abcd.OI.a.VH, org.eclipse.jgit.JGitText.j6().invalidOldIdSent);
                    { $pc5 = 4; continue $sw5; }
                }
                case 36: {
                    r1.j6(abcd.OI.a.VH, org.eclipse.jgit.JGitText.j6().noSuchRef);
                    $pc5 = 57; continue $sw5;
                }
                case 57: {
                    if (r1.v5().startsWith("refs/") == false) { $pc5 = 60; continue $sw5; }
                    if (abcd.UE.DW(r1.v5()) == true) { $pc5 = 4; continue $sw5; }
                    $pc5 = 60; continue $sw5;
                }
                case 60: {
                    r1.j6(abcd.OI.a.VH, org.eclipse.jgit.JGitText.j6().funnyRefname);
                    { $pc5 = 4; continue $sw5; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void QX() {
        abcd._K r0 = null;
        abcd.vE r1 = null;
        abcd.LE r2 = null;
        abcd.EE r3 = null;
        java.lang.String r4 = null;
        boolean r5 = false;
        abcd.AI r6 = null;
        abcd._K r7 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = this.aM;
                    if (r0 == null) { $pc6 = 5; continue $sw6; }
                    r0.j6((this.QX * 10) * 1000);
                    $pc6 = 5; continue $sw6;
                }
                case 5: {
                    r1 = abcd.vE.j6;
                    if (this.nw == false) { $pc6 = 8; continue $sw6; }
                    r2 = new abcd.bJ(this.U2);
                    $pc6 = 9; continue $sw6;
                }
                case 9: {
                    r3 = this.Hw.aM();
                    r4 = "jgit receive-pack";
                    if (v5() == null) { $pc6 = 13; continue $sw6; }
                    try {
                        r4 = "jgit receive-pack from " + v5().Hw();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 21; continue $sw6;
                    }
                    $pc6 = 13; continue $sw6;
                }
                case 13: {
                    try {
                        this.rN = r3.j6(this.j3);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 21; continue $sw6;
                    }
                    r5 = true;
                    try {
                        this.rN.j6(true);
                        this.rN.Hw(this.KD);
                        this.rN.FH(this.KD);
                        r6 = this.rN;
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 21; continue $sw6;
                    }
                    if (this.Zo == false) { $pc6 = 16; continue $sw6; }
                    r5 = false;
                    $pc6 = 16; continue $sw6;
                }
                case 16: {
                    try {
                        r6.DW(r5);
                        this.rN.v5(u7());
                        this.rN.j6(r4);
                        this.rN.DW(this.ro);
                        this.SI = this.rN.j6(r1, r2);
                        r3.FH();
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 21; continue $sw6;
                    }
                    r3.Hw();
                    r7 = this.aM;
                    if (r7 == null) { $pc6 = 26; continue $sw6; }
                    r7.j6(this.QX * 1000);
                    return;
                }
                case 26: {
                    return;
                }
                case 21: {
                    th = $ex6;
                    r3.Hw();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 8: {
                    r2 = r1;
                    { $pc6 = 9; continue $sw6; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean Ws() {
        java.util.Iterator<abcd.OI> r0 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = this.BT.iterator();
                    $pc7 = 4; continue $sw7;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc7 = 5; continue $sw7; }
                    if (r0.next().VH() == abcd.OI.b.Hw) { $pc7 = 4; continue $sw7; }
                    return true;
                }
                case 5: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void XL() {
        java.lang.String r0 = null;
        int r1 = 0;
        java.lang.String[] r3 = null;
        int r4 = 0;
        int r5 = 0;
        java.lang.String r6 = null;
        abcd.yE r2 = null;
        abcd.yE r7 = null;
        java.lang.String r8 = null;
        abcd.OI r9 = null;
        java.lang.String r10 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 30;
        $sw8: while (true) {
            switch ($pc8) {
                case 30: {
                    try {
                        r0 = this.a8.FH();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.io.EOFException) { $pc8 = 23; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r0 == abcd.DI.j6) { $pc8 = 5; continue $sw8; }
                    if (this.BT.isEmpty() == false) { $pc8 = 15; continue $sw8; }
                    r1 = r0.indexOf(0);
                    if (r1 < 0) { $pc8 = 15; continue $sw8; }
                    r3 = r0.substring(r1 + 1).split(" ");
                    r4 = r3.length;
                    r5 = 0;
                    $pc8 = 11; continue $sw8;
                }
                case 11: {
                    if (r5 >= r4) { $pc8 = 12; continue $sw8; }
                    r6 = r3[r5];
                    this.gW.add(r6);
                    r5 = r5 + 1;
                    { $pc8 = 11; continue $sw8; }
                }
                case 12: {
                    r0 = r0.substring(0, r1);
                    $pc8 = 15; continue $sw8;
                }
                case 15: {
                    if (r0.length() < 83) { $pc8 = 21; continue $sw8; }
                    r2 = abcd.yE.j6(r0.substring(0, 40));
                    r7 = abcd.yE.j6(r0.substring(41, 81));
                    r8 = r0.substring(82);
                    r9 = new abcd.OI(r2, r7, r8);
                    if (r8.equals("HEAD") == false) { $pc8 = 19; continue $sw8; }
                    r9.j6(abcd.OI.a.v5);
                    $pc8 = 20; continue $sw8;
                }
                case 20: {
                    this.BT.add(r9);
                    { $pc8 = 30; continue $sw8; }
                }
                case 19: {
                    r9.j6(this.er.get(r9.v5()));
                    { $pc8 = 20; continue $sw8; }
                }
                case 21: {
                    r10 = org.eclipse.jgit.JGitText.j6().errorInvalidProtocolWantedOldNewRef;
                    j6(r10);
                    throw new abcd.nD(r10);
                }
                case 5: {
                    return;
                }
                case 23: {
                    e = $ex8;
                    if (this.BT.isEmpty() == false) { $pc8 = 28; continue $sw8; }
                    return;
                }
                case 28: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void aM() {
        java.lang.Throwable r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (this.Zo == false) { $pc9 = 5; continue $sw9; }
                    j6(new abcd.TI.a(this.lg));
                    this.lg.DW();
                    $pc9 = 7; continue $sw9;
                }
                case 7: {
                    if (this.vy == null) { $pc9 = 9; continue $sw9; }
                    return;
                }
                case 9: {
                    XL();
                    if (this.BT.isEmpty() == true) { $pc9 = 38; continue $sw9; }
                    we();
                    if (Ws() == false) { $pc9 = 25; continue $sw9; }
                    try {
                        QX();
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        if ($t instanceof java.lang.Error) { $pc9 = 18; continue $sw9; }
                        if ($t instanceof java.lang.RuntimeException) { $pc9 = 20; continue $sw9; }
                        if ($t instanceof java.io.IOException) { $pc9 = 22; continue $sw9; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (J8() == false) { $pc9 = 16; continue $sw9; }
                    try {
                        EQ();
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        if ($t instanceof java.lang.Error) { $pc9 = 18; continue $sw9; }
                        if ($t instanceof java.lang.RuntimeException) { $pc9 = 20; continue $sw9; }
                        if ($t instanceof java.io.IOException) { $pc9 = 22; continue $sw9; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc9 = 16; continue $sw9;
                }
                case 16: {
                    try {
                        this.rN = null;
                        this.P8 = null;
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        if ($t instanceof java.lang.Error) { $pc9 = 18; continue $sw9; }
                        if ($t instanceof java.lang.RuntimeException) { $pc9 = 20; continue $sw9; }
                        if ($t instanceof java.io.IOException) { $pc9 = 22; continue $sw9; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc9 = 22; continue $sw9;
                }
                case 22: {
                    e = $ex9;
                    this.P8 = e;
                    $pc9 = 18; continue $sw9;
                }
                case 18: {
                    e = $ex9;
                    this.P8 = e;
                    $pc9 = 20; continue $sw9;
                }
                case 20: {
                    e = $ex9;
                    this.P8 = e;
                    $pc9 = 25; continue $sw9;
                }
                case 25: {
                    if (this.P8 != null) { $pc9 = 27; continue $sw9; }
                    Mr();
                    J0();
                    $pc9 = 27; continue $sw9;
                }
                case 27: {
                    j3();
                    if (this.ei == false) { $pc9 = 31; continue $sw9; }
                    j6(true, new abcd.PI(this));
                    this.lg.j6();
                    $pc9 = 33; continue $sw9;
                }
                case 33: {
                    this.Ws.j6(this, j6(abcd.OI.a.u7));
                    r0 = this.P8;
                    if (r0 != null) { $pc9 = 37; continue $sw9; }
                    return;
                }
                case 37: {
                    throw new abcd.AD(r0);
                }
                case 31: {
                    if (this.U2 == null) { $pc9 = 33; continue $sw9; }
                    j6(false, new abcd.QI(this));
                    { $pc9 = 33; continue $sw9; }
                }
                case 38: {
                    return;
                }
                case 5: {
                    Hw();
                    { $pc9 = 7; continue $sw9; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j3() {
        abcd.kH r0 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = this.SI;
                    if (r0 == null) { $pc10 = 6; continue $sw10; }
                    r0.j6();
                    this.SI = null;
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static abcd.EI j6(abcd.SI r0) {
        return r0.lg;
    }

    private java.util.List<abcd.OI> j6(abcd.OI.a r5) {
        java.util.ArrayList r0 = null;
        java.util.Iterator<abcd.OI> r1 = null;
        abcd.OI r2 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = new java.util.ArrayList(this.BT.size());
                    r1 = this.BT.iterator();
                    $pc11 = 4; continue $sw11;
                }
                case 4: {
                    if (r1.hasNext() == false) { $pc11 = 5; continue $sw11; }
                    r2 = r1.next();
                    if (r2.Zo() != r5) { $pc11 = 4; continue $sw11; }
                    r0.add(r2);
                    { $pc11 = 4; continue $sw11; }
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.OI r6) {
        abcd.RE r1 = null;
        int r2 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    try {
                        r1 = this.Hw.v5(r6.v5());
                        r1.j6(v5());
                        r2 = FH()[r6.VH().ordinal()];
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        if ($t instanceof java.io.IOException) { $pc12 = 18; continue $sw12; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r2 != 1) { $pc12 = 6; continue $sw12; }
                    $pc12 = 16; continue $sw12;
                }
                case 16: {
                    try {
                        r1.j6(gn());
                        r1.j6(r6.FH());
                        r1.DW(r6.DW());
                        r1.j6("push", true);
                        j6(r6, r1.DW(this.v5));
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        if ($t instanceof java.io.IOException) { $pc12 = 18; continue $sw12; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 6: {
                    if (r2 == 2) { $pc12 = 16; continue $sw12; }
                    if (r2 == 3) { $pc12 = 16; continue $sw12; }
                    if (r2 == 4) { $pc12 = 13; continue $sw12; }
                    return;
                }
                case 13: {
                    if (abcd.yE.Ws().DW(r6.FH()) == true) { $pc12 = 15; continue $sw12; }
                    try {
                        r1.j6(r6.FH());
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        if ($t instanceof java.io.IOException) { $pc12 = 18; continue $sw12; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc12 = 15; continue $sw12;
                }
                case 15: {
                    try {
                        r1.j6(true);
                        j6(r6, r1.j6(this.v5));
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        if ($t instanceof java.io.IOException) { $pc12 = 18; continue $sw12; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 18: {
                    e = $ex12;
                    r6.j6(abcd.OI.a.VH, java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().lockError, new java.lang.Object[]{e.getMessage()}));
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.OI r3, abcd.RE.a r4) {
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    switch(j6()[r4.ordinal()]) {
                        case 1: { $pc13 = 9; continue $sw13; }
                        case 2: { $pc13 = 8; continue $sw13; }
                        case 3: { $pc13 = 7; continue $sw13; }
                        case 4: { $pc13 = 7; continue $sw13; }
                        case 5: { $pc13 = 7; continue $sw13; }
                        case 6: { $pc13 = 7; continue $sw13; }
                        case 7: { $pc13 = 6; continue $sw13; }
                        case 8: { $pc13 = 5; continue $sw13; }
                        case 9: { $pc13 = 8; continue $sw13; }
                        default: { $pc13 = 4; continue $sw13; }
                    };
                }
                case 4: {
                    r3.j6(abcd.OI.a.VH, r4.name());
                    return;
                }
                case 5: {
                    r3.j6(abcd.OI.a.v5);
                    return;
                }
                case 6: {
                    r3.j6(abcd.OI.a.Hw);
                    return;
                }
                case 7: {
                    r3.j6(abcd.OI.a.u7);
                    return;
                }
                case 8: {
                    r3.j6(abcd.OI.a.gn);
                    return;
                }
                case 9: {
                    r3.j6(abcd.OI.a.j6);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(boolean r7, abcd.SI.b r8) {
        java.util.Iterator<abcd.OI> r9 = null;
        java.util.Iterator<abcd.OI> r0 = null;
        abcd.OI r2 = null;
        java.lang.StringBuilder r3 = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = -1;
        $sw14: while (true) {
            switch ($pc14) {
                case -1: {
                    if (this.P8 == null) { $pc14 = 12; continue $sw14; }
                    r8.j6("unpack error " + this.P8.getMessage());
                    if (r7 == false) { $pc14 = 11; continue $sw14; }
                    r9 = this.BT.iterator();
                    $pc14 = 8; continue $sw14;
                }
                case 8: {
                    if (r9.hasNext() == false) { $pc14 = 62; continue $sw14; }
                    r8.j6("ng " + r9.next().v5() + " n/a (unpacker error)");
                    { $pc14 = 8; continue $sw14; }
                }
                case 62: {
                    return;
                }
                case 11: {
                    return;
                }
                case 12: {
                    if (r7 == false) { $pc14 = 14; continue $sw14; }
                    r8.j6("unpack ok");
                    $pc14 = 14; continue $sw14;
                }
                case 14: {
                    r0 = this.BT.iterator();
                    $pc14 = 16; continue $sw14;
                }
                case 16: {
                    if (r0.hasNext() == false) { $pc14 = 17; continue $sw14; }
                    r2 = r0.next();
                    if (r2.Zo() == abcd.OI.a.u7) { $pc14 = 20; continue $sw14; }
                    r3 = new java.lang.StringBuilder();
                    r3.append("ng ");
                    r3.append(r2.v5());
                    r3.append(" ");
                    switch(DW()[r2.Zo().ordinal()]) {
                        case 1: { $pc14 = 41; continue $sw14; }
                        case 2: { $pc14 = 40; continue $sw14; }
                        case 3: { $pc14 = 39; continue $sw14; }
                        case 4: { $pc14 = 38; continue $sw14; }
                        case 5: { $pc14 = 37; continue $sw14; }
                        case 6: { $pc14 = 31; continue $sw14; }
                        case 7: { $pc14 = 27; continue $sw14; }
                        case 8: { $pc14 = 25; continue $sw14; }
                        case 9: { $pc14 = 16; continue $sw14; }
                        default: { $pc14 = 42; continue $sw14; }
                    };
                }
                case 25: {
                    r3.append("failed to lock");
                    { $pc14 = 42; continue $sw14; }
                }
                case 27: {
                    if (r2.j6() != null) { $pc14 = 29; continue $sw14; }
                    r3.append("unspecified reason");
                    { $pc14 = 42; continue $sw14; }
                }
                case 29: {
                    r3.append(r2.j6());
                    { $pc14 = 42; continue $sw14; }
                }
                case 31: {
                    if (r2.j6() != null) { $pc14 = 34; continue $sw14; }
                    r3.append("missing object(s)");
                    { $pc14 = 42; continue $sw14; }
                }
                case 34: {
                    if (r2.j6().length() != 40) { $pc14 = 36; continue $sw14; }
                    r3.append("object " + r2.j6() + " missing");
                    { $pc14 = 42; continue $sw14; }
                }
                case 36: {
                    r3.append(r2.j6());
                    { $pc14 = 42; continue $sw14; }
                }
                case 37: {
                    r3.append("branch is currently checked out");
                    { $pc14 = 42; continue $sw14; }
                }
                case 38: {
                    r3.append("non-fast forward");
                    { $pc14 = 42; continue $sw14; }
                }
                case 39: {
                    r3.append("deletion prohibited");
                    { $pc14 = 42; continue $sw14; }
                }
                case 40: {
                    r3.append("creation prohibited");
                    { $pc14 = 42; continue $sw14; }
                }
                case 41: {
                    r3.append("server bug; ref not processed");
                    $pc14 = 42; continue $sw14;
                }
                case 42: {
                    r8.j6(r3.toString());
                    { $pc14 = 16; continue $sw14; }
                }
                case 20: {
                    if (r7 == false) { $pc14 = 16; continue $sw14; }
                    r8.j6("ok " + r2.v5());
                    { $pc14 = 16; continue $sw14; }
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int[] j6() {
        int[] r0 = null;
        int[] r1 = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = -1;
        $sw15: while (true) {
            switch ($pc15) {
                case -1: {
                    r0 = DW;
                    if (r0 == null) { $pc15 = 5; continue $sw15; }
                    return r0;
                }
                case 5: {
                    r1 = new int[abcd.RE.a.values().length];
                    try {
                        r1[abcd.RE.a.Zo.ordinal()] = 6;
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc15 = 18; continue $sw15; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc15 = 30; continue $sw15;
                }
                case 30: {
                    try {
                        r1[abcd.RE.a.v5.ordinal()] = 5;
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc15 = 19; continue $sw15; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc15 = 34; continue $sw15;
                }
                case 34: {
                    try {
                        r1[abcd.RE.a.u7.ordinal()] = 9;
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc15 = 20; continue $sw15; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc15 = 44; continue $sw15;
                }
                case 44: {
                    try {
                        r1[abcd.RE.a.DW.ordinal()] = 2;
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc15 = 21; continue $sw15; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc15 = 38; continue $sw15;
                }
                case 38: {
                    try {
                        r1[abcd.RE.a.Hw.ordinal()] = 4;
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc15 = 22; continue $sw15; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc15 = 46; continue $sw15;
                }
                case 46: {
                    try {
                        r1[abcd.RE.a.j6.ordinal()] = 1;
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc15 = 23; continue $sw15; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc15 = 28; continue $sw15;
                }
                case 28: {
                    try {
                        r1[abcd.RE.a.FH.ordinal()] = 3;
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc15 = 24; continue $sw15; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc15 = 40; continue $sw15;
                }
                case 40: {
                    try {
                        r1[abcd.RE.a.VH.ordinal()] = 7;
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc15 = 25; continue $sw15; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc15 = 32; continue $sw15;
                }
                case 32: {
                    try {
                        r1[abcd.RE.a.gn.ordinal()] = 8;
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc15 = 26; continue $sw15; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc15 = 36; continue $sw15;
                }
                case 36: {
                    try {
                        r1[abcd.RE.a.tp.ordinal()] = 10;
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc15 = 27; continue $sw15; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc15 = 16; continue $sw15;
                }
                case 16: {
                    DW = r1;
                    return r1;
                }
                case 18: {
                    $pc15 = 19; continue $sw15;
                }
                case 19: {
                    $pc15 = 20; continue $sw15;
                }
                case 20: {
                    $pc15 = 21; continue $sw15;
                }
                case 21: {
                    $pc15 = 22; continue $sw15;
                }
                case 22: {
                    $pc15 = 23; continue $sw15;
                }
                case 23: {
                    $pc15 = 24; continue $sw15;
                }
                case 24: {
                    $pc15 = 25; continue $sw15;
                }
                case 25: {
                    $pc15 = 26; continue $sw15;
                }
                case 26: {
                    $pc15 = 27; continue $sw15;
                }
                case 27: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void we() {
        java.io.OutputStream r0 = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = -1;
        $sw16: while (true) {
            switch ($pc16) {
                case -1: {
                    this.ei = this.gW.contains("report-status");
                    this.nw = this.gW.contains("side-band-64k");
                    if (this.nw == false) { $pc16 = 6; continue $sw16; }
                    r0 = this.Mr;
                    this.Mr = new abcd.aJ(1, 65520, r0);
                    this.U2 = new abcd.aJ(2, 65520, r0);
                    this.lg = new abcd.EI(this.Mr);
                    this.lg.j6(false);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public final java.util.Map<java.lang.String, abcd.ME> Hw() {
        abcd.VI r0 = null;
        java.util.Map<java.lang.String, abcd.ME> r1 = null;
        abcd.ME r2 = null;
        java.util.Iterator<abcd.ME> r3 = null;
        abcd.ME r4 = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = -1;
        $sw17: while (true) {
            switch ($pc17) {
                case -1: {
                    if (this.er != null) { $pc17 = 17; continue $sw17; }
                    r0 = this.J0;
                    r1 = this.Hw.v5();
                    r0.j6(r1);
                    this.er = r1;
                    r2 = this.er.get("HEAD");
                    if (r2 != null) { $pc17 = 7; continue $sw17; }
                    $pc17 = 9; continue $sw17;
                }
                case 9: {
                    r3 = this.er.values().iterator();
                    $pc17 = 11; continue $sw17;
                }
                case 11: {
                    if (r3.hasNext() == false) { $pc17 = 12; continue $sw17; }
                    r4 = r3.next();
                    if (r4.DW() == null) { $pc17 = 11; continue $sw17; }
                    this.yS.add(r4.DW());
                    { $pc17 = 11; continue $sw17; }
                }
                case 12: {
                    this.yS.addAll(this.Hw.Hw());
                    { $pc17 = 17; continue $sw17; }
                }
                case 7: {
                    if (r2.Zo() == false) { $pc17 = 9; continue $sw17; }
                    this.er.remove("HEAD");
                    $pc17 = 17; continue $sw17;
                }
                case 17: {
                    return this.er;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean VH() {
        return this.u7;
    }

    public boolean Zo() {
        return this.gn;
    }

    public boolean gn() {
        return this.tp;
    }

    public void j6(abcd.TI r3) {
        java.util.Iterator<abcd.yE> r0 = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    if (this.vy == null) { $pc18 = 6; continue $sw18; }
                    r3.j6("ERR " + this.vy);
                    return;
                }
                case 6: {
                    r3.j6(this.Hw);
                    r3.j6("side-band-64k");
                    r3.j6("delete-refs");
                    r3.j6("report-status");
                    if (this.EQ == false) { $pc18 = 9; continue $sw18; }
                    r3.j6("ofs-delta");
                    $pc18 = 9; continue $sw18;
                }
                case 9: {
                    r3.j6(Hw());
                    r0 = this.yS.iterator();
                    $pc18 = 11; continue $sw18;
                }
                case 11: {
                    if (r0.hasNext() == false) { $pc18 = 13; continue $sw18; }
                    r3.j6(r0.next());
                    { $pc18 = 11; continue $sw18; }
                }
                case 13: {
                    if (r3.DW() == false) { $pc18 = 15; continue $sw18; }
                    r3.j6(abcd.yE.Ws(), "capabilities^{}");
                    $pc18 = 15; continue $sw18;
                }
                case 15: {
                    r3.j6();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.io.InputStream r4, java.io.OutputStream r5, java.io.OutputStream r6) {
        abcd.aL r7 = null;
        abcd.VK r8 = null;
        abcd.EI r9 = null;
        abcd.VK r10 = null;
        abcd.VK r11 = null;
        abcd.EI r12 = null;
        abcd.VK r13 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = -1;
        $sw19: while (true) {
            switch ($pc19) {
                case -1: {
                    try {
                        this.j3 = r4;
                        this.Mr = r5;
                        this.U2 = r6;
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 36; continue $sw19;
                    }
                    if (this.QX <= 0) { $pc19 = 6; continue $sw19; }
                    try {
                        this.XL = new abcd.VK(java.lang.String.valueOf(java.lang.Thread.currentThread().getName()) + "-Timer");
                        this.aM = new abcd._K(this.j3, this.XL);
                        r7 = new abcd.aL(this.Mr, this.XL);
                        this.aM.j6(this.QX * 1000);
                        r7.j6(this.QX * 1000);
                        this.j3 = this.aM;
                        this.Mr = r7;
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 36; continue $sw19;
                    }
                    $pc19 = 6; continue $sw19;
                }
                case 6: {
                    try {
                        this.a8 = new abcd.DI(this.j3);
                        this.lg = new abcd.EI(this.Mr);
                        this.lg.j6(false);
                        this.gW = new java.util.HashSet();
                        this.BT = new java.util.ArrayList();
                        aM();
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 36; continue $sw19;
                    }
                    this.v5.EQ();
                    $pc19 = 27; continue $sw19;
                }
                case 27: {
                    th = $ex19;
                    j3();
                    this.aM = null;
                    this.j3 = null;
                    this.Mr = null;
                    this.U2 = null;
                    this.a8 = null;
                    this.lg = null;
                    this.er = null;
                    this.gW = null;
                    this.BT = null;
                    r8 = this.XL;
                    if (r8 != null) { $pc19 = 72; continue $sw19; }
                    $pc19 = 35; continue $sw19;
                }
                case 35: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 72: {
                    try {
                        r8.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 32; continue $sw19;
                    }
                    this.XL = null;
                    $pc19 = 32; continue $sw19;
                }
                case 32: {
                    th = $ex19;
                    this.XL = null;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 9: {
                    if (this.nw == false) { $pc19 = 12; continue $sw19; }
                    try {
                        ((abcd.aJ) this.U2).j6();
                        ((abcd.aJ) this.Mr).j6();
                        r9 = new abcd.EI(r5);
                        r9.j6(false);
                        r9.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 27; continue $sw19;
                    }
                    $pc19 = 12; continue $sw19;
                }
                case 12: {
                    if (this.Zo == true) { $pc19 = 14; continue $sw19; }
                    $pc19 = 19; continue $sw19;
                }
                case 19: {
                    j3();
                    this.aM = null;
                    this.j3 = null;
                    this.Mr = null;
                    this.U2 = null;
                    this.a8 = null;
                    this.lg = null;
                    this.er = null;
                    this.gW = null;
                    this.BT = null;
                    r10 = this.XL;
                    if (r10 != null) { $pc19 = 68; continue $sw19; }
                    return;
                }
                case 68: {
                    try {
                        r10.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 23; continue $sw19;
                    }
                    this.XL = null;
                    return;
                }
                case 23: {
                    th = $ex19;
                    this.XL = null;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 14: {
                    if (this.nw == false) { $pc19 = 16; continue $sw19; }
                    $pc19 = 18; continue $sw19;
                }
                case 18: {
                    try {
                        this.Mr.flush();
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 27; continue $sw19;
                    }
                    { $pc19 = 19; continue $sw19; }
                }
                case 16: {
                    if (this.U2 == null) { $pc19 = 18; continue $sw19; }
                    try {
                        this.U2.flush();
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 27; continue $sw19;
                    }
                    $pc19 = 36; continue $sw19;
                }
                case 36: {
                    th = $ex19;
                    this.v5.EQ();
                    $pc19 = 57; continue $sw19;
                }
                case 57: {
                    th = $ex19;
                    j3();
                    this.aM = null;
                    this.j3 = null;
                    this.Mr = null;
                    this.U2 = null;
                    this.a8 = null;
                    this.lg = null;
                    this.er = null;
                    this.gW = null;
                    this.BT = null;
                    r11 = this.XL;
                    if (r11 != null) { $pc19 = 76; continue $sw19; }
                    $pc19 = 65; continue $sw19;
                }
                case 65: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 76: {
                    try {
                        r11.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 62; continue $sw19;
                    }
                    this.XL = null;
                    $pc19 = 62; continue $sw19;
                }
                case 62: {
                    th = $ex19;
                    this.XL = null;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 39: {
                    if (this.nw == false) { $pc19 = 42; continue $sw19; }
                    try {
                        ((abcd.aJ) this.U2).j6();
                        ((abcd.aJ) this.Mr).j6();
                        r12 = new abcd.EI(r5);
                        r12.j6(false);
                        r12.j6();
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 57; continue $sw19;
                    }
                    $pc19 = 42; continue $sw19;
                }
                case 42: {
                    if (this.Zo == true) { $pc19 = 44; continue $sw19; }
                    $pc19 = 49; continue $sw19;
                }
                case 49: {
                    j3();
                    this.aM = null;
                    this.j3 = null;
                    this.Mr = null;
                    this.U2 = null;
                    this.a8 = null;
                    this.lg = null;
                    this.er = null;
                    this.gW = null;
                    this.BT = null;
                    r13 = this.XL;
                    if (r13 != null) { $pc19 = 70; continue $sw19; }
                    $pc19 = 56; continue $sw19;
                }
                case 56: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 70: {
                    try {
                        r13.DW();
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 53; continue $sw19;
                    }
                    this.XL = null;
                    $pc19 = 53; continue $sw19;
                }
                case 53: {
                    th = $ex19;
                    this.XL = null;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 44: {
                    if (this.nw == false) { $pc19 = 46; continue $sw19; }
                    $pc19 = 48; continue $sw19;
                }
                case 48: {
                    try {
                        this.Mr.flush();
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 57; continue $sw19;
                    }
                    { $pc19 = 49; continue $sw19; }
                }
                case 46: {
                    if (this.U2 == null) { $pc19 = 48; continue $sw19; }
                    try {
                        this.U2.flush();
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 57; continue $sw19;
                    }
                    { $pc19 = 48; continue $sw19; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.lang.String r4) {
        java.lang.StringBuilder r0 = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = -1;
        $sw20: while (true) {
            switch ($pc20) {
                case -1: {
                    if (this.er == null) { $pc20 = 5; continue $sw20; }
                    if (this.U2 == null) { $pc20 = 16; continue $sw20; }
                    try {
                        this.U2.write(abcd.hE.j6("error: " + r4 + "\n"));
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        if ($t instanceof java.io.IOException) { $pc20 = 12; continue $sw20; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 16: {
                    return;
                }
                case 17: {
                    return;
                }
                case 5: {
                    if (this.vy != null) { $pc20 = 7; continue $sw20; }
                    this.vy = new java.lang.StringBuilder();
                    $pc20 = 7; continue $sw20;
                }
                case 7: {
                    r0 = this.vy;
                    r0.append(r4);
                    r0.append('\n');
                    $pc20 = 12; continue $sw20;
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean tp() {
        return this.KD;
    }

    public boolean u7() {
        return this.VH;
    }

    public abcd.KE v5() {
        return this.we;
    }
}
