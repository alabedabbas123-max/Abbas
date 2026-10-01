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
        T r0 = (T) this.Hw.get(r3);
        if (r0 != null) goto L8;
        T r1 = (T) abcd.DF.j6(this.FH, r3);
        T r4 = (T) this.Hw.putIfAbsent(r3, r1);
        if (r4 != null) goto L7;
        return r1;
    L7:
        return r4;
    L8:
        return r0;
    }

    public static <T extends abcd.GF> T j6(java.lang.Class<T> r1) {
        return (T) DW.get().DW(r1);
    }
}
