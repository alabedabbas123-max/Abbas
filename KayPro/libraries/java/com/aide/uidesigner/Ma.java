package com.aide.uidesigner;

@abcd.Interfacexu
class Ma extends com.aide.common.ClassN {

    @abcd.Interfacetu
    private static boolean gn;

    @abcd.Interfaceuu
    private static boolean u7;

    @abcd.Interfacevu
    final com.aide.uidesigner.Pa tp;

    static {
        abcd.wu.j6(com.aide.uidesigner.Ma.class, -1505387028266607057L, 1578043037330491600L);
    }

    Ma(com.aide.uidesigner.Pa r1, android.content.Context r2, android.view.View r3) {
        this.tp = r1;
        super(r2, r3);
    }

    @Override
    @abcd.Interfacesu(method = 3403041409525994265L)
    protected void j6() {
    L12:
        th = move-exception;
        if (u7 == false) goto L16;
        abcd.wu.j6(th, 3208516725554976792L, this);
    L16:
        throw th;
    L4:
        if (gn == false) goto L7;
        abcd.wu.j6(3208516725554976792L, this);     // Catch: java.lang.Throwable -> L12
    L7:
        if (com.aide.uidesigner.Pa.j6(this.tp) == true) goto L9;
        return;
    L9:
        if (this.tp.tp() == true) goto L20;
        this.tp.we();     // Catch: java.lang.Throwable -> L12
        return;
    }
}
