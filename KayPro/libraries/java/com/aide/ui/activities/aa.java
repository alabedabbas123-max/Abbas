package com.aide.ui.activities;

@abcd.Interfacexu
class aa implements android.view.View.OnFocusChangeListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.support.v4.widget.DrawerLayout FH;

    @abcd.Interfacevu
    final com.aide.ui.activities.TrainerCourseActivity Hw;

    static {
        abcd.wu.j6(com.aide.ui.activities.aa.class, 3404442532748635224L, -1331471971261592167L);
    }

    aa(com.aide.ui.activities.TrainerCourseActivity r1, android.support.v4.widget.DrawerLayout r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -4039329949657071501L)
    public void onFocusChange(android.view.View r8, boolean r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 9: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 13; continue $sw0; }
                    abcd.wu.j6(th, 4802211412874791428L, this, r8, new java.lang.Boolean(r9));
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(4802211412874791428L, this, r8, new java.lang.Boolean(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 9; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (this.FH.Zo(3) == true) { $pc0 = 16; continue $sw0; }
                    try {
                        com.aide.ui.activities.TrainerCourseActivity.j6(this.Hw);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 9; continue $sw0;
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
}
