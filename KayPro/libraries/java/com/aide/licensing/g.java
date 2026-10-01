package com.aide.licensing;

public interface g extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class a extends android.os.Binder implements com.aide.licensing.g {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0041a implements com.aide.licensing.g {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = 2295843943274912331L)
            private android.os.IBinder FH;

            static {
                abcd.wu.j6(com.aide.licensing.g.a.C0041a.class, 751097897065273040L, 751097897065273040L);
            }

            @abcd.Interfacesu(method = -7548162181567425L)
            C0041a(android.os.IBinder r6) {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, 6294207598877460800L, null, r6);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(6294207598877460800L, null, r6);     // Catch: java.lang.Throwable -> L8
            L6:
                this.FH = r6;     // Catch: java.lang.Throwable -> L8
            }

            @Override
            @abcd.Interfacesu(method = 240365471563008L)
            public void DW(java.lang.String r8, java.lang.String r9) {
            L12:
                th = move-exception;
                if (DW == false) goto L16;
                abcd.wu.j6(th, 2328196462604452517L, this, r8, r9);
            L16:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(2328196462604452517L, this, r8, r9);     // Catch: java.lang.Throwable -> L12
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L12
                r0.writeInterfaceToken("com.aide.licensing.IAideLicenseResultListener");     // Catch: java.lang.Throwable -> L9
                r0.writeString(r8);     // Catch: java.lang.Throwable -> L9
                r0.writeString(r9);     // Catch: java.lang.Throwable -> L9
                this.FH.transact(1, r0, null, 1);     // Catch: java.lang.Throwable -> L9
                r0.recycle();     // Catch: java.lang.Throwable -> L12
                return;
            L9:
                th = move-exception;
                r0.recycle();     // Catch: java.lang.Throwable -> L12
                throw th;     // Catch: java.lang.Throwable -> L12
            }

            @Override
            @abcd.Interfacesu(method = -3796475522516180679L)
            public void XX() {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, -3336263415191374080L, this);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-3336263415191374080L, this);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.licensing.IAideLicenseResultListener");     // Catch: java.lang.Throwable -> L10
                this.FH.transact(2, r2, null, 1);     // Catch: java.lang.Throwable -> L10
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                return;
            L10:
                th = move-exception;
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                throw th;     // Catch: java.lang.Throwable -> L13
            }

            @Override
            @abcd.Interfacesu(method = 2603411948178788985L)
            public android.os.IBinder asBinder() {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, -2718163765906975772L, this);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-2718163765906975772L, this);     // Catch: java.lang.Throwable -> L8
            L6:
                return this.FH;
            }
        }

        static {
            abcd.wu.j6(com.aide.licensing.g.a.class, -5985881983238788440L, -5985881983238788440L);
        }

        public a() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -2176589666740543085L, null);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-2176589666740543085L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            attachInterface(this, "com.aide.licensing.IAideLicenseResultListener");     // Catch: java.lang.Throwable -> L8
        }

        public static com.aide.licensing.g j6(android.os.IBinder r5) {
        L16:
            th = move-exception;
            if (DW == false) goto L20;
            abcd.wu.j6(th, 821252303183318344L, null, r5);
        L20:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(821252303183318344L, null, r5);     // Catch: java.lang.Throwable -> L16
        L6:
            if (r5 != null) goto L8;
            return null;
        L8:
            android.os.IInterface r3 = r5.queryLocalInterface("com.aide.licensing.IAideLicenseResultListener");     // Catch: java.lang.Throwable -> L16
            if (r3 == null) goto L15;
            if ((r3 instanceof com.aide.licensing.g) == false) goto L15;
            return (com.aide.licensing.g) r3;
        L15:
            return new com.aide.licensing.g.a.C0041a(r5);
        }

        @Override
        public android.os.IBinder asBinder() {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 9885819474567175L, this);
        L11:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(9885819474567175L, this);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        public boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
        L19:
            th = move-exception;
            if (DW == false) goto L23;
            abcd.wu.j6(th, -61049034201290112L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
        L23:
            throw th;
        L3:
            if (j6 == false) goto L6;
            abcd.wu.j6(-61049034201290112L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L19
        L6:
            if (r10 != 1) goto L8;
            r11.enforceInterface("com.aide.licensing.IAideLicenseResultListener");     // Catch: java.lang.Throwable -> L19
            DW(r11.readString(), r11.readString());     // Catch: java.lang.Throwable -> L19
            return true;
        L8:
            if (r10 != 2) goto L10;
            r11.enforceInterface("com.aide.licensing.IAideLicenseResultListener");     // Catch: java.lang.Throwable -> L19
            XX();     // Catch: java.lang.Throwable -> L19
            return true;
        L10:
            if (r10 != 1598968902) goto L12;
            r12.writeString("com.aide.licensing.IAideLicenseResultListener");     // Catch: java.lang.Throwable -> L19
            return true;
        L12:
            return super.onTransact(r10, r11, r12, r13);
        }
    }

    void DW(java.lang.String r1, java.lang.String r2);

    void XX();
}
