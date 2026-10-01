package com.aide.appwizard;

@abcd.Interfacexu
class ViewOnClickListenerb implements android.view.View.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.appwizard.AppWizardDesignActivity FH;

    static {
        abcd.wu.j6(com.aide.appwizard.ViewOnClickListenerb.class, 2913940607094183125L, -4801949061737521743L);
    }

    ViewOnClickListenerb(com.aide.appwizard.AppWizardDesignActivity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 422404864575850176L)
    public void onClick(android.view.View r5) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -535812570207302256L, this, r5);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-535812570207302256L, this, r5);     // Catch: java.lang.Throwable -> L12
    L6:
        com.aide.appwizard.AppWizardDesignActivity r2 = this.FH;     // Catch: java.lang.Throwable -> L12
        if (this.FH.QX() == true) goto L9;
        boolean r3 = true;
    L10:
        com.aide.appwizard.AppWizardDesignActivity.j6(r2, r3);     // Catch: java.lang.Throwable -> L12
        return;
    L9:
        r3 = false;
        goto L10
    }
}
