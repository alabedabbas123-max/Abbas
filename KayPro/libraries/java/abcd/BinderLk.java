package abcd;

@abcd.Interfacexu
class BinderLk extends com.aide.engine.service.s.a {

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;

    @abcd.Interfacevu
    final abcd.Nk v5;

    static {
        abcd.wu.j6(abcd.BinderLk.class, -87904726456966265L, 554937690635364480L);
    }

    BinderLk(abcd.Nk r1) {
        this.v5 = r1;
    }

    @Override
    @abcd.Interfacesu(method = 792450795134967057L)
    public void DW(com.aide.engine.FileHighlightings r5) {
    L10:
        th = move-exception;
        if (Hw == false) goto L14;
        abcd.wu.j6(th, 5853831219500207107L, this, r5);
    L14:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(5853831219500207107L, this, r5);     // Catch: java.lang.Throwable -> L10
    L6:
        abcd.Nk.a r2 = this.v5.DW(r5.FH);     // Catch: java.lang.Throwable -> L10
        if (r2 == null) goto L17;
        r2.DW(r5);     // Catch: java.lang.Throwable -> L10
        return;
    }

    @Override
    @abcd.Interfacesu(method = 2297041829484256296L)
    public void j6(com.aide.engine.FileHighlightings r5) {
    L16:
        th = move-exception;
        if (Hw == false) goto L21;
        abcd.wu.j6(th, -1837750657338508176L, this, r5);
    L21:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(-1837750657338508176L, this, r5);     // Catch: java.lang.Throwable -> L16
    L7:
        if (r5.tp <= 0) goto L12;
        java.util.Iterator r2 = abcd.Nk.j6(this.v5).iterator();     // Catch: java.lang.Throwable -> L16
    L10:
        if (r2.hasNext() == false) goto L26;
        ((abcd.Nk.c) r2.next()).j6(r5);     // Catch: java.lang.Throwable -> L16
        goto L10
    L26:
        return;
    L12:
        abcd.Nk.a r3 = this.v5.DW(r5.FH);     // Catch: java.lang.Throwable -> L16
        if (r3 == null) goto L25;
        r3.j6(r5);     // Catch: java.lang.Throwable -> L16
        return;
    }
}
