package com.aide.uidesigner;

@abcd.Interfacexu
class Runnableq implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final java.lang.String FH;

    @abcd.Interfacevu
    final com.aide.uidesigner.XmlLayoutDesignActivity Hw;

    static {
        abcd.wu.j6(com.aide.uidesigner.Runnableq.class, -2761603648942096159L, 1467973990371648240L);
    }

    Runnableq(com.aide.uidesigner.XmlLayoutDesignActivity r1, java.lang.String r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 2559221432572693504L)
    public void run() {
    L14:
        th = move-exception;
        if (DW == false) goto L18;
        abcd.wu.j6(th, 429421949172340871L, this);
    L18:
        throw th;
    L4:
        if (j6 == false) goto L6;
        abcd.wu.j6(429421949172340871L, this);     // Catch: java.lang.Throwable -> L14
    L6:
        new java.io.File(this.FH).delete();     // Catch: java.lang.Throwable -> L14
        if (com.aide.uidesigner.XmlLayoutDesignActivity.tp(this.Hw).equals(this.FH) == false) goto L12;
        com.aide.uidesigner.XmlLayoutDesignActivity.FH(this.Hw, com.aide.uidesigner.ClassE.j6(com.aide.uidesigner.XmlLayoutDesignActivity.FH(this.Hw)));     // Catch: java.lang.Throwable -> L14
        if (com.aide.uidesigner.XmlLayoutDesignActivity.Hw(this.Hw) == false) goto L11;
        com.aide.uidesigner.XmlLayoutDesignActivity.j6(this.Hw, com.aide.uidesigner.XmlLayoutDesignActivity.tp(this.Hw));     // Catch: java.lang.Throwable -> L14
    L11:
        com.aide.uidesigner.XmlLayoutDesignActivity.v5(this.Hw);     // Catch: java.lang.Throwable -> L14
        return;
    L12:
        com.aide.uidesigner.XmlLayoutDesignActivity.we(this.Hw);     // Catch: java.lang.Throwable -> L14
    }
}
