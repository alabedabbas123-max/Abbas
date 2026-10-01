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
            if (r2 != null) goto L5;
            return null;
        L5:
            android.os.IInterface r0 = r2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if ((r0 instanceof abcd.Interfaceox) == false) goto L10;
            return (abcd.Interfaceox) r0;
        L10:
            return new abcd.Interfaceox.a.C0008a(r2);
        }
    }
}
