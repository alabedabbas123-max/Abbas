package com.aide.uidesigner;

@abcd.Interfacexu
class va extends android.view.View {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.content.Context FH;

    @abcd.Interfacevu
    final com.aide.uidesigner.wa Hw;

    static {
        abcd.wu.j6(com.aide.uidesigner.va.class, -6184905212679667120L, 9248857349345616L);
    }

    va(com.aide.uidesigner.wa r1, android.content.Context r2, android.content.Context r3) {
        this.Hw = r1;
        this.FH = r3;
        super(r2);
    }

    @Override
    @abcd.Interfacesu(method = -615240280409297928L)
    protected void onMeasure(int r8, int r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, -161412211736949840L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(-161412211736949840L, this, new java.lang.Integer(r8), new java.lang.Integer(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        setMeasuredDimension((int) (this.FH.getResources().getDisplayMetrics().density * 1.0f), (int) (this.FH.getResources().getDisplayMetrics().density * 30.0f));     // Catch: java.lang.Throwable -> L7
    }
}
