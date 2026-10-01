package com.aide.ui;

@abcd.Interfacexu
class W implements android.widget.PopupMenu.OnMenuItemClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.X FH;

    static {
        abcd.wu.j6(com.aide.ui.W.class, -583473860859722665L, 3900942361871868095L);
    }

    W(com.aide.ui.X r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -5109163836591282028L)
    public boolean onMenuItemClick(android.view.MenuItem r5) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, 3458967589935625768L, this, r5);
    L13:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3458967589935625768L, this, r5);     // Catch: java.lang.Throwable -> L9
    L6:
        com.aide.ui.Z.j6(this.FH.Hw, r5);     // Catch: java.lang.Throwable -> L9
        return true;
    }
}
