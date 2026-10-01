package com.aide.common;

@abcd.Interfacexu
class ViewOnClickListenere implements android.view.View.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.widget.Spinner FH;
    final android.app.ActionBar Hw;

    @abcd.Interfacevu
    final com.aide.common.Runnablef v5;

    static {
        abcd.wu.j6(com.aide.common.ViewOnClickListenere.class, -5719469610590790156L, 7835098199013958752L);
    }

    ViewOnClickListenere(com.aide.common.Runnablef r1, android.widget.Spinner r2, android.app.ActionBar r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = -607949149793948703L)
    public void onClick(android.view.View r8) {
        android.widget.PopupMenu r2 = null;
        android.view.Menu r3 = null;
        int r5 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 12: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 17; continue $sw0; }
                    abcd.wu.j6(th, -3758391342628997560L, this, r8);
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-3758391342628997560L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = new android.widget.PopupMenu(this.v5.FH, this.FH);
                        r3 = r2.getMenu();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    r5 = 0;
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    if (r5 >= this.Hw.getTabCount()) { $pc0 = 10; continue $sw0; }
                    try {
                        r3.add(0, r5, 0, this.Hw.getTabAt(r5).getText());
                        r5 = r5 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    { $pc0 = 8; continue $sw0; }
                }
                case 10: {
                    try {
                        r2.setOnMenuItemClickListener(new com.aide.common.ClassD(this));
                        r2.show();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
