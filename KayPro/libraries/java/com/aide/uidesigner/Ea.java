package com.aide.uidesigner;

@abcd.Interfacexu
class Ea implements com.aide.uidesigner.Ka.c {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.uidesigner.Ea.class, -6184905212679667120L, 7658203371098711680L);
    }

    Ea() {
    }

    @Override
    @abcd.Interfacesu(method = -259628295805041429L)
    public android.view.View j6(android.content.Context r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 976307234766392412L, this, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(976307234766392412L, this, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        android.widget.Button r2 = new android.widget.Button(r6, null, 16843567);     // Catch: java.lang.Throwable -> L8
        r2.setText("Bar Button");     // Catch: java.lang.Throwable -> L8
        r2.setFocusable(false);     // Catch: java.lang.Throwable -> L8
        return r2;
    }
}
