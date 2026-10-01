package com.aide.ui.activities;

@abcd.Interfacexu
class U implements android.view.View.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.ui.trainer.g.j FH;

    @abcd.Interfacevu
    final com.aide.ui.activities.TrainerCourseActivity Hw;

    static {
        abcd.wu.j6(com.aide.ui.activities.U.class, 3404442532748635224L, -4321091114464710272L);
    }

    U(com.aide.ui.activities.TrainerCourseActivity r1, com.aide.ui.trainer.g.j r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 478666589145063840L)
    public void onClick(android.view.View r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -3355947188711922816L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-3355947188711922816L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.activities.TrainerCourseActivity.j6(this.Hw, this.FH);     // Catch: java.lang.Throwable -> L8
    }
}
