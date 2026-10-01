package com.aide.engine.service;

public interface t extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class a extends android.os.Binder implements com.aide.engine.service.t {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0036a implements com.aide.engine.service.t {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = -3302252543675751804L)
            private android.os.IBinder FH;



            @abcd.Interfacesu(method = -4047854087946226600L)
            C0036a(android.os.IBinder r6) {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex0 = null;
                int $pc0 = 4;
                $sw0: while (true) {
                    switch ($pc0) {
                        case 8: {
                            th = $ex0;
                            if (DW == false) { $pc0 = 12; continue $sw0; }
                            abcd.wu.j6(th, 6690430170789546384L, null, r6);
                            $pc0 = 12; continue $sw0;
                        }
                        case 12: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc0 = 6; continue $sw0; }
                            try {
                                abcd.wu.j6(6690430170789546384L, null, r6);
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
            @abcd.Interfacesu(method = -309128250239940045L)
            public void DW(java.lang.String r10, long r11, int r13, int r14) {
                android.os.Parcel r0 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex1 = null;
                int $pc1 = 3;
                $sw1: while (true) {
                    switch ($pc1) {
                        case 12: {
                            th = $ex1;
                            if (DW == false) { $pc1 = 16; continue $sw1; }
                            abcd.wu.j6(th, -3241649992988355111L, this, r10, new java.lang.Long(r11), new java.lang.Integer(r13), new java.lang.Integer(r14));
                            $pc1 = 16; continue $sw1;
                        }
                        case 16: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 3: {
                            if (j6 == false) { $pc1 = 5; continue $sw1; }
                            try {
                                abcd.wu.j6(-3241649992988355111L, this, r10, new java.lang.Long(r11), new java.lang.Integer(r13), new java.lang.Integer(r14));
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 12; continue $sw1;
                            }
                            $pc1 = 5; continue $sw1;
                        }
                        case 5: {
                            try {
                                r0 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 12; continue $sw1;
                            }
                            try {
                                r0.writeInterfaceToken("com.aide.engine.service.INavigationListener");
                                r0.writeString(r10);
                                r0.writeLong(r11);
                                r0.writeInt(r13);
                                r0.writeInt(r14);
                                this.FH.transact(2, r0, null, 1);
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 9; continue $sw1;
                            }
                            try {
                                r0.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 12; continue $sw1;
                            }
                            return;
                        }
                        case 9: {
                            th = $ex1;
                            try {
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
            @abcd.Interfacesu(method = 1914714510163354472L)
            public android.os.IBinder asBinder() {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex2 = null;
                int $pc2 = 4;
                $sw2: while (true) {
                    switch ($pc2) {
                        case 8: {
                            th = $ex2;
                            if (DW == false) { $pc2 = 12; continue $sw2; }
                            abcd.wu.j6(th, -2902466081824273584L, this);
                            $pc2 = 12; continue $sw2;
                        }
                        case 12: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc2 = 6; continue $sw2; }
                            try {
                                abcd.wu.j6(-2902466081824273584L, this);
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
            @abcd.Interfacesu(method = 267418839655490688L)
            public void j6(java.lang.String r15, long r16, int r18, int r19, com.aide.engine.SourceEntity r20) {
                java.lang.Throwable r1 = null;
                android.os.Parcel r5 = null;
                java.lang.Throwable $ex3 = null;
                int $pc3 = 4;
                $sw3: while (true) {
                    switch ($pc3) {
                        case 27: {
                            th = th;
                            $pc3 = 30; continue $sw3;
                        }
                        case 30: {
                            if (DW == false) { $pc3 = 32; continue $sw3; }
                            r1 = th;
                            abcd.wu.j6(r1, 305864470263577200L, this, r15, new java.lang.Long(r16), new java.lang.Integer(r18), new java.lang.Integer(r19), r20);
                            $pc3 = 32; continue $sw3;
                        }
                        case 32: {
                            throw th;
                        }
                        case 4: {
                            if (j6 == false) { $pc3 = 36; continue $sw3; }
                            try {
                                abcd.wu.j6(305864470263577200L, this, r15, new java.lang.Long(r16), new java.lang.Integer(r18), new java.lang.Integer(r19), r20);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 27; continue $sw3;
                            }
                            $pc3 = 36; continue $sw3;
                        }
                        case 36: {
                            try {
                                r5 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 27; continue $sw3;
                            }
                            try {
                                r5.writeInterfaceToken("com.aide.engine.service.INavigationListener");
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 21; continue $sw3;
                            }
                            try {
                                r5.writeString(r15);
                                r5.writeLong(r16);
                                r5.writeInt(r18);
                                r5.writeInt(r19);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 19; continue $sw3;
                            }
                            if (r20 == null) { $pc3 = 12; continue $sw3; }
                            try {
                                r5.writeInt(1);
                                r20.writeToParcel(r5, 0);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 19; continue $sw3;
                            }
                            $pc3 = 33; continue $sw3;
                        }
                        case 33: {
                            try {
                                this.FH.transact(1, r5, null, 1);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 17; continue $sw3;
                            }
                            try {
                                r5.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 25; continue $sw3;
                            }
                            return;
                        }
                        case 17: {
                            th = th;
                            $pc3 = 23; continue $sw3;
                        }
                        case 23: {
                            try {
                                r5.recycle();
                                throw th;
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 25; continue $sw3;
                            }
                        }
                        case 12: {
                            try {
                                r5.writeInt(0);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 19; continue $sw3;
                            }
                            return;
                        }
                        case 19: {
                            th = th;
                            return;
                        }
                        case 21: {
                            th = th;
                            return;
                        }
                        case 25: {
                            th = th;
                            { $pc3 = 30; continue $sw3; }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }
        }



        public a() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = 4;
            $sw4: while (true) {
                switch ($pc4) {
                    case 8: {
                        th = $ex4;
                        if (DW == false) { $pc4 = 12; continue $sw4; }
                        abcd.wu.j6(th, -424570548263080884L, null);
                        $pc4 = 12; continue $sw4;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc4 = 6; continue $sw4; }
                        try {
                            abcd.wu.j6(-424570548263080884L, null);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 8; continue $sw4;
                        }
                        $pc4 = 6; continue $sw4;
                    }
                    case 6: {
                        try {
                            attachInterface(this, "com.aide.engine.service.INavigationListener");
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 8; continue $sw4;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public static com.aide.engine.service.t j6(android.os.IBinder r5) {
            android.os.IInterface r3 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex5 = null;
            int $pc5 = 4;
            $sw5: while (true) {
                switch ($pc5) {
                    case 16: {
                        th = $ex5;
                        if (DW == false) { $pc5 = 20; continue $sw5; }
                        abcd.wu.j6(th, 1983088002071073825L, null, r5);
                        $pc5 = 20; continue $sw5;
                    }
                    case 20: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc5 = 6; continue $sw5; }
                        try {
                            abcd.wu.j6(1983088002071073825L, null, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 16; continue $sw5;
                        }
                        $pc5 = 6; continue $sw5;
                    }
                    case 6: {
                        if (r5 != null) { $pc5 = 8; continue $sw5; }
                        return null;
                    }
                    case 8: {
                        try {
                            r3 = r5.queryLocalInterface("com.aide.engine.service.INavigationListener");
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 16; continue $sw5;
                        }
                        if (r3 == null) { $pc5 = 15; continue $sw5; }
                        if ((r3 instanceof com.aide.engine.service.t) == false) { $pc5 = 15; continue $sw5; }
                        return (com.aide.engine.service.t) r3;
                    }
                    case 15: {
                        return new com.aide.engine.service.t.a.C0036a(r5);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public android.os.IBinder asBinder() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex6 = null;
            int $pc6 = 4;
            $sw6: while (true) {
                switch ($pc6) {
                    case 7: {
                        th = $ex6;
                        if (DW == false) { $pc6 = 11; continue $sw6; }
                        abcd.wu.j6(th, 1333130433336380928L, this);
                        $pc6 = 11; continue $sw6;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc6 = 6; continue $sw6; }
                        try {
                            abcd.wu.j6(1333130433336380928L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 7; continue $sw6;
                        }
                        $pc6 = 6; continue $sw6;
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
            java.lang.String r3 = null;
            long r4 = 0L;
            int r6 = 0;
            int r7 = 0;
            com.aide.engine.SourceEntity r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex7 = null;
            int $pc7 = 3;
            $sw7: while (true) {
                switch ($pc7) {
                    case 23: {
                        th = $ex7;
                        if (DW == false) { $pc7 = 27; continue $sw7; }
                        abcd.wu.j6(th, 79483760547617473L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
                        $pc7 = 27; continue $sw7;
                    }
                    case 27: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc7 = 6; continue $sw7; }
                        try {
                            abcd.wu.j6(79483760547617473L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 23; continue $sw7;
                        }
                        $pc7 = 6; continue $sw7;
                    }
                    case 6: {
                        if (r10 != 1) { $pc7 = 8; continue $sw7; }
                        try {
                            r11.enforceInterface("com.aide.engine.service.INavigationListener");
                            r3 = r11.readString();
                            r4 = r11.readLong();
                            r6 = r11.readInt();
                            r7 = r11.readInt();
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 23; continue $sw7;
                        }
                        if (r11.readInt() == 0) { $pc7 = 20; continue $sw7; }
                        try {
                            r0 = com.aide.engine.SourceEntity.CREATOR.createFromParcel(r11);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 23; continue $sw7;
                        }
                        $pc7 = 21; continue $sw7;
                    }
                    case 21: {
                        try {
                            j6(r3, r4, r6, r7, r0);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 23; continue $sw7;
                        }
                        return true;
                    }
                    case 20: {
                        r0 = null;
                        { $pc7 = 21; continue $sw7; }
                    }
                    case 8: {
                        if (r10 != 2) { $pc7 = 10; continue $sw7; }
                        try {
                            r11.enforceInterface("com.aide.engine.service.INavigationListener");
                            DW(r11.readString(), r11.readLong(), r11.readInt(), r11.readInt());
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 23; continue $sw7;
                        }
                        return true;
                    }
                    case 10: {
                        if (r10 != 1598968902) { $pc7 = 12; continue $sw7; }
                        try {
                            r12.writeString("com.aide.engine.service.INavigationListener");
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 23; continue $sw7;
                        }
                        return true;
                    }
                    case 12: {
                        return super.onTransact(r10, r11, r12, r13);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    void DW(java.lang.String r1, long r2, int r4, int r5);

    void j6(java.lang.String r1, long r2, int r4, int r5, com.aide.engine.SourceEntity r6);
}
