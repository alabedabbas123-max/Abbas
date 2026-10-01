package abcd;

public class rx implements android.os.IInterface {
    private final java.lang.String DW;
    private final android.os.IBinder j6;

    protected rx(android.os.IBinder r1, java.lang.String r2) {
        this.j6 = r1;
        this.DW = r2;
    }

    @Override
    public android.os.IBinder asBinder() {
        return this.j6;
    }

    protected final android.os.Parcel j6(int r4, android.os.Parcel r5) {
        android.os.Parcel r0 = android.os.Parcel.obtain();
        this.j6.transact(r4, r5, r0, 0);     // Catch: java.lang.Throwable -> L6 java.lang.RuntimeException -> L8
        r0.readException();     // Catch: java.lang.Throwable -> L6 java.lang.RuntimeException -> L8
        r5.recycle();
        return r0;
    L6:
        th = move-exception;
        r5.recycle();
        throw th;
    L8:
        e = move-exception;
        r0.recycle();     // Catch: java.lang.Throwable -> L6
        throw e;     // Catch: java.lang.Throwable -> L6
    }

    protected final android.os.Parcel v5() {
        android.os.Parcel r0 = android.os.Parcel.obtain();
        r0.writeInterfaceToken(this.DW);
        return r0;
    }
}
