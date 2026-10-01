package com.aide.ui;

@abcd.Interfacexu
class X implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.view.View FH;

    @abcd.Interfacevu
    final com.aide.ui.Z Hw;

    static {
        abcd.wu.j6(com.aide.ui.X.class, -583473860859722665L, 459389042936997340L);
    }

    X(com.aide.ui.Z r1, android.view.View r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 1478844908117378931L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -5901700656240745913L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5901700656240745913L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.Z.j6(this.Hw, new android.widget.PopupMenu(com.aide.ui.Z.DW(this.Hw), this.FH));     // Catch: java.lang.Throwable -> L8
        com.aide.ui.Z.j6(this.Hw).getMenuInflater().inflate(com.aide.ui.Z.FH(this.Hw), com.aide.ui.Z.j6(this.Hw).getMenu());     // Catch: java.lang.Throwable -> L8
        com.aide.ui.Z.j6(this.Hw, com.aide.ui.Z.j6(this.Hw).getMenu());     // Catch: java.lang.Throwable -> L8
        com.aide.ui.Z.j6(this.Hw).setOnMenuItemClickListener(new com.aide.ui.W(this));     // Catch: java.lang.Throwable -> L8
        com.aide.ui.Z.j6(this.Hw).show();     // Catch: java.lang.Throwable -> L8
    }
}
