package com.aide.common;

@abcd.Interfacexu
class DialogInterfaceOnClickListenerba implements android.content.DialogInterface.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.common.da FH;

    static {
        abcd.wu.j6(com.aide.common.DialogInterfaceOnClickListenerba.class, 5024868934807443193L, 4520062246626419040L);
    }

    DialogInterfaceOnClickListenerba(com.aide.common.da r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -1268371417224799985L)
    public void onClick(android.content.DialogInterface r8, int r9) {
    L15:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, -1532858033377679073L, this, r8, new java.lang.Integer(r9));
    L20:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1532858033377679073L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L15
    L5:
        r8.dismiss();     // Catch: java.lang.Throwable -> L15
        android.util.SparseBooleanArray r0 = ((android.app.AlertDialog) r8).getListView().getCheckedItemPositions();     // Catch: java.lang.Throwable -> L15
        if (r0 == null) goto L14;
        int r1 = 0;
    L8:
        if (r1 >= this.FH.gn.size()) goto L27;
        if (r0.get(r1) == false) goto L13;
        this.FH.tp.j6(this.FH.gn.get(r1));     // Catch: java.lang.Throwable -> L15
    L13:
        r1 = r1 + 1;
        goto L8
    L27:
        return;
    }
}
