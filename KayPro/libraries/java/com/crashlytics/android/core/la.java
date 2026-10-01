package com.crashlytics.android.core;

class la implements java.lang.reflect.InvocationHandler {
    final com.crashlytics.android.core.ma j6;

    la(com.crashlytics.android.core.ma r1) {
        this.j6 = r1;
    }

    @Override
    public java.lang.Object invoke(java.lang.Object r6, java.lang.reflect.Method r7, java.lang.Object[] r8) {
        java.lang.String r9 = r7.getName();
        int r0 = 0;
        if (r8 != null) goto L6;
        r8 = new java.lang.Object[0];
    L6:
        if (r8.length != 1) goto L12;
        if (r9.equals("equals") == false) goto L12;
        return java.lang.Boolean.valueOf(j6(r6, r8[0]));
    L12:
        if (r8.length != 0) goto L18;
        if (r9.equals("hashCode") == false) goto L18;
        return java.lang.Integer.valueOf(super.hashCode());
    L18:
        if (r8.length != 0) goto L24;
        if (r9.equals("toString") == false) goto L24;
        return super.toString();
    L24:
        if (r8.length == 4) goto L26;
    L35:
        java.lang.StringBuilder r10 = new java.lang.StringBuilder("Unexpected method invoked on AppMeasurement.EventListener: " + r9 + "(");
    L37:
        if (r0 >= r8.length) goto L41;
        if (r0 <= 0) goto L40;
        r10.append(", ");
    L40:
        r10.append(r8[r0].getClass().getName());
        r0 = r0 + 1;
        goto L37
    L41:
        r10.append("); returning null");
        io.fabric.sdk.android.Fabric.getLogger().DW("CrashlyticsCore", r10.toString());
        return null;
    L26:
        if (r9.equals("onEvent") == false) goto L35;
        if (com.crashlytics.android.core.ma.j6(r8) == false) goto L35;
        java.lang.String r11 = (java.lang.String) r8[0];
        java.lang.String r1 = (java.lang.String) r8[1];
        android.os.Bundle r2 = (android.os.Bundle) r8[2];
        if (r11 == null) goto L35;
        if (r11.equals("crash") == true) goto L35;
        com.crashlytics.android.core.ma.j6(com.crashlytics.android.core.ma.j6(this.j6), r1, r2);
        return null;
    }

    public boolean j6(java.lang.Object r2, java.lang.Object r3) {
        if (r2 != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
    L11:
        return false;
    L7:
        if (java.lang.reflect.Proxy.isProxyClass(r3.getClass()) == false) goto L11;
        if (super.equals(java.lang.reflect.Proxy.getInvocationHandler(r3)) == false) goto L11;
        return true;
    }
}
