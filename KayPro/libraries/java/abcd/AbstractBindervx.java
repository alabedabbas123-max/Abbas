package abcd;

public abstract class AbstractBindervx extends abcd.Bindersx implements abcd.Interfaceux {
    public static abcd.Interfaceux j6(android.os.IBinder r2) {
        if (r2 != null) goto L5;
        return null;
    L5:
        android.os.IInterface r0 = r2.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        if ((r0 instanceof abcd.Interfaceux) == false) goto L10;
        return (abcd.Interfaceux) r0;
    L10:
        return new abcd.wx(r2);
    }
}
