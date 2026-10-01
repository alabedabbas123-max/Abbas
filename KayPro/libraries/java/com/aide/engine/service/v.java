package com.aide.engine.service;

public interface v extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class a extends android.os.Binder implements com.aide.engine.service.v {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0038a implements com.aide.engine.service.v {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = 3341512570716981968L)
            private android.os.IBinder FH;

            static {
                abcd.wu.j6(com.aide.engine.service.v.a.C0038a.class, -1102473383121745920L, -1102473383121745920L);
            }

            @abcd.Interfacesu(method = -4833581971097329940L)
            C0038a(android.os.IBinder r6) {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, -7158640056728647072L, null, r6);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-7158640056728647072L, null, r6);     // Catch: java.lang.Throwable -> L8
            L6:
                this.FH = r6;     // Catch: java.lang.Throwable -> L8
            }

            @Override
            @abcd.Interfacesu(method = 3714411328385176536L)
            public void DW(java.lang.String r8, java.util.List r9) {
            L12:
                th = move-exception;
                if (DW == false) goto L16;
                abcd.wu.j6(th, 553580164216378272L, this, r8, r9);
            L16:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(553580164216378272L, this, r8, r9);     // Catch: java.lang.Throwable -> L12
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L12
                r0.writeInterfaceToken("com.aide.engine.service.IRefactoringListener");     // Catch: java.lang.Throwable -> L9
                r0.writeString(r8);     // Catch: java.lang.Throwable -> L9
                r0.writeList(r9);     // Catch: java.lang.Throwable -> L9
                this.FH.transact(5, r0, null, 1);     // Catch: java.lang.Throwable -> L9
                r0.recycle();     // Catch: java.lang.Throwable -> L12
                return;
            L9:
                th = move-exception;
                r0.recycle();     // Catch: java.lang.Throwable -> L12
                throw th;     // Catch: java.lang.Throwable -> L12
            }

            @Override
            @abcd.Interfacesu(method = -1393948606313856012L)
            public void EQ(java.lang.String r8) {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, -1581275375509021236L, this, r8);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-1581275375509021236L, this, r8);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.engine.service.IRefactoringListener");     // Catch: java.lang.Throwable -> L10
                r2.writeString(r8);     // Catch: java.lang.Throwable -> L10
                this.FH.transact(3, r2, null, 1);     // Catch: java.lang.Throwable -> L10
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                return;
            L10:
                th = move-exception;
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                throw th;     // Catch: java.lang.Throwable -> L13
            }

            @Override
            @abcd.Interfacesu(method = -5654082607766963643L)
            public void FH(java.util.List r8) {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, 1742179796362269825L, this, r8);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(1742179796362269825L, this, r8);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.engine.service.IRefactoringListener");     // Catch: java.lang.Throwable -> L10
                r2.writeList(r8);     // Catch: java.lang.Throwable -> L10
                this.FH.transact(4, r2, null, 1);     // Catch: java.lang.Throwable -> L10
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                return;
            L10:
                th = move-exception;
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                throw th;     // Catch: java.lang.Throwable -> L13
            }

            @Override
            @abcd.Interfacesu(method = -4816670678697414355L)
            public void Hw(java.lang.String r8, java.lang.String r9) {
            L12:
                th = move-exception;
                if (DW == false) goto L16;
                abcd.wu.j6(th, 5021051135314615137L, this, r8, r9);
            L16:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(5021051135314615137L, this, r8, r9);     // Catch: java.lang.Throwable -> L12
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L12
                r0.writeInterfaceToken("com.aide.engine.service.IRefactoringListener");     // Catch: java.lang.Throwable -> L9
                r0.writeString(r8);     // Catch: java.lang.Throwable -> L9
                r0.writeString(r9);     // Catch: java.lang.Throwable -> L9
                this.FH.transact(2, r0, null, 1);     // Catch: java.lang.Throwable -> L9
                r0.recycle();     // Catch: java.lang.Throwable -> L12
                return;
            L9:
                th = move-exception;
                r0.recycle();     // Catch: java.lang.Throwable -> L12
                throw th;     // Catch: java.lang.Throwable -> L12
            }

            @Override
            @abcd.Interfacesu(method = 1506775518952083940L)
            public android.os.IBinder asBinder() {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, -1572903492858035700L, this);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-1572903492858035700L, this);     // Catch: java.lang.Throwable -> L8
            L6:
                return this.FH;
            }

            @Override
            @abcd.Interfacesu(method = -1775773780034920095L)
            public void j6(java.lang.String r8, java.util.Map r9) {
            L12:
                th = move-exception;
                if (DW == false) goto L16;
                abcd.wu.j6(th, 120805907345887581L, this, r8, r9);
            L16:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(120805907345887581L, this, r8, r9);     // Catch: java.lang.Throwable -> L12
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L12
                r0.writeInterfaceToken("com.aide.engine.service.IRefactoringListener");     // Catch: java.lang.Throwable -> L9
                r0.writeString(r8);     // Catch: java.lang.Throwable -> L9
                r0.writeMap(r9);     // Catch: java.lang.Throwable -> L9
                this.FH.transact(1, r0, null, 1);     // Catch: java.lang.Throwable -> L9
                r0.recycle();     // Catch: java.lang.Throwable -> L12
                return;
            L9:
                th = move-exception;
                r0.recycle();     // Catch: java.lang.Throwable -> L12
                throw th;     // Catch: java.lang.Throwable -> L12
            }
        }

        static {
            abcd.wu.j6(com.aide.engine.service.v.a.class, 6058896094762850756L, 6058896094762850756L);
        }

        public a() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 2107103695002231483L, null);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(2107103695002231483L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            attachInterface(this, "com.aide.engine.service.IRefactoringListener");     // Catch: java.lang.Throwable -> L8
        }

        public static com.aide.engine.service.v j6(android.os.IBinder r5) {
        L16:
            th = move-exception;
            if (DW == false) goto L20;
            abcd.wu.j6(th, -1222898294734820928L, null, r5);
        L20:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1222898294734820928L, null, r5);     // Catch: java.lang.Throwable -> L16
        L6:
            if (r5 != null) goto L8;
            return null;
        L8:
            android.os.IInterface r3 = r5.queryLocalInterface("com.aide.engine.service.IRefactoringListener");     // Catch: java.lang.Throwable -> L16
            if (r3 == null) goto L15;
            if ((r3 instanceof com.aide.engine.service.v) == false) goto L15;
            return (com.aide.engine.service.v) r3;
        L15:
            return new com.aide.engine.service.v.a.C0038a(r5);
        }

        @Override
        public android.os.IBinder asBinder() {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -1237220375280024497L, this);
        L11:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1237220375280024497L, this);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        public boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
        L31:
            th = move-exception;
            if (DW == false) goto L35;
            abcd.wu.j6(th, -128927002054936680L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
        L35:
            throw th;
        L3:
            if (j6 == false) goto L6;
            abcd.wu.j6(-128927002054936680L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L31
        L6:
            if (r10 != 1) goto L8;
            r11.enforceInterface("com.aide.engine.service.IRefactoringListener");     // Catch: java.lang.Throwable -> L31
            j6(r11.readString(), r11.readHashMap(getClass().getClassLoader()));     // Catch: java.lang.Throwable -> L31
            return true;
        L8:
            if (r10 != 2) goto L10;
            r11.enforceInterface("com.aide.engine.service.IRefactoringListener");     // Catch: java.lang.Throwable -> L31
            Hw(r11.readString(), r11.readString());     // Catch: java.lang.Throwable -> L31
            return true;
        L10:
            if (r10 != 3) goto L12;
            r11.enforceInterface("com.aide.engine.service.IRefactoringListener");     // Catch: java.lang.Throwable -> L31
            EQ(r11.readString());     // Catch: java.lang.Throwable -> L31
            return true;
        L12:
            if (r10 != 4) goto L14;
            r11.enforceInterface("com.aide.engine.service.IRefactoringListener");     // Catch: java.lang.Throwable -> L31
            FH(r11.readArrayList(getClass().getClassLoader()));     // Catch: java.lang.Throwable -> L31
            return true;
        L14:
            if (r10 != 5) goto L16;
            r11.enforceInterface("com.aide.engine.service.IRefactoringListener");     // Catch: java.lang.Throwable -> L31
            DW(r11.readString(), r11.readArrayList(getClass().getClassLoader()));     // Catch: java.lang.Throwable -> L31
            return true;
        L16:
            if (r10 != 1598968902) goto L18;
            r12.writeString("com.aide.engine.service.IRefactoringListener");     // Catch: java.lang.Throwable -> L31
            return true;
        L18:
            return super.onTransact(r10, r11, r12, r13);
        }
    }

    void DW(java.lang.String r1, java.util.List r2);

    void EQ(java.lang.String r1);

    void FH(java.util.List r1);

    void Hw(java.lang.String r1, java.lang.String r2);

    void j6(java.lang.String r1, java.util.Map r2);
}
