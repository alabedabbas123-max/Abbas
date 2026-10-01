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
    L6:
        th = move-exception;
        if (DW == false) goto L10;
        abcd.wu.j6(th, 1233984580418882220L, this, r9, new java.lang.Integer(r10), new java.lang.Boolean(r11));
    L10:
        throw th;
    L3:
        if (j6 == false) goto L13;
        abcd.wu.j6(1233984580418882220L, this, r9, new java.lang.Integer(r10), new java.lang.Boolean(r11));     // Catch: java.lang.Throwable -> L6
        return;
    }
}
