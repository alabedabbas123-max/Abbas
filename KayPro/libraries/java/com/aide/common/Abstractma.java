package com.aide.common;

@abcd.Interfacexu
public abstract class Abstractma {

    @abcd.Interfaceru(field = -3717002400078060576L)
    private static com.aide.common.Abstractma DW;

    @abcd.Interfaceru(field = 2365851726693433725L)
    private static android.app.Dialog FH;

    @abcd.Interfacetu
    private static boolean Hw;

    @abcd.Interfaceru(field = -902259347918780657L)
    private static int j6;

    @abcd.Interfaceuu
    private static boolean v5;

    static {
        abcd.wu.j6(com.aide.common.Abstractma.class, 5024868934807443193L, 5024868934807443193L);     // Catch: java.lang.Throwable -> L8
        if (Hw == false) goto L6;
        abcd.wu.j6(2645945776233719512L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        j6 = 123456;     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (v5 == false) goto L12;
        abcd.wu.j6(th, 2645945776233719512L, null);
    L12:
        throw th;
    }

    public Abstractma() {
    L8:
        th = move-exception;
        if (v5 == false) goto L12;
        abcd.wu.j6(th, 3092900090037729216L, null);
    L12:
        throw th;
    L4:
        if (Hw == false) goto L6;
        abcd.wu.j6(3092900090037729216L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static void DW(android.app.Activity r10, java.lang.String r11, java.lang.String r12, java.lang.Runnable r13, java.lang.Runnable r14) {
    L7:
        th = move-exception;
        if (v5 == false) goto L11;
        abcd.wu.j6(th, 2472989728482213624L, null, r10, r11, r12, r13, r14);
    L11:
        throw th;
    L3:
        if (Hw == false) goto L5;
        abcd.wu.j6(2472989728482213624L, null, r10, r11, r12, r13, r14);     // Catch: java.lang.Throwable -> L7
    L5:
        j6(r10, r11, r12, true, r13, r14);     // Catch: java.lang.Throwable -> L7
    }

    public static void DW(android.app.Activity r9, java.lang.String r10, java.util.List<java.lang.String> r11, com.aide.common.ab<java.lang.Integer> r12) {
    L7:
        th = move-exception;
        if (v5 == false) goto L11;
        abcd.wu.j6(th, 3990082611457703920L, null, r9, r10, r11, r12);
    L11:
        throw th;
    L3:
        if (Hw == false) goto L5;
        abcd.wu.j6(3990082611457703920L, null, r9, r10, r11, r12);     // Catch: java.lang.Throwable -> L7
    L5:
        j6(r9, new com.aide.common.ia(r11, r12, r10));     // Catch: java.lang.Throwable -> L7
    }

    public static void Hw() {
    L10:
        th = move-exception;
        if (v5 == false) goto L14;
        abcd.wu.j6(th, -1930894419615225120L, null);
    L14:
        throw th;
    L4:
        if (Hw == false) goto L7;
        abcd.wu.j6(-1930894419615225120L, null);     // Catch: java.lang.Throwable -> L10
    L7:
        if (FH == null) goto L17;
        FH.dismiss();     // Catch: java.lang.Throwable -> L10
        return;
    }

    public static android.app.Dialog j6(android.app.Activity r7, int r8) {
    L12:
        th = move-exception;
        if (v5 == false) goto L16;
        abcd.wu.j6(th, 2506262724897775411L, null, r7, new java.lang.Integer(r8));
    L16:
        throw th;
    L3:
        if (Hw == false) goto L6;
        abcd.wu.j6(2506262724897775411L, null, r7, new java.lang.Integer(r8));     // Catch: java.lang.Throwable -> L12
    L6:
        if (DW != null) goto L8;
    L11:
        return null;
    L8:
        if (r8 != j6) goto L11;
        FH = DW.j6(r7);     // Catch: java.lang.Throwable -> L12
        DW = null;     // Catch: java.lang.Throwable -> L12
        return FH;
    }

    public static void j6(android.app.Activity r10, int r11, int r12, java.lang.Runnable r13, java.lang.Runnable r14) {
    L7:
        th = move-exception;
        if (v5 == false) goto L11;
        abcd.wu.j6(th, -1503547478896582951L, null, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), r13, r14);
    L11:
        throw th;
    L3:
        if (Hw == false) goto L5;
        abcd.wu.j6(-1503547478896582951L, null, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), r13, r14);     // Catch: java.lang.Throwable -> L7
    L5:
        j6(r10, r10.getResources().getString(r11), r10.getResources().getString(r12), r10.getResources().getString(com.aide.ui.Ra.dialog_yes), r13, r10.getResources().getString(com.aide.ui.Ra.dialog_no), r14, null);     // Catch: java.lang.Throwable -> L7
    }

    public static void j6(android.app.Activity r10, int r11, int r12, java.lang.String r13, com.aide.common.ab<java.lang.String> r14) {
    L7:
        th = move-exception;
        if (v5 == false) goto L11;
        abcd.wu.j6(th, 151762829408225239L, null, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), r13, r14);
    L11:
        throw th;
    L3:
        if (Hw == false) goto L5;
        abcd.wu.j6(151762829408225239L, null, r10, new java.lang.Integer(r11), new java.lang.Integer(r12), r13, r14);     // Catch: java.lang.Throwable -> L7
    L5:
        j6(r10, r10.getResources().getString(r11), r10.getResources().getString(r12), null, r13, false, r14, null, null);     // Catch: java.lang.Throwable -> L7
    }

    public static void j6(android.app.Activity r10, int r11, int r12, java.util.List<java.lang.String> r13, java.lang.Runnable r14, java.lang.Runnable r15) {
        if (Hw == false) goto L5;
        abcd.wu.j6(4308149308601165769L, null, new java.lang.Object[]{r10, new java.lang.Integer(r11), new java.lang.Integer(r12), r13, r14, r15});
    L5:
        java.util.Iterator<java.lang.String> r16 = r13.iterator();
        java.lang.String r1 = "\n";
    L7:
        if (r16.hasNext() == false) goto L9;
        java.lang.String r2 = r1 + "\n";
        r1 = r2 + r16.next();
        goto L7
    L9:
        j6(r10, r10.getResources().getString(r11), r10.getResources().getString(r12) + r1, r10.getResources().getString(com.aide.ui.Ra.dialog_no), r15, r10.getResources().getString(com.aide.ui.Ra.dialog_yes), r14, null);
    }

    public static void j6(android.app.Activity r7, com.aide.common.Abstractma r8) {
    L12:
        th = move-exception;
        if (v5 == false) goto L16;
        abcd.wu.j6(th, 1351077689876059017L, null, r7, r8);
    L16:
        throw th;
    L3:
        if (Hw == false) goto L5;
        abcd.wu.j6(1351077689876059017L, null, r7, r8);     // Catch: java.lang.Throwable -> L12
    L5:
        DW = r8;     // Catch: java.lang.Throwable -> L12
        if (FH != null) goto L8;
    L10:
        r7.removeDialog(j6);     // Catch: java.lang.Throwable -> L12
        r7.showDialog(j6);     // Catch: java.lang.Throwable -> L12
        return;
    L8:
        if (FH.isShowing() == false) goto L10;
    }

    public static void j6(android.app.Activity r8, java.lang.String r9, java.lang.String r10) {
    L7:
        th = move-exception;
        if (v5 == false) goto L11;
        abcd.wu.j6(th, -698948115640071760L, null, r8, r9, r10);
    L11:
        throw th;
    L3:
        if (Hw == false) goto L5;
        abcd.wu.j6(-698948115640071760L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L7
    L5:
        j6(r8, r9, r10, null, null);     // Catch: java.lang.Throwable -> L7
    }

    public static void j6(android.app.Activity r10, java.lang.String r11, java.lang.String r12, com.aide.common.ab<java.lang.String> r13) {
    L7:
        th = move-exception;
        if (v5 == false) goto L11;
        abcd.wu.j6(th, -69390917322171561L, null, r10, r11, r12, r13);
    L11:
        throw th;
    L3:
        if (Hw == false) goto L5;
        abcd.wu.j6(-69390917322171561L, null, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L7
    L5:
        j6(r10, r11, r12, null, "", true, r13, null, null);     // Catch: java.lang.Throwable -> L7
    }

    public static void j6(android.app.Activity r10, java.lang.String r11, java.lang.String r12, com.aide.common.ab<java.lang.String> r13, java.lang.Runnable r14) {
    L7:
        th = move-exception;
        if (v5 == false) goto L11;
        abcd.wu.j6(th, 906927055807916440L, null, r10, r11, r12, r13, r14);
    L11:
        throw th;
    L3:
        if (Hw == false) goto L5;
        abcd.wu.j6(906927055807916440L, null, r10, r11, r12, r13, r14);     // Catch: java.lang.Throwable -> L7
    L5:
        j6(r10, r11, r12, null, "", true, r13, r14, null);     // Catch: java.lang.Throwable -> L7
    }

    public static void j6(android.app.Activity r10, java.lang.String r11, java.lang.String r12, com.aide.common.ClassU r13, com.aide.common.ab<com.aide.common.ClassU> r14) {
    L7:
        th = move-exception;
        if (v5 == false) goto L11;
        abcd.wu.j6(th, -3503017673943808509L, null, r10, r11, r12, r13, r14);
    L11:
        throw th;
    L3:
        if (Hw == false) goto L5;
        abcd.wu.j6(-3503017673943808509L, null, r10, r11, r12, r13, r14);     // Catch: java.lang.Throwable -> L7
    L5:
        j6(r10, new com.aide.common.Y(r13, r14, r12, r11));     // Catch: java.lang.Throwable -> L7
    }

    public static void j6(android.app.Activity r9, java.lang.String r10, java.lang.String r11, java.lang.Runnable r12) {
    L7:
        th = move-exception;
        if (v5 == false) goto L11;
        abcd.wu.j6(th, -904460221399655865L, null, r9, r10, r11, r12);
    L11:
        throw th;
    L3:
        if (Hw == false) goto L5;
        abcd.wu.j6(-904460221399655865L, null, r9, r10, r11, r12);     // Catch: java.lang.Throwable -> L7
    L5:
        DW(r9, r10, r11, r12, null);     // Catch: java.lang.Throwable -> L7
    }

    public static void j6(android.app.Activity r10, java.lang.String r11, java.lang.String r12, java.lang.Runnable r13, java.lang.Runnable r14) {
    L7:
        th = move-exception;
        if (v5 == false) goto L11;
        abcd.wu.j6(th, -2371412091065305893L, null, r10, r11, r12, r13, r14);
    L11:
        throw th;
    L3:
        if (Hw == false) goto L5;
        abcd.wu.j6(-2371412091065305893L, null, r10, r11, r12, r13, r14);     // Catch: java.lang.Throwable -> L7
    L5:
        j6(r10, r11, r12, r13, r14, null);     // Catch: java.lang.Throwable -> L7
    }

    public static void j6(android.app.Activity r10, java.lang.String r11, java.lang.String r12, java.lang.Runnable r13, java.lang.Runnable r14, java.lang.Runnable r15) {
        if (Hw == false) goto L5;
        abcd.wu.j6(-462102440538914400L, null, new java.lang.Object[]{r10, r11, r12, r13, r14, r15});
    L5:
        j6(r10, r11, r12, r10.getResources().getString(com.aide.ui.Ra.dialog_yes), r13, r10.getResources().getString(com.aide.ui.Ra.dialog_no), r14, r15);
    }

    public static void j6(android.app.Activity r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, com.aide.common.ab<java.lang.String> r14) {
    L7:
        th = move-exception;
        if (v5 == false) goto L11;
        abcd.wu.j6(th, -4588375171618658035L, null, r10, r11, r12, r13, r14);
    L11:
        throw th;
    L3:
        if (Hw == false) goto L5;
        abcd.wu.j6(-4588375171618658035L, null, r10, r11, r12, r13, r14);     // Catch: java.lang.Throwable -> L7
    L5:
        j6(r10, r11, r12, null, r13, false, r14, null, null);     // Catch: java.lang.Throwable -> L7
    }

    public static void j6(android.app.Activity r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, com.aide.common.ab<java.lang.String> r18, java.lang.Runnable r19) {
        if (Hw == false) goto L5;
        abcd.wu.j6(-2288868229835334720L, null, new java.lang.Object[]{r14, r15, r16, r17, r18, r19});
    L5:
        j6(r14, r15, r16, null, r17, false, r18, r19, null);
    }

    public static void j6(android.app.Activity r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.Runnable r14) {
    L7:
        th = move-exception;
        if (v5 == false) goto L11;
        abcd.wu.j6(th, -272934343473094215L, null, r10, r11, r12, r13, r14);
    L11:
        throw th;
    L3:
        if (Hw == false) goto L5;
        abcd.wu.j6(-272934343473094215L, null, r10, r11, r12, r13, r14);     // Catch: java.lang.Throwable -> L7
    L5:
        j6(r10, new com.aide.common.J(r12, r13, r14, r11));     // Catch: java.lang.Throwable -> L7
    }

    public static void j6(android.app.Activity r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Runnable r18, java.lang.String r19, java.lang.Runnable r20, java.lang.Runnable r21) {
        if (Hw == false) goto L5;
        abcd.wu.j6(-7872005745516604032L, null, new java.lang.Object[]{r14, r15, r16, r17, r18, r19, r20, r21});
    L5:
        j6(r14, new com.aide.common.S(r16, r17, r18, r19, r20, r21, r15));
    }

    public static void j6(android.app.Activity r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, com.aide.common.ab<java.lang.String> r19, java.lang.Runnable r20) {
        if (Hw == false) goto L5;
        abcd.wu.j6(168187044948249936L, null, new java.lang.Object[]{r14, r15, r16, r17, r18, r19, r20});
    L5:
        j6(r14, r15, r16, r17, r18, false, r19, null, r20);
    }

    @abcd.Interfacesu(method = -1566426823076169451L)
    private static void j6(android.app.Activity r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20, com.aide.common.ab<java.lang.String> r21, java.lang.Runnable r22, java.lang.Runnable r23) {
        if (Hw == false) goto L6;
        abcd.wu.j6(3054568361754767520L, null, new java.lang.Object[]{r15, r16, r17, r18, r19, new java.lang.Boolean(r20), r21, r22, r23});
    L6:
        j6(r15, new com.aide.common.H(r21, r17, r18, r23, r16, r22, r19, r20));
    }

    public static void j6(android.app.Activity r10, java.lang.String r11, java.lang.String r12, boolean r13, java.lang.Runnable r14, java.lang.Runnable r15) {
        if (Hw == false) goto L5;
        abcd.wu.j6(5105403798688451025L, null, new java.lang.Object[]{r10, r11, r12, new java.lang.Boolean(r13), r14, r15});
    L5:
        j6(r10, r11, r12, r13, r10.getResources().getString(com.aide.ui.Ra.dialog_ok), r14, null, r15);
    }

    public static void j6(android.app.Activity r14, java.lang.String r15, java.lang.String r16, boolean r17, java.lang.String r18, java.lang.Runnable r19, java.lang.String r20, java.lang.Runnable r21) {
        if (Hw == false) goto L6;
        abcd.wu.j6(1055828477187536269L, null, new java.lang.Object[]{r14, r15, r16, new java.lang.Boolean(r17), r18, r19, r20, r21});
    L6:
        j6(r14, new com.aide.common.N(r16, r17, r18, r19, r20, r21, r15));
    }

    public static void j6(android.app.Activity r8, java.lang.String r9, java.lang.Throwable r10) {
    L7:
        th = move-exception;
        if (v5 == false) goto L11;
        abcd.wu.j6(th, 3130417175904377728L, null, r8, r9, r10);
    L11:
        throw th;
    L3:
        if (Hw == false) goto L5;
        abcd.wu.j6(3130417175904377728L, null, r8, r9, r10);     // Catch: java.lang.Throwable -> L7
    L5:
        j6(r8, r9, r10.getMessage());     // Catch: java.lang.Throwable -> L7
    }

    public static void j6(android.app.Activity r9, java.lang.String r10, java.util.List<java.lang.String> r11, com.aide.common.ab<java.lang.String> r12) {
    L7:
        th = move-exception;
        if (v5 == false) goto L11;
        abcd.wu.j6(th, -148070399176192040L, null, r9, r10, r11, r12);
    L11:
        throw th;
    L3:
        if (Hw == false) goto L5;
        abcd.wu.j6(-148070399176192040L, null, r9, r10, r11, r12);     // Catch: java.lang.Throwable -> L7
    L5:
        j6(r9, r10, r11, true, r12);     // Catch: java.lang.Throwable -> L7
    }

    public static void j6(android.app.Activity r10, java.lang.String r11, java.util.List<java.lang.String> r12, java.lang.String r13, com.aide.common.ab<java.lang.String> r14) {
    L7:
        th = move-exception;
        if (v5 == false) goto L11;
        abcd.wu.j6(th, -3760047611910473927L, null, r10, r11, r12, r13, r14);
    L11:
        throw th;
    L3:
        if (Hw == false) goto L5;
        abcd.wu.j6(-3760047611910473927L, null, r10, r11, r12, r13, r14);     // Catch: java.lang.Throwable -> L7
    L5:
        j6(r10, new com.aide.common.da(r12, r13, r14, r11));     // Catch: java.lang.Throwable -> L7
    }

    public static void j6(android.app.Activity r12, java.lang.String r13, java.util.List<java.lang.String> r14, java.lang.String r15, com.aide.common.ab<java.lang.Integer> r16, java.lang.Runnable r17) {
        if (Hw == false) goto L5;
        abcd.wu.j6(-2909215533603728327L, null, new java.lang.Object[]{r12, r13, r14, r15, r16, r17});
    L5:
        j6(r12, new com.aide.common.la(r14, r16, r15, r17, r13));
    }

    public static void j6(android.app.Activity r10, java.lang.String r11, java.util.List<java.lang.String> r12, java.util.List<java.lang.Boolean> r13, com.aide.common.ab<java.util.List<java.lang.Integer>> r14) {
    L7:
        th = move-exception;
        if (v5 == false) goto L11;
        abcd.wu.j6(th, 2946678106909654611L, null, r10, r11, r12, r13, r14);
    L11:
        throw th;
    L3:
        if (Hw == false) goto L5;
        abcd.wu.j6(2946678106909654611L, null, r10, r11, r12, r13, r14);     // Catch: java.lang.Throwable -> L7
    L5:
        j6(r10, new com.aide.common.ga(r13, r12, r14, r11));     // Catch: java.lang.Throwable -> L7
    }

    public static void j6(android.app.Activity r5, java.lang.String r6, java.util.List<java.lang.String> r7, java.util.List<java.lang.String> r8, java.lang.String r9, com.aide.common.ab<java.lang.String> r10) {
        if (Hw == false) goto L5;
        abcd.wu.j6(180520758049932960L, null, new java.lang.Object[]{r5, r6, r7, r8, r9, r10});
    L5:
        java.util.ArrayList r0 = new java.util.ArrayList();
        if (r9 != null) goto L8;
        java.util.List r11 = new java.util.ArrayList();
    L9:
        java.util.Iterator<java.lang.String> r1 = r7.iterator();
    L11:
        if (r1.hasNext() == false) goto L13;
        r0.add(java.lang.Boolean.valueOf(r11.contains(r1.next())));
        goto L11
    L13:
        j6(r5, r6, r8, r0, new com.aide.common.I(r10, r7));
        return;
    L8:
        r11 = java.util.Arrays.asList(r9.split("\\|"));
        goto L9
    }

    @abcd.Interfacesu(method = 1784540900011794756L)
    private static void j6(android.app.Activity r10, java.lang.String r11, java.util.List<java.lang.String> r12, boolean r13, com.aide.common.ab<java.lang.String> r14) {
    L7:
        th = move-exception;
        if (v5 == false) goto L11;
        abcd.wu.j6(th, 402897956292350155L, null, r10, r11, r12, new java.lang.Boolean(r13), r14);
    L11:
        throw th;
    L3:
        if (Hw == false) goto L5;
        abcd.wu.j6(402897956292350155L, null, r10, r11, r12, new java.lang.Boolean(r13), r14);     // Catch: java.lang.Throwable -> L7
    L5:
        j6(r10, new com.aide.common.aa(r13, r12, r14, r11));     // Catch: java.lang.Throwable -> L7
    }

    protected abstract android.app.Dialog j6(android.app.Activity r1);
}
