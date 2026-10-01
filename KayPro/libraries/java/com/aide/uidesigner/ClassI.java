package com.aide.uidesigner;

@abcd.Interfacexu
class ClassI implements android.app.ActionBar.OnNavigationListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.uidesigner.XmlLayoutDesignActivity FH;

    static {
        abcd.wu.j6(com.aide.uidesigner.ClassI.class, -2761603648942096159L, 1467720459875724997L);
    }

    ClassI(com.aide.uidesigner.XmlLayoutDesignActivity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = 7734759995625000663L)
    public boolean onNavigationItemSelected(int r8, long r9) {
    L12:
        th = move-exception;
        if (DW == false) goto L16;
        abcd.wu.j6(th, 329726655247481905L, this, new java.lang.Integer(r8), new java.lang.Long(r9));
    L16:
        throw th;
    L3:
        if (j6 == false) goto L6;
        abcd.wu.j6(329726655247481905L, this, new java.lang.Integer(r8), new java.lang.Long(r9));     // Catch: java.lang.Throwable -> L12
    L6:
        if (com.aide.uidesigner.XmlLayoutDesignActivity.j6(this.FH) == true) goto L8;
        return true;
    L8:
        if (r8 == com.aide.uidesigner.XmlLayoutDesignActivity.DW(this.FH)) goto L20;
        com.aide.uidesigner.XmlLayoutDesignActivity.j6(this.FH, r8);     // Catch: java.lang.Throwable -> L12
        return true;
    L20:
        return true;
    }
}
