package abcd;

class ZH extends abcd.RK.d {
    private final java.lang.String EQ;
    private final java.lang.String VH;
    final abcd._H Zo;
    private final java.lang.String gn;
    private final abcd.LE tp;
    private final java.security.MessageDigest u7;

    ZH(abcd._H r1, java.lang.String r2, java.lang.String r3, java.security.MessageDigest r4, abcd.LE r5, java.lang.String r6) {
        this.Zo = r1;
        this.VH = r2;
        this.gn = r3;
        this.u7 = r4;
        this.tp = r5;
        this.EQ = r6;
    }

    @Override
    public void close() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    super.close();
                    try {
                        abcd._H.j6(this.Zo, this.VH, this.gn, this.u7.digest(), this, this.tp, this.EQ);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 6; continue $sw0;
                    }
                    j6();
                    return;
                }
                case 6: {
                    th = $ex0;
                    j6();
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
