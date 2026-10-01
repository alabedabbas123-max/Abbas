package com.aide.uidesigner;

@abcd.Interfacexu
class oa implements com.aide.uidesigner.Ka.c {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.uidesigner.oa.class, -6184905212679667120L, 70615866454258857L);
    }

    oa() {
    }

    @Override
    @abcd.Interfacesu(method = 631023396789780095L)
    public android.view.View j6(android.content.Context r8) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 5454806673422441115L, this, r8);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5454806673422441115L, this, r8);     // Catch: java.lang.Throwable -> L8
    L6:
        android.widget.SeekBar r2 = new android.widget.SeekBar(r8);     // Catch: java.lang.Throwable -> L8
        r2.setFocusable(false);     // Catch: java.lang.Throwable -> L8
        android.widget.LinearLayout r3 = new android.widget.LinearLayout(r8);     // Catch: java.lang.Throwable -> L8
        r3.addView(r2, new android.widget.LinearLayout.LayoutParams((int) (r8.getResources().getDisplayMetrics().density * 150.0f), -2));     // Catch: java.lang.Throwable -> L8
        return r3;
    }
}
