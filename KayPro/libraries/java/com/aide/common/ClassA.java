package com.aide.common;

@abcd.Interfacexu
public class ClassA {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.common.ClassA.class, -1634593899566973744L, -1634593899566973744L);
    }

    public ClassA() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1639981664315042440L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1639981664315042440L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static void j6(android.app.Activity r9, java.lang.String r10, int r11, int r12) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -1738949567178440340L, null, r9, r10, new java.lang.Integer(r11), new java.lang.Integer(r12));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1738949567178440340L, null, r9, r10, new java.lang.Integer(r11), new java.lang.Integer(r12));     // Catch: java.lang.Throwable -> L7
    L5:
        android.content.Intent r0 = new android.content.Intent();     // Catch: java.lang.Throwable -> L7
        r0.setComponent(new android.content.ComponentName(r9, "com.almlkaide.kaypro.aide.AideMainActivity"));     // Catch: java.lang.Throwable -> L7
        r0.putExtra("NavigateFile", r10);     // Catch: java.lang.Throwable -> L7
        r0.putExtra("NavigateLine", r11);     // Catch: java.lang.Throwable -> L7
        r0.putExtra("NavigateColumn", r12);     // Catch: java.lang.Throwable -> L7
        r0.addFlags(67108864);     // Catch: java.lang.Throwable -> L7
        r9.startActivity(r0);     // Catch: java.lang.Throwable -> L7
    }
}
