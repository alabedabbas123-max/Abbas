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

            static {
                abcd.wu.j6(com.aide.ui.scm.xa.a.C0052a.class, 1769310402124146060L, 1769310402124146060L);
            }

            @abcd.Interfacesu(method = -126305190805034832L)
            C0052a(android.os.IBinder r6) {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, 3657393273991967821L, null, r6);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(3657393273991967821L, null, r6);     // Catch: java.lang.Throwable -> L8
            L6:
                this.FH = r6;     // Catch: java.lang.Throwable -> L8
            }

            @Override
            @abcd.Interfacesu(method = 1010551025583196545L)
            public void AL() {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, -6239299140722944296L, this);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-6239299140722944296L, this);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");     // Catch: java.lang.Throwable -> L10
                this.FH.transact(4, r2, null, 1);     // Catch: java.lang.Throwable -> L10
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                return;
            L10:
                th = move-exception;
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                throw th;     // Catch: java.lang.Throwable -> L13
            }

            @Override
            @abcd.Interfacesu(method = 1901013537234193977L)
            public void Hw(int r7) {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, 74299071085801184L, this, new java.lang.Integer(r7));
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(74299071085801184L, this, r7);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");     // Catch: java.lang.Throwable -> L10
                r2.writeInt(r7);     // Catch: java.lang.Throwable -> L10
                this.FH.transact(1, r2, null, 1);     // Catch: java.lang.Throwable -> L10
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                return;
            L10:
                th = move-exception;
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                throw th;     // Catch: java.lang.Throwable -> L13
            }

            @Override
            @abcd.Interfacesu(method = 4411913705829546363L)
            public java.lang.String J0(java.lang.String r8) {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, 2326452910124797440L, this, r8);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(2326452910124797440L, this, r8);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                android.os.Parcel r3 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");     // Catch: java.lang.Throwable -> L10
                r2.writeString(r8);     // Catch: java.lang.Throwable -> L10
                this.FH.transact(8, r2, r3, 0);     // Catch: java.lang.Throwable -> L10
                r3.readException();     // Catch: java.lang.Throwable -> L10
                java.lang.String r4 = r3.readString();     // Catch: java.lang.Throwable -> L10
                r3.recycle();     // Catch: java.lang.Throwable -> L13
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                return r4;
            L10:
                th = move-exception;
                r3.recycle();     // Catch: java.lang.Throwable -> L13
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                throw th;     // Catch: java.lang.Throwable -> L13
            }

            @Override
            @abcd.Interfacesu(method = 771771530722102475L)
            public java.lang.String Ws(java.lang.String r8) {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, 1218636531025912620L, this, r8);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(1218636531025912620L, this, r8);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                android.os.Parcel r3 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");     // Catch: java.lang.Throwable -> L10
                r2.writeString(r8);     // Catch: java.lang.Throwable -> L10
                this.FH.transact(9, r2, r3, 0);     // Catch: java.lang.Throwable -> L10
                r3.readException();     // Catch: java.lang.Throwable -> L10
                java.lang.String r4 = r3.readString();     // Catch: java.lang.Throwable -> L10
                r3.recycle();     // Catch: java.lang.Throwable -> L13
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                return r4;
            L10:
                th = move-exception;
                r3.recycle();     // Catch: java.lang.Throwable -> L13
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                throw th;     // Catch: java.lang.Throwable -> L13
            }

            @Override
            @abcd.Interfacesu(method = 6488955455472510525L)
            public void XL(java.lang.String r8) {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, -6095350490977850336L, this, r8);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-6095350490977850336L, this, r8);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");     // Catch: java.lang.Throwable -> L10
                r2.writeString(r8);     // Catch: java.lang.Throwable -> L10
                this.FH.transact(5, r2, null, 1);     // Catch: java.lang.Throwable -> L10
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                return;
            L10:
                th = move-exception;
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                throw th;     // Catch: java.lang.Throwable -> L13
            }

            @Override
            @abcd.Interfacesu(method = 955421926645466160L)
            public android.os.IBinder asBinder() {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, 376890077327611755L, this);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(376890077327611755L, this);     // Catch: java.lang.Throwable -> L8
            L6:
                return this.FH;
            }

            @Override
            @abcd.Interfacesu(method = 2243002023093406304L)
            public java.lang.String gn(java.lang.String r8) {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, 1718325278337891977L, this, r8);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(1718325278337891977L, this, r8);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                android.os.Parcel r3 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");     // Catch: java.lang.Throwable -> L10
                r2.writeString(r8);     // Catch: java.lang.Throwable -> L10
                this.FH.transact(10, r2, r3, 0);     // Catch: java.lang.Throwable -> L10
                r3.readException();     // Catch: java.lang.Throwable -> L10
                java.lang.String r4 = r3.readString();     // Catch: java.lang.Throwable -> L10
                r3.recycle();     // Catch: java.lang.Throwable -> L13
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                return r4;
            L10:
                th = move-exception;
                r3.recycle();     // Catch: java.lang.Throwable -> L13
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                throw th;     // Catch: java.lang.Throwable -> L13
            }

            @Override
            @abcd.Interfacesu(method = 77970837858119369L)
            public void hz() {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, 9054720688640447232L, this);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(9054720688640447232L, this);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");     // Catch: java.lang.Throwable -> L10
                this.FH.transact(6, r2, null, 1);     // Catch: java.lang.Throwable -> L10
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                return;
            L10:
                th = move-exception;
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                throw th;     // Catch: java.lang.Throwable -> L13
            }

            @Override
            @abcd.Interfacesu(method = 3666331541234062272L)
            public void v5(int r8) {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, 3884279348453324489L, this, new java.lang.Integer(r8));
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(3884279348453324489L, this, r8);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");     // Catch: java.lang.Throwable -> L10
                r2.writeInt(r8);     // Catch: java.lang.Throwable -> L10
                this.FH.transact(3, r2, null, 1);     // Catch: java.lang.Throwable -> L10
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                return;
            L10:
                th = move-exception;
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                throw th;     // Catch: java.lang.Throwable -> L13
            }

            @Override
            @abcd.Interfacesu(method = -7972130897108915488L)
            public void v5(java.lang.String r8, int r9) {
            L12:
                th = move-exception;
                if (DW == false) goto L16;
                abcd.wu.j6(th, -4582302356813538255L, this, r8, new java.lang.Integer(r9));
            L16:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(-4582302356813538255L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L12
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L12
                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");     // Catch: java.lang.Throwable -> L9
                r0.writeString(r8);     // Catch: java.lang.Throwable -> L9
                r0.writeInt(r9);     // Catch: java.lang.Throwable -> L9
                this.FH.transact(2, r0, null, 1);     // Catch: java.lang.Throwable -> L9
                r0.recycle();     // Catch: java.lang.Throwable -> L12
                return;
            L9:
                th = move-exception;
                r0.recycle();     // Catch: java.lang.Throwable -> L12
                throw th;     // Catch: java.lang.Throwable -> L12
            }

            @Override
            @abcd.Interfacesu(method = 454165782073168896L)
            public void w9() {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, -2562596891552475437L, this);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-2562596891552475437L, this);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");     // Catch: java.lang.Throwable -> L10
                this.FH.transact(7, r2, null, 1);     // Catch: java.lang.Throwable -> L10
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                return;
            L10:
                th = move-exception;
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                throw th;     // Catch: java.lang.Throwable -> L13
            }

            @Override
            @abcd.Interfacesu(method = 104818750393487403L)
            public void we(java.lang.String r8) {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, -1410628556978082288L, this, r8);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-1410628556978082288L, this, r8);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                android.os.Parcel r3 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.ui.scm.IExternalGitServiceListener");     // Catch: java.lang.Throwable -> L10
                r2.writeString(r8);     // Catch: java.lang.Throwable -> L10
                this.FH.transact(11, r2, r3, 0);     // Catch: java.lang.Throwable -> L10
                r3.readException();     // Catch: java.lang.Throwable -> L10
                r3.recycle();     // Catch: java.lang.Throwable -> L13
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                return;
            L10:
                th = move-exception;
                r3.recycle();     // Catch: java.lang.Throwable -> L13
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                throw th;     // Catch: java.lang.Throwable -> L13
            }
        }

        static {
            abcd.wu.j6(com.aide.ui.scm.xa.a.class, -75292738475704224L, -75292738475704224L);
        }

        public a() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -863354461294087119L, null);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-863354461294087119L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            attachInterface(this, "com.aide.ui.scm.IExternalGitServiceListener");     // Catch: java.lang.Throwable -> L8
        }

        public static com.aide.ui.scm.xa j6(android.os.IBinder r5) {
        L16:
            th = move-exception;
            if (DW == false) goto L20;
            abcd.wu.j6(th, 1451392838563900000L, null, r5);
        L20:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(1451392838563900000L, null, r5);     // Catch: java.lang.Throwable -> L16
        L6:
            if (r5 != null) goto L8;
            return null;
        L8:
            android.os.IInterface r3 = r5.queryLocalInterface("com.aide.ui.scm.IExternalGitServiceListener");     // Catch: java.lang.Throwable -> L16
            if (r3 == null) goto L15;
            if ((r3 instanceof com.aide.ui.scm.xa) == false) goto L15;
            return (com.aide.ui.scm.xa) r3;
        L15:
            return new com.aide.ui.scm.xa.a.C0052a(r5);
        }

        @Override
        public android.os.IBinder asBinder() {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -1930049053568823639L, this);
        L11:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1930049053568823639L, this);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        public boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
        L34:
            th = move-exception;
            if (DW == false) goto L38;
            abcd.wu.j6(th, -147276187912918080L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
        L38:
            throw th;
        L3:
            if (j6 == false) goto L6;
            abcd.wu.j6(-147276187912918080L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L34
        L6:
            if (r10 == 1598968902) goto L32;
            switch(r10) {
                case 1: goto L30;
                case 2: goto L28;
                case 3: goto L26;
                case 4: goto L24;
                case 5: goto L22;
                case 6: goto L20;
                case 7: goto L18;
                case 8: goto L16;
                case 9: goto L14;
                case 10: goto L12;
                case 11: goto L10;
                default: goto L9;
            };     // Catch: java.lang.Throwable -> L34
        L10:
            r11.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");     // Catch: java.lang.Throwable -> L34
            we(r11.readString());     // Catch: java.lang.Throwable -> L34
            r12.writeNoException();     // Catch: java.lang.Throwable -> L34
            return true;
        L12:
            r11.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = gn(r11.readString());     // Catch: java.lang.Throwable -> L34
            r12.writeNoException();     // Catch: java.lang.Throwable -> L34
            r12.writeString(r0);     // Catch: java.lang.Throwable -> L34
            return true;
        L14:
            r11.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = Ws(r11.readString());     // Catch: java.lang.Throwable -> L34
            r12.writeNoException();     // Catch: java.lang.Throwable -> L34
            r12.writeString(r1);     // Catch: java.lang.Throwable -> L34
            return true;
        L16:
            r11.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = J0(r11.readString());     // Catch: java.lang.Throwable -> L34
            r12.writeNoException();     // Catch: java.lang.Throwable -> L34
            r12.writeString(r2);     // Catch: java.lang.Throwable -> L34
            return true;
        L18:
            r11.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");     // Catch: java.lang.Throwable -> L34
            w9();     // Catch: java.lang.Throwable -> L34
            return true;
        L20:
            r11.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");     // Catch: java.lang.Throwable -> L34
            hz();     // Catch: java.lang.Throwable -> L34
            return true;
        L22:
            r11.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");     // Catch: java.lang.Throwable -> L34
            XL(r11.readString());     // Catch: java.lang.Throwable -> L34
            return true;
        L24:
            r11.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");     // Catch: java.lang.Throwable -> L34
            AL();     // Catch: java.lang.Throwable -> L34
            return true;
        L26:
            r11.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");     // Catch: java.lang.Throwable -> L34
            v5(r11.readInt());     // Catch: java.lang.Throwable -> L34
            return true;
        L28:
            r11.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");     // Catch: java.lang.Throwable -> L34
            v5(r11.readString(), r11.readInt());     // Catch: java.lang.Throwable -> L34
            return true;
        L30:
            r11.enforceInterface("com.aide.ui.scm.IExternalGitServiceListener");     // Catch: java.lang.Throwable -> L34
            Hw(r11.readInt());     // Catch: java.lang.Throwable -> L34
            return true;
        L9:
            return super.onTransact(r10, r11, r12, r13);
        L32:
            r12.writeString("com.aide.ui.scm.IExternalGitServiceListener");     // Catch: java.lang.Throwable -> L34
            return true;
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
