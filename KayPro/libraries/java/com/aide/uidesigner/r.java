package com.aide.uidesigner;

@abcd.Interfacexu
class r implements android.view.View.OnClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.uidesigner.XmlLayoutDesignActivity.a FH;
    final com.aide.uidesigner.XmlLayoutDesignActivity.b Hw;

    static {
        abcd.wu.j6(com.aide.uidesigner.r.class, 1672437279430558904L, -2074804502853101607L);
    }

    r(com.aide.uidesigner.XmlLayoutDesignActivity.b r1, com.aide.uidesigner.XmlLayoutDesignActivity.a r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = -142484118987216372L)
    public void onClick(android.view.View r5) {
    L8:
        th = move-exception;
        if (DW == false) goto L12;
        abcd.wu.j6(th, 288647010193721865L, this, r5);
    L12:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(288647010193721865L, this, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        com.aide.uidesigner.XmlLayoutDesignActivity.DW(this.Hw.FH, this.FH.FH.getPath());     // Catch: java.lang.Throwable -> L8
    }
}
