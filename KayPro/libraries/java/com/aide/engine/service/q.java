package com.aide.engine.service;

public interface q extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class a extends android.os.Binder implements com.aide.engine.service.q {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0033a implements com.aide.engine.service.q {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = -2011406384478234749L)
            private android.os.IBinder FH;

            static {
                abcd.wu.j6(com.aide.engine.service.q.a.C0033a.class, 7893716468066564328L, 7893716468066564328L);
            }

            @abcd.Interfacesu(method = -299655753623938233L)
            C0033a(android.os.IBinder r6) {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, 589908596238702735L, null, r6);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(589908596238702735L, null, r6);     // Catch: java.lang.Throwable -> L8
            L6:
                this.FH = r6;     // Catch: java.lang.Throwable -> L8
            }

            @Override
            @abcd.Interfacesu(method = -2459115334890528415L)
            public android.os.IBinder asBinder() {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, 1011369205441212345L, this);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(1011369205441212345L, this);     // Catch: java.lang.Throwable -> L8
            L6:
                return this.FH;
            }

            @Override
            @abcd.Interfacesu(method = 2288222475555810525L)
            public void jO() {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, -2834961462256487679L, this);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-2834961462256487679L, this);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.engine.service.IEngineListener");     // Catch: java.lang.Throwable -> L10
                this.FH.transact(2, r2, null, 1);     // Catch: java.lang.Throwable -> L10
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                return;
            L10:
                th = move-exception;
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                throw th;     // Catch: java.lang.Throwable -> L13
            }

            @Override
            @abcd.Interfacesu(method = 1252327634758126129L)
            public void sy() {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, -465915289178080563L, this);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-465915289178080563L, this);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.engine.service.IEngineListener");     // Catch: java.lang.Throwable -> L10
                this.FH.transact(1, r2, null, 1);     // Catch: java.lang.Throwable -> L10
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                return;
            L10:
                th = move-exception;
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                throw th;     // Catch: java.lang.Throwable -> L13
            }
        }

        static {
            abcd.wu.j6(com.aide.engine.service.q.a.class, 2765317766594800008L, 2765317766594800008L);
        }

        public a() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 2130029441730286304L, null);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(2130029441730286304L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            attachInterface(this, "com.aide.engine.service.IEngineListener");     // Catch: java.lang.Throwable -> L8
        }

        public static com.aide.engine.service.q j6(android.os.IBinder r5) {
        L16:
            th = move-exception;
            if (DW == false) goto L20;
            abcd.wu.j6(th, -2464367143524039593L, null, r5);
        L20:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-2464367143524039593L, null, r5);     // Catch: java.lang.Throwable -> L16
        L6:
            if (r5 != null) goto L8;
            return null;
        L8:
            android.os.IInterface r3 = r5.queryLocalInterface("com.aide.engine.service.IEngineListener");     // Catch: java.lang.Throwable -> L16
            if (r3 == null) goto L15;
            if ((r3 instanceof com.aide.engine.service.q) == false) goto L15;
            return (com.aide.engine.service.q) r3;
        L15:
            return new com.aide.engine.service.q.a.C0033a(r5);
        }

        @Override
        public android.os.IBinder asBinder() {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 1096550609866304808L, this);
        L11:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(1096550609866304808L, this);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        public boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
        L19:
            th = move-exception;
            if (DW == false) goto L23;
            abcd.wu.j6(th, -575229089038197825L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
        L23:
            throw th;
        L3:
            if (j6 == false) goto L6;
            abcd.wu.j6(-575229089038197825L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L19
        L6:
            if (r10 != 1) goto L8;
            r11.enforceInterface("com.aide.engine.service.IEngineListener");     // Catch: java.lang.Throwable -> L19
            sy();     // Catch: java.lang.Throwable -> L19
            return true;
        L8:
            if (r10 != 2) goto L10;
            r11.enforceInterface("com.aide.engine.service.IEngineListener");     // Catch: java.lang.Throwable -> L19
            jO();     // Catch: java.lang.Throwable -> L19
            return true;
        L10:
            if (r10 != 1598968902) goto L12;
            r12.writeString("com.aide.engine.service.IEngineListener");     // Catch: java.lang.Throwable -> L19
            return true;
        L12:
            return super.onTransact(r10, r11, r12, r13);
        }
    }

    void jO();

    void sy();
}
