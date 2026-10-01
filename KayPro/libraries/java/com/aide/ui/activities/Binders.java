package com.aide.ui.activities;

@abcd.Interfacexu
class Binders extends com.aide.engine.service.r.a {

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;

    @abcd.Interfacevu
    final com.aide.ui.activities.GotoBrowserActivity v5;

    static {
        abcd.wu.j6(com.aide.ui.activities.Binders.class, -667729815873843261L, 3104761253864004480L);
    }

    Binders(com.aide.ui.activities.GotoBrowserActivity r1) {
        this.v5 = r1;
    }

    @Override
    @abcd.Interfacesu(method = 5309698220497313201L)
    public void Hw(java.lang.String r5) {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -804868531923086595L, this, r5);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-804868531923086595L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.v5.runOnUiThread(new com.aide.ui.activities.Runnablep(this));     // Catch: java.lang.Throwable -> L8
    }

    @Override
    @abcd.Interfacesu(method = -1952466175485904680L)
    public void j6(com.aide.engine.SourceEntity r5) {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -1674852924305127600L, this, r5);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-1674852924305127600L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.v5.runOnUiThread(new com.aide.ui.activities.r(this, r5));     // Catch: java.lang.Throwable -> L8
    }

    @Override
    @abcd.Interfacesu(method = -2736941365033543083L)
    public void j6(java.lang.String r8, java.util.List r9) {
    L7:
        th = move-exception;
        if (Hw == false) goto L11;
        abcd.wu.j6(th, -4856570968139944599L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(-4856570968139944599L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        this.v5.runOnUiThread(new com.aide.ui.activities.Runnableq(this, r9, r8));     // Catch: java.lang.Throwable -> L7
    }
}
