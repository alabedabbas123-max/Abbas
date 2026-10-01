package com.aide.common;

@abcd.Interfacexu
class ViewOnClickListenere implements android.view.View.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.widget.Spinner FH;
    final android.app.ActionBar Hw;

    @abcd.Interfacevu
    final com.aide.common.Runnablef v5;

    static {
        abcd.wu.j6(com.aide.common.ViewOnClickListenere.class, -5719469610590790156L, 7835098199013958752L);
    }

    ViewOnClickListenere(com.aide.common.Runnablef r1, android.widget.Spinner r2, android.app.ActionBar r3) {
        this.v5 = r1;
        this.FH = r2;
        this.Hw = r3;
    }

    @Override
    @abcd.Interfacesu(method = -607949149793948703L)
    public void onClick(android.view.View r8) {
    L12:
        th = move-exception;
        if (DW == false) goto L17;
        abcd.wu.j6(th, -3758391342628997560L, this, r8);
    L17:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3758391342628997560L, this, r8);     // Catch: java.lang.Throwable -> L12
    L6:
        android.widget.PopupMenu r2 = new android.widget.PopupMenu(this.v5.FH, this.FH);     // Catch: java.lang.Throwable -> L12
        android.view.Menu r3 = r2.getMenu();     // Catch: java.lang.Throwable -> L12
        int r5 = 0;
    L8:
        if (r5 >= this.Hw.getTabCount()) goto L10;
        r3.add(0, r5, 0, this.Hw.getTabAt(r5).getText());     // Catch: java.lang.Throwable -> L12
        r5 = r5 + 1;     // Catch: java.lang.Throwable -> L12
        goto L8
    L10:
        r2.setOnMenuItemClickListener(new com.aide.common.ClassD(this));     // Catch: java.lang.Throwable -> L12
        r2.show();     // Catch: java.lang.Throwable -> L12
    }
}
