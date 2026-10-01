package abcd;

public interface Interfacedx extends android.os.IInterface {

    public static abstract class a extends android.os.Binder implements abcd.Interfacedx {

        private static class C0007a implements abcd.Interfacedx {
            private android.os.IBinder j6;

            C0007a(android.os.IBinder r1) {
                this.j6 = r1;
            }

            @Override
            public android.os.Bundle Zo(android.os.Bundle r5) {
                android.os.Parcel r0 = android.os.Parcel.obtain();
                android.os.Parcel r1 = android.os.Parcel.obtain();
                r0.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");     // Catch: java.lang.Throwable -> L14
                if (r5 == null) goto L6;
                r0.writeInt(1);     // Catch: java.lang.Throwable -> L14
                r5.writeToParcel(r0, 0);     // Catch: java.lang.Throwable -> L14
            L7:
                this.j6.transact(1, r0, r1, 0);     // Catch: java.lang.Throwable -> L14
                r1.readException();     // Catch: java.lang.Throwable -> L14
                if (r1.readInt() == 0) goto L11;
                android.os.Bundle r6 = (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(r1);     // Catch: java.lang.Throwable -> L14
            L12:
                r1.recycle();
                r0.recycle();
                return r6;
            L11:
                r6 = null;
                goto L12
            L6:
                r0.writeInt(0);     // Catch: java.lang.Throwable -> L14
            L14:
                th = move-exception;
                r1.recycle();
                r0.recycle();
                throw th;
            }

            @Override
            public android.os.IBinder asBinder() {
                return this.j6;
            }
        }

        public static abcd.Interfacedx j6(android.os.IBinder r2) {
            if (r2 != null) goto L5;
            return null;
        L5:
            android.os.IInterface r0 = r2.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (r0 == null) goto L12;
            if ((r0 instanceof abcd.Interfacedx) == false) goto L12;
            return (abcd.Interfacedx) r0;
        L12:
            return new abcd.Interfacedx.a.C0007a(r2);
        }
    }

    android.os.Bundle Zo(android.os.Bundle r1);
}
