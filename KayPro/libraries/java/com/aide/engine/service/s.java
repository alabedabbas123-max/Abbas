package com.aide.engine.service;

public interface s extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class a extends android.os.Binder implements com.aide.engine.service.s {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0035a implements com.aide.engine.service.s {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = -1495824422362306387L)
            private android.os.IBinder FH;



            @abcd.Interfacesu(method = 29365183006822557L)
            C0035a(android.os.IBinder r6) {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex0 = null;
                int $pc0 = 4;
                $sw0: while (true) {
                    switch ($pc0) {
                        case 8: {
                            th = $ex0;
                            if (DW == false) { $pc0 = 12; continue $sw0; }
                            abcd.wu.j6(th, 3250777090605377157L, null, r6);
                            $pc0 = 12; continue $sw0;
                        }
                        case 12: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc0 = 6; continue $sw0; }
                            try {
                                abcd.wu.j6(3250777090605377157L, null, r6);
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
            @abcd.Interfacesu(method = -2388320162283844125L)
            public void DW(com.aide.engine.FileHighlightings r8) {
                android.os.Parcel r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex1 = null;
                int $pc1 = 4;
                $sw1: while (true) {
                    switch ($pc1) {
                        case 17: {
                            th = $ex1;
                            if (DW == false) { $pc1 = 21; continue $sw1; }
                            abcd.wu.j6(th, -186412253288326429L, this, r8);
                            $pc1 = 21; continue $sw1;
                        }
                        case 21: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc1 = 6; continue $sw1; }
                            try {
                                abcd.wu.j6(-186412253288326429L, this, r8);
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 17; continue $sw1;
                            }
                            $pc1 = 6; continue $sw1;
                        }
                        case 6: {
                            try {
                                r2 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 17; continue $sw1;
                            }
                            try {
                                r2.writeInterfaceToken("com.aide.engine.service.IHighlightingListener");
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 14; continue $sw1;
                            }
                            if (r8 == null) { $pc1 = 10; continue $sw1; }
                            try {
                                r2.writeInt(1);
                                r8.writeToParcel(r2, 0);
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 14; continue $sw1;
                            }
                            $pc1 = 11; continue $sw1;
                        }
                        case 11: {
                            try {
                                this.FH.transact(2, r2, null, 1);
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 14; continue $sw1;
                            }
                            try {
                                r2.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 17; continue $sw1;
                            }
                            return;
                        }
                        case 10: {
                            try {
                                r2.writeInt(0);
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 14; continue $sw1;
                            }
                            $pc1 = 14; continue $sw1;
                        }
                        case 14: {
                            th = $ex1;
                            try {
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
            @abcd.Interfacesu(method = -2315648817761525845L)
            public android.os.IBinder asBinder() {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex2 = null;
                int $pc2 = 4;
                $sw2: while (true) {
                    switch ($pc2) {
                        case 8: {
                            th = $ex2;
                            if (DW == false) { $pc2 = 12; continue $sw2; }
                            abcd.wu.j6(th, 2675077546452466803L, this);
                            $pc2 = 12; continue $sw2;
                        }
                        case 12: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc2 = 6; continue $sw2; }
                            try {
                                abcd.wu.j6(2675077546452466803L, this);
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
            @abcd.Interfacesu(method = 1261223800204469472L)
            public void j6(com.aide.engine.FileHighlightings r7) {
                android.os.Parcel r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex3 = null;
                int $pc3 = 4;
                $sw3: while (true) {
                    switch ($pc3) {
                        case 17: {
                            th = $ex3;
                            if (DW == false) { $pc3 = 21; continue $sw3; }
                            abcd.wu.j6(th, 1065997172123580224L, this, r7);
                            $pc3 = 21; continue $sw3;
                        }
                        case 21: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc3 = 6; continue $sw3; }
                            try {
                                abcd.wu.j6(1065997172123580224L, this, r7);
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
                                r2.writeInterfaceToken("com.aide.engine.service.IHighlightingListener");
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 14; continue $sw3;
                            }
                            if (r7 == null) { $pc3 = 10; continue $sw3; }
                            try {
                                r2.writeInt(1);
                                r7.writeToParcel(r2, 0);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 14; continue $sw3;
                            }
                            $pc3 = 11; continue $sw3;
                        }
                        case 11: {
                            try {
                                this.FH.transact(1, r2, null, 1);
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
                            $pc3 = 14; continue $sw3;
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
                        abcd.wu.j6(th, 1326560728146564105L, null);
                        $pc4 = 12; continue $sw4;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc4 = 6; continue $sw4; }
                        try {
                            abcd.wu.j6(1326560728146564105L, null);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 8; continue $sw4;
                        }
                        $pc4 = 6; continue $sw4;
                    }
                    case 6: {
                        try {
                            attachInterface(this, "com.aide.engine.service.IHighlightingListener");
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

        public static com.aide.engine.service.s j6(android.os.IBinder r5) {
            android.os.IInterface r3 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex5 = null;
            int $pc5 = 4;
            $sw5: while (true) {
                switch ($pc5) {
                    case 16: {
                        th = $ex5;
                        if (DW == false) { $pc5 = 20; continue $sw5; }
                        abcd.wu.j6(th, -819741945735097924L, null, r5);
                        $pc5 = 20; continue $sw5;
                    }
                    case 20: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc5 = 6; continue $sw5; }
                        try {
                            abcd.wu.j6(-819741945735097924L, null, r5);
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
                            r3 = r5.queryLocalInterface("com.aide.engine.service.IHighlightingListener");
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 16; continue $sw5;
                        }
                        if (r3 == null) { $pc5 = 15; continue $sw5; }
                        if ((r3 instanceof com.aide.engine.service.s) == false) { $pc5 = 15; continue $sw5; }
                        return (com.aide.engine.service.s) r3;
                    }
                    case 15: {
                        return new com.aide.engine.service.s.a.C0035a(r5);
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
                        abcd.wu.j6(th, -2000415084153274839L, this);
                        $pc6 = 11; continue $sw6;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc6 = 6; continue $sw6; }
                        try {
                            abcd.wu.j6(-2000415084153274839L, this);
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
            com.aide.engine.FileHighlightings r1 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex7 = null;
            int $pc7 = 3;
            $sw7: while (true) {
                switch ($pc7) {
                    case 25: {
                        th = $ex7;
                        if (DW == false) { $pc7 = 29; continue $sw7; }
                        abcd.wu.j6(th, -764330066633289156L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
                        $pc7 = 29; continue $sw7;
                    }
                    case 29: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc7 = 5; continue $sw7; }
                        try {
                            abcd.wu.j6(-764330066633289156L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 25; continue $sw7;
                        }
                        $pc7 = 5; continue $sw7;
                    }
                    case 5: {
                        r1 = null;
                        if (r10 != 1) { $pc7 = 8; continue $sw7; }
                        try {
                            r11.enforceInterface("com.aide.engine.service.IHighlightingListener");
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 25; continue $sw7;
                        }
                        if (r11.readInt() == 0) { $pc7 = 23; continue $sw7; }
                        try {
                            r1 = com.aide.engine.FileHighlightings.CREATOR.createFromParcel(r11);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 25; continue $sw7;
                        }
                        $pc7 = 23; continue $sw7;
                    }
                    case 23: {
                        try {
                            j6(r1);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 25; continue $sw7;
                        }
                        return true;
                    }
                    case 8: {
                        if (r10 != 2) { $pc7 = 10; continue $sw7; }
                        try {
                            r11.enforceInterface("com.aide.engine.service.IHighlightingListener");
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 25; continue $sw7;
                        }
                        if (r11.readInt() == 0) { $pc7 = 18; continue $sw7; }
                        try {
                            r1 = com.aide.engine.FileHighlightings.CREATOR.createFromParcel(r11);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 25; continue $sw7;
                        }
                        $pc7 = 18; continue $sw7;
                    }
                    case 18: {
                        try {
                            DW(r1);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 25; continue $sw7;
                        }
                        return true;
                    }
                    case 10: {
                        if (r10 != 1598968902) { $pc7 = 12; continue $sw7; }
                        try {
                            r12.writeString("com.aide.engine.service.IHighlightingListener");
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 25; continue $sw7;
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

    void DW(com.aide.engine.FileHighlightings r1);

    void j6(com.aide.engine.FileHighlightings r1);
}
