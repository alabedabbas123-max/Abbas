package abcd;

class SG extends abcd.UH {
    long DW;
    long FH;
    private long Hw;
    abcd.aH j6;
    private abcd.yE v5;

    private static final class a extends abcd.SG {
        private a() {
        }

        a(abcd.SG.a r1) {
            this();
        }

        @Override
        public int DW() {
            return 0;
        }
    }

    SG() {
    }

    static abcd.SG j6(abcd.aH r1, long r2, long r4) {
        abcd.RG r0 = new abcd.RG();
        r0.j6 = r1;
        r0.DW = r2;
        r0.FH = r4;
        return r0;
    }

    static abcd.SG j6(abcd.aH r2, long r3, long r5, long r7) {
        abcd.SG.a r0 = new abcd.SG.a(null);
        r0.j6 = r2;
        r0.DW = r3;
        r0.FH = r5;
        ((abcd.SG) r0).Hw = r7;
        return r0;
    }

    static abcd.SG j6(abcd.aH r2, long r3, long r5, abcd.yE r7) {
        abcd.SG.a r0 = new abcd.SG.a(null);
        r0.j6 = r2;
        r0.DW = r3;
        r0.FH = r5;
        ((abcd.SG) r0).v5 = r7;
        return r0;
    }

    @Override
    public int FH() {
        return (int) java.lang.Math.min(this.FH, 2147483647L);
    }

    @Override
    public abcd.yE j6() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.v5 != null) { $pc0 = 11; continue $sw0; }
                    if (DW() != 0) { $pc0 = 11; continue $sw0; }
                    try {
                        this.v5 = this.j6.j6(this.Hw);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.io.IOException) { $pc0 = 8; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    return null;
                }
                case 11: {
                    return this.v5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
