package com.aide.ui.trainer;

@abcd.Interfacexu
class f implements java.util.Comparator<com.aide.ui.trainer.g.a> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.trainer.g FH;

    static {
        abcd.wu.j6(com.aide.ui.trainer.f.class, -993302590746004176L, -1402165132050376295L);
    }

    f(com.aide.ui.trainer.g r1) {
        this.FH = r1;
    }

    @Override
    public int compare(com.aide.ui.trainer.g.a r1, com.aide.ui.trainer.g.a r2) {
        return j6(r1, r2);
    }

    @abcd.Interfacesu(method = 358588286953115584L)
    public int j6(com.aide.ui.trainer.g.a r8, com.aide.ui.trainer.g.a r9) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 889594008419192700L, this, r8, r9);
    L12:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(889594008419192700L, this, r8, r9);     // Catch: java.lang.Throwable -> L8
    L5:
        return r8.u7() - r9.u7();
    }
}
