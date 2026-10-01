package com.aide.common;

@abcd.Interfacexu
public class ClassB {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.common.ClassB.class, 25807906368923679L, 25807906368923679L);
    }

    public ClassB() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 5259265791924431892L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5259265791924431892L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static void j6(android.app.Activity r8, java.lang.String r9, java.lang.String r10) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -3438868607491549925L, null, r8, r9, r10);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-3438868607491549925L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L7
    L5:
        android.content.Intent r0 = new android.content.Intent();     // Catch: java.lang.Throwable -> L7
        r0.setComponent(new android.content.ComponentName(r8, "com.aide.ui.activities.HelpViewActivity"));     // Catch: java.lang.Throwable -> L7
        r0.putExtra("EXTRA_URL", r9);     // Catch: java.lang.Throwable -> L7
        r0.putExtra("EXTRA_CAT", r10);     // Catch: java.lang.Throwable -> L7
        r0.addFlags(268435456);     // Catch: java.lang.Throwable -> L7
        r0.addFlags(4096);     // Catch: java.lang.Throwable -> L7
        r8.startActivity(r0);     // Catch: java.lang.Throwable -> L7
    }
}
