package com.aide.uidesigner;

@abcd.Interfacexu
class Ia implements com.aide.uidesigner.Ka.c {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.uidesigner.Ia.class, -6184905212679667120L, 7658678322358014840L);
    }

    Ia() {
    }

    @Override
    @abcd.Interfacesu(method = 267482857313061645L)
    public android.view.View j6(android.content.Context r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1969156470421447212L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1969156470421447212L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        android.widget.CheckBox r2 = new android.widget.CheckBox(r5);     // Catch: java.lang.Throwable -> L8
        r2.setFocusable(false);     // Catch: java.lang.Throwable -> L8
        r2.setText("CheckBox");     // Catch: java.lang.Throwable -> L8
        return r2;
    }
}
