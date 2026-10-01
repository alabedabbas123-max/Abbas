package com.aide.common;

@abcd.Interfacexu
class DialogInterfaceOnClickListenerja implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.common.la FH;

    static {
        abcd.wu.j6(com.aide.common.DialogInterfaceOnClickListenerja.class, 5024868934807443193L, 4521202756633126005L);
    }

    DialogInterfaceOnClickListenerja(com.aide.common.la r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 145603909606991280L)
    public void onClick(android.content.DialogInterface r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, 1186625401691336704L, this, r8, new java.lang.Integer(r9));
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(1186625401691336704L, this, r8, new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        r8.dismiss();
                        this.FH.EQ.run();
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
