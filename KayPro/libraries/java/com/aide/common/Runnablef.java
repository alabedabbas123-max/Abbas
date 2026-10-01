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
        android.app.ActionBar r2 = null;
        android.widget.Spinner r3 = null;
        com.aide.common.ViewOnClickListenere r4 = null;
        java.lang.reflect.Method r5 = null;
        java.lang.Object r6 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 15: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 19; continue $sw0; }
                    abcd.wu.j6(th, 4164112967154155045L, this);
                    $pc0 = 19; continue $sw0;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 20; continue $sw0; }
                    try {
                        abcd.wu.j6(4164112967154155045L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    $pc0 = 20; continue $sw0;
                }
                case 20: {
                    try {
                        r2 = this.FH.getActionBar();
                        r3 = (android.widget.Spinner) com.aide.common.ClassG.j6(this.FH.findViewById(this.FH.getResources().getIdentifier("action_bar_container", "id", "android")), android.widget.Spinner.class);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    if (r3 == null) { $pc0 = 24; continue $sw0; }
                    try {
                        r4 = new com.aide.common.ViewOnClickListenere(this, r3, r2);
                        r5 = android.view.View.class.getDeclaredMethod("getListenerInfo", new java.lang.Class[0]);
                        r5.setAccessible(true);
                        r6 = r5.invoke(r3, new java.lang.Object[0]);
                        java.lang.Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener").set(r6, r4);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 12; continue $sw0;
                    }
                    $pc0 = 25; continue $sw0;
                }
                case 25: {
                    return;
                }
                case 24: {
                    return;
                }
                case 12: {
                    th = $ex0;
                    try {
                        th.printStackTrace();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 15; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
