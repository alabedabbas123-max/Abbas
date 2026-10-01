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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 6: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 10; continue $sw0; }
                    abcd.wu.j6(th, 463889657836474695L, this, r8, r9);
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 13; continue $sw0; }
                    try {
                        abcd.wu.j6(463889657836474695L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 6; continue $sw0;
                    }
                    return;
                }
                case 13: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 1435137692331835025L)
    public void onTabSelected(android.app.ActionBar.Tab r8, android.app.FragmentTransaction r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 9: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 13; continue $sw1; }
                    abcd.wu.j6(th, 828021646655041648L, this, r8, r9);
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(828021646655041648L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 9; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    if (com.aide.appwizard.runtime.AppWizardActivity.FH(this.FH) == null) { $pc1 = 16; continue $sw1; }
                    try {
                        com.aide.appwizard.runtime.AppWizardActivity.FH(this.FH).setCurrentItem(r8.getPosition());
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 9; continue $sw1;
                    }
                    return;
                }
                case 16: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -442026450550391252L)
    public void onTabUnselected(android.app.ActionBar.Tab r8, android.app.FragmentTransaction r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 6: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 10; continue $sw2; }
                    abcd.wu.j6(th, 194163761243824725L, this, r8, r9);
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc2 = 13; continue $sw2; }
                    try {
                        abcd.wu.j6(194163761243824725L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 6; continue $sw2;
                    }
                    return;
                }
                case 13: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
