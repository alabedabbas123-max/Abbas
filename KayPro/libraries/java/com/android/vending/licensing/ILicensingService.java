package com.android.vending.licensing;

public interface ILicensingService extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class a extends android.os.Binder implements com.android.vending.licensing.ILicensingService {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0054a implements com.android.vending.licensing.ILicensingService {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = -804649032323297808L)
            private android.os.IBinder FH;

            static {
                abcd.wu.j6(com.android.vending.licensing.ILicensingService.a.C0054a.class, 950796445825987797L, 950796445825987797L);
            }

            @abcd.Interfacesu(method = -66415307568857500L)
            C0054a(android.os.IBinder r6) {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, 2735950639407038599L, null, r6);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(2735950639407038599L, null, r6);     // Catch: java.lang.Throwable -> L8
            L6:
                this.FH = r6;     // Catch: java.lang.Throwable -> L8
            }

            @Override
            @abcd.Interfacesu(method = -1580931935414461172L)
            public android.os.IBinder asBinder() {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, 1976967346172450505L, this);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(1976967346172450505L, this);     // Catch: java.lang.Throwable -> L8
            L6:
                return this.FH;
            }

            @Override
            @abcd.Interfacesu(method = 467867295480740175L)
            public void j6(long r9, java.lang.String r11, com.android.vending.licensing.a r12) {
            L16:
                th = move-exception;
                if (DW == false) goto L20;
                abcd.wu.j6(th, -3064570666234928224L, this, new java.lang.Long(r9), r11, r12);
            L20:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(-3064570666234928224L, this, new java.lang.Long(r9), r11, r12);     // Catch: java.lang.Throwable -> L16
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L16
                r0.writeInterfaceToken("com.android.vending.licensing.ILicensingService");     // Catch: java.lang.Throwable -> L13
                r0.writeLong(r9);     // Catch: java.lang.Throwable -> L13
                r0.writeString(r11);     // Catch: java.lang.Throwable -> L13
                if (r12 == null) goto L9;
                android.os.IBinder r2 = r12.asBinder();     // Catch: java.lang.Throwable -> L13
            L10:
                r0.writeStrongBinder(r2);     // Catch: java.lang.Throwable -> L13
                this.FH.transact(1, r0, null, 1);     // Catch: java.lang.Throwable -> L13
                r0.recycle();     // Catch: java.lang.Throwable -> L16
                return;
            L9:
                r2 = null;
            L13:
                th = move-exception;
                r0.recycle();     // Catch: java.lang.Throwable -> L16
                throw th;     // Catch: java.lang.Throwable -> L16
            }
        }

        static {
            abcd.wu.j6(com.android.vending.licensing.ILicensingService.a.class, -523287074831529595L, -523287074831529595L);
        }

        public a() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -1814264660613683604L, null);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1814264660613683604L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            attachInterface(this, "com.android.vending.licensing.ILicensingService");     // Catch: java.lang.Throwable -> L8
        }

        public static com.android.vending.licensing.ILicensingService j6(android.os.IBinder r5) {
        L16:
            th = move-exception;
            if (DW == false) goto L20;
            abcd.wu.j6(th, -1860534859620897279L, null, r5);
        L20:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1860534859620897279L, null, r5);     // Catch: java.lang.Throwable -> L16
        L6:
            if (r5 != null) goto L8;
            return null;
        L8:
            android.os.IInterface r3 = r5.queryLocalInterface("com.android.vending.licensing.ILicensingService");     // Catch: java.lang.Throwable -> L16
            if (r3 == null) goto L15;
            if ((r3 instanceof com.android.vending.licensing.ILicensingService) == false) goto L15;
            return (com.android.vending.licensing.ILicensingService) r3;
        L15:
            return new com.android.vending.licensing.ILicensingService.a.C0054a(r5);
        }

        @Override
        public android.os.IBinder asBinder() {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 2277020459729407392L, this);
        L11:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(2277020459729407392L, this);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        public boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
        L15:
            th = move-exception;
            if (DW == false) goto L19;
            abcd.wu.j6(th, 742440474434070625L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
        L19:
            throw th;
        L3:
            if (j6 == false) goto L6;
            abcd.wu.j6(742440474434070625L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L15
        L6:
            if (r10 != 1) goto L8;
            r11.enforceInterface("com.android.vending.licensing.ILicensingService");     // Catch: java.lang.Throwable -> L15
            j6(r11.readLong(), r11.readString(), com.android.vending.licensing.a.AbstractBinderC0055a.j6(r11.readStrongBinder()));     // Catch: java.lang.Throwable -> L15
            return true;
        L8:
            if (r10 != 1598968902) goto L10;
            r12.writeString("com.android.vending.licensing.ILicensingService");     // Catch: java.lang.Throwable -> L15
            return true;
        L10:
            return super.onTransact(r10, r11, r12, r13);
        }
    }

    void j6(long r1, java.lang.String r3, com.android.vending.licensing.a r4);
}
