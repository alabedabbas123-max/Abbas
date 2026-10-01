package abcd;

public final class wx extends abcd.rx implements abcd.Interfaceux {
    wx(android.os.IBinder r2) {
        super(r2, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override
    public final boolean J0(boolean r2) {
        android.os.Parcel r3 = v5();
        abcd.tx.j6(r3, true);
        android.os.Parcel r4 = j6(2, r3);
        boolean r0 = abcd.tx.j6(r4);
        r4.recycle();
        return r0;
    }

    @Override
    public final java.lang.String getId() {
        android.os.Parcel r0 = j6(1, v5());
        java.lang.String r1 = r0.readString();
        r0.recycle();
        return r1;
    }

    @Override
    public final boolean j6() {
        android.os.Parcel r0 = j6(6, v5());
        boolean r1 = abcd.tx.j6(r0);
        r0.recycle();
        return r1;
    }
}
