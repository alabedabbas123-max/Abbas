package com.aide.engine.service;

public interface p extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class a extends android.os.Binder implements com.aide.engine.service.p {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0032a implements com.aide.engine.service.p {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = -3105846227888116452L)
            private android.os.IBinder FH;



            @abcd.Interfacesu(method = -245730147769690000L)
            C0032a(android.os.IBinder r6) {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex0 = null;
                int $pc0 = 4;
                $sw0: while (true) {
                    switch ($pc0) {
                        case 8: {
                            th = $ex0;
                            if (DW == false) { $pc0 = 12; continue $sw0; }
                            abcd.wu.j6(th, -7026785476429618368L, null, r6);
                            $pc0 = 12; continue $sw0;
                        }
                        case 12: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc0 = 6; continue $sw0; }
                            try {
                                abcd.wu.j6(-7026785476429618368L, null, r6);
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
            @abcd.Interfacesu(method = 82138605853598112L)
            public void FH(java.lang.String r8) {
                android.os.Parcel r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex1 = null;
                int $pc1 = 4;
                $sw1: while (true) {
                    switch ($pc1) {
                        case 13: {
                            th = $ex1;
                            if (DW == false) { $pc1 = 17; continue $sw1; }
                            abcd.wu.j6(th, -3395447268912923280L, this, r8);
                            $pc1 = 17; continue $sw1;
                        }
                        case 17: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc1 = 6; continue $sw1; }
                            try {
                                abcd.wu.j6(-3395447268912923280L, this, r8);
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 13; continue $sw1;
                            }
                            $pc1 = 6; continue $sw1;
                        }
                        case 6: {
                            try {
                                r2 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 13; continue $sw1;
                            }
                            try {
                                r2.writeInterfaceToken("com.aide.engine.service.IEngineErrorListener");
                                r2.writeString(r8);
                                this.FH.transact(5, r2, null, 1);
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 10; continue $sw1;
                            }
                            try {
                                r2.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 13; continue $sw1;
                            }
                            return;
                        }
                        case 10: {
                            th = $ex1;
                            try {
                                r2.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 13; continue $sw1;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = -4434244072808485403L)
            public void OW() {
                android.os.Parcel r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex2 = null;
                int $pc2 = 4;
                $sw2: while (true) {
                    switch ($pc2) {
                        case 13: {
                            th = $ex2;
                            if (DW == false) { $pc2 = 17; continue $sw2; }
                            abcd.wu.j6(th, -4806584748576452415L, this);
                            $pc2 = 17; continue $sw2;
                        }
                        case 17: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc2 = 6; continue $sw2; }
                            try {
                                abcd.wu.j6(-4806584748576452415L, this);
                            } catch (java.lang.Throwable $t) {
                                $ex2 = $t;
                                $pc2 = 13; continue $sw2;
                            }
                            $pc2 = 6; continue $sw2;
                        }
                        case 6: {
                            try {
                                r2 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex2 = $t;
                                $pc2 = 13; continue $sw2;
                            }
                            try {
                                r2.writeInterfaceToken("com.aide.engine.service.IEngineErrorListener");
                                this.FH.transact(1, r2, null, 1);
                            } catch (java.lang.Throwable $t) {
                                $ex2 = $t;
                                $pc2 = 10; continue $sw2;
                            }
                            try {
                                r2.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex2 = $t;
                                $pc2 = 13; continue $sw2;
                            }
                            return;
                        }
                        case 10: {
                            th = $ex2;
                            try {
                                r2.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex2 = $t;
                                $pc2 = 13; continue $sw2;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = 3612442189242930187L)
            public void QX(java.lang.String r8) {
                android.os.Parcel r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex3 = null;
                int $pc3 = 4;
                $sw3: while (true) {
                    switch ($pc3) {
                        case 13: {
                            th = $ex3;
                            if (DW == false) { $pc3 = 17; continue $sw3; }
                            abcd.wu.j6(th, -3590787591572377329L, this, r8);
                            $pc3 = 17; continue $sw3;
                        }
                        case 17: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc3 = 6; continue $sw3; }
                            try {
                                abcd.wu.j6(-3590787591572377329L, this, r8);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 13; continue $sw3;
                            }
                            $pc3 = 6; continue $sw3;
                        }
                        case 6: {
                            try {
                                r2 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 13; continue $sw3;
                            }
                            try {
                                r2.writeInterfaceToken("com.aide.engine.service.IEngineErrorListener");
                                r2.writeString(r8);
                                this.FH.transact(2, r2, null, 1);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 10; continue $sw3;
                            }
                            try {
                                r2.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 13; continue $sw3;
                            }
                            return;
                        }
                        case 10: {
                            th = $ex3;
                            try {
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
            @abcd.Interfacesu(method = 4149488014207849277L)
            public void aj() {
                android.os.Parcel r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex4 = null;
                int $pc4 = 4;
                $sw4: while (true) {
                    switch ($pc4) {
                        case 13: {
                            th = $ex4;
                            if (DW == false) { $pc4 = 17; continue $sw4; }
                            abcd.wu.j6(th, -754960550111463935L, this);
                            $pc4 = 17; continue $sw4;
                        }
                        case 17: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc4 = 6; continue $sw4; }
                            try {
                                abcd.wu.j6(-754960550111463935L, this);
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 13; continue $sw4;
                            }
                            $pc4 = 6; continue $sw4;
                        }
                        case 6: {
                            try {
                                r2 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 13; continue $sw4;
                            }
                            try {
                                r2.writeInterfaceToken("com.aide.engine.service.IEngineErrorListener");
                                this.FH.transact(3, r2, null, 1);
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 10; continue $sw4;
                            }
                            try {
                                r2.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 13; continue $sw4;
                            }
                            return;
                        }
                        case 10: {
                            th = $ex4;
                            try {
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
            @abcd.Interfacesu(method = 2040104003274306352L)
            public android.os.IBinder asBinder() {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex5 = null;
                int $pc5 = 4;
                $sw5: while (true) {
                    switch ($pc5) {
                        case 8: {
                            th = $ex5;
                            if (DW == false) { $pc5 = 12; continue $sw5; }
                            abcd.wu.j6(th, 1233776082611862392L, this);
                            $pc5 = 12; continue $sw5;
                        }
                        case 12: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc5 = 6; continue $sw5; }
                            try {
                                abcd.wu.j6(1233776082611862392L, this);
                            } catch (java.lang.Throwable $t) {
                                $ex5 = $t;
                                $pc5 = 8; continue $sw5;
                            }
                            $pc5 = 6; continue $sw5;
                        }
                        case 6: {
                            return this.FH;
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = -6560151981828953235L)
            public void j6(java.lang.String r9, com.aide.engine.SyntaxError[] r10, boolean r11) {
                android.os.Parcel r0 = null;
                int r1 = 0;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex6 = null;
                int $pc6 = 3;
                $sw6: while (true) {
                    switch ($pc6) {
                        case 15: {
                            th = $ex6;
                            if (DW == false) { $pc6 = 19; continue $sw6; }
                            abcd.wu.j6(th, 5739022252632619521L, this, r9, r10, new java.lang.Boolean(r11));
                            $pc6 = 19; continue $sw6;
                        }
                        case 19: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 3: {
                            if (j6 == false) { $pc6 = 5; continue $sw6; }
                            try {
                                abcd.wu.j6(5739022252632619521L, this, r9, r10, new java.lang.Boolean(r11));
                            } catch (java.lang.Throwable $t) {
                                $ex6 = $t;
                                $pc6 = 15; continue $sw6;
                            }
                            $pc6 = 5; continue $sw6;
                        }
                        case 5: {
                            try {
                                r0 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex6 = $t;
                                $pc6 = 15; continue $sw6;
                            }
                            try {
                                r0.writeInterfaceToken("com.aide.engine.service.IEngineErrorListener");
                                r0.writeString(r9);
                            } catch (java.lang.Throwable $t) {
                                $ex6 = $t;
                                $pc6 = 12; continue $sw6;
                            }
                            r1 = 0;
                            try {
                                r0.writeTypedArray(r10, 0);
                            } catch (java.lang.Throwable $t) {
                                $ex6 = $t;
                                $pc6 = 12; continue $sw6;
                            }
                            if (r11 == false) { $pc6 = 9; continue $sw6; }
                            r1 = 1;
                            $pc6 = 9; continue $sw6;
                        }
                        case 9: {
                            try {
                                r0.writeInt(r1);
                                this.FH.transact(4, r0, null, 1);
                            } catch (java.lang.Throwable $t) {
                                $ex6 = $t;
                                $pc6 = 12; continue $sw6;
                            }
                            try {
                                r0.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex6 = $t;
                                $pc6 = 15; continue $sw6;
                            }
                            return;
                        }
                        case 12: {
                            th = $ex6;
                            try {
                                r0.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex6 = $t;
                                $pc6 = 15; continue $sw6;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }
        }



        public a() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex7 = null;
            int $pc7 = 4;
            $sw7: while (true) {
                switch ($pc7) {
                    case 8: {
                        th = $ex7;
                        if (DW == false) { $pc7 = 12; continue $sw7; }
                        abcd.wu.j6(th, 791699895359807868L, null);
                        $pc7 = 12; continue $sw7;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc7 = 6; continue $sw7; }
                        try {
                            abcd.wu.j6(791699895359807868L, null);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 8; continue $sw7;
                        }
                        $pc7 = 6; continue $sw7;
                    }
                    case 6: {
                        try {
                            attachInterface(this, "com.aide.engine.service.IEngineErrorListener");
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 8; continue $sw7;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public static com.aide.engine.service.p j6(android.os.IBinder r5) {
            android.os.IInterface r3 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex8 = null;
            int $pc8 = 4;
            $sw8: while (true) {
                switch ($pc8) {
                    case 16: {
                        th = $ex8;
                        if (DW == false) { $pc8 = 20; continue $sw8; }
                        abcd.wu.j6(th, -562652590735852983L, null, r5);
                        $pc8 = 20; continue $sw8;
                    }
                    case 20: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc8 = 6; continue $sw8; }
                        try {
                            abcd.wu.j6(-562652590735852983L, null, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 16; continue $sw8;
                        }
                        $pc8 = 6; continue $sw8;
                    }
                    case 6: {
                        if (r5 != null) { $pc8 = 8; continue $sw8; }
                        return null;
                    }
                    case 8: {
                        try {
                            r3 = r5.queryLocalInterface("com.aide.engine.service.IEngineErrorListener");
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 16; continue $sw8;
                        }
                        if (r3 == null) { $pc8 = 15; continue $sw8; }
                        if ((r3 instanceof com.aide.engine.service.p) == false) { $pc8 = 15; continue $sw8; }
                        return (com.aide.engine.service.p) r3;
                    }
                    case 15: {
                        return new com.aide.engine.service.p.a.C0032a(r5);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public android.os.IBinder asBinder() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex9 = null;
            int $pc9 = 4;
            $sw9: while (true) {
                switch ($pc9) {
                    case 7: {
                        th = $ex9;
                        if (DW == false) { $pc9 = 11; continue $sw9; }
                        abcd.wu.j6(th, -61778177497234464L, this);
                        $pc9 = 11; continue $sw9;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc9 = 6; continue $sw9; }
                        try {
                            abcd.wu.j6(-61778177497234464L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 7; continue $sw9;
                        }
                        $pc9 = 6; continue $sw9;
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
            java.lang.String r0 = null;
            com.aide.engine.SyntaxError[] r2 = null;
            boolean r3 = false;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex10 = null;
            int $pc10 = 3;
            $sw10: while (true) {
                switch ($pc10) {
                    case 35: {
                        th = $ex10;
                        if (DW == false) { $pc10 = 39; continue $sw10; }
                        abcd.wu.j6(th, 1418778786085707305L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
                        $pc10 = 39; continue $sw10;
                    }
                    case 39: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc10 = 6; continue $sw10; }
                        try {
                            abcd.wu.j6(1418778786085707305L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 35; continue $sw10;
                        }
                        $pc10 = 6; continue $sw10;
                    }
                    case 6: {
                        if (r10 != 1) { $pc10 = 8; continue $sw10; }
                        try {
                            r11.enforceInterface("com.aide.engine.service.IEngineErrorListener");
                            OW();
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 35; continue $sw10;
                        }
                        return true;
                    }
                    case 8: {
                        if (r10 != 2) { $pc10 = 10; continue $sw10; }
                        try {
                            r11.enforceInterface("com.aide.engine.service.IEngineErrorListener");
                            QX(r11.readString());
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 35; continue $sw10;
                        }
                        return true;
                    }
                    case 10: {
                        if (r10 != 3) { $pc10 = 12; continue $sw10; }
                        try {
                            r11.enforceInterface("com.aide.engine.service.IEngineErrorListener");
                            aj();
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 35; continue $sw10;
                        }
                        return true;
                    }
                    case 12: {
                        if (r10 != 4) { $pc10 = 14; continue $sw10; }
                        try {
                            r11.enforceInterface("com.aide.engine.service.IEngineErrorListener");
                            r0 = r11.readString();
                            r2 = (com.aide.engine.SyntaxError[]) r11.createTypedArray(com.aide.engine.SyntaxError.CREATOR);
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 35; continue $sw10;
                        }
                        if (r11.readInt() == 0) { $pc10 = 26; continue $sw10; }
                        r3 = true;
                        $pc10 = 27; continue $sw10;
                    }
                    case 27: {
                        try {
                            j6(r0, r2, r3);
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 35; continue $sw10;
                        }
                        return true;
                    }
                    case 26: {
                        r3 = false;
                        { $pc10 = 27; continue $sw10; }
                    }
                    case 14: {
                        if (r10 != 5) { $pc10 = 16; continue $sw10; }
                        try {
                            r11.enforceInterface("com.aide.engine.service.IEngineErrorListener");
                            FH(r11.readString());
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 35; continue $sw10;
                        }
                        return true;
                    }
                    case 16: {
                        if (r10 != 1598968902) { $pc10 = 18; continue $sw10; }
                        try {
                            r12.writeString("com.aide.engine.service.IEngineErrorListener");
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 35; continue $sw10;
                        }
                        return true;
                    }
                    case 18: {
                        return super.onTransact(r10, r11, r12, r13);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    void FH(java.lang.String r1);

    void OW();

    void QX(java.lang.String r1);

    void aj();

    void j6(java.lang.String r1, com.aide.engine.SyntaxError[] r2, boolean r3);
}
