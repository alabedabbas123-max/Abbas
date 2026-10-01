package com.aide.ui.activities;

@abcd.Interfacexu
class ClassN implements android.widget.CompoundButton.OnCheckedChangeListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final int FH;
    final com.aide.ui.activities.CommitActivity.b Hw;

    static {
        abcd.wu.j6(com.aide.ui.activities.ClassN.class, -101481753451122000L, -2184792901713797283L);
    }

    ClassN(com.aide.ui.activities.CommitActivity.b r1, int r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -3259309804493606425L)
    public void onCheckedChanged(android.widget.CompoundButton r8, boolean r9) {
    L7:
        th = move-exception;
        if (DW == false) goto L11;
        abcd.wu.j6(th, 1811205192841172300L, this, r8, new java.lang.Boolean(r9));
    L11:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(1811205192841172300L, this, r8, new java.lang.Boolean(r9));     // Catch: java.lang.Throwable -> L7
    L5:
        com.aide.ui.activities.CommitActivity.v5(this.Hw.FH).set(this.FH, r9);     // Catch: java.lang.Throwable -> L7
    }
}
