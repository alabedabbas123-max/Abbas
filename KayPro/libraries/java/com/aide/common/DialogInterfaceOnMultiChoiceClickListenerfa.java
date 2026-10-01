package com.aide.common;

@abcd.Interfacexu
class DialogInterfaceOnMultiChoiceClickListenerfa implements android.content.DialogInterface.OnMultiChoiceClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.common.ga FH;

    static {
        abcd.wu.j6(com.aide.common.DialogInterfaceOnMultiChoiceClickListenerfa.class, 5024868934807443193L, 4520538613991579824L);
    }

    DialogInterfaceOnMultiChoiceClickListenerfa(com.aide.common.ga r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -1662625124804659683L)
    public void onClick(android.content.DialogInterface r9, int r10, boolean r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 6: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 10; continue $sw0; }
                    abcd.wu.j6(th, 1233984580418882220L, this, r9, new java.lang.Integer(r10), new java.lang.Boolean(r11));
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 13; continue $sw0; }
                    try {
                        abcd.wu.j6(1233984580418882220L, this, r9, new java.lang.Integer(r10), new java.lang.Boolean(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 6; continue $sw0;
                    }
                    return;
                }
                case 13: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
