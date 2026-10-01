package com.android.vending.licensing;

public interface a extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class AbstractBinderC0055a extends android.os.Binder implements com.android.vending.licensing.a {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0056a implements com.android.vending.licensing.a {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = -2501176538321144145L)
            private android.os.IBinder FH;



            @abcd.Interfacesu(method = 7205025289452609195L)
            C0056a(android.os.IBinder r6) {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex0 = null;
                int $pc0 = 4;
                $sw0: while (true) {
                    switch ($pc0) {
                        case 8: {
                            th = $ex0;
                            if (DW == false) { $pc0 = 12; continue $sw0; }
                            abcd.wu.j6(th, 2913681774118926924L, null, r6);
                            $pc0 = 12; continue $sw0;
                        }
                        case 12: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc0 = 6; continue $sw0; }
                            try {
                                abcd.wu.j6(2913681774118926924L, null, r6);
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
            @abcd.Interfacesu(method = -2604152934726615987L)
            public android.os.IBinder asBinder() {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex1 = null;
                int $pc1 = 4;
                $sw1: while (true) {
                    switch ($pc1) {
                        case 8: {
                            th = $ex1;
                            if (DW == false) { $pc1 = 12; continue $sw1; }
                            abcd.wu.j6(th, 2378441031766153200L, this);
                            $pc1 = 12; continue $sw1;
                        }
                        case 12: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc1 = 6; continue $sw1; }
                            try {
                                abcd.wu.j6(2378441031766153200L, this);
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
        }



        public AbstractBinderC0055a() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex2 = null;
            int $pc2 = 4;
            $sw2: while (true) {
                switch ($pc2) {
                    case 8: {
                        th = $ex2;
                        if (DW == false) { $pc2 = 12; continue $sw2; }
                        abcd.wu.j6(th, -1643658187290261800L, null);
                        $pc2 = 12; continue $sw2;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc2 = 6; continue $sw2; }
                        try {
                            abcd.wu.j6(-1643658187290261800L, null);
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 8; continue $sw2;
                        }
                        $pc2 = 6; continue $sw2;
                    }
                    case 6: {
                        try {
                            attachInterface(this, "com.android.vending.licensing.ILicenseResultListener");
                        } catch (java.lang.Throwable $t) {
                            $ex2 = $t;
                            $pc2 = 8; continue $sw2;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public static com.android.vending.licensing.a j6(android.os.IBinder r5) {
            android.os.IInterface r3 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = 4;
            $sw3: while (true) {
                switch ($pc3) {
                    case 16: {
                        th = $ex3;
                        if (DW == false) { $pc3 = 20; continue $sw3; }
                        abcd.wu.j6(th, -1874819859482863925L, null, r5);
                        $pc3 = 20; continue $sw3;
                    }
                    case 20: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc3 = 6; continue $sw3; }
                        try {
                            abcd.wu.j6(-1874819859482863925L, null, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 16; continue $sw3;
                        }
                        $pc3 = 6; continue $sw3;
                    }
                    case 6: {
                        if (r5 != null) { $pc3 = 8; continue $sw3; }
                        return null;
                    }
                    case 8: {
                        try {
                            r3 = r5.queryLocalInterface("com.android.vending.licensing.ILicenseResultListener");
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 16; continue $sw3;
                        }
                        if (r3 == null) { $pc3 = 15; continue $sw3; }
                        if ((r3 instanceof com.android.vending.licensing.a) == false) { $pc3 = 15; continue $sw3; }
                        return (com.android.vending.licensing.a) r3;
                    }
                    case 15: {
                        return new com.android.vending.licensing.a.AbstractBinderC0055a.C0056a(r5);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public android.os.IBinder asBinder() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = 4;
            $sw4: while (true) {
                switch ($pc4) {
                    case 7: {
                        th = $ex4;
                        if (DW == false) { $pc4 = 11; continue $sw4; }
                        abcd.wu.j6(th, -1921090650901021320L, this);
                        $pc4 = 11; continue $sw4;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc4 = 6; continue $sw4; }
                        try {
                            abcd.wu.j6(-1921090650901021320L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 7; continue $sw4;
                        }
                        $pc4 = 6; continue $sw4;
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
            java.lang.Throwable $ex5 = null;
            int $pc5 = 3;
            $sw5: while (true) {
                switch ($pc5) {
                    case 15: {
                        th = $ex5;
                        if (DW == false) { $pc5 = 19; continue $sw5; }
                        abcd.wu.j6(th, -953931718243797165L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
                        $pc5 = 19; continue $sw5;
                    }
                    case 19: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc5 = 6; continue $sw5; }
                        try {
                            abcd.wu.j6(-953931718243797165L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 15; continue $sw5;
                        }
                        $pc5 = 6; continue $sw5;
                    }
                    case 6: {
                        if (r10 != 1) { $pc5 = 8; continue $sw5; }
                        try {
                            r11.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
                            j6(r11.readInt(), r11.readString(), r11.readString());
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 15; continue $sw5;
                        }
                        return true;
                    }
                    case 8: {
                        if (r10 != 1598968902) { $pc5 = 10; continue $sw5; }
                        try {
                            r12.writeString("com.android.vending.licensing.ILicenseResultListener");
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 15; continue $sw5;
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

    void j6(int r1, java.lang.String r2, java.lang.String r3);
}
