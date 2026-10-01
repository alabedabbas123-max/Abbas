package abcd;

@abcd.Interfacexu
class DialogInterfaceOnClickListenerwh implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.Ch FH;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnClickListenerwh.class, -6708075855096698041L, -290684639754567993L);
    }

    DialogInterfaceOnClickListenerwh(abcd.Ch r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -868422523987040843L)
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
                    abcd.wu.j6(th, 5309248098472877240L, this, r8, new java.lang.Integer(r9));
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(5309248098472877240L, this, r8, new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        r0 = (android.app.AlertDialog) r8;
                        abcd.Ch.j6(this.FH, r0);
                        r0.dismiss();
                        abcd.Ch.j6(this.FH, abcd.Ch.j6(this.FH), abcd.Ch.DW(this.FH, r0), abcd.Ch.FH(this.FH, r0), abcd.Ch.Hw(this.FH, r0));
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
