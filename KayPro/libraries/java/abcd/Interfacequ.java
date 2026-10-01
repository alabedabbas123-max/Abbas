package abcd;

public interface Interfacequ extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class a extends android.os.Binder implements abcd.Interfacequ {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0009a implements abcd.Interfacequ {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = 637299904492232739L)
            private android.os.IBinder FH;

            static {
                abcd.wu.j6(abcd.Interfacequ.a.C0009a.class, -3246313755302159025L, -3246313755302159025L);
            }

            @abcd.Interfacesu(method = 339824878835178633L)
            C0009a(android.os.IBinder r6) {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, -3984050193026269929L, null, r6);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-3984050193026269929L, null, r6);     // Catch: java.lang.Throwable -> L8
            L6:
                this.FH = r6;     // Catch: java.lang.Throwable -> L8
            }

            @Override
            @abcd.Interfacesu(method = 373120001563025179L)
            public int DW(int r9, java.lang.String r10, java.lang.String r11) {
            L12:
                th = move-exception;
                if (DW == false) goto L16;
                abcd.wu.j6(th, -1430035560932947011L, this, new java.lang.Integer(r9), r10, r11);
            L16:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(-1430035560932947011L, this, new java.lang.Integer(r9), r10, r11);     // Catch: java.lang.Throwable -> L12
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L12
                android.os.Parcel r1 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L12
                r0.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");     // Catch: java.lang.Throwable -> L9
                r0.writeInt(r9);     // Catch: java.lang.Throwable -> L9
                r0.writeString(r10);     // Catch: java.lang.Throwable -> L9
                r0.writeString(r11);     // Catch: java.lang.Throwable -> L9
                this.FH.transact(1, r0, r1, 0);     // Catch: java.lang.Throwable -> L9
                r1.readException();     // Catch: java.lang.Throwable -> L9
                int r2 = r1.readInt();     // Catch: java.lang.Throwable -> L9
                r1.recycle();     // Catch: java.lang.Throwable -> L12
                r0.recycle();     // Catch: java.lang.Throwable -> L12
                return r2;
            L9:
                th = move-exception;
                r1.recycle();     // Catch: java.lang.Throwable -> L12
                r0.recycle();     // Catch: java.lang.Throwable -> L12
                throw th;     // Catch: java.lang.Throwable -> L12
            }

            @Override
            @abcd.Interfacesu(method = -1333327835991438945L)
            public android.os.IBinder asBinder() {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, 985196878152980857L, this);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(985196878152980857L, this);     // Catch: java.lang.Throwable -> L8
            L6:
                return this.FH;
            }

            @Override
            @abcd.Interfacesu(method = 454445442190761085L)
            public android.os.Bundle j6(int r10, java.lang.String r11, java.lang.String r12, android.os.Bundle r13) {
            L20:
                th = move-exception;
                if (DW == false) goto L24;
                abcd.wu.j6(th, 2788033300916228943L, this, new java.lang.Integer(r10), r11, r12, r13);
            L24:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(2788033300916228943L, this, new java.lang.Integer(r10), r11, r12, r13);     // Catch: java.lang.Throwable -> L20
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L20
                android.os.Parcel r1 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L20
                r0.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");     // Catch: java.lang.Throwable -> L17
                r0.writeInt(r10);     // Catch: java.lang.Throwable -> L17
                r0.writeString(r11);     // Catch: java.lang.Throwable -> L17
                r0.writeString(r12);     // Catch: java.lang.Throwable -> L17
                if (r13 == null) goto L9;
                r0.writeInt(1);     // Catch: java.lang.Throwable -> L17
                r13.writeToParcel(r0, 0);     // Catch: java.lang.Throwable -> L17
            L10:
                this.FH.transact(2, r0, r1, 0);     // Catch: java.lang.Throwable -> L17
                r1.readException();     // Catch: java.lang.Throwable -> L17
                if (r1.readInt() == 0) goto L14;
                android.os.Bundle r2 = (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(r1);     // Catch: java.lang.Throwable -> L17
            L15:
                r1.recycle();     // Catch: java.lang.Throwable -> L20
                r0.recycle();     // Catch: java.lang.Throwable -> L20
                return r2;
            L14:
                r2 = null;
                goto L15
            L9:
                r0.writeInt(0);     // Catch: java.lang.Throwable -> L17
            L17:
                th = move-exception;
                r1.recycle();     // Catch: java.lang.Throwable -> L20
                r0.recycle();     // Catch: java.lang.Throwable -> L20
                throw th;     // Catch: java.lang.Throwable -> L20
            }

            @Override
            @abcd.Interfacesu(method = 605798833788045180L)
            public android.os.Bundle j6(int r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
            L16:
                th = move-exception;
                if (DW == false) goto L20;
                abcd.wu.j6(th, 4572400297559653816L, this, new java.lang.Integer(r10), r11, r12, r13);
            L20:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(4572400297559653816L, this, new java.lang.Integer(r10), r11, r12, r13);     // Catch: java.lang.Throwable -> L16
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L16
                android.os.Parcel r1 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L16
                r0.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");     // Catch: java.lang.Throwable -> L13
                r0.writeInt(r10);     // Catch: java.lang.Throwable -> L13
                r0.writeString(r11);     // Catch: java.lang.Throwable -> L13
                r0.writeString(r12);     // Catch: java.lang.Throwable -> L13
                r0.writeString(r13);     // Catch: java.lang.Throwable -> L13
                this.FH.transact(4, r0, r1, 0);     // Catch: java.lang.Throwable -> L13
                r1.readException();     // Catch: java.lang.Throwable -> L13
                if (r1.readInt() == 0) goto L10;
                android.os.Bundle r2 = (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(r1);     // Catch: java.lang.Throwable -> L13
            L11:
                r1.recycle();     // Catch: java.lang.Throwable -> L16
                r0.recycle();     // Catch: java.lang.Throwable -> L16
                return r2;
            L10:
                r2 = null;
            L13:
                th = move-exception;
                r1.recycle();     // Catch: java.lang.Throwable -> L16
                r0.recycle();     // Catch: java.lang.Throwable -> L16
                throw th;     // Catch: java.lang.Throwable -> L16
            }

            @Override
            @abcd.Interfacesu(method = 615297442634898888L)
            public android.os.Bundle j6(int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
            L16:
                th = move-exception;
                if (DW == false) goto L20;
                abcd.wu.j6(th, 80786183475723264L, this, new java.lang.Integer(r11), r12, r13, r14, r15);
            L20:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(80786183475723264L, this, new java.lang.Integer(r11), r12, r13, r14, r15);     // Catch: java.lang.Throwable -> L16
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L16
                android.os.Parcel r1 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L16
                r0.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");     // Catch: java.lang.Throwable -> L13
                r0.writeInt(r11);     // Catch: java.lang.Throwable -> L13
                r0.writeString(r12);     // Catch: java.lang.Throwable -> L13
                r0.writeString(r13);     // Catch: java.lang.Throwable -> L13
                r0.writeString(r14);     // Catch: java.lang.Throwable -> L13
                r0.writeString(r15);     // Catch: java.lang.Throwable -> L13
                this.FH.transact(3, r0, r1, 0);     // Catch: java.lang.Throwable -> L13
                r1.readException();     // Catch: java.lang.Throwable -> L13
                if (r1.readInt() == 0) goto L10;
                android.os.Bundle r2 = (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(r1);     // Catch: java.lang.Throwable -> L13
            L11:
                r1.recycle();     // Catch: java.lang.Throwable -> L16
                r0.recycle();     // Catch: java.lang.Throwable -> L16
                return r2;
            L10:
                r2 = null;
            L13:
                th = move-exception;
                r1.recycle();     // Catch: java.lang.Throwable -> L16
                r0.recycle();     // Catch: java.lang.Throwable -> L16
                throw th;     // Catch: java.lang.Throwable -> L16
            }
        }

        static {
            abcd.wu.j6(abcd.Interfacequ.a.class, 1855388491450205747L, 1855388491450205747L);
        }

        public a() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -595119342766648068L, null);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-595119342766648068L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            attachInterface(this, "com.android.vending.billing.IInAppBillingService");     // Catch: java.lang.Throwable -> L8
        }

        public static abcd.Interfacequ j6(android.os.IBinder r5) {
        L16:
            th = move-exception;
            if (DW == false) goto L20;
            abcd.wu.j6(th, -1841173601391953959L, null, r5);
        L20:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1841173601391953959L, null, r5);     // Catch: java.lang.Throwable -> L16
        L6:
            if (r5 != null) goto L8;
            return null;
        L8:
            android.os.IInterface r3 = r5.queryLocalInterface("com.android.vending.billing.IInAppBillingService");     // Catch: java.lang.Throwable -> L16
            if (r3 == null) goto L15;
            if ((r3 instanceof abcd.Interfacequ) == false) goto L15;
            return (abcd.Interfacequ) r3;
        L15:
            return new abcd.Interfacequ.a.C0009a(r5);
        }

        @Override
        public android.os.IBinder asBinder() {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 835517997437111808L, this);
        L11:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(835517997437111808L, this);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        public boolean onTransact(int r11, android.os.Parcel r12, android.os.Parcel r13, int r14) {
        L44:
            th = move-exception;
            if (DW == false) goto L48;
            abcd.wu.j6(th, -857228719526856519L, this, new java.lang.Integer(r11), r12, r13, new java.lang.Integer(r14));
        L48:
            throw th;
        L3:
            if (j6 == false) goto L6;
            abcd.wu.j6(-857228719526856519L, this, new java.lang.Integer(r11), r12, r13, new java.lang.Integer(r14));     // Catch: java.lang.Throwable -> L44
        L6:
            if (r11 != 1) goto L8;
            r12.enforceInterface("com.android.vending.billing.IInAppBillingService");     // Catch: java.lang.Throwable -> L44
            int r0 = DW(r12.readInt(), r12.readString(), r12.readString());     // Catch: java.lang.Throwable -> L44
            r13.writeNoException();     // Catch: java.lang.Throwable -> L44
            r13.writeInt(r0);     // Catch: java.lang.Throwable -> L44
            return true;
        L8:
            if (r11 != 2) goto L10;
            r12.enforceInterface("com.android.vending.billing.IInAppBillingService");     // Catch: java.lang.Throwable -> L44
            int r1 = r12.readInt();     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = r12.readString();     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = r12.readString();     // Catch: java.lang.Throwable -> L44
            if (r12.readInt() == 0) goto L36;
            android.os.Bundle r5 = (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(r12);     // Catch: java.lang.Throwable -> L44
        L37:
            android.os.Bundle r3 = j6(r1, r2, r4, r5);     // Catch: java.lang.Throwable -> L44
            r13.writeNoException();     // Catch: java.lang.Throwable -> L44
            if (r3 == null) goto L40;
            r13.writeInt(1);     // Catch: java.lang.Throwable -> L44
            r3.writeToParcel(r13, 1);     // Catch: java.lang.Throwable -> L44
        L41:
            return true;
        L40:
            r13.writeInt(0);     // Catch: java.lang.Throwable -> L44
            goto L41
        L36:
            r5 = null;
            goto L37
        L10:
            if (r11 != 3) goto L12;
            r12.enforceInterface("com.android.vending.billing.IInAppBillingService");     // Catch: java.lang.Throwable -> L44
            android.os.Bundle r6 = j6(r12.readInt(), r12.readString(), r12.readString(), r12.readString(), r12.readString());     // Catch: java.lang.Throwable -> L44
            r13.writeNoException();     // Catch: java.lang.Throwable -> L44
            if (r6 == null) goto L31;
            r13.writeInt(1);     // Catch: java.lang.Throwable -> L44
            r6.writeToParcel(r13, 1);     // Catch: java.lang.Throwable -> L44
        L32:
            return true;
        L31:
            r13.writeInt(0);     // Catch: java.lang.Throwable -> L44
            goto L32
        L12:
            if (r11 != 4) goto L14;
            r12.enforceInterface("com.android.vending.billing.IInAppBillingService");     // Catch: java.lang.Throwable -> L44
            android.os.Bundle r7 = j6(r12.readInt(), r12.readString(), r12.readString(), r12.readString());     // Catch: java.lang.Throwable -> L44
            r13.writeNoException();     // Catch: java.lang.Throwable -> L44
            if (r7 == null) goto L26;
            r13.writeInt(1);     // Catch: java.lang.Throwable -> L44
            r7.writeToParcel(r13, 1);     // Catch: java.lang.Throwable -> L44
        L27:
            return true;
        L26:
            r13.writeInt(0);     // Catch: java.lang.Throwable -> L44
            goto L27
        L14:
            if (r11 != 5) goto L16;
            r12.enforceInterface("com.android.vending.billing.IInAppBillingService");     // Catch: java.lang.Throwable -> L44
            int r8 = FH(r12.readInt(), r12.readString(), r12.readString());     // Catch: java.lang.Throwable -> L44
            r13.writeNoException();     // Catch: java.lang.Throwable -> L44
            r13.writeInt(r8);     // Catch: java.lang.Throwable -> L44
            return true;
        L16:
            if (r11 != 1598968902) goto L18;
            r13.writeString("com.android.vending.billing.IInAppBillingService");     // Catch: java.lang.Throwable -> L44
            return true;
        L18:
            return super.onTransact(r11, r12, r13, r14);
        }
    }

    int DW(int r1, java.lang.String r2, java.lang.String r3);

    int FH(int r1, java.lang.String r2, java.lang.String r3);

    android.os.Bundle j6(int r1, java.lang.String r2, java.lang.String r3, android.os.Bundle r4);

    android.os.Bundle j6(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4);

    android.os.Bundle j6(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5);
}
