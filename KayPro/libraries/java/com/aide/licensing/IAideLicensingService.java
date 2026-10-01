package com.aide.licensing;

public interface IAideLicensingService extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class a extends android.os.Binder implements com.aide.licensing.IAideLicensingService {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0040a implements com.aide.licensing.IAideLicensingService {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = -1496202259372163420L)
            private android.os.IBinder FH;

            static {
                abcd.wu.j6(com.aide.licensing.IAideLicensingService.a.C0040a.class, -52803688757817099L, -52803688757817099L);
            }

            @abcd.Interfacesu(method = 214791276070036352L)
            C0040a(android.os.IBinder r6) {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, 7479934523988355568L, null, r6);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(7479934523988355568L, null, r6);     // Catch: java.lang.Throwable -> L8
            L6:
                this.FH = r6;     // Catch: java.lang.Throwable -> L8
            }

            @Override
            @abcd.Interfacesu(method = -1288829665065207296L)
            public android.os.IBinder asBinder() {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, -2062018006717991520L, this);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-2062018006717991520L, this);     // Catch: java.lang.Throwable -> L8
            L6:
                return this.FH;
            }

            @Override
            @abcd.Interfacesu(method = -3221642907797117304L)
            public void j6(com.aide.licensing.g r7) {
            L17:
                th = move-exception;
                if (DW == false) goto L21;
                abcd.wu.j6(th, 2458534097119865916L, this, r7);
            L21:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(2458534097119865916L, this, r7);     // Catch: java.lang.Throwable -> L17
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L17
                r2.writeInterfaceToken("com.aide.licensing.IAideLicensingService");     // Catch: java.lang.Throwable -> L14
                if (r7 == null) goto L10;
                android.os.IBinder r4 = r7.asBinder();     // Catch: java.lang.Throwable -> L14
            L11:
                r2.writeStrongBinder(r4);     // Catch: java.lang.Throwable -> L14
                this.FH.transact(1, r2, null, 1);     // Catch: java.lang.Throwable -> L14
                r2.recycle();     // Catch: java.lang.Throwable -> L17
                return;
            L10:
                r4 = null;
            L14:
                th = move-exception;
                r2.recycle();     // Catch: java.lang.Throwable -> L17
                throw th;     // Catch: java.lang.Throwable -> L17
            }
        }

        static {
            abcd.wu.j6(com.aide.licensing.IAideLicensingService.a.class, 2299737887176419429L, 2299737887176419429L);
        }

        public a() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -211999893636556831L, null);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-211999893636556831L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            attachInterface(this, "com.aide.licensing.IAideLicensingService");     // Catch: java.lang.Throwable -> L8
        }

        public static com.aide.licensing.IAideLicensingService j6(android.os.IBinder r5) {
        L16:
            th = move-exception;
            if (DW == false) goto L20;
            abcd.wu.j6(th, -1552962901620419764L, null, r5);
        L20:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1552962901620419764L, null, r5);     // Catch: java.lang.Throwable -> L16
        L6:
            if (r5 != null) goto L8;
            return null;
        L8:
            android.os.IInterface r3 = r5.queryLocalInterface("com.aide.licensing.IAideLicensingService");     // Catch: java.lang.Throwable -> L16
            if (r3 == null) goto L15;
            if ((r3 instanceof com.aide.licensing.IAideLicensingService) == false) goto L15;
            return (com.aide.licensing.IAideLicensingService) r3;
        L15:
            return new com.aide.licensing.IAideLicensingService.a.C0040a(r5);
        }

        @Override
        public android.os.IBinder asBinder() {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 3280691021500539441L, this);
        L11:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(3280691021500539441L, this);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        public boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
        L15:
            th = move-exception;
            if (DW == false) goto L19;
            abcd.wu.j6(th, 984240657325753452L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
        L19:
            throw th;
        L3:
            if (j6 == false) goto L6;
            abcd.wu.j6(984240657325753452L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L15
        L6:
            if (r10 != 1) goto L8;
            r11.enforceInterface("com.aide.licensing.IAideLicensingService");     // Catch: java.lang.Throwable -> L15
            j6(com.aide.licensing.g.a.j6(r11.readStrongBinder()));     // Catch: java.lang.Throwable -> L15
            return true;
        L8:
            if (r10 != 1598968902) goto L10;
            r12.writeString("com.aide.licensing.IAideLicensingService");     // Catch: java.lang.Throwable -> L15
            return true;
        L10:
            return super.onTransact(r10, r11, r12, r13);
        }
    }

    void j6(com.aide.licensing.g r1);
}
