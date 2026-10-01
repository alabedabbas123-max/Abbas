package abcd;

public class tE {
    private static int DW;
    private static final java.util.zip.Inflater[] j6 = null;

    static {
        j6 = new java.util.zip.Inflater[4];
    }

    private static synchronized java.util.zip.Inflater DW() {
        java.util.zip.Inflater[] r1 = null;
        int r3 = 0;
        java.util.zip.Inflater r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    monitor-enter(abcd.tE.class);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    th = $ex0;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 5: {
                    if (DW <= 0) { $pc0 = 9; continue $sw0; }
                    try {
                        r1 = j6;
                        r3 = DW - 1;
                        DW = r3;
                        r2 = r1[r3];
                        j6[DW] = null;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    monitor-exit(abcd.tE.class);
                    return r2;
                }
                case 9: {
                    monitor-exit(abcd.tE.class);
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static synchronized boolean DW(java.util.zip.Inflater r4) {
        java.util.zip.Inflater[] r1 = null;
        int r2 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    monitor-enter(abcd.tE.class);
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    th = $ex1;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 5: {
                    if (DW >= 4) { $pc1 = 10; continue $sw1; }
                    try {
                        r1 = j6;
                        r2 = DW;
                        DW = r2 + 1;
                        r1[r2] = r4;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 13; continue $sw1;
                    }
                    monitor-exit(abcd.tE.class);
                    return false;
                }
                case 10: {
                    monitor-exit(abcd.tE.class);
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.util.zip.Inflater j6() {
        java.util.zip.Inflater r0 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = DW();
                    if (r0 == null) { $pc2 = 6; continue $sw2; }
                    return r0;
                }
                case 6: {
                    return new abcd.XD();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(java.util.zip.Inflater r1) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r1 == null) { $pc3 = 7; continue $sw3; }
                    r1.reset();
                    if (DW(r1) == false) { $pc3 = 8; continue $sw3; }
                    ((abcd.XD) r1).j6();
                    return;
                }
                case 8: {
                    return;
                }
                case 7: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
