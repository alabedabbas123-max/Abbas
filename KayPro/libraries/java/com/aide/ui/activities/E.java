package com.aide.ui.activities;

@abcd.Interfacexu
class E implements android.view.View.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.activities.G FH;

    static {
        abcd.wu.j6(com.aide.ui.activities.E.class, 2736360516742849000L, 1814864725867134105L);
    }

    E(com.aide.ui.activities.G r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 7877548614721583804L)
    public void onClick(android.view.View r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2013892394173628535L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2013892394173628535L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        abcd.F.j6("Clicked on Free Version in expert shop.");     // Catch: java.lang.Throwable -> L8
        this.FH.gn.Hw.dismiss();     // Catch: java.lang.Throwable -> L8
        this.FH.gn.setResult(-1);     // Catch: java.lang.Throwable -> L8
        this.FH.gn.finish();     // Catch: java.lang.Throwable -> L8
    }
}
