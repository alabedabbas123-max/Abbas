package abcd;

@abcd.Interfacexu
class DialogInterfaceOnClickListenerRh implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final abcd.Yh FH;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnClickListenerRh.class, 4518137094473097045L, 275001021024250136L);
    }

    DialogInterfaceOnClickListenerRh(abcd.Yh r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -277856506411452360L)
    public void onClick(android.content.DialogInterface r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, 4539968155737117075L, this, r8, new java.lang.Integer(r9));
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(4539968155737117075L, this, r8, new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        abcd.Yh.j6(this.FH, (android.app.AlertDialog) r8);
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
