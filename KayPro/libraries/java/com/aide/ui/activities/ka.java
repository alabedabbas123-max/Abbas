package com.aide.ui.activities;

@abcd.Interfacexu
class ka implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final int FH;
    final com.aide.ui.activities.TrainerCourseActivity.a Hw;

    static {
        abcd.wu.j6(com.aide.ui.activities.ka.class, 1029200971414582941L, -3334293089220908760L);
    }

    ka(com.aide.ui.activities.TrainerCourseActivity.a r1, int r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 2191764808564869880L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2300238731202448833L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2300238731202448833L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        ((android.view.View) com.aide.ui.activities.TrainerCourseActivity.a.j6(this.Hw).get(this.FH)).requestFocus();     // Catch: java.lang.Throwable -> L8
    }
}
