package com.aide.engine.service;

public interface w extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class a extends android.os.Binder implements com.aide.engine.service.w {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0039a implements com.aide.engine.service.w {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = 440645001420732963L)
            private android.os.IBinder FH;



            @abcd.Interfacesu(method = 221330887697390567L)
            C0039a(android.os.IBinder r6) {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex0 = null;
                int $pc0 = 4;
                $sw0: while (true) {
                    switch ($pc0) {
                        case 8: {
                            th = $ex0;
                            if (DW == false) { $pc0 = 12; continue $sw0; }
                            abcd.wu.j6(th, -8092723588514761207L, null, r6);
                            $pc0 = 12; continue $sw0;
                        }
                        case 12: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc0 = 6; continue $sw0; }
                            try {
                                abcd.wu.j6(-8092723588514761207L, null, r6);
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
            @abcd.Interfacesu(method = 2362602607421474515L)
            public void DW(java.lang.String r8) {
                android.os.Parcel r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex1 = null;
                int $pc1 = 4;
                $sw1: while (true) {
                    switch ($pc1) {
                        case 13: {
                            th = $ex1;
                            if (DW == false) { $pc1 = 17; continue $sw1; }
                            abcd.wu.j6(th, 4970186663013628353L, this, r8);
                            $pc1 = 17; continue $sw1;
                        }
                        case 17: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc1 = 6; continue $sw1; }
                            try {
                                abcd.wu.j6(4970186663013628353L, this, r8);
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
                                r2.writeInterfaceToken("com.aide.engine.service.IUsageSearcherListener");
                                r2.writeString(r8);
                                this.FH.transact(2, r2, null, 1);
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
            @abcd.Interfacesu(method = 1683629978818992961L)
            public android.os.IBinder asBinder() {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex2 = null;
                int $pc2 = 4;
                $sw2: while (true) {
                    switch ($pc2) {
                        case 8: {
                            th = $ex2;
                            if (DW == false) { $pc2 = 12; continue $sw2; }
                            abcd.wu.j6(th, 772441023226253679L, this);
                            $pc2 = 12; continue $sw2;
                        }
                        case 12: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc2 = 6; continue $sw2; }
                            try {
                                abcd.wu.j6(772441023226253679L, this);
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
            @abcd.Interfacesu(method = -1575129920923192653L)
            public void br() {
                android.os.Parcel r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex3 = null;
                int $pc3 = 4;
                $sw3: while (true) {
                    switch ($pc3) {
                        case 13: {
                            th = $ex3;
                            if (DW == false) { $pc3 = 17; continue $sw3; }
                            abcd.wu.j6(th, 5114337826605890389L, this);
                            $pc3 = 17; continue $sw3;
                        }
                        case 17: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc3 = 6; continue $sw3; }
                            try {
                                abcd.wu.j6(5114337826605890389L, this);
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
                                r2.writeInterfaceToken("com.aide.engine.service.IUsageSearcherListener");
                                this.FH.transact(1, r2, null, 1);
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
            @abcd.Interfacesu(method = -4463910579464058744L)
            public void j6(java.util.List r8) {
                android.os.Parcel r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex4 = null;
                int $pc4 = 4;
                $sw4: while (true) {
                    switch ($pc4) {
                        case 13: {
                            th = $ex4;
                            if (DW == false) { $pc4 = 17; continue $sw4; }
                            abcd.wu.j6(th, 709124863180210800L, this, r8);
                            $pc4 = 17; continue $sw4;
                        }
                        case 17: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc4 = 6; continue $sw4; }
                            try {
                                abcd.wu.j6(709124863180210800L, this, r8);
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
                                r2.writeInterfaceToken("com.aide.engine.service.IUsageSearcherListener");
                                r2.writeList(r8);
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
                        abcd.wu.j6(th, 2283515085181683056L, null);
                        $pc5 = 12; continue $sw5;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc5 = 6; continue $sw5; }
                        try {
                            abcd.wu.j6(2283515085181683056L, null);
                        } catch (java.lang.Throwable $t) {
                            $ex5 = $t;
                            $pc5 = 8; continue $sw5;
                        }
                        $pc5 = 6; continue $sw5;
                    }
                    case 6: {
                        try {
                            attachInterface(this, "com.aide.engine.service.IUsageSearcherListener");
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

        public static com.aide.engine.service.w j6(android.os.IBinder r5) {
            android.os.IInterface r3 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex6 = null;
            int $pc6 = 4;
            $sw6: while (true) {
                switch ($pc6) {
                    case 16: {
                        th = $ex6;
                        if (DW == false) { $pc6 = 20; continue $sw6; }
                        abcd.wu.j6(th, 2225713306650070211L, null, r5);
                        $pc6 = 20; continue $sw6;
                    }
                    case 20: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc6 = 6; continue $sw6; }
                        try {
                            abcd.wu.j6(2225713306650070211L, null, r5);
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
                            r3 = r5.queryLocalInterface("com.aide.engine.service.IUsageSearcherListener");
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 16; continue $sw6;
                        }
                        if (r3 == null) { $pc6 = 15; continue $sw6; }
                        if ((r3 instanceof com.aide.engine.service.w) == false) { $pc6 = 15; continue $sw6; }
                        return (com.aide.engine.service.w) r3;
                    }
                    case 15: {
                        return new com.aide.engine.service.w.a.C0039a(r5);
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
                        abcd.wu.j6(th, -280908494185821744L, this);
                        $pc7 = 11; continue $sw7;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc7 = 6; continue $sw7; }
                        try {
                            abcd.wu.j6(-280908494185821744L, this);
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
            java.lang.Throwable th = null;
            java.lang.Throwable $ex8 = null;
            int $pc8 = 3;
            $sw8: while (true) {
                switch ($pc8) {
                    case 23: {
                        th = $ex8;
                        if (DW == false) { $pc8 = 27; continue $sw8; }
                        abcd.wu.j6(th, -1228455353449614485L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
                        $pc8 = 27; continue $sw8;
                    }
                    case 27: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc8 = 6; continue $sw8; }
                        try {
                            abcd.wu.j6(-1228455353449614485L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 23; continue $sw8;
                        }
                        $pc8 = 6; continue $sw8;
                    }
                    case 6: {
                        if (r10 != 1) { $pc8 = 8; continue $sw8; }
                        try {
                            r11.enforceInterface("com.aide.engine.service.IUsageSearcherListener");
                            br();
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 23; continue $sw8;
                        }
                        return true;
                    }
                    case 8: {
                        if (r10 != 2) { $pc8 = 10; continue $sw8; }
                        try {
                            r11.enforceInterface("com.aide.engine.service.IUsageSearcherListener");
                            DW(r11.readString());
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 23; continue $sw8;
                        }
                        return true;
                    }
                    case 10: {
                        if (r10 != 3) { $pc8 = 12; continue $sw8; }
                        try {
                            r11.enforceInterface("com.aide.engine.service.IUsageSearcherListener");
                            j6(r11.readArrayList(getClass().getClassLoader()));
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 23; continue $sw8;
                        }
                        return true;
                    }
                    case 12: {
                        if (r10 != 1598968902) { $pc8 = 14; continue $sw8; }
                        try {
                            r12.writeString("com.aide.engine.service.IUsageSearcherListener");
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 23; continue $sw8;
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

    void DW(java.lang.String r1);

    void br();

    void j6(java.util.List r1);
}
