package com.aide.ui;

@abcd.Interfacexu
class X implements java.lang.Runnable {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;
    final android.view.View FH;

    @abcd.Interfacevu
    final com.aide.ui.Z Hw;

    static {
        abcd.wu.j6(com.aide.ui.X.class, -583473860859722665L, 459389042936997340L);
    }

    X(com.aide.ui.Z r1, android.view.View r2) {
        this.Hw = r1;
        this.FH = r2;
    }

    @Override
    @abcd.Interfacesu(method = 1478844908117378931L)
    public void run() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -5901700656240745913L, this);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-5901700656240745913L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        com.aide.ui.Z.j6(this.Hw, new android.widget.PopupMenu(com.aide.ui.Z.DW(this.Hw), this.FH));
                        com.aide.ui.Z.j6(this.Hw).getMenuInflater().inflate(com.aide.ui.Z.FH(this.Hw), com.aide.ui.Z.j6(this.Hw).getMenu());
                        com.aide.ui.Z.j6(this.Hw, com.aide.ui.Z.j6(this.Hw).getMenu());
                        com.aide.ui.Z.j6(this.Hw).setOnMenuItemClickListener(new com.aide.ui.W(this));
                        com.aide.ui.Z.j6(this.Hw).show();
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
