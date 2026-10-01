package com.aide.ui.activities;

@abcd.Interfacexu
class ViewOnClickListenera implements android.view.View.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.activities.AndroidTrainerActivity FH;

    static {
        abcd.wu.j6(com.aide.ui.activities.ViewOnClickListenera.class, 309968735317025088L, -727436341154326069L);
    }

    ViewOnClickListenera(com.aide.ui.activities.AndroidTrainerActivity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -166671683056844745L)
    public void onClick(android.view.View r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 5006728700189011224L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5006728700189011224L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.activities.AndroidTrainerActivity.j6(this.FH);     // Catch: java.lang.Throwable -> L8
        this.FH.finish();     // Catch: java.lang.Throwable -> L8
    }
}
