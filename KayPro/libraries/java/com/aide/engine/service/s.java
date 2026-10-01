package com.aide.engine.service;

public interface s extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class a extends android.os.Binder implements com.aide.engine.service.s {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0035a implements com.aide.engine.service.s {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = -1495824422362306387L)
            private android.os.IBinder FH;

            static {
                abcd.wu.j6(com.aide.engine.service.s.a.C0035a.class, 3942163705457141568L, 3942163705457141568L);
            }

            @abcd.Interfacesu(method = 29365183006822557L)
            C0035a(android.os.IBinder r6) {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, 3250777090605377157L, null, r6);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(3250777090605377157L, null, r6);     // Catch: java.lang.Throwable -> L8
            L6:
                this.FH = r6;     // Catch: java.lang.Throwable -> L8
            }

            @Override
            @abcd.Interfacesu(method = -2388320162283844125L)
            public void DW(com.aide.engine.FileHighlightings r8) {
            L17:
                th = move-exception;
                if (DW == false) goto L21;
                abcd.wu.j6(th, -186412253288326429L, this, r8);
            L21:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-186412253288326429L, this, r8);     // Catch: java.lang.Throwable -> L17
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L17
                r2.writeInterfaceToken("com.aide.engine.service.IHighlightingListener");     // Catch: java.lang.Throwable -> L14
                if (r8 == null) goto L10;
                r2.writeInt(1);     // Catch: java.lang.Throwable -> L14
                r8.writeToParcel(r2, 0);     // Catch: java.lang.Throwable -> L14
            L11:
                this.FH.transact(2, r2, null, 1);     // Catch: java.lang.Throwable -> L14
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
            @abcd.Interfacesu(method = -2315648817761525845L)
            public android.os.IBinder asBinder() {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, 2675077546452466803L, this);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(2675077546452466803L, this);     // Catch: java.lang.Throwable -> L8
            L6:
                return this.FH;
            }

            @Override
            @abcd.Interfacesu(method = 1261223800204469472L)
            public void j6(com.aide.engine.FileHighlightings r7) {
            L17:
                th = move-exception;
                if (DW == false) goto L21;
                abcd.wu.j6(th, 1065997172123580224L, this, r7);
            L21:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(1065997172123580224L, this, r7);     // Catch: java.lang.Throwable -> L17
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L17
                r2.writeInterfaceToken("com.aide.engine.service.IHighlightingListener");     // Catch: java.lang.Throwable -> L14
                if (r7 == null) goto L10;
                r2.writeInt(1);     // Catch: java.lang.Throwable -> L14
                r7.writeToParcel(r2, 0);     // Catch: java.lang.Throwable -> L14
            L11:
                this.FH.transact(1, r2, null, 1);     // Catch: java.lang.Throwable -> L14
                r2.recycle();     // Catch: java.lang.Throwable -> L17
                return;
            L10:
                r2.writeInt(0);     // Catch: java.lang.Throwable -> L14
            L14:
                th = move-exception;
                r2.recycle();     // Catch: java.lang.Throwable -> L17
                throw th;     // Catch: java.lang.Throwable -> L17
            }
        }

        static {
            abcd.wu.j6(com.aide.engine.service.s.a.class, -957397753231774760L, -957397753231774760L);
        }

        public a() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 1326560728146564105L, null);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(1326560728146564105L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            attachInterface(this, "com.aide.engine.service.IHighlightingListener");     // Catch: java.lang.Throwable -> L8
        }

        public static com.aide.engine.service.s j6(android.os.IBinder r5) {
        L16:
            th = move-exception;
            if (DW == false) goto L20;
            abcd.wu.j6(th, -819741945735097924L, null, r5);
        L20:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-819741945735097924L, null, r5);     // Catch: java.lang.Throwable -> L16
        L6:
            if (r5 != null) goto L8;
            return null;
        L8:
            android.os.IInterface r3 = r5.queryLocalInterface("com.aide.engine.service.IHighlightingListener");     // Catch: java.lang.Throwable -> L16
            if (r3 == null) goto L15;
            if ((r3 instanceof com.aide.engine.service.s) == false) goto L15;
            return (com.aide.engine.service.s) r3;
        L15:
            return new com.aide.engine.service.s.a.C0035a(r5);
        }

        @Override
        public android.os.IBinder asBinder() {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -2000415084153274839L, this);
        L11:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-2000415084153274839L, this);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        public boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
        L25:
            th = move-exception;
            if (DW == false) goto L29;
            abcd.wu.j6(th, -764330066633289156L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
        L29:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-764330066633289156L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L25
        L5:
            com.aide.engine.FileHighlightings r1 = null;
            if (r10 != 1) goto L8;
            r11.enforceInterface("com.aide.engine.service.IHighlightingListener");     // Catch: java.lang.Throwable -> L25
            if (r11.readInt() == 0) goto L23;
            r1 = com.aide.engine.FileHighlightings.CREATOR.createFromParcel(r11);     // Catch: java.lang.Throwable -> L25
        L23:
            j6(r1);     // Catch: java.lang.Throwable -> L25
            return true;
        L8:
            if (r10 != 2) goto L10;
            r11.enforceInterface("com.aide.engine.service.IHighlightingListener");     // Catch: java.lang.Throwable -> L25
            if (r11.readInt() == 0) goto L18;
            r1 = com.aide.engine.FileHighlightings.CREATOR.createFromParcel(r11);     // Catch: java.lang.Throwable -> L25
        L18:
            DW(r1);     // Catch: java.lang.Throwable -> L25
            return true;
        L10:
            if (r10 != 1598968902) goto L12;
            r12.writeString("com.aide.engine.service.IHighlightingListener");     // Catch: java.lang.Throwable -> L25
            return true;
        L12:
            return super.onTransact(r10, r11, r12, r13);
        }
    }

    void DW(com.aide.engine.FileHighlightings r1);

    void j6(com.aide.engine.FileHighlightings r1);
}
