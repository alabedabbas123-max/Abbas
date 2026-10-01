package abcd;

@abcd.Interfacexu
class DialogInterfaceOnShowListenerti implements android.content.DialogInterface.OnShowListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.widget.EditText FH;

    @abcd.Interfacevu
    final abcd.ui Hw;

    static {
        abcd.wu.j6(abcd.DialogInterfaceOnShowListenerti.class, -4195144536276187105L, 7774317226006372860L);
    }

    DialogInterfaceOnShowListenerti(abcd.ui r1, android.widget.EditText r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -113792467494429968L)
    public void onShow(android.content.DialogInterface r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -7888023750507210080L, this, r5);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-7888023750507210080L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.Hw.DW((android.app.AlertDialog) r5);
                        this.FH.selectAll();
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
