package com.aide.engine.service;

public interface o extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class a extends android.os.Binder implements com.aide.engine.service.o {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0031a implements com.aide.engine.service.o {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = -3459046082940213659L)
            private android.os.IBinder FH;



            @abcd.Interfacesu(method = 161464855926417607L)
            C0031a(android.os.IBinder r6) {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex0 = null;
                int $pc0 = 4;
                $sw0: while (true) {
                    switch ($pc0) {
                        case 8: {
                            th = $ex0;
                            if (DW == false) { $pc0 = 12; continue $sw0; }
                            abcd.wu.j6(th, -2614232457135053832L, null, r6);
                            $pc0 = 12; continue $sw0;
                        }
                        case 12: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc0 = 6; continue $sw0; }
                            try {
                                abcd.wu.j6(-2614232457135053832L, null, r6);
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
            @abcd.Interfacesu(method = 2231263262757348972L)
            public void Hw(java.util.List r8) {
                android.os.Parcel r2 = null;
                android.os.Parcel r3 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex1 = null;
                int $pc1 = 4;
                $sw1: while (true) {
                    switch ($pc1) {
                        case 13: {
                            th = $ex1;
                            if (DW == false) { $pc1 = 17; continue $sw1; }
                            abcd.wu.j6(th, 1097041912497978175L, this, r8);
                            $pc1 = 17; continue $sw1;
                        }
                        case 17: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc1 = 6; continue $sw1; }
                            try {
                                abcd.wu.j6(1097041912497978175L, this, r8);
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 13; continue $sw1;
                            }
                            $pc1 = 6; continue $sw1;
                        }
                        case 6: {
                            try {
                                r2 = android.os.Parcel.obtain();
                                r3 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 13; continue $sw1;
                            }
                            try {
                                r2.writeInterfaceToken("com.aide.engine.service.ICodeCompletionListener");
                                r2.writeList(r8);
                                this.FH.transact(3, r2, r3, 0);
                                r3.readException();
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 10; continue $sw1;
                            }
                            try {
                                r3.recycle();
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
                                r3.recycle();
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
            @abcd.Interfacesu(method = 106183948412491457L)
            public android.os.IBinder asBinder() {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex2 = null;
                int $pc2 = 4;
                $sw2: while (true) {
                    switch ($pc2) {
                        case 8: {
                            th = $ex2;
                            if (DW == false) { $pc2 = 12; continue $sw2; }
                            abcd.wu.j6(th, -2399800017783731968L, this);
                            $pc2 = 12; continue $sw2;
                        }
                        case 12: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc2 = 6; continue $sw2; }
                            try {
                                abcd.wu.j6(-2399800017783731968L, this);
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
            @abcd.Interfacesu(method = -3966296240187620096L)
            public void j6(java.lang.String r10, long r11, int r13, int r14) {
                android.os.Parcel r0 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex3 = null;
                int $pc3 = 3;
                $sw3: while (true) {
                    switch ($pc3) {
                        case 12: {
                            th = $ex3;
                            if (DW == false) { $pc3 = 16; continue $sw3; }
                            abcd.wu.j6(th, -1170139112213791671L, this, r10, new java.lang.Long(r11), new java.lang.Integer(r13), new java.lang.Integer(r14));
                            $pc3 = 16; continue $sw3;
                        }
                        case 16: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 3: {
                            if (j6 == false) { $pc3 = 5; continue $sw3; }
                            try {
                                abcd.wu.j6(-1170139112213791671L, this, r10, new java.lang.Long(r11), new java.lang.Integer(r13), new java.lang.Integer(r14));
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 12; continue $sw3;
                            }
                            $pc3 = 5; continue $sw3;
                        }
                        case 5: {
                            try {
                                r0 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 12; continue $sw3;
                            }
                            try {
                                r0.writeInterfaceToken("com.aide.engine.service.ICodeCompletionListener");
                                r0.writeString(r10);
                                r0.writeLong(r11);
                                r0.writeInt(r13);
                                r0.writeInt(r14);
                                this.FH.transact(1, r0, null, 1);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 9; continue $sw3;
                            }
                            try {
                                r0.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 12; continue $sw3;
                            }
                            return;
                        }
                        case 9: {
                            th = $ex3;
                            try {
                                r0.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 12; continue $sw3;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = 737911287991044393L)
            public void j6(java.lang.String r17, long r18, int r20, int r21, int r22, com.aide.engine.SourceEntity r23, java.lang.String r24) {
                android.os.Parcel r9 = null;
                android.os.Parcel r12 = null;
                int r0 = 0;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex4 = null;
                int $pc4 = -1;
                $sw4: while (true) {
                    switch ($pc4) {
                        case -1: {
                            if (j6 == false) { $pc4 = 5; continue $sw4; }
                            abcd.wu.j6(2679379762904078000L, this, new java.lang.Object[]{r17, new java.lang.Long(r18), new java.lang.Integer(r20), new java.lang.Integer(r21), new java.lang.Integer(r22), r23, r24});
                            $pc4 = 5; continue $sw4;
                        }
                        case 5: {
                            r9 = android.os.Parcel.obtain();
                            r12 = android.os.Parcel.obtain();
                            try {
                                r9.writeInterfaceToken("com.aide.engine.service.ICodeCompletionListener");
                                r9.writeString(r17);
                                r9.writeLong(r18);
                                r9.writeInt(r20);
                                r9.writeInt(r21);
                                r9.writeInt(r22);
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 13; continue $sw4;
                            }
                            if (r23 == null) { $pc4 = 9; continue $sw4; }
                            try {
                                r9.writeInt(1);
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 13; continue $sw4;
                            }
                            r0 = 0;
                            try {
                                r23.writeToParcel(r9, 0);
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 13; continue $sw4;
                            }
                            $pc4 = 10; continue $sw4;
                        }
                        case 10: {
                            try {
                                r9.writeString(r24);
                                this.FH.transact(4, r9, r12, r0);
                                r12.readException();
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 13; continue $sw4;
                            }
                            r12.recycle();
                            r9.recycle();
                            return;
                        }
                        case 9: {
                            r0 = 0;
                            try {
                                r9.writeInt(0);
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 13; continue $sw4;
                            }
                            return;
                        }
                        case 13: {
                            th = $ex4;
                            r12.recycle();
                            r9.recycle();
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = -281920030875862379L)
            public void k2() {
                android.os.Parcel r2 = null;
                android.os.Parcel r3 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex5 = null;
                int $pc5 = 4;
                $sw5: while (true) {
                    switch ($pc5) {
                        case 13: {
                            th = $ex5;
                            if (DW == false) { $pc5 = 17; continue $sw5; }
                            abcd.wu.j6(th, 7276064415114448888L, this);
                            $pc5 = 17; continue $sw5;
                        }
                        case 17: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc5 = 6; continue $sw5; }
                            try {
                                abcd.wu.j6(7276064415114448888L, this);
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
                                r2.writeInterfaceToken("com.aide.engine.service.ICodeCompletionListener");
                                this.FH.transact(2, r2, r3, 0);
                                r3.readException();
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
                            return;
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
                        abcd.wu.j6(th, -103535347972648032L, null);
                        $pc6 = 12; continue $sw6;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc6 = 6; continue $sw6; }
                        try {
                            abcd.wu.j6(-103535347972648032L, null);
                        } catch (java.lang.Throwable $t) {
                            $ex6 = $t;
                            $pc6 = 8; continue $sw6;
                        }
                        $pc6 = 6; continue $sw6;
                    }
                    case 6: {
                        try {
                            attachInterface(this, "com.aide.engine.service.ICodeCompletionListener");
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

        public static com.aide.engine.service.o j6(android.os.IBinder r5) {
            android.os.IInterface r3 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex7 = null;
            int $pc7 = 4;
            $sw7: while (true) {
                switch ($pc7) {
                    case 16: {
                        th = $ex7;
                        if (DW == false) { $pc7 = 20; continue $sw7; }
                        abcd.wu.j6(th, -1509738585364517119L, null, r5);
                        $pc7 = 20; continue $sw7;
                    }
                    case 20: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc7 = 6; continue $sw7; }
                        try {
                            abcd.wu.j6(-1509738585364517119L, null, r5);
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
                            r3 = r5.queryLocalInterface("com.aide.engine.service.ICodeCompletionListener");
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            $pc7 = 16; continue $sw7;
                        }
                        if (r3 == null) { $pc7 = 15; continue $sw7; }
                        if ((r3 instanceof com.aide.engine.service.o) == false) { $pc7 = 15; continue $sw7; }
                        return (com.aide.engine.service.o) r3;
                    }
                    case 15: {
                        return new com.aide.engine.service.o.a.C0031a(r5);
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
                        abcd.wu.j6(th, 326068616151350860L, this);
                        $pc8 = 11; continue $sw8;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc8 = 6; continue $sw8; }
                        try {
                            abcd.wu.j6(326068616151350860L, this);
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
        public boolean onTransact(int r12, android.os.Parcel r13, android.os.Parcel r14, int r15) {
            java.lang.String r3 = null;
            long r4 = 0L;
            int r6 = 0;
            int r7 = 0;
            int r8 = 0;
            com.aide.engine.SourceEntity r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex9 = null;
            int $pc9 = 3;
            $sw9: while (true) {
                switch ($pc9) {
                    case 31: {
                        th = $ex9;
                        if (DW == false) { $pc9 = 35; continue $sw9; }
                        abcd.wu.j6(th, 194022139227402401L, this, new java.lang.Integer(r12), r13, r14, new java.lang.Integer(r15));
                        $pc9 = 35; continue $sw9;
                    }
                    case 35: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc9 = 6; continue $sw9; }
                        try {
                            abcd.wu.j6(194022139227402401L, this, new java.lang.Integer(r12), r13, r14, new java.lang.Integer(r15));
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 31; continue $sw9;
                        }
                        $pc9 = 6; continue $sw9;
                    }
                    case 6: {
                        if (r12 != 1) { $pc9 = 8; continue $sw9; }
                        try {
                            r13.enforceInterface("com.aide.engine.service.ICodeCompletionListener");
                            j6(r13.readString(), r13.readLong(), r13.readInt(), r13.readInt());
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 31; continue $sw9;
                        }
                        return true;
                    }
                    case 8: {
                        if (r12 != 2) { $pc9 = 10; continue $sw9; }
                        try {
                            r13.enforceInterface("com.aide.engine.service.ICodeCompletionListener");
                            k2();
                            r14.writeNoException();
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 31; continue $sw9;
                        }
                        return true;
                    }
                    case 10: {
                        if (r12 != 3) { $pc9 = 12; continue $sw9; }
                        try {
                            r13.enforceInterface("com.aide.engine.service.ICodeCompletionListener");
                            Hw(r13.readArrayList(getClass().getClassLoader()));
                            r14.writeNoException();
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 31; continue $sw9;
                        }
                        return true;
                    }
                    case 12: {
                        if (r12 != 4) { $pc9 = 14; continue $sw9; }
                        try {
                            r13.enforceInterface("com.aide.engine.service.ICodeCompletionListener");
                            r3 = r13.readString();
                            r4 = r13.readLong();
                            r6 = r13.readInt();
                            r7 = r13.readInt();
                            r8 = r13.readInt();
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 31; continue $sw9;
                        }
                        if (r13.readInt() == 0) { $pc9 = 22; continue $sw9; }
                        try {
                            r0 = com.aide.engine.SourceEntity.CREATOR.createFromParcel(r13);
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 31; continue $sw9;
                        }
                        $pc9 = 23; continue $sw9;
                    }
                    case 23: {
                        try {
                            j6(r3, r4, r6, r7, r8, r0, r13.readString());
                            r14.writeNoException();
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 31; continue $sw9;
                        }
                        return true;
                    }
                    case 22: {
                        r0 = null;
                        { $pc9 = 23; continue $sw9; }
                    }
                    case 14: {
                        if (r12 != 1598968902) { $pc9 = 16; continue $sw9; }
                        try {
                            r14.writeString("com.aide.engine.service.ICodeCompletionListener");
                        } catch (java.lang.Throwable $t) {
                            $ex9 = $t;
                            $pc9 = 31; continue $sw9;
                        }
                        return true;
                    }
                    case 16: {
                        return super.onTransact(r12, r13, r14, r15);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    void Hw(java.util.List r1);

    void j6(java.lang.String r1, long r2, int r4, int r5);

    void j6(java.lang.String r1, long r2, int r4, int r5, int r6, com.aide.engine.SourceEntity r7, java.lang.String r8);

    void k2();
}
