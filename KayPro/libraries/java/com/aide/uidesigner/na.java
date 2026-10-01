package com.aide.uidesigner;

@abcd.Interfacexu
class na extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;
    final com.aide.common.ab EQ;
    final java.util.List gn;
    final boolean tp;
    final java.lang.String u7;

    static {
        abcd.wu.j6(com.aide.uidesigner.na.class, -20062164340700416L, 304247859432616215L);
    }

    na(java.util.List r1, java.lang.String r2, boolean r3, com.aide.common.ab r4) {
        this.gn = r1;
        this.u7 = r2;
        this.tp = r3;
        this.EQ = r4;
    }

    @Override
    @abcd.Interfacesu(method = -182576620641636615L)
    public android.app.Dialog j6(android.app.Activity r7) {
    L8:
        th = move-exception;
        if (VH == false) goto L12;
        abcd.wu.j6(th, 176652414157537197L, this, r7);
    L12:
        throw th;
    L4:
        if (Zo == false) goto L6;
        abcd.wu.j6(176652414157537197L, this, r7);     // Catch: java.lang.Throwable -> L8
    L6:
        android.widget.ExpandableListView r2 = new android.widget.ExpandableListView(r7);     // Catch: java.lang.Throwable -> L8
        r2.setAdapter(new com.aide.uidesigner.Ka.b(r7, this.gn));     // Catch: java.lang.Throwable -> L8
        android.app.AlertDialog r3 = new android.app.AlertDialog.Builder(r7).setCancelable(true).setView(r2).setTitle(this.u7).create();     // Catch: java.lang.Throwable -> L8
        r2.setOnChildClickListener(new com.aide.uidesigner.ma(this, r3));     // Catch: java.lang.Throwable -> L8
        r3.setCanceledOnTouchOutside(true);     // Catch: java.lang.Throwable -> L8
        return r3;
    }
}
