package com.aide.uidesigner;

@abcd.Interfacexu
class ClassX implements com.aide.common.ua.a {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.uidesigner.ClassS FH;
    final android.app.Activity Hw;

    static {
        abcd.wu.j6(com.aide.uidesigner.ClassX.class, -2150908242116545680L, 3465748138059786092L);
    }

    ClassX(com.aide.uidesigner.ClassS r1, android.app.Activity r2) {
        this.FH = r1;
        this.Hw = r2;
    }

    @Override
    @abcd.Interfacesu(method = 2832587422726922163L)
    public boolean DW() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -2262252031204524975L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-2262252031204524975L, this);     // Catch: java.lang.Throwable -> L11
    L6:
        if (this.FH.getParentView() == null) goto L9;
        return true;
    L9:
        return false;
    }

    @Override
    @abcd.Interfacesu(method = -1581299585232508896L)
    public java.lang.String FH() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -1502979019025429664L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(-1502979019025429664L, this);     // Catch: java.lang.Throwable -> L8
        return null;
    L15:
        return null;
    }

    @Override
    @abcd.Interfacesu(method = -3177164415591234687L)
    public java.lang.String getName() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -2012615097595016057L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L15;
        abcd.wu.j6(-2012615097595016057L, this);     // Catch: java.lang.Throwable -> L8
        return "Parent View...";
    L15:
        return "Parent View...";
    }

    @Override
    @abcd.Interfacesu(method = -3430983447563987040L)
    public int j6() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -320912604758017120L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-320912604758017120L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        return com.aide.ui.Ma.icon_goto;
    }

    @Override
    @abcd.Interfacesu(method = 1128286686571817435L)
    public void run() {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, -4483922117678605815L, this);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(-4483922117678605815L, this);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.uidesigner.L.j6(this.Hw, this.FH.getParentView());     // Catch: java.lang.Throwable -> L8
    }
}
