package com.aide.ui.activities;

@abcd.Interfacexu
class ea implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.activities.TrainerCourseActivity FH;

    static {
        abcd.wu.j6(com.aide.ui.activities.ea.class, 3404442532748635224L, -1331591977783493335L);
    }

    ea(com.aide.ui.activities.TrainerCourseActivity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -959653421841220548L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 5050164174576201299L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(5050164174576201299L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.ui.activities.TrainerCourseActivity.DW(this.FH, false);     // Catch: java.lang.Throwable -> L8
        com.aide.ui.activities.TrainerCourseActivity.DW(this.FH);     // Catch: java.lang.Throwable -> L8
    }
}
