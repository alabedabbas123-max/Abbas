package com.crashlytics.android.core;

class ma implements com.crashlytics.android.core.Interfaceb {
    private static final java.util.List<java.lang.Class<?>> j6 = null;
    private final com.crashlytics.android.core.ca DW;
    private java.lang.Object FH;

    static {
        j6 = java.util.Collections.unmodifiableList(java.util.Arrays.asList(new java.lang.Class[]{java.lang.String.class, java.lang.String.class, android.os.Bundle.class, java.lang.Long.class}));
    }

    public ma(com.crashlytics.android.core.ca r1) {
        this.DW = r1;
    }

    private java.lang.Object DW(java.lang.Class<?> r6) {
        return r6.getDeclaredMethod("getInstance", new java.lang.Class[]{android.content.Context.class}).invoke(r6, new java.lang.Object[]{this.DW.getContext()});
    L4:
        return null;
    }

    private static void DW(com.crashlytics.android.core.ca r2, java.lang.String r3, android.os.Bundle r4) {
        r2.log("$A$:" + j6(r3, r4));     // Catch: org.json.JSONException -> L4
        return;
    L4:
        io.fabric.sdk.android.Fabric.getLogger().j6("CrashlyticsCore", "Unable to serialize Firebase Analytics event; " + r3);
    }

    static com.crashlytics.android.core.ca j6(com.crashlytics.android.core.ma r0) {
        return r0.DW;
    }

    private java.lang.Class<?> j6(java.lang.String r2) {
        return this.DW.getContext().getClassLoader().loadClass(r2);
    L4:
        return null;
    }

    private static java.lang.String j6(java.lang.String r5, android.os.Bundle r6) {
        org.json.JSONObject r0 = new org.json.JSONObject();
        org.json.JSONObject r1 = new org.json.JSONObject();
        java.util.Iterator<java.lang.String> r2 = r6.keySet().iterator();
    L4:
        if (r2.hasNext() == false) goto L6;
        java.lang.String r3 = r2.next();
        r1.put(r3, r6.get(r3));
        goto L4
    L6:
        r0.put("name", r5);
        r0.put("parameters", r1);
        return r0.toString();
    }

    static void j6(com.crashlytics.android.core.ca r0, java.lang.String r1, android.os.Bundle r2) {
        DW(r0, r1, r2);
    }

    static boolean j6(java.lang.Object[] r6) {
        if (r6.length == j6.size()) goto L5;
        return false;
    L5:
        java.util.Iterator<java.lang.Class<?>> r0 = j6.iterator();
        int r1 = r6.length;
        int r3 = 0;
    L6:
        if (r3 >= r1) goto L11;
        if (r6[r3].getClass().equals(r0.next()) == false) goto L9;
        r3 = r3 + 1;
        goto L6
    L9:
        return false;
    L11:
        return true;
    }

    synchronized java.lang.Object j6(java.lang.Class r4) {
        monitor-enter(this);
    L9:
        th = move-exception;
        throw th;
    L4:
        if (this.FH != null) goto L6;
        this.FH = java.lang.reflect.Proxy.newProxyInstance(this.DW.getContext().getClassLoader(), new java.lang.Class[]{r4}, new com.crashlytics.android.core.la(this));     // Catch: java.lang.Throwable -> L9
    L6:
        java.lang.Object r5 = this.FH;     // Catch: java.lang.Throwable -> L9
        monitor-exit(this);
        return r5;
    }

    @Override
    public boolean j6() {
        java.lang.Class<?> r0 = j6("com.google.android.gms.measurement.AppMeasurement");
        if (r0 != null) goto L6;
        io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Firebase Analytics is not present; you will not see automatic logging of events before a crash occurs.");
        return false;
    L6:
        java.lang.Object r3 = DW(r0);
        if (r3 != null) goto L10;
        io.fabric.sdk.android.Fabric.getLogger().j6("CrashlyticsCore", "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: Could not create an instance of Firebase Analytics.");
        return false;
    L10:
        java.lang.Class<?> r4 = j6("com.google.android.gms.measurement.AppMeasurement$OnEventListener");
        if (r4 != null) goto L23;
        io.fabric.sdk.android.Fabric.getLogger().j6("CrashlyticsCore", "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: Could not get class com.google.android.gms.measurement.AppMeasurement$OnEventListener");
        return false;
    L23:
        r0.getDeclaredMethod("registerOnMeasurementEventListener", new java.lang.Class[]{r4}).invoke(r3, new java.lang.Object[]{j6(r4)});     // Catch: java.lang.Exception -> L17 java.lang.NoSuchMethodException -> L20
    L19:
        return true;
    L20:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().DW("CrashlyticsCore", "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: Method registerOnMeasurementEventListener not found.", e);
        return false;
    L17:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().DW("CrashlyticsCore", "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: " + e.getMessage(), e);
        goto L19
    }
}
