package com.aide.engine;

@abcd.Interfacexu
class N implements android.os.Parcelable.Creator<com.aide.engine.SyntaxError> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.engine.N.class, 4104537337278253029L, -3659255028812824408L);
    }

    N() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = 6051057104787417303L)
    public com.aide.engine.SyntaxError createFromParcel(android.os.Parcel r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1821511552091659120L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1821511552091659120L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.engine.SyntaxError(r5);
    }

    @Override
    public com.aide.engine.SyntaxError createFromParcel(android.os.Parcel r1) {
        return createFromParcel(r1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = 93723924764031300L)
    public com.aide.engine.SyntaxError[] newArray(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -184544536702003933L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-184544536702003933L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.engine.SyntaxError[r5];
    }

    @Override
    public com.aide.engine.SyntaxError[] newArray(int r1) {
        return newArray(r1);
    }
}
