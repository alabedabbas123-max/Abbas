package com.aide.appwizard.runtime;

@abcd.Interfacexu
class e extends android.support.v4.view.ViewPager.h {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.appwizard.runtime.AppWizardActivity FH;

    static {
        abcd.wu.j6(com.aide.appwizard.runtime.e.class, 4889396902212038425L, 1275474047245066104L);
    }

    e(com.aide.appwizard.runtime.AppWizardActivity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 4228472273399135L)
    public void DW(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 458501099237860000L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(458501099237860000L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.getActionBar().setSelectedNavigationItem(r5);     // Catch: java.lang.Throwable -> L8
    }
}
