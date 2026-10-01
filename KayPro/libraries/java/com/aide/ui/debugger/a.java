package com.aide.ui.debugger;

@abcd.Interfacexu
public class a {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.ui.debugger.a.class, -2166214085823675229L, -2166214085823675229L);
    }

    public a() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -21893438031947136L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-21893438031947136L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static void DW(android.content.Context r7, java.lang.String r8) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 659328601534059303L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(659328601534059303L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        android.content.Intent r0 = new android.content.Intent();     // Catch: java.lang.Throwable -> L7
        r0.setPackage(r8);     // Catch: java.lang.Throwable -> L7
        r0.setAction("com.adrt.KILL");     // Catch: java.lang.Throwable -> L7
        r7.sendBroadcast(r0);     // Catch: java.lang.Throwable -> L7
    }

    public static void DW(android.content.Context r8, java.lang.String r9, java.util.ArrayList<java.lang.String> r10) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 3544907813734325328L, null, r8, r9, r10);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(3544907813734325328L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L7
    L5:
        android.content.Intent r0 = new android.content.Intent();     // Catch: java.lang.Throwable -> L7
        r0.setPackage(r9);     // Catch: java.lang.Throwable -> L7
        r0.setAction("com.adrt.RESUME");     // Catch: java.lang.Throwable -> L7
        r0.putExtra("breakpoints", r10);     // Catch: java.lang.Throwable -> L7
        r8.sendBroadcast(r0);     // Catch: java.lang.Throwable -> L7
    }

    public static void FH(android.content.Context r7, java.lang.String r8) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 414597785526560900L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(414597785526560900L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        DW(r7, r8, null);     // Catch: java.lang.Throwable -> L7
    }

    public static void Hw(android.content.Context r7, java.lang.String r8) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -2583986050371316912L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-2583986050371316912L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        android.content.Intent r0 = new android.content.Intent();     // Catch: java.lang.Throwable -> L7
        r0.setPackage(r8);     // Catch: java.lang.Throwable -> L7
        r0.setAction("com.adrt.STEP_IN");     // Catch: java.lang.Throwable -> L7
        r7.sendBroadcast(r0);     // Catch: java.lang.Throwable -> L7
    }

    public static void Zo(android.content.Context r7, java.lang.String r8) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 1015145722550728725L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1015145722550728725L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        android.content.Intent r0 = new android.content.Intent();     // Catch: java.lang.Throwable -> L7
        r0.setPackage(r8);     // Catch: java.lang.Throwable -> L7
        r0.setAction("com.adrt.STEP_OVER");     // Catch: java.lang.Throwable -> L7
        r7.sendBroadcast(r0);     // Catch: java.lang.Throwable -> L7
    }

    public static void j6(android.content.Context r7, java.lang.String r8) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -7019756002085584037L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-7019756002085584037L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        android.content.Intent r0 = new android.content.Intent();     // Catch: java.lang.Throwable -> L7
        r0.setPackage(r8);     // Catch: java.lang.Throwable -> L7
        r0.setAction("com.adrt.DISCONNECT");     // Catch: java.lang.Throwable -> L7
        r7.sendBroadcast(r0);     // Catch: java.lang.Throwable -> L7
    }

    public static void j6(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -212459585372817552L, null, r8, r9, r10);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-212459585372817552L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L7
    L5:
        android.content.Intent r0 = new android.content.Intent();     // Catch: java.lang.Throwable -> L7
        r0.setPackage(r9);     // Catch: java.lang.Throwable -> L7
        r0.setAction("com.adrt.GET_FIELDS");     // Catch: java.lang.Throwable -> L7
        r0.putExtra("path", r10);     // Catch: java.lang.Throwable -> L7
        r8.sendBroadcast(r0);     // Catch: java.lang.Throwable -> L7
    }

    public static void j6(android.content.Context r8, java.lang.String r9, java.util.ArrayList<java.lang.String> r10) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -980888569243410389L, null, r8, r9, r10);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-980888569243410389L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L7
    L5:
        android.content.Intent r0 = new android.content.Intent();     // Catch: java.lang.Throwable -> L7
        r0.setPackage(r9);     // Catch: java.lang.Throwable -> L7
        r0.setAction("com.adrt.SET_BREAKPOINTS");     // Catch: java.lang.Throwable -> L7
        r0.putStringArrayListExtra("breakpoints", r10);     // Catch: java.lang.Throwable -> L7
        r8.sendBroadcast(r0);     // Catch: java.lang.Throwable -> L7
    }

    public static void v5(android.content.Context r7, java.lang.String r8) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 1967225791859342293L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1967225791859342293L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        android.content.Intent r0 = new android.content.Intent();     // Catch: java.lang.Throwable -> L7
        r0.setPackage(r8);     // Catch: java.lang.Throwable -> L7
        r0.setAction("com.adrt.STEP_OUT");     // Catch: java.lang.Throwable -> L7
        r7.sendBroadcast(r0);     // Catch: java.lang.Throwable -> L7
    }
}
