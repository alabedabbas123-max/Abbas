package com.aide.common;

@abcd.Interfacexu
class DialogInterfaceOnClickListenerba implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.common.da FH;

    static {
        abcd.wu.j6(com.aide.common.DialogInterfaceOnClickListenerba.class, 5024868934807443193L, 4520062246626419040L);
    }

    DialogInterfaceOnClickListenerba(com.aide.common.da r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -1268371417224799985L)
    public void onClick(android.content.DialogInterface r8, int r9) {
        android.util.SparseBooleanArray r0 = null;
        int r1 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 15: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 20; continue $sw0; }
                    abcd.wu.j6(th, -1532858033377679073L, this, r8, new java.lang.Integer(r9));
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(-1532858033377679073L, this, r8, new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        r8.dismiss();
                        r0 = ((android.app.AlertDialog) r8).getListView().getCheckedItemPositions();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    if (r0 == null) { $pc0 = 14; continue $sw0; }
                    r1 = 0;
                    $pc0 = 8; continue $sw0;
                }
                case 8: {
                    if (r1 >= this.FH.gn.size()) { $pc0 = 27; continue $sw0; }
                    if (r0.get(r1) == false) { $pc0 = 13; continue $sw0; }
                    try {
                        this.FH.tp.j6(this.FH.gn.get(r1));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    r1 = r1 + 1;
                    { $pc0 = 8; continue $sw0; }
                }
                case 27: {
                    return;
                }
                case 14: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
