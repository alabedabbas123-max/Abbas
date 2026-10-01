package abcd;

public interface Interfacequ extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class a extends android.os.Binder implements abcd.Interfacequ {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0009a implements abcd.Interfacequ {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = 637299904492232739L)
            private android.os.IBinder FH;



            @abcd.Interfacesu(method = 339824878835178633L)
            C0009a(android.os.IBinder r6) {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex0 = null;
                int $pc0 = 4;
                $sw0: while (true) {
                    switch ($pc0) {
                        case 8: {
                            th = $ex0;
                            if (DW == false) { $pc0 = 12; continue $sw0; }
                            abcd.wu.j6(th, -3984050193026269929L, null, r6);
                            $pc0 = 12; continue $sw0;
                        }
                        case 12: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc0 = 6; continue $sw0; }
                            try {
                                abcd.wu.j6(-3984050193026269929L, null, r6);
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
            @abcd.Interfacesu(method = 373120001563025179L)
            public int DW(int r9, java.lang.String r10, java.lang.String r11) {
                android.os.Parcel r0 = null;
                android.os.Parcel r1 = null;
                int r2 = 0;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex1 = null;
                int $pc1 = 3;
                $sw1: while (true) {
                    switch ($pc1) {
                        case 12: {
                            th = $ex1;
                            if (DW == false) { $pc1 = 16; continue $sw1; }
                            abcd.wu.j6(th, -1430035560932947011L, this, new java.lang.Integer(r9), r10, r11);
                            $pc1 = 16; continue $sw1;
                        }
                        case 16: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 3: {
                            if (j6 == false) { $pc1 = 5; continue $sw1; }
                            try {
                                abcd.wu.j6(-1430035560932947011L, this, new java.lang.Integer(r9), r10, r11);
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 12; continue $sw1;
                            }
                            $pc1 = 5; continue $sw1;
                        }
                        case 5: {
                            try {
                                r0 = android.os.Parcel.obtain();
                                r1 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 12; continue $sw1;
                            }
                            try {
                                r0.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                                r0.writeInt(r9);
                                r0.writeString(r10);
                                r0.writeString(r11);
                                this.FH.transact(1, r0, r1, 0);
                                r1.readException();
                                r2 = r1.readInt();
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 9; continue $sw1;
                            }
                            try {
                                r1.recycle();
                                r0.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 12; continue $sw1;
                            }
                            return r2;
                        }
                        case 9: {
                            th = $ex1;
                            try {
                                r1.recycle();
                                r0.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 12; continue $sw1;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = -1333327835991438945L)
            public android.os.IBinder asBinder() {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex2 = null;
                int $pc2 = 4;
                $sw2: while (true) {
                    switch ($pc2) {
                        case 8: {
                            th = $ex2;
                            if (DW == false) { $pc2 = 12; continue $sw2; }
                            abcd.wu.j6(th, 985196878152980857L, this);
                            $pc2 = 12; continue $sw2;
                        }
                        case 12: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc2 = 6; continue $sw2; }
                            try {
                                abcd.wu.j6(985196878152980857L, this);
                            } catch (java.lang.Throwable $t) {
                                $ex2 = $t;
                                $pc2 = 8; continue $sw2;
                            }
                            $pc2 = 6; continue $sw2;
                        }
                        case 6: {
                            return this.FH;
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = 454445442190761085L)
            public android.os.Bundle j6(int r10, java.lang.String r11, java.lang.String r12, android.os.Bundle r13) {
                android.os.Parcel r0 = null;
                android.os.Parcel r1 = null;
                android.os.Bundle r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex3 = null;
                int $pc3 = 3;
                $sw3: while (true) {
                    switch ($pc3) {
                        case 20: {
                            th = $ex3;
                            if (DW == false) { $pc3 = 24; continue $sw3; }
                            abcd.wu.j6(th, 2788033300916228943L, this, new java.lang.Integer(r10), r11, r12, r13);
                            $pc3 = 24; continue $sw3;
                        }
                        case 24: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 3: {
                            if (j6 == false) { $pc3 = 5; continue $sw3; }
                            try {
                                abcd.wu.j6(2788033300916228943L, this, new java.lang.Integer(r10), r11, r12, r13);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 20; continue $sw3;
                            }
                            $pc3 = 5; continue $sw3;
                        }
                        case 5: {
                            try {
                                r0 = android.os.Parcel.obtain();
                                r1 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 20; continue $sw3;
                            }
                            try {
                                r0.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                                r0.writeInt(r10);
                                r0.writeString(r11);
                                r0.writeString(r12);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 17; continue $sw3;
                            }
                            if (r13 == null) { $pc3 = 9; continue $sw3; }
                            try {
                                r0.writeInt(1);
                                r13.writeToParcel(r0, 0);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 17; continue $sw3;
                            }
                            $pc3 = 10; continue $sw3;
                        }
                        case 10: {
                            try {
                                this.FH.transact(2, r0, r1, 0);
                                r1.readException();
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 17; continue $sw3;
                            }
                            if (r1.readInt() == 0) { $pc3 = 14; continue $sw3; }
                            try {
                                r2 = (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(r1);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 17; continue $sw3;
                            }
                            $pc3 = 15; continue $sw3;
                        }
                        case 15: {
                            try {
                                r1.recycle();
                                r0.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 20; continue $sw3;
                            }
                            return r2;
                        }
                        case 14: {
                            r2 = null;
                            { $pc3 = 15; continue $sw3; }
                        }
                        case 9: {
                            try {
                                r0.writeInt(0);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 17; continue $sw3;
                            }
                            $pc3 = 17; continue $sw3;
                        }
                        case 17: {
                            th = $ex3;
                            try {
                                r1.recycle();
                                r0.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 20; continue $sw3;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = 605798833788045180L)
            public android.os.Bundle j6(int r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
                android.os.Parcel r0 = null;
                android.os.Parcel r1 = null;
                android.os.Bundle r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex4 = null;
                int $pc4 = 3;
                $sw4: while (true) {
                    switch ($pc4) {
                        case 16: {
                            th = $ex4;
                            if (DW == false) { $pc4 = 20; continue $sw4; }
                            abcd.wu.j6(th, 4572400297559653816L, this, new java.lang.Integer(r10), r11, r12, r13);
                            $pc4 = 20; continue $sw4;
                        }
                        case 20: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 3: {
                            if (j6 == false) { $pc4 = 5; continue $sw4; }
                            try {
                                abcd.wu.j6(4572400297559653816L, this, new java.lang.Integer(r10), r11, r12, r13);
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 16; continue $sw4;
                            }
                            $pc4 = 5; continue $sw4;
                        }
                        case 5: {
                            try {
                                r0 = android.os.Parcel.obtain();
                                r1 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 16; continue $sw4;
                            }
                            try {
                                r0.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                                r0.writeInt(r10);
                                r0.writeString(r11);
                                r0.writeString(r12);
                                r0.writeString(r13);
                                this.FH.transact(4, r0, r1, 0);
                                r1.readException();
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 13; continue $sw4;
                            }
                            if (r1.readInt() == 0) { $pc4 = 10; continue $sw4; }
                            try {
                                r2 = (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(r1);
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 13; continue $sw4;
                            }
                            $pc4 = 11; continue $sw4;
                        }
                        case 11: {
                            try {
                                r1.recycle();
                                r0.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 16; continue $sw4;
                            }
                            return r2;
                        }
                        case 10: {
                            r2 = null;
                            $pc4 = 13; continue $sw4;
                        }
                        case 13: {
                            th = $ex4;
                            try {
                                r1.recycle();
                                r0.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 16; continue $sw4;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = 615297442634898888L)
            public android.os.Bundle j6(int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
                android.os.Parcel r0 = null;
                android.os.Parcel r1 = null;
                android.os.Bundle r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex5 = null;
                int $pc5 = 3;
                $sw5: while (true) {
                    switch ($pc5) {
                        case 16: {
                            th = $ex5;
                            if (DW == false) { $pc5 = 20; continue $sw5; }
                            abcd.wu.j6(th, 80786183475723264L, this, new java.lang.Integer(r11), r12, r13, r14, r15);
                            $pc5 = 20; continue $sw5;
                        }
                        case 20: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 3: {
                            if (j6 == false) { $pc5 = 5; continue $sw5; }
                            try {
                                abcd.wu.j6(80786183475723264L, this, new java.lang.Integer(r11), r12, r13, r14, r15);
                            } catch (java.lang.Throwable $t) {
                                $ex5 = $t;
                                $pc5 = 16; continue $sw5;
                            }
                            $pc5 = 5; continue $sw5;
                        }
                        case 5: {
                            try {
                                r0 = android.os.Parcel.obtain();
                                r1 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex5 = $t;
                                $pc5 = 16; continue $sw5;
                            }
                            try {
                                r0.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                                r0.writeInt(r11);
                                r0.writeString(r12);
                                r0.writeString(r13);
                                r0.writeString(r14);
                                r0.writeString(r15);
                                this.FH.transact(3, r0, r1, 0);
                                r1.readException();
                            } catch (java.lang.Throwable $t) {
                                $ex5 = $t;
                                $pc5 = 13; continue $sw5;
                            }
                            if (r1.readInt() == 0) { $pc5 = 10; continue $sw5; }
                            try {
                                r2 = (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(r1);
                            } catch (java.lang.Throwable $t) {
                                $ex5 = $t;
                                $pc5 = 13; continue $sw5;
                            }
                            $pc5 = 11; continue $sw5;
                        }
                        case 11: {
                            try {
                                r1.recycle();
                                r0.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex5 = $t;
                                $pc5 = 16; continue $sw5;
                            }
                            return r2;
                        }
                        case 10: {
                            r2 = null;
                            $pc5 = 13; continue $sw5;
                        }
                        case 13: {
                            th = $ex5;
                            try {
                                r1.recycle();
                                r0.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex5 = $t;
                                $pc5 = 16; continue $sw5;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }
        }



        public a() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex6 = null;
            int $pc6 = 4;
            $sw6: while (true) {
                switch ($pc6) {
                    case 8: {
                        th = $ex6;
                        if (DW == false) { $pc6 = 12; continue $sw6; }
                        abcd.wu.j6(th, -595119342766648068L, null);
                        $pc6 = 12; continue $sw6;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc6 = 6; continue $sw6; }
                        try {
                            abcd.wu.j6(-595119342766648068L, null);
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 8; continue $sw6;
                        }
                        $pc6 = 6; continue $sw6;
                    }
                    case 6: {
                        try {
                            attachInterface(this, "com.android.vending.billing.IInAppBillingService");
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 8; continue $sw6;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public static abcd.Interfacequ j6(android.os.IBinder r5) {
            android.os.IInterface r3 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex7 = null;
            int $pc7 = 4;
            $sw7: while (true) {
                switch ($pc7) {
                    case 16: {
                        th = $ex7;
                        if (DW == false) { $pc7 = 20; continue $sw7; }
                        abcd.wu.j6(th, -1841173601391953959L, null, r5);
                        $pc7 = 20; continue $sw7;
                    }
                    case 20: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc7 = 6; continue $sw7; }
                        try {
                            abcd.wu.j6(-1841173601391953959L, null, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 16; continue $sw7;
                        }
                        $pc7 = 6; continue $sw7;
                    }
                    case 6: {
                        if (r5 != null) { $pc7 = 8; continue $sw7; }
                        return null;
                    }
                    case 8: {
                        try {
                            r3 = r5.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 16; continue $sw7;
                        }
                        if (r3 == null) { $pc7 = 15; continue $sw7; }
                        if ((r3 instanceof abcd.Interfacequ) == false) { $pc7 = 15; continue $sw7; }
                        return (abcd.Interfacequ) r3;
                    }
                    case 15: {
                        return new abcd.Interfacequ.a.C0009a(r5);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public android.os.IBinder asBinder() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex8 = null;
            int $pc8 = 4;
            $sw8: while (true) {
                switch ($pc8) {
                    case 7: {
                        th = $ex8;
                        if (DW == false) { $pc8 = 11; continue $sw8; }
                        abcd.wu.j6(th, 835517997437111808L, this);
                        $pc8 = 11; continue $sw8;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc8 = 6; continue $sw8; }
                        try {
                            abcd.wu.j6(835517997437111808L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 7; continue $sw8;
                        }
                        $pc8 = 6; continue $sw8;
                    }
                    case 6: {
                        return this;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public boolean onTransact(int r11, android.os.Parcel r12, android.os.Parcel r13, int r14) {
            int r0 = 0;
            int r1 = 0;
            java.lang.String r2 = null;
            java.lang.String r4 = null;
            android.os.Bundle r5 = null;
            android.os.Bundle r3 = null;
            android.os.Bundle r6 = null;
            android.os.Bundle r7 = null;
            int r8 = 0;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex9 = null;
            int $pc9 = 3;
            $sw9: while (true) {
                switch ($pc9) {
                    case 44: {
                        th = $ex9;
                        if (DW == false) { $pc9 = 48; continue $sw9; }
                        abcd.wu.j6(th, -857228719526856519L, this, new java.lang.Integer(r11), r12, r13, new java.lang.Integer(r14));
                        $pc9 = 48; continue $sw9;
                    }
                    case 48: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc9 = 6; continue $sw9; }
                        try {
                            abcd.wu.j6(-857228719526856519L, this, new java.lang.Integer(r11), r12, r13, new java.lang.Integer(r14));
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 44; continue $sw9;
                        }
                        $pc9 = 6; continue $sw9;
                    }
                    case 6: {
                        if (r11 != 1) { $pc9 = 8; continue $sw9; }
                        try {
                            r12.enforceInterface("com.android.vending.billing.IInAppBillingService");
                            r0 = DW(r12.readInt(), r12.readString(), r12.readString());
                            r13.writeNoException();
                            r13.writeInt(r0);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 44; continue $sw9;
                        }
                        return true;
                    }
                    case 8: {
                        if (r11 != 2) { $pc9 = 10; continue $sw9; }
                        try {
                            r12.enforceInterface("com.android.vending.billing.IInAppBillingService");
                            r1 = r12.readInt();
                            r2 = r12.readString();
                            r4 = r12.readString();
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 44; continue $sw9;
                        }
                        if (r12.readInt() == 0) { $pc9 = 36; continue $sw9; }
                        try {
                            r5 = (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(r12);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 44; continue $sw9;
                        }
                        $pc9 = 37; continue $sw9;
                    }
                    case 37: {
                        try {
                            r3 = j6(r1, r2, r4, r5);
                            r13.writeNoException();
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 44; continue $sw9;
                        }
                        if (r3 == null) { $pc9 = 40; continue $sw9; }
                        try {
                            r13.writeInt(1);
                            r3.writeToParcel(r13, 1);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 44; continue $sw9;
                        }
                        $pc9 = 41; continue $sw9;
                    }
                    case 41: {
                        return true;
                    }
                    case 40: {
                        try {
                            r13.writeInt(0);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 44; continue $sw9;
                        }
                        { $pc9 = 41; continue $sw9; }
                    }
                    case 36: {
                        r5 = null;
                        { $pc9 = 37; continue $sw9; }
                    }
                    case 10: {
                        if (r11 != 3) { $pc9 = 12; continue $sw9; }
                        try {
                            r12.enforceInterface("com.android.vending.billing.IInAppBillingService");
                            r6 = j6(r12.readInt(), r12.readString(), r12.readString(), r12.readString(), r12.readString());
                            r13.writeNoException();
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 44; continue $sw9;
                        }
                        if (r6 == null) { $pc9 = 31; continue $sw9; }
                        try {
                            r13.writeInt(1);
                            r6.writeToParcel(r13, 1);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 44; continue $sw9;
                        }
                        $pc9 = 32; continue $sw9;
                    }
                    case 32: {
                        return true;
                    }
                    case 31: {
                        try {
                            r13.writeInt(0);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 44; continue $sw9;
                        }
                        { $pc9 = 32; continue $sw9; }
                    }
                    case 12: {
                        if (r11 != 4) { $pc9 = 14; continue $sw9; }
                        try {
                            r12.enforceInterface("com.android.vending.billing.IInAppBillingService");
                            r7 = j6(r12.readInt(), r12.readString(), r12.readString(), r12.readString());
                            r13.writeNoException();
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 44; continue $sw9;
                        }
                        if (r7 == null) { $pc9 = 26; continue $sw9; }
                        try {
                            r13.writeInt(1);
                            r7.writeToParcel(r13, 1);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 44; continue $sw9;
                        }
                        $pc9 = 27; continue $sw9;
                    }
                    case 27: {
                        return true;
                    }
                    case 26: {
                        try {
                            r13.writeInt(0);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 44; continue $sw9;
                        }
                        { $pc9 = 27; continue $sw9; }
                    }
                    case 14: {
                        if (r11 != 5) { $pc9 = 16; continue $sw9; }
                        try {
                            r12.enforceInterface("com.android.vending.billing.IInAppBillingService");
                            r8 = FH(r12.readInt(), r12.readString(), r12.readString());
                            r13.writeNoException();
                            r13.writeInt(r8);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 44; continue $sw9;
                        }
                        return true;
                    }
                    case 16: {
                        if (r11 != 1598968902) { $pc9 = 18; continue $sw9; }
                        try {
                            r13.writeString("com.android.vending.billing.IInAppBillingService");
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 44; continue $sw9;
                        }
                        return true;
                    }
                    case 18: {
                        return super.onTransact(r11, r12, r13, r14);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    int DW(int r1, java.lang.String r2, java.lang.String r3);

    int FH(int r1, java.lang.String r2, java.lang.String r3);

    android.os.Bundle j6(int r1, java.lang.String r2, java.lang.String r3, android.os.Bundle r4);

    android.os.Bundle j6(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4);

    android.os.Bundle j6(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5);
}
