package com.aide.uidesigner;

@abcd.Interfacexu
class ClassH implements abcd.G {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.uidesigner.XmlLayoutDesignActivity FH;

    static {
        abcd.wu.j6(com.aide.uidesigner.ClassH.class, -2761603648942096159L, 1467684241249703424L);
    }

    ClassH(com.aide.uidesigner.XmlLayoutDesignActivity r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -6668640337867396735L)
    public boolean j6() {
    L11:
        th = move-exception;
        if (DW == false) goto L15;
        abcd.wu.j6(th, -736952301685551735L, this);
    L15:
        throw th;
    L4:
        if (j6 == false) goto L7;
        abcd.wu.j6(-736952301685551735L, this);     // Catch: java.lang.Throwable -> L11
    L7:
        if (this.FH.getPackageName().startsWith("com.aide.designer") == false) goto L9;
        return true;
    L9:
        return android.preference.PreferenceManager.getDefaultSharedPreferences(this.FH).getBoolean("send_analytics_data", true);
    }
}
