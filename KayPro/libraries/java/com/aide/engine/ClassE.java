package com.aide.engine;

@abcd.Interfacexu
class ClassE implements android.os.Parcelable.Creator<com.aide.engine.EngineSolution> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.engine.ClassE.class, -5147424603853593465L, 2415975557034833788L);
    }

    ClassE() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = 6152137544715173595L)
    public com.aide.engine.EngineSolution createFromParcel(android.os.Parcel r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2081006838604226280L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2081006838604226280L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.engine.EngineSolution(r5);
    }

    @Override
    public com.aide.engine.EngineSolution createFromParcel(android.os.Parcel r1) {
        return createFromParcel(r1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = -1281551351329241664L)
    public com.aide.engine.EngineSolution[] newArray(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 632868433733498547L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(632868433733498547L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.engine.EngineSolution[r5];
    }

    @Override
    public com.aide.engine.EngineSolution[] newArray(int r1) {
        return newArray(r1);
    }
}
