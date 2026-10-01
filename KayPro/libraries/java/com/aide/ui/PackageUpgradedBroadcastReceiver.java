package com.aide.ui;

@abcd.Interfacexu
public class PackageUpgradedBroadcastReceiver extends android.content.BroadcastReceiver {

    @abcd.Interfacetu
    private static boolean DW;

    @abcd.Interfaceuu
    private static boolean FH;

    @abcd.Interfaceru(field = 492666457109862000L)
    private static com.aide.ui.Interfaceba j6;

    static {
        abcd.wu.j6(com.aide.ui.PackageUpgradedBroadcastReceiver.class, -2569420533032304756L, -2569420533032304756L);
    }

    public PackageUpgradedBroadcastReceiver() {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, -4292635513943861888L, null);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(-4292635513943861888L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static void j6(com.aide.ui.Interfaceba r5) {
    L8:
        th = move-exception;
        if (FH == false) goto L12;
        abcd.wu.j6(th, 3240913113762591704L, null, r5);
    L12:
        throw th;
    L4:
        if (DW == false) goto L6;
        abcd.wu.j6(3240913113762591704L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = r5;     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public void onReceive(android.content.Context r8, android.content.Intent r9) {
    L9:
        th = move-exception;
        if (FH == false) goto L13;
        abcd.wu.j6(th, -581107202848467105L, this, r8, r9);
    L13:
        throw th;
    L3:
        if (DW == false) goto L6;
        abcd.wu.j6(-581107202848467105L, this, r8, r9);     // Catch: java.lang.Throwable -> L9
    L6:
        if (j6 == null) goto L16;
        com.aide.ui.UserPresentBroadcastReceiver.j6(r8, j6);     // Catch: java.lang.Throwable -> L9
        return;
    }
}
