package com.aide.ui.preferences;

@abcd.Interfacexu
class h implements java.util.Comparator<com.aide.ui.preferences.KeyBindingsView.b> {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfacevu
    final com.aide.ui.preferences.KeyBindingsView FH;

    static {
        abcd.wu.j6(com.aide.ui.preferences.h.class, 1069513486002832672L, 2128268610100856369L);
    }

    h(com.aide.ui.preferences.KeyBindingsView r1) {
        this.FH = r1;
    }

    @Override
    public int compare(com.aide.ui.preferences.KeyBindingsView.b r1, com.aide.ui.preferences.KeyBindingsView.b r2) {
        return j6(r1, r2);
    }

    @abcd.Interfacesu(method = 1780985210994649760L)
    public int j6(com.aide.ui.preferences.KeyBindingsView.b r8, com.aide.ui.preferences.KeyBindingsView.b r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, -127754313403819893L, this, r8, r9);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(-127754313403819893L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    return r8.v5.compareTo(r9.v5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
