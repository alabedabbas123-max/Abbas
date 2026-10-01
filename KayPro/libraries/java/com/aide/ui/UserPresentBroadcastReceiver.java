package com.aide.ui;

@abcd.Interfacexu
public class UserPresentBroadcastReceiver extends android.content.BroadcastReceiver {

    @abcd.Interfacetu
    private static boolean DW;

    @abcd.Interfaceuu
    private static boolean FH;

    @abcd.Interfaceru(field = 17552612737408700L)
    private static java.util.List<com.aide.ui.Interfaceba> j6;

    static {
        abcd.wu.j6(com.aide.ui.UserPresentBroadcastReceiver.class, 1770983406591680232L, 1770983406591680232L);     // Catch: java.lang.Throwable -> L8
        if (DW == false) goto L6;
        abcd.wu.j6(5857911290733309L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 5857911290733309L, null);
    L12:
        throw th;
    }

    public UserPresentBroadcastReceiver() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -563835753548286363L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-563835753548286363L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static void j6(android.content.Context r7, com.aide.ui.Interfaceba r8) {
    L10:
        th = move-exception;
        if (FH == false) goto L14;
        abcd.wu.j6(th, 556530166429518396L, null, r7, r8);
    L14:
        throw th;
    L3:
        if (DW == false) goto L6;
        abcd.wu.j6(556530166429518396L, null, r7, r8);     // Catch: java.lang.Throwable -> L10
    L6:
        if (j6(r7) == false) goto L8;
        r8.j6(r7);     // Catch: java.lang.Throwable -> L10
        return;
    L8:
        j6.add(r8);     // Catch: java.lang.Throwable -> L10
    }

    @abcd.Interfacesu(method = -2543163155347239376L)
    private static boolean j6(android.content.Context r6) {
    L13:
        th = move-exception;
        if (FH == false) goto L17;
        abcd.wu.j6(th, 543601946910737892L, null, r6);
    L17:
        throw th;
    L4:
        if (DW == false) goto L8;
        abcd.wu.j6(543601946910737892L, null, r6);     // Catch: java.lang.Throwable -> L13
    L8:
        if (android.os.Build.VERSION.SDK_INT < 20) goto L12;
        return ((android.os.PowerManager) r6.getSystemService("power")).isInteractive();
    L12:
        return ((android.os.PowerManager) r6.getSystemService("power")).isScreenOn();
    }

    @Override
    public void onReceive(android.content.Context r8, android.content.Intent r9) {
    L13:
        th = move-exception;
        if (FH == false) goto L18;
        abcd.wu.j6(th, 858345034516721504L, this, r8, r9);
    L18:
        throw th;
    L3:
        if (DW == false) goto L6;
        abcd.wu.j6(858345034516721504L, this, r8, r9);     // Catch: java.lang.Throwable -> L13
    L6:
        if (r9.getAction().equals("android.intent.action.USER_PRESENT") == false) goto L23;
        java.util.Iterator<com.aide.ui.Interfaceba> r0 = j6.iterator();     // Catch: java.lang.Throwable -> L13
    L9:
        if (r0.hasNext() == false) goto L11;
        r0.next().j6(r8);     // Catch: java.lang.Throwable -> L13
        goto L9
    L11:
        j6.clear();     // Catch: java.lang.Throwable -> L13
        return;
    }
}
