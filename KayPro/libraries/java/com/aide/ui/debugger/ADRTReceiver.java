package com.aide.ui.debugger;

@abcd.Interfacexu
public class ADRTReceiver extends android.content.BroadcastReceiver {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.ui.debugger.ADRTReceiver.class, 6932572682887363125L, 6932572682887363125L);
    }

    public ADRTReceiver() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2023906095643802075L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2023906095643802075L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    @Override
    public void onReceive(android.content.Context r12, android.content.Intent r13) {
    L24:
        th = move-exception;
        if (DW == false) goto L28;
        abcd.wu.j6(th, -792867024760012752L, this, r12, r13);
    L28:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(-792867024760012752L, this, r12, r13);     // Catch: java.lang.Throwable -> L24
    L6:
        if (r13.getExtras() != null) goto L8;
        return;
    L8:
        if ("com.adrt.LOGCAT_ENTRIES".equals(r13.getAction()) == false) goto L12;
        java.lang.String[] r0 = r13.getStringArrayExtra("lines");     // Catch: java.lang.Throwable -> L24
        com.aide.ui.debugger.Debugger.j6(r12).j6(r12, r0);     // Catch: java.lang.Throwable -> L24
        return;
    L12:
        if ("com.adrt.CONNECT".equals(r13.getAction()) == false) goto L15;
        java.lang.String r1 = r13.getExtras().getString("package");     // Catch: java.lang.Throwable -> L24
        com.aide.ui.debugger.Debugger.j6(r12).j6(r12, r1);     // Catch: java.lang.Throwable -> L24
        return;
    L15:
        if ("com.adrt.STOP".equals(r13.getAction()) == false) goto L18;
        java.lang.String r2 = r13.getExtras().getString("package");     // Catch: java.lang.Throwable -> L24
        com.aide.ui.debugger.Debugger.j6(r12).DW(r12, r2);     // Catch: java.lang.Throwable -> L24
        return;
    L18:
        if ("com.adrt.BREAKPOINT_HIT".equals(r13.getAction()) == false) goto L21;
        java.lang.String r4 = r13.getExtras().getString("package");     // Catch: java.lang.Throwable -> L24
        java.util.ArrayList<java.lang.String> r8 = r13.getExtras().getStringArrayList("variables");     // Catch: java.lang.Throwable -> L24
        java.util.ArrayList<java.lang.String> r9 = r13.getExtras().getStringArrayList("variableValues");     // Catch: java.lang.Throwable -> L24
        java.util.ArrayList<java.lang.String> r10 = r13.getExtras().getStringArrayList("variableKinds");     // Catch: java.lang.Throwable -> L24
        java.util.ArrayList<java.lang.String> r5 = r13.getExtras().getStringArrayList("stackMethods");     // Catch: java.lang.Throwable -> L24
        java.util.ArrayList<java.lang.String> r6 = r13.getExtras().getStringArrayList("stackLocations");     // Catch: java.lang.Throwable -> L24
        java.util.ArrayList<java.lang.String> r7 = r13.getExtras().getStringArrayList("stackLocationKinds");     // Catch: java.lang.Throwable -> L24
        com.aide.ui.debugger.Debugger.j6(r12).j6(r12, r4, r5, r6, r7, r8, r9, r10);     // Catch: java.lang.Throwable -> L24
        return;
    L21:
        if ("com.adrt.FIELDS".equals(r13.getAction()) == false) goto L35;
        java.util.ArrayList<java.lang.String> r11 = r13.getExtras().getStringArrayList("fields");     // Catch: java.lang.Throwable -> L24
        java.util.ArrayList<java.lang.String> r14 = r13.getExtras().getStringArrayList("fieldValues");     // Catch: java.lang.Throwable -> L24
        java.util.ArrayList<java.lang.String> r15 = r13.getExtras().getStringArrayList("fieldKinds");     // Catch: java.lang.Throwable -> L24
        java.lang.String r16 = r13.getExtras().getString("package");     // Catch: java.lang.Throwable -> L24
        java.lang.String r17 = r13.getExtras().getString("path");     // Catch: java.lang.Throwable -> L24
        com.aide.ui.debugger.Debugger.j6(r12).j6(r12, r16, r17, r11, r14, r15);     // Catch: java.lang.Throwable -> L24
        return;
    }
}
