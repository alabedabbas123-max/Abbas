package abcd;

@abcd.Interfacexu
public abstract class Abstractrc {

    @abcd.Interfaceru(field = 3743171931245145259L)
    private static abcd.Abstractrc DW;

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;

    @abcd.Interfaceru(field = 1035069477755027961L)
    private static java.lang.Object j6;

    static {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        abcd.wu.j6(abcd.Abstractrc.class, 3508908880632874191L, 3508908880632874191L);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    if (FH == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(1759397294414490576L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        j6 = new java.lang.Object();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                case 8: {
                    th = $ex0;
                    if (Hw == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 1759397294414490576L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public Abstractrc() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (Hw == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, 4744417128173355776L, null);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(4744417128173355776L, null);
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

    public static abcd.Abstractrc j6() {
        synchronized (j6) {
            java.lang.Object r3 = null;
            abcd.Abstractrc r4 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = 4;
            $sw2: while (true) {
                switch ($pc2) {
                    case 14: {
                        th = $ex2;
                        if (Hw == false) { $pc2 = 18; continue $sw2; }
                        abcd.wu.j6(th, -3631764667306789755L, null);
                        $pc2 = 18; continue $sw2;
                    }
                    case 18: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (FH == false) { $pc2 = 6; continue $sw2; }
                        try {
                            abcd.wu.j6(-3631764667306789755L, null);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 14; continue $sw2;
                        }
                        $pc2 = 6; continue $sw2;
                    }
                    case 6: {
                        try {
                            r3 = j6;
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 14; continue $sw2;
                        }
                        try {
                            r4 = DW;
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 11; continue $sw2;
                        }
                        return r4;
                    }
                    case 11: {
                        th = $ex2;
                        try {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 14; continue $sw2;
                        }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    public abstract java.lang.Thread j6(java.lang.ThreadGroup r1, java.lang.Runnable r2, java.lang.String r3, long r4);
}
