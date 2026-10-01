package com.aide.common;

@abcd.Interfacexu
class DialogInterfaceOnClickListenery implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.common.J FH;

    static {
        abcd.wu.j6(com.aide.common.DialogInterfaceOnClickListenery.class, 5024868934807443193L, 4518161630902389525L);
    }

    DialogInterfaceOnClickListenery(com.aide.common.J r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 653834745199599049L)
    public void onClick(android.content.DialogInterface r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 6: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 10; continue $sw0; }
                    abcd.wu.j6(th, 718816909278993756L, this, r8, new java.lang.Integer(r9));
                    $pc0 = 10; continue $sw0;
                }
                case 10: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 13; continue $sw0; }
                    try {
                        abcd.wu.j6(718816909278993756L, this, r8, new java.lang.Integer(r9));
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
