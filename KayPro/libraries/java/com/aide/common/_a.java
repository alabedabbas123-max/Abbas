package com.aide.common;

@abcd.Interfacexu
class _a implements android.os.Parcelable.Creator<com.aide.common.UndoManager.Change> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.common._a.class, -3939864719947814112L, -52892397807058845L);
    }

    _a() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = 3569534810449102968L)
    public com.aide.common.UndoManager.Change createFromParcel(android.os.Parcel r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2185044651464009472L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2185044651464009472L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.common.UndoManager.Change(r5);
    }

    @Override
    public com.aide.common.UndoManager.Change createFromParcel(android.os.Parcel r1) {
        return createFromParcel(r1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = 1294720075820608647L)
    public com.aide.common.UndoManager.Change[] newArray(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2380064336002098645L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2380064336002098645L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.common.UndoManager.Change[r5];
    }

    @Override
    public com.aide.common.UndoManager.Change[] newArray(int r1) {
        return newArray(r1);
    }
}
