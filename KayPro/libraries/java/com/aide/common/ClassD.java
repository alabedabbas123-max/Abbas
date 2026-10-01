package com.aide.common;

@abcd.Interfacexu
class ClassD implements android.widget.PopupMenu.OnMenuItemClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.common.ViewOnClickListenere FH;

    static {
        abcd.wu.j6(com.aide.common.ClassD.class, -5719469610590790156L, -5264982118530527229L);
    }

    ClassD(com.aide.common.ViewOnClickListenere r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -2609122254969051881L)
    public boolean onMenuItemClick(android.view.MenuItem r6) {
    L9:
        th = move-exception;
        if (DW == false) goto L13;
        abcd.wu.j6(th, 2277578942065586692L, this, r6);
    L13:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2277578942065586692L, this, r6);     // Catch: java.lang.Throwable -> L9
    L6:
        this.FH.Hw.selectTab(this.FH.Hw.getTabAt(r6.getItemId()));     // Catch: java.lang.Throwable -> L9
        return true;
    }
}
