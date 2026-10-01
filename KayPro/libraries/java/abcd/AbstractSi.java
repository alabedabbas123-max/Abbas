package abcd;

@abcd.Interfacexu
public abstract class AbstractSi<T extends Si<?>> {

    @abcd.Interfaceru(field = -3344617948668254421L)
    private static java.util.Map<java.lang.String, java.lang.Long> DW;

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;

    @abcd.Interfaceru(field = 1228273754641376112L)
    private static java.util.Map<java.lang.String, Si<?>> j6;
    public java.lang.String v5;

    static {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        abcd.wu.j6(abcd.AbstractSi.class, 839444887493871625L, 839444887493871625L);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    if (FH == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-3194633388059074720L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        j6 = new java.util.HashMap();
                        DW = new java.util.HashMap();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                case 8: {
                    th = $ex0;
                    if (Hw == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -3194633388059074720L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public AbstractSi() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (Hw == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, 2821760026110388885L, null);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(2821760026110388885L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract T DW(java.lang.String r1);

    public T j6(java.lang.String r8) {
        abcd.AbstractSi r2 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 19: {
                    th = $ex2;
                    if (Hw == false) { $pc2 = 23; continue $sw2; }
                    abcd.wu.j6(th, 7000091445372223072L, this, r8);
                    $pc2 = 23; continue $sw2;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc2 = 7; continue $sw2; }
                    try {
                        abcd.wu.j6(7000091445372223072L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 19; continue $sw2;
                    }
                    $pc2 = 7; continue $sw2;
                }
                case 7: {
                    if (j6.containsKey(r8) == true) { $pc2 = 9; continue $sw2; }
                    $pc2 = 24; continue $sw2;
                }
                case 24: {
                    try {
                        r2 = DW(r8);
                        r2.v5 = r8;
                        j6.put(r8, r2);
                        DW.put(r8, java.lang.Long.valueOf(new java.io.File(r8).lastModified()));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        if ($t instanceof java.lang.Exception) { $pc2 = 16; continue $sw2; }
                        $pc2 = 19; continue $sw2;
                    }
                    return r2;
                }
                case 16: {
                    e = $ex2;
                    try {
                        e.printStackTrace();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 19; continue $sw2;
                    }
                    return this;
                }
                case 9: {
                    if (DW.containsKey(r8) == false) { $pc2 = 24; continue $sw2; }
                    if (new java.io.File(r8).lastModified() != DW.get(r8).longValue()) { $pc2 = 24; continue $sw2; }
                    return j6.get(r8);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
