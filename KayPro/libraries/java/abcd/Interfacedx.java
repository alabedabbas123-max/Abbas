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
                android.os.Parcel r0 = null;
                android.os.Parcel r1 = null;
                android.os.Bundle r6 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex0 = null;
                int $pc0 = -1;
                $sw0: while (true) {
                    switch ($pc0) {
                        case -1: {
                            r0 = android.os.Parcel.obtain();
                            r1 = android.os.Parcel.obtain();
                            try {
                                r0.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                            } catch (java.lang.Throwable $t) {
                                $ex0 = $t;
                                $pc0 = 14; continue $sw0;
                            }
                            if (r5 == null) { $pc0 = 6; continue $sw0; }
                            try {
                                r0.writeInt(1);
                                r5.writeToParcel(r0, 0);
                            } catch (java.lang.Throwable $t) {
                                $ex0 = $t;
                                $pc0 = 14; continue $sw0;
                            }
                            $pc0 = 7; continue $sw0;
                        }
                        case 7: {
                            try {
                                this.j6.transact(1, r0, r1, 0);
                                r1.readException();
                            } catch (java.lang.Throwable $t) {
                                $ex0 = $t;
                                $pc0 = 14; continue $sw0;
                            }
                            if (r1.readInt() == 0) { $pc0 = 11; continue $sw0; }
                            try {
                                r6 = (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(r1);
                            } catch (java.lang.Throwable $t) {
                                $ex0 = $t;
                                $pc0 = 14; continue $sw0;
                            }
                            $pc0 = 12; continue $sw0;
                        }
                        case 12: {
                            r1.recycle();
                            r0.recycle();
                            return r6;
                        }
                        case 11: {
                            r6 = null;
                            { $pc0 = 12; continue $sw0; }
                        }
                        case 6: {
                            try {
                                r0.writeInt(0);
                            } catch (java.lang.Throwable $t) {
                                $ex0 = $t;
                                $pc0 = 14; continue $sw0;
                            }
                            throw new java.lang.IllegalStateException();
                        }
                        case 14: {
                            th = $ex0;
                            r1.recycle();
                            r0.recycle();
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            public android.os.IBinder asBinder() {
                return this.j6;
            }
        }

        public static abcd.Interfacedx j6(android.os.IBinder r2) {
            android.os.IInterface r0 = null;
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if (r2 != null) { $pc1 = 5; continue $sw1; }
                        return null;
                    }
                    case 5: {
                        r0 = r2.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                        if (r0 == null) { $pc1 = 12; continue $sw1; }
                        if ((r0 instanceof abcd.Interfacedx) == false) { $pc1 = 12; continue $sw1; }
                        return (abcd.Interfacedx) r0;
                    }
                    case 12: {
                        return new abcd.Interfacedx.a.C0007a(r2);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    android.os.Bundle Zo(android.os.Bundle r1);
}
