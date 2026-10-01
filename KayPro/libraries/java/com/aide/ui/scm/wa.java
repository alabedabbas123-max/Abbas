package com.aide.ui.scm;

public interface wa extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class a extends android.os.Binder implements com.aide.ui.scm.wa {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0051a implements com.aide.ui.scm.wa {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = -2312851552959990945L)
            private android.os.IBinder FH;



            @abcd.Interfacesu(method = 38070869662587483L)
            C0051a(android.os.IBinder r6) {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex0 = null;
                int $pc0 = 4;
                $sw0: while (true) {
                    switch ($pc0) {
                        case 8: {
                            th = $ex0;
                            if (DW == false) { $pc0 = 12; continue $sw0; }
                            abcd.wu.j6(th, 7649806317760715019L, null, r6);
                            $pc0 = 12; continue $sw0;
                        }
                        case 12: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc0 = 6; continue $sw0; }
                            try {
                                abcd.wu.j6(7649806317760715019L, null, r6);
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
            @abcd.Interfacesu(method = 1643801893365046937L)
            public com.aide.ui.scm.GitStatus DW(java.lang.String r8, com.aide.ui.scm.xa r9) {
                android.os.Parcel r0 = null;
                android.os.Parcel r1 = null;
                com.aide.ui.scm.GitStatus r2 = null;
                android.os.IBinder r3 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex1 = null;
                int $pc1 = 3;
                $sw1: while (true) {
                    switch ($pc1) {
                        case 18: {
                            th = $ex1;
                            if (DW == false) { $pc1 = 22; continue $sw1; }
                            abcd.wu.j6(th, -1809365635902785955L, this, r8, r9);
                            $pc1 = 22; continue $sw1;
                        }
                        case 22: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 3: {
                            if (j6 == false) { $pc1 = 5; continue $sw1; }
                            try {
                                abcd.wu.j6(-1809365635902785955L, this, r8, r9);
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 18; continue $sw1;
                            }
                            $pc1 = 5; continue $sw1;
                        }
                        case 5: {
                            try {
                                r0 = android.os.Parcel.obtain();
                                r1 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 18; continue $sw1;
                            }
                            try {
                                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                                r0.writeString(r8);
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 15; continue $sw1;
                            }
                            r2 = null;
                            if (r9 == null) { $pc1 = 9; continue $sw1; }
                            try {
                                r3 = r9.asBinder();
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 15; continue $sw1;
                            }
                            $pc1 = 10; continue $sw1;
                        }
                        case 10: {
                            try {
                                r0.writeStrongBinder(r3);
                                this.FH.transact(5, r0, r1, 0);
                                r1.readException();
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 15; continue $sw1;
                            }
                            if (r1.readInt() == 0) { $pc1 = 13; continue $sw1; }
                            try {
                                r2 = com.aide.ui.scm.GitStatus.CREATOR.createFromParcel(r1);
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 15; continue $sw1;
                            }
                            $pc1 = 13; continue $sw1;
                        }
                        case 13: {
                            try {
                                r1.recycle();
                                r0.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 18; continue $sw1;
                            }
                            return r2;
                        }
                        case 9: {
                            r3 = null;
                            throw new java.lang.IllegalStateException();
                        }
                        case 15: {
                            th = $ex1;
                            try {
                                r1.recycle();
                                r0.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex1 = $t;
                                $pc1 = 18; continue $sw1;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = -749150668582516093L)
            public java.lang.String DW(java.lang.String r9, java.lang.String r10, com.aide.ui.scm.xa r11) {
                android.os.Parcel r0 = null;
                android.os.Parcel r1 = null;
                android.os.IBinder r2 = null;
                java.lang.String r3 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex2 = null;
                int $pc2 = 3;
                $sw2: while (true) {
                    switch ($pc2) {
                        case 16: {
                            th = $ex2;
                            if (DW == false) { $pc2 = 20; continue $sw2; }
                            abcd.wu.j6(th, 4264474588894135359L, this, r9, r10, r11);
                            $pc2 = 20; continue $sw2;
                        }
                        case 20: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 3: {
                            if (j6 == false) { $pc2 = 5; continue $sw2; }
                            try {
                                abcd.wu.j6(4264474588894135359L, this, r9, r10, r11);
                            } catch (java.lang.Throwable $t) {
                                $ex2 = $t;
                                $pc2 = 16; continue $sw2;
                            }
                            $pc2 = 5; continue $sw2;
                        }
                        case 5: {
                            try {
                                r0 = android.os.Parcel.obtain();
                                r1 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex2 = $t;
                                $pc2 = 16; continue $sw2;
                            }
                            try {
                                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                                r0.writeString(r9);
                                r0.writeString(r10);
                            } catch (java.lang.Throwable $t) {
                                $ex2 = $t;
                                $pc2 = 13; continue $sw2;
                            }
                            if (r11 == null) { $pc2 = 9; continue $sw2; }
                            try {
                                r2 = r11.asBinder();
                            } catch (java.lang.Throwable $t) {
                                $ex2 = $t;
                                $pc2 = 13; continue $sw2;
                            }
                            $pc2 = 10; continue $sw2;
                        }
                        case 10: {
                            try {
                                r0.writeStrongBinder(r2);
                                this.FH.transact(8, r0, r1, 0);
                                r1.readException();
                                r3 = r1.readString();
                            } catch (java.lang.Throwable $t) {
                                $ex2 = $t;
                                $pc2 = 13; continue $sw2;
                            }
                            try {
                                r1.recycle();
                                r0.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex2 = $t;
                                $pc2 = 16; continue $sw2;
                            }
                            return r3;
                        }
                        case 9: {
                            r2 = null;
                            throw new java.lang.IllegalStateException();
                        }
                        case 13: {
                            th = $ex2;
                            try {
                                r1.recycle();
                                r0.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex2 = $t;
                                $pc2 = 16; continue $sw2;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = -959563003649174660L)
            public void DW(com.aide.ui.scm.GitConfiguration r9, java.lang.String r10, com.aide.ui.scm.xa r11) {
                android.os.Parcel r0 = null;
                android.os.Parcel r1 = null;
                android.os.IBinder r3 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex3 = null;
                int $pc3 = 3;
                $sw3: while (true) {
                    switch ($pc3) {
                        case 20: {
                            th = $ex3;
                            if (DW == false) { $pc3 = 24; continue $sw3; }
                            abcd.wu.j6(th, 319902406830217908L, this, r9, r10, r11);
                            $pc3 = 24; continue $sw3;
                        }
                        case 24: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 3: {
                            if (j6 == false) { $pc3 = 5; continue $sw3; }
                            try {
                                abcd.wu.j6(319902406830217908L, this, r9, r10, r11);
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
                                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 17; continue $sw3;
                            }
                            if (r9 == null) { $pc3 = 9; continue $sw3; }
                            try {
                                r0.writeInt(1);
                                r9.writeToParcel(r0, 0);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 17; continue $sw3;
                            }
                            $pc3 = 10; continue $sw3;
                        }
                        case 10: {
                            try {
                                r0.writeString(r10);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 17; continue $sw3;
                            }
                            if (r11 == null) { $pc3 = 13; continue $sw3; }
                            try {
                                r3 = r11.asBinder();
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 17; continue $sw3;
                            }
                            $pc3 = 14; continue $sw3;
                        }
                        case 14: {
                            try {
                                r0.writeStrongBinder(r3);
                                this.FH.transact(3, r0, r1, 0);
                                r1.readException();
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 17; continue $sw3;
                            }
                            try {
                                r1.recycle();
                                r0.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 20; continue $sw3;
                            }
                            return;
                        }
                        case 13: {
                            r3 = null;
                            { $pc3 = 14; continue $sw3; }
                        }
                        case 9: {
                            try {
                                r0.writeInt(0);
                            } catch (java.lang.Throwable $t) {
                                $ex3 = $t;
                                $pc3 = 17; continue $sw3;
                            }
                            return;
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
            @abcd.Interfacesu(method = -3900999530318109915L)
            public java.util.List<java.lang.String> FH(java.lang.String r8, com.aide.ui.scm.xa r9) {
                android.os.Parcel r0 = null;
                android.os.Parcel r1 = null;
                android.os.IBinder r2 = null;
                java.util.ArrayList<java.lang.String> r3 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex4 = null;
                int $pc4 = 3;
                $sw4: while (true) {
                    switch ($pc4) {
                        case 16: {
                            th = $ex4;
                            if (DW == false) { $pc4 = 20; continue $sw4; }
                            abcd.wu.j6(th, 1814645037757693665L, this, r8, r9);
                            $pc4 = 20; continue $sw4;
                        }
                        case 20: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 3: {
                            if (j6 == false) { $pc4 = 5; continue $sw4; }
                            try {
                                abcd.wu.j6(1814645037757693665L, this, r8, r9);
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
                                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                                r0.writeString(r8);
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 13; continue $sw4;
                            }
                            if (r9 == null) { $pc4 = 9; continue $sw4; }
                            try {
                                r2 = r9.asBinder();
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 13; continue $sw4;
                            }
                            $pc4 = 10; continue $sw4;
                        }
                        case 10: {
                            try {
                                r0.writeStrongBinder(r2);
                                this.FH.transact(10, r0, r1, 0);
                                r1.readException();
                                r3 = r1.createStringArrayList();
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 13; continue $sw4;
                            }
                            try {
                                r1.recycle();
                                r0.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex4 = $t;
                                $pc4 = 16; continue $sw4;
                            }
                            return r3;
                        }
                        case 9: {
                            r2 = null;
                            throw new java.lang.IllegalStateException();
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
            @abcd.Interfacesu(method = -1959386449490710305L)
            public void FH(java.lang.String r9, java.lang.String r10, com.aide.ui.scm.xa r11) {
                android.os.Parcel r0 = null;
                android.os.Parcel r1 = null;
                android.os.IBinder r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex5 = null;
                int $pc5 = 3;
                $sw5: while (true) {
                    switch ($pc5) {
                        case 16: {
                            th = $ex5;
                            if (DW == false) { $pc5 = 20; continue $sw5; }
                            abcd.wu.j6(th, 2354652673308857915L, this, r9, r10, r11);
                            $pc5 = 20; continue $sw5;
                        }
                        case 20: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 3: {
                            if (j6 == false) { $pc5 = 5; continue $sw5; }
                            try {
                                abcd.wu.j6(2354652673308857915L, this, r9, r10, r11);
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
                                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                                r0.writeString(r9);
                                r0.writeString(r10);
                            } catch (java.lang.Throwable $t) {
                                $ex5 = $t;
                                $pc5 = 13; continue $sw5;
                            }
                            if (r11 == null) { $pc5 = 9; continue $sw5; }
                            try {
                                r2 = r11.asBinder();
                            } catch (java.lang.Throwable $t) {
                                $ex5 = $t;
                                $pc5 = 13; continue $sw5;
                            }
                            $pc5 = 10; continue $sw5;
                        }
                        case 10: {
                            try {
                                r0.writeStrongBinder(r2);
                                this.FH.transact(11, r0, r1, 0);
                                r1.readException();
                            } catch (java.lang.Throwable $t) {
                                $ex5 = $t;
                                $pc5 = 13; continue $sw5;
                            }
                            try {
                                r1.recycle();
                                r0.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex5 = $t;
                                $pc5 = 16; continue $sw5;
                            }
                            return;
                        }
                        case 9: {
                            r2 = null;
                            return;
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

            @Override
            @abcd.Interfacesu(method = -731555501591008680L)
            public void Hw(java.lang.String r9, java.lang.String r10, com.aide.ui.scm.xa r11) {
                android.os.Parcel r0 = null;
                android.os.Parcel r1 = null;
                android.os.IBinder r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex6 = null;
                int $pc6 = 3;
                $sw6: while (true) {
                    switch ($pc6) {
                        case 16: {
                            th = $ex6;
                            if (DW == false) { $pc6 = 20; continue $sw6; }
                            abcd.wu.j6(th, 303983472959727848L, this, r9, r10, r11);
                            $pc6 = 20; continue $sw6;
                        }
                        case 20: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 3: {
                            if (j6 == false) { $pc6 = 5; continue $sw6; }
                            try {
                                abcd.wu.j6(303983472959727848L, this, r9, r10, r11);
                            } catch (java.lang.Throwable $t) {
                                $ex6 = $t;
                                $pc6 = 16; continue $sw6;
                            }
                            $pc6 = 5; continue $sw6;
                        }
                        case 5: {
                            try {
                                r0 = android.os.Parcel.obtain();
                                r1 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex6 = $t;
                                $pc6 = 16; continue $sw6;
                            }
                            try {
                                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                                r0.writeString(r9);
                                r0.writeString(r10);
                            } catch (java.lang.Throwable $t) {
                                $ex6 = $t;
                                $pc6 = 13; continue $sw6;
                            }
                            if (r11 == null) { $pc6 = 9; continue $sw6; }
                            try {
                                r2 = r11.asBinder();
                            } catch (java.lang.Throwable $t) {
                                $ex6 = $t;
                                $pc6 = 13; continue $sw6;
                            }
                            $pc6 = 10; continue $sw6;
                        }
                        case 10: {
                            try {
                                r0.writeStrongBinder(r2);
                                this.FH.transact(14, r0, r1, 0);
                                r1.readException();
                            } catch (java.lang.Throwable $t) {
                                $ex6 = $t;
                                $pc6 = 13; continue $sw6;
                            }
                            try {
                                r1.recycle();
                                r0.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex6 = $t;
                                $pc6 = 16; continue $sw6;
                            }
                            return;
                        }
                        case 9: {
                            r2 = null;
                            return;
                        }
                        case 13: {
                            th = $ex6;
                            try {
                                r1.recycle();
                                r0.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex6 = $t;
                                $pc6 = 16; continue $sw6;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = 568813924485905517L)
            public android.os.IBinder asBinder() {
                java.lang.Throwable th = null;
                java.lang.Throwable $ex7 = null;
                int $pc7 = 4;
                $sw7: while (true) {
                    switch ($pc7) {
                        case 8: {
                            th = $ex7;
                            if (DW == false) { $pc7 = 12; continue $sw7; }
                            abcd.wu.j6(th, -3648047990704426287L, this);
                            $pc7 = 12; continue $sw7;
                        }
                        case 12: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc7 = 6; continue $sw7; }
                            try {
                                abcd.wu.j6(-3648047990704426287L, this);
                            } catch (java.lang.Throwable $t) {
                                $ex7 = $t;
                                $pc7 = 8; continue $sw7;
                            }
                            $pc7 = 6; continue $sw7;
                        }
                        case 6: {
                            return this.FH;
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = 2176902323237025313L)
            public void cancel() {
                android.os.Parcel r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex8 = null;
                int $pc8 = 4;
                $sw8: while (true) {
                    switch ($pc8) {
                        case 13: {
                            th = $ex8;
                            if (DW == false) { $pc8 = 17; continue $sw8; }
                            abcd.wu.j6(th, 862614032023307533L, this);
                            $pc8 = 17; continue $sw8;
                        }
                        case 17: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 4: {
                            if (j6 == false) { $pc8 = 6; continue $sw8; }
                            try {
                                abcd.wu.j6(862614032023307533L, this);
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
                                r2.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                                this.FH.transact(15, r2, null, 1);
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
            @abcd.Interfacesu(method = 44652222642869856L)
            public java.lang.String j6(java.lang.String r8, com.aide.ui.scm.xa r9) {
                android.os.Parcel r0 = null;
                android.os.Parcel r1 = null;
                android.os.IBinder r2 = null;
                java.lang.String r3 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex9 = null;
                int $pc9 = 3;
                $sw9: while (true) {
                    switch ($pc9) {
                        case 16: {
                            th = $ex9;
                            if (DW == false) { $pc9 = 20; continue $sw9; }
                            abcd.wu.j6(th, 6066178735860375888L, this, r8, r9);
                            $pc9 = 20; continue $sw9;
                        }
                        case 20: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 3: {
                            if (j6 == false) { $pc9 = 5; continue $sw9; }
                            try {
                                abcd.wu.j6(6066178735860375888L, this, r8, r9);
                            } catch (java.lang.Throwable $t) {
                                $ex9 = $t;
                                $pc9 = 16; continue $sw9;
                            }
                            $pc9 = 5; continue $sw9;
                        }
                        case 5: {
                            try {
                                r0 = android.os.Parcel.obtain();
                                r1 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex9 = $t;
                                $pc9 = 16; continue $sw9;
                            }
                            try {
                                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                                r0.writeString(r8);
                            } catch (java.lang.Throwable $t) {
                                $ex9 = $t;
                                $pc9 = 13; continue $sw9;
                            }
                            if (r9 == null) { $pc9 = 9; continue $sw9; }
                            try {
                                r2 = r9.asBinder();
                            } catch (java.lang.Throwable $t) {
                                $ex9 = $t;
                                $pc9 = 13; continue $sw9;
                            }
                            $pc9 = 10; continue $sw9;
                        }
                        case 10: {
                            try {
                                r0.writeStrongBinder(r2);
                                this.FH.transact(9, r0, r1, 0);
                                r1.readException();
                                r3 = r1.readString();
                            } catch (java.lang.Throwable $t) {
                                $ex9 = $t;
                                $pc9 = 13; continue $sw9;
                            }
                            try {
                                r1.recycle();
                                r0.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex9 = $t;
                                $pc9 = 16; continue $sw9;
                            }
                            return r3;
                        }
                        case 9: {
                            r2 = null;
                            throw new java.lang.IllegalStateException();
                        }
                        case 13: {
                            th = $ex9;
                            try {
                                r1.recycle();
                                r0.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex9 = $t;
                                $pc9 = 16; continue $sw9;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = -975106165460335091L)
            public void j6(com.aide.ui.scm.GitConfiguration r9, java.lang.String r10, com.aide.ui.scm.xa r11) {
                android.os.Parcel r0 = null;
                android.os.Parcel r1 = null;
                android.os.IBinder r3 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex10 = null;
                int $pc10 = 3;
                $sw10: while (true) {
                    switch ($pc10) {
                        case 20: {
                            th = $ex10;
                            if (DW == false) { $pc10 = 24; continue $sw10; }
                            abcd.wu.j6(th, 339097764690690233L, this, r9, r10, r11);
                            $pc10 = 24; continue $sw10;
                        }
                        case 24: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 3: {
                            if (j6 == false) { $pc10 = 5; continue $sw10; }
                            try {
                                abcd.wu.j6(339097764690690233L, this, r9, r10, r11);
                            } catch (java.lang.Throwable $t) {
                                $ex10 = $t;
                                $pc10 = 20; continue $sw10;
                            }
                            $pc10 = 5; continue $sw10;
                        }
                        case 5: {
                            try {
                                r0 = android.os.Parcel.obtain();
                                r1 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex10 = $t;
                                $pc10 = 20; continue $sw10;
                            }
                            try {
                                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                            } catch (java.lang.Throwable $t) {
                                $ex10 = $t;
                                $pc10 = 17; continue $sw10;
                            }
                            if (r9 == null) { $pc10 = 9; continue $sw10; }
                            try {
                                r0.writeInt(1);
                                r9.writeToParcel(r0, 0);
                            } catch (java.lang.Throwable $t) {
                                $ex10 = $t;
                                $pc10 = 17; continue $sw10;
                            }
                            $pc10 = 10; continue $sw10;
                        }
                        case 10: {
                            try {
                                r0.writeString(r10);
                            } catch (java.lang.Throwable $t) {
                                $ex10 = $t;
                                $pc10 = 17; continue $sw10;
                            }
                            if (r11 == null) { $pc10 = 13; continue $sw10; }
                            try {
                                r3 = r11.asBinder();
                            } catch (java.lang.Throwable $t) {
                                $ex10 = $t;
                                $pc10 = 17; continue $sw10;
                            }
                            $pc10 = 14; continue $sw10;
                        }
                        case 14: {
                            try {
                                r0.writeStrongBinder(r3);
                                this.FH.transact(4, r0, r1, 0);
                                r1.readException();
                            } catch (java.lang.Throwable $t) {
                                $ex10 = $t;
                                $pc10 = 17; continue $sw10;
                            }
                            try {
                                r1.recycle();
                                r0.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex10 = $t;
                                $pc10 = 20; continue $sw10;
                            }
                            return;
                        }
                        case 13: {
                            r3 = null;
                            { $pc10 = 14; continue $sw10; }
                        }
                        case 9: {
                            try {
                                r0.writeInt(0);
                            } catch (java.lang.Throwable $t) {
                                $ex10 = $t;
                                $pc10 = 17; continue $sw10;
                            }
                            return;
                        }
                        case 17: {
                            th = $ex10;
                            try {
                                r1.recycle();
                                r0.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex10 = $t;
                                $pc10 = 20; continue $sw10;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = -1304555658830415576L)
            public void j6(com.aide.ui.scm.GitConfiguration r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, com.aide.ui.scm.xa r15) {
                android.os.Parcel r0 = null;
                android.os.Parcel r1 = null;
                android.os.IBinder r4 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex11 = null;
                int $pc11 = 3;
                $sw11: while (true) {
                    switch ($pc11) {
                        case 20: {
                            th = $ex11;
                            if (DW == false) { $pc11 = 24; continue $sw11; }
                            abcd.wu.j6(th, 451734090950425536L, this, r11, r12, r13, r14, r15);
                            $pc11 = 24; continue $sw11;
                        }
                        case 24: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 3: {
                            if (j6 == false) { $pc11 = 5; continue $sw11; }
                            try {
                                abcd.wu.j6(451734090950425536L, this, r11, r12, r13, r14, r15);
                            } catch (java.lang.Throwable $t) {
                                $ex11 = $t;
                                $pc11 = 20; continue $sw11;
                            }
                            $pc11 = 5; continue $sw11;
                        }
                        case 5: {
                            try {
                                r0 = android.os.Parcel.obtain();
                                r1 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex11 = $t;
                                $pc11 = 20; continue $sw11;
                            }
                            try {
                                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                            } catch (java.lang.Throwable $t) {
                                $ex11 = $t;
                                $pc11 = 17; continue $sw11;
                            }
                            if (r11 == null) { $pc11 = 9; continue $sw11; }
                            try {
                                r0.writeInt(1);
                                r11.writeToParcel(r0, 0);
                            } catch (java.lang.Throwable $t) {
                                $ex11 = $t;
                                $pc11 = 17; continue $sw11;
                            }
                            $pc11 = 10; continue $sw11;
                        }
                        case 10: {
                            try {
                                r0.writeString(r12);
                                r0.writeString(r13);
                                r0.writeString(r14);
                            } catch (java.lang.Throwable $t) {
                                $ex11 = $t;
                                $pc11 = 17; continue $sw11;
                            }
                            if (r15 == null) { $pc11 = 13; continue $sw11; }
                            try {
                                r4 = r15.asBinder();
                            } catch (java.lang.Throwable $t) {
                                $ex11 = $t;
                                $pc11 = 17; continue $sw11;
                            }
                            $pc11 = 14; continue $sw11;
                        }
                        case 14: {
                            try {
                                r0.writeStrongBinder(r4);
                                this.FH.transact(1, r0, r1, 0);
                                r1.readException();
                            } catch (java.lang.Throwable $t) {
                                $ex11 = $t;
                                $pc11 = 17; continue $sw11;
                            }
                            try {
                                r1.recycle();
                                r0.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex11 = $t;
                                $pc11 = 20; continue $sw11;
                            }
                            return;
                        }
                        case 13: {
                            r4 = null;
                            { $pc11 = 14; continue $sw11; }
                        }
                        case 9: {
                            try {
                                r0.writeInt(0);
                            } catch (java.lang.Throwable $t) {
                                $ex11 = $t;
                                $pc11 = 17; continue $sw11;
                            }
                            return;
                        }
                        case 17: {
                            th = $ex11;
                            try {
                                r1.recycle();
                                r0.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex11 = $t;
                                $pc11 = 20; continue $sw11;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = 907746355328607735L)
            public void j6(com.aide.ui.scm.GitConfiguration r11, java.lang.String r12, java.lang.String r13, java.util.List<java.lang.String> r14, com.aide.ui.scm.xa r15) {
                android.os.Parcel r0 = null;
                android.os.Parcel r1 = null;
                android.os.IBinder r3 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex12 = null;
                int $pc12 = 3;
                $sw12: while (true) {
                    switch ($pc12) {
                        case 20: {
                            th = $ex12;
                            if (DW == false) { $pc12 = 24; continue $sw12; }
                            abcd.wu.j6(th, 2639055885049139339L, this, r11, r12, r13, r14, r15);
                            $pc12 = 24; continue $sw12;
                        }
                        case 24: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 3: {
                            if (j6 == false) { $pc12 = 5; continue $sw12; }
                            try {
                                abcd.wu.j6(2639055885049139339L, this, r11, r12, r13, r14, r15);
                            } catch (java.lang.Throwable $t) {
                                $ex12 = $t;
                                $pc12 = 20; continue $sw12;
                            }
                            $pc12 = 5; continue $sw12;
                        }
                        case 5: {
                            try {
                                r0 = android.os.Parcel.obtain();
                                r1 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex12 = $t;
                                $pc12 = 20; continue $sw12;
                            }
                            try {
                                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                            } catch (java.lang.Throwable $t) {
                                $ex12 = $t;
                                $pc12 = 17; continue $sw12;
                            }
                            if (r11 == null) { $pc12 = 9; continue $sw12; }
                            try {
                                r0.writeInt(1);
                                r11.writeToParcel(r0, 0);
                            } catch (java.lang.Throwable $t) {
                                $ex12 = $t;
                                $pc12 = 17; continue $sw12;
                            }
                            $pc12 = 10; continue $sw12;
                        }
                        case 10: {
                            try {
                                r0.writeString(r12);
                                r0.writeString(r13);
                                r0.writeStringList(r14);
                            } catch (java.lang.Throwable $t) {
                                $ex12 = $t;
                                $pc12 = 17; continue $sw12;
                            }
                            if (r15 == null) { $pc12 = 13; continue $sw12; }
                            try {
                                r3 = r15.asBinder();
                            } catch (java.lang.Throwable $t) {
                                $ex12 = $t;
                                $pc12 = 17; continue $sw12;
                            }
                            $pc12 = 14; continue $sw12;
                        }
                        case 14: {
                            try {
                                r0.writeStrongBinder(r3);
                                this.FH.transact(2, r0, r1, 0);
                                r1.readException();
                            } catch (java.lang.Throwable $t) {
                                $ex12 = $t;
                                $pc12 = 17; continue $sw12;
                            }
                            try {
                                r1.recycle();
                                r0.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex12 = $t;
                                $pc12 = 20; continue $sw12;
                            }
                            return;
                        }
                        case 13: {
                            r3 = null;
                            { $pc12 = 14; continue $sw12; }
                        }
                        case 9: {
                            try {
                                r0.writeInt(0);
                            } catch (java.lang.Throwable $t) {
                                $ex12 = $t;
                                $pc12 = 17; continue $sw12;
                            }
                            return;
                        }
                        case 17: {
                            th = $ex12;
                            try {
                                r1.recycle();
                                r0.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex12 = $t;
                                $pc12 = 20; continue $sw12;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = 3248068969645957680L)
            public void j6(com.aide.ui.scm.GitConfiguration r11, java.lang.String r12, java.util.List<com.aide.ui.scm.ModifiedFile> r13, java.lang.String r14, com.aide.ui.scm.xa r15) {
                android.os.Parcel r0 = null;
                android.os.Parcel r1 = null;
                android.os.IBinder r3 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex13 = null;
                int $pc13 = 3;
                $sw13: while (true) {
                    switch ($pc13) {
                        case 20: {
                            th = $ex13;
                            if (DW == false) { $pc13 = 24; continue $sw13; }
                            abcd.wu.j6(th, -6149407163406511400L, this, r11, r12, r13, r14, r15);
                            $pc13 = 24; continue $sw13;
                        }
                        case 24: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 3: {
                            if (j6 == false) { $pc13 = 5; continue $sw13; }
                            try {
                                abcd.wu.j6(-6149407163406511400L, this, r11, r12, r13, r14, r15);
                            } catch (java.lang.Throwable $t) {
                                $ex13 = $t;
                                $pc13 = 20; continue $sw13;
                            }
                            $pc13 = 5; continue $sw13;
                        }
                        case 5: {
                            try {
                                r0 = android.os.Parcel.obtain();
                                r1 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex13 = $t;
                                $pc13 = 20; continue $sw13;
                            }
                            try {
                                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                            } catch (java.lang.Throwable $t) {
                                $ex13 = $t;
                                $pc13 = 17; continue $sw13;
                            }
                            if (r11 == null) { $pc13 = 9; continue $sw13; }
                            try {
                                r0.writeInt(1);
                                r11.writeToParcel(r0, 0);
                            } catch (java.lang.Throwable $t) {
                                $ex13 = $t;
                                $pc13 = 17; continue $sw13;
                            }
                            $pc13 = 10; continue $sw13;
                        }
                        case 10: {
                            try {
                                r0.writeString(r12);
                                r0.writeTypedList(r13);
                                r0.writeString(r14);
                            } catch (java.lang.Throwable $t) {
                                $ex13 = $t;
                                $pc13 = 17; continue $sw13;
                            }
                            if (r15 == null) { $pc13 = 13; continue $sw13; }
                            try {
                                r3 = r15.asBinder();
                            } catch (java.lang.Throwable $t) {
                                $ex13 = $t;
                                $pc13 = 17; continue $sw13;
                            }
                            $pc13 = 14; continue $sw13;
                        }
                        case 14: {
                            try {
                                r0.writeStrongBinder(r3);
                                this.FH.transact(6, r0, r1, 0);
                                r1.readException();
                            } catch (java.lang.Throwable $t) {
                                $ex13 = $t;
                                $pc13 = 17; continue $sw13;
                            }
                            try {
                                r1.recycle();
                                r0.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex13 = $t;
                                $pc13 = 20; continue $sw13;
                            }
                            return;
                        }
                        case 13: {
                            r3 = null;
                            { $pc13 = 14; continue $sw13; }
                        }
                        case 9: {
                            try {
                                r0.writeInt(0);
                            } catch (java.lang.Throwable $t) {
                                $ex13 = $t;
                                $pc13 = 17; continue $sw13;
                            }
                            return;
                        }
                        case 17: {
                            th = $ex13;
                            try {
                                r1.recycle();
                                r0.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex13 = $t;
                                $pc13 = 20; continue $sw13;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = -2577002191322722905L)
            public void j6(java.lang.String r9, java.lang.String r10, com.aide.ui.scm.xa r11) {
                android.os.Parcel r0 = null;
                android.os.Parcel r1 = null;
                android.os.IBinder r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex14 = null;
                int $pc14 = 3;
                $sw14: while (true) {
                    switch ($pc14) {
                        case 16: {
                            th = $ex14;
                            if (DW == false) { $pc14 = 20; continue $sw14; }
                            abcd.wu.j6(th, -6551050206396694749L, this, r9, r10, r11);
                            $pc14 = 20; continue $sw14;
                        }
                        case 20: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 3: {
                            if (j6 == false) { $pc14 = 5; continue $sw14; }
                            try {
                                abcd.wu.j6(-6551050206396694749L, this, r9, r10, r11);
                            } catch (java.lang.Throwable $t) {
                                $ex14 = $t;
                                $pc14 = 16; continue $sw14;
                            }
                            $pc14 = 5; continue $sw14;
                        }
                        case 5: {
                            try {
                                r0 = android.os.Parcel.obtain();
                                r1 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex14 = $t;
                                $pc14 = 16; continue $sw14;
                            }
                            try {
                                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                                r0.writeString(r9);
                                r0.writeString(r10);
                            } catch (java.lang.Throwable $t) {
                                $ex14 = $t;
                                $pc14 = 13; continue $sw14;
                            }
                            if (r11 == null) { $pc14 = 9; continue $sw14; }
                            try {
                                r2 = r11.asBinder();
                            } catch (java.lang.Throwable $t) {
                                $ex14 = $t;
                                $pc14 = 13; continue $sw14;
                            }
                            $pc14 = 10; continue $sw14;
                        }
                        case 10: {
                            try {
                                r0.writeStrongBinder(r2);
                                this.FH.transact(13, r0, r1, 0);
                                r1.readException();
                            } catch (java.lang.Throwable $t) {
                                $ex14 = $t;
                                $pc14 = 13; continue $sw14;
                            }
                            try {
                                r1.recycle();
                                r0.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex14 = $t;
                                $pc14 = 16; continue $sw14;
                            }
                            return;
                        }
                        case 9: {
                            r2 = null;
                            return;
                        }
                        case 13: {
                            th = $ex14;
                            try {
                                r1.recycle();
                                r0.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex14 = $t;
                                $pc14 = 16; continue $sw14;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = -6668198295154216236L)
            public void j6(java.lang.String r10, java.lang.String r11, java.lang.String r12, com.aide.ui.scm.xa r13) {
                android.os.Parcel r0 = null;
                android.os.Parcel r1 = null;
                android.os.IBinder r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex15 = null;
                int $pc15 = 3;
                $sw15: while (true) {
                    switch ($pc15) {
                        case 16: {
                            th = $ex15;
                            if (DW == false) { $pc15 = 20; continue $sw15; }
                            abcd.wu.j6(th, 3120820564058405052L, this, r10, r11, r12, r13);
                            $pc15 = 20; continue $sw15;
                        }
                        case 20: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 3: {
                            if (j6 == false) { $pc15 = 5; continue $sw15; }
                            try {
                                abcd.wu.j6(3120820564058405052L, this, r10, r11, r12, r13);
                            } catch (java.lang.Throwable $t) {
                                $ex15 = $t;
                                $pc15 = 16; continue $sw15;
                            }
                            $pc15 = 5; continue $sw15;
                        }
                        case 5: {
                            try {
                                r0 = android.os.Parcel.obtain();
                                r1 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex15 = $t;
                                $pc15 = 16; continue $sw15;
                            }
                            try {
                                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                                r0.writeString(r10);
                                r0.writeString(r11);
                                r0.writeString(r12);
                            } catch (java.lang.Throwable $t) {
                                $ex15 = $t;
                                $pc15 = 13; continue $sw15;
                            }
                            if (r13 == null) { $pc15 = 9; continue $sw15; }
                            try {
                                r2 = r13.asBinder();
                            } catch (java.lang.Throwable $t) {
                                $ex15 = $t;
                                $pc15 = 13; continue $sw15;
                            }
                            $pc15 = 10; continue $sw15;
                        }
                        case 10: {
                            try {
                                r0.writeStrongBinder(r2);
                                this.FH.transact(12, r0, r1, 0);
                                r1.readException();
                            } catch (java.lang.Throwable $t) {
                                $ex15 = $t;
                                $pc15 = 13; continue $sw15;
                            }
                            try {
                                r1.recycle();
                                r0.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex15 = $t;
                                $pc15 = 16; continue $sw15;
                            }
                            return;
                        }
                        case 9: {
                            r2 = null;
                            return;
                        }
                        case 13: {
                            th = $ex15;
                            try {
                                r1.recycle();
                                r0.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex15 = $t;
                                $pc15 = 16; continue $sw15;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }

            @Override
            @abcd.Interfacesu(method = 819729935401472465L)
            public void j6(java.lang.String r9, java.util.List<com.aide.ui.scm.ModifiedFile> r10, com.aide.ui.scm.xa r11) {
                android.os.Parcel r0 = null;
                android.os.Parcel r1 = null;
                android.os.IBinder r2 = null;
                java.lang.Throwable th = null;
                java.lang.Throwable $ex16 = null;
                int $pc16 = 3;
                $sw16: while (true) {
                    switch ($pc16) {
                        case 16: {
                            th = $ex16;
                            if (DW == false) { $pc16 = 20; continue $sw16; }
                            abcd.wu.j6(th, -976418872392589067L, this, r9, r10, r11);
                            $pc16 = 20; continue $sw16;
                        }
                        case 20: {
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                        }
                        case 3: {
                            if (j6 == false) { $pc16 = 5; continue $sw16; }
                            try {
                                abcd.wu.j6(-976418872392589067L, this, r9, r10, r11);
                            } catch (java.lang.Throwable $t) {
                                $ex16 = $t;
                                $pc16 = 16; continue $sw16;
                            }
                            $pc16 = 5; continue $sw16;
                        }
                        case 5: {
                            try {
                                r0 = android.os.Parcel.obtain();
                                r1 = android.os.Parcel.obtain();
                            } catch (java.lang.Throwable $t) {
                                $ex16 = $t;
                                $pc16 = 16; continue $sw16;
                            }
                            try {
                                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");
                                r0.writeString(r9);
                                r0.writeTypedList(r10);
                            } catch (java.lang.Throwable $t) {
                                $ex16 = $t;
                                $pc16 = 13; continue $sw16;
                            }
                            if (r11 == null) { $pc16 = 9; continue $sw16; }
                            try {
                                r2 = r11.asBinder();
                            } catch (java.lang.Throwable $t) {
                                $ex16 = $t;
                                $pc16 = 13; continue $sw16;
                            }
                            $pc16 = 10; continue $sw16;
                        }
                        case 10: {
                            try {
                                r0.writeStrongBinder(r2);
                                this.FH.transact(7, r0, r1, 0);
                                r1.readException();
                            } catch (java.lang.Throwable $t) {
                                $ex16 = $t;
                                $pc16 = 13; continue $sw16;
                            }
                            try {
                                r1.recycle();
                                r0.recycle();
                            } catch (java.lang.Throwable $t) {
                                $ex16 = $t;
                                $pc16 = 16; continue $sw16;
                            }
                            return;
                        }
                        case 9: {
                            r2 = null;
                            return;
                        }
                        case 13: {
                            th = $ex16;
                            try {
                                r1.recycle();
                                r0.recycle();
                                throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                            } catch (java.lang.Throwable $t) {
                                $ex16 = $t;
                                $pc16 = 16; continue $sw16;
                            }
                        }
                        default: throw new java.lang.IllegalStateException();
                    }
                }
            }
        }



        public a() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex17 = null;
            int $pc17 = 4;
            $sw17: while (true) {
                switch ($pc17) {
                    case 8: {
                        th = $ex17;
                        if (DW == false) { $pc17 = 12; continue $sw17; }
                        abcd.wu.j6(th, -1351505026707989059L, null);
                        $pc17 = 12; continue $sw17;
                    }
                    case 12: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc17 = 6; continue $sw17; }
                        try {
                            abcd.wu.j6(-1351505026707989059L, null);
                        } catch (java.lang.Throwable $t) {
                            $ex17 = $t;
                            $pc17 = 8; continue $sw17;
                        }
                        $pc17 = 6; continue $sw17;
                    }
                    case 6: {
                        try {
                            attachInterface(this, "com.aide.ui.scm.IExternalGitService");
                        } catch (java.lang.Throwable $t) {
                            $ex17 = $t;
                            $pc17 = 8; continue $sw17;
                        }
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public static com.aide.ui.scm.wa j6(android.os.IBinder r5) {
            android.os.IInterface r3 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex18 = null;
            int $pc18 = 4;
            $sw18: while (true) {
                switch ($pc18) {
                    case 16: {
                        th = $ex18;
                        if (DW == false) { $pc18 = 20; continue $sw18; }
                        abcd.wu.j6(th, -278794636847752284L, null, r5);
                        $pc18 = 20; continue $sw18;
                    }
                    case 20: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc18 = 6; continue $sw18; }
                        try {
                            abcd.wu.j6(-278794636847752284L, null, r5);
                        } catch (java.lang.Throwable $t) {
                            $ex18 = $t;
                            $pc18 = 16; continue $sw18;
                        }
                        $pc18 = 6; continue $sw18;
                    }
                    case 6: {
                        if (r5 != null) { $pc18 = 8; continue $sw18; }
                        return null;
                    }
                    case 8: {
                        try {
                            r3 = r5.queryLocalInterface("com.aide.ui.scm.IExternalGitService");
                        } catch (java.lang.Throwable $t) {
                            $ex18 = $t;
                            $pc18 = 16; continue $sw18;
                        }
                        if (r3 == null) { $pc18 = 15; continue $sw18; }
                        if ((r3 instanceof com.aide.ui.scm.wa) == false) { $pc18 = 15; continue $sw18; }
                        return (com.aide.ui.scm.wa) r3;
                    }
                    case 15: {
                        return new com.aide.ui.scm.wa.a.C0051a(r5);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public android.os.IBinder asBinder() {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex19 = null;
            int $pc19 = 4;
            $sw19: while (true) {
                switch ($pc19) {
                    case 7: {
                        th = $ex19;
                        if (DW == false) { $pc19 = 11; continue $sw19; }
                        abcd.wu.j6(th, 1406788449176987749L, this);
                        $pc19 = 11; continue $sw19;
                    }
                    case 11: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 4: {
                        if (j6 == false) { $pc19 = 6; continue $sw19; }
                        try {
                            abcd.wu.j6(1406788449176987749L, this);
                        } catch (java.lang.Throwable $t) {
                            $ex19 = $t;
                            $pc19 = 7; continue $sw19;
                        }
                        $pc19 = 6; continue $sw19;
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
            com.aide.ui.scm.GitConfiguration r1 = null;
            java.util.List<java.lang.String> r0 = null;
            java.lang.String r2 = null;
            java.lang.String r3 = null;
            com.aide.ui.scm.GitStatus r4 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex20 = null;
            int $pc20 = 3;
            $sw20: while (true) {
                switch ($pc20) {
                    case 61: {
                        th = $ex20;
                        if (DW == false) { $pc20 = 65; continue $sw20; }
                        abcd.wu.j6(th, -225619656116507084L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
                        $pc20 = 65; continue $sw20;
                    }
                    case 65: {
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                    }
                    case 3: {
                        if (j6 == false) { $pc20 = 6; continue $sw20; }
                        try {
                            abcd.wu.j6(-225619656116507084L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        $pc20 = 6; continue $sw20;
                    }
                    case 6: {
                        if (r10 == 1598968902) { $pc20 = 59; continue $sw20; }
                        r1 = null;
                        try {
                            switch(r10) {
                                case 1: { $pc20 = 54; continue $sw20; }
                                case 2: { $pc20 = 49; continue $sw20; }
                                case 3: { $pc20 = 44; continue $sw20; }
                                case 4: { $pc20 = 39; continue $sw20; }
                                case 5: { $pc20 = 34; continue $sw20; }
                                case 6: { $pc20 = 29; continue $sw20; }
                                case 7: { $pc20 = 27; continue $sw20; }
                                case 8: { $pc20 = 25; continue $sw20; }
                                case 9: { $pc20 = 23; continue $sw20; }
                                case 10: { $pc20 = 21; continue $sw20; }
                                case 11: { $pc20 = 19; continue $sw20; }
                                case 12: { $pc20 = 17; continue $sw20; }
                                case 13: { $pc20 = 15; continue $sw20; }
                                case 14: { $pc20 = 13; continue $sw20; }
                                case 15: { $pc20 = 11; continue $sw20; }
                                default: { $pc20 = 10; continue $sw20; }
                            };
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                    }
                    case 11: {
                        try {
                            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");
                            cancel();
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        return true;
                    }
                    case 13: {
                        try {
                            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");
                            Hw(r11.readString(), r11.readString(), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));
                            r12.writeNoException();
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        return true;
                    }
                    case 15: {
                        try {
                            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");
                            j6(r11.readString(), r11.readString(), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));
                            r12.writeNoException();
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        return true;
                    }
                    case 17: {
                        try {
                            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");
                            j6(r11.readString(), r11.readString(), r11.readString(), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));
                            r12.writeNoException();
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        return true;
                    }
                    case 19: {
                        try {
                            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");
                            FH(r11.readString(), r11.readString(), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));
                            r12.writeNoException();
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        return true;
                    }
                    case 21: {
                        try {
                            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");
                            r0 = FH(r11.readString(), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));
                            r12.writeNoException();
                            r12.writeStringList(r0);
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        return true;
                    }
                    case 23: {
                        try {
                            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");
                            r2 = j6(r11.readString(), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));
                            r12.writeNoException();
                            r12.writeString(r2);
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        return true;
                    }
                    case 25: {
                        try {
                            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");
                            r3 = DW(r11.readString(), r11.readString(), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));
                            r12.writeNoException();
                            r12.writeString(r3);
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        return true;
                    }
                    case 27: {
                        try {
                            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");
                            j6(r11.readString(), r11.createTypedArrayList(com.aide.ui.scm.ModifiedFile.CREATOR), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));
                            r12.writeNoException();
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        return true;
                    }
                    case 29: {
                        try {
                            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        if (r11.readInt() == 0) { $pc20 = 32; continue $sw20; }
                        try {
                            r1 = com.aide.ui.scm.GitConfiguration.CREATOR.createFromParcel(r11);
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        $pc20 = 32; continue $sw20;
                    }
                    case 32: {
                        try {
                            j6(r1, r11.readString(), r11.createTypedArrayList(com.aide.ui.scm.ModifiedFile.CREATOR), r11.readString(), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));
                            r12.writeNoException();
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        return true;
                    }
                    case 34: {
                        try {
                            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");
                            r4 = DW(r11.readString(), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));
                            r12.writeNoException();
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        if (r4 == null) { $pc20 = 37; continue $sw20; }
                        try {
                            r12.writeInt(1);
                            r4.writeToParcel(r12, 1);
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        $pc20 = 38; continue $sw20;
                    }
                    case 38: {
                        return true;
                    }
                    case 37: {
                        try {
                            r12.writeInt(0);
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        { $pc20 = 38; continue $sw20; }
                    }
                    case 39: {
                        try {
                            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        if (r11.readInt() == 0) { $pc20 = 42; continue $sw20; }
                        try {
                            r1 = com.aide.ui.scm.GitConfiguration.CREATOR.createFromParcel(r11);
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        $pc20 = 42; continue $sw20;
                    }
                    case 42: {
                        try {
                            j6(r1, r11.readString(), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));
                            r12.writeNoException();
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        return true;
                    }
                    case 44: {
                        try {
                            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        if (r11.readInt() == 0) { $pc20 = 47; continue $sw20; }
                        try {
                            r1 = com.aide.ui.scm.GitConfiguration.CREATOR.createFromParcel(r11);
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        $pc20 = 47; continue $sw20;
                    }
                    case 47: {
                        try {
                            DW(r1, r11.readString(), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));
                            r12.writeNoException();
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        return true;
                    }
                    case 49: {
                        try {
                            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        if (r11.readInt() == 0) { $pc20 = 52; continue $sw20; }
                        try {
                            r1 = com.aide.ui.scm.GitConfiguration.CREATOR.createFromParcel(r11);
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        $pc20 = 52; continue $sw20;
                    }
                    case 52: {
                        try {
                            j6(r1, r11.readString(), r11.readString(), r11.createStringArrayList(), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));
                            r12.writeNoException();
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        return true;
                    }
                    case 54: {
                        try {
                            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        if (r11.readInt() == 0) { $pc20 = 57; continue $sw20; }
                        try {
                            r1 = com.aide.ui.scm.GitConfiguration.CREATOR.createFromParcel(r11);
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        $pc20 = 57; continue $sw20;
                    }
                    case 57: {
                        try {
                            j6(r1, r11.readString(), r11.readString(), r11.readString(), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));
                            r12.writeNoException();
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        return true;
                    }
                    case 10: {
                        return super.onTransact(r10, r11, r12, r13);
                    }
                    case 59: {
                        try {
                            r12.writeString("com.aide.ui.scm.IExternalGitService");
                        } catch (java.lang.Throwable $t) {
                            $ex20 = $t;
                            $pc20 = 61; continue $sw20;
                        }
                        return true;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    com.aide.ui.scm.GitStatus DW(java.lang.String r1, com.aide.ui.scm.xa r2);

    java.lang.String DW(java.lang.String r1, java.lang.String r2, com.aide.ui.scm.xa r3);

    void DW(com.aide.ui.scm.GitConfiguration r1, java.lang.String r2, com.aide.ui.scm.xa r3);

    java.util.List<java.lang.String> FH(java.lang.String r1, com.aide.ui.scm.xa r2);

    void FH(java.lang.String r1, java.lang.String r2, com.aide.ui.scm.xa r3);

    void Hw(java.lang.String r1, java.lang.String r2, com.aide.ui.scm.xa r3);

    void cancel();

    java.lang.String j6(java.lang.String r1, com.aide.ui.scm.xa r2);

    void j6(com.aide.ui.scm.GitConfiguration r1, java.lang.String r2, com.aide.ui.scm.xa r3);

    void j6(com.aide.ui.scm.GitConfiguration r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, com.aide.ui.scm.xa r5);

    void j6(com.aide.ui.scm.GitConfiguration r1, java.lang.String r2, java.lang.String r3, java.util.List<java.lang.String> r4, com.aide.ui.scm.xa r5);

    void j6(com.aide.ui.scm.GitConfiguration r1, java.lang.String r2, java.util.List<com.aide.ui.scm.ModifiedFile> r3, java.lang.String r4, com.aide.ui.scm.xa r5);

    void j6(java.lang.String r1, java.lang.String r2, com.aide.ui.scm.xa r3);

    void j6(java.lang.String r1, java.lang.String r2, java.lang.String r3, com.aide.ui.scm.xa r4);

    void j6(java.lang.String r1, java.util.List<com.aide.ui.scm.ModifiedFile> r2, com.aide.ui.scm.xa r3);
}
