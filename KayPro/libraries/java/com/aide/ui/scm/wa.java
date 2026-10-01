package com.aide.ui.scm;

public interface wa extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class a extends android.os.Binder implements com.aide.ui.scm.wa {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0051a implements com.aide.ui.scm.wa {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = -2312851552959990945L)
            private android.os.IBinder FH;

            static {
                abcd.wu.j6(com.aide.ui.scm.wa.a.C0051a.class, -2389402995206386800L, -2389402995206386800L);
            }

            @abcd.Interfacesu(method = 38070869662587483L)
            C0051a(android.os.IBinder r6) {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, 7649806317760715019L, null, r6);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(7649806317760715019L, null, r6);     // Catch: java.lang.Throwable -> L8
            L6:
                this.FH = r6;     // Catch: java.lang.Throwable -> L8
            }

            @Override
            @abcd.Interfacesu(method = 1643801893365046937L)
            public com.aide.ui.scm.GitStatus DW(java.lang.String r8, com.aide.ui.scm.xa r9) {
            L18:
                th = move-exception;
                if (DW == false) goto L22;
                abcd.wu.j6(th, -1809365635902785955L, this, r8, r9);
            L22:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(-1809365635902785955L, this, r8, r9);     // Catch: java.lang.Throwable -> L18
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L18
                android.os.Parcel r1 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L18
                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L15
                r0.writeString(r8);     // Catch: java.lang.Throwable -> L15
                com.aide.ui.scm.GitStatus r2 = null;
                if (r9 == null) goto L9;
                android.os.IBinder r3 = r9.asBinder();     // Catch: java.lang.Throwable -> L15
            L10:
                r0.writeStrongBinder(r3);     // Catch: java.lang.Throwable -> L15
                this.FH.transact(5, r0, r1, 0);     // Catch: java.lang.Throwable -> L15
                r1.readException();     // Catch: java.lang.Throwable -> L15
                if (r1.readInt() == 0) goto L13;
                r2 = com.aide.ui.scm.GitStatus.CREATOR.createFromParcel(r1);     // Catch: java.lang.Throwable -> L15
            L13:
                r1.recycle();     // Catch: java.lang.Throwable -> L18
                r0.recycle();     // Catch: java.lang.Throwable -> L18
                return r2;
            L9:
                r3 = null;
            L15:
                th = move-exception;
                r1.recycle();     // Catch: java.lang.Throwable -> L18
                r0.recycle();     // Catch: java.lang.Throwable -> L18
                throw th;     // Catch: java.lang.Throwable -> L18
            }

            @Override
            @abcd.Interfacesu(method = -749150668582516093L)
            public java.lang.String DW(java.lang.String r9, java.lang.String r10, com.aide.ui.scm.xa r11) {
            L16:
                th = move-exception;
                if (DW == false) goto L20;
                abcd.wu.j6(th, 4264474588894135359L, this, r9, r10, r11);
            L20:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(4264474588894135359L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L16
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L16
                android.os.Parcel r1 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L16
                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L13
                r0.writeString(r9);     // Catch: java.lang.Throwable -> L13
                r0.writeString(r10);     // Catch: java.lang.Throwable -> L13
                if (r11 == null) goto L9;
                android.os.IBinder r2 = r11.asBinder();     // Catch: java.lang.Throwable -> L13
            L10:
                r0.writeStrongBinder(r2);     // Catch: java.lang.Throwable -> L13
                this.FH.transact(8, r0, r1, 0);     // Catch: java.lang.Throwable -> L13
                r1.readException();     // Catch: java.lang.Throwable -> L13
                java.lang.String r3 = r1.readString();     // Catch: java.lang.Throwable -> L13
                r1.recycle();     // Catch: java.lang.Throwable -> L16
                r0.recycle();     // Catch: java.lang.Throwable -> L16
                return r3;
            L9:
                r2 = null;
            L13:
                th = move-exception;
                r1.recycle();     // Catch: java.lang.Throwable -> L16
                r0.recycle();     // Catch: java.lang.Throwable -> L16
                throw th;     // Catch: java.lang.Throwable -> L16
            }

            @Override
            @abcd.Interfacesu(method = -959563003649174660L)
            public void DW(com.aide.ui.scm.GitConfiguration r9, java.lang.String r10, com.aide.ui.scm.xa r11) {
            L20:
                th = move-exception;
                if (DW == false) goto L24;
                abcd.wu.j6(th, 319902406830217908L, this, r9, r10, r11);
            L24:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(319902406830217908L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L20
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L20
                android.os.Parcel r1 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L20
                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L17
                if (r9 == null) goto L9;
                r0.writeInt(1);     // Catch: java.lang.Throwable -> L17
                r9.writeToParcel(r0, 0);     // Catch: java.lang.Throwable -> L17
            L10:
                r0.writeString(r10);     // Catch: java.lang.Throwable -> L17
                if (r11 == null) goto L13;
                android.os.IBinder r3 = r11.asBinder();     // Catch: java.lang.Throwable -> L17
            L14:
                r0.writeStrongBinder(r3);     // Catch: java.lang.Throwable -> L17
                this.FH.transact(3, r0, r1, 0);     // Catch: java.lang.Throwable -> L17
                r1.readException();     // Catch: java.lang.Throwable -> L17
                r1.recycle();     // Catch: java.lang.Throwable -> L20
                r0.recycle();     // Catch: java.lang.Throwable -> L20
                return;
            L13:
                r3 = null;
                goto L14
            L9:
                r0.writeInt(0);     // Catch: java.lang.Throwable -> L17
            L17:
                th = move-exception;
                r1.recycle();     // Catch: java.lang.Throwable -> L20
                r0.recycle();     // Catch: java.lang.Throwable -> L20
                throw th;     // Catch: java.lang.Throwable -> L20
            }

            @Override
            @abcd.Interfacesu(method = -3900999530318109915L)
            public java.util.List<java.lang.String> FH(java.lang.String r8, com.aide.ui.scm.xa r9) {
            L16:
                th = move-exception;
                if (DW == false) goto L20;
                abcd.wu.j6(th, 1814645037757693665L, this, r8, r9);
            L20:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(1814645037757693665L, this, r8, r9);     // Catch: java.lang.Throwable -> L16
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L16
                android.os.Parcel r1 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L16
                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L13
                r0.writeString(r8);     // Catch: java.lang.Throwable -> L13
                if (r9 == null) goto L9;
                android.os.IBinder r2 = r9.asBinder();     // Catch: java.lang.Throwable -> L13
            L10:
                r0.writeStrongBinder(r2);     // Catch: java.lang.Throwable -> L13
                this.FH.transact(10, r0, r1, 0);     // Catch: java.lang.Throwable -> L13
                r1.readException();     // Catch: java.lang.Throwable -> L13
                java.util.ArrayList<java.lang.String> r3 = r1.createStringArrayList();     // Catch: java.lang.Throwable -> L13
                r1.recycle();     // Catch: java.lang.Throwable -> L16
                r0.recycle();     // Catch: java.lang.Throwable -> L16
                return r3;
            L9:
                r2 = null;
            L13:
                th = move-exception;
                r1.recycle();     // Catch: java.lang.Throwable -> L16
                r0.recycle();     // Catch: java.lang.Throwable -> L16
                throw th;     // Catch: java.lang.Throwable -> L16
            }

            @Override
            @abcd.Interfacesu(method = -1959386449490710305L)
            public void FH(java.lang.String r9, java.lang.String r10, com.aide.ui.scm.xa r11) {
            L16:
                th = move-exception;
                if (DW == false) goto L20;
                abcd.wu.j6(th, 2354652673308857915L, this, r9, r10, r11);
            L20:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(2354652673308857915L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L16
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L16
                android.os.Parcel r1 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L16
                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L13
                r0.writeString(r9);     // Catch: java.lang.Throwable -> L13
                r0.writeString(r10);     // Catch: java.lang.Throwable -> L13
                if (r11 == null) goto L9;
                android.os.IBinder r2 = r11.asBinder();     // Catch: java.lang.Throwable -> L13
            L10:
                r0.writeStrongBinder(r2);     // Catch: java.lang.Throwable -> L13
                this.FH.transact(11, r0, r1, 0);     // Catch: java.lang.Throwable -> L13
                r1.readException();     // Catch: java.lang.Throwable -> L13
                r1.recycle();     // Catch: java.lang.Throwable -> L16
                r0.recycle();     // Catch: java.lang.Throwable -> L16
                return;
            L9:
                r2 = null;
            L13:
                th = move-exception;
                r1.recycle();     // Catch: java.lang.Throwable -> L16
                r0.recycle();     // Catch: java.lang.Throwable -> L16
                throw th;     // Catch: java.lang.Throwable -> L16
            }

            @Override
            @abcd.Interfacesu(method = -731555501591008680L)
            public void Hw(java.lang.String r9, java.lang.String r10, com.aide.ui.scm.xa r11) {
            L16:
                th = move-exception;
                if (DW == false) goto L20;
                abcd.wu.j6(th, 303983472959727848L, this, r9, r10, r11);
            L20:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(303983472959727848L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L16
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L16
                android.os.Parcel r1 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L16
                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L13
                r0.writeString(r9);     // Catch: java.lang.Throwable -> L13
                r0.writeString(r10);     // Catch: java.lang.Throwable -> L13
                if (r11 == null) goto L9;
                android.os.IBinder r2 = r11.asBinder();     // Catch: java.lang.Throwable -> L13
            L10:
                r0.writeStrongBinder(r2);     // Catch: java.lang.Throwable -> L13
                this.FH.transact(14, r0, r1, 0);     // Catch: java.lang.Throwable -> L13
                r1.readException();     // Catch: java.lang.Throwable -> L13
                r1.recycle();     // Catch: java.lang.Throwable -> L16
                r0.recycle();     // Catch: java.lang.Throwable -> L16
                return;
            L9:
                r2 = null;
            L13:
                th = move-exception;
                r1.recycle();     // Catch: java.lang.Throwable -> L16
                r0.recycle();     // Catch: java.lang.Throwable -> L16
                throw th;     // Catch: java.lang.Throwable -> L16
            }

            @Override
            @abcd.Interfacesu(method = 568813924485905517L)
            public android.os.IBinder asBinder() {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, -3648047990704426287L, this);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-3648047990704426287L, this);     // Catch: java.lang.Throwable -> L8
            L6:
                return this.FH;
            }

            @Override
            @abcd.Interfacesu(method = 2176902323237025313L)
            public void cancel() {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, 862614032023307533L, this);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(862614032023307533L, this);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L10
                this.FH.transact(15, r2, null, 1);     // Catch: java.lang.Throwable -> L10
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                return;
            L10:
                th = move-exception;
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                throw th;     // Catch: java.lang.Throwable -> L13
            }

            @Override
            @abcd.Interfacesu(method = 44652222642869856L)
            public java.lang.String j6(java.lang.String r8, com.aide.ui.scm.xa r9) {
            L16:
                th = move-exception;
                if (DW == false) goto L20;
                abcd.wu.j6(th, 6066178735860375888L, this, r8, r9);
            L20:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(6066178735860375888L, this, r8, r9);     // Catch: java.lang.Throwable -> L16
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L16
                android.os.Parcel r1 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L16
                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L13
                r0.writeString(r8);     // Catch: java.lang.Throwable -> L13
                if (r9 == null) goto L9;
                android.os.IBinder r2 = r9.asBinder();     // Catch: java.lang.Throwable -> L13
            L10:
                r0.writeStrongBinder(r2);     // Catch: java.lang.Throwable -> L13
                this.FH.transact(9, r0, r1, 0);     // Catch: java.lang.Throwable -> L13
                r1.readException();     // Catch: java.lang.Throwable -> L13
                java.lang.String r3 = r1.readString();     // Catch: java.lang.Throwable -> L13
                r1.recycle();     // Catch: java.lang.Throwable -> L16
                r0.recycle();     // Catch: java.lang.Throwable -> L16
                return r3;
            L9:
                r2 = null;
            L13:
                th = move-exception;
                r1.recycle();     // Catch: java.lang.Throwable -> L16
                r0.recycle();     // Catch: java.lang.Throwable -> L16
                throw th;     // Catch: java.lang.Throwable -> L16
            }

            @Override
            @abcd.Interfacesu(method = -975106165460335091L)
            public void j6(com.aide.ui.scm.GitConfiguration r9, java.lang.String r10, com.aide.ui.scm.xa r11) {
            L20:
                th = move-exception;
                if (DW == false) goto L24;
                abcd.wu.j6(th, 339097764690690233L, this, r9, r10, r11);
            L24:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(339097764690690233L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L20
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L20
                android.os.Parcel r1 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L20
                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L17
                if (r9 == null) goto L9;
                r0.writeInt(1);     // Catch: java.lang.Throwable -> L17
                r9.writeToParcel(r0, 0);     // Catch: java.lang.Throwable -> L17
            L10:
                r0.writeString(r10);     // Catch: java.lang.Throwable -> L17
                if (r11 == null) goto L13;
                android.os.IBinder r3 = r11.asBinder();     // Catch: java.lang.Throwable -> L17
            L14:
                r0.writeStrongBinder(r3);     // Catch: java.lang.Throwable -> L17
                this.FH.transact(4, r0, r1, 0);     // Catch: java.lang.Throwable -> L17
                r1.readException();     // Catch: java.lang.Throwable -> L17
                r1.recycle();     // Catch: java.lang.Throwable -> L20
                r0.recycle();     // Catch: java.lang.Throwable -> L20
                return;
            L13:
                r3 = null;
                goto L14
            L9:
                r0.writeInt(0);     // Catch: java.lang.Throwable -> L17
            L17:
                th = move-exception;
                r1.recycle();     // Catch: java.lang.Throwable -> L20
                r0.recycle();     // Catch: java.lang.Throwable -> L20
                throw th;     // Catch: java.lang.Throwable -> L20
            }

            @Override
            @abcd.Interfacesu(method = -1304555658830415576L)
            public void j6(com.aide.ui.scm.GitConfiguration r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, com.aide.ui.scm.xa r15) {
            L20:
                th = move-exception;
                if (DW == false) goto L24;
                abcd.wu.j6(th, 451734090950425536L, this, r11, r12, r13, r14, r15);
            L24:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(451734090950425536L, this, r11, r12, r13, r14, r15);     // Catch: java.lang.Throwable -> L20
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L20
                android.os.Parcel r1 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L20
                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L17
                if (r11 == null) goto L9;
                r0.writeInt(1);     // Catch: java.lang.Throwable -> L17
                r11.writeToParcel(r0, 0);     // Catch: java.lang.Throwable -> L17
            L10:
                r0.writeString(r12);     // Catch: java.lang.Throwable -> L17
                r0.writeString(r13);     // Catch: java.lang.Throwable -> L17
                r0.writeString(r14);     // Catch: java.lang.Throwable -> L17
                if (r15 == null) goto L13;
                android.os.IBinder r4 = r15.asBinder();     // Catch: java.lang.Throwable -> L17
            L14:
                r0.writeStrongBinder(r4);     // Catch: java.lang.Throwable -> L17
                this.FH.transact(1, r0, r1, 0);     // Catch: java.lang.Throwable -> L17
                r1.readException();     // Catch: java.lang.Throwable -> L17
                r1.recycle();     // Catch: java.lang.Throwable -> L20
                r0.recycle();     // Catch: java.lang.Throwable -> L20
                return;
            L13:
                r4 = null;
                goto L14
            L9:
                r0.writeInt(0);     // Catch: java.lang.Throwable -> L17
            L17:
                th = move-exception;
                r1.recycle();     // Catch: java.lang.Throwable -> L20
                r0.recycle();     // Catch: java.lang.Throwable -> L20
                throw th;     // Catch: java.lang.Throwable -> L20
            }

            @Override
            @abcd.Interfacesu(method = 907746355328607735L)
            public void j6(com.aide.ui.scm.GitConfiguration r11, java.lang.String r12, java.lang.String r13, java.util.List<java.lang.String> r14, com.aide.ui.scm.xa r15) {
            L20:
                th = move-exception;
                if (DW == false) goto L24;
                abcd.wu.j6(th, 2639055885049139339L, this, r11, r12, r13, r14, r15);
            L24:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(2639055885049139339L, this, r11, r12, r13, r14, r15);     // Catch: java.lang.Throwable -> L20
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L20
                android.os.Parcel r1 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L20
                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L17
                if (r11 == null) goto L9;
                r0.writeInt(1);     // Catch: java.lang.Throwable -> L17
                r11.writeToParcel(r0, 0);     // Catch: java.lang.Throwable -> L17
            L10:
                r0.writeString(r12);     // Catch: java.lang.Throwable -> L17
                r0.writeString(r13);     // Catch: java.lang.Throwable -> L17
                r0.writeStringList(r14);     // Catch: java.lang.Throwable -> L17
                if (r15 == null) goto L13;
                android.os.IBinder r3 = r15.asBinder();     // Catch: java.lang.Throwable -> L17
            L14:
                r0.writeStrongBinder(r3);     // Catch: java.lang.Throwable -> L17
                this.FH.transact(2, r0, r1, 0);     // Catch: java.lang.Throwable -> L17
                r1.readException();     // Catch: java.lang.Throwable -> L17
                r1.recycle();     // Catch: java.lang.Throwable -> L20
                r0.recycle();     // Catch: java.lang.Throwable -> L20
                return;
            L13:
                r3 = null;
                goto L14
            L9:
                r0.writeInt(0);     // Catch: java.lang.Throwable -> L17
            L17:
                th = move-exception;
                r1.recycle();     // Catch: java.lang.Throwable -> L20
                r0.recycle();     // Catch: java.lang.Throwable -> L20
                throw th;     // Catch: java.lang.Throwable -> L20
            }

            @Override
            @abcd.Interfacesu(method = 3248068969645957680L)
            public void j6(com.aide.ui.scm.GitConfiguration r11, java.lang.String r12, java.util.List<com.aide.ui.scm.ModifiedFile> r13, java.lang.String r14, com.aide.ui.scm.xa r15) {
            L20:
                th = move-exception;
                if (DW == false) goto L24;
                abcd.wu.j6(th, -6149407163406511400L, this, r11, r12, r13, r14, r15);
            L24:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(-6149407163406511400L, this, r11, r12, r13, r14, r15);     // Catch: java.lang.Throwable -> L20
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L20
                android.os.Parcel r1 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L20
                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L17
                if (r11 == null) goto L9;
                r0.writeInt(1);     // Catch: java.lang.Throwable -> L17
                r11.writeToParcel(r0, 0);     // Catch: java.lang.Throwable -> L17
            L10:
                r0.writeString(r12);     // Catch: java.lang.Throwable -> L17
                r0.writeTypedList(r13);     // Catch: java.lang.Throwable -> L17
                r0.writeString(r14);     // Catch: java.lang.Throwable -> L17
                if (r15 == null) goto L13;
                android.os.IBinder r3 = r15.asBinder();     // Catch: java.lang.Throwable -> L17
            L14:
                r0.writeStrongBinder(r3);     // Catch: java.lang.Throwable -> L17
                this.FH.transact(6, r0, r1, 0);     // Catch: java.lang.Throwable -> L17
                r1.readException();     // Catch: java.lang.Throwable -> L17
                r1.recycle();     // Catch: java.lang.Throwable -> L20
                r0.recycle();     // Catch: java.lang.Throwable -> L20
                return;
            L13:
                r3 = null;
                goto L14
            L9:
                r0.writeInt(0);     // Catch: java.lang.Throwable -> L17
            L17:
                th = move-exception;
                r1.recycle();     // Catch: java.lang.Throwable -> L20
                r0.recycle();     // Catch: java.lang.Throwable -> L20
                throw th;     // Catch: java.lang.Throwable -> L20
            }

            @Override
            @abcd.Interfacesu(method = -2577002191322722905L)
            public void j6(java.lang.String r9, java.lang.String r10, com.aide.ui.scm.xa r11) {
            L16:
                th = move-exception;
                if (DW == false) goto L20;
                abcd.wu.j6(th, -6551050206396694749L, this, r9, r10, r11);
            L20:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(-6551050206396694749L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L16
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L16
                android.os.Parcel r1 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L16
                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L13
                r0.writeString(r9);     // Catch: java.lang.Throwable -> L13
                r0.writeString(r10);     // Catch: java.lang.Throwable -> L13
                if (r11 == null) goto L9;
                android.os.IBinder r2 = r11.asBinder();     // Catch: java.lang.Throwable -> L13
            L10:
                r0.writeStrongBinder(r2);     // Catch: java.lang.Throwable -> L13
                this.FH.transact(13, r0, r1, 0);     // Catch: java.lang.Throwable -> L13
                r1.readException();     // Catch: java.lang.Throwable -> L13
                r1.recycle();     // Catch: java.lang.Throwable -> L16
                r0.recycle();     // Catch: java.lang.Throwable -> L16
                return;
            L9:
                r2 = null;
            L13:
                th = move-exception;
                r1.recycle();     // Catch: java.lang.Throwable -> L16
                r0.recycle();     // Catch: java.lang.Throwable -> L16
                throw th;     // Catch: java.lang.Throwable -> L16
            }

            @Override
            @abcd.Interfacesu(method = -6668198295154216236L)
            public void j6(java.lang.String r10, java.lang.String r11, java.lang.String r12, com.aide.ui.scm.xa r13) {
            L16:
                th = move-exception;
                if (DW == false) goto L20;
                abcd.wu.j6(th, 3120820564058405052L, this, r10, r11, r12, r13);
            L20:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(3120820564058405052L, this, r10, r11, r12, r13);     // Catch: java.lang.Throwable -> L16
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L16
                android.os.Parcel r1 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L16
                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L13
                r0.writeString(r10);     // Catch: java.lang.Throwable -> L13
                r0.writeString(r11);     // Catch: java.lang.Throwable -> L13
                r0.writeString(r12);     // Catch: java.lang.Throwable -> L13
                if (r13 == null) goto L9;
                android.os.IBinder r2 = r13.asBinder();     // Catch: java.lang.Throwable -> L13
            L10:
                r0.writeStrongBinder(r2);     // Catch: java.lang.Throwable -> L13
                this.FH.transact(12, r0, r1, 0);     // Catch: java.lang.Throwable -> L13
                r1.readException();     // Catch: java.lang.Throwable -> L13
                r1.recycle();     // Catch: java.lang.Throwable -> L16
                r0.recycle();     // Catch: java.lang.Throwable -> L16
                return;
            L9:
                r2 = null;
            L13:
                th = move-exception;
                r1.recycle();     // Catch: java.lang.Throwable -> L16
                r0.recycle();     // Catch: java.lang.Throwable -> L16
                throw th;     // Catch: java.lang.Throwable -> L16
            }

            @Override
            @abcd.Interfacesu(method = 819729935401472465L)
            public void j6(java.lang.String r9, java.util.List<com.aide.ui.scm.ModifiedFile> r10, com.aide.ui.scm.xa r11) {
            L16:
                th = move-exception;
                if (DW == false) goto L20;
                abcd.wu.j6(th, -976418872392589067L, this, r9, r10, r11);
            L20:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(-976418872392589067L, this, r9, r10, r11);     // Catch: java.lang.Throwable -> L16
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L16
                android.os.Parcel r1 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L16
                r0.writeInterfaceToken("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L13
                r0.writeString(r9);     // Catch: java.lang.Throwable -> L13
                r0.writeTypedList(r10);     // Catch: java.lang.Throwable -> L13
                if (r11 == null) goto L9;
                android.os.IBinder r2 = r11.asBinder();     // Catch: java.lang.Throwable -> L13
            L10:
                r0.writeStrongBinder(r2);     // Catch: java.lang.Throwable -> L13
                this.FH.transact(7, r0, r1, 0);     // Catch: java.lang.Throwable -> L13
                r1.readException();     // Catch: java.lang.Throwable -> L13
                r1.recycle();     // Catch: java.lang.Throwable -> L16
                r0.recycle();     // Catch: java.lang.Throwable -> L16
                return;
            L9:
                r2 = null;
            L13:
                th = move-exception;
                r1.recycle();     // Catch: java.lang.Throwable -> L16
                r0.recycle();     // Catch: java.lang.Throwable -> L16
                throw th;     // Catch: java.lang.Throwable -> L16
            }
        }

        static {
            abcd.wu.j6(com.aide.ui.scm.wa.a.class, -92320889473643040L, -92320889473643040L);
        }

        public a() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -1351505026707989059L, null);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1351505026707989059L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            attachInterface(this, "com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L8
        }

        public static com.aide.ui.scm.wa j6(android.os.IBinder r5) {
        L16:
            th = move-exception;
            if (DW == false) goto L20;
            abcd.wu.j6(th, -278794636847752284L, null, r5);
        L20:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-278794636847752284L, null, r5);     // Catch: java.lang.Throwable -> L16
        L6:
            if (r5 != null) goto L8;
            return null;
        L8:
            android.os.IInterface r3 = r5.queryLocalInterface("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L16
            if (r3 == null) goto L15;
            if ((r3 instanceof com.aide.ui.scm.wa) == false) goto L15;
            return (com.aide.ui.scm.wa) r3;
        L15:
            return new com.aide.ui.scm.wa.a.C0051a(r5);
        }

        @Override
        public android.os.IBinder asBinder() {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 1406788449176987749L, this);
        L11:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(1406788449176987749L, this);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        public boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
        L61:
            th = move-exception;
            if (DW == false) goto L65;
            abcd.wu.j6(th, -225619656116507084L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));
        L65:
            throw th;
        L3:
            if (j6 == false) goto L6;
            abcd.wu.j6(-225619656116507084L, this, new java.lang.Integer(r10), r11, r12, new java.lang.Integer(r13));     // Catch: java.lang.Throwable -> L61
        L6:
            if (r10 == 1598968902) goto L59;
            com.aide.ui.scm.GitConfiguration r1 = null;
            switch(r10) {
                case 1: goto L54;
                case 2: goto L49;
                case 3: goto L44;
                case 4: goto L39;
                case 5: goto L34;
                case 6: goto L29;
                case 7: goto L27;
                case 8: goto L25;
                case 9: goto L23;
                case 10: goto L21;
                case 11: goto L19;
                case 12: goto L17;
                case 13: goto L15;
                case 14: goto L13;
                case 15: goto L11;
                default: goto L10;
            };     // Catch: java.lang.Throwable -> L61
        L11:
            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L61
            cancel();     // Catch: java.lang.Throwable -> L61
            return true;
        L13:
            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L61
            Hw(r11.readString(), r11.readString(), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));     // Catch: java.lang.Throwable -> L61
            r12.writeNoException();     // Catch: java.lang.Throwable -> L61
            return true;
        L15:
            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L61
            j6(r11.readString(), r11.readString(), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));     // Catch: java.lang.Throwable -> L61
            r12.writeNoException();     // Catch: java.lang.Throwable -> L61
            return true;
        L17:
            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L61
            j6(r11.readString(), r11.readString(), r11.readString(), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));     // Catch: java.lang.Throwable -> L61
            r12.writeNoException();     // Catch: java.lang.Throwable -> L61
            return true;
        L19:
            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L61
            FH(r11.readString(), r11.readString(), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));     // Catch: java.lang.Throwable -> L61
            r12.writeNoException();     // Catch: java.lang.Throwable -> L61
            return true;
        L21:
            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L61
            java.util.List<java.lang.String> r0 = FH(r11.readString(), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));     // Catch: java.lang.Throwable -> L61
            r12.writeNoException();     // Catch: java.lang.Throwable -> L61
            r12.writeStringList(r0);     // Catch: java.lang.Throwable -> L61
            return true;
        L23:
            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L61
            java.lang.String r2 = j6(r11.readString(), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));     // Catch: java.lang.Throwable -> L61
            r12.writeNoException();     // Catch: java.lang.Throwable -> L61
            r12.writeString(r2);     // Catch: java.lang.Throwable -> L61
            return true;
        L25:
            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = DW(r11.readString(), r11.readString(), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));     // Catch: java.lang.Throwable -> L61
            r12.writeNoException();     // Catch: java.lang.Throwable -> L61
            r12.writeString(r3);     // Catch: java.lang.Throwable -> L61
            return true;
        L27:
            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L61
            j6(r11.readString(), r11.createTypedArrayList(com.aide.ui.scm.ModifiedFile.CREATOR), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));     // Catch: java.lang.Throwable -> L61
            r12.writeNoException();     // Catch: java.lang.Throwable -> L61
            return true;
        L29:
            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L61
            if (r11.readInt() == 0) goto L32;
            r1 = com.aide.ui.scm.GitConfiguration.CREATOR.createFromParcel(r11);     // Catch: java.lang.Throwable -> L61
        L32:
            j6(r1, r11.readString(), r11.createTypedArrayList(com.aide.ui.scm.ModifiedFile.CREATOR), r11.readString(), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));     // Catch: java.lang.Throwable -> L61
            r12.writeNoException();     // Catch: java.lang.Throwable -> L61
            return true;
        L34:
            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L61
            com.aide.ui.scm.GitStatus r4 = DW(r11.readString(), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));     // Catch: java.lang.Throwable -> L61
            r12.writeNoException();     // Catch: java.lang.Throwable -> L61
            if (r4 == null) goto L37;
            r12.writeInt(1);     // Catch: java.lang.Throwable -> L61
            r4.writeToParcel(r12, 1);     // Catch: java.lang.Throwable -> L61
        L38:
            return true;
        L37:
            r12.writeInt(0);     // Catch: java.lang.Throwable -> L61
            goto L38
        L39:
            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L61
            if (r11.readInt() == 0) goto L42;
            r1 = com.aide.ui.scm.GitConfiguration.CREATOR.createFromParcel(r11);     // Catch: java.lang.Throwable -> L61
        L42:
            j6(r1, r11.readString(), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));     // Catch: java.lang.Throwable -> L61
            r12.writeNoException();     // Catch: java.lang.Throwable -> L61
            return true;
        L44:
            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L61
            if (r11.readInt() == 0) goto L47;
            r1 = com.aide.ui.scm.GitConfiguration.CREATOR.createFromParcel(r11);     // Catch: java.lang.Throwable -> L61
        L47:
            DW(r1, r11.readString(), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));     // Catch: java.lang.Throwable -> L61
            r12.writeNoException();     // Catch: java.lang.Throwable -> L61
            return true;
        L49:
            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L61
            if (r11.readInt() == 0) goto L52;
            r1 = com.aide.ui.scm.GitConfiguration.CREATOR.createFromParcel(r11);     // Catch: java.lang.Throwable -> L61
        L52:
            j6(r1, r11.readString(), r11.readString(), r11.createStringArrayList(), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));     // Catch: java.lang.Throwable -> L61
            r12.writeNoException();     // Catch: java.lang.Throwable -> L61
            return true;
        L54:
            r11.enforceInterface("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L61
            if (r11.readInt() == 0) goto L57;
            r1 = com.aide.ui.scm.GitConfiguration.CREATOR.createFromParcel(r11);     // Catch: java.lang.Throwable -> L61
        L57:
            j6(r1, r11.readString(), r11.readString(), r11.readString(), com.aide.ui.scm.xa.a.j6(r11.readStrongBinder()));     // Catch: java.lang.Throwable -> L61
            r12.writeNoException();     // Catch: java.lang.Throwable -> L61
            return true;
        L10:
            return super.onTransact(r10, r11, r12, r13);
        L59:
            r12.writeString("com.aide.ui.scm.IExternalGitService");     // Catch: java.lang.Throwable -> L61
            return true;
        }
    }

    com.aide.ui.scm.GitStatus DW(java.lang.String r1, com.aide.ui.scm.xa r2);

    java.lang.String DW(java.lang.String r1, java.lang.String r2, com.aide.ui.scm.xa r3);

    void DW(com.aide.ui.scm.GitConfiguration r1, java.lang.String r2, com.aide.ui.scm.xa r3);

    java.util.List<java.lang.String> FH(java.lang.String r1, com.aide.ui.scm.xa r2);

    void FH(java.lang.String r1, java.lang.String r2, com.aide.ui.scm.xa r3);

    void Hw(java.lang.String r1, java.lang.String r2, com.aide.ui.scm.xa r3);

    void cancel();

    java.lang.String j6(java.lang.String r1, com.aide.ui.scm.xa r2);

    void j6(com.aide.ui.scm.GitConfiguration r1, java.lang.String r2, com.aide.ui.scm.xa r3);

    void j6(com.aide.ui.scm.GitConfiguration r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, com.aide.ui.scm.xa r5);

    void j6(com.aide.ui.scm.GitConfiguration r1, java.lang.String r2, java.lang.String r3, java.util.List<java.lang.String> r4, com.aide.ui.scm.xa r5);

    void j6(com.aide.ui.scm.GitConfiguration r1, java.lang.String r2, java.util.List<com.aide.ui.scm.ModifiedFile> r3, java.lang.String r4, com.aide.ui.scm.xa r5);

    void j6(java.lang.String r1, java.lang.String r2, com.aide.ui.scm.xa r3);

    void j6(java.lang.String r1, java.lang.String r2, java.lang.String r3, com.aide.ui.scm.xa r4);

    void j6(java.lang.String r1, java.util.List<com.aide.ui.scm.ModifiedFile> r2, com.aide.ui.scm.xa r3);
}
