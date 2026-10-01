package com.aide.ui;

@abcd.Interfacexu
class db implements android.content.DialogInterface.OnShowListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;

    @abcd.Interfacevu
    final com.aide.ui.hb Hw;

    static {
        abcd.wu.j6(com.aide.ui.db.class, -1144715414290518888L, 5656184466746339040L);
    }

    db(com.aide.ui.hb r1, android.app.Activity r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 655390568105464912L)
    public void onShow(android.content.DialogInterface r7) {
        android.view.View r2 = null;
        android.view.View r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 13: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 17; continue $sw0; }
                    abcd.wu.j6(th, 878948551058042520L, this, r7);
                    $pc0 = 17; continue $sw0;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(878948551058042520L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = com.aide.ui.hb.j6(this.Hw).findViewById(this.FH.getResources().getIdentifier("android:id/title_template", null, null));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    if (r2 == null) { $pc0 = 9; continue $sw0; }
                    try {
                        r2.setBackgroundColor(-1);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    try {
                        r3 = com.aide.ui.hb.j6(this.Hw).findViewById(this.FH.getResources().getIdentifier("android:id/alertTitle", null, null));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    if ((r3 instanceof android.widget.TextView) == false) { $pc0 = 20; continue $sw0; }
                    try {
                        ((android.widget.TextView) r3).setTextColor(-4473925);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 13; continue $sw0;
                    }
                    return;
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
