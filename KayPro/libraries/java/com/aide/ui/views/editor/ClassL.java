package com.aide.ui.views.editor;

@abcd.Interfacexu
class ClassL extends java.util.TimerTask {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.views.editor.ClassM FH;

    static {
        abcd.wu.j6(com.aide.ui.views.editor.ClassL.class, 108167760189617513L, 1091102422121593416L);
    }

    ClassL(com.aide.ui.views.editor.ClassM r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 2355089538838750640L)
    public void run() {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, -934748103707175580L, this);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-934748103707175580L, this);     // Catch: java.lang.Throwable -> L14
    L7:
        if (com.aide.ui.views.editor.ClassM.j6(this.FH) == false) goto L21;
        com.aide.ui.views.editor.ClassM r2 = this.FH;     // Catch: java.lang.Throwable -> L14
        if (com.aide.ui.views.editor.ClassM.DW(this.FH) == true) goto L11;
        boolean r3 = true;
    L12:
        com.aide.ui.views.editor.ClassM.j6(r2, r3);     // Catch: java.lang.Throwable -> L14
        com.aide.ui.views.editor.ClassM.FH(this.FH).post(new com.aide.ui.views.editor.Runnablek(this));     // Catch: java.lang.Throwable -> L14
        return;
    L11:
        r3 = false;
        goto L12
    }
}
