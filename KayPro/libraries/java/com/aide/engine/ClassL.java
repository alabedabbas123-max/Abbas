package com.aide.engine;

@abcd.Interfacexu
class ClassL implements android.os.Parcelable.Creator<com.aide.engine.FindResult.Highlighting> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.engine.ClassL.class, 778079600968353600L, 2217115413842951627L);
    }

    ClassL() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = 5606766511968681264L)
    public com.aide.engine.FindResult.Highlighting createFromParcel(android.os.Parcel r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 165324712187308739L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(165324712187308739L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.engine.FindResult.Highlighting(r5);
    }

    @Override
    public com.aide.engine.FindResult.Highlighting createFromParcel(android.os.Parcel r1) {
        return createFromParcel(r1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = 1378543106686640265L)
    public com.aide.engine.FindResult.Highlighting[] newArray(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 3409528117642034160L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(3409528117642034160L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.engine.FindResult.Highlighting[r5];
    }

    @Override
    public com.aide.engine.FindResult.Highlighting[] newArray(int r1) {
        return newArray(r1);
    }
}
