package abcd;

@abcd.Interfacexu
class DialogInterfaceOnShowListenerLh implements android.content.DialogInterface.OnShowListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.Oh FH;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnShowListenerLh.class, -2572685827865588271L, 2193403255567375865L);
    }

    DialogInterfaceOnShowListenerLh(abcd.Oh r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 66569645168422633L)
    public void onShow(android.content.DialogInterface r5) {
        android.app.AlertDialog r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 4292483544503373907L, this, r5);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(4292483544503373907L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r2 = (android.app.AlertDialog) r5;
                        abcd.Oh.j6(this.FH, r2);
                        abcd.Oh.DW(this.FH, r2);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
