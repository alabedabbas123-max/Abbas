package abcd;

public abstract class AbstracteI extends abcd.AbstractC0597cI implements abcd.InterfacenI {
    private static int[] aM;
    private boolean BT;
    private abcd.EI KD;
    private eG<abcd.dG> Mr;
    private boolean P8;
    private abcd.RK.c SI;
    final abcd.fG U2;
    final abcd.fG a8;
    private java.lang.String ei;
    private abcd.AbstracteI.c er;
    private boolean gW;
    private final abcd.qG j3;
    private final abcd.fG lg;
    private abcd.kH nw;
    final abcd.fG rN;
    private boolean vy;
    private boolean yS;

    private static class a extends java.lang.Exception {
        private a() {
        }

        a(abcd.AbstracteI.a r1) {
            this();
        }
    }

    private static class b {
        static final gE.b<abcd.AbstracteI.b> j6 = null;
        final boolean DW;

        static {
            j6 = new abcd.fI();
        }

        b(abcd.gE r4) {
            this.DW = r4.j6("repack", "usedeltabaseoffset", true);
        }
    }

    static final class c extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.AbstracteI.c DW = null;
        public static final abcd.AbstracteI.c FH = null;
        private static final abcd.AbstracteI.c[] Hw = null;
        public static final abcd.AbstracteI.c j6 = null;

        static {
            j6 = new abcd.AbstracteI.c("OFF", 0);
            DW = new abcd.AbstracteI.c("CONTINUE", 1);
            FH = new abcd.AbstracteI.c("DETAILED", 2);
            Hw = new abcd.AbstracteI.c[]{j6, DW, FH};
        }

        private c(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.AbstracteI.c valueOf(java.lang.String r1) {
            return (abcd.AbstracteI.c) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.AbstracteI.c.values(), r1);
        }

        public static abcd.AbstracteI.c[] values() {
            abcd.AbstracteI.c[] r0 = Hw;
            int r1 = r0.length;
            abcd.AbstracteI.c[] r2 = new abcd.AbstracteI.c[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    public AbstracteI(abcd.BI r3) {
        abcd.AbstracteI.b r4 = null;
        boolean r0 = false;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(r3);
                    this.er = abcd.AbstracteI.c.j6;
                    r4 = (abcd.AbstracteI.b) this.Hw.Zo().j6(abcd.AbstracteI.b.j6);
                    if (this.Zo.VH() == abcd.EnumeJ.DW) { $pc0 = 5; continue $sw0; }
                    r0 = true;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    this.BT = r0;
                    this.yS = this.Zo.J0();
                    this.vy = r4.DW;
                    this.j3 = new abcd.qG(this.Hw);
                    this.Mr = new abcd.eG();
                    this.U2 = this.j3.j6("REACHABLE");
                    this.a8 = this.j3.j6("COMMON");
                    this.lg = this.j3.j6("STATE");
                    this.rN = this.j3.j6("ADVERTISED");
                    this.j3.j6(this.a8);
                    this.j3.j6(this.U2);
                    this.j3.j6(this.rN);
                    return;
                }
                case 5: {
                    r0 = false;
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void DW(abcd.LE r4) {
        java.io.InputStream r0 = null;
        abcd.EE r1 = null;
        abcd.AI r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = this.tp;
                    if (this.gW == false) { $pc1 = 5; continue $sw1; }
                    r0 = new abcd._I(r0, r4, VH());
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    r1 = this.Hw.aM();
                    try {
                        r2 = r1.j6(r0);
                        r2.j6(this.yS);
                        r2.v5(this.Zo.EQ());
                        r2.j6(this.ei);
                        this.nw = r2.j6(r4);
                        r1.FH();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 9; continue $sw1;
                    }
                    r1.Hw();
                    return;
                }
                case 9: {
                    th = $ex1;
                    r1.Hw();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean DW(java.util.Collection<abcd.ME> r8) {
        abcd.EI r0 = null;
        java.util.Iterator<abcd.ME> r9 = null;
        boolean r2 = false;
        abcd.ME r3 = null;
        java.lang.StringBuilder r5 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.Ws == false) { $pc2 = 5; continue $sw2; }
                    r0 = this.KD;
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    r9 = r8.iterator();
                    r2 = true;
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    if (r9.hasNext() == false) { $pc2 = 9; continue $sw2; }
                    r3 = r9.next();
                    if (this.j3.Zo(r3.DW()).DW(this.U2) == true) { $pc2 = 8; continue $sw2; }
                    $pc2 = 17; continue $sw2;
                }
                case 17: {
                    r5 = new java.lang.StringBuilder(46);
                    r5.append("want ");
                    r5.append(r3.DW().we());
                    if (r2 == false) { $pc2 = 20; continue $sw2; }
                    r5.append(J0());
                    r2 = false;
                    $pc2 = 20; continue $sw2;
                }
                case 20: {
                    r5.append('\n');
                    r0.j6(r5.toString());
                    { $pc2 = 8; continue $sw2; }
                }
                case 9: {
                    if (r2 == false) { $pc2 = 11; continue $sw2; }
                    return false;
                }
                case 11: {
                    r0.j6();
                    this.J8 = false;
                    return true;
                }
                case 5: {
                    r0 = this.J0;
                    { $pc2 = 6; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private java.lang.String J0() {
        java.lang.StringBuilder r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    if (this.BT == false) { $pc3 = 6; continue $sw3; }
                    this.BT = j6(r0, "include-tag");
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    if (this.vy == false) { $pc3 = 9; continue $sw3; }
                    j6(r0, "ofs-delta");
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    if (j6(r0, "multi_ack_detailed") == false) { $pc3 = 14; continue $sw3; }
                    this.er = abcd.AbstracteI.c.FH;
                    if (this.Ws == false) { $pc3 = 18; continue $sw3; }
                    this.P8 = j6(r0, "no-done");
                    $pc3 = 18; continue $sw3;
                }
                case 18: {
                    if (this.yS == false) { $pc3 = 21; continue $sw3; }
                    this.yS = j6(r0, "thin-pack");
                    $pc3 = 21; continue $sw3;
                }
                case 21: {
                    if (j6(r0, "side-band-64k") == false) { $pc3 = 24; continue $sw3; }
                    this.gW = true;
                    $pc3 = 27; continue $sw3;
                }
                case 27: {
                    if (this.Ws == false) { $pc3 = 34; continue $sw3; }
                    if (this.er == abcd.AbstracteI.c.FH) { $pc3 = 34; continue $sw3; }
                    throw new abcd.nD(this.v5, java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().statelessRPCRequiresOptionToBeEnabled, new java.lang.Object[]{"multi_ack_detailed"}));
                }
                case 34: {
                    return r0.toString();
                }
                case 24: {
                    if (j6(r0, "side-band") == false) { $pc3 = 27; continue $sw3; }
                    this.gW = true;
                    { $pc3 = 27; continue $sw3; }
                }
                case 14: {
                    if (j6(r0, "multi_ack") == false) { $pc3 = 16; continue $sw3; }
                    this.er = abcd.AbstracteI.c.DW;
                    { $pc3 = 18; continue $sw3; }
                }
                case 16: {
                    this.er = abcd.AbstracteI.c.j6;
                    { $pc3 = 18; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void J8() {
        java.util.Iterator<abcd.ME> r0 = null;
        abcd.ME r1 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = DW().iterator();
                    $pc4 = 4; continue $sw4;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc4 = 5; continue $sw4; }
                    r1 = r0.next();
                    j6(r1.DW());
                    if (r1.FH() == null) { $pc4 = 4; continue $sw4; }
                    j6(r1.FH());
                    { $pc4 = 4; continue $sw4; }
                }
                case 5: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Ws() {
        this.j3.j6(new abcd.fG[]{this.U2, this.rN});
        this.j3.j6(this.Mr);
        this.j3.DW(abcd.EnumkG.DW);
        this.j3.j6(new abcd.C0641dI(this));
    }

    private int j6(java.util.Collection<abcd.ME> r4) {
        java.util.Iterator<abcd.ME> r5 = null;
        int r0 = 0;
        abcd.ME r1 = null;
        abcd.AbstractiG r2 = null;
        int r3 = 0;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r5 = r4.iterator();
                    r0 = 0;
                    $pc5 = 4; continue $sw5;
                }
                case 4: {
                    if (r5.hasNext() == false) { $pc5 = 5; continue $sw5; }
                    r1 = r5.next();
                    try {
                        r2 = this.j3.Zo(r1.DW());
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 12; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if ((r2 instanceof abcd.dG) == false) { $pc5 = 4; continue $sw5; }
                    try {
                        r3 = ((abcd.dG) r2).U2();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        if ($t instanceof java.io.IOException) { $pc5 = 12; continue $sw5; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r0 >= r3) { $pc5 = 4; continue $sw5; }
                    r0 = r3;
                    { $pc5 = 4; continue $sw5; }
                }
                case 5: {
                    return r0;
                }
                case 12: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.LE r17) {
        abcd.uE r1 = null;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        boolean r7 = false;
        boolean r8 = false;
        boolean r9 = false;
        abcd.dG r10 = null;
        abcd.EI r2 = null;
        java.lang.StringBuilder r3 = null;
        abcd.DI.a r11 = null;
        int r12 = 0;
        int r13 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r1 = new abcd.uE();
                    if (this.Ws == false) { $pc6 = 5; continue $sw6; }
                    this.SI.j6(this.EQ, null);
                    $pc6 = 5; continue $sw6;
                }
                case 5: {
                    Ws();
                    r4 = 0;
                    r5 = 0;
                    r6 = 0;
                    r7 = false;
                    r8 = false;
                    r9 = false;
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    r10 = this.j3.tp();
                    if (r10 == null) { $pc6 = 51; continue $sw6; }
                    r2 = this.J0;
                    r3 = new java.lang.StringBuilder("have ");
                    r10.getId();
                    r3.append(r10.we());
                    r3.append("\n");
                    r2.j6(r3.toString());
                    r4 = r4 + 1;
                    r5 = r5 + 1;
                    if ((r4 & 31) != 0) { $pc6 = 6; continue $sw6; }
                    if (r17.isCancelled() == true) { $pc6 = 83; continue $sw6; }
                    this.J0.j6();
                    r6 = r6 + 1;
                    if (r4 != 32) { $pc6 = 19; continue $sw6; }
                    if (this.Ws == false) { $pc6 = 6; continue $sw6; }
                    $pc6 = 19; continue $sw6;
                }
                case 19: {
                    r11 = this.we.j6(r1);
                    r12 = we()[r11.ordinal()];
                    if (r12 == 1) { $pc6 = 41; continue $sw6; }
                    if (r12 == 2) { $pc6 = 37; continue $sw6; }
                    if (r12 == 3) { $pc6 = 27; continue $sw6; }
                    if (r12 == 4) { $pc6 = 27; continue $sw6; }
                    if (r12 == 5) { $pc6 = 27; continue $sw6; }
                    $pc6 = 33; continue $sw6;
                }
                case 33: {
                    if (r17.isCancelled() == false) { $pc6 = 19; continue $sw6; }
                    throw new abcd.AbstracteI.a(null);
                }
                case 27: {
                    j6(this.j3.Zo(r1), r11);
                    if (r11 != abcd.DI.a.v5) { $pc6 = 30; continue $sw6; }
                    r5 = 0;
                    r7 = true;
                    $pc6 = 31; continue $sw6;
                }
                case 31: {
                    r8 = true;
                    r9 = true;
                    { $pc6 = 33; continue $sw6; }
                }
                case 30: {
                    r5 = 0;
                    { $pc6 = 31; continue $sw6; }
                }
                case 37: {
                    this.er = abcd.AbstracteI.c.j6;
                    if (this.Ws == false) { $pc6 = 40; continue $sw6; }
                    this.SI.j6(this.EQ, null);
                    $pc6 = 40; continue $sw6;
                }
                case 40: {
                    r6 = 0;
                    r9 = true;
                    { $pc6 = 51; continue $sw6; }
                }
                case 41: {
                    r6 = r6 - 1;
                    if ((this.P8 & r7) == true) { $pc6 = 51; continue $sw6; }
                    if (this.Ws == false) { $pc6 = 47; continue $sw6; }
                    this.SI.j6(this.EQ, null);
                    $pc6 = 47; continue $sw6;
                }
                case 47: {
                    if (r8 == false) { $pc6 = 6; continue $sw6; }
                    if (r5 <= 256) { $pc6 = 6; continue $sw6; }
                    $pc6 = 83; continue $sw6;
                }
                case 83: {
                    throw new abcd.AbstracteI.a(null);
                }
                case 51: {
                    if (r17.isCancelled() == true) { $pc6 = 80; continue $sw6; }
                    if (r7 == true) { $pc6 = 54; continue $sw6; }
                    $pc6 = 55; continue $sw6;
                }
                case 55: {
                    this.J0.j6("done\n");
                    this.J0.DW();
                    $pc6 = 56; continue $sw6;
                }
                case 56: {
                    if (r9 == true) { $pc6 = 58; continue $sw6; }
                    this.er = abcd.AbstracteI.c.j6;
                    r6 = r6 + 1;
                    $pc6 = 58; continue $sw6;
                }
                case 58: {
                    if (r6 <= 0) { $pc6 = 60; continue $sw6; }
                    $pc6 = 62; continue $sw6;
                }
                case 62: {
                    r6 = r6 - 1;
                    r13 = we()[this.we.j6(r1).ordinal()];
                    if (r13 == 1) { $pc6 = 75; continue $sw6; }
                    if (r13 == 2) { $pc6 = 72; continue $sw6; }
                    if (r13 == 3) { $pc6 = 71; continue $sw6; }
                    if (r13 == 4) { $pc6 = 71; continue $sw6; }
                    if (r13 != 5) { $pc6 = 75; continue $sw6; }
                    $pc6 = 71; continue $sw6;
                }
                case 71: {
                    this.er = abcd.AbstracteI.c.DW;
                    { $pc6 = 75; continue $sw6; }
                }
                case 72: {
                    return;
                }
                case 75: {
                    if (r17.isCancelled() == false) { $pc6 = 58; continue $sw6; }
                    throw new abcd.AbstracteI.a(null);
                }
                case 60: {
                    if (this.er != abcd.AbstracteI.c.j6) { $pc6 = 62; continue $sw6; }
                    return;
                }
                case 54: {
                    if (this.P8 == true) { $pc6 = 56; continue $sw6; }
                    $pc6 = 80; continue $sw6;
                }
                case 80: {
                    throw new abcd.AbstracteI.a(null);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.YD r2) {
        this.j3.Zo(r2).j6(this.rN);     // Catch: java.io.IOException -> L4
        return;
    }

    private void j6(abcd.AbstractiG r2, abcd.DI.a r3) {
        java.lang.StringBuilder r4 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (this.Ws == true) { $pc7 = 5; continue $sw7; }
                    $pc7 = 9; continue $sw7;
                }
                case 9: {
                    r2.j6(this.a8);
                    if ((r2 instanceof abcd.dG) == false) { $pc7 = 13; continue $sw7; }
                    ((abcd.dG) r2).FH(this.a8);
                    return;
                }
                case 13: {
                    return;
                }
                case 5: {
                    if (r3 != abcd.DI.a.Hw) { $pc7 = 9; continue $sw7; }
                    if (r2.DW(this.lg) == true) { $pc7 = 9; continue $sw7; }
                    r4 = new java.lang.StringBuilder(46);
                    r4.append("have ");
                    r4.append(r2.we());
                    r4.append('\n');
                    this.KD.j6(r4.toString());
                    r2.j6(this.lg);
                    { $pc7 = 9; continue $sw7; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(abcd.yE r2) {
        abcd.dG r3 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    try {
                        r3 = this.j3.VH(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.io.IOException) { $pc8 = 6; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r3.DW(this.U2) == true) { $pc8 = 9; continue $sw8; }
                    try {
                        r3.j6(this.U2);
                        this.Mr.add(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.io.IOException) { $pc8 = 6; continue $sw8; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 9: {
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void j6(java.util.Set<abcd.yE> r5, int r6) {
        java.util.Iterator<abcd.ME> r0 = null;
        abcd.ME r1 = null;
        abcd.yE r2 = null;
        java.util.Iterator<abcd.yE> r3 = null;
        java.util.Iterator<abcd.yE> r4 = null;
        java.util.Date r7 = null;
        abcd.dG r8 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    r0 = this.Hw.v5().values().iterator();
                    $pc9 = 4; continue $sw9;
                }
                case 4: {
                    if (r0.hasNext() == false) { $pc9 = 5; continue $sw9; }
                    r1 = r0.next();
                    r2 = r1.FH();
                    if (r2 != null) { $pc9 = 27; continue $sw9; }
                    r2 = r1.DW();
                    $pc9 = 27; continue $sw9;
                }
                case 27: {
                    if (r2 == null) { $pc9 = 4; continue $sw9; }
                    j6(r2);
                    { $pc9 = 4; continue $sw9; }
                }
                case 5: {
                    r3 = this.Hw.Hw().iterator();
                    $pc9 = 7; continue $sw9;
                }
                case 7: {
                    if (r3.hasNext() == false) { $pc9 = 8; continue $sw9; }
                    j6(r3.next());
                    { $pc9 = 7; continue $sw9; }
                }
                case 8: {
                    r4 = r5.iterator();
                    $pc9 = 10; continue $sw9;
                }
                case 10: {
                    if (r4.hasNext() == false) { $pc9 = 11; continue $sw9; }
                    j6(r4.next());
                    { $pc9 = 10; continue $sw9; }
                }
                case 11: {
                    if (r6 <= 0) { $pc9 = 21; continue $sw9; }
                    r7 = new java.util.Date(((long) r6) * 1000);
                    this.j3.DW(abcd.EnumkG.DW);
                    this.j3.j6(this.Mr);
                    this.j3.j6(abcd.AbstractwG.j6(r7));
                    $pc9 = 13; continue $sw9;
                }
                case 13: {
                    r8 = this.j3.tp();
                    if (r8 == null) { $pc9 = 44; continue $sw9; }
                    if (r8.DW(this.rN) == false) { $pc9 = 13; continue $sw9; }
                    if (r8.DW(this.a8) == true) { $pc9 = 13; continue $sw9; }
                    r8.j6(this.a8);
                    r8.FH(this.a8);
                    this.Mr.add(r8);
                    { $pc9 = 13; continue $sw9; }
                }
                case 44: {
                    return;
                }
                case 21: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static int[] we() {
        int[] r0 = null;
        int[] r1 = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    r0 = aM;
                    if (r0 == null) { $pc10 = 5; continue $sw10; }
                    return r0;
                }
                case 5: {
                    r1 = new int[abcd.DI.a.values().length];
                    try {
                        r1[abcd.DI.a.DW.ordinal()] = 2;
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc10 = 13; continue $sw10; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc10 = 18; continue $sw10;
                }
                case 18: {
                    try {
                        r1[abcd.DI.a.Hw.ordinal()] = 4;
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc10 = 14; continue $sw10; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc10 = 24; continue $sw10;
                }
                case 24: {
                    try {
                        r1[abcd.DI.a.FH.ordinal()] = 3;
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc10 = 15; continue $sw10; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc10 = 26; continue $sw10;
                }
                case 26: {
                    try {
                        r1[abcd.DI.a.v5.ordinal()] = 5;
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc10 = 16; continue $sw10; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc10 = 20; continue $sw10;
                }
                case 20: {
                    try {
                        r1[abcd.DI.a.j6.ordinal()] = 1;
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        if ($t instanceof java.lang.NoSuchFieldError) { $pc10 = 17; continue $sw10; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc10 = 11; continue $sw10;
                }
                case 11: {
                    aM = r1;
                    return r1;
                }
                case 13: {
                    $pc10 = 14; continue $sw10;
                }
                case 14: {
                    $pc10 = 15; continue $sw10;
                }
                case 15: {
                    $pc10 = 16; continue $sw10;
                }
                case 16: {
                    $pc10 = 17; continue $sw10;
                }
                case 17: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected void DW(abcd.LE r2, java.util.Collection<abcd.ME> r3, java.util.Set<abcd.yE> r4) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    try {
                        J8();
                        j6(r4, j6(r3));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc11 = 9; continue $sw11; }
                        if ($t instanceof java.io.IOException) { $pc11 = 12; continue $sw11; }
                        if ($t instanceof abcd.AbstracteI.a) { $pc11 = 15; continue $sw11; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (this.Ws == false) { $pc11 = 6; continue $sw11; }
                    try {
                        this.SI = new abcd.RK.c(Integer.MAX_VALUE);
                        this.KD = new abcd.EI(this.SI);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc11 = 9; continue $sw11; }
                        if ($t instanceof java.io.IOException) { $pc11 = 12; continue $sw11; }
                        if ($t instanceof abcd.AbstracteI.a) { $pc11 = 15; continue $sw11; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    if (DW(r3) == false) { $pc11 = 19; continue $sw11; }
                    try {
                        j6(r2);
                        this.j3.v5();
                        this.Mr = null;
                        this.SI = null;
                        this.KD = null;
                        DW(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc11 = 9; continue $sw11; }
                        if ($t instanceof java.io.IOException) { $pc11 = 12; continue $sw11; }
                        if ($t instanceof abcd.AbstracteI.a) { $pc11 = 15; continue $sw11; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 19: {
                    return;
                }
                case 15: {
                    close();
                    return;
                }
                case 12: {
                    e = $ex11;
                    close();
                    throw new abcd.yD(e.getMessage(), e);
                }
                case 9: {
                    e = $ex11;
                    close();
                    throw new abcd.yD(e.getMessage(), e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.util.Collection<abcd.kH> Hw() {
        abcd.kH r0 = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r0 = this.nw;
                    if (r0 == null) { $pc12 = 7; continue $sw12; }
                    return java.util.Collections.singleton(r0);
                }
                case 7: {
                    return java.util.Collections.emptyList();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean Zo() {
        return false;
    }

    @Override
    public void close() {
        this.j3.EQ();
        super.close();
    }

    @Override
    public final void j6(abcd.LE r1, java.util.Collection<abcd.ME> r2, java.util.Set<abcd.yE> r3) {
        gn();
        DW(r1, r2, r3);
    }

    @Override
    public void j6(java.lang.String r1) {
        this.ei = r1;
    }

    @Override
    public boolean v5() {
        return false;
    }
}
