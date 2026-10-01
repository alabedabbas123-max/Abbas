package com.aide.appwizard;

@abcd.Interfacexu
class ViewOnClickListenerc implements android.view.View.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.appwizard.AppWizardDesignActivity FH;

    static {
        abcd.wu.j6(com.aide.appwizard.ViewOnClickListenerc.class, 2913940607094183125L, -4802083439094015136L);
    }

    ViewOnClickListenerc(com.aide.appwizard.AppWizardDesignActivity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 14354448739887104L)
    public void onClick(android.view.View r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2460680848828416799L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2460680848828416799L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.appwizard.AppWizardDesignActivity.j6(this.FH).j6();     // Catch: java.lang.Throwable -> L8
    }
}
