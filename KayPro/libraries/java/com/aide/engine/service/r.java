package com.aide.engine.service;

public interface r extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class a extends android.os.Binder implements com.aide.engine.service.r {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0034a implements com.aide.engine.service.r {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = -2417446358511725216L)
            private android.os.IBinder FH;

            static {
                abcd.wu.j6(com.aide.engine.service.r.a.C0034a.class, -643888408847959233L, -643888408847959233L);
            }

            @abcd.Interfacesu(method = 111498619484119724L)
            C0034a(android.os.IBinder r6) {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, 3330003692273104080L, null, r6);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(3330003692273104080L, null, r6);     // Catch: java.lang.Throwable -> L8
            L6:
                this.FH = r6;     // Catch: java.lang.Throwable -> L8
            }

            @Override
            @abcd.Interfacesu(method = 1896903829601581752L)
            public void Hw(java.lang.String r7) {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, 1329847116551799360L, this, r7);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(1329847116551799360L, this, r7);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.engine.service.IGotoSymbolListener");     // Catch: java.lang.Throwable -> L10
                r2.writeString(r7);     // Catch: java.lang.Throwable -> L10
                this.FH.transact(1, r2, null, 1);     // Catch: java.lang.Throwable -> L10
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                return;
            L10:
                th = move-exception;
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                throw th;     // Catch: java.lang.Throwable -> L13
            }

            @Override
            @abcd.Interfacesu(method = -2796069372734088828L)
            public android.os.IBinder asBinder() {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, 1691597199840509780L, this);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(1691597199840509780L, this);     // Catch: java.lang.Throwable -> L8
            L6:
                return this.FH;
            }

            @Override
            @abcd.Interfacesu(method = -776096382883761173L)
            public void j6(com.aide.engine.SourceEntity r8) {
            L17:
                th = move-exception;
                if (DW == false) goto L21;
                abcd.wu.j6(th, 254188330020171955L, this, r8);
            L21:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(254188330020171955L, this, r8);     // Catch: java.lang.Throwable -> L17
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L17
                r2.writeInterfaceToken("com.aide.engine.service.IGotoSymbolListener");     // Catch: java.lang.Throwable -> L14
                if (r8 == null) goto L10;
                r2.writeInt(1);     // Catch: java.lang.Throwable -> L14
                r8.writeToParcel(r2, 0);     // Catch: java.lang.Throwable -> L14
            L11:
                this.FH.transact(3, r2, null, 1);     // Catch: java.lang.Throwable -> L14
                r2.recycle();     // Catch: java.lang.Throwable -> L17
                return;
            L10:
                r2.writeInt(0);     // Catch: java.lang.Throwable -> L14
            L14:
                th = move-exception;
                r2.recycle();     // Catch: java.lang.Throwable -> L17
                throw th;     // Catch: java.lang.Throwable -> L17
            }

            @Override
            @abcd.Interfacesu(method = 2262297566307829600L)
            public void j6(java.lang.String r8, java.util.List r9) {
            L12:
                th = move-exception;
                if (DW == false) goto L16;
                abcd.wu.j6(th, -737003469818683872L, this, r8, r9);
            L16:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(-737003469818683872L, this, r8, r9);     // Catch: java.lang.Throwable -> L12
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L12
                r0.writeInterfaceToken("com.aide.engine.service.IGotoSymbolListener");     // Catch: java.lang.Throwable -> L9
                r0.writeString(r8);     // Catch: java.lang.Throwable -> L9
                r0.writeList(r9);     // Catch: java.lang.Throwable -> L9
                this.FH.transact(2, r0, null, 1);     // Catch: java.lang.Throwable -> L9
                r0.recycle();     // Catch: java.lang.Throwable -> L12
                return;
            L9:
                th = move-exception;
                r0.recycle();     // Catch: java.lang.Throwable -> L12
                throw th;     // Catch: java.lang.Throwable -> L12
            }
        }

        static {
            abcd.wu.j6(com.aide.engine.service.r.a.class, -3113482997274709725L, -3113482997274709725L);
        }

        public a() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 1885388106895399385L, null);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(1885388106895399385L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            attachInterface(this, "com.aide.engine.service.IGotoSymbolListener");     // Catch: java.lang.Throwable -> L8
        }

        public static com.aide.engine.service.r j6(android.os.IBinder r5) {
        L16:
            th = move-exception;
            if (DW == false) goto L20;
            abcd.wu.j6(th, -2097897098667510432L, null, r5);
        L20:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-2097897098667510432L, null, r5);     // Catch: java.lang.Throwable -> L16
        L6:
            if (r5 != null) goto L8;
            return null;
        L8:
            android.os.IInterface r3 = r5.queryLocalInterface("com.aide.engine.service.IGotoSymbolListener");     // Catch: java.lang.Throwable -> L16
            if (r3 == null) goto L15;
            if ((r3 instanceof com.aide.engine.service.r) == false) goto L15;
            return (com.aide.engine.service.r) r3;
        L15:
            return new com.aide.engine.service.r.a.C0034a(r5);
        }

        @Override
        public android.os.IBinder asBinder() {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 1893979369021430977L, this);
        L11:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(1893979369021430977L, this);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        public boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
        L27:
            th = move-exception;
            if (DW == false) goto L31;
            abcd.wu.j6(th, 747518924153604416L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
        L31:
            throw th;
        L3:
            if (j6 == false) goto L6;
            abcd.wu.j6(747518924153604416L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L27
        L6:
            if (r10 != 1) goto L8;
            r11.enforceInterface("com.aide.engine.service.IGotoSymbolListener");     // Catch: java.lang.Throwable -> L27
            Hw(r11.readString());     // Catch: java.lang.Throwable -> L27
            return true;
        L8:
            if (r10 != 2) goto L10;
            r11.enforceInterface("com.aide.engine.service.IGotoSymbolListener");     // Catch: java.lang.Throwable -> L27
            j6(r11.readString(), r11.readArrayList(getClass().getClassLoader()));     // Catch: java.lang.Throwable -> L27
            return true;
        L10:
            if (r10 != 3) goto L12;
            r11.enforceInterface("com.aide.engine.service.IGotoSymbolListener");     // Catch: java.lang.Throwable -> L27
            if (r11.readInt() == 0) goto L20;
            com.aide.engine.SourceEntity r0 = com.aide.engine.SourceEntity.CREATOR.createFromParcel(r11);     // Catch: java.lang.Throwable -> L27
        L21:
            j6(r0);     // Catch: java.lang.Throwable -> L27
            return true;
        L20:
            r0 = null;
            goto L21
        L12:
            if (r10 != 1598968902) goto L14;
            r12.writeString("com.aide.engine.service.IGotoSymbolListener");     // Catch: java.lang.Throwable -> L27
            return true;
        L14:
            return super.onTransact(r10, r11, r12, r13);
        }
    }

    void Hw(java.lang.String r1);

    void j6(com.aide.engine.SourceEntity r1);

    void j6(java.lang.String r1, java.util.List r2);
}
