package com.aide.appwizard;

@abcd.Interfacexu
class ViewOnClickListenerd implements android.view.View.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.appwizard.AppWizardDesignActivity FH;

    static {
        abcd.wu.j6(com.aide.appwizard.ViewOnClickListenerd.class, 2913940607094183125L, -4802217816446445235L);
    }

    ViewOnClickListenerd(com.aide.appwizard.AppWizardDesignActivity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 377310466869491751L)
    public void onClick(android.view.View r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -4885714396996637904L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4885714396996637904L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.appwizard.AppWizardDesignActivity.DW(this.FH).Hw();     // Catch: java.lang.Throwable -> L8
    }
}
