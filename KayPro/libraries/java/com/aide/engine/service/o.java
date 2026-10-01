package com.aide.engine.service;

public interface o extends android.os.IInterface {

    @abcd.Interfacexu
    public static abstract class a extends android.os.Binder implements com.aide.engine.service.o {

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;

        @abcd.Interfacexu
        private static class C0031a implements com.aide.engine.service.o {

            @abcd.Interfaceuu
            private static boolean DW;

            @abcd.Interfacetu
            private static boolean j6;

            @abcd.Interfaceru(field = -3459046082940213659L)
            private android.os.IBinder FH;

            static {
                abcd.wu.j6(com.aide.engine.service.o.a.C0031a.class, 4364956681717562459L, 4364956681717562459L);
            }

            @abcd.Interfacesu(method = 161464855926417607L)
            C0031a(android.os.IBinder r6) {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, -2614232457135053832L, null, r6);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-2614232457135053832L, null, r6);     // Catch: java.lang.Throwable -> L8
            L6:
                this.FH = r6;     // Catch: java.lang.Throwable -> L8
            }

            @Override
            @abcd.Interfacesu(method = 2231263262757348972L)
            public void Hw(java.util.List r8) {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, 1097041912497978175L, this, r8);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(1097041912497978175L, this, r8);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                android.os.Parcel r3 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.engine.service.ICodeCompletionListener");     // Catch: java.lang.Throwable -> L10
                r2.writeList(r8);     // Catch: java.lang.Throwable -> L10
                this.FH.transact(3, r2, r3, 0);     // Catch: java.lang.Throwable -> L10
                r3.readException();     // Catch: java.lang.Throwable -> L10
                r3.recycle();     // Catch: java.lang.Throwable -> L13
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                return;
            L10:
                th = move-exception;
                r3.recycle();     // Catch: java.lang.Throwable -> L13
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                throw th;     // Catch: java.lang.Throwable -> L13
            }

            @Override
            @abcd.Interfacesu(method = 106183948412491457L)
            public android.os.IBinder asBinder() {
            L8:
                th = move-exception;
                if (DW == false) goto L12;
                abcd.wu.j6(th, -2399800017783731968L, this);
            L12:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(-2399800017783731968L, this);     // Catch: java.lang.Throwable -> L8
            L6:
                return this.FH;
            }

            @Override
            @abcd.Interfacesu(method = -3966296240187620096L)
            public void j6(java.lang.String r10, long r11, int r13, int r14) {
            L12:
                th = move-exception;
                if (DW == false) goto L16;
                abcd.wu.j6(th, -1170139112213791671L, this, r10, new java.lang.Long(r11), new java.lang.Integer(r13), new java.lang.Integer(r14));
            L16:
                throw th;
            L3:
                if (j6 == false) goto L5;
                abcd.wu.j6(-1170139112213791671L, this, r10, new java.lang.Long(r11), new java.lang.Integer(r13), new java.lang.Integer(r14));     // Catch: java.lang.Throwable -> L12
            L5:
                android.os.Parcel r0 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L12
                r0.writeInterfaceToken("com.aide.engine.service.ICodeCompletionListener");     // Catch: java.lang.Throwable -> L9
                r0.writeString(r10);     // Catch: java.lang.Throwable -> L9
                r0.writeLong(r11);     // Catch: java.lang.Throwable -> L9
                r0.writeInt(r13);     // Catch: java.lang.Throwable -> L9
                r0.writeInt(r14);     // Catch: java.lang.Throwable -> L9
                this.FH.transact(1, r0, null, 1);     // Catch: java.lang.Throwable -> L9
                r0.recycle();     // Catch: java.lang.Throwable -> L12
                return;
            L9:
                th = move-exception;
                r0.recycle();     // Catch: java.lang.Throwable -> L12
                throw th;     // Catch: java.lang.Throwable -> L12
            }

            @Override
            @abcd.Interfacesu(method = 737911287991044393L)
            public void j6(java.lang.String r17, long r18, int r20, int r21, int r22, com.aide.engine.SourceEntity r23, java.lang.String r24) {
                if (j6 == false) goto L5;
                abcd.wu.j6(2679379762904078000L, this, new java.lang.Object[]{r17, new java.lang.Long(r18), new java.lang.Integer(r20), new java.lang.Integer(r21), new java.lang.Integer(r22), r23, r24});
            L5:
                android.os.Parcel r9 = android.os.Parcel.obtain();
                android.os.Parcel r12 = android.os.Parcel.obtain();
                r9.writeInterfaceToken("com.aide.engine.service.ICodeCompletionListener");     // Catch: java.lang.Throwable -> L13
                r9.writeString(r17);     // Catch: java.lang.Throwable -> L13
                r9.writeLong(r18);     // Catch: java.lang.Throwable -> L13
                r9.writeInt(r20);     // Catch: java.lang.Throwable -> L13
                r9.writeInt(r21);     // Catch: java.lang.Throwable -> L13
                r9.writeInt(r22);     // Catch: java.lang.Throwable -> L13
                if (r23 == null) goto L9;
                r9.writeInt(1);     // Catch: java.lang.Throwable -> L13
                int r0 = 0;
                r23.writeToParcel(r9, 0);     // Catch: java.lang.Throwable -> L13
            L10:
                r9.writeString(r24);     // Catch: java.lang.Throwable -> L13
                this.FH.transact(4, r9, r12, r0);     // Catch: java.lang.Throwable -> L13
                r12.readException();     // Catch: java.lang.Throwable -> L13
                r12.recycle();
                r9.recycle();
                return;
            L9:
                r0 = 0;
                r9.writeInt(0);     // Catch: java.lang.Throwable -> L13
            L13:
                th = move-exception;
                r12.recycle();
                r9.recycle();
                throw th;
            }

            @Override
            @abcd.Interfacesu(method = -281920030875862379L)
            public void k2() {
            L13:
                th = move-exception;
                if (DW == false) goto L17;
                abcd.wu.j6(th, 7276064415114448888L, this);
            L17:
                throw th;
            L4:
                if (j6 == false) goto L6;
                abcd.wu.j6(7276064415114448888L, this);     // Catch: java.lang.Throwable -> L13
            L6:
                android.os.Parcel r2 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                android.os.Parcel r3 = android.os.Parcel.obtain();     // Catch: java.lang.Throwable -> L13
                r2.writeInterfaceToken("com.aide.engine.service.ICodeCompletionListener");     // Catch: java.lang.Throwable -> L10
                this.FH.transact(2, r2, r3, 0);     // Catch: java.lang.Throwable -> L10
                r3.readException();     // Catch: java.lang.Throwable -> L10
                r3.recycle();     // Catch: java.lang.Throwable -> L13
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                return;
            L10:
                th = move-exception;
                r3.recycle();     // Catch: java.lang.Throwable -> L13
                r2.recycle();     // Catch: java.lang.Throwable -> L13
                throw th;     // Catch: java.lang.Throwable -> L13
            }
        }

        static {
            abcd.wu.j6(com.aide.engine.service.o.a.class, 636510100397657319L, 636510100397657319L);
        }

        public a() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -103535347972648032L, null);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-103535347972648032L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            attachInterface(this, "com.aide.engine.service.ICodeCompletionListener");     // Catch: java.lang.Throwable -> L8
        }

        public static com.aide.engine.service.o j6(android.os.IBinder r5) {
        L16:
            th = move-exception;
            if (DW == false) goto L20;
            abcd.wu.j6(th, -1509738585364517119L, null, r5);
        L20:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1509738585364517119L, null, r5);     // Catch: java.lang.Throwable -> L16
        L6:
            if (r5 != null) goto L8;
            return null;
        L8:
            android.os.IInterface r3 = r5.queryLocalInterface("com.aide.engine.service.ICodeCompletionListener");     // Catch: java.lang.Throwable -> L16
            if (r3 == null) goto L15;
            if ((r3 instanceof com.aide.engine.service.o) == false) goto L15;
            return (com.aide.engine.service.o) r3;
        L15:
            return new com.aide.engine.service.o.a.C0031a(r5);
        }

        @Override
        public android.os.IBinder asBinder() {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, 326068616151350860L, this);
        L11:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(326068616151350860L, this);     // Catch: java.lang.Throwable -> L7
        L6:
            return this;
        }

        @Override
        public boolean onTransact(int r12, android.os.Parcel r13, android.os.Parcel r14, int r15) {
        L31:
            th = move-exception;
            if (DW == false) goto L35;
            abcd.wu.j6(th, 194022139227402401L, this, new java.lang.Integer(r12), r13, r14, new java.lang.Integer(r15));
        L35:
            throw th;
        L3:
            if (j6 == false) goto L6;
            abcd.wu.j6(194022139227402401L, this, new java.lang.Integer(r12), r13, r14, new java.lang.Integer(r15));     // Catch: java.lang.Throwable -> L31
        L6:
            if (r12 != 1) goto L8;
            r13.enforceInterface("com.aide.engine.service.ICodeCompletionListener");     // Catch: java.lang.Throwable -> L31
            j6(r13.readString(), r13.readLong(), r13.readInt(), r13.readInt());     // Catch: java.lang.Throwable -> L31
            return true;
        L8:
            if (r12 != 2) goto L10;
            r13.enforceInterface("com.aide.engine.service.ICodeCompletionListener");     // Catch: java.lang.Throwable -> L31
            k2();     // Catch: java.lang.Throwable -> L31
            r14.writeNoException();     // Catch: java.lang.Throwable -> L31
            return true;
        L10:
            if (r12 != 3) goto L12;
            r13.enforceInterface("com.aide.engine.service.ICodeCompletionListener");     // Catch: java.lang.Throwable -> L31
            Hw(r13.readArrayList(getClass().getClassLoader()));     // Catch: java.lang.Throwable -> L31
            r14.writeNoException();     // Catch: java.lang.Throwable -> L31
            return true;
        L12:
            if (r12 != 4) goto L14;
            r13.enforceInterface("com.aide.engine.service.ICodeCompletionListener");     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = r13.readString();     // Catch: java.lang.Throwable -> L31
            long r4 = r13.readLong();     // Catch: java.lang.Throwable -> L31
            int r6 = r13.readInt();     // Catch: java.lang.Throwable -> L31
            int r7 = r13.readInt();     // Catch: java.lang.Throwable -> L31
            int r8 = r13.readInt();     // Catch: java.lang.Throwable -> L31
            if (r13.readInt() == 0) goto L22;
            com.aide.engine.SourceEntity r0 = com.aide.engine.SourceEntity.CREATOR.createFromParcel(r13);     // Catch: java.lang.Throwable -> L31
        L23:
            j6(r3, r4, r6, r7, r8, r0, r13.readString());     // Catch: java.lang.Throwable -> L31
            r14.writeNoException();     // Catch: java.lang.Throwable -> L31
            return true;
        L22:
            r0 = null;
            goto L23
        L14:
            if (r12 != 1598968902) goto L16;
            r14.writeString("com.aide.engine.service.ICodeCompletionListener");     // Catch: java.lang.Throwable -> L31
            return true;
        L16:
            return super.onTransact(r12, r13, r14, r15);
        }
    }

    void Hw(java.util.List r1);

    void j6(java.lang.String r1, long r2, int r4, int r5);

    void j6(java.lang.String r1, long r2, int r4, int r5, int r6, com.aide.engine.SourceEntity r7, java.lang.String r8);

    void k2();
}
