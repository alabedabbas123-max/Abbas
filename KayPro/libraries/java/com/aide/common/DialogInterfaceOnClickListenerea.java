package com.aide.common;

@abcd.Interfacexu
class DialogInterfaceOnClickListenerea implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.common.ga FH;

    static {
        abcd.wu.j6(com.aide.common.DialogInterfaceOnClickListenerea.class, 5024868934807443193L, 4520442404914297257L);
    }

    DialogInterfaceOnClickListenerea(com.aide.common.ga r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 939821529682376064L)
    public void onClick(android.content.DialogInterface r8, int r9) {
        java.util.ArrayList r0 = null;
        android.util.SparseBooleanArray r1 = null;
        int r2 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 16: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 21; continue $sw0; }
                    abcd.wu.j6(th, 1704067078611090717L, this, r8, new java.lang.Integer(r9));
                    $pc0 = 21; continue $sw0;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(1704067078611090717L, this, r8, new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 16; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        r8.dismiss();
                        r0 = new java.util.ArrayList();
                        r1 = ((android.app.AlertDialog) r8).getListView().getCheckedItemPositions();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 16; continue $sw0;
                    }
                    if (r1 == null) { $pc0 = 14; continue $sw0; }
                    r2 = 0;
                    $pc0 = 9; continue $sw0;
                }
                case 9: {
                    if (r2 >= this.FH.u7.size()) { $pc0 = 14; continue $sw0; }
                    if (r1.get(r2) == false) { $pc0 = 13; continue $sw0; }
                    try {
                        r0.add(java.lang.Integer.valueOf(r2));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 16; continue $sw0;
                    }
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    try {
                        r2 = r2 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 16; continue $sw0;
                    }
                    $pc0 = 14; continue $sw0;
                }
                case 14: {
                    try {
                        this.FH.tp.j6(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 16; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
