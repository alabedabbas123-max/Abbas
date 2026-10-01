package com.aide.engine;

@abcd.Interfacexu
class ClassK implements android.os.Parcelable.Creator<com.aide.engine.FindResult> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.engine.ClassK.class, 4131636004103659128L, -1512089509385046771L);
    }

    ClassK() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = 4896264561546024448L)
    public com.aide.engine.FindResult createFromParcel(android.os.Parcel r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1647881562290332400L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1647881562290332400L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.engine.FindResult(r5);
    }

    @Override
    public com.aide.engine.FindResult createFromParcel(android.os.Parcel r1) {
        return createFromParcel(r1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = -1297807056677206579L)
    public com.aide.engine.FindResult[] newArray(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -4812232963057587945L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4812232963057587945L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.engine.FindResult[r5];
    }

    @Override
    public com.aide.engine.FindResult[] newArray(int r1) {
        return newArray(r1);
    }
}
