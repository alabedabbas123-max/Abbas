package com.android.vending.licensing;

public interface ILicensingService extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class a extends android.os.Binder implements com.android.vending.licensing.ILicensingService {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0054a implements com.android.vending.licensing.ILicensingService {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = -804649032323297808L)
            private android.os.IBinder FH;



            @abcd.Interfacesu(method = -66415307568857500L)
            C0054a(android.os.IBinder r6) {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex0 = null;
                int $pc0 = 4;
                $sw0: while (true) {
                    switch ($pc0) {
                        case 8: {
                            th = $ex0;
                            if (DW == false) { $pc0 = 12; continue $sw0; }
                            abcd.wu.j6(th, 2735950639407038599L, null, r6);
                            $pc0 = 12; continue $sw0;
                        }
                        case 12: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc0 = 6; continue $sw0; }
                            try {
                                abcd.wu.j6(2735950639407038599L, null, r6);
                            } catch (java.lang.Throwable $t) {
                                $ex0 = $t;
                                $pc0 = 8; continue $sw0;
                            }
                            $pc0 = 6; continue $sw0;
                        }
                        case 6: {
                            try {
                                this.FH = r6;
                            } catch (java.lang.Throwable $t) {
                                $ex0 = $t;
                                $pc0 = 8; continue $sw0;
                            }
                            return;
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = -1580931935414461172L)
            public android.os.IBinder asBinder() {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex1 = null;
                int $pc1 = 4;
                $sw1: while (true) {
                    switch ($pc1) {
                        case 8: {
                            th = $ex1;
                            if (DW == false) { $pc1 = 12; continue $sw1; }
                            abcd.wu.j6(th, 1976967346172450505L, this);
                            $pc1 = 12; continue $sw1;
                        }
                        case 12: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc1 = 6; continue $sw1; }
                            try {
                                abcd.wu.j6(1976967346172450505L, this);
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 8; continue $sw1;
                            }
                            $pc1 = 6; continue $sw1;
                        }
                        case 6: {
                            return this.FH;
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = 467867295480740175L)
            public void j6(long r9, java.lang.String r11, com.android.vending.licensing.a r12) {
                android.os.Parcel r0 = null;
                android.os.IBinder r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex2 = null;
                int $pc2 = 3;
                $sw2: while (true) {
                    switch ($pc2) {
                        case 16: {
                            th = $ex2;
                            if (DW == false) { $pc2 = 20; continue $sw2; }
                            abcd.wu.j6(th, -3064570666234928224L, this, new java.lang.Long(r9), r11, r12);
                            $pc2 = 20; continue $sw2;
                        }
                        case 20: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 3: {
                            if (j6 == false) { $pc2 = 5; continue $sw2; }
                            try {
                                abcd.wu.j6(-3064570666234928224L, this, new java.lang.Long(r9), r11, r12);
                            } catch (java.lang.Throwable $t) {
                                $ex2 = $t;
                                $pc2 = 16; continue $sw2;
                            }
                            $pc2 = 5; continue $sw2;
                        }
                        case 5: {
                            try {
                                r0 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex2 = $t;
                                $pc2 = 16; continue $sw2;
                            }
                            try {
                                r0.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
                                r0.writeLong(r9);
                                r0.writeString(r11);
                            } catch (java.lang.Throwable $t) {
                                $ex2 = $t;
                                $pc2 = 13; continue $sw2;
                            }
                            if (r12 == null) { $pc2 = 9; continue $sw2; }
                            try {
                                r2 = r12.asBinder();
                            } catch (java.lang.Throwable $t) {
                                $ex2 = $t;
                                $pc2 = 13; continue $sw2;
                            }
                            $pc2 = 10; continue $sw2;
                        }
                        case 10: {
                            try {
                                r0.writeStrongBinder(r2);
                                this.FH.transact(1, r0, null, 1);
                            } catch (java.lang.Throwable $t) {
                                $ex2 = $t;
                                $pc2 = 13; continue $sw2;
                            }
                            try {
                                r0.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex2 = $t;
                                $pc2 = 16; continue $sw2;
                            }
                            return;
                        }
                        case 9: {
                            r2 = null;
                            return;
                        }
                        case 13: {
                            th = $ex2;
                            try {
                                r0.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex2 = $t;
                                $pc2 = 16; continue $sw2;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }
        }



        public a() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = 4;
            $sw3: while (true) {
                switch ($pc3) {
                    case 8: {
                        th = $ex3;
                        if (DW == false) { $pc3 = 12; continue $sw3; }
                        abcd.wu.j6(th, -1814264660613683604L, null);
                        $pc3 = 12; continue $sw3;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc3 = 6; continue $sw3; }
                        try {
                            abcd.wu.j6(-1814264660613683604L, null);
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 8; continue $sw3;
                        }
                        $pc3 = 6; continue $sw3;
                    }
                    case 6: {
                        try {
                            attachInterface(this, "com.android.vending.licensing.ILicensingService");
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 8; continue $sw3;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public static com.android.vending.licensing.ILicensingService j6(android.os.IBinder r5) {
            android.os.IInterface r3 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = 4;
            $sw4: while (true) {
                switch ($pc4) {
                    case 16: {
                        th = $ex4;
                        if (DW == false) { $pc4 = 20; continue $sw4; }
                        abcd.wu.j6(th, -1860534859620897279L, null, r5);
                        $pc4 = 20; continue $sw4;
                    }
                    case 20: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc4 = 6; continue $sw4; }
                        try {
                            abcd.wu.j6(-1860534859620897279L, null, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 16; continue $sw4;
                        }
                        $pc4 = 6; continue $sw4;
                    }
                    case 6: {
                        if (r5 != null) { $pc4 = 8; continue $sw4; }
                        return null;
                    }
                    case 8: {
                        try {
                            r3 = r5.queryLocalInterface("com.android.vending.licensing.ILicensingService");
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 16; continue $sw4;
                        }
                        if (r3 == null) { $pc4 = 15; continue $sw4; }
                        if ((r3 instanceof com.android.vending.licensing.ILicensingService) == false) { $pc4 = 15; continue $sw4; }
                        return (com.android.vending.licensing.ILicensingService) r3;
                    }
                    case 15: {
                        return new com.android.vending.licensing.ILicensingService.a.C0054a(r5);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public android.os.IBinder asBinder() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex5 = null;
            int $pc5 = 4;
            $sw5: while (true) {
                switch ($pc5) {
                    case 7: {
                        th = $ex5;
                        if (DW == false) { $pc5 = 11; continue $sw5; }
                        abcd.wu.j6(th, 2277020459729407392L, this);
                        $pc5 = 11; continue $sw5;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc5 = 6; continue $sw5; }
                        try {
                            abcd.wu.j6(2277020459729407392L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 7; continue $sw5;
                        }
                        $pc5 = 6; continue $sw5;
                    }
                    case 6: {
                        return this;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex6 = null;
            int $pc6 = 3;
            $sw6: while (true) {
                switch ($pc6) {
                    case 15: {
                        th = $ex6;
                        if (DW == false) { $pc6 = 19; continue $sw6; }
                        abcd.wu.j6(th, 742440474434070625L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
                        $pc6 = 19; continue $sw6;
                    }
                    case 19: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc6 = 6; continue $sw6; }
                        try {
                            abcd.wu.j6(742440474434070625L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 15; continue $sw6;
                        }
                        $pc6 = 6; continue $sw6;
                    }
                    case 6: {
                        if (r10 != 1) { $pc6 = 8; continue $sw6; }
                        try {
                            r11.enforceInterface("com.android.vending.licensing.ILicensingService");
                            j6(r11.readLong(), r11.readString(), com.android.vending.licensing.a.AbstractBinderC0055a.j6(r11.readStrongBinder()));
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 15; continue $sw6;
                        }
                        return true;
                    }
                    case 8: {
                        if (r10 != 1598968902) { $pc6 = 10; continue $sw6; }
                        try {
                            r12.writeString("com.android.vending.licensing.ILicensingService");
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 15; continue $sw6;
                        }
                        return true;
                    }
                    case 10: {
                        return super.onTransact(r10, r11, r12, r13);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    void j6(long r1, java.lang.String r3, com.android.vending.licensing.a r4);
}
