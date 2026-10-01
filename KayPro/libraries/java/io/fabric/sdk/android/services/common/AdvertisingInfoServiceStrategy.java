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
            if (this.j6 == false) goto L5;
            io.fabric.sdk.android.Fabric.getLogger().DW("Fabric", "getBinder already called");
        L5:
            this.j6 = true;
            return this.DW.poll(200, java.util.concurrent.TimeUnit.MILLISECONDS);
        L8:
            return null;
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
            android.os.Parcel r0 = android.os.Parcel.obtain();
            android.os.Parcel r1 = android.os.Parcel.obtain();
            r0.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");     // Catch: java.lang.Throwable -> L5 java.lang.Exception -> L7
            this.j6.transact(1, r0, r1, 0);     // Catch: java.lang.Throwable -> L5 java.lang.Exception -> L7
            r1.readException();     // Catch: java.lang.Throwable -> L5 java.lang.Exception -> L7
            java.lang.String r2 = r1.readString();     // Catch: java.lang.Throwable -> L5 java.lang.Exception -> L7
            r1.recycle();
            r0.recycle();
        L12:
            return r2;
        L5:
            th = move-exception;
            r1.recycle();
            r0.recycle();
            throw th;
        L7:
            io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Could not get parcel from Google Play Service to capture AdvertisingId");     // Catch: java.lang.Throwable -> L5
            r1.recycle();
            r0.recycle();
            r2 = null;
            goto L12
        }

        public boolean v5() {
            android.os.Parcel r0 = android.os.Parcel.obtain();
            android.os.Parcel r1 = android.os.Parcel.obtain();
            boolean r2 = false;
            r0.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");     // Catch: java.lang.Throwable -> L6 java.lang.Exception -> L8
            r0.writeInt(1);     // Catch: java.lang.Throwable -> L6 java.lang.Exception -> L8
            this.j6.transact(2, r0, r1, 0);     // Catch: java.lang.Throwable -> L6 java.lang.Exception -> L8
            r1.readException();     // Catch: java.lang.Throwable -> L6 java.lang.Exception -> L8
            if (r1.readInt() == 0) goto L9;
            r2 = true;
        L9:
            r1.recycle();
            r0.recycle();
            return r2;
        L6:
            th = move-exception;
            r1.recycle();
            r0.recycle();
            throw th;
        L8:
            io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Could not get parcel from Google Play Service to capture Advertising limitAdTracking");     // Catch: java.lang.Throwable -> L6
            goto L9
        }
    }

    public AdvertisingInfoServiceStrategy(android.content.Context r1) {
        this.j6 = r1.getApplicationContext();
    }

    @Override
    public io.fabric.sdk.android.services.common.ClassB j6() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) goto L34;
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "AdvertisingInfoServiceStrategy cannot be called on the main thread");
        return null;
    L34:
        this.j6.getPackageManager().getPackageInfo("com.android.vending", 0);     // Catch: java.lang.Exception -> L25 android.content.pm.PackageManager.NameNotFoundException -> L28
        io.fabric.sdk.android.services.common.AdvertisingInfoServiceStrategy.a r1 = new io.fabric.sdk.android.services.common.AdvertisingInfoServiceStrategy.a(null);
        android.content.Intent r2 = new android.content.Intent("com.google.android.gms.ads.identifier.service.START");
        r2.setPackage("com.google.android.gms");
    L22:
        th = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Could not bind to Google Play Service to capture AdvertisingId", th);
    L24:
        return null;
    L9:
        if (this.j6.bindService(r2, r1, 1) == true) goto L31;
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Could not bind to Google Play Service to capture AdvertisingId");     // Catch: java.lang.Throwable -> L22
        goto L24
    L31:
        io.fabric.sdk.android.services.common.AdvertisingInfoServiceStrategy.b r3 = new io.fabric.sdk.android.services.common.AdvertisingInfoServiceStrategy.b(r1.j6());     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
        io.fabric.sdk.android.services.common.ClassB r5 = new io.fabric.sdk.android.services.common.ClassB(r3.getId(), r3.v5());     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L15
        this.j6.unbindService(r1);     // Catch: java.lang.Throwable -> L22
        return r5;
    L15:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().DW("Fabric", "Exception in binding to Google Play Service to capture AdvertisingId", e);     // Catch: java.lang.Throwable -> L13
        this.j6.unbindService(r1);     // Catch: java.lang.Throwable -> L22
        goto L24
    L13:
        th = move-exception;
        this.j6.unbindService(r1);     // Catch: java.lang.Throwable -> L22
        throw th;     // Catch: java.lang.Throwable -> L22
    L28:
        io.fabric.sdk.android.Fabric.getLogger().Hw("Fabric", "Unable to find Google Play Services package name");
        return null;
    L25:
        e = move-exception;
        io.fabric.sdk.android.Fabric.getLogger().j6("Fabric", "Unable to determine if Google Play Services is available", e);
        return null;
    }
}
