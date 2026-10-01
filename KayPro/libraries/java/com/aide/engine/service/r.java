package com.aide.engine.service;

public interface r extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class a extends android.os.Binder implements com.aide.engine.service.r {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0034a implements com.aide.engine.service.r {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = -2417446358511725216L)
            private android.os.IBinder FH;



            @abcd.Interfacesu(method = 111498619484119724L)
            C0034a(android.os.IBinder r6) {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex0 = null;
                int $pc0 = 4;
                $sw0: while (true) {
                    switch ($pc0) {
                        case 8: {
                            th = $ex0;
                            if (DW == false) { $pc0 = 12; continue $sw0; }
                            abcd.wu.j6(th, 3330003692273104080L, null, r6);
                            $pc0 = 12; continue $sw0;
                        }
                        case 12: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc0 = 6; continue $sw0; }
                            try {
                                abcd.wu.j6(3330003692273104080L, null, r6);
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
            @abcd.Interfacesu(method = 1896903829601581752L)
            public void Hw(java.lang.String r7) {
                android.os.Parcel r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex1 = null;
                int $pc1 = 4;
                $sw1: while (true) {
                    switch ($pc1) {
                        case 13: {
                            th = $ex1;
                            if (DW == false) { $pc1 = 17; continue $sw1; }
                            abcd.wu.j6(th, 1329847116551799360L, this, r7);
                            $pc1 = 17; continue $sw1;
                        }
                        case 17: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc1 = 6; continue $sw1; }
                            try {
                                abcd.wu.j6(1329847116551799360L, this, r7);
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
                                r2.writeInterfaceToken("com.aide.engine.service.IGotoSymbolListener");
                                r2.writeString(r7);
                                this.FH.transact(1, r2, null, 1);
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
            @abcd.Interfacesu(method = -2796069372734088828L)
            public android.os.IBinder asBinder() {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex2 = null;
                int $pc2 = 4;
                $sw2: while (true) {
                    switch ($pc2) {
                        case 8: {
                            th = $ex2;
                            if (DW == false) { $pc2 = 12; continue $sw2; }
                            abcd.wu.j6(th, 1691597199840509780L, this);
                            $pc2 = 12; continue $sw2;
                        }
                        case 12: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc2 = 6; continue $sw2; }
                            try {
                                abcd.wu.j6(1691597199840509780L, this);
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
            @abcd.Interfacesu(method = -776096382883761173L)
            public void j6(com.aide.engine.SourceEntity r8) {
                android.os.Parcel r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex3 = null;
                int $pc3 = 4;
                $sw3: while (true) {
                    switch ($pc3) {
                        case 17: {
                            th = $ex3;
                            if (DW == false) { $pc3 = 21; continue $sw3; }
                            abcd.wu.j6(th, 254188330020171955L, this, r8);
                            $pc3 = 21; continue $sw3;
                        }
                        case 21: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc3 = 6; continue $sw3; }
                            try {
                                abcd.wu.j6(254188330020171955L, this, r8);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 17; continue $sw3;
                            }
                            $pc3 = 6; continue $sw3;
                        }
                        case 6: {
                            try {
                                r2 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 17; continue $sw3;
                            }
                            try {
                                r2.writeInterfaceToken("com.aide.engine.service.IGotoSymbolListener");
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 14; continue $sw3;
                            }
                            if (r8 == null) { $pc3 = 10; continue $sw3; }
                            try {
                                r2.writeInt(1);
                                r8.writeToParcel(r2, 0);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 14; continue $sw3;
                            }
                            $pc3 = 11; continue $sw3;
                        }
                        case 11: {
                            try {
                                this.FH.transact(3, r2, null, 1);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 14; continue $sw3;
                            }
                            try {
                                r2.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 17; continue $sw3;
                            }
                            return;
                        }
                        case 10: {
                            try {
                                r2.writeInt(0);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 14; continue $sw3;
                            }
                            return;
                        }
                        case 14: {
                            th = $ex3;
                            try {
                                r2.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 17; continue $sw3;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = 2262297566307829600L)
            public void j6(java.lang.String r8, java.util.List r9) {
                android.os.Parcel r0 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex4 = null;
                int $pc4 = 3;
                $sw4: while (true) {
                    switch ($pc4) {
                        case 12: {
                            th = $ex4;
                            if (DW == false) { $pc4 = 16; continue $sw4; }
                            abcd.wu.j6(th, -737003469818683872L, this, r8, r9);
                            $pc4 = 16; continue $sw4;
                        }
                        case 16: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 3: {
                            if (j6 == false) { $pc4 = 5; continue $sw4; }
                            try {
                                abcd.wu.j6(-737003469818683872L, this, r8, r9);
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 12; continue $sw4;
                            }
                            $pc4 = 5; continue $sw4;
                        }
                        case 5: {
                            try {
                                r0 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 12; continue $sw4;
                            }
                            try {
                                r0.writeInterfaceToken("com.aide.engine.service.IGotoSymbolListener");
                                r0.writeString(r8);
                                r0.writeList(r9);
                                this.FH.transact(2, r0, null, 1);
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 9; continue $sw4;
                            }
                            try {
                                r0.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 12; continue $sw4;
                            }
                            return;
                        }
                        case 9: {
                            th = $ex4;
                            try {
                                r0.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 12; continue $sw4;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }
        }



        public a() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex5 = null;
            int $pc5 = 4;
            $sw5: while (true) {
                switch ($pc5) {
                    case 8: {
                        th = $ex5;
                        if (DW == false) { $pc5 = 12; continue $sw5; }
                        abcd.wu.j6(th, 1885388106895399385L, null);
                        $pc5 = 12; continue $sw5;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc5 = 6; continue $sw5; }
                        try {
                            abcd.wu.j6(1885388106895399385L, null);
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 8; continue $sw5;
                        }
                        $pc5 = 6; continue $sw5;
                    }
                    case 6: {
                        try {
                            attachInterface(this, "com.aide.engine.service.IGotoSymbolListener");
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 8; continue $sw5;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public static com.aide.engine.service.r j6(android.os.IBinder r5) {
            android.os.IInterface r3 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex6 = null;
            int $pc6 = 4;
            $sw6: while (true) {
                switch ($pc6) {
                    case 16: {
                        th = $ex6;
                        if (DW == false) { $pc6 = 20; continue $sw6; }
                        abcd.wu.j6(th, -2097897098667510432L, null, r5);
                        $pc6 = 20; continue $sw6;
                    }
                    case 20: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc6 = 6; continue $sw6; }
                        try {
                            abcd.wu.j6(-2097897098667510432L, null, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 16; continue $sw6;
                        }
                        $pc6 = 6; continue $sw6;
                    }
                    case 6: {
                        if (r5 != null) { $pc6 = 8; continue $sw6; }
                        return null;
                    }
                    case 8: {
                        try {
                            r3 = r5.queryLocalInterface("com.aide.engine.service.IGotoSymbolListener");
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 16; continue $sw6;
                        }
                        if (r3 == null) { $pc6 = 15; continue $sw6; }
                        if ((r3 instanceof com.aide.engine.service.r) == false) { $pc6 = 15; continue $sw6; }
                        return (com.aide.engine.service.r) r3;
                    }
                    case 15: {
                        return new com.aide.engine.service.r.a.C0034a(r5);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public android.os.IBinder asBinder() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex7 = null;
            int $pc7 = 4;
            $sw7: while (true) {
                switch ($pc7) {
                    case 7: {
                        th = $ex7;
                        if (DW == false) { $pc7 = 11; continue $sw7; }
                        abcd.wu.j6(th, 1893979369021430977L, this);
                        $pc7 = 11; continue $sw7;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc7 = 6; continue $sw7; }
                        try {
                            abcd.wu.j6(1893979369021430977L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 7; continue $sw7;
                        }
                        $pc7 = 6; continue $sw7;
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
            com.aide.engine.SourceEntity r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex8 = null;
            int $pc8 = 3;
            $sw8: while (true) {
                switch ($pc8) {
                    case 27: {
                        th = $ex8;
                        if (DW == false) { $pc8 = 31; continue $sw8; }
                        abcd.wu.j6(th, 747518924153604416L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
                        $pc8 = 31; continue $sw8;
                    }
                    case 31: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc8 = 6; continue $sw8; }
                        try {
                            abcd.wu.j6(747518924153604416L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 27; continue $sw8;
                        }
                        $pc8 = 6; continue $sw8;
                    }
                    case 6: {
                        if (r10 != 1) { $pc8 = 8; continue $sw8; }
                        try {
                            r11.enforceInterface("com.aide.engine.service.IGotoSymbolListener");
                            Hw(r11.readString());
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 27; continue $sw8;
                        }
                        return true;
                    }
                    case 8: {
                        if (r10 != 2) { $pc8 = 10; continue $sw8; }
                        try {
                            r11.enforceInterface("com.aide.engine.service.IGotoSymbolListener");
                            j6(r11.readString(), r11.readArrayList(getClass().getClassLoader()));
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 27; continue $sw8;
                        }
                        return true;
                    }
                    case 10: {
                        if (r10 != 3) { $pc8 = 12; continue $sw8; }
                        try {
                            r11.enforceInterface("com.aide.engine.service.IGotoSymbolListener");
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 27; continue $sw8;
                        }
                        if (r11.readInt() == 0) { $pc8 = 20; continue $sw8; }
                        try {
                            r0 = com.aide.engine.SourceEntity.CREATOR.createFromParcel(r11);
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 27; continue $sw8;
                        }
                        $pc8 = 21; continue $sw8;
                    }
                    case 21: {
                        try {
                            j6(r0);
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 27; continue $sw8;
                        }
                        return true;
                    }
                    case 20: {
                        r0 = null;
                        { $pc8 = 21; continue $sw8; }
                    }
                    case 12: {
                        if (r10 != 1598968902) { $pc8 = 14; continue $sw8; }
                        try {
                            r12.writeString("com.aide.engine.service.IGotoSymbolListener");
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 27; continue $sw8;
                        }
                        return true;
                    }
                    case 14: {
                        return super.onTransact(r10, r11, r12, r13);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    void Hw(java.lang.String r1);

    void j6(com.aide.engine.SourceEntity r1);

    void j6(java.lang.String r1, java.util.List r2);
}
