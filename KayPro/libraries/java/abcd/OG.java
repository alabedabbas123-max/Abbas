package abcd;

class OG extends abcd.FE {
    private long DW;
    private final long FH;
    private final long Hw;
    private final abcd.GG VH;
    private final abcd.aH Zo;
    private int j6;
    private final int v5;

    OG(long r3, long r5, int r7, abcd.aH r8, abcd.GG r9) {
        this.j6 = -1;
        this.DW = -1;
        this.FH = r3;
        this.Hw = r5;
        this.v5 = r7;
        this.Zo = r8;
        this.VH = r9;
    }

    private abcd.yE Zo() {
        return this.Zo.j6(this.FH);
    }

    static abcd.GG j6(abcd.OG r0) {
        return r0.VH;
    }

    static java.io.InputStream j6(abcd.OG r0, abcd.wH r1) {
        return r0.j6(r1);
    }

    private java.io.InputStream j6(abcd.wH r7) {
        java.util.zip.InflaterInputStream r1 = null;
        abcd.FE r0 = null;
        abcd.NG r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r1 = new java.util.zip.InflaterInputStream(new abcd.jH(this.Zo, this.FH + ((long) this.v5), r7));
                    r0 = this.Zo.Hw(r7, this.Hw);
                    r2 = new abcd.NG(this, r1, r0, r7);
                    if (this.j6 != (-1)) { $pc0 = 9; continue $sw0; }
                    if ((r0 instanceof abcd.OG) == true) { $pc0 = 9; continue $sw0; }
                    this.j6 = r0.FH();
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if (this.DW != (-1)) { $pc0 = 11; continue $sw0; }
                    this.DW = r2.DW();
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    return r2;
                }
                case 13: {
                    return r7.FH(Zo()).v5();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public long DW() {
        abcd.wH r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (this.DW != (-1)) { $pc1 = 15; continue $sw1; }
                    r0 = new abcd.wH(this.VH);
                    try {
                        this.DW = abcd.AH.j6(this.Zo.j6(r0, this.FH + ((long) this.v5)));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.io.IOException) { $pc1 = 9; continue $sw1; }
                        if ($t instanceof java.lang.Throwable) { $pc1 = 16; continue $sw1; }
                        $pc1 = 7; continue $sw1;
                    }
                    $pc1 = 17; continue $sw1;
                }
                case 17: {
                    { $pc1 = 13; continue $sw1; }
                }
                case 7: {
                    th = $ex1;
                    r0.FH();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 9: {
                    try {
                        this.DW = r0.FH(Zo()).DW();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    r0.FH();
                    $pc1 = 15; continue $sw1;
                }
                case 15: {
                    return this.DW;
                }
                case 16: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public int FH() {
        abcd.wH r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this.j6 != (-1)) { $pc2 = 14; continue $sw2; }
                    r0 = new abcd.wH(this.VH);
                    try {
                        this.j6 = this.Zo.FH(r0, this.FH);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 9; continue $sw2; }
                        $pc2 = 7; continue $sw2;
                    }
                    $pc2 = 16; continue $sw2;
                }
                case 16: {
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    th = $ex2;
                    r0.FH();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 9: {
                    try {
                        this.j6 = r0.FH(Zo()).FH();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.io.IOException) { $pc2 = 15; continue $sw2; }
                        $pc2 = 7; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    r0.FH();
                    $pc2 = 14; continue $sw2;
                }
                case 14: {
                    return this.j6;
                }
                case 15: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean Hw() {
        return true;
    }

    @Override
    public byte[] j6() {
        abcd.cD r1 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 4: {
                    e = $ex3;
                    r1 = new abcd.cD();
                    r1.initCause(e);
                    throw r1;
                }
                case 3: {
                    try {
                        throw new abcd.cD(Zo());
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.io.IOException) { $pc3 = 4; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.JE v5() {
        abcd.yE r9 = null;
        abcd.wH r7 = null;
        abcd.FE r0 = null;
        java.io.BufferedInputStream r1 = null;
        int r2 = 0;
        long r3 = 0L;
        abcd.YG r6 = null;
        java.io.File r8 = null;
        java.util.zip.DeflaterOutputStream r4 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r9 = Zo();
                    r7 = new abcd.wH(this.VH);
                    r0 = this.VH.FH(r7, r9.we(), r9);
                    if (r0 != null) { $pc4 = 5; continue $sw4; }
                    r1 = new java.io.BufferedInputStream(j6(r7), 8192);
                    r2 = FH();
                    r3 = DW();
                    r6 = this.VH.Hw();
                    r8 = r6.Zo();
                    r4 = r6.j6(new java.io.FileOutputStream(r8));
                    r6.j6(r4, r2, r3);
                    return new abcd.MG(this, r2, r3, new abcd.ZK(r1, r4), r6, r7, r8, r9);
                }
                case 5: {
                    return r0.v5();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
