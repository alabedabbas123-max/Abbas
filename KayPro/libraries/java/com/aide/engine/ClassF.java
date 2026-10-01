package com.aide.engine;

@abcd.Interfacexu
class ClassF implements android.os.Parcelable.Creator<com.aide.engine.EngineSolution.File> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.engine.ClassF.class, -3579233191020808329L, 361096508686728332L);
    }

    ClassF() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = -3813427584658860432L)
    public com.aide.engine.EngineSolution.File createFromParcel(android.os.Parcel r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1518855867139713837L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1518855867139713837L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.engine.EngineSolution.File(r5);
    }

    @Override
    public com.aide.engine.EngineSolution.File createFromParcel(android.os.Parcel r1) {
        return createFromParcel(r1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    @abcd.Interfacesu(method = -101776724335344965L)
    public com.aide.engine.EngineSolution.File[] newArray(int r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 2051102941863510528L, this, new java.lang.Integer(r5));
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(2051102941863510528L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return new com.aide.engine.EngineSolution.File[r5];
    }

    @Override
    public com.aide.engine.EngineSolution.File[] newArray(int r1) {
        return newArray(r1);
    }
}
