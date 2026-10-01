package com.aide.engine.service;

public interface u extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class a extends android.os.Binder implements com.aide.engine.service.u {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0037a implements com.aide.engine.service.u {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = 2688564112450983911L)
            private android.os.IBinder FH;

            static {
                abcd.wu.j6(com.aide.engine.service.u.a.C0037a.class, -809230371033444745L, -809230371033444745L);
            }

            @abcd.Interfacesu(method = -14480104674388701L)
            C0037a(android.os.IBinder r6) {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, -6069847640756722140L, null, r6);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-6069847640756722140L, null, r6);     // Catch: java.lang.Throwable -> L8
            L6:
                this.FH = r6;     // Catch: java.lang.Throwable -> L8
            }

            @Override
            @abcd.Interfacesu(method = 4389674880619663063L)
            public com.aide.engine.service.CharArray FH(int r8) {
            L17:
                th = move-exception;
                if (DW == false) goto L21;
                abcd.wu.j6(th, -2541115332202067616L, this, new java.lang.Integer(r8));
            L21:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-2541115332202067616L, this, r8);     // Catch: java.lang.Throwable -> L17
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L17
                android.os.Parcel r3 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L17
                r2.writeInterfaceToken("com.aide.engine.service.IOpenFileInterface");     // Catch: java.lang.Throwable -> L14
                r2.writeInt(r8);     // Catch: java.lang.Throwable -> L14
                this.FH.transact(4, r2, r3, 0);     // Catch: java.lang.Throwable -> L14
                r3.readException();     // Catch: java.lang.Throwable -> L14
                if (r3.readInt() == 0) goto L11;
                com.aide.engine.service.CharArray r4 = com.aide.engine.service.CharArray.CREATOR.createFromParcel(r3);     // Catch: java.lang.Throwable -> L14
            L12:
                r3.recycle();     // Catch: java.lang.Throwable -> L17
                r2.recycle();     // Catch: java.lang.Throwable -> L17
                return r4;
            L11:
                r4 = null;
            L14:
                th = move-exception;
                r3.recycle();     // Catch: java.lang.Throwable -> L17
                r2.recycle();     // Catch: java.lang.Throwable -> L17
                throw th;     // Catch: java.lang.Throwable -> L17
            }

            @Override
            @abcd.Interfacesu(method = 629550268082655221L)
            public android.os.IBinder asBinder() {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, 1519646659550658720L, this);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(1519646659550658720L, this);     // Catch: java.lang.Throwable -> L8
            L6:
                return this.FH;
            }

            @Override
            @abcd.Interfacesu(method = -4214871052232286303L)
            public long getVersion() {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, -3037254234425377560L, this);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-3037254234425377560L, this);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                android.os.Parcel r3 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.engine.service.IOpenFileInterface");     // Catch: java.lang.Throwable -> L10
                this.FH.transact(1, r2, r3, 0);     // Catch: java.lang.Throwable -> L10
                r3.readException();     // Catch: java.lang.Throwable -> L10
                long r4 = r3.readLong();     // Catch: java.lang.Throwable -> L10
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
            @abcd.Interfacesu(method = 2049081957824719216L)
            public int sE() {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, 68354855023855923L, this);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(68354855023855923L, this);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                android.os.Parcel r3 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.engine.service.IOpenFileInterface");     // Catch: java.lang.Throwable -> L10
                this.FH.transact(3, r2, r3, 0);     // Catch: java.lang.Throwable -> L10
                r3.readException();     // Catch: java.lang.Throwable -> L10
                int r4 = r3.readInt();     // Catch: java.lang.Throwable -> L10
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
            @abcd.Interfacesu(method = 4921263199696861017L)
            public long ye() {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, -2263599873468995344L, this);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-2263599873468995344L, this);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                android.os.Parcel r3 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.engine.service.IOpenFileInterface");     // Catch: java.lang.Throwable -> L10
                this.FH.transact(2, r2, r3, 0);     // Catch: java.lang.Throwable -> L10
                r3.readException();     // Catch: java.lang.Throwable -> L10
                long r4 = r3.readLong();     // Catch: java.lang.Throwable -> L10
                r3.recycle();     // Catch: java.lang.Throwable -> L13
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                return r4;
            L10:
                th = move-exception;
                r3.recycle();     // Catch: java.lang.Throwable -> L13
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                throw th;     // Catch: java.lang.Throwable -> L13
            }
        }

        static {
            abcd.wu.j6(com.aide.engine.service.u.a.class, 6492442858675893371L, 6492442858675893371L);
        }

        public a() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -2366004272929090959L, null);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-2366004272929090959L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            attachInterface(this, "com.aide.engine.service.IOpenFileInterface");     // Catch: java.lang.Throwable -> L8
        }

        public static com.aide.engine.service.u j6(android.os.IBinder r5) {
        L16:
            th = move-exception;
            if (DW == false) goto L20;
            abcd.wu.j6(th, 878645028592189260L, null, r5);
        L20:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(878645028592189260L, null, r5);     // Catch: java.lang.Throwable -> L16
        L6:
            if (r5 != null) goto L8;
            return null;
        L8:
            android.os.IInterface r3 = r5.queryLocalInterface("com.aide.engine.service.IOpenFileInterface");     // Catch: java.lang.Throwable -> L16
            if (r3 == null) goto L15;
            if ((r3 instanceof com.aide.engine.service.u) == false) goto L15;
            return (com.aide.engine.service.u) r3;
        L15:
            return new com.aide.engine.service.u.a.C0037a(r5);
        }

        @Override
        public android.os.IBinder asBinder() {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -450617560726896351L, this);
        L11:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-450617560726896351L, this);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        public boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
        L30:
            th = move-exception;
            if (DW == false) goto L34;
            abcd.wu.j6(th, -796208241111484916L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
        L34:
            throw th;
        L3:
            if (j6 == false) goto L6;
            abcd.wu.j6(-796208241111484916L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L30
        L6:
            if (r10 != 1) goto L8;
            r11.enforceInterface("com.aide.engine.service.IOpenFileInterface");     // Catch: java.lang.Throwable -> L30
            long r2 = getVersion();     // Catch: java.lang.Throwable -> L30
            r12.writeNoException();     // Catch: java.lang.Throwable -> L30
            r12.writeLong(r2);     // Catch: java.lang.Throwable -> L30
            return true;
        L8:
            if (r10 != 2) goto L10;
            r11.enforceInterface("com.aide.engine.service.IOpenFileInterface");     // Catch: java.lang.Throwable -> L30
            long r3 = ye();     // Catch: java.lang.Throwable -> L30
            r12.writeNoException();     // Catch: java.lang.Throwable -> L30
            r12.writeLong(r3);     // Catch: java.lang.Throwable -> L30
            return true;
        L10:
            if (r10 != 3) goto L12;
            r11.enforceInterface("com.aide.engine.service.IOpenFileInterface");     // Catch: java.lang.Throwable -> L30
            int r0 = sE();     // Catch: java.lang.Throwable -> L30
            r12.writeNoException();     // Catch: java.lang.Throwable -> L30
            r12.writeInt(r0);     // Catch: java.lang.Throwable -> L30
            return true;
        L12:
            if (r10 != 4) goto L14;
            r11.enforceInterface("com.aide.engine.service.IOpenFileInterface");     // Catch: java.lang.Throwable -> L30
            com.aide.engine.service.CharArray r1 = FH(r11.readInt());     // Catch: java.lang.Throwable -> L30
            r12.writeNoException();     // Catch: java.lang.Throwable -> L30
            if (r1 == null) goto L22;
            r12.writeInt(1);     // Catch: java.lang.Throwable -> L30
            r1.writeToParcel(r12, 1);     // Catch: java.lang.Throwable -> L30
        L23:
            return true;
        L22:
            r12.writeInt(0);     // Catch: java.lang.Throwable -> L30
            goto L23
        L14:
            if (r10 != 1598968902) goto L16;
            r12.writeString("com.aide.engine.service.IOpenFileInterface");     // Catch: java.lang.Throwable -> L30
            return true;
        L16:
            return super.onTransact(r10, r11, r12, r13);
        }
    }

    com.aide.engine.service.CharArray FH(int r1);

    long getVersion();

    int sE();

    long ye();
}
