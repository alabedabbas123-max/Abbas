package com.aide.appwizard.runtime;

@abcd.Interfacexu
class f implements android.app.ActionBar.TabListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.appwizard.runtime.AppWizardActivity FH;

    static {
        abcd.wu.j6(com.aide.appwizard.runtime.f.class, 4889396902212038425L, 1275502114251931197L);
    }

    f(com.aide.appwizard.runtime.AppWizardActivity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 295589066475956928L)
    public void onTabReselected(android.app.ActionBar.Tab r8, android.app.FragmentTransaction r9) {
    L6:
        th = move-exception;
        if (DW == false) goto L10;
        abcd.wu.j6(th, 463889657836474695L, this, r8, r9);
    L10:
        throw th;
    L3:
        if (j6 == false) goto L13;
        abcd.wu.j6(463889657836474695L, this, r8, r9);     // Catch: java.lang.Throwable -> L6
        return;
    }

    @Override
    @abcd.Interfacesu(method = 1435137692331835025L)
    public void onTabSelected(android.app.ActionBar.Tab r8, android.app.FragmentTransaction r9) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, 828021646655041648L, this, r8, r9);
    L13:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(828021646655041648L, this, r8, r9);     // Catch: java.lang.Throwable -> L9
    L6:
        if (com.aide.appwizard.runtime.AppWizardActivity.FH(this.FH) == null) goto L16;
        com.aide.appwizard.runtime.AppWizardActivity.FH(this.FH).setCurrentItem(r8.getPosition());     // Catch: java.lang.Throwable -> L9
        return;
    }

    @Override
    @abcd.Interfacesu(method = -442026450550391252L)
    public void onTabUnselected(android.app.ActionBar.Tab r8, android.app.FragmentTransaction r9) {
    L6:
        th = move-exception;
        if (DW == false) goto L10;
        abcd.wu.j6(th, 194163761243824725L, this, r8, r9);
    L10:
        throw th;
    L3:
        if (j6 == false) goto L13;
        abcd.wu.j6(194163761243824725L, this, r8, r9);     // Catch: java.lang.Throwable -> L6
        return;
    }
}
