package com.aide.ui.views.editor;

@abcd.Interfacexu
class B extends com.aide.ui.views.editor.AbstractRunnablei {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    @abcd.Interfacevu
    final com.aide.ui.views.editor.OConsole gn;

    static {
        abcd.wu.j6(com.aide.ui.views.editor.B.class, -262237004818676723L, 3467408212391585120L);
    }

    B(com.aide.ui.views.editor.OConsole r1) {
        this.gn = r1;
    }

    @Override
    @abcd.Interfacesu(method = -3331402596227700672L)
    public void FH() {
    L10:
        th = move-exception;
        if (VH == false) goto L14;
        abcd.wu.j6(th, -5843900254386291200L, this);
    L14:
        throw th;
    L4:
        if (Zo == false) goto L7;
        abcd.wu.j6(-5843900254386291200L, this);     // Catch: java.lang.Throwable -> L10
    L7:
        if (this.gn.isShown() == false) goto L17;
        this.gn.requestLayout();     // Catch: java.lang.Throwable -> L10
        com.aide.ui.views.editor.OConsole.j6(this.gn);     // Catch: java.lang.Throwable -> L10
        return;
    }
}
