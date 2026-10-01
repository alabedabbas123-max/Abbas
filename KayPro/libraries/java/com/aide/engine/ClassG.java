package com.aide.engine;

@abcd.Interfacexu
class ClassG implements android.os.Parcelable.Creator<com.aide.engine.EngineSolutionProject> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.engine.ClassG.class, 391151518740039552L, -1309651683028731567L);
    }

    ClassG() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = -5250793276520520975L)
    public com.aide.engine.EngineSolutionProject createFromParcel(android.os.Parcel r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -25947327679206752L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-25947327679206752L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.engine.EngineSolutionProject(r5);
    }

    @Override
    public com.aide.engine.EngineSolutionProject createFromParcel(android.os.Parcel r1) {
        return createFromParcel(r1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = -968667295839216480L)
    public com.aide.engine.EngineSolutionProject[] newArray(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 4370133248137757009L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(4370133248137757009L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.engine.EngineSolutionProject[r5];
    }

    @Override
    public com.aide.engine.EngineSolutionProject[] newArray(int r1) {
        return newArray(r1);
    }
}
