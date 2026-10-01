package com.aide.ui.scm;

@abcd.Interfacexu
public class GitConfiguration implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.aide.ui.scm.GitConfiguration> CREATOR = null;

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    public final java.lang.String FH;
    public final java.lang.String Hw;
    public final boolean Zo;
    public final java.lang.String v5;

    static {
        abcd.wu.j6(com.aide.ui.scm.GitConfiguration.class, -1458982117399304019L, -1458982117399304019L);     // Catch: java.lang.Throwable -> L8
        if (j6 == false) goto L6;
        abcd.wu.j6(185798929975896313L, null);     // Catch: java.lang.Throwable -> L8
    L6:
        CREATOR = new com.aide.ui.scm.ClassG();     // Catch: java.lang.Throwable -> L8
        return;
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 185798929975896313L, null);
    L12:
        throw th;
    }

    public GitConfiguration(android.os.Parcel r6) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, -4127662786821328407L, null, r6);
    L16:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4127662786821328407L, null, r6);     // Catch: java.lang.Throwable -> L12
    L6:
        this.FH = r6.readString();     // Catch: java.lang.Throwable -> L12
        this.Hw = r6.readString();     // Catch: java.lang.Throwable -> L12
        this.v5 = r6.readString();     // Catch: java.lang.Throwable -> L12
        if (r6.readByte() == 0) goto L9;
        boolean r3 = true;
    L10:
        this.Zo = r3;     // Catch: java.lang.Throwable -> L12
        return;
    L9:
        r3 = false;
        goto L10
    }

    public GitConfiguration(java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 879103230294466680L, null, r10, r11, r12, new java.lang.Boolean(r13));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(879103230294466680L, null, r10, r11, r12, new java.lang.Boolean(r13));     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH = r10;     // Catch: java.lang.Throwable -> L7
        this.Hw = r11;     // Catch: java.lang.Throwable -> L7
        this.v5 = r12;     // Catch: java.lang.Throwable -> L7
        this.Zo = r13;     // Catch: java.lang.Throwable -> L7
    }

    @Override
    public int describeContents() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -869418057221540036L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(-869418057221540036L, this);     // Catch: java.lang.Throwable -> L8
        return 0;
    L15:
        return 0;
    }

    @Override
    public void writeToParcel(android.os.Parcel r8, int r9) {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -1909739184050860219L, this, r8, new java.lang.Integer(r9));
    L15:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-1909739184050860219L, this, r8, new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L11
    L5:
        r8.writeString(this.FH);     // Catch: java.lang.Throwable -> L11
        r8.writeString(this.Hw);     // Catch: java.lang.Throwable -> L11
        r8.writeString(this.v5);     // Catch: java.lang.Throwable -> L11
        if (this.Zo == false) goto L8;
        byte r0 = 1;
    L9:
        r8.writeByte(r0);     // Catch: java.lang.Throwable -> L11
        return;
    L8:
        r0 = 0;
        goto L9
    }
}
