package com.aide.engine;

@abcd.Interfacexu
class ClassI implements android.os.Parcelable.Creator<com.aide.engine.FileHighlightings> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 1344800284458621504L)
    private com.aide.engine.FileHighlightings FH;

    static {
        abcd.wu.j6(com.aide.engine.ClassI.class, 7780765271333714769L, -2773963344198450264L);
    }

    ClassI() {
        this.FH = new com.aide.engine.FileHighlightings();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = 2072592329956407207L)
    public com.aide.engine.FileHighlightings createFromParcel(android.os.Parcel r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 1868528276555403552L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(1868528276555403552L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        this.FH.j6(r5);     // Catch: java.lang.Throwable -> L8
        return this.FH;
    }

    @Override
    public com.aide.engine.FileHighlightings createFromParcel(android.os.Parcel r1) {
        return createFromParcel(r1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = -607123074475691648L)
    public com.aide.engine.FileHighlightings[] newArray(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2588890491825977849L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2588890491825977849L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.engine.FileHighlightings[r5];
    }

    @Override
    public com.aide.engine.FileHighlightings[] newArray(int r1) {
        return newArray(r1);
    }
}
