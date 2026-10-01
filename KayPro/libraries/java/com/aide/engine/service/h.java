package com.aide.engine.service;

@abcd.Interfacexu
class h implements com.aide.engine.Interfacea {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.engine.service.m FH;
    final com.aide.engine.service.l Hw;

    static {
        abcd.wu.j6(com.aide.engine.service.h.class, 2006115082471780797L, 1368956332848887277L);
    }

    h(com.aide.engine.service.l r1, com.aide.engine.service.m r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 3922418246167969815L)
    public void VH(boolean r5) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -2704888140872914048L, this, new java.lang.Boolean(r5));
    L15:
        throw th;
    L4:
        if (j6 == false) goto L16;
        abcd.wu.j6(-2704888140872914048L, this, r5);     // Catch: java.lang.Throwable -> L11
    L16:
        this.FH.VH(r5);     // Catch: android.os.RemoteException -> L8 java.lang.Throwable -> L11
    L20:
        return;
    L8:
        e = move-exception;
        com.aide.common.ClassH.DW(e);     // Catch: java.lang.Throwable -> L11
    }

    @Override
    @abcd.Interfacesu(method = -2901379604506166601L)
    public void j6() {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 75389976675091700L, this);
    L11:
        throw th;
    L4:
        if (j6 == false) goto L14;
        abcd.wu.j6(75389976675091700L, this);     // Catch: java.lang.Throwable -> L7
        return;
    }

    @Override
    @abcd.Interfacesu(method = 1573320024123382584L)
    public void j6(java.io.IOException r5) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -492438592167743455L, this, r5);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L18;
        abcd.wu.j6(-492438592167743455L, this, r5);     // Catch: java.lang.Throwable -> L11
    L18:
        this.FH.Zo(r5.getMessage());     // Catch: android.os.RemoteException -> L8 java.lang.Throwable -> L11
    L20:
        return;
    L8:
        e = move-exception;
        com.aide.common.ClassH.DW(e);     // Catch: java.lang.Throwable -> L11
    }

    @Override
    @abcd.Interfacesu(method = 552211874479699347L)
    public void j6(java.util.Set<java.lang.String> r8, java.util.Map<java.lang.String, byte[]> r9) {
    L6:
        th = move-exception;
        if (DW == false) goto L10;
        abcd.wu.j6(th, 5203260692578726488L, this, r8, r9);
    L10:
        throw th;
    L3:
        if (j6 == false) goto L13;
        abcd.wu.j6(5203260692578726488L, this, r8, r9);     // Catch: java.lang.Throwable -> L6
        return;
    }

    @Override
    @abcd.Interfacesu(method = -1783120922091719928L)
    public void j6(java.util.Set<java.lang.String> r9, java.util.Set<java.lang.String> r10, java.util.Map<java.lang.String, java.lang.String> r11) {
    L6:
        th = move-exception;
        if (DW == false) goto L10;
        abcd.wu.j6(th, -890763423036739021L, this, r9, r10, r11);
    L10:
        throw th;
    L3:
        if (j6 == false) goto L13;
        abcd.wu.j6(-890763423036739021L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L6
        return;
    }
}
