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
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    return r6.getDeclaredMethod("getInstance", new java.lang.Class[]{android.content.Context.class}).invoke(r6, new java.lang.Object[]{this.DW.getContext()});
                }
                case 4: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void DW(com.crashlytics.android.core.ca r2, java.lang.String r3, android.os.Bundle r4) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    try {
                        r2.log("$A$:" + j6(r3, r4));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof org.json.JSONException) { $pc1 = 4; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return;
                }
                case 4: {
                    io.fabric.sdk.android.Fabric.getLogger().j6("CrashlyticsCore", "Unable to serialize Firebase Analytics event; " + r3);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static com.crashlytics.android.core.ca j6(com.crashlytics.android.core.ma r0) {
        return r0.DW;
    }

    private java.lang.Class<?> j6(java.lang.String r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    return this.DW.getContext().getClassLoader().loadClass(r2);
                }
                case 4: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.lang.String j6(java.lang.String r5, android.os.Bundle r6) {
        org.json.JSONObject r0 = null;
        org.json.JSONObject r1 = null;
        java.util.Iterator<java.lang.String> r2 = null;
        java.lang.String r3 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = new org.json.JSONObject();
                    r1 = new org.json.JSONObject();
                    r2 = r6.keySet().iterator();
                    $pc3 = 4; continue $sw3;
                }
                case 4: {
                    if (r2.hasNext() == false) { $pc3 = 6; continue $sw3; }
                    r3 = r2.next();
                    r1.put(r3, r6.get(r3));
                    { $pc3 = 4; continue $sw3; }
                }
                case 6: {
                    r0.put("name", r5);
                    r0.put("parameters", r1);
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(com.crashlytics.android.core.ca r0, java.lang.String r1, android.os.Bundle r2) {
        DW(r0, r1, r2);
    }

    static boolean j6(java.lang.Object[] r6) {
        java.util.Iterator<java.lang.Class<?>> r0 = null;
        int r1 = 0;
        int r3 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    if (r6.length == j6.size()) { $pc4 = 5; continue $sw4; }
                    return false;
                }
                case 5: {
                    r0 = j6.iterator();
                    r1 = r6.length;
                    r3 = 0;
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if (r3 >= r1) { $pc4 = 11; continue $sw4; }
                    if (r6[r3].getClass().equals(r0.next()) == false) { $pc4 = 9; continue $sw4; }
                    r3 = r3 + 1;
                    { $pc4 = 6; continue $sw4; }
                }
                case 9: {
                    return false;
                }
                case 11: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    synchronized java.lang.Object j6(java.lang.Class r4) {
        java.lang.Object r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    monitor-enter(this);
                    $pc5 = 9; continue $sw5;
                }
                case 9: {
                    th = $ex5;
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (this.FH != null) { $pc5 = 6; continue $sw5; }
                    try {
                        this.FH = java.lang.reflect.Proxy.newProxyInstance(this.DW.getContext().getClassLoader(), new java.lang.Class[]{r4}, new com.crashlytics.android.core.la(this));
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 9; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    try {
                        r5 = this.FH;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 9; continue $sw5;
                    }
                    monitor-exit(this);
                    return r5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean j6() {
        java.lang.Class<?> r0 = null;
        java.lang.Object r3 = null;
        java.lang.Class<?> r4 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = j6("com.google.android.gms.measurement.AppMeasurement");
                    if (r0 != null) { $pc6 = 6; continue $sw6; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("CrashlyticsCore", "Firebase Analytics is not present; you will not see automatic logging of events before a crash occurs.");
                    return false;
                }
                case 6: {
                    r3 = DW(r0);
                    if (r3 != null) { $pc6 = 10; continue $sw6; }
                    io.fabric.sdk.android.Fabric.getLogger().j6("CrashlyticsCore", "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: Could not create an instance of Firebase Analytics.");
                    return false;
                }
                case 10: {
                    r4 = j6("com.google.android.gms.measurement.AppMeasurement$OnEventListener");
                    if (r4 != null) { $pc6 = 23; continue $sw6; }
                    io.fabric.sdk.android.Fabric.getLogger().j6("CrashlyticsCore", "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: Could not get class com.google.android.gms.measurement.AppMeasurement$OnEventListener");
                    return false;
                }
                case 23: {
                    try {
                        r0.getDeclaredMethod("registerOnMeasurementEventListener", new java.lang.Class[]{r4}).invoke(r3, new java.lang.Object[]{j6(r4)});
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        if ($t instanceof java.lang.Exception) { $pc6 = 17; continue $sw6; }
                        if ($t instanceof java.lang.NoSuchMethodException) { $pc6 = 20; continue $sw6; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc6 = 19; continue $sw6;
                }
                case 19: {
                    return true;
                }
                case 20: {
                    e = $ex6;
                    io.fabric.sdk.android.Fabric.getLogger().DW("CrashlyticsCore", "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: Method registerOnMeasurementEventListener not found.", e);
                    return false;
                }
                case 17: {
                    e = $ex6;
                    io.fabric.sdk.android.Fabric.getLogger().DW("CrashlyticsCore", "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: " + e.getMessage(), e);
                    { $pc6 = 19; continue $sw6; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
