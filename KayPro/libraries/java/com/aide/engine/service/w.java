package com.aide.engine.service;

public interface w extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class a extends android.os.Binder implements com.aide.engine.service.w {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0039a implements com.aide.engine.service.w {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = 440645001420732963L)
            private android.os.IBinder FH;

            static {
                abcd.wu.j6(com.aide.engine.service.w.a.C0039a.class, -4476126400412679180L, -4476126400412679180L);
            }

            @abcd.Interfacesu(method = 221330887697390567L)
            C0039a(android.os.IBinder r6) {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, -8092723588514761207L, null, r6);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-8092723588514761207L, null, r6);     // Catch: java.lang.Throwable -> L8
            L6:
                this.FH = r6;     // Catch: java.lang.Throwable -> L8
            }

            @Override
            @abcd.Interfacesu(method = 2362602607421474515L)
            public void DW(java.lang.String r8) {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, 4970186663013628353L, this, r8);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(4970186663013628353L, this, r8);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.engine.service.IUsageSearcherListener");     // Catch: java.lang.Throwable -> L10
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
            @abcd.Interfacesu(method = 1683629978818992961L)
            public android.os.IBinder asBinder() {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, 772441023226253679L, this);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(772441023226253679L, this);     // Catch: java.lang.Throwable -> L8
            L6:
                return this.FH;
            }

            @Override
            @abcd.Interfacesu(method = -1575129920923192653L)
            public void br() {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, 5114337826605890389L, this);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(5114337826605890389L, this);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.engine.service.IUsageSearcherListener");     // Catch: java.lang.Throwable -> L10
                this.FH.transact(1, r2, null, 1);     // Catch: java.lang.Throwable -> L10
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                return;
            L10:
                th = move-exception;
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                throw th;     // Catch: java.lang.Throwable -> L13
            }

            @Override
            @abcd.Interfacesu(method = -4463910579464058744L)
            public void j6(java.util.List r8) {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, 709124863180210800L, this, r8);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(709124863180210800L, this, r8);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.engine.service.IUsageSearcherListener");     // Catch: java.lang.Throwable -> L10
                r2.writeList(r8);     // Catch: java.lang.Throwable -> L10
                this.FH.transact(3, r2, null, 1);     // Catch: java.lang.Throwable -> L10
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                return;
            L10:
                th = move-exception;
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                throw th;     // Catch: java.lang.Throwable -> L13
            }
        }

        static {
            abcd.wu.j6(com.aide.engine.service.w.a.class, -193484794479097088L, -193484794479097088L);
        }

        public a() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 2283515085181683056L, null);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(2283515085181683056L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            attachInterface(this, "com.aide.engine.service.IUsageSearcherListener");     // Catch: java.lang.Throwable -> L8
        }

        public static com.aide.engine.service.w j6(android.os.IBinder r5) {
        L16:
            th = move-exception;
            if (DW == false) goto L20;
            abcd.wu.j6(th, 2225713306650070211L, null, r5);
        L20:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(2225713306650070211L, null, r5);     // Catch: java.lang.Throwable -> L16
        L6:
            if (r5 != null) goto L8;
            return null;
        L8:
            android.os.IInterface r3 = r5.queryLocalInterface("com.aide.engine.service.IUsageSearcherListener");     // Catch: java.lang.Throwable -> L16
            if (r3 == null) goto L15;
            if ((r3 instanceof com.aide.engine.service.w) == false) goto L15;
            return (com.aide.engine.service.w) r3;
        L15:
            return new com.aide.engine.service.w.a.C0039a(r5);
        }

        @Override
        public android.os.IBinder asBinder() {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -280908494185821744L, this);
        L11:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-280908494185821744L, this);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        public boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
        L23:
            th = move-exception;
            if (DW == false) goto L27;
            abcd.wu.j6(th, -1228455353449614485L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
        L27:
            throw th;
        L3:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1228455353449614485L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L23
        L6:
            if (r10 != 1) goto L8;
            r11.enforceInterface("com.aide.engine.service.IUsageSearcherListener");     // Catch: java.lang.Throwable -> L23
            br();     // Catch: java.lang.Throwable -> L23
            return true;
        L8:
            if (r10 != 2) goto L10;
            r11.enforceInterface("com.aide.engine.service.IUsageSearcherListener");     // Catch: java.lang.Throwable -> L23
            DW(r11.readString());     // Catch: java.lang.Throwable -> L23
            return true;
        L10:
            if (r10 != 3) goto L12;
            r11.enforceInterface("com.aide.engine.service.IUsageSearcherListener");     // Catch: java.lang.Throwable -> L23
            j6(r11.readArrayList(getClass().getClassLoader()));     // Catch: java.lang.Throwable -> L23
            return true;
        L12:
            if (r10 != 1598968902) goto L14;
            r12.writeString("com.aide.engine.service.IUsageSearcherListener");     // Catch: java.lang.Throwable -> L23
            return true;
        L14:
            return super.onTransact(r10, r11, r12, r13);
        }
    }

    void DW(java.lang.String r1);

    void br();

    void j6(java.util.List r1);
}
