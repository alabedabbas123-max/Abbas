package abcd;

public class FF {
    private static final java.lang.InheritableThreadLocal<abcd.FF> DW = null;
    public static final java.util.Locale j6 = null;
    private final java.util.Locale FH;
    private final java.util.concurrent.ConcurrentHashMap<java.lang.Class, abcd.GF> Hw;

    static {
        j6 = new java.util.Locale("", "", "");
        DW = new abcd.EF();
    }

    private FF(java.util.Locale r2) {
        this.Hw = new java.util.concurrent.ConcurrentHashMap();
        this.FH = r2;
    }

    FF(java.util.Locale r1, abcd.FF r2) {
        this(r1);
    }

    private <T extends abcd.GF> T DW(java.lang.Class<T> r3) {
        T r0 = null;
        T r1 = null;
        T r4 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = (T) this.Hw.get(r3);
                    if (r0 != null) { $pc0 = 8; continue $sw0; }
                    r1 = (T) abcd.DF.j6(this.FH, r3);
                    r4 = (T) this.Hw.putIfAbsent(r3, r1);
                    if (r4 != null) { $pc0 = 7; continue $sw0; }
                    return r1;
                }
                case 7: {
                    return r4;
                }
                case 8: {
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static <T extends abcd.GF> T j6(java.lang.Class<T> r1) {
        return (T) DW.get().DW(r1);
    }
}
