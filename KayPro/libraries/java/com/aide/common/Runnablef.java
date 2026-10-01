package com.aide.common;

@abcd.Interfacexu
class Runnablef implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.app.Activity FH;

    static {
        abcd.wu.j6(com.aide.common.Runnablef.class, -5719469610590790156L, 1263414528814843547L);
    }

    Runnablef(android.app.Activity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 614300866646933280L)
    public void run() {
    L15:
        th = move-exception;
        if (DW == false) goto L19;
        abcd.wu.j6(th, 4164112967154155045L, this);
    L19:
        throw th;
    L4:
        if (j6 == false) goto L20;
        abcd.wu.j6(4164112967154155045L, this);     // Catch: java.lang.Throwable -> L15
    L20:
        android.app.ActionBar r2 = this.FH.getActionBar();     // Catch: java.lang.Throwable -> L12
        android.widget.Spinner r3 = (android.widget.Spinner) com.aide.common.ClassG.j6(this.FH.findViewById(this.FH.getResources().getIdentifier("action_bar_container", "id", "android")), android.widget.Spinner.class);     // Catch: java.lang.Throwable -> L12
        if (r3 == null) goto L24;
        com.aide.common.ViewOnClickListenere r4 = new com.aide.common.ViewOnClickListenere(this, r3, r2);     // Catch: java.lang.Throwable -> L12
        java.lang.reflect.Method r5 = android.view.View.class.getDeclaredMethod("getListenerInfo", new java.lang.Class[0]);     // Catch: java.lang.Throwable -> L12
        r5.setAccessible(true);     // Catch: java.lang.Throwable -> L12
        java.lang.Object r6 = r5.invoke(r3, new java.lang.Object[0]);     // Catch: java.lang.Throwable -> L12
        java.lang.Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener").set(r6, r4);     // Catch: java.lang.Throwable -> L12
    L25:
        return;
    L24:
        return;
    L12:
        th = move-exception;
        th.printStackTrace();     // Catch: java.lang.Throwable -> L15
    }
}
