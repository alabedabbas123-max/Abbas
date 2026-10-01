package io.fabric.sdk.android.services.common;

class AdvertisingInfoServiceStrategy implements io.fabric.sdk.android.services.common.e {
    private final android.content.Context j6;

    private static final class a implements android.content.ServiceConnection {
        private final java.util.concurrent.LinkedBlockingQueue<android.os.IBinder> DW;
        private boolean j6;

        private a() {
            this.j6 = false;
            this.DW = new java.util.concurrent.LinkedBlockingQueue(1);
        }

        a(io.fabric.sdk.android.services.common.ClassD r1) {
            this();
        }

        public android.os.IBinder j6() {
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (this.j6 == false) { $pc0 = 5; continue $sw0; }
                        io.fabric.sdk.android.Fabric.getLogger().DW("Fabric", "getBinder already called");
                        $pc0 = 5; continue $sw0;
                    }
                    case 5: {
                        this.j6 = true;
                        return this.DW.poll(200, java.util.concurrent.TimeUnit.MILLISECONDS);
                    }
                    case 8: {
                        return null;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void onServiceConnected(android.content.ComponentName r1, android.os.IBinder r2) {
            this.DW.put(r2);     // Catch: java.lang.InterruptedException -> L4
            return;
        }

        @Override
        public void onServiceDisconnected(android.content.ComponentName r1) {
            this.DW.clear();
        }
    }

    private static final class b implements android.os.IInterface {
        private final android.os.IBinder j6;

        public b(android.os.IBinder r1) {
            this.j6 = r1;
        }

        @Override
        public android.os.IBinder asBinder() {
            return this.j6;
        }

        public java.lang.String getId() {
            android.os.Parcel r0 = null;
            android.os.Parcel r1 = null;
            java.lang.String r2 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        r0 = android.os.Parcel.obtain();
                        r1 = android.os.Parcel.obtain();
                        try {
                            r0.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.j6.transact(1, r0, r1, 0);
                            r1.readException();
                            r2 = r1.readString();
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            if ($t instanceof java.lang.Exception) { $pc1 = 7; continue $sw1; }
                            $pc1 = 5; continue $sw1;
                        }
                        r1.recycle();
                        r0.recycle();
                        $pc1 = 12; continue $sw1;
                    }
                    case 12: {
                        return r2;
                    }
                    case 5: {
                        th = $ex1;
                        r1.recycle();
                        r0.recycle();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 7: {
                        try {
                            io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Could not get parcel from Google Play Service to capture AdvertisingId");
                        } catch (java.lang.Throwable $t) {
                            $ex1 = $t;
                            $pc1 = 5; continue $sw1;
                        }
                        r1.recycle();
                        r0.recycle();
                        r2 = null;
                        { $pc1 = 12; continue $sw1; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public boolean v5() {
            android.os.Parcel r0 = null;
            android.os.Parcel r1 = null;
            boolean r2 = false;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        r0 = android.os.Parcel.obtain();
                        r1 = android.os.Parcel.obtain();
                        r2 = false;
                        try {
                            r0.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            r0.writeInt(1);
                            this.j6.transact(2, r0, r1, 0);
                            r1.readException();
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            if ($t instanceof java.lang.Exception) { $pc2 = 8; continue $sw2; }
                            $pc2 = 6; continue $sw2;
                        }
                        if (r1.readInt() == 0) { $pc2 = 9; continue $sw2; }
                        r2 = true;
                        $pc2 = 9; continue $sw2;
                    }
                    case 9: {
                        r1.recycle();
                        r0.recycle();
                        return r2;
                    }
                    case 6: {
                        th = $ex2;
                        r1.recycle();
                        r0.recycle();
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 8: {
                        try {
                            io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Could not get parcel from Google Play Service to capture Advertising limitAdTracking");
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 6; continue $sw2;
                        }
                        { $pc2 = 9; continue $sw2; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    public AdvertisingInfoServiceStrategy(android.content.Context r1) {
        this.j6 = r1.getApplicationContext();
    }

    @Override
    public io.fabric.sdk.android.services.common.ClassB j6() {
        io.fabric.sdk.android.services.common.AdvertisingInfoServiceStrategy.a r1 = null;
        android.content.Intent r2 = null;
        io.fabric.sdk.android.services.common.AdvertisingInfoServiceStrategy.b r3 = null;
        io.fabric.sdk.android.services.common.ClassB r5 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) { $pc3 = 34; continue $sw3; }
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "AdvertisingInfoServiceStrategy cannot be called on the main thread");
                    return null;
                }
                case 34: {
                    try {
                        this.j6.getPackageManager().getPackageInfo("com.android.vending", 0);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 25; continue $sw3; }
                        if ($t instanceof android.content.pm.PackageManager.NameNotFoundException) { $pc3 = 28; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    r1 = new io.fabric.sdk.android.services.common.AdvertisingInfoServiceStrategy.a(null);
                    r2 = new android.content.Intent("com.google.android.gms.ads.identifier.service.START");
                    r2.setPackage("com.google.android.gms");
                    $pc3 = 24; continue $sw3;
                }
                case 22: {
                    th = $ex3;
                    io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Could not bind to Google Play Service to capture AdvertisingId", th);
                    $pc3 = 24; continue $sw3;
                }
                case 24: {
                    return null;
                }
                case 9: {
                    if (this.j6.bindService(r2, r1, 1) == true) { $pc3 = 31; continue $sw3; }
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Could not bind to Google Play Service to capture AdvertisingId");
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 22; continue $sw3;
                    }
                    { $pc3 = 24; continue $sw3; }
                }
                case 31: {
                    try {
                        r3 = new io.fabric.sdk.android.services.common.AdvertisingInfoServiceStrategy.b(r1.j6());
                        r5 = new io.fabric.sdk.android.services.common.ClassB(r3.getId(), r3.v5());
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.Exception) { $pc3 = 15; continue $sw3; }
                        $pc3 = 13; continue $sw3;
                    }
                    try {
                        this.j6.unbindService(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 22; continue $sw3;
                    }
                    return r5;
                }
                case 15: {
                    e = $ex3;
                    try {
                        io.fabric.sdk.android.Fabric.getLogger().DW("Fabric", "Exception in binding to Google Play Service to capture AdvertisingId", e);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 13; continue $sw3;
                    }
                    try {
                        this.j6.unbindService(r1);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 22; continue $sw3;
                    }
                    { $pc3 = 24; continue $sw3; }
                }
                case 13: {
                    th = $ex3;
                    try {
                        this.j6.unbindService(r1);
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 22; continue $sw3;
                    }
                }
                case 28: {
                    io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Unable to find Google Play Services package name");
                    return null;
                }
                case 25: {
                    e = $ex3;
                    io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Unable to determine if Google Play Services is available", e);
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
