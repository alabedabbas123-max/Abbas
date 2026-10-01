package com.aide.engine.service;

public interface u extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class a extends android.os.Binder implements com.aide.engine.service.u {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0037a implements com.aide.engine.service.u {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = 2688564112450983911L)
            private android.os.IBinder FH;



            @abcd.Interfacesu(method = -14480104674388701L)
            C0037a(android.os.IBinder r6) {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex0 = null;
                int $pc0 = 4;
                $sw0: while (true) {
                    switch ($pc0) {
                        case 8: {
                            th = $ex0;
                            if (DW == false) { $pc0 = 12; continue $sw0; }
                            abcd.wu.j6(th, -6069847640756722140L, null, r6);
                            $pc0 = 12; continue $sw0;
                        }
                        case 12: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc0 = 6; continue $sw0; }
                            try {
                                abcd.wu.j6(-6069847640756722140L, null, r6);
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
            @abcd.Interfacesu(method = 4389674880619663063L)
            public com.aide.engine.service.CharArray FH(int r8) {
                android.os.Parcel r2 = null;
                android.os.Parcel r3 = null;
                com.aide.engine.service.CharArray r4 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex1 = null;
                int $pc1 = 4;
                $sw1: while (true) {
                    switch ($pc1) {
                        case 17: {
                            th = $ex1;
                            if (DW == false) { $pc1 = 21; continue $sw1; }
                            abcd.wu.j6(th, -2541115332202067616L, this, new java.lang.Integer(r8));
                            $pc1 = 21; continue $sw1;
                        }
                        case 21: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc1 = 6; continue $sw1; }
                            try {
                                abcd.wu.j6(-2541115332202067616L, this, r8);
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 17; continue $sw1;
                            }
                            $pc1 = 6; continue $sw1;
                        }
                        case 6: {
                            try {
                                r2 = android.os.Parcel.obtain();
                                r3 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 17; continue $sw1;
                            }
                            try {
                                r2.writeInterfaceToken("com.aide.engine.service.IOpenFileInterface");
                                r2.writeInt(r8);
                                this.FH.transact(4, r2, r3, 0);
                                r3.readException();
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 14; continue $sw1;
                            }
                            if (r3.readInt() == 0) { $pc1 = 11; continue $sw1; }
                            try {
                                r4 = com.aide.engine.service.CharArray.CREATOR.createFromParcel(r3);
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 14; continue $sw1;
                            }
                            $pc1 = 12; continue $sw1;
                        }
                        case 12: {
                            try {
                                r3.recycle();
                                r2.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 17; continue $sw1;
                            }
                            return r4;
                        }
                        case 11: {
                            r4 = null;
                            throw new java.lang.IllegalStateException();
                        }
                        case 14: {
                            th = $ex1;
                            try {
                                r3.recycle();
                                r2.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 17; continue $sw1;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = 629550268082655221L)
            public android.os.IBinder asBinder() {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex2 = null;
                int $pc2 = 4;
                $sw2: while (true) {
                    switch ($pc2) {
                        case 8: {
                            th = $ex2;
                            if (DW == false) { $pc2 = 12; continue $sw2; }
                            abcd.wu.j6(th, 1519646659550658720L, this);
                            $pc2 = 12; continue $sw2;
                        }
                        case 12: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc2 = 6; continue $sw2; }
                            try {
                                abcd.wu.j6(1519646659550658720L, this);
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
            @abcd.Interfacesu(method = -4214871052232286303L)
            public long getVersion() {
                android.os.Parcel r2 = null;
                android.os.Parcel r3 = null;
                long r4 = 0L;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex3 = null;
                int $pc3 = 4;
                $sw3: while (true) {
                    switch ($pc3) {
                        case 13: {
                            th = $ex3;
                            if (DW == false) { $pc3 = 17; continue $sw3; }
                            abcd.wu.j6(th, -3037254234425377560L, this);
                            $pc3 = 17; continue $sw3;
                        }
                        case 17: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc3 = 6; continue $sw3; }
                            try {
                                abcd.wu.j6(-3037254234425377560L, this);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 13; continue $sw3;
                            }
                            $pc3 = 6; continue $sw3;
                        }
                        case 6: {
                            try {
                                r2 = android.os.Parcel.obtain();
                                r3 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 13; continue $sw3;
                            }
                            try {
                                r2.writeInterfaceToken("com.aide.engine.service.IOpenFileInterface");
                                this.FH.transact(1, r2, r3, 0);
                                r3.readException();
                                r4 = r3.readLong();
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 10; continue $sw3;
                            }
                            try {
                                r3.recycle();
                                r2.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 13; continue $sw3;
                            }
                            return r4;
                        }
                        case 10: {
                            th = $ex3;
                            try {
                                r3.recycle();
                                r2.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 13; continue $sw3;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = 2049081957824719216L)
            public int sE() {
                android.os.Parcel r2 = null;
                android.os.Parcel r3 = null;
                int r4 = 0;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex4 = null;
                int $pc4 = 4;
                $sw4: while (true) {
                    switch ($pc4) {
                        case 13: {
                            th = $ex4;
                            if (DW == false) { $pc4 = 17; continue $sw4; }
                            abcd.wu.j6(th, 68354855023855923L, this);
                            $pc4 = 17; continue $sw4;
                        }
                        case 17: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc4 = 6; continue $sw4; }
                            try {
                                abcd.wu.j6(68354855023855923L, this);
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 13; continue $sw4;
                            }
                            $pc4 = 6; continue $sw4;
                        }
                        case 6: {
                            try {
                                r2 = android.os.Parcel.obtain();
                                r3 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 13; continue $sw4;
                            }
                            try {
                                r2.writeInterfaceToken("com.aide.engine.service.IOpenFileInterface");
                                this.FH.transact(3, r2, r3, 0);
                                r3.readException();
                                r4 = r3.readInt();
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 10; continue $sw4;
                            }
                            try {
                                r3.recycle();
                                r2.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 13; continue $sw4;
                            }
                            return r4;
                        }
                        case 10: {
                            th = $ex4;
                            try {
                                r3.recycle();
                                r2.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 13; continue $sw4;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = 4921263199696861017L)
            public long ye() {
                android.os.Parcel r2 = null;
                android.os.Parcel r3 = null;
                long r4 = 0L;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex5 = null;
                int $pc5 = 4;
                $sw5: while (true) {
                    switch ($pc5) {
                        case 13: {
                            th = $ex5;
                            if (DW == false) { $pc5 = 17; continue $sw5; }
                            abcd.wu.j6(th, -2263599873468995344L, this);
                            $pc5 = 17; continue $sw5;
                        }
                        case 17: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc5 = 6; continue $sw5; }
                            try {
                                abcd.wu.j6(-2263599873468995344L, this);
                            } catch (java.lang.Throwable $t) {
                                $ex5 = $t;
                                $pc5 = 13; continue $sw5;
                            }
                            $pc5 = 6; continue $sw5;
                        }
                        case 6: {
                            try {
                                r2 = android.os.Parcel.obtain();
                                r3 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex5 = $t;
                                $pc5 = 13; continue $sw5;
                            }
                            try {
                                r2.writeInterfaceToken("com.aide.engine.service.IOpenFileInterface");
                                this.FH.transact(2, r2, r3, 0);
                                r3.readException();
                                r4 = r3.readLong();
                            } catch (java.lang.Throwable $t) {
                                $ex5 = $t;
                                $pc5 = 10; continue $sw5;
                            }
                            try {
                                r3.recycle();
                                r2.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex5 = $t;
                                $pc5 = 13; continue $sw5;
                            }
                            return r4;
                        }
                        case 10: {
                            th = $ex5;
                            try {
                                r3.recycle();
                                r2.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex5 = $t;
                                $pc5 = 13; continue $sw5;
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
                        abcd.wu.j6(th, -2366004272929090959L, null);
                        $pc6 = 12; continue $sw6;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc6 = 6; continue $sw6; }
                        try {
                            abcd.wu.j6(-2366004272929090959L, null);
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 8; continue $sw6;
                        }
                        $pc6 = 6; continue $sw6;
                    }
                    case 6: {
                        try {
                            attachInterface(this, "com.aide.engine.service.IOpenFileInterface");
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

        public static com.aide.engine.service.u j6(android.os.IBinder r5) {
            android.os.IInterface r3 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex7 = null;
            int $pc7 = 4;
            $sw7: while (true) {
                switch ($pc7) {
                    case 16: {
                        th = $ex7;
                        if (DW == false) { $pc7 = 20; continue $sw7; }
                        abcd.wu.j6(th, 878645028592189260L, null, r5);
                        $pc7 = 20; continue $sw7;
                    }
                    case 20: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc7 = 6; continue $sw7; }
                        try {
                            abcd.wu.j6(878645028592189260L, null, r5);
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
                            r3 = r5.queryLocalInterface("com.aide.engine.service.IOpenFileInterface");
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 16; continue $sw7;
                        }
                        if (r3 == null) { $pc7 = 15; continue $sw7; }
                        if ((r3 instanceof com.aide.engine.service.u) == false) { $pc7 = 15; continue $sw7; }
                        return (com.aide.engine.service.u) r3;
                    }
                    case 15: {
                        return new com.aide.engine.service.u.a.C0037a(r5);
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
                        abcd.wu.j6(th, -450617560726896351L, this);
                        $pc8 = 11; continue $sw8;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc8 = 6; continue $sw8; }
                        try {
                            abcd.wu.j6(-450617560726896351L, this);
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
        public boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
            long r2 = 0L;
            long r3 = 0L;
            int r0 = 0;
            com.aide.engine.service.CharArray r1 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex9 = null;
            int $pc9 = 3;
            $sw9: while (true) {
                switch ($pc9) {
                    case 30: {
                        th = $ex9;
                        if (DW == false) { $pc9 = 34; continue $sw9; }
                        abcd.wu.j6(th, -796208241111484916L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
                        $pc9 = 34; continue $sw9;
                    }
                    case 34: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc9 = 6; continue $sw9; }
                        try {
                            abcd.wu.j6(-796208241111484916L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 30; continue $sw9;
                        }
                        $pc9 = 6; continue $sw9;
                    }
                    case 6: {
                        if (r10 != 1) { $pc9 = 8; continue $sw9; }
                        try {
                            r11.enforceInterface("com.aide.engine.service.IOpenFileInterface");
                            r2 = getVersion();
                            r12.writeNoException();
                            r12.writeLong(r2);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 30; continue $sw9;
                        }
                        return true;
                    }
                    case 8: {
                        if (r10 != 2) { $pc9 = 10; continue $sw9; }
                        try {
                            r11.enforceInterface("com.aide.engine.service.IOpenFileInterface");
                            r3 = ye();
                            r12.writeNoException();
                            r12.writeLong(r3);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 30; continue $sw9;
                        }
                        return true;
                    }
                    case 10: {
                        if (r10 != 3) { $pc9 = 12; continue $sw9; }
                        try {
                            r11.enforceInterface("com.aide.engine.service.IOpenFileInterface");
                            r0 = sE();
                            r12.writeNoException();
                            r12.writeInt(r0);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 30; continue $sw9;
                        }
                        return true;
                    }
                    case 12: {
                        if (r10 != 4) { $pc9 = 14; continue $sw9; }
                        try {
                            r11.enforceInterface("com.aide.engine.service.IOpenFileInterface");
                            r1 = FH(r11.readInt());
                            r12.writeNoException();
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 30; continue $sw9;
                        }
                        if (r1 == null) { $pc9 = 22; continue $sw9; }
                        try {
                            r12.writeInt(1);
                            r1.writeToParcel(r12, 1);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 30; continue $sw9;
                        }
                        $pc9 = 23; continue $sw9;
                    }
                    case 23: {
                        return true;
                    }
                    case 22: {
                        try {
                            r12.writeInt(0);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 30; continue $sw9;
                        }
                        { $pc9 = 23; continue $sw9; }
                    }
                    case 14: {
                        if (r10 != 1598968902) { $pc9 = 16; continue $sw9; }
                        try {
                            r12.writeString("com.aide.engine.service.IOpenFileInterface");
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 30; continue $sw9;
                        }
                        return true;
                    }
                    case 16: {
                        return super.onTransact(r10, r11, r12, r13);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    com.aide.engine.service.CharArray FH(int r1);

    long getVersion();

    int sE();

    long ye();
}
