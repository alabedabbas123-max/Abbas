package com.aide.engine.service;

@abcd.Interfacexu
public class CharArray implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.aide.engine.service.CharArray> CREATOR = null;

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public char[] FH;
    public int Hw;

    static {
        abcd.wu.j6(com.aide.engine.service.CharArray.class, 5712312707494178940L, 5712312707494178940L);     // Catch: java.lang.Throwable -> L8
        if (j6 == false) goto L6;
        abcd.wu.j6(-1270211534238722889L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        CREATOR = new com.aide.engine.service.a();     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1270211534238722889L, null);
    L12:
        throw th;
    }

    public CharArray() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -395255511354242552L, null);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-395255511354242552L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public CharArray(int r6) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1166809972974596949L, null, new java.lang.Integer(r6));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1166809972974596949L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH = new char[r6];     // Catch: java.lang.Throwable -> L8
    }

    @Override
    public int describeContents() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2308459040777481608L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(-2308459040777481608L, this);     // Catch: java.lang.Throwable -> L8
        return 0;
    L15:
        return 0;
    }

    public void j6(android.os.Parcel r7) {
    L16:
        th = move-exception;
        if (DW == false) goto L21;
        abcd.wu.j6(th, -1078930818633315512L, this, r7);
    L21:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1078930818633315512L, this, r7);     // Catch: java.lang.Throwable -> L16
    L6:
        this.Hw = r7.readInt();     // Catch: java.lang.Throwable -> L16
        if (this.FH != null) goto L9;
    L10:
        this.FH = new char[java.lang.Math.max(10000, (this.Hw * 5) / 4)];     // Catch: java.lang.Throwable -> L16
    L11:
        int r2 = this.Hw;     // Catch: java.lang.Throwable -> L16
        char[] r3 = this.FH;     // Catch: java.lang.Throwable -> L16
        int r4 = 0;
    L12:
        if (r4 >= r2) goto L15;
        r3[r4] = (char) r7.readInt();     // Catch: java.lang.Throwable -> L16
        r4 = r4 + 1;
        goto L12
    L15:
        return;
    L9:
        if (this.FH.length >= this.Hw) goto L11;
        goto L10
    }

    @Override
    public void writeToParcel(android.os.Parcel r8, int r9) {
    L10:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, 3576736412131544475L, this, r8, new java.lang.Integer(r9));
    L15:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(3576736412131544475L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L10
    L5:
        r8.writeInt(this.Hw);     // Catch: java.lang.Throwable -> L10
        int r0 = this.Hw;     // Catch: java.lang.Throwable -> L10
        char[] r1 = this.FH;     // Catch: java.lang.Throwable -> L10
        int r2 = 0;
    L6:
        if (r2 >= r0) goto L9;
        r8.writeInt(r1[r2]);     // Catch: java.lang.Throwable -> L10
        r2 = r2 + 1;
        goto L6
    }
}
