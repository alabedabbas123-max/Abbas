package com.aide.ui.activities;

@abcd.Interfacexu
class ClassY implements java.util.Comparator<com.aide.engine.SourceEntity> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.String FH;

    @abcd.Interfacevu
    final com.aide.ui.activities.GotoBrowserActivity Hw;

    static {
        abcd.wu.j6(com.aide.ui.activities.ClassY.class, -667729815873843261L, 3105293659098924804L);
    }

    ClassY(com.aide.ui.activities.GotoBrowserActivity r1, java.lang.String r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    public int compare(com.aide.engine.SourceEntity r1, com.aide.engine.SourceEntity r2) {
        return j6(r1, r2);
    }

    @abcd.Interfacesu(method = -660443805243094013L)
    public int j6(com.aide.engine.SourceEntity r8, com.aide.engine.SourceEntity r9) {
    L16:
        th = move-exception;
        if (DW == false) goto L20;
        abcd.wu.j6(th, 4531280680893049975L, this, r8, r9);
    L20:
        throw th;
    L3:
        if (j6 == false) goto L5;
        abcd.wu.j6(4531280680893049975L, this, r8, r9);     // Catch: java.lang.Throwable -> L16
    L5:
        boolean r0 = r8.we().toLowerCase().startsWith(this.FH.toLowerCase());     // Catch: java.lang.Throwable -> L16
        boolean r1 = r9.we().toLowerCase().startsWith(this.FH.toLowerCase());     // Catch: java.lang.Throwable -> L16
        if (r0 == false) goto L10;
        if (r1 == true) goto L10;
        return -1;
    L10:
        if (r0 == true) goto L14;
        if (r1 == false) goto L14;
        return 1;
    L14:
        return r8.we().compareTo(r9.we());
    }
}
