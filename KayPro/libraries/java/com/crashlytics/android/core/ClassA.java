package com.crashlytics.android.core;

class ClassA {
    public final java.lang.String DW;
    public final java.lang.String FH;
    public final java.lang.String Hw;
    public final java.lang.String Zo;
    public final java.lang.String j6;
    public final java.lang.String v5;

    ClassA(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        this.j6 = r1;
        this.DW = r2;
        this.FH = r3;
        this.Hw = r4;
        this.v5 = r5;
        this.Zo = r6;
    }

    public static com.crashlytics.android.core.ClassA j6(android.content.Context r7, io.fabric.sdk.android.services.common.v r8, java.lang.String r9, java.lang.String r10) {
        java.lang.String r4 = null;
        java.lang.String r3 = null;
        android.content.pm.PackageInfo r11 = null;
        java.lang.String r5 = null;
        java.lang.String r12 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r4 = r7.getPackageName();
                    r3 = r8.Zo();
                    r11 = r7.getPackageManager().getPackageInfo(r4, 0);
                    r5 = java.lang.Integer.toString(r11.versionCode);
                    r12 = r11.versionName;
                    if (r12 != null) { $pc0 = 6; continue $sw0; }
                    r12 = "0.0";
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return new com.crashlytics.android.core.ClassA(r9, r10, r3, r4, r5, r12);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
