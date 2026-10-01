package abcd;

public class ty implements abcd.Interfacesy {
    private static volatile abcd.Interfacesy j6;
    private final com.google.android.gms.measurement.AppMeasurement DW;
    final java.util.Map<java.lang.String, java.lang.Object> FH;

    private ty(com.google.android.gms.measurement.AppMeasurement r1) {
        com.google.android.gms.common.internal.r.j6(r1);
        this.DW = r1;
        this.FH = new java.util.concurrent.ConcurrentHashMap();
    }

    public static abcd.Interfacesy j6(com.google.firebase.FirebaseApp r5, android.content.Context r6, abcd.Interfacezy r7) {
        com.google.android.gms.common.internal.r.j6(r5);
        com.google.android.gms.common.internal.r.j6(r6);
        com.google.android.gms.common.internal.r.j6(r7);
        com.google.android.gms.common.internal.r.j6(r6.getApplicationContext());
        if (j6 != null) goto L18;
        monitor-enter(abcd.ty.class);
    L14:
        th = move-exception;
        throw th;
    L7:
        if (j6 != null) goto L12;
        android.os.Bundle r1 = new android.os.Bundle(1);     // Catch: java.lang.Throwable -> L14
        if (r5.Hw() == false) goto L11;
        r7.j6(com.google.firebase.a.class, abcd.Executoruy.j6, abcd.vy.j6);     // Catch: java.lang.Throwable -> L14
        r1.putBoolean("dataCollectionDefaultEnabled", r5.isDataCollectionDefaultEnabled());     // Catch: java.lang.Throwable -> L14
    L11:
        j6 = new abcd.ty(com.google.android.gms.measurement.internal.zzbw.zza(r6, com.google.android.gms.measurement.internal.zzan.zzc(r1)).zzkm());     // Catch: java.lang.Throwable -> L14
    L12:
        monitor-exit(abcd.ty.class);     // Catch: java.lang.Throwable -> L14
    L18:
        return j6;
    }

    static final void j6(abcd.wy r2) {
        boolean r3 = ((com.google.firebase.a) r2.j6()).j6;
        monitor-enter(abcd.ty.class);
        ((abcd.ty) j6).DW.zzd(r3);     // Catch: java.lang.Throwable -> L7
        monitor-exit(abcd.ty.class);     // Catch: java.lang.Throwable -> L7
        return;
    L7:
        th = move-exception;
        throw th;
    }
}
