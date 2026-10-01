package abcd;

public interface InterfacebQ extends android.os.IInterface {

    public static abstract class a extends android.os.Binder implements abcd.InterfacebQ {

        private static class C0004a implements abcd.InterfacebQ {
            private android.os.IBinder j6;

            C0004a(android.os.IBinder r1) {
                this.j6 = r1;
            }

            @Override
            public android.os.IBinder asBinder() {
                return this.j6;
            }

            @Override
            public void j6(java.lang.String r4, abcd.InterfacecQ r5) {
                android.os.Parcel r0 = android.os.Parcel.obtain();
                android.os.Parcel r1 = android.os.Parcel.obtain();
                r0.writeInterfaceToken("tv.ouya.console.internal.IIapServiceDefinition");     // Catch: java.lang.Throwable -> L10
                r0.writeString(r4);     // Catch: java.lang.Throwable -> L10
                if (r5 == null) goto L6;
                android.os.IBinder r6 = r5.asBinder();     // Catch: java.lang.Throwable -> L10
            L7:
                r0.writeStrongBinder(r6);     // Catch: java.lang.Throwable -> L10
                this.j6.transact(4, r0, r1, 0);     // Catch: java.lang.Throwable -> L10
                r1.readException();     // Catch: java.lang.Throwable -> L10
                r1.recycle();
                r0.recycle();
                return;
            L6:
                r6 = null;
            L10:
                th = move-exception;
                r1.recycle();
                r0.recycle();
                throw th;
            }
        }

        public static abcd.InterfacebQ j6(android.os.IBinder r2) {
            if (r2 != null) goto L5;
            return null;
        L5:
            android.os.IInterface r0 = r2.queryLocalInterface("tv.ouya.console.internal.IIapServiceDefinition");
            if (r0 == null) goto L12;
            if ((r0 instanceof abcd.InterfacebQ) == false) goto L12;
            return (abcd.InterfacebQ) r0;
        L12:
            return new abcd.InterfacebQ.a.C0004a(r2);
        }
    }

    void j6(java.lang.String r1, abcd.InterfacecQ r2);
}
