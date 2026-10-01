package abcd;

@abcd.Interfacexu
class DialogInterfaceOnClickListenerSh implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;

    @abcd.Interfacevu
    final abcd.Yh Hw;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnClickListenerSh.class, 4518137094473097045L, 275064306853505841L);
    }

    DialogInterfaceOnClickListenerSh(abcd.Yh r1, android.app.Activity r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -245041285058999904L)
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
                    abcd.wu.j6(th, -5273463928502553904L, this, r8, new java.lang.Integer(r9));
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(-5273463928502553904L, this, r8, new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        r0 = (android.app.AlertDialog) r8;
                        abcd.Yh.j6(this.Hw, r0);
                        r0.dismiss();
                        abcd.Yh.j6(this.Hw, this.FH, abcd.Yh.DW(this.Hw, r0), abcd.Yh.FH(this.Hw, r0));
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
