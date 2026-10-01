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
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 11: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 15; continue $sw0; }
                    abcd.wu.j6(th, -736952301685551735L, this);
                    $pc0 = 15; continue $sw0;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 7; continue $sw0; }
                    try {
                        abcd.wu.j6(-736952301685551735L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 11; continue $sw0;
                    }
                    $pc0 = 7; continue $sw0;
                }
                case 7: {
                    if (this.FH.getPackageName().startsWith("com.aide.designer") == false) { $pc0 = 9; continue $sw0; }
                    return true;
                }
                case 9: {
                    return android.preference.PreferenceManager.getDefaultSharedPreferences(this.FH).getBoolean("send_analytics_data", true);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
