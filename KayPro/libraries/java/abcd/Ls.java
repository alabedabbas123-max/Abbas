package abcd;

public final class Ls extends abcd.hu implements abcd.Interfacens {
    private final abcd.Abstractms[] DW;

    public Ls(int r3) {
        boolean r1 = false;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r3 <= 1) { $pc0 = 5; continue $sw0; }
                    r1 = true;
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    super(r1);
                    if (r3 < 1) { $pc0 = 11; continue $sw0; }
                    this.DW = new abcd.Abstractms[r3];
                    return;
                }
                case 11: {
                    throw new java.lang.IllegalArgumentException("size < 1");
                }
                case 5: {
                    r1 = false;
                    { $pc0 = 6; continue $sw0; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static abcd.Abstractms FH(int r3) {
        throw new abcd.Vt("invalid constant pool index " + abcd.Yt.v5(r3));
    }

    public abcd.Abstractms DW(int r2) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    return this.DW[r2];
                }
                case 4: {
                    FH(r2);
                    throw null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.Abstractms get(int r3) {
        abcd.Abstractms r1 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    try {
                        r1 = this.DW[r3];
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.IndexOutOfBoundsException) { $pc2 = 8; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r1 == null) { $pc2 = 6; continue $sw2; }
                    return r1;
                }
                case 6: {
                    try {
                        FH(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.IndexOutOfBoundsException) { $pc2 = 8; continue $sw2; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    throw null;
                }
                case 8: {
                    FH(r3);
                    throw null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public abcd.Abstractms j6(int r1) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r1 != 0) { $pc3 = 6; continue $sw3; }
                    return null;
                }
                case 6: {
                    return get(r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(int r5, abcd.Abstractms r6) {
        boolean r1 = false;
        abcd.Abstractms[] r2 = null;
        abcd.Abstractms[] r0 = null;
        int r3 = 0;
        abcd.Abstractms r4 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    J8();
                    if (r6 != null) { $pc4 = 5; continue $sw4; }
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    r1 = false;
                    $pc4 = 8; continue $sw4;
                }
                case 8: {
                    if (r5 < 1) { $pc4 = 27; continue $sw4; }
                    if (r1 == false) { $pc4 = 16; continue $sw4; }
                    r2 = this.DW;
                    if (r5 == (r2.length - 1)) { $pc4 = 15; continue $sw4; }
                    r2[r5 + 1] = null;
                    { $pc4 = 16; continue $sw4; }
                }
                case 15: {
                    throw new java.lang.IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                }
                case 16: {
                    if (r6 == null) { $pc4 = 24; continue $sw4; }
                    r0 = this.DW;
                    if (r0[r5] != null) { $pc4 = 24; continue $sw4; }
                    r3 = r5 - 1;
                    r4 = r0[r3];
                    if (r4 == null) { $pc4 = 24; continue $sw4; }
                    if (r4.Hw() == false) { $pc4 = 24; continue $sw4; }
                    this.DW[r3] = null;
                    $pc4 = 24; continue $sw4;
                }
                case 24: {
                    this.DW[r5] = r6;
                    return;
                }
                case 27: {
                    throw new java.lang.IllegalArgumentException("n < 1");
                }
                case 5: {
                    if (r6.Hw() == false) { $pc4 = 7; continue $sw4; }
                    r1 = true;
                    { $pc4 = 8; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
