package com.aide.common;

@abcd.Interfacexu
class ClassD implements android.widget.PopupMenu.OnMenuItemClickListener {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final com.aide.common.ViewOnClickListenere FH;

    static {
        abcd.wu.j6(com.aide.common.ClassD.class, -5719469610590790156L, -5264982118530527229L);
    }

    ClassD(com.aide.common.ViewOnClickListenere r1) {
        this.FH = r1;
    }

    @Override
    @abcd.Interfacesu(method = -2609122254969051881L)
    public boolean onMenuItemClick(android.view.MenuItem r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 9: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 13; continue $sw0; }
                    abcd.wu.j6(th, 2277578942065586692L, this, r6);
                    $pc0 = 13; continue $sw0;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(2277578942065586692L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 9; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.FH.Hw.selectTab(this.FH.Hw.getTabAt(r6.getItemId()));
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 9; continue $sw0;
                    }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
