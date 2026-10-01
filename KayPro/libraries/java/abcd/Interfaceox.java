package abcd;

public interface Interfaceox extends android.os.IInterface {

    public static abstract class a extends abcd.Dx implements abcd.Interfaceox {

        public static class C0008a extends abcd.Cx implements abcd.Interfaceox {
            C0008a(android.os.IBinder r2) {
                super(r2, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static abcd.Interfaceox j6(android.os.IBinder r2) {
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
                        r0 = r2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                        if ((r0 instanceof abcd.Interfaceox) == false) { $pc0 = 10; continue $sw0; }
                        return (abcd.Interfaceox) r0;
                    }
                    case 10: {
                        return new abcd.Interfaceox.a.C0008a(r2);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }
}
