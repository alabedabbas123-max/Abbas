package com.crashlytics.android.answers;

public class o implements com.crashlytics.android.answers.u {
    private final java.lang.Object DW;
    private final java.lang.reflect.Method j6;

    public o(java.lang.Object r1, java.lang.reflect.Method r2) {
        this.DW = r1;
        this.j6 = r2;
    }

    private static java.lang.Class DW(android.content.Context r1) {
        return r1.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement");
    L4:
        return null;
    }

    private static java.lang.reflect.Method DW(android.content.Context r3, java.lang.Class r4) {
        return r4.getDeclaredMethod("logEventInternal", new java.lang.Class[]{java.lang.String.class, java.lang.String.class, android.os.Bundle.class});
    L4:
        return null;
    }

    public static com.crashlytics.android.answers.u j6(android.content.Context r3) {
        java.lang.Class r0 = DW(r3);
        if (r0 != null) goto L5;
        return null;
    L5:
        java.lang.Object r2 = j6(r3, r0);
        if (r2 != null) goto L8;
        return null;
    L8:
        java.lang.reflect.Method r4 = DW(r3, r0);
        if (r4 != null) goto L12;
        return null;
    L12:
        return new com.crashlytics.android.answers.o(r2, r4);
    }

    private static java.lang.Object j6(android.content.Context r5, java.lang.Class r6) {
        return r6.getDeclaredMethod("getInstance", new java.lang.Class[]{android.content.Context.class}).invoke(r6, new java.lang.Object[]{r5});
    L4:
        return null;
    }

    @Override
    public void j6(java.lang.String r2, android.os.Bundle r3) {
        j6("fab", r2, r3);
    }

    @Override
    public void j6(java.lang.String r5, java.lang.String r6, android.os.Bundle r7) {
        this.j6.invoke(this.DW, new java.lang.Object[]{r5, r6, r7});     // Catch: java.lang.Exception -> L4
        return;
    }
}
