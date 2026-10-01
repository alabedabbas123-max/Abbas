package com.aide.engine;

@abcd.Interfacexu
public class FindResult implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.aide.engine.FindResult> CREATOR = null;

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public java.lang.String FH;
    public int Hw;
    public java.lang.String VH;
    public int Zo;
    public java.util.List<com.aide.engine.FindResult.Highlighting> gn;
    public int v5;

    @abcd.Interfacexu
    public static class Highlighting implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.aide.engine.FindResult.Highlighting> CREATOR = null;

        @abcd.Interfaceuu
        private static boolean DW;

        @abcd.Interfacetu
        private static boolean j6;
        public int FH;
        public int Hw;
        public com.aide.engine.Enumm VH;
        public int Zo;
        public int v5;

        static {
            abcd.wu.j6(com.aide.engine.FindResult.Highlighting.class, 778079600968353600L, 778079600968353600L);     // Catch: java.lang.Throwable -> L8
            if (j6 == false) goto L6;
            abcd.wu.j6(805180888632971456L, null);     // Catch: java.lang.Throwable -> L8
        L6:
            CREATOR = new com.aide.engine.ClassL();     // Catch: java.lang.Throwable -> L8
            return;
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 805180888632971456L, null);
        L12:
            throw th;
        }

        public Highlighting(android.os.Parcel r6) {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, -1293378443263631312L, null, r6);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L6;
            abcd.wu.j6(-1293378443263631312L, null, r6);     // Catch: java.lang.Throwable -> L8
        L6:
            this.FH = r6.readInt();     // Catch: java.lang.Throwable -> L8
            this.Hw = r6.readInt();     // Catch: java.lang.Throwable -> L8
            this.v5 = r6.readInt();     // Catch: java.lang.Throwable -> L8
            this.Zo = r6.readInt();     // Catch: java.lang.Throwable -> L8
            this.VH = com.aide.engine.Enumm.values()[r6.readInt()];     // Catch: java.lang.Throwable -> L8
        }

        public Highlighting(com.aide.engine.Enumm r11, int r12, int r13, int r14, int r15) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -821666881222878387L, null, r11, new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-821666881222878387L, null, r11, new java.lang.Integer(r12), new java.lang.Integer(r13), new java.lang.Integer(r14), new java.lang.Integer(r15));     // Catch: java.lang.Throwable -> L7
        L5:
            this.VH = r11;     // Catch: java.lang.Throwable -> L7
            this.FH = r12;     // Catch: java.lang.Throwable -> L7
            this.Hw = r13;     // Catch: java.lang.Throwable -> L7
            this.v5 = r14;     // Catch: java.lang.Throwable -> L7
            this.Zo = r15;     // Catch: java.lang.Throwable -> L7
        }

        @Override
        public int describeContents() {
        L8:
            th = move-exception;
            if (DW == false) goto L12;
            abcd.wu.j6(th, 2589123821387588315L, this);
        L12:
            throw th;
        L4:
            if (j6 == false) goto L15;
            abcd.wu.j6(2589123821387588315L, this);     // Catch: java.lang.Throwable -> L8
            return 0;
        L15:
            return 0;
        }

        @Override
        public void writeToParcel(android.os.Parcel r8, int r9) {
        L7:
            th = move-exception;
            if (DW == false) goto L11;
            abcd.wu.j6(th, -82214321625205200L, this, r8, new java.lang.Integer(r9));
        L11:
            throw th;
        L3:
            if (j6 == false) goto L5;
            abcd.wu.j6(-82214321625205200L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
        L5:
            r8.writeInt(this.FH);     // Catch: java.lang.Throwable -> L7
            r8.writeInt(this.Hw);     // Catch: java.lang.Throwable -> L7
            r8.writeInt(this.v5);     // Catch: java.lang.Throwable -> L7
            r8.writeInt(this.Zo);     // Catch: java.lang.Throwable -> L7
            r8.writeInt(this.VH.ordinal());     // Catch: java.lang.Throwable -> L7
        }
    }

    static {
        abcd.wu.j6(com.aide.engine.FindResult.class, 4131636004103659128L, 4131636004103659128L);     // Catch: java.lang.Throwable -> L8
        if (j6 == false) goto L6;
        abcd.wu.j6(308728099723557815L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        CREATOR = new com.aide.engine.ClassK();     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 308728099723557815L, null);
    L12:
        throw th;
    }

    public FindResult(android.os.Parcel r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 181932431539894617L, null, r6);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(181932431539894617L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = r6.readString();     // Catch: java.lang.Throwable -> L8
        this.Hw = r6.readInt();     // Catch: java.lang.Throwable -> L8
        this.v5 = r6.readInt();     // Catch: java.lang.Throwable -> L8
        this.Zo = r6.readInt();     // Catch: java.lang.Throwable -> L8
        this.VH = r6.readString();     // Catch: java.lang.Throwable -> L8
        this.gn = new java.util.ArrayList();     // Catch: java.lang.Throwable -> L8
        r6.readList(this.gn, getClass().getClassLoader());     // Catch: java.lang.Throwable -> L8
    }

    public FindResult(java.lang.String r7, java.lang.String r8, java.util.List<com.aide.engine.FindResult.Highlighting> r9, int r10, int r11, int r12) {
        if (j6 == false) goto L5;
        abcd.wu.j6(4681215780995063664L, null, new java.lang.Object[]{r7, r8, r9, new java.lang.Integer(r10), new java.lang.Integer(r11), new java.lang.Integer(r12)});
    L5:
        this.gn = r9;
        this.FH = r7;
        this.VH = r8;
        this.Hw = r10;
        this.v5 = r11;
        this.Zo = r12;
    }

    @Override
    public int describeContents() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -70955149361103960L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(-70955149361103960L, this);     // Catch: java.lang.Throwable -> L8
        return 0;
    L15:
        return 0;
    }

    @Override
    public void writeToParcel(android.os.Parcel r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 388349969111946051L, this, r8, new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(388349969111946051L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        r8.writeString(this.FH);     // Catch: java.lang.Throwable -> L7
        r8.writeInt(this.Hw);     // Catch: java.lang.Throwable -> L7
        r8.writeInt(this.v5);     // Catch: java.lang.Throwable -> L7
        r8.writeInt(this.Zo);     // Catch: java.lang.Throwable -> L7
        r8.writeString(this.VH);     // Catch: java.lang.Throwable -> L7
        r8.writeList(this.gn);     // Catch: java.lang.Throwable -> L7
    }
}
