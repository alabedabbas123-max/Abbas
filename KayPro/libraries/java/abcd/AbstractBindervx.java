package abcd;

public abstract class AbstractBindervx extends abcd.Bindersx implements abcd.Interfaceux {
    public static abcd.Interfaceux j6(android.os.IBinder r2) {
        android.os.IInterface r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (r2 != null) { $pc0 = 5; continue $sw0; }
                    return null;
                }
                case 5: {
                    r0 = r2.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    if ((r0 instanceof abcd.Interfaceux) == false) { $pc0 = 10; continue $sw0; }
                    return (abcd.Interfaceux) r0;
                }
                case 10: {
                    return new abcd.wx(r2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
