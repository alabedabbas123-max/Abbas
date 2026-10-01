package abcd;

@abcd.Interfacexu
class DialogInterfaceOnClickListenerlh implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.rh FH;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnClickListenerlh.class, 570958555126909067L, -1001190433478586060L);
    }

    DialogInterfaceOnClickListenerlh(abcd.rh r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 1166013514265621792L)
    public void onClick(android.content.DialogInterface r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, 4496062484576932245L, this, r8, new java.lang.Integer(r9));
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(4496062484576932245L, this, r8, new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        abcd.rh.j6(this.FH, (android.app.AlertDialog) r8);
                        r8.cancel();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
