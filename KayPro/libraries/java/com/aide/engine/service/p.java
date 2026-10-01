package com.aide.engine.service;

public interface p extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class a extends android.os.Binder implements com.aide.engine.service.p {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0032a implements com.aide.engine.service.p {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = -3105846227888116452L)
            private android.os.IBinder FH;

            static {
                abcd.wu.j6(com.aide.engine.service.p.a.C0032a.class, -1132746736937134392L, -1132746736937134392L);
            }

            @abcd.Interfacesu(method = -245730147769690000L)
            C0032a(android.os.IBinder r6) {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, -7026785476429618368L, null, r6);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-7026785476429618368L, null, r6);     // Catch: java.lang.Throwable -> L8
            L6:
                this.FH = r6;     // Catch: java.lang.Throwable -> L8
            }

            @Override
            @abcd.Interfacesu(method = 82138605853598112L)
            public void FH(java.lang.String r8) {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, -3395447268912923280L, this, r8);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-3395447268912923280L, this, r8);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.engine.service.IEngineErrorListener");     // Catch: java.lang.Throwable -> L10
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
            @abcd.Interfacesu(method = -4434244072808485403L)
            public void OW() {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, -4806584748576452415L, this);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-4806584748576452415L, this);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.engine.service.IEngineErrorListener");     // Catch: java.lang.Throwable -> L10
                this.FH.transact(1, r2, null, 1);     // Catch: java.lang.Throwable -> L10
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                return;
            L10:
                th = move-exception;
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                throw th;     // Catch: java.lang.Throwable -> L13
            }

            @Override
            @abcd.Interfacesu(method = 3612442189242930187L)
            public void QX(java.lang.String r8) {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, -3590787591572377329L, this, r8);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-3590787591572377329L, this, r8);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.engine.service.IEngineErrorListener");     // Catch: java.lang.Throwable -> L10
                r2.writeString(r8);     // Catch: java.lang.Throwable -> L10
                this.FH.transact(2, r2, null, 1);     // Catch: java.lang.Throwable -> L10
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                return;
            L10:
                th = move-exception;
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                throw th;     // Catch: java.lang.Throwable -> L13
            }

            @Override
            @abcd.Interfacesu(method = 4149488014207849277L)
            public void aj() {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, -754960550111463935L, this);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-754960550111463935L, this);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.engine.service.IEngineErrorListener");     // Catch: java.lang.Throwable -> L10
                this.FH.transact(3, r2, null, 1);     // Catch: java.lang.Throwable -> L10
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                return;
            L10:
                th = move-exception;
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                throw th;     // Catch: java.lang.Throwable -> L13
            }

            @Override
            @abcd.Interfacesu(method = 2040104003274306352L)
            public android.os.IBinder asBinder() {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, 1233776082611862392L, this);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(1233776082611862392L, this);     // Catch: java.lang.Throwable -> L8
            L6:
                return this.FH;
            }

            @Override
            @abcd.Interfacesu(method = -6560151981828953235L)
            public void j6(java.lang.String r9, com.aide.engine.SyntaxError[] r10, boolean r11) {
            L15:
                th = move-exception;
                if (DW == false) goto L19;
                abcd.wu.j6(th, 5739022252632619521L, this, r9, r10, new java.lang.Boolean(r11));
            L19:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(5739022252632619521L, this, r9, r10, new java.lang.Boolean(r11));     // Catch: java.lang.Throwable -> L15
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L15
                r0.writeInterfaceToken("com.aide.engine.service.IEngineErrorListener");     // Catch: java.lang.Throwable -> L12
                r0.writeString(r9);     // Catch: java.lang.Throwable -> L12
                int r1 = 0;
                r0.writeTypedArray(r10, 0);     // Catch: java.lang.Throwable -> L12
                if (r11 == false) goto L9;
                r1 = 1;
            L9:
                r0.writeInt(r1);     // Catch: java.lang.Throwable -> L12
                this.FH.transact(4, r0, null, 1);     // Catch: java.lang.Throwable -> L12
                r0.recycle();     // Catch: java.lang.Throwable -> L15
                return;
            L12:
                th = move-exception;
                r0.recycle();     // Catch: java.lang.Throwable -> L15
                throw th;     // Catch: java.lang.Throwable -> L15
            }
        }

        static {
            abcd.wu.j6(com.aide.engine.service.p.a.class, -2918936578881055840L, -2918936578881055840L);
        }

        public a() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 791699895359807868L, null);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(791699895359807868L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            attachInterface(this, "com.aide.engine.service.IEngineErrorListener");     // Catch: java.lang.Throwable -> L8
        }

        public static com.aide.engine.service.p j6(android.os.IBinder r5) {
        L16:
            th = move-exception;
            if (DW == false) goto L20;
            abcd.wu.j6(th, -562652590735852983L, null, r5);
        L20:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-562652590735852983L, null, r5);     // Catch: java.lang.Throwable -> L16
        L6:
            if (r5 != null) goto L8;
            return null;
        L8:
            android.os.IInterface r3 = r5.queryLocalInterface("com.aide.engine.service.IEngineErrorListener");     // Catch: java.lang.Throwable -> L16
            if (r3 == null) goto L15;
            if ((r3 instanceof com.aide.engine.service.p) == false) goto L15;
            return (com.aide.engine.service.p) r3;
        L15:
            return new com.aide.engine.service.p.a.C0032a(r5);
        }

        @Override
        public android.os.IBinder asBinder() {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -61778177497234464L, this);
        L11:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-61778177497234464L, this);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        public boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
        L35:
            th = move-exception;
            if (DW == false) goto L39;
            abcd.wu.j6(th, 1418778786085707305L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
        L39:
            throw th;
        L3:
            if (j6 == false) goto L6;
            abcd.wu.j6(1418778786085707305L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L35
        L6:
            if (r10 != 1) goto L8;
            r11.enforceInterface("com.aide.engine.service.IEngineErrorListener");     // Catch: java.lang.Throwable -> L35
            OW();     // Catch: java.lang.Throwable -> L35
            return true;
        L8:
            if (r10 != 2) goto L10;
            r11.enforceInterface("com.aide.engine.service.IEngineErrorListener");     // Catch: java.lang.Throwable -> L35
            QX(r11.readString());     // Catch: java.lang.Throwable -> L35
            return true;
        L10:
            if (r10 != 3) goto L12;
            r11.enforceInterface("com.aide.engine.service.IEngineErrorListener");     // Catch: java.lang.Throwable -> L35
            aj();     // Catch: java.lang.Throwable -> L35
            return true;
        L12:
            if (r10 != 4) goto L14;
            r11.enforceInterface("com.aide.engine.service.IEngineErrorListener");     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r11.readString();     // Catch: java.lang.Throwable -> L35
            com.aide.engine.SyntaxError[] r2 = (com.aide.engine.SyntaxError[]) r11.createTypedArray(com.aide.engine.SyntaxError.CREATOR);     // Catch: java.lang.Throwable -> L35
            if (r11.readInt() == 0) goto L26;
            boolean r3 = true;
        L27:
            j6(r0, r2, r3);     // Catch: java.lang.Throwable -> L35
            return true;
        L26:
            r3 = false;
            goto L27
        L14:
            if (r10 != 5) goto L16;
            r11.enforceInterface("com.aide.engine.service.IEngineErrorListener");     // Catch: java.lang.Throwable -> L35
            FH(r11.readString());     // Catch: java.lang.Throwable -> L35
            return true;
        L16:
            if (r10 != 1598968902) goto L18;
            r12.writeString("com.aide.engine.service.IEngineErrorListener");     // Catch: java.lang.Throwable -> L35
            return true;
        L18:
            return super.onTransact(r10, r11, r12, r13);
        }
    }

    void FH(java.lang.String r1);

    void OW();

    void QX(java.lang.String r1);

    void aj();

    void j6(java.lang.String r1, com.aide.engine.SyntaxError[] r2, boolean r3);
}
