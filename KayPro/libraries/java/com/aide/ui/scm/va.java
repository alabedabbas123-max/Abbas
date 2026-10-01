package com.aide.ui.scm;

@abcd.Interfacexu
class va implements android.os.Parcelable.Creator<com.aide.ui.scm.GitStatus> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.ui.scm.va.class, -2288539808242855755L, -3678533772776747448L);
    }

    va() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = -3597985030192636776L)
    public com.aide.ui.scm.GitStatus createFromParcel(android.os.Parcel r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -937600887502647424L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-937600887502647424L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.ui.scm.GitStatus(r5);
    }

    @Override
    public com.aide.ui.scm.GitStatus createFromParcel(android.os.Parcel r1) {
        return createFromParcel(r1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = 270153697781781183L)
    public com.aide.ui.scm.GitStatus[] newArray(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -5351747066410652399L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5351747066410652399L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.ui.scm.GitStatus[r5];
    }

    @Override
    public com.aide.ui.scm.GitStatus[] newArray(int r1) {
        return newArray(r1);
    }
}
