package abcd;

public abstract class RE {
    private boolean DW;
    private abcd.KE FH;
    private java.lang.String Hw;
    private abcd.yE VH;
    private abcd.yE Zo;
    private abcd.RE.a gn;
    private abcd.yE j6;
    private boolean tp;
    private final abcd.ME u7;
    private boolean v5;

    public static final class a extends com.almlkaide.kaypro.internal.EnumBase {
        public static final abcd.RE.a DW = null;
        private static final abcd.RE.a[] EQ = null;
        public static final abcd.RE.a FH = null;
        public static final abcd.RE.a Hw = null;
        public static final abcd.RE.a VH = null;
        public static final abcd.RE.a Zo = null;
        public static final abcd.RE.a gn = null;
        public static final abcd.RE.a j6 = null;
        public static final abcd.RE.a tp = null;
        public static final abcd.RE.a u7 = null;
        public static final abcd.RE.a v5 = null;

        static {
            j6 = new abcd.RE.a("NOT_ATTEMPTED", 0);
            DW = new abcd.RE.a("LOCK_FAILURE", 1);
            FH = new abcd.RE.a("NO_CHANGE", 2);
            Hw = new abcd.RE.a("NEW", 3);
            v5 = new abcd.RE.a("FORCED", 4);
            Zo = new abcd.RE.a("FAST_FORWARD", 5);
            VH = new abcd.RE.a("REJECTED", 6);
            gn = new abcd.RE.a("REJECTED_CURRENT_BRANCH", 7);
            u7 = new abcd.RE.a("IO_FAILURE", 8);
            tp = new abcd.RE.a("RENAMED", 9);
            EQ = new abcd.RE.a[]{j6, DW, FH, Hw, v5, Zo, VH, gn, u7, tp};
        }

        private a(java.lang.String r1, int r2) {
            super(r1, r2);
        }

        public static abcd.RE.a valueOf(java.lang.String r1) {
            return (abcd.RE.a) com.almlkaide.kaypro.internal.EnumBase.valueOf(abcd.RE.a.values(), r1);
        }

        public static abcd.RE.a[] values() {
            abcd.RE.a[] r0 = EQ;
            int r1 = r0.length;
            abcd.RE.a[] r2 = new abcd.RE.a[r1];
            java.lang.System.arraycopy(r0, 0, r2, 0, r1);
            return r2;
        }
    }

    private abstract class b {
        final abcd.RE j6;

        private b(abcd.RE r1) {
            this.j6 = r1;
        }

        b(abcd.RE r1, abcd.RE.b r2) {
            this(r1);
        }

        abstract abcd.RE.a j6(abcd.RE.a r1);
    }

    protected RE(abcd.ME r2) {
        this.gn = abcd.RE.a.j6;
        this.u7 = r2;
        this.Zo = r2.DW();
        this.Hw = "";
    }

    private void aM() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.j6 == null) { $pc0 = 6; continue $sw0; }
                    return;
                }
                case 6: {
                    throw new java.lang.IllegalStateException(org.eclipse.jgit.JGitText.j6().aNewObjectIdIsRequired);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private abcd.RE.a j6(abcd.qG r4, abcd.RE.b r5) {
        abcd.RE.a r6 = null;
        abcd.yE r0 = null;
        abcd.RE.a r7 = null;
        abcd.RE.a r8 = null;
        abcd.AbstractiG r1 = null;
        abcd.AbstractiG r2 = null;
        abcd.RE.a r9 = null;
        abcd.RE.a r10 = null;
        abcd.RE.a r11 = null;
        abcd.RE.a r12 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (gn().FH(Hw()) == false) { $pc1 = 55; continue $sw1; }
                    return abcd.RE.a.DW;
                }
                case 55: {
                    $pc1 = 52; continue $sw1;
                }
                case 52: {
                    th = $ex1;
                    QX();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 8: {
                    if (DW(true) == true) { $pc1 = 13; continue $sw1; }
                    try {
                        r6 = abcd.RE.a.DW;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 52; continue $sw1;
                    }
                    QX();
                    return r6;
                }
                case 13: {
                    if (this.VH == null) { $pc1 = 24; continue $sw1; }
                    if (this.Zo == null) { $pc1 = 17; continue $sw1; }
                    try {
                        r0 = this.Zo;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 52; continue $sw1;
                    }
                    $pc1 = 19; continue $sw1;
                }
                case 19: {
                    if (abcd.YD.j6(this.VH, r0) == true) { $pc1 = 24; continue $sw1; }
                    try {
                        r7 = abcd.RE.a.DW;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 52; continue $sw1;
                    }
                    QX();
                    return r7;
                }
                case 17: {
                    try {
                        r0 = abcd.yE.Ws();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 52; continue $sw1;
                    }
                    $pc1 = 24; continue $sw1;
                }
                case 24: {
                    if (this.Zo != null) { $pc1 = 28; continue $sw1; }
                    try {
                        r8 = r5.j6(abcd.RE.a.Hw);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 52; continue $sw1;
                    }
                    QX();
                    return r8;
                }
                case 28: {
                    try {
                        r1 = j6(r4, this.j6);
                        r2 = j6(r4, this.Zo);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 52; continue $sw1;
                    }
                    if (r1 != r2) { $pc1 = 36; continue $sw1; }
                    if (this.tp == true) { $pc1 = 36; continue $sw1; }
                    try {
                        r9 = r5.j6(abcd.RE.a.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 52; continue $sw1;
                    }
                    QX();
                    return r9;
                }
                case 36: {
                    if ((r1 instanceof abcd.dG) == false) { $pc1 = 45; continue $sw1; }
                    if ((r2 instanceof abcd.dG) == false) { $pc1 = 45; continue $sw1; }
                    if (r4.j6((abcd.dG) r2, (abcd.dG) r1) == false) { $pc1 = 45; continue $sw1; }
                    try {
                        r10 = r5.j6(abcd.RE.a.Zo);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 52; continue $sw1;
                    }
                    QX();
                    return r10;
                }
                case 45: {
                    if (J0() == false) { $pc1 = 49; continue $sw1; }
                    try {
                        r11 = r5.j6(abcd.RE.a.v5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 52; continue $sw1;
                    }
                    QX();
                    return r11;
                }
                case 49: {
                    try {
                        r12 = abcd.RE.a.VH;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 52; continue $sw1;
                    }
                    QX();
                    return r12;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static abcd.AbstractiG j6(abcd.qG r1, abcd.YD r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2 == null) { $pc2 = 9; continue $sw2; }
                    return r1.Zo(r2);
                }
                case 10: {
                    return null;
                }
                case 9: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract abcd.RE.a DW(abcd.RE.a r1);

    public abcd.RE.a DW(abcd.qG r2) {
        abcd.RE.a r3 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    aM();
                    try {
                        r3 = j6(r2, new abcd.PE(this));
                        this.gn = r3;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.io.IOException) { $pc3 = 5; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r3;
                }
                case 5: {
                    e = $ex3;
                    this.gn = abcd.RE.a.u7;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.RE.a DW(java.lang.String r5) {
        abcd.RE.a r6 = null;
        abcd.ME r0 = null;
        abcd.ME r1 = null;
        abcd.RE.a r7 = null;
        abcd.RE.a r8 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r5.startsWith("refs/") == false) { $pc4 = 42; continue $sw4; }
                    if (gn().FH(Hw()) == true) { $pc4 = 7; continue $sw4; }
                    $pc4 = 36; continue $sw4;
                }
                case 36: {
                    e = $ex4;
                    try {
                        this.gn = abcd.RE.a.u7;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 34; continue $sw4;
                    }
                }
                case 9: {
                    if (DW(false) == true) { $pc4 = 13; continue $sw4; }
                    try {
                        r6 = abcd.RE.a.DW;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 36; continue $sw4; }
                        $pc4 = 34; continue $sw4;
                    }
                    QX();
                    return r6;
                }
                case 13: {
                    try {
                        r0 = gn().j6(Hw());
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 36; continue $sw4; }
                        $pc4 = 34; continue $sw4;
                    }
                    if (r0 != null) { $pc4 = 16; continue $sw4; }
                    $pc4 = 22; continue $sw4;
                }
                case 22: {
                    if (r0 != null) { $pc4 = 24; continue $sw4; }
                    $pc4 = 26; continue $sw4;
                }
                case 26: {
                    try {
                        r1 = gn().j6(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 36; continue $sw4; }
                        $pc4 = 34; continue $sw4;
                    }
                    if (r1 != null) { $pc4 = 29; continue $sw4; }
                    $pc4 = 31; continue $sw4;
                }
                case 31: {
                    try {
                        r7 = j6(r5);
                        this.gn = r7;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 36; continue $sw4; }
                        $pc4 = 34; continue $sw4;
                    }
                    QX();
                    return r7;
                }
                case 29: {
                    if (r1.DW() == null) { $pc4 = 31; continue $sw4; }
                    try {
                        DW(r1.DW());
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 36; continue $sw4; }
                        $pc4 = 34; continue $sw4;
                    }
                    { $pc4 = 31; continue $sw4; }
                }
                case 24: {
                    if (r0.DW() == null) { $pc4 = 26; continue $sw4; }
                    try {
                        j6(r0.DW());
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 36; continue $sw4; }
                        $pc4 = 34; continue $sw4;
                    }
                    { $pc4 = 26; continue $sw4; }
                }
                case 16: {
                    if (r0.Zo() == false) { $pc4 = 22; continue $sw4; }
                    if (r5.equals(r0.getTarget().getName()) == false) { $pc4 = 22; continue $sw4; }
                    try {
                        r8 = abcd.RE.a.FH;
                        this.gn = r8;
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.io.IOException) { $pc4 = 36; continue $sw4; }
                        $pc4 = 34; continue $sw4;
                    }
                    QX();
                    return r8;
                }
                case 7: {
                    return abcd.RE.a.DW;
                }
                case 34: {
                    th = $ex4;
                    QX();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 42: {
                    throw new java.lang.IllegalArgumentException(java.text.MessageFormat.format(org.eclipse.jgit.JGitText.j6().illegalArgumentNotA, new java.lang.Object[]{"refs/"}));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW() {
        this.Hw = null;
        this.v5 = false;
    }

    public void DW(abcd.YD r1) {
        this.j6 = r1.Hw();
    }

    protected abstract boolean DW(boolean r1);

    protected abstract abcd.UE EQ();

    public abcd.RE.a FH() {
        this.DW = true;
        return XL();
    }

    public java.lang.String Hw() {
        return VH().getName();
    }

    public boolean J0() {
        return this.DW;
    }

    protected boolean J8() {
        return this.v5;
    }

    protected abstract void QX();

    public abcd.ME VH() {
        return this.u7;
    }

    public void Ws() {
        this.tp = true;
    }

    public abcd.RE.a XL() {
        abcd.qG r0 = null;
        abcd.RE.a r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    r0 = new abcd.qG(EQ());
                    try {
                        r1 = DW(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 6; continue $sw5;
                    }
                    r0.EQ();
                    return r1;
                }
                case 6: {
                    th = $ex5;
                    r0.EQ();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public abcd.yE Zo() {
        return this.Zo;
    }

    protected abstract abcd.OE gn();

    public abcd.RE.a j6() {
        abcd.qG r0 = null;
        abcd.RE.a r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = new abcd.qG(EQ());
                    try {
                        r1 = j6(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 6; continue $sw6;
                    }
                    r0.EQ();
                    return r1;
                }
                case 6: {
                    th = $ex6;
                    r0.EQ();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract abcd.RE.a j6(abcd.RE.a r1);

    public abcd.RE.a j6(abcd.qG r4) {
        java.lang.String r0 = null;
        abcd.ME r1 = null;
        abcd.RE.a r5 = null;
        abcd.RE.a r6 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r0 = VH().v5().getName();
                    if (r0.startsWith("refs/heads/") == false) { $pc7 = 18; continue $sw7; }
                    r1 = gn().j6("HEAD");
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    if (r1.Zo() == false) { $pc7 = 18; continue $sw7; }
                    r1 = r1.getTarget();
                    if (r0.equals(r1.getName()) == false) { $pc7 = 6; continue $sw7; }
                    r5 = abcd.RE.a.gn;
                    this.gn = r5;
                    return r5;
                }
                case 18: {
                    try {
                        r6 = j6(r4, new abcd.QE(this));
                        this.gn = r6;
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        if ($t instanceof java.io.IOException) { $pc7 = 14; continue $sw7; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return r6;
                }
                case 14: {
                    e = $ex7;
                    this.gn = abcd.RE.a.u7;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(e);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract abcd.RE.a j6(java.lang.String r1);

    public void j6(abcd.KE r1) {
        this.FH = r1;
    }

    public void j6(abcd.YD r1) {
        abcd.yE r2 = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if (r1 == null) { $pc8 = 4; continue $sw8; }
                    r2 = r1.J8();
                    $pc8 = 5; continue $sw8;
                }
                case 5: {
                    this.VH = r2;
                    return;
                }
                case 4: {
                    r2 = null;
                    { $pc8 = 5; continue $sw8; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected void j6(abcd.yE r1) {
        this.Zo = r1;
    }

    public void j6(java.lang.String r1, boolean r2) {
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (r1 != null) { $pc9 = 5; continue $sw9; }
                    if (r2 == true) { $pc9 = 5; continue $sw9; }
                    DW();
                    return;
                }
                case 5: {
                    if (r1 != null) { $pc9 = 8; continue $sw9; }
                    if (r2 == false) { $pc9 = 8; continue $sw9; }
                    this.Hw = "";
                    this.v5 = true;
                    return;
                }
                case 8: {
                    this.Hw = r1;
                    this.v5 = r2;
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(boolean r1) {
        this.DW = r1;
    }

    public java.lang.String tp() {
        return this.Hw;
    }

    public abcd.KE u7() {
        return this.FH;
    }

    public abcd.yE v5() {
        return this.j6;
    }

    public abcd.RE.a we() {
        return this.gn;
    }
}
