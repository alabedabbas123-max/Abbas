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
        abcd.wu.j6(abcd.AbstractSi.class, 839444887493871625L, 839444887493871625L);     // Catch: java.lang.Throwable -> L8
        if (FH == false) goto L6;
        abcd.wu.j6(-3194633388059074720L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = new java.util.HashMap();     // Catch: java.lang.Throwable -> L8
        DW = new java.util.HashMap();     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -3194633388059074720L, null);
    L12:
        throw th;
    }

    public AbstractSi() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 2821760026110388885L, null);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(2821760026110388885L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    protected abstract T DW(java.lang.String r1);

    public T j6(java.lang.String r8) {
    L19:
        th = move-exception;
        if (Hw == false) goto L23;
        abcd.wu.j6(th, 7000091445372223072L, this, r8);
    L23:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(7000091445372223072L, this, r8);     // Catch: java.lang.Throwable -> L19
    L7:
        if (j6.containsKey(r8) == true) goto L9;
    L24:
        abcd.AbstractSi r2 = DW(r8);     // Catch: java.lang.Exception -> L16 java.lang.Throwable -> L19
        r2.v5 = r8;     // Catch: java.lang.Exception -> L16 java.lang.Throwable -> L19
        j6.put(r8, r2);     // Catch: java.lang.Exception -> L16 java.lang.Throwable -> L19
        DW.put(r8, java.lang.Long.valueOf(new java.io.File(r8).lastModified()));     // Catch: java.lang.Exception -> L16 java.lang.Throwable -> L19
        return r2;
    L16:
        e = move-exception;
        e.printStackTrace();     // Catch: java.lang.Throwable -> L19
        return this;
    L9:
        if (DW.containsKey(r8) == false) goto L24;
        if (new java.io.File(r8).lastModified() != DW.get(r8).longValue()) goto L24;
        return j6.get(r8);
    }
}
