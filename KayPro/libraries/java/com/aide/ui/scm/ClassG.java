package com.aide.ui.scm;

@abcd.Interfacexu
class ClassG implements android.os.Parcelable.Creator<com.aide.ui.scm.GitConfiguration> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.ui.scm.ClassG.class, -1458982117399304019L, -5066591561765115200L);
    }

    ClassG() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = -748122346556602512L)
    public com.aide.ui.scm.GitConfiguration createFromParcel(android.os.Parcel r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 121103265462682800L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(121103265462682800L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.ui.scm.GitConfiguration(r5);
    }

    @Override
    public com.aide.ui.scm.GitConfiguration createFromParcel(android.os.Parcel r1) {
        return createFromParcel(r1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = -357880376341862881L)
    public com.aide.ui.scm.GitConfiguration[] newArray(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -4413281326755408075L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4413281326755408075L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.ui.scm.GitConfiguration[r5];
    }

    @Override
    public com.aide.ui.scm.GitConfiguration[] newArray(int r1) {
        return newArray(r1);
    }
}
