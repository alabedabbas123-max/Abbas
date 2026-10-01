package com.aide.licensing;

@abcd.Interfacexu
public class LicenseUpdateBootReceiver extends android.content.BroadcastReceiver {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.licensing.LicenseUpdateBootReceiver.class, 2241005384696799177L, 2241005384696799177L);
    }

    public LicenseUpdateBootReceiver() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -277367152744084903L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-277367152744084903L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    @Override
    public void onReceive(android.content.Context r8, android.content.Intent r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 104360854923926505L, this, r8, r9);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(104360854923926505L, this, r8, r9);     // Catch: java.lang.Throwable -> L7
    L5:
        abcd.ue.j6("Boot broadcast received.");     // Catch: java.lang.Throwable -> L7
        com.aide.licensing.LicenseUpdateAlarmReceiver.DW(r8);     // Catch: java.lang.Throwable -> L7
    }
}
