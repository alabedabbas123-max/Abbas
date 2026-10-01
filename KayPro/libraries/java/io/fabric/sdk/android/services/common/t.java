package io.fabric.sdk.android.services.common;

final class t implements io.fabric.sdk.android.services.common.s {
    private final java.lang.Object DW;
    private final java.lang.reflect.Method j6;

    private t(java.lang.Class r2, java.lang.Object r3) {
        this.DW = r3;
        this.j6 = r2.getDeclaredMethod("isDataCollectionDefaultEnabled", new java.lang.Class[0]);
    }

    public static io.fabric.sdk.android.services.common.s j6(android.content.Context r4) {
        java.lang.Class<?> r5 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    try {
                        r5 = r4.getClassLoader().loadClass("com.google.firebase.FirebaseApp");
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        if ($t instanceof java.lang.Exception) { $pc0 = 5; continue $sw0; }
                        if ($t instanceof java.lang.NoSuchMethodException) { $pc0 = 7; continue $sw0; }
                        if ($t instanceof java.lang.ClassNotFoundException) { $pc0 = 9; continue $sw0; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return new io.fabric.sdk.android.services.common.t(r5, r5.getDeclaredMethod("getInstance", new java.lang.Class[0]).invoke(r5, new java.lang.Object[0]));
                }
                case 9: {
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Could not find class: com.google.firebase.FirebaseApp");
                    return null;
                }
                case 7: {
                    e = $ex0;
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Could not find method: " + e.getMessage());
                    return null;
                }
                case 5: {
                    e = $ex0;
                    io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Unexpected error loading FirebaseApp instance.", e);
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean j6() {
        java.lang.Throwable e = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    return ((java.lang.Boolean) this.j6.invoke(this.DW, new java.lang.Object[0])).booleanValue();
                }
                case 5: {
                    e = $ex1;
                    io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Cannot check isDataCollectionDefaultEnabled on FirebaseApp.", e);
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
