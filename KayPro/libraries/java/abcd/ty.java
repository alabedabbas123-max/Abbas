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
        synchronized (abcd.ty.class) {
            android.os.Bundle r1 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        com.google.android.gms.common.internal.r.j6(r5);
                        com.google.android.gms.common.internal.r.j6(r6);
                        com.google.android.gms.common.internal.r.j6(r7);
                        com.google.android.gms.common.internal.r.j6(r6.getApplicationContext());
                        if (j6 != null) { $pc0 = 18; continue $sw0; }
                        $pc0 = 7; continue $sw0;
                    }
                    case 14: {
                        th = $ex0;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 7: {
                        if (j6 != null) { $pc0 = 12; continue $sw0; }
                        try {
                            r1 = new android.os.Bundle(1);
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 14; continue $sw0;
                        }
                        if (r5.Hw() == false) { $pc0 = 11; continue $sw0; }
                        try {
                            r7.j6(com.google.firebase.a.class, abcd.Executoruy.j6, abcd.vy.j6);
                            r1.putBoolean("dataCollectionDefaultEnabled", r5.isDataCollectionDefaultEnabled());
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 14; continue $sw0;
                        }
                        $pc0 = 11; continue $sw0;
                    }
                    case 11: {
                        try {
                            j6 = new abcd.ty(com.google.android.gms.measurement.internal.zzbw.zza(r6, com.google.android.gms.measurement.internal.zzan.zzc(r1)).zzkm());
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 14; continue $sw0;
                        }
                        $pc0 = 12; continue $sw0;
                    }
                    case 12: {
                        try {
                        } catch (java.lang.Throwable $t) {
                            $ex0 = $t;
                            $pc0 = 14; continue $sw0;
                        }
                        $pc0 = 18; continue $sw0;
                    }
                    case 18: {
                        return j6;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }

    static final void j6(abcd.wy r2) {
        synchronized (abcd.ty.class) {
            boolean r3 = false;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r3 = ((com.google.firebase.a) r2.j6()).j6;
                        try {
                            ((abcd.ty) j6).DW.zzd(r3);
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 7; continue $sw1;
                        }
                        return;
                    }
                    case 7: {
                        th = $ex1;
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
    
        }
    }
}
