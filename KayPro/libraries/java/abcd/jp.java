package abcd;

public final class jp {
    private final abcd.Fp DW;
    private final abcd.C0621cp EQ;
    private final abcd.Fp FH;
    private final abcd.Fp Hw;
    private final abcd.Fp J0;
    private final abcd.sp J8;
    private int QX;
    private final abcd.Qp VH;
    private final abcd.AbstractKp[] Ws;
    private int XL;
    private final abcd.Op Zo;
    private final abcd.Jp gn;
    private abcd.Fn j6;
    private final abcd.Cp tp;
    private final abcd.qp u7;
    private final abcd.Fp v5;
    private final abcd.Fp we;

    public jp(abcd.Fn r6) {
        this.j6 = r6;
        this.J8 = new abcd.sp(this);
        this.FH = new abcd.Fp(null, this, 4, abcd.Fp.a.j6);
        this.DW = new abcd.Fp("word_data", this, 4, abcd.Fp.a.DW);
        this.v5 = new abcd.Fp("string_data", this, 1, abcd.Fp.a.FH);
        this.we = new abcd.Fp(null, this, 1, abcd.Fp.a.j6);
        this.J0 = new abcd.Fp("byte_data", this, 1, abcd.Fp.a.DW);
        this.Zo = new abcd.Op(this);
        this.VH = new abcd.Qp(this);
        this.gn = new abcd.Jp(this);
        this.u7 = new abcd.qp(this);
        this.tp = new abcd.Cp(this);
        this.EQ = new abcd.C0621cp(this);
        this.Hw = new abcd.Fp("map", this, 4, abcd.Fp.a.j6);
        this.Ws = new abcd.AbstractKp[]{this.J8, this.Zo, this.VH, this.gn, this.u7, this.tp, this.EQ, this.DW, this.FH, this.v5, this.J0, this.we, this.Hw};
        this.QX = -1;
        this.XL = 79;
    }

    private static void DW(byte[] r3) {
        java.security.MessageDigest r0 = null;
        int r4 = 0;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        r0 = java.security.MessageDigest.getInstance("SHA-1");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.security.NoSuchAlgorithmException) { $pc0 = 12; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r0.update(r3, 32, r3.length - 32);
                    try {
                        r4 = r0.digest(r3, 12, 20);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.security.DigestException) { $pc0 = 9; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r4 != 20) { $pc0 = 8; continue $sw0; }
                    return;
                }
                case 8: {
                    try {
                        throw new java.lang.RuntimeException("unexpected digest write: " + r4 + " bytes");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.security.DigestException) { $pc0 = 9; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 9: {
                    e = $ex0;
                    throw new java.lang.RuntimeException(e);
                }
                case 12: {
                    e = $ex0;
                    throw new java.lang.RuntimeException(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.Qt j6(boolean r9, boolean r10) {
        int r0 = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        abcd.AbstractKp r5 = null;
        int r6 = 0;
        byte[] r4 = null;
        abcd.Qt r7 = null;
        abcd.AbstractKp r11 = null;
        int r8 = 0;
        abcd.Vt r12 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    this.EQ.v5();
                    this.we.v5();
                    this.DW.v5();
                    this.J0.v5();
                    this.tp.v5();
                    this.u7.v5();
                    this.gn.v5();
                    this.FH.v5();
                    this.VH.v5();
                    this.Zo.v5();
                    this.v5.v5();
                    this.J8.v5();
                    r0 = this.Ws.length;
                    r1 = 0;
                    r2 = 0;
                    r3 = 0;
                    $pc1 = 4; continue $sw1;
                }
                case 4: {
                    if (r2 >= r0) { $pc1 = 20; continue $sw1; }
                    r5 = this.Ws[r2];
                    r6 = r5.DW(r3);
                    if (r6 < r3) { $pc1 = 19; continue $sw1; }
                    if (r5 != this.Hw) { $pc1 = 11; continue $sw1; }
                    try {
                        abcd.xp.j6(this.Ws, this.Hw);
                        this.Hw.v5();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 15; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    if ((r5 instanceof abcd.Fp) == false) { $pc1 = 14; continue $sw1; }
                    try {
                        ((abcd.Fp) r5).tp();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 15; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    r3 = r5.u7() + r6;
                    r2 = r2 + 1;
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    e = $ex1;
                    throw abcd.Vt.j6(e, "...while writing section " + r2);
                }
                case 19: {
                    throw new java.lang.RuntimeException("bogus placement for section " + r2);
                }
                case 20: {
                    this.QX = r3;
                    r4 = new byte[this.QX];
                    r7 = new abcd.Qt(r4);
                    if (r9 == false) { $pc1 = 23; continue $sw1; }
                    r7.j6(this.XL, r10);
                    $pc1 = 23; continue $sw1;
                }
                case 23: {
                    if (r1 >= r0) { $pc1 = 37; continue $sw1; }
                    try {
                        r11 = this.Ws[r1];
                        r8 = r11.FH() - r7.v5();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 29; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r8 < 0) { $pc1 = 28; continue $sw1; }
                    try {
                        r7.j6(r11.FH() - r7.v5());
                        r11.DW(r7);
                        r1 = r1 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 29; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc1 = 23; continue $sw1; }
                }
                case 28: {
                    try {
                        throw new abcd.Vt("excess write of " + (-r8));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc1 = 29; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                case 29: {
                    e = $ex1;
                    if ((e instanceof abcd.Vt) == false) { $pc1 = 33; continue $sw1; }
                    r12 = (abcd.Vt) e;
                    $pc1 = 34; continue $sw1;
                }
                case 34: {
                    r12.j6("...while writing section " + r1);
                    throw r12;
                }
                case 33: {
                    r12 = new abcd.Vt(e);
                    { $pc1 = 34; continue $sw1; }
                }
                case 37: {
                    if (r7.v5() != this.QX) { $pc1 = 43; continue $sw1; }
                    DW(r4);
                    j6(r4);
                    if (r9 == false) { $pc1 = 41; continue $sw1; }
                    this.DW.j6(r7, abcd.Enumwp.J0, "\nmethod code index:\n\n");
                    we().j6(r7);
                    r7.Zo();
                    $pc1 = 41; continue $sw1;
                }
                case 41: {
                    return r7;
                }
                case 43: {
                    throw new java.lang.RuntimeException("foreshortened write");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void j6(byte[] r3) {
        java.util.zip.Adler32 r0 = new java.util.zip.Adler32();
        r0.update(r3, 12, r3.length - 12);
        int r1 = (int) r0.getValue();
        r3[8] = (byte) r1;
        r3[9] = (byte) (r1 >> 8);
        r3[10] = (byte) (r1 >> 16);
        r3[11] = (byte) (r1 >> 24);
    }

    abcd.Fp DW() {
        return this.we;
    }

    void DW(abcd.Abstractms r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if ((r2 instanceof abcd.Js) == false) { $pc2 = 6; continue $sw2; }
                    this.Zo.DW((abcd.Js) r2);
                    return;
                }
                case 6: {
                    if ((r2 instanceof abcd.Ks) == false) { $pc2 = 9; continue $sw2; }
                    this.VH.DW((abcd.Ks) r2);
                    return;
                }
                case 9: {
                    if ((r2 instanceof abcd.Abstractqs) == false) { $pc2 = 12; continue $sw2; }
                    this.tp.DW((abcd.Abstractqs) r2);
                    return;
                }
                case 12: {
                    if ((r2 instanceof abcd.ws) == false) { $pc2 = 15; continue $sw2; }
                    this.u7.DW((abcd.ws) r2);
                    return;
                }
                case 15: {
                    if ((r2 instanceof abcd.vs) == false) { $pc2 = 17; continue $sw2; }
                    this.u7.DW(((abcd.vs) r2).J8());
                    return;
                }
                case 17: {
                    if (r2 == null) { $pc2 = 20; continue $sw2; }
                    return;
                }
                case 20: {
                    throw new java.lang.NullPointerException("cst == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    abcd.Jp EQ() {
        return this.gn;
    }

    abcd.C0621cp FH() {
        return this.EQ;
    }

    public abcd.Fn Hw() {
        return this.j6;
    }

    abcd.Fp J0() {
        return this.v5;
    }

    abcd.Op J8() {
        return this.Zo;
    }

    abcd.Fp QX() {
        return this.FH;
    }

    abcd.AbstractKp VH() {
        return this.DW;
    }

    abcd.Qp Ws() {
        return this.VH;
    }

    abcd.Fp XL() {
        return this.DW;
    }

    int Zo() {
        int r0 = 0;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.QX;
                    if (r0 < 0) { $pc3 = 6; continue $sw3; }
                    return r0;
                }
                case 6: {
                    throw new java.lang.RuntimeException("file size not yet known");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    abcd.AbstractKp gn() {
        return this.Hw;
    }

    abcd.Fp j6() {
        return this.J0;
    }

    abcd.Abstractup j6(abcd.Abstractms r2) {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if ((r2 instanceof abcd.Js) == false) { $pc4 = 7; continue $sw4; }
                    return this.Zo.j6(r2);
                }
                case 7: {
                    if ((r2 instanceof abcd.Ks) == false) { $pc4 = 11; continue $sw4; }
                    return this.VH.j6(r2);
                }
                case 11: {
                    if ((r2 instanceof abcd.Abstractqs) == false) { $pc4 = 15; continue $sw4; }
                    return this.tp.j6(r2);
                }
                case 15: {
                    if ((r2 instanceof abcd.ws) == true) { $pc4 = 17; continue $sw4; }
                    return null;
                }
                case 17: {
                    return this.u7.j6(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.C0577bp r2) {
        this.EQ.j6(r2);
    }

    public byte[] j6(java.io.Writer r2, boolean r3) {
        boolean r0 = false;
        abcd.Qt r4 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r2 == null) { $pc5 = 4; continue $sw5; }
                    r0 = true;
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    r4 = j6(r0, r3);
                    if (r0 == false) { $pc5 = 9; continue $sw5; }
                    r4.j6(r2);
                    $pc5 = 9; continue $sw5;
                }
                case 9: {
                    return r4.VH();
                }
                case 4: {
                    r0 = false;
                    { $pc5 = 5; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    abcd.Cp tp() {
        return this.tp;
    }

    abcd.Fp u7() {
        return this.Hw;
    }

    abcd.qp v5() {
        return this.u7;
    }

    public abcd.Lp we() {
        abcd.Lp r0 = null;
        abcd.AbstractKp[] r1 = null;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = new abcd.Lp();
                    r1 = this.Ws;
                    r2 = r1.length;
                    r3 = 0;
                    $pc6 = 3; continue $sw6;
                }
                case 3: {
                    if (r3 >= r2) { $pc6 = 5; continue $sw6; }
                    r0.j6(r1[r3]);
                    r3 = r3 + 1;
                    { $pc6 = 3; continue $sw6; }
                }
                case 5: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
