package io.fabric.sdk.android.services.common;

final class t implements io.fabric.sdk.android.services.common.s {
    private final java.lang.Object DW;
    private final java.lang.reflect.Method j6;

    private t(java.lang.Class r2, java.lang.Object r3) {
        this.DW = r3;
        this.j6 = r2.getDeclaredMethod("isDataCollectionDefaultEnabled", new java.lang.Class[0]);
    }

    public static io.fabric.sdk.android.services.common.s j6(android.content.Context r4) {
        java.lang.Class<?> r5 = r4.getClassLoader().loadClass("com.google.firebase.FirebaseApp");     // Catch: java.lang.Exception -> L5 java.lang.NoSuchMethodException -> L7 java.lang.ClassNotFoundException -> L9
        return new io.fabric.sdk.android.services.common.t(r5, r5.getDeclaredMethod("getInstance", new java.lang.Class[0]).invoke(r5, new java.lang.Object[0]));
    L9:
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Could not find class: com.google.firebase.FirebaseApp");
        return null;
    L7:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Could not find method: " + e.getMessage());
        return null;
    L5:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Unexpected error loading FirebaseApp instance.", e);
        return null;
    }

    @Override
    public boolean j6() {
        return ((java.lang.Boolean) this.j6.invoke(this.DW, new java.lang.Object[0])).booleanValue();
    L5:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Cannot check isDataCollectionDefaultEnabled on FirebaseApp.", e);
        return false;
    }
}
