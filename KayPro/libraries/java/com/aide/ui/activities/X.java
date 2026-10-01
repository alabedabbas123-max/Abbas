package com.aide.ui.activities;

@abcd.Interfacexu
class X implements android.view.View.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final abcd.Sk.a FH;

    @abcd.Interfacevu
    final com.aide.ui.activities.TrainerCourseActivity Hw;

    static {
        abcd.wu.j6(com.aide.ui.activities.X.class, 3404442532748635224L, -4321267715100857400L);
    }

    X(com.aide.ui.activities.TrainerCourseActivity r1, abcd.Sk.a r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 59453392777144760L)
    public void onClick(android.view.View r8) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1114318329197069712L, this, r8);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-1114318329197069712L, this, r8);     // Catch: java.lang.Throwable -> L8
    L6:
        java.lang.String r2 = com.aide.ui.U.J8().DW();     // Catch: java.lang.Throwable -> L8
        com.aide.common.Abstractma.j6(this.Hw, new abcd.Ch(r2, this.FH, new com.aide.ui.activities.W(this)));     // Catch: java.lang.Throwable -> L8
    }
}
