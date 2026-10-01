package com.crashlytics.android.core;

class la implements java.lang.reflect.InvocationHandler {
    final com.crashlytics.android.core.ma j6;

    la(com.crashlytics.android.core.ma r1) {
        this.j6 = r1;
    }

    @Override
    public java.lang.Object invoke(java.lang.Object r6, java.lang.reflect.Method r7, java.lang.Object[] r8) {
        java.lang.String r9 = null;
        int r0 = 0;
        java.lang.StringBuilder r10 = null;
        java.lang.String r11 = null;
        java.lang.String r1 = null;
        android.os.Bundle r2 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r9 = r7.getName();
                    r0 = 0;
                    if (r8 != null) { $pc0 = 6; continue $sw0; }
                    r8 = new java.lang.Object[0];
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    if (r8.length != 1) { $pc0 = 12; continue $sw0; }
                    if (r9.equals("equals") == false) { $pc0 = 12; continue $sw0; }
                    return java.lang.Boolean.valueOf(j6(r6, r8[0]));
                }
                case 12: {
                    if (r8.length != 0) { $pc0 = 18; continue $sw0; }
                    if (r9.equals("hashCode") == false) { $pc0 = 18; continue $sw0; }
                    return java.lang.Integer.valueOf(super.hashCode());
                }
                case 18: {
                    if (r8.length != 0) { $pc0 = 24; continue $sw0; }
                    if (r9.equals("toString") == false) { $pc0 = 24; continue $sw0; }
                    return super.toString();
                }
                case 24: {
                    if (r8.length == 4) { $pc0 = 26; continue $sw0; }
                    $pc0 = 35; continue $sw0;
                }
                case 35: {
                    r10 = new java.lang.StringBuilder("Unexpected method invoked on AppMeasurement.EventListener: " + r9 + "(");
                    $pc0 = 37; continue $sw0;
                }
                case 37: {
                    if (r0 >= r8.length) { $pc0 = 41; continue $sw0; }
                    if (r0 <= 0) { $pc0 = 40; continue $sw0; }
                    r10.append(", ");
                    $pc0 = 40; continue $sw0;
                }
                case 40: {
                    r10.append(r8[r0].getClass().getName());
                    r0 = r0 + 1;
                    { $pc0 = 37; continue $sw0; }
                }
                case 41: {
                    r10.append("); returning null");
                    io.fabric.sdk.android.Fabric.getLogger().DW("CrashlyticsCore", r10.toString());
                    return null;
                }
                case 26: {
                    if (r9.equals("onEvent") == false) { $pc0 = 35; continue $sw0; }
                    if (com.crashlytics.android.core.ma.j6(r8) == false) { $pc0 = 35; continue $sw0; }
                    r11 = (java.lang.String) r8[0];
                    r1 = (java.lang.String) r8[1];
                    r2 = (android.os.Bundle) r8[2];
                    if (r11 == null) { $pc0 = 35; continue $sw0; }
                    if (r11.equals("crash") == true) { $pc0 = 35; continue $sw0; }
                    com.crashlytics.android.core.ma.j6(com.crashlytics.android.core.ma.j6(this.j6), r1, r2);
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(java.lang.Object r2, java.lang.Object r3) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r2 != r3) { $pc1 = 5; continue $sw1; }
                    return true;
                }
                case 5: {
                    if (r3 != null) { $pc1 = 7; continue $sw1; }
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    return false;
                }
                case 7: {
                    if (java.lang.reflect.Proxy.isProxyClass(r3.getClass()) == false) { $pc1 = 11; continue $sw1; }
                    if (super.equals(java.lang.reflect.Proxy.getInvocationHandler(r3)) == false) { $pc1 = 11; continue $sw1; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
