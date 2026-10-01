package com.aide.ui.activities;

@abcd.Interfacexu
class ClassI implements android.widget.AdapterView.OnItemClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.widget.ListView FH;

    @abcd.Interfacevu
    final com.aide.ui.activities.CommitActivity Hw;

    static {
        abcd.wu.j6(com.aide.ui.activities.ClassI.class, -48774866763899575L, -801280346436386600L);
    }

    ClassI(com.aide.ui.activities.CommitActivity r1, android.widget.ListView r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -573325990732142529L)
    public void onItemClick(android.widget.AdapterView<?> r10, android.view.View r11, int r12, long r13) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 553431604816403000L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(553431604816403000L, this, r10, r11, new java.lang.Integer(r12), new java.lang.Long(r13));     // Catch: java.lang.Throwable -> L7
    L5:
        this.FH.requestFocus();     // Catch: java.lang.Throwable -> L7
        com.aide.ui.activities.CommitActivity.j6(this.Hw, r12);     // Catch: java.lang.Throwable -> L7
    }
}
