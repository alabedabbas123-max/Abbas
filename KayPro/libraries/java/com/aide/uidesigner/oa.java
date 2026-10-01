package com.aide.uidesigner;

@abcd.Interfacexu
class oa implements com.aide.uidesigner.Ka.c {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.uidesigner.oa.class, -6184905212679667120L, 70615866454258857L);
    }

    oa() {
    }

    @Override
    @abcd.Interfacesu(method = 631023396789780095L)
    public android.view.View j6(android.content.Context r8) {
        android.widget.SeekBar r2 = null;
        android.widget.LinearLayout r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 5454806673422441115L, this, r8);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(5454806673422441115L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = new android.widget.SeekBar(r8);
                        r2.setFocusable(false);
                        r3 = new android.widget.LinearLayout(r8);
                        r3.addView(r2, new android.widget.LinearLayout.LayoutParams((int) (r8.getResources().getDisplayMetrics().density * 150.0f), -2));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
