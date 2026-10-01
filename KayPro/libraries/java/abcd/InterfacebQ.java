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
                android.os.Parcel r0 = null;
                android.os.Parcel r1 = null;
                android.os.IBinder r6 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex0 = null;
                int $pc0 = -1;
                $sw0: while (true) {
                    switch ($pc0) {
                        case -1: {
                            r0 = android.os.Parcel.obtain();
                            r1 = android.os.Parcel.obtain();
                            try {
                                r0.writeInterfaceToken("tv.ouya.console.internal.IIapServiceDefinition");
                                r0.writeString(r4);
                            } catch (java.lang.Throwable $t) {
                                $ex0 = $t;
                                $pc0 = 10; continue $sw0;
                            }
                            if (r5 == null) { $pc0 = 6; continue $sw0; }
                            try {
                                r6 = r5.asBinder();
                            } catch (java.lang.Throwable $t) {
                                $ex0 = $t;
                                $pc0 = 10; continue $sw0;
                            }
                            $pc0 = 7; continue $sw0;
                        }
                        case 7: {
                            try {
                                r0.writeStrongBinder(r6);
                                this.j6.transact(4, r0, r1, 0);
                                r1.readException();
                            } catch (java.lang.Throwable $t) {
                                $ex0 = $t;
                                $pc0 = 10; continue $sw0;
                            }
                            r1.recycle();
                            r0.recycle();
                            return;
                        }
                        case 6: {
                            r6 = null;
                            $pc0 = 10; continue $sw0;
                        }
                        case 10: {
                            th = $ex0;
                            r1.recycle();
                            r0.recycle();
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }
        }

        public static abcd.InterfacebQ j6(android.os.IBinder r2) {
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
                        r0 = r2.queryLocalInterface("tv.ouya.console.internal.IIapServiceDefinition");
                        if (r0 == null) { $pc1 = 12; continue $sw1; }
                        if ((r0 instanceof abcd.InterfacebQ) == false) { $pc1 = 12; continue $sw1; }
                        return (abcd.InterfacebQ) r0;
                    }
                    case 12: {
                        return new abcd.InterfacebQ.a.C0004a(r2);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    void j6(java.lang.String r1, abcd.InterfacecQ r2);
}
