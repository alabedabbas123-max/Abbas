package com.aide.engine.service;

public interface m extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class a extends android.os.Binder implements com.aide.engine.service.m {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0029a implements com.aide.engine.service.m {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = -855044220557622320L)
            private android.os.IBinder FH;

            static {
                abcd.wu.j6(com.aide.engine.service.m.a.C0029a.class, -7701921321901117432L, -7701921321901117432L);
            }

            @abcd.Interfacesu(method = 11157291841056480L)
            C0029a(android.os.IBinder r6) {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, -4260289474826492848L, null, r6);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-4260289474826492848L, null, r6);     // Catch: java.lang.Throwable -> L8
            L6:
                this.FH = r6;     // Catch: java.lang.Throwable -> L8
            }

            @Override
            @abcd.Interfacesu(method = -612027008429993275L)
            public void VH(boolean r7) {
            L17:
                th = move-exception;
                if (DW == false) goto L21;
                abcd.wu.j6(th, 2300038400124412545L, this, new java.lang.Boolean(r7));
            L21:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(2300038400124412545L, this, r7);     // Catch: java.lang.Throwable -> L17
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L17
                r2.writeInterfaceToken("com.aide.engine.service.IBuildListener");     // Catch: java.lang.Throwable -> L14
                if (r7 == false) goto L10;
                int r4 = 1;
            L11:
                r2.writeInt(r4);     // Catch: java.lang.Throwable -> L14
                this.FH.transact(1, r2, null, 1);     // Catch: java.lang.Throwable -> L14
                r2.recycle();     // Catch: java.lang.Throwable -> L17
                return;
            L10:
                r4 = 0;
            L14:
                th = move-exception;
                r2.recycle();     // Catch: java.lang.Throwable -> L17
                throw th;     // Catch: java.lang.Throwable -> L17
            }

            @Override
            @abcd.Interfacesu(method = -2835581724469952016L)
            public void Zo(java.lang.String r8) {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, 1886364467228981740L, this, r8);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(1886364467228981740L, this, r8);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.engine.service.IBuildListener");     // Catch: java.lang.Throwable -> L10
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
            @abcd.Interfacesu(method = -2917983221238082960L)
            public android.os.IBinder asBinder() {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, -2871415414103916128L, this);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-2871415414103916128L, this);     // Catch: java.lang.Throwable -> L8
            L6:
                return this.FH;
            }
        }

        static {
            abcd.wu.j6(com.aide.engine.service.m.a.class, 42054889497653200L, 42054889497653200L);
        }

        public a() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 60283444419976128L, null);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(60283444419976128L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            attachInterface(this, "com.aide.engine.service.IBuildListener");     // Catch: java.lang.Throwable -> L8
        }

        public static com.aide.engine.service.m j6(android.os.IBinder r5) {
        L16:
            th = move-exception;
            if (DW == false) goto L20;
            abcd.wu.j6(th, -1672377482009189835L, null, r5);
        L20:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1672377482009189835L, null, r5);     // Catch: java.lang.Throwable -> L16
        L6:
            if (r5 != null) goto L8;
            return null;
        L8:
            android.os.IInterface r3 = r5.queryLocalInterface("com.aide.engine.service.IBuildListener");     // Catch: java.lang.Throwable -> L16
            if (r3 == null) goto L15;
            if ((r3 instanceof com.aide.engine.service.m) == false) goto L15;
            return (com.aide.engine.service.m) r3;
        L15:
            return new com.aide.engine.service.m.a.C0029a(r5);
        }

        @Override
        public android.os.IBinder asBinder() {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -1429011944591335500L, this);
        L11:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1429011944591335500L, this);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        public boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
        L23:
            th = move-exception;
            if (DW == false) goto L27;
            abcd.wu.j6(th, 3833250558657145125L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
        L27:
            throw th;
        L3:
            if (j6 == false) goto L6;
            abcd.wu.j6(3833250558657145125L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L23
        L6:
            if (r10 != 1) goto L8;
            r11.enforceInterface("com.aide.engine.service.IBuildListener");     // Catch: java.lang.Throwable -> L23
            if (r11.readInt() == 0) goto L20;
            boolean r0 = true;
        L21:
            VH(r0);     // Catch: java.lang.Throwable -> L23
            return true;
        L20:
            r0 = false;
            goto L21
        L8:
            if (r10 != 2) goto L10;
            r11.enforceInterface("com.aide.engine.service.IBuildListener");     // Catch: java.lang.Throwable -> L23
            Zo(r11.readString());     // Catch: java.lang.Throwable -> L23
            return true;
        L10:
            if (r10 != 1598968902) goto L12;
            r12.writeString("com.aide.engine.service.IBuildListener");     // Catch: java.lang.Throwable -> L23
            return true;
        L12:
            return super.onTransact(r10, r11, r12, r13);
        }
    }

    void VH(boolean r1);

    void Zo(java.lang.String r1);
}
