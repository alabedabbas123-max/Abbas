package com.aide.ui.scm;

@abcd.Interfacexu
class ya implements android.os.Parcelable.Creator<com.aide.ui.scm.ModifiedFile> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.ui.scm.ya.class, -3685332166428264928L, 5157835694321800413L);
    }

    ya() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = 4958151714240089417L)
    public com.aide.ui.scm.ModifiedFile createFromParcel(android.os.Parcel r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2188084810835238240L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2188084810835238240L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.ui.scm.ModifiedFile(r5);
    }

    @Override
    public com.aide.ui.scm.ModifiedFile createFromParcel(android.os.Parcel r1) {
        return createFromParcel(r1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = -1248556244831702120L)
    public com.aide.ui.scm.ModifiedFile[] newArray(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -5365741217153926839L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-5365741217153926839L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.ui.scm.ModifiedFile[r5];
    }

    @Override
    public com.aide.ui.scm.ModifiedFile[] newArray(int r1) {
        return newArray(r1);
    }
}
