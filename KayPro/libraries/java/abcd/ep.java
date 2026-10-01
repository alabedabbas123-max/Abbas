package abcd;

public final class ep extends abcd.AbstractGp {
    private abcd._o VH;
    private final abcd.Un Zo;
    private final boolean gn;
    private abcd.C0883ip tp;
    private final abcd.Ss u7;
    private final abcd.Gs v5;

    public ep(abcd.Gs r3, abcd.Un r4, boolean r5, abcd.Ss r6) {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super(4, -1);
                    if (r3 == null) { $pc0 = 13; continue $sw0; }
                    if (r4 == null) { $pc0 = 11; continue $sw0; }
                    if (r6 == null) { $pc0 = 9; continue $sw0; }
                    this.v5 = r3;
                    this.Zo = r4;
                    this.gn = r5;
                    this.u7 = r6;
                    this.VH = null;
                    this.tp = null;
                    return;
                }
                case 9: {
                    throw new java.lang.NullPointerException("throwsList == null");
                }
                case 11: {
                    throw new java.lang.NullPointerException("code == null");
                }
                case 13: {
                    throw new java.lang.NullPointerException("ref == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void FH(abcd.jp r2, abcd.Lt r3) {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    try {
                        this.Zo.Hw().j6(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 5; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 5: {
                    e = $ex1;
                    throw abcd.Vt.j6(e, "...while writing instructions for " + this.v5.aM());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private int Mr() {
        return this.Zo.Hw().er();
    }

    private int U2() {
        return this.Zo.Hw().yS();
    }

    private int j3() {
        return this.v5.j6(this.gn);
    }

    @Override
    protected void DW(abcd.AbstractKp r2, int r3) {
        abcd.jp r4 = null;
        abcd._o r5 = null;
        int r6 = 0;
        int r7 = 0;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r4 = r2.DW();
                    this.Zo.j6(new abcd.dp(this, r4));
                    r5 = this.VH;
                    if (r5 == null) { $pc2 = 5; continue $sw2; }
                    r5.j6(r4);
                    r6 = this.VH.DW();
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    r7 = this.Zo.Hw().rN();
                    if ((r7 & 1) == 0) { $pc2 = 9; continue $sw2; }
                    r7 = r7 + 1;
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    j6(((r7 * 2) + 16) + r6);
                    return;
                }
                case 5: {
                    r6 = 0;
                    { $pc2 = 6; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    protected void DW(abcd.jp r14, abcd.Lt r15) {
        boolean r0 = false;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        boolean r5 = false;
        abcd._o r7 = null;
        int r8 = 0;
        abcd.C0883ip r9 = null;
        int r10 = 0;
        java.lang.StringBuilder r11 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = r15.Hw();
                    r1 = U2();
                    r2 = Mr();
                    r3 = j3();
                    r4 = this.Zo.Hw().rN();
                    if ((r4 & 1) == 0) { $pc3 = 5; continue $sw3; }
                    r5 = true;
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    r7 = this.VH;
                    if (r7 != null) { $pc3 = 9; continue $sw3; }
                    r8 = 0;
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    r9 = this.tp;
                    if (r9 != null) { $pc3 = 13; continue $sw3; }
                    r10 = 0;
                    $pc3 = 15; continue $sw3;
                }
                case 15: {
                    if (r0 == false) { $pc3 = 19; continue $sw3; }
                    r15.j6(0, Ws() + ' ' + this.v5.aM());
                    r11 = new java.lang.StringBuilder();
                    r11.append("  registers_size: ");
                    r11.append(abcd.Yt.v5(r1));
                    r15.j6(2, r11.toString());
                    r15.j6(2, "  ins_size:       " + abcd.Yt.v5(r3));
                    r15.j6(2, "  outs_size:      " + abcd.Yt.v5(r2));
                    r15.j6(2, "  tries_size:     " + abcd.Yt.v5(r8));
                    r15.j6(4, "  debug_off:      " + abcd.Yt.gn(r10));
                    r15.j6(4, "  insns_size:     " + abcd.Yt.gn(r4));
                    if (this.u7.size() == 0) { $pc3 = 19; continue $sw3; }
                    r15.j6(0, "  throws " + abcd.Ps.DW(this.u7));
                    $pc3 = 19; continue $sw3;
                }
                case 19: {
                    r15.writeShort(r1);
                    r15.writeShort(r3);
                    r15.writeShort(r2);
                    r15.writeShort(r8);
                    r15.writeInt(r10);
                    r15.writeInt(r4);
                    FH(r14, r15);
                    if (this.VH == null) { $pc3 = 26; continue $sw3; }
                    if (r5 == false) { $pc3 = 25; continue $sw3; }
                    if (r0 == false) { $pc3 = 24; continue $sw3; }
                    r15.j6(2, "  padding: 0");
                    $pc3 = 24; continue $sw3;
                }
                case 24: {
                    r15.writeShort(0);
                    $pc3 = 25; continue $sw3;
                }
                case 25: {
                    this.VH.j6(r14, r15);
                    $pc3 = 26; continue $sw3;
                }
                case 26: {
                    if (r0 == true) { $pc3 = 28; continue $sw3; }
                    return;
                }
                case 28: {
                    if (this.tp == null) { $pc3 = 32; continue $sw3; }
                    r15.j6(0, "  debug info");
                    this.tp.j6(r14, r15, "    ");
                    return;
                }
                case 32: {
                    return;
                }
                case 13: {
                    r10 = r9.we();
                    { $pc3 = 15; continue $sw3; }
                }
                case 9: {
                    r8 = r7.j6();
                    { $pc3 = 10; continue $sw3; }
                }
                case 5: {
                    r5 = false;
                    { $pc3 = 6; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.Enumwp Hw() {
        return abcd.Enumwp.J0;
    }

    @Override
    public java.lang.String aM() {
        return this.v5.aM();
    }

    @Override
    public void j6(abcd.jp r7) {
        abcd.Fp r0 = null;
        abcd.Qp r1 = null;
        java.util.Iterator<abcd.Qs> r2 = null;
        java.util.Iterator<abcd.Abstractms> r3 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = r7.j6();
                    r1 = r7.Ws();
                    if (this.Zo.u7() == false) { $pc4 = 5; continue $sw4; }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    this.tp = new abcd.C0883ip(this.Zo, this.gn, this.v5);
                    r0.j6(this.tp);
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    if (this.Zo.VH() == false) { $pc4 = 14; continue $sw4; }
                    r2 = this.Zo.j6().iterator();
                    $pc4 = 11; continue $sw4;
                }
                case 11: {
                    if (r2.hasNext() == false) { $pc4 = 13; continue $sw4; }
                    r1.DW(r2.next());
                    { $pc4 = 11; continue $sw4; }
                }
                case 13: {
                    this.VH = new abcd._o(this.Zo);
                    $pc4 = 14; continue $sw4;
                }
                case 14: {
                    r3 = this.Zo.FH().iterator();
                    $pc4 = 16; continue $sw4;
                }
                case 16: {
                    if (r3.hasNext() == false) { $pc4 = 18; continue $sw4; }
                    r7.DW(r3.next());
                    { $pc4 = 16; continue $sw4; }
                }
                case 18: {
                    return;
                }
                case 5: {
                    if (this.Zo.gn() == false) { $pc4 = 8; continue $sw4; }
                    { $pc4 = 6; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return "CodeItem{" + aM() + "}";
    }
}
