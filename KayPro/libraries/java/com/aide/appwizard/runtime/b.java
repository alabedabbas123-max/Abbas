package com.aide.appwizard.runtime;

@abcd.Interfacexu
class b implements android.view.View.OnSystemUiVisibilityChangeListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.appwizard.runtime.AppWizardActivity FH;

    static {
        abcd.wu.j6(com.aide.appwizard.runtime.b.class, 4889396902212038425L, 1275389846248850589L);
    }

    b(com.aide.appwizard.runtime.AppWizardActivity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -2853826181146614912L)
    public void onSystemUiVisibilityChange(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 733485695407567424L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(733485695407567424L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.getWindow().getDecorView().setSystemUiVisibility(4);     // Catch: java.lang.Throwable -> L8
    }
}
