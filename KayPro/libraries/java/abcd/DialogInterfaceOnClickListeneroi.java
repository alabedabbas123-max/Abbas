package abcd;

@abcd.Interfacexu
class DialogInterfaceOnClickListeneroi implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.ui FH;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnClickListeneroi.class, -4195144536276187105L, 7773698686079100175L);
    }

    DialogInterfaceOnClickListeneroi(abcd.ui r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 788199361031435844L)
    public void onClick(android.content.DialogInterface r8, int r9) {
        android.app.AlertDialog r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, -5311007677978911035L, this, r8, new java.lang.Integer(r9));
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(-5311007677978911035L, this, r8, new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        r0 = (android.app.AlertDialog) r8;
                        abcd.ui.j6(this.FH, r0);
                        r0.dismiss();
                        this.FH.j6(r0);
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
