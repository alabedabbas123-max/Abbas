package com.aide.common;

@abcd.Interfacexu
public class ClassC {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.common.ClassC.class, -1052730398773059792L, -1052730398773059792L);
    }

    public ClassC() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2962499628609957195L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2962499628609957195L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static void j6(android.app.Activity r10, int r11, java.lang.String r12, java.lang.String r13, boolean r14) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -4398990657079797208L, null, r10, new java.lang.Integer(r11), r12, r13, new java.lang.Boolean(r14));
    L14:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-4398990657079797208L, null, r10, new java.lang.Integer(r11), r12, r13, new java.lang.Boolean(r14));     // Catch: java.lang.Throwable -> L10
    L5:
        android.content.Intent r0 = new android.content.Intent();     // Catch: java.lang.Throwable -> L10
        r0.putExtra("EXTRA_LINKID", r13);     // Catch: java.lang.Throwable -> L10
        r0.putExtra("EXTRA_IS_OPTIONAL_OFFER", r14);     // Catch: java.lang.Throwable -> L10
        r0.setComponent(new android.content.ComponentName(r10, "com.aide.ui.activities.ShopLearningPopupActivity"));     // Catch: java.lang.Throwable -> L10
        r0.putExtra("EXTRA_FEATURE", r12);     // Catch: java.lang.Throwable -> L10
        r0.putExtra("EXTRA_SHOW_PRIME_MONTHLY", true);     // Catch: java.lang.Throwable -> L10
        r0.putExtra("EXTRA_SHOW_PRIME_YEARLY", true);     // Catch: java.lang.Throwable -> L10
        if (r11 != 0) goto L8;
        r10.startActivity(r0);     // Catch: java.lang.Throwable -> L10
        return;
    L8:
        r10.startActivityForResult(r0, r11);     // Catch: java.lang.Throwable -> L10
    }

    public static void j6(android.app.Activity r10, int r11, java.lang.String r12, boolean r13, boolean r14) {
    L10:
        th = move-exception;
        if (DW == false) goto L14;
        abcd.wu.j6(th, -1613045651623607565L, null, r10, new java.lang.Integer(r11), r12, new java.lang.Boolean(r13), new java.lang.Boolean(r14));
    L14:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1613045651623607565L, null, r10, new java.lang.Integer(r11), r12, new java.lang.Boolean(r13), new java.lang.Boolean(r14));     // Catch: java.lang.Throwable -> L10
    L5:
        android.content.Intent r0 = new android.content.Intent();     // Catch: java.lang.Throwable -> L10
        r0.putExtra("EXTRA_LINKID", r12);     // Catch: java.lang.Throwable -> L10
        r0.putExtra("EXTRA_HILIGHT_ADS", r13);     // Catch: java.lang.Throwable -> L10
        r0.putExtra("EXTRA_IS_OPTIONAL_OFFER", r14);     // Catch: java.lang.Throwable -> L10
        r0.setComponent(new android.content.ComponentName(r10, "com.aide.ui.activities.ShopExpertPopupActivity"));     // Catch: java.lang.Throwable -> L10
        if (r11 != 0) goto L8;
        r10.startActivity(r0);     // Catch: java.lang.Throwable -> L10
        return;
    L8:
        r10.startActivityForResult(r0, r11);     // Catch: java.lang.Throwable -> L10
    }
}
