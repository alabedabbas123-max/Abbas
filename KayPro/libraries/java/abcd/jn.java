package abcd;

public class jn implements abcd.Interfaceqn {
    private final abcd.Pt DW;
    private abcd.yn EQ;
    private final boolean FH;
    private abcd.Ls Hw;
    private abcd.Interfacexn J0;
    private abcd.Ks VH;
    private abcd.Ks Zo;
    private abcd.Ss gn;
    private final java.lang.String j6;
    private abcd.Interfacevn tp;
    private abcd.Interfacesn u7;
    private int v5;
    private abcd.gn we;

    private static class a implements abcd.Ss {
        private final int DW;
        private final abcd.Ls FH;
        private final abcd.Pt j6;

        public a(abcd.Pt r5, int r6, int r7, abcd.Ls r8, abcd.Interfacexn r9) {
            abcd.Pt r10 = null;
            int r11 = 0;
            int r0 = 0;
            abcd.Ks r1 = null;
            java.lang.Throwable e = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (r7 < 0) { $pc0 = 16; continue $sw0; }
                        r10 = r5.j6(r6, (r7 * 2) + r6);
                        this.j6 = r10;
                        this.DW = r7;
                        this.FH = r8;
                        r11 = 0;
                        $pc0 = 5; continue $sw0;
                    }
                    case 5: {
                        if (r11 >= r7) { $pc0 = 14; continue $sw0; }
                        r0 = r11 * 2;
                        try {
                            r1 = (abcd.Ks) r8.get(r10.Zo(r0));
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            if ($t instanceof java.lang.ClassCastException) { $pc0 = 11; continue $sw0; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        if (r9 == null) { $pc0 = 10; continue $sw0; }
                        r9.j6(r10, r0, 2, "  " + r1);
                        $pc0 = 10; continue $sw0;
                    }
                    case 10: {
                        r11 = r11 + 1;
                        $pc0 = 14; continue $sw0;
                    }
                    case 11: {
                        e = $ex0;
                        throw new java.lang.RuntimeException("bogus class cpi", e);
                    }
                    case 14: {
                        return;
                    }
                    case 16: {
                        throw new java.lang.IllegalArgumentException("size < 0");
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
        public abcd.Qs getType(int r2) {
            int r3 = this.j6.Zo(r2 * 2);
            return ((abcd.Ks) this.FH.get(r3)).VH();
        }

        @Override
        public abcd.Ss j6(abcd.Qs r2) {
            throw new java.lang.UnsupportedOperationException("unsupported");
        }

        @Override
        public int size() {
            return this.DW;
        }
    }

    public jn(abcd.Pt r1, java.lang.String r2, boolean r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r1 == null) { $pc1 = 10; continue $sw1; }
                    if (r2 == null) { $pc1 = 8; continue $sw1; }
                    this.j6 = r2;
                    this.DW = r1;
                    this.FH = r3;
                    this.v5 = -1;
                    return;
                }
                case 8: {
                    throw new java.lang.NullPointerException("filePath == null");
                }
                case 10: {
                    throw new java.lang.NullPointerException("bytes == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public jn(byte[] r2, java.lang.String r3, boolean r4) {
        this(new abcd.Pt(r2), r3, r4);
    }

    private void QX() {
        abcd.Interfacexn r0 = null;
        abcd.en r1 = null;
        int r2 = 0;
        int r5 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        int r6 = 0;
        abcd.Interfacexn r10 = null;
        int r3 = 0;
        int r4 = 0;
        java.lang.String r11 = null;
        abcd.C0968kn r12 = null;
        abcd.C1053mn r13 = null;
        abcd.hn r14 = null;
        int r15 = 0;
        abcd.Interfacexn r16 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.DW.FH() < 10) { $pc2 = 39; continue $sw2; }
                    r0 = this.J0;
                    if (r0 == null) { $pc2 = 8; continue $sw2; }
                    r0.j6(this.DW, 0, 0, "begin classfile");
                    this.J0.j6(this.DW, 0, 4, "magic: " + abcd.Yt.gn(u7()));
                    this.J0.j6(this.DW, 4, 2, "minor_version: " + abcd.Yt.v5(we()));
                    this.J0.j6(this.DW, 6, 2, "major_version: " + abcd.Yt.v5(tp()));
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    if (this.FH == true) { $pc2 = 10; continue $sw2; }
                    $pc2 = 14; continue $sw2;
                }
                case 14: {
                    r1 = new abcd.en(this.DW);
                    r1.j6(this.J0);
                    this.Hw = r1.DW();
                    this.Hw.we();
                    r2 = r1.j6();
                    r5 = this.DW.Zo(r2);
                    r7 = r2 + 2;
                    this.Zo = (abcd.Ks) this.Hw.get(this.DW.Zo(r7));
                    r8 = r2 + 4;
                    this.VH = (abcd.Ks) this.Hw.j6(this.DW.Zo(r8));
                    r9 = r2 + 6;
                    r6 = this.DW.Zo(r9);
                    r10 = this.J0;
                    if (r10 == null) { $pc2 = 19; continue $sw2; }
                    r10.j6(this.DW, r2, 2, "access_flags: " + abcd.Mr.j6(r5));
                    this.J0.j6(this.DW, r7, 2, "this_class: " + this.Zo);
                    this.J0.j6(this.DW, r8, 2, "super_class: " + j6(this.VH));
                    this.J0.j6(this.DW, r9, 2, "interfaces_count: " + abcd.Yt.v5(r6));
                    if (r6 == 0) { $pc2 = 19; continue $sw2; }
                    this.J0.j6(this.DW, r2 + 8, 0, "interfaces:");
                    $pc2 = 19; continue $sw2;
                }
                case 19: {
                    r3 = r2 + 8;
                    this.gn = j6(r3, r6);
                    r4 = r3 + (r6 * 2);
                    if (this.FH == false) { $pc2 = 30; continue $sw2; }
                    r11 = this.Zo.VH().VH();
                    if (this.j6.endsWith(".class") == false) { $pc2 = 29; continue $sw2; }
                    if (this.j6.startsWith(r11) == false) { $pc2 = 29; continue $sw2; }
                    if (this.j6.length() == (r11.length() + 6)) { $pc2 = 30; continue $sw2; }
                    $pc2 = 29; continue $sw2;
                }
                case 29: {
                    throw new abcd.wn("class name (" + r11 + ") does not match path (" + this.j6 + ")");
                }
                case 30: {
                    this.v5 = r5;
                    r12 = new abcd.C0968kn(this, this.Zo, r4, this.we);
                    r12.j6(this.J0);
                    this.u7 = r12.VH();
                    r13 = new abcd.C1053mn(this, this.Zo, r12.Hw(), this.we);
                    r13.j6(this.J0);
                    this.tp = r13.VH();
                    r14 = new abcd.hn(this, 0, r13.Hw(), this.we);
                    r14.j6(this.J0);
                    this.EQ = r14.DW();
                    this.EQ.we();
                    r15 = r14.j6();
                    if (r15 != this.DW.FH()) { $pc2 = 37; continue $sw2; }
                    r16 = this.J0;
                    if (r16 == null) { $pc2 = 40; continue $sw2; }
                    r16.j6(this.DW, r15, 0, "end classfile");
                    return;
                }
                case 40: {
                    return;
                }
                case 37: {
                    throw new abcd.wn("extra bytes at end of class file, at offset " + abcd.Yt.gn(r15));
                }
                case 10: {
                    if (j6(u7(), we(), tp()) == true) { $pc2 = 14; continue $sw2; }
                    throw new abcd.wn("bad class file magic (" + abcd.Yt.gn(u7()) + ") or version (" + abcd.Yt.v5(tp()) + "." + abcd.Yt.v5(we()) + ")");
                }
                case 39: {
                    throw new abcd.wn("severely truncated class file");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void Ws() {
        abcd.wn r2 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    try {
                        QX();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.RuntimeException) { $pc3 = 5; continue $sw3; }
                        if ($t instanceof abcd.wn) { $pc3 = 8; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 8: {
                    e = $ex3;
                    e.j6("...while parsing " + this.j6);
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                case 5: {
                    e = $ex3;
                    r2 = new abcd.wn(e);
                    r2.j6("...while parsing " + this.j6);
                    throw r2;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void XL() {
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (this.EQ != null) { $pc4 = 6; continue $sw4; }
                    Ws();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private void aM() {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (this.v5 != (-1)) { $pc5 = 6; continue $sw5; }
                    Ws();
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String j6(java.lang.Object r0) {
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    if (r0 != null) { $pc6 = 6; continue $sw6; }
                    return "(none)";
                }
                case 6: {
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private boolean j6(int r2, int r3, int r4) {
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (r2 != (-889275714)) { $pc7 = 13; continue $sw7; }
                    if (r3 >= 0) { $pc7 = 6; continue $sw7; }
                    return false;
                }
                case 6: {
                    if (r4 != 50) { $pc7 = 9; continue $sw7; }
                    if (r3 > 0) { $pc7 = 16; continue $sw7; }
                    return true;
                }
                case 16: {
                    return false;
                }
                case 9: {
                    if (r4 < 50) { $pc7 = 11; continue $sw7; }
                    return false;
                }
                case 11: {
                    if (r4 < 45) { $pc7 = 18; continue $sw7; }
                    return true;
                }
                case 18: {
                    return false;
                }
                case 13: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.Js DW() {
        abcd.Interfaceon r0 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r0 = FH().j6("SourceFile");
                    if ((r0 instanceof abcd.xm) == true) { $pc8 = 5; continue $sw8; }
                    return null;
                }
                case 5: {
                    return ((abcd.xm) r0).j6();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.Interfacevn EQ() {
        XL();
        return this.tp;
    }

    public abcd.Interfacepn FH() {
        XL();
        return this.EQ;
    }

    public abcd.Pt Hw() {
        return this.DW;
    }

    public abcd.Ks J0() {
        aM();
        return this.VH;
    }

    public abcd.Ks J8() {
        aM();
        return this.Zo;
    }

    public abcd.Ss VH() {
        aM();
        return this.gn;
    }

    public abcd.Interfacesn Zo() {
        XL();
        return this.u7;
    }

    public int gn() {
        aM();
        return u7();
    }

    @Override
    public int j6() {
        aM();
        return this.v5;
    }

    public abcd.Ss j6(int r8, int r9) {
        abcd.Ls r4 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (r9 == 0) { $pc9 = 4; continue $sw9; }
                    r4 = this.Hw;
                    if (r4 == null) { $pc9 = 10; continue $sw9; }
                    return new abcd.jn.a(this.DW, r8, r9, r4, this.J0);
                }
                case 10: {
                    throw new java.lang.IllegalStateException("pool not yet initialized");
                }
                case 4: {
                    return abcd.Ps.FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(abcd.gn r2) {
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (r2 == null) { $pc10 = 6; continue $sw10; }
                    this.we = r2;
                    return;
                }
                case 6: {
                    throw new java.lang.NullPointerException("attributeFactory == null");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public int tp() {
        return this.DW.Zo(6);
    }

    public int u7() {
        return this.DW.DW(0);
    }

    public abcd.Interfacens v5() {
        aM();
        return this.Hw;
    }

    public int we() {
        return this.DW.Zo(4);
    }
}
