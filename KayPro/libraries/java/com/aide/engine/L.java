package com.aide.engine;

@abcd.Interfacexu
class L implements android.os.Parcelable.Creator<com.aide.engine.SourceEntity> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.engine.L.class, -1312398249373355088L, 5154911136011082599L);
    }

    L() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = 1620886512836736444L)
    public com.aide.engine.SourceEntity createFromParcel(android.os.Parcel r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 553118307436281256L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(553118307436281256L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.engine.SourceEntity(r5);
    }

    @Override
    public com.aide.engine.SourceEntity createFromParcel(android.os.Parcel r1) {
        return createFromParcel(r1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = -517328159761627199L)
    public com.aide.engine.SourceEntity[] newArray(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 5809895092742938879L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5809895092742938879L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.engine.SourceEntity[r5];
    }

    @Override
    public com.aide.engine.SourceEntity[] newArray(int r1) {
        return newArray(r1);
    }
}
