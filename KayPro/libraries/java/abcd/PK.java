package abcd;

class PK extends abcd.QK {
    private volatile java.lang.String FH;

    PK() {
    }

    @Override
    public abcd.FG DW(abcd.gE r5, abcd.AbstractpK r6) {
        return new abcd.FG(r5, new java.io.File(r6.Zo(), ".gitconfig"), r6);
    }

    @Override
    public java.lang.String DW() {
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.FH != null) { $pc0 = 15; continue $sw0; }
                    try {
                        this.FH = java.net.InetAddress.getLocalHost().getCanonicalHostName();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.net.UnknownHostException) { $pc0 = 6; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    if (abcd.QK.DW == true) { $pc0 = 15; continue $sw0; }
                    if (this.FH != null) { $pc0 = 15; continue $sw0; }
                    throw new java.lang.AssertionError();
                }
                case 6: {
                    this.FH = "localhost";
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    return this.FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String DW(java.lang.String r1) {
        return java.lang.System.getenv(r1);
    }

    @Override
    public int j6(long r2) {
        return Hw().getOffset(r2) / 60000;
    }

    @Override
    public long j6() {
        return java.lang.System.currentTimeMillis();
    }

    @Override
    public abcd.FG j6(abcd.gE r3, abcd.AbstractpK r4) {
        java.io.File r0 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    r0 = r4.FH();
                    if (r0 != null) { $pc1 = 7; continue $sw1; }
                    return new abcd.OK(this, null, r4);
                }
                case 7: {
                    return new abcd.FG(r3, r4.j6(r4.j6(r0, "etc"), "gitconfig"), r4);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public java.lang.String j6(java.lang.String r1) {
        return java.lang.System.getProperty(r1);
    }
}
