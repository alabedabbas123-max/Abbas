package com.aide.engine;

@abcd.Interfacexu
class G implements android.os.Parcelable.Creator<com.aide.engine.Modification> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.engine.G.class, 3446723240032844968L, -2243176322285577535L);
    }

    G() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = 5356604129413258825L)
    public com.aide.engine.Modification createFromParcel(android.os.Parcel r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1214700815501502860L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1214700815501502860L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.engine.Modification(r5);
    }

    @Override
    public com.aide.engine.Modification createFromParcel(android.os.Parcel r1) {
        return createFromParcel(r1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = -1406769442398784800L)
    public com.aide.engine.Modification[] newArray(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3558013867217001465L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3558013867217001465L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.engine.Modification[r5];
    }

    @Override
    public com.aide.engine.Modification[] newArray(int r1) {
        return newArray(r1);
    }
}
