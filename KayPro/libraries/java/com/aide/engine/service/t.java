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

            static {
                abcd.wu.j6(com.aide.engine.service.t.a.C0036a.class, -308244051107167000L, -308244051107167000L);
            }

            @abcd.Interfacesu(method = -4047854087946226600L)
            C0036a(android.os.IBinder r6) {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, 6690430170789546384L, null, r6);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(6690430170789546384L, null, r6);     // Catch: java.lang.Throwable -> L8
            L6:
                this.FH = r6;     // Catch: java.lang.Throwable -> L8
            }

            @Override
            @abcd.Interfacesu(method = -309128250239940045L)
            public void DW(java.lang.String r10, long r11, int r13, int r14) {
            L12:
                th = move-exception;
                if (DW == false) goto L16;
                abcd.wu.j6(th, -3241649992988355111L, this, r10, new java.lang.Long(r11), new java.lang.Integer(r13), new java.lang.Integer(r14));
            L16:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(-3241649992988355111L, this, r10, new java.lang.Long(r11), new java.lang.Integer(r13), new java.lang.Integer(r14));     // Catch: java.lang.Throwable -> L12
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L12
                r0.writeInterfaceToken("com.aide.engine.service.INavigationListener");     // Catch: java.lang.Throwable -> L9
                r0.writeString(r10);     // Catch: java.lang.Throwable -> L9
                r0.writeLong(r11);     // Catch: java.lang.Throwable -> L9
                r0.writeInt(r13);     // Catch: java.lang.Throwable -> L9
                r0.writeInt(r14);     // Catch: java.lang.Throwable -> L9
                this.FH.transact(2, r0, null, 1);     // Catch: java.lang.Throwable -> L9
                r0.recycle();     // Catch: java.lang.Throwable -> L12
                return;
            L9:
                th = move-exception;
                r0.recycle();     // Catch: java.lang.Throwable -> L12
                throw th;     // Catch: java.lang.Throwable -> L12
            }

            @Override
            @abcd.Interfacesu(method = 1914714510163354472L)
            public android.os.IBinder asBinder() {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, -2902466081824273584L, this);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-2902466081824273584L, this);     // Catch: java.lang.Throwable -> L8
            L6:
                return this.FH;
            }

            @Override
            @abcd.Interfacesu(method = 267418839655490688L)
            public void j6(java.lang.String r15, long r16, int r18, int r19, com.aide.engine.SourceEntity r20) {
            L27:
                th = th;
            L30:
                if (DW == false) goto L32;
                java.lang.Throwable r1 = th;
                abcd.wu.j6(r1, 305864470263577200L, this, r15, new java.lang.Long(r16), new java.lang.Integer(r18), new java.lang.Integer(r19), r20);
            L32:
                throw th;
            L4:
                if (j6 == false) goto L36;
                abcd.wu.j6(305864470263577200L, this, r15, new java.lang.Long(r16), new java.lang.Integer(r18), new java.lang.Integer(r19), r20);     // Catch: java.lang.Throwable -> L27
            L36:
                android.os.Parcel r5 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L27
                r5.writeInterfaceToken("com.aide.engine.service.INavigationListener");     // Catch: java.lang.Throwable -> L21
                r5.writeString(r15);     // Catch: java.lang.Throwable -> L19
                r5.writeLong(r16);     // Catch: java.lang.Throwable -> L19
                r5.writeInt(r18);     // Catch: java.lang.Throwable -> L19
                r5.writeInt(r19);     // Catch: java.lang.Throwable -> L19
                if (r20 == null) goto L12;
                r5.writeInt(1);     // Catch: java.lang.Throwable -> L19
                r20.writeToParcel(r5, 0);     // Catch: java.lang.Throwable -> L19
            L33:
                this.FH.transact(1, r5, null, 1);     // Catch: java.lang.Throwable -> L17
                r5.recycle();     // Catch: java.lang.Throwable -> L25
                return;
            L17:
                th = th;
            L23:
                r5.recycle();     // Catch: java.lang.Throwable -> L25
                throw th;     // Catch: java.lang.Throwable -> L25
            L12:
                r5.writeInt(0);     // Catch: java.lang.Throwable -> L19
            L19:
                th = th;
            L21:
                th = th;
            L25:
                th = th;
                goto L30
            }
        }

        static {
            abcd.wu.j6(com.aide.engine.service.t.a.class, 7096511077883591328L, 7096511077883591328L);
        }

        public a() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -424570548263080884L, null);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-424570548263080884L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            attachInterface(this, "com.aide.engine.service.INavigationListener");     // Catch: java.lang.Throwable -> L8
        }

        public static com.aide.engine.service.t j6(android.os.IBinder r5) {
        L16:
            th = move-exception;
            if (DW == false) goto L20;
            abcd.wu.j6(th, 1983088002071073825L, null, r5);
        L20:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(1983088002071073825L, null, r5);     // Catch: java.lang.Throwable -> L16
        L6:
            if (r5 != null) goto L8;
            return null;
        L8:
            android.os.IInterface r3 = r5.queryLocalInterface("com.aide.engine.service.INavigationListener");     // Catch: java.lang.Throwable -> L16
            if (r3 == null) goto L15;
            if ((r3 instanceof com.aide.engine.service.t) == false) goto L15;
            return (com.aide.engine.service.t) r3;
        L15:
            return new com.aide.engine.service.t.a.C0036a(r5);
        }

        @Override
        public android.os.IBinder asBinder() {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 1333130433336380928L, this);
        L11:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(1333130433336380928L, this);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        public boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
        L23:
            th = move-exception;
            if (DW == false) goto L27;
            abcd.wu.j6(th, 79483760547617473L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
        L27:
            throw th;
        L3:
            if (j6 == false) goto L6;
            abcd.wu.j6(79483760547617473L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L23
        L6:
            if (r10 != 1) goto L8;
            r11.enforceInterface("com.aide.engine.service.INavigationListener");     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = r11.readString();     // Catch: java.lang.Throwable -> L23
            long r4 = r11.readLong();     // Catch: java.lang.Throwable -> L23
            int r6 = r11.readInt();     // Catch: java.lang.Throwable -> L23
            int r7 = r11.readInt();     // Catch: java.lang.Throwable -> L23
            if (r11.readInt() == 0) goto L20;
            com.aide.engine.SourceEntity r0 = com.aide.engine.SourceEntity.CREATOR.createFromParcel(r11);     // Catch: java.lang.Throwable -> L23
        L21:
            j6(r3, r4, r6, r7, r0);     // Catch: java.lang.Throwable -> L23
            return true;
        L20:
            r0 = null;
            goto L21
        L8:
            if (r10 != 2) goto L10;
            r11.enforceInterface("com.aide.engine.service.INavigationListener");     // Catch: java.lang.Throwable -> L23
            DW(r11.readString(), r11.readLong(), r11.readInt(), r11.readInt());     // Catch: java.lang.Throwable -> L23
            return true;
        L10:
            if (r10 != 1598968902) goto L12;
            r12.writeString("com.aide.engine.service.INavigationListener");     // Catch: java.lang.Throwable -> L23
            return true;
        L12:
            return super.onTransact(r10, r11, r12, r13);
        }
    }

    void DW(java.lang.String r1, long r2, int r4, int r5);

    void j6(java.lang.String r1, long r2, int r4, int r5, com.aide.engine.SourceEntity r6);
}
