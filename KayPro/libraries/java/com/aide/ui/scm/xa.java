package com.aide.ui.scm;

public interface xa extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class a extends android.os.Binder implements com.aide.ui.scm.xa {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0052a implements com.aide.ui.scm.xa {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = 2605735078457432740L)
            private android.os.IBinder FH;



            @abcd.Interfacesu(method = -126305190805034832L)
            C0052a(android.os.IBinder r6) {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex0 = null;
                int $pc0 = 4;
                $sw0: while (true) {
                    switch ($pc0) {
                        case 8: {
                            th = $ex0;
                            if (DW == false) { $pc0 = 12; continue $sw0; }
                            abcd.wu.j6(th, 3657393273991967821L, null, r6);
                            $pc0 = 12; continue $sw0;
                        }
                        case 12: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc0 = 6; continue $sw0; }
                            try {
                                abcd.wu.j6(3657393273991967821L, null, r6);
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
            @abcd.Interfacesu(method = 1010551025583196545L)
            public void AL() {
                android.os.Parcel r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex1 = null;
                int $pc1 = 4;
                $sw1: while (true) {
                    switch ($pc1) {
                        case 13: {
                            th = $ex1;
                            if (DW == false) { $pc1 = 17; continue $sw1; }
                            abcd.wu.j6(th, -6239299140722944296L, this);
                            $pc1 = 17; continue $sw1;
                        }
                        case 17: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc1 = 6; continue $sw1; }
                            try {
                                abcd.wu.j6(-6239299140722944296L, this);
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
                                r2.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");
                                this.FH.transact(4, r2, null, 1);
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
            @abcd.Interfacesu(method = 1901013537234193977L)
            public void Hw(int r7) {
                android.os.Parcel r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex2 = null;
                int $pc2 = 4;
                $sw2: while (true) {
                    switch ($pc2) {
                        case 13: {
                            th = $ex2;
                            if (DW == false) { $pc2 = 17; continue $sw2; }
                            abcd.wu.j6(th, 74299071085801184L, this, new java.lang.Integer(r7));
                            $pc2 = 17; continue $sw2;
                        }
                        case 17: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc2 = 6; continue $sw2; }
                            try {
                                abcd.wu.j6(74299071085801184L, this, r7);
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
                                r2.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");
                                r2.writeInt(r7);
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
            @abcd.Interfacesu(method = 4411913705829546363L)
            public java.lang.String J0(java.lang.String r8) {
                android.os.Parcel r2 = null;
                android.os.Parcel r3 = null;
                java.lang.String r4 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex3 = null;
                int $pc3 = 4;
                $sw3: while (true) {
                    switch ($pc3) {
                        case 13: {
                            th = $ex3;
                            if (DW == false) { $pc3 = 17; continue $sw3; }
                            abcd.wu.j6(th, 2326452910124797440L, this, r8);
                            $pc3 = 17; continue $sw3;
                        }
                        case 17: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc3 = 6; continue $sw3; }
                            try {
                                abcd.wu.j6(2326452910124797440L, this, r8);
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
                                r2.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");
                                r2.writeString(r8);
                                this.FH.transact(8, r2, r3, 0);
                                r3.readException();
                                r4 = r3.readString();
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
            @abcd.Interfacesu(method = 771771530722102475L)
            public java.lang.String Ws(java.lang.String r8) {
                android.os.Parcel r2 = null;
                android.os.Parcel r3 = null;
                java.lang.String r4 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex4 = null;
                int $pc4 = 4;
                $sw4: while (true) {
                    switch ($pc4) {
                        case 13: {
                            th = $ex4;
                            if (DW == false) { $pc4 = 17; continue $sw4; }
                            abcd.wu.j6(th, 1218636531025912620L, this, r8);
                            $pc4 = 17; continue $sw4;
                        }
                        case 17: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc4 = 6; continue $sw4; }
                            try {
                                abcd.wu.j6(1218636531025912620L, this, r8);
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
                                r2.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");
                                r2.writeString(r8);
                                this.FH.transact(9, r2, r3, 0);
                                r3.readException();
                                r4 = r3.readString();
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
            @abcd.Interfacesu(method = 6488955455472510525L)
            public void XL(java.lang.String r8) {
                android.os.Parcel r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex5 = null;
                int $pc5 = 4;
                $sw5: while (true) {
                    switch ($pc5) {
                        case 13: {
                            th = $ex5;
                            if (DW == false) { $pc5 = 17; continue $sw5; }
                            abcd.wu.j6(th, -6095350490977850336L, this, r8);
                            $pc5 = 17; continue $sw5;
                        }
                        case 17: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc5 = 6; continue $sw5; }
                            try {
                                abcd.wu.j6(-6095350490977850336L, this, r8);
                            } catch (java.lang.Throwable $t) {
                                $ex5 = $t;
                                $pc5 = 13; continue $sw5;
                            }
                            $pc5 = 6; continue $sw5;
                        }
                        case 6: {
                            try {
                                r2 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex5 = $t;
                                $pc5 = 13; continue $sw5;
                            }
                            try {
                                r2.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");
                                r2.writeString(r8);
                                this.FH.transact(5, r2, null, 1);
                            } catch (java.lang.Throwable $t) {
                                $ex5 = $t;
                                $pc5 = 10; continue $sw5;
                            }
                            try {
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

            @Override
            @abcd.Interfacesu(method = 955421926645466160L)
            public android.os.IBinder asBinder() {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex6 = null;
                int $pc6 = 4;
                $sw6: while (true) {
                    switch ($pc6) {
                        case 8: {
                            th = $ex6;
                            if (DW == false) { $pc6 = 12; continue $sw6; }
                            abcd.wu.j6(th, 376890077327611755L, this);
                            $pc6 = 12; continue $sw6;
                        }
                        case 12: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc6 = 6; continue $sw6; }
                            try {
                                abcd.wu.j6(376890077327611755L, this);
                            } catch (java.lang.Throwable $t) {
                                $ex6 = $t;
                                $pc6 = 8; continue $sw6;
                            }
                            $pc6 = 6; continue $sw6;
                        }
                        case 6: {
                            return this.FH;
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = 2243002023093406304L)
            public java.lang.String gn(java.lang.String r8) {
                android.os.Parcel r2 = null;
                android.os.Parcel r3 = null;
                java.lang.String r4 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex7 = null;
                int $pc7 = 4;
                $sw7: while (true) {
                    switch ($pc7) {
                        case 13: {
                            th = $ex7;
                            if (DW == false) { $pc7 = 17; continue $sw7; }
                            abcd.wu.j6(th, 1718325278337891977L, this, r8);
                            $pc7 = 17; continue $sw7;
                        }
                        case 17: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc7 = 6; continue $sw7; }
                            try {
                                abcd.wu.j6(1718325278337891977L, this, r8);
                            } catch (java.lang.Throwable $t) {
                                $ex7 = $t;
                                $pc7 = 13; continue $sw7;
                            }
                            $pc7 = 6; continue $sw7;
                        }
                        case 6: {
                            try {
                                r2 = android.os.Parcel.obtain();
                                r3 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex7 = $t;
                                $pc7 = 13; continue $sw7;
                            }
                            try {
                                r2.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");
                                r2.writeString(r8);
                                this.FH.transact(10, r2, r3, 0);
                                r3.readException();
                                r4 = r3.readString();
                            } catch (java.lang.Throwable $t) {
                                $ex7 = $t;
                                $pc7 = 10; continue $sw7;
                            }
                            try {
                                r3.recycle();
                                r2.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex7 = $t;
                                $pc7 = 13; continue $sw7;
                            }
                            return r4;
                        }
                        case 10: {
                            th = $ex7;
                            try {
                                r3.recycle();
                                r2.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex7 = $t;
                                $pc7 = 13; continue $sw7;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = 77970837858119369L)
            public void hz() {
                android.os.Parcel r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex8 = null;
                int $pc8 = 4;
                $sw8: while (true) {
                    switch ($pc8) {
                        case 13: {
                            th = $ex8;
                            if (DW == false) { $pc8 = 17; continue $sw8; }
                            abcd.wu.j6(th, 9054720688640447232L, this);
                            $pc8 = 17; continue $sw8;
                        }
                        case 17: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc8 = 6; continue $sw8; }
                            try {
                                abcd.wu.j6(9054720688640447232L, this);
                            } catch (java.lang.Throwable $t) {
                                $ex8 = $t;
                                $pc8 = 13; continue $sw8;
                            }
                            $pc8 = 6; continue $sw8;
                        }
                        case 6: {
                            try {
                                r2 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex8 = $t;
                                $pc8 = 13; continue $sw8;
                            }
                            try {
                                r2.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");
                                this.FH.transact(6, r2, null, 1);
                            } catch (java.lang.Throwable $t) {
                                $ex8 = $t;
                                $pc8 = 10; continue $sw8;
                            }
                            try {
                                r2.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex8 = $t;
                                $pc8 = 13; continue $sw8;
                            }
                            return;
                        }
                        case 10: {
                            th = $ex8;
                            try {
                                r2.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex8 = $t;
                                $pc8 = 13; continue $sw8;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = 3666331541234062272L)
            public void v5(int r8) {
                android.os.Parcel r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex9 = null;
                int $pc9 = 4;
                $sw9: while (true) {
                    switch ($pc9) {
                        case 13: {
                            th = $ex9;
                            if (DW == false) { $pc9 = 17; continue $sw9; }
                            abcd.wu.j6(th, 3884279348453324489L, this, new java.lang.Integer(r8));
                            $pc9 = 17; continue $sw9;
                        }
                        case 17: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc9 = 6; continue $sw9; }
                            try {
                                abcd.wu.j6(3884279348453324489L, this, r8);
                            } catch (java.lang.Throwable $t) {
                                $ex9 = $t;
                                $pc9 = 13; continue $sw9;
                            }
                            $pc9 = 6; continue $sw9;
                        }
                        case 6: {
                            try {
                                r2 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex9 = $t;
                                $pc9 = 13; continue $sw9;
                            }
                            try {
                                r2.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");
                                r2.writeInt(r8);
                                this.FH.transact(3, r2, null, 1);
                            } catch (java.lang.Throwable $t) {
                                $ex9 = $t;
                                $pc9 = 10; continue $sw9;
                            }
                            try {
                                r2.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex9 = $t;
                                $pc9 = 13; continue $sw9;
                            }
                            return;
                        }
                        case 10: {
                            th = $ex9;
                            try {
                                r2.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex9 = $t;
                                $pc9 = 13; continue $sw9;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = -7972130897108915488L)
            public void v5(java.lang.String r8, int r9) {
                android.os.Parcel r0 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex10 = null;
                int $pc10 = 3;
                $sw10: while (true) {
                    switch ($pc10) {
                        case 12: {
                            th = $ex10;
                            if (DW == false) { $pc10 = 16; continue $sw10; }
                            abcd.wu.j6(th, -4582302356813538255L, this, r8, new java.lang.Integer(r9));
                            $pc10 = 16; continue $sw10;
                        }
                        case 16: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 3: {
                            if (j6 == false) { $pc10 = 5; continue $sw10; }
                            try {
                                abcd.wu.j6(-4582302356813538255L, this, r8, new java.lang.Integer(r9));
                            } catch (java.lang.Throwable $t) {
                                $ex10 = $t;
                                $pc10 = 12; continue $sw10;
                            }
                            $pc10 = 5; continue $sw10;
                        }
                        case 5: {
                            try {
                                r0 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex10 = $t;
                                $pc10 = 12; continue $sw10;
                            }
                            try {
                                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");
                                r0.writeString(r8);
                                r0.writeInt(r9);
                                this.FH.transact(2, r0, null, 1);
                            } catch (java.lang.Throwable $t) {
                                $ex10 = $t;
                                $pc10 = 9; continue $sw10;
                            }
                            try {
                                r0.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex10 = $t;
                                $pc10 = 12; continue $sw10;
                            }
                            return;
                        }
                        case 9: {
                            th = $ex10;
                            try {
                                r0.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex10 = $t;
                                $pc10 = 12; continue $sw10;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = 454165782073168896L)
            public void w9() {
                android.os.Parcel r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex11 = null;
                int $pc11 = 4;
                $sw11: while (true) {
                    switch ($pc11) {
                        case 13: {
                            th = $ex11;
                            if (DW == false) { $pc11 = 17; continue $sw11; }
                            abcd.wu.j6(th, -2562596891552475437L, this);
                            $pc11 = 17; continue $sw11;
                        }
                        case 17: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc11 = 6; continue $sw11; }
                            try {
                                abcd.wu.j6(-2562596891552475437L, this);
                            } catch (java.lang.Throwable $t) {
                                $ex11 = $t;
                                $pc11 = 13; continue $sw11;
                            }
                            $pc11 = 6; continue $sw11;
                        }
                        case 6: {
                            try {
                                r2 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex11 = $t;
                                $pc11 = 13; continue $sw11;
                            }
                            try {
                                r2.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");
                                this.FH.transact(7, r2, null, 1);
                            } catch (java.lang.Throwable $t) {
                                $ex11 = $t;
                                $pc11 = 10; continue $sw11;
                            }
                            try {
                                r2.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex11 = $t;
                                $pc11 = 13; continue $sw11;
                            }
                            return;
                        }
                        case 10: {
                            th = $ex11;
                            try {
                                r2.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex11 = $t;
                                $pc11 = 13; continue $sw11;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = 104818750393487403L)
            public void we(java.lang.String r8) {
                android.os.Parcel r2 = null;
                android.os.Parcel r3 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex12 = null;
                int $pc12 = 4;
                $sw12: while (true) {
                    switch ($pc12) {
                        case 13: {
                            th = $ex12;
                            if (DW == false) { $pc12 = 17; continue $sw12; }
                            abcd.wu.j6(th, -1410628556978082288L, this, r8);
                            $pc12 = 17; continue $sw12;
                        }
                        case 17: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc12 = 6; continue $sw12; }
                            try {
                                abcd.wu.j6(-1410628556978082288L, this, r8);
                            } catch (java.lang.Throwable $t) {
                                $ex12 = $t;
                                $pc12 = 13; continue $sw12;
                            }
                            $pc12 = 6; continue $sw12;
                        }
                        case 6: {
                            try {
                                r2 = android.os.Parcel.obtain();
                                r3 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex12 = $t;
                                $pc12 = 13; continue $sw12;
                            }
                            try {
                                r2.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");
                                r2.writeString(r8);
                                this.FH.transact(11, r2, r3, 0);
                                r3.readException();
                            } catch (java.lang.Throwable $t) {
                                $ex12 = $t;
                                $pc12 = 10; continue $sw12;
                            }
                            try {
                                r3.recycle();
                                r2.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex12 = $t;
                                $pc12 = 13; continue $sw12;
                            }
                            return;
                        }
                        case 10: {
                            th = $ex12;
                            try {
                                r3.recycle();
                                r2.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex12 = $t;
                                $pc12 = 13; continue $sw12;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }
        }



        public a() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex13 = null;
            int $pc13 = 4;
            $sw13: while (true) {
                switch ($pc13) {
                    case 8: {
                        th = $ex13;
                        if (DW == false) { $pc13 = 12; continue $sw13; }
                        abcd.wu.j6(th, -863354461294087119L, null);
                        $pc13 = 12; continue $sw13;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc13 = 6; continue $sw13; }
                        try {
                            abcd.wu.j6(-863354461294087119L, null);
                        } catch (java.lang.Throwable $t) {
                            $ex13 = $t;
                            $pc13 = 8; continue $sw13;
                        }
                        $pc13 = 6; continue $sw13;
                    }
                    case 6: {
                        try {
                            attachInterface(this, "com.aide.ui.scm.IExternalGitServiceListener");
                        } catch (java.lang.Throwable $t) {
                            $ex13 = $t;
                            $pc13 = 8; continue $sw13;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public static com.aide.ui.scm.xa j6(android.os.IBinder r5) {
            android.os.IInterface r3 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex14 = null;
            int $pc14 = 4;
            $sw14: while (true) {
                switch ($pc14) {
                    case 16: {
                        th = $ex14;
                        if (DW == false) { $pc14 = 20; continue $sw14; }
                        abcd.wu.j6(th, 1451392838563900000L, null, r5);
                        $pc14 = 20; continue $sw14;
                    }
                    case 20: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc14 = 6; continue $sw14; }
                        try {
                            abcd.wu.j6(1451392838563900000L, null, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex14 = $t;
                            $pc14 = 16; continue $sw14;
                        }
                        $pc14 = 6; continue $sw14;
                    }
                    case 6: {
                        if (r5 != null) { $pc14 = 8; continue $sw14; }
                        return null;
                    }
                    case 8: {
                        try {
                            r3 = r5.queryLocalInterface("com.aide.ui.scm.IExternalGitServiceListener");
                        } catch (java.lang.Throwable $t) {
                            $ex14 = $t;
                            $pc14 = 16; continue $sw14;
                        }
                        if (r3 == null) { $pc14 = 15; continue $sw14; }
                        if ((r3 instanceof com.aide.ui.scm.xa) == false) { $pc14 = 15; continue $sw14; }
                        return (com.aide.ui.scm.xa) r3;
                    }
                    case 15: {
                        return new com.aide.ui.scm.xa.a.C0052a(r5);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public android.os.IBinder asBinder() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex15 = null;
            int $pc15 = 4;
            $sw15: while (true) {
                switch ($pc15) {
                    case 7: {
                        th = $ex15;
                        if (DW == false) { $pc15 = 11; continue $sw15; }
                        abcd.wu.j6(th, -1930049053568823639L, this);
                        $pc15 = 11; continue $sw15;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc15 = 6; continue $sw15; }
                        try {
                            abcd.wu.j6(-1930049053568823639L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex15 = $t;
                            $pc15 = 7; continue $sw15;
                        }
                        $pc15 = 6; continue $sw15;
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
            java.lang.String r1 = null;
            java.lang.String r2 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex16 = null;
            int $pc16 = 3;
            $sw16: while (true) {
                switch ($pc16) {
                    case 34: {
                        th = $ex16;
                        if (DW == false) { $pc16 = 38; continue $sw16; }
                        abcd.wu.j6(th, -147276187912918080L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
                        $pc16 = 38; continue $sw16;
                    }
                    case 38: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc16 = 6; continue $sw16; }
                        try {
                            abcd.wu.j6(-147276187912918080L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 34; continue $sw16;
                        }
                        $pc16 = 6; continue $sw16;
                    }
                    case 6: {
                        if (r10 == 1598968902) { $pc16 = 32; continue $sw16; }
                        try {
                            switch(r10) {
                                case 1: { $pc16 = 30; continue $sw16; }
                                case 2: { $pc16 = 28; continue $sw16; }
                                case 3: { $pc16 = 26; continue $sw16; }
                                case 4: { $pc16 = 24; continue $sw16; }
                                case 5: { $pc16 = 22; continue $sw16; }
                                case 6: { $pc16 = 20; continue $sw16; }
                                case 7: { $pc16 = 18; continue $sw16; }
                                case 8: { $pc16 = 16; continue $sw16; }
                                case 9: { $pc16 = 14; continue $sw16; }
                                case 10: { $pc16 = 12; continue $sw16; }
                                case 11: { $pc16 = 10; continue $sw16; }
                                default: { $pc16 = 9; continue $sw16; }
                            };
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 34; continue $sw16;
                        }
                    }
                    case 10: {
                        try {
                            r11.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");
                            we(r11.readString());
                            r12.writeNoException();
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 34; continue $sw16;
                        }
                        return true;
                    }
                    case 12: {
                        try {
                            r11.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");
                            r0 = gn(r11.readString());
                            r12.writeNoException();
                            r12.writeString(r0);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 34; continue $sw16;
                        }
                        return true;
                    }
                    case 14: {
                        try {
                            r11.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");
                            r1 = Ws(r11.readString());
                            r12.writeNoException();
                            r12.writeString(r1);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 34; continue $sw16;
                        }
                        return true;
                    }
                    case 16: {
                        try {
                            r11.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");
                            r2 = J0(r11.readString());
                            r12.writeNoException();
                            r12.writeString(r2);
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 34; continue $sw16;
                        }
                        return true;
                    }
                    case 18: {
                        try {
                            r11.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");
                            w9();
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 34; continue $sw16;
                        }
                        return true;
                    }
                    case 20: {
                        try {
                            r11.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");
                            hz();
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 34; continue $sw16;
                        }
                        return true;
                    }
                    case 22: {
                        try {
                            r11.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");
                            XL(r11.readString());
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 34; continue $sw16;
                        }
                        return true;
                    }
                    case 24: {
                        try {
                            r11.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");
                            AL();
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 34; continue $sw16;
                        }
                        return true;
                    }
                    case 26: {
                        try {
                            r11.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");
                            v5(r11.readInt());
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 34; continue $sw16;
                        }
                        return true;
                    }
                    case 28: {
                        try {
                            r11.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");
                            v5(r11.readString(), r11.readInt());
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 34; continue $sw16;
                        }
                        return true;
                    }
                    case 30: {
                        try {
                            r11.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");
                            Hw(r11.readInt());
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 34; continue $sw16;
                        }
                        return true;
                    }
                    case 9: {
                        return super.onTransact(r10, r11, r12, r13);
                    }
                    case 32: {
                        try {
                            r12.writeString("com.aide.ui.scm.IExternalGitServiceListener");
                        } catch (java.lang.Throwable $t) {
                            $ex16 = $t;
                            $pc16 = 34; continue $sw16;
                        }
                        return true;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    void AL();

    void Hw(int r1);

    java.lang.String J0(java.lang.String r1);

    java.lang.String Ws(java.lang.String r1);

    void XL(java.lang.String r1);

    java.lang.String gn(java.lang.String r1);

    void hz();

    void v5(int r1);

    void v5(java.lang.String r1, int r2);

    void w9();

    void we(java.lang.String r1);
}
