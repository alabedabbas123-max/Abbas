package com.android.vending.licensing;

public interface a extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class AbstractBinderC0055a extends android.os.Binder implements com.android.vending.licensing.a {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0056a implements com.android.vending.licensing.a {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = -2501176538321144145L)
            private android.os.IBinder FH;

            static {
                abcd.wu.j6(com.android.vending.licensing.a.AbstractBinderC0055a.C0056a.class, -516683162060558584L, -516683162060558584L);
            }

            @abcd.Interfacesu(method = 7205025289452609195L)
            C0056a(android.os.IBinder r6) {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, 2913681774118926924L, null, r6);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(2913681774118926924L, null, r6);     // Catch: java.lang.Throwable -> L8
            L6:
                this.FH = r6;     // Catch: java.lang.Throwable -> L8
            }

            @Override
            @abcd.Interfacesu(method = -2604152934726615987L)
            public android.os.IBinder asBinder() {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, 2378441031766153200L, this);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(2378441031766153200L, this);     // Catch: java.lang.Throwable -> L8
            L6:
                return this.FH;
            }
        }

        static {
            abcd.wu.j6(com.android.vending.licensing.a.AbstractBinderC0055a.class, -2158800655084182864L, -2158800655084182864L);
        }

        public AbstractBinderC0055a() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -1643658187290261800L, null);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1643658187290261800L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            attachInterface(this, "com.android.vending.licensing.ILicenseResultListener");     // Catch: java.lang.Throwable -> L8
        }

        public static com.android.vending.licensing.a j6(android.os.IBinder r5) {
        L16:
            th = move-exception;
            if (DW == false) goto L20;
            abcd.wu.j6(th, -1874819859482863925L, null, r5);
        L20:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1874819859482863925L, null, r5);     // Catch: java.lang.Throwable -> L16
        L6:
            if (r5 != null) goto L8;
            return null;
        L8:
            android.os.IInterface r3 = r5.queryLocalInterface("com.android.vending.licensing.ILicenseResultListener");     // Catch: java.lang.Throwable -> L16
            if (r3 == null) goto L15;
            if ((r3 instanceof com.android.vending.licensing.a) == false) goto L15;
            return (com.android.vending.licensing.a) r3;
        L15:
            return new com.android.vending.licensing.a.AbstractBinderC0055a.C0056a(r5);
        }

        @Override
        public android.os.IBinder asBinder() {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -1921090650901021320L, this);
        L11:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1921090650901021320L, this);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        public boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
        L15:
            th = move-exception;
            if (DW == false) goto L19;
            abcd.wu.j6(th, -953931718243797165L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
        L19:
            throw th;
        L3:
            if (j6 == false) goto L6;
            abcd.wu.j6(-953931718243797165L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L15
        L6:
            if (r10 != 1) goto L8;
            r11.enforceInterface("com.android.vending.licensing.ILicenseResultListener");     // Catch: java.lang.Throwable -> L15
            j6(r11.readInt(), r11.readString(), r11.readString());     // Catch: java.lang.Throwable -> L15
            return true;
        L8:
            if (r10 != 1598968902) goto L10;
            r12.writeString("com.android.vending.licensing.ILicenseResultListener");     // Catch: java.lang.Throwable -> L15
            return true;
        L10:
            return super.onTransact(r10, r11, r12, r13);
        }
    }

    void j6(int r1, java.lang.String r2, java.lang.String r3);
}
