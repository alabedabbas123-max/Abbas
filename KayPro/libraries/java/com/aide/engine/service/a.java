package com.aide.engine.service;

@abcd.Interfacexu
class a implements android.os.Parcelable.Creator<com.aide.engine.service.CharArray> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 2208543953474519840L)
    private com.aide.engine.service.CharArray FH;

    static {
        abcd.wu.j6(com.aide.engine.service.a.class, 5712312707494178940L, -1376350381107133497L);
    }

    a() {
        this.FH = new com.aide.engine.service.CharArray();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = 2968262216383746075L)
    public com.aide.engine.service.CharArray createFromParcel(android.os.Parcel r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 61520711382206328L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(61520711382206328L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.j6(r5);     // Catch: java.lang.Throwable -> L8
        return this.FH;
    }

    @Override
    public com.aide.engine.service.CharArray createFromParcel(android.os.Parcel r1) {
        return createFromParcel(r1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = 938928761411144480L)
    public com.aide.engine.service.CharArray[] newArray(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1538617312094971491L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1538617312094971491L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.engine.service.CharArray[r5];
    }

    @Override
    public com.aide.engine.service.CharArray[] newArray(int r1) {
        return newArray(r1);
    }
}
