package abcd;

@abcd.Interfacexu
class BinderMk extends com.aide.engine.service.u.a {

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;
    final abcd.Nk.a VH;

    @abcd.Interfaceru(field = -393744849814177100L)
    private com.aide.engine.service.CharArray Zo;

    @abcd.Interfacevu
    final abcd.Nk gn;

    @abcd.Interfaceru(field = 98836575055614671L)
    private com.aide.engine.I v5;

    static {
        abcd.wu.j6(abcd.BinderMk.class, -87904726456966265L, 555058604179105996L);
    }

    BinderMk(abcd.Nk r1, abcd.Nk.a r2) {
        this.gn = r1;
        this.VH = r2;
        this.v5 = new com.aide.engine.I();
        this.Zo = new com.aide.engine.service.CharArray(10000);
    }

    @Override
    @abcd.Interfacesu(method = 2235608365559036496L)
    public com.aide.engine.service.CharArray FH(int r10) {
        char[] r2 = null;
        char[] r3 = null;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 17: {
                    th = th;
                    $pc0 = 19; continue $sw0;
                }
                case 19: {
                    if (Hw == false) { $pc0 = 22; continue $sw0; }
                    abcd.wu.j6(th, -1061154994333155840L, this, new java.lang.Integer(r10));
                    $pc0 = 22; continue $sw0;
                }
                case 22: {
                    throw th;
                }
                case 4: {
                    if (FH == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-1061154994333155840L, this, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 17; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = this.v5.FH;
                        r3 = this.Zo.FH;
                        r4 = this.v5.Hw;
                        r5 = r3.length;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 17; continue $sw0;
                    }
                    r6 = 0;
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    if (r10 >= r4) { $pc0 = 15; continue $sw0; }
                    if (r6 >= r5) { $pc0 = 15; continue $sw0; }
                    r7 = r6 + 1;
                    r8 = r10 + 1;
                    try {
                        r3[r6] = r2[r10];
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    r6 = r7;
                    r10 = r8;
                    $pc0 = 15; continue $sw0;
                }
                case 13: {
                    th = th;
                    r10 = r8;
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    try {
                        this.Zo.Hw = r6;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 17; continue $sw0;
                    }
                    return this.Zo;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -1667774281767890280L)
    public long getVersion() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (Hw == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, 1635135770701214400L, this);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(1635135770701214400L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return this.VH.getVersion();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 2210754340865682671L)
    public int sE() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if (Hw == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, 1245703052780377183L, this);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(1245703052780377183L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    return this.v5.Hw;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 4312686639289931136L)
    public long ye() {
        com.aide.engine.I r2 = null;
        com.aide.engine.I r3 = null;
        com.aide.engine.I r4 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 12: {
                    th = $ex3;
                    if (Hw == false) { $pc3 = 16; continue $sw3; }
                    abcd.wu.j6(th, -96783880885932968L, this);
                    $pc3 = 16; continue $sw3;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc3 = 19; continue $sw3; }
                    try {
                        abcd.wu.j6(-96783880885932968L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 12; continue $sw3;
                    }
                    $pc3 = 19; continue $sw3;
                }
                case 19: {
                    try {
                        this.VH.j6(this.v5);
                        r2 = this.v5;
                        r2.FH = this.v5.FH;
                        r3 = this.v5;
                        r3.Hw = this.v5.Hw;
                        r4 = this.v5;
                        r4.v5 = this.v5.v5;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.io.IOException) { $pc3 = 8; continue $sw3; }
                        $pc3 = 12; continue $sw3;
                    }
                    $pc3 = 10; continue $sw3;
                }
                case 10: {
                    return this.v5.v5;
                }
                case 8: {
                    e = $ex3;
                    try {
                        com.aide.common.ClassH.DW(e);
                        this.v5.Hw = 0;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 12; continue $sw3;
                    }
                    { $pc3 = 10; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
