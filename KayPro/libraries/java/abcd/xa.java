package abcd;

@abcd.Interfacexu
class xa extends abcd.za.d {

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;

    @abcd.Interfacevu
    final abcd.za v5;

    static {
        abcd.wu.j6(abcd.xa.class, -138465097617559095L, -6266881370596813027L);
    }

    xa(abcd.za r1) {
        this.v5 = r1;
        super(null);
    }

    @Override
    @abcd.Interfacesu(method = 1459063639956626340L)
    protected void FH(java.lang.String r5) {
    L12:
        th = move-exception;
        if (Hw == false) goto L16;
        abcd.wu.j6(th, -8092432158135002424L, this, r5);
    L16:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(-8092432158135002424L, this, r5);     // Catch: java.lang.Throwable -> L12
    L7:
        if (r5.toUpperCase(java.util.Locale.US).endsWith(".CLASS") == false) goto L9;
    L10:
        new java.io.File(r5).delete();     // Catch: java.lang.Throwable -> L12
        return;
    L9:
        if (r5.toUpperCase(java.util.Locale.US).endsWith(".DEX") == true) goto L10;
    }
}
