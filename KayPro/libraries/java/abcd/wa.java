package abcd;

@abcd.Interfacexu
class wa extends abcd.za.d {

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;

    @abcd.Interfacevu
    final abcd.za Zo;
    final java.lang.String v5;

    static {
        abcd.wu.j6(abcd.wa.class, -138465097617559095L, -6266770808682746200L);
    }

    wa(abcd.za r1, java.lang.String r2) {
        this.Zo = r1;
        this.v5 = r2;
        super(null);
    }

    @Override
    @abcd.Interfacesu(method = -2704588980197683563L)
    protected void DW(java.lang.String r5) {
    L11:
        th = move-exception;
        if (Hw == false) goto L15;
        abcd.wu.j6(th, -197586489804212497L, this, r5);
    L15:
        throw th;
    L4:
        if (FH == false) goto L19;
        abcd.wu.j6(-197586489804212497L, this, r5);     // Catch: java.lang.Throwable -> L11
    L19:
        new java.io.File(r5).getAbsolutePath();     // Catch: java.io.IOException -> L16 java.lang.Throwable -> L11
        if (new java.io.File(r5).getCanonicalPath().equals(this.v5) == false) goto L9;
        return;
    L9:
        new java.io.File(r5).delete();     // Catch: java.io.IOException -> L16 java.lang.Throwable -> L11
        return;
    }

    @Override
    @abcd.Interfacesu(method = 52700490146919312L)
    protected void FH(java.lang.String r5) {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 89075701794184155L, this, r5);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(89075701794184155L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        new java.io.File(r5).delete();     // Catch: java.lang.Throwable -> L8
    }
}
