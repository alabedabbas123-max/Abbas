package abcd;

@abcd.Interfacexu
public abstract class AbstractHh extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    @abcd.Interfaceru(field = 541996511108614871L)
    private android.app.AlertDialog gn;

    static {
        abcd.wu.j6(abcd.AbstractHh.class, 1036993532042931165L, 1036993532042931165L);
    }

    public AbstractHh() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (VH == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 4072164298204361624L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(4072164298204361624L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2254871941261464476L)
    private android.widget.ProgressBar DW(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (VH == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, -3708215645801724120L, this, r5);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-3708215645801724120L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return (android.widget.ProgressBar) r5.findViewById(com.almlkaide.kaypro.R.id.progressdialogProgress);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 661178770536766288L)
    private android.widget.TextView j6(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if (VH == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, -33907395936756600L, this, r5);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-33907395936756600L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    return (android.widget.TextView) r5.findViewById(com.almlkaide.kaypro.R.id.progressdialogLabel);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract java.lang.String EQ();

    protected abstract void J0();

    @abcd.Interfacesu(method = -6169156859712083020L)
    protected void J8() {
        int r2 = 0;
        int r3 = 0;
        java.lang.String r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 16: {
                    th = $ex3;
                    if (VH == false) { $pc3 = 20; continue $sw3; }
                    abcd.wu.j6(th, 4801251501855156192L, this);
                    $pc3 = 20; continue $sw3;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc3 = 7; continue $sw3; }
                    try {
                        abcd.wu.j6(4801251501855156192L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 16; continue $sw3;
                    }
                    $pc3 = 7; continue $sw3;
                }
                case 7: {
                    if (Ws() == true) { $pc3 = 9; continue $sw3; }
                    try {
                        this.gn.dismiss();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 16; continue $sw3;
                    }
                    return;
                }
                case 9: {
                    try {
                        r2 = gn();
                        r3 = u7();
                        r4 = tp();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 16; continue $sw3;
                    }
                    if (r3 > 0) { $pc3 = 12; continue $sw3; }
                    $pc3 = 14; continue $sw3;
                }
                case 14: {
                    try {
                        DW(this.gn).setProgress(r2);
                        DW(this.gn).setSecondaryProgress(r3);
                        j6(this.gn).setText(r4);
                        this.gn.setTitle(EQ());
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 16; continue $sw3;
                    }
                    return;
                }
                case 12: {
                    if (r3 >= 100) { $pc3 = 14; continue $sw3; }
                    try {
                        r4 = r4 + " (" + r3 + "%)";
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 16; continue $sw3;
                    }
                    { $pc3 = 14; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void VH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 8: {
                    th = $ex4;
                    if (VH == false) { $pc4 = 12; continue $sw4; }
                    abcd.wu.j6(th, 1335807209470220700L, this);
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(1335807209470220700L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    try {
                        this.gn.dismiss();
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract boolean Ws();

    protected abstract void Zo();

    protected abstract int gn();

    @Override
    @abcd.Interfacesu(method = 3142682422207548855L)
    protected android.app.Dialog j6(android.app.Activity r7) {
        android.view.View r2 = null;
        android.app.AlertDialog.Builder r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 11: {
                    th = $ex5;
                    if (VH == false) { $pc5 = 15; continue $sw5; }
                    abcd.wu.j6(th, -1649244012632306243L, this, r7);
                    $pc5 = 15; continue $sw5;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(-1649244012632306243L, this, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 11; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    try {
                        r2 = android.view.LayoutInflater.from(r7).inflate(com.almlkaide.kaypro.R.layout.progressdialog, null);
                        r3 = new android.app.AlertDialog.Builder(r7);
                        r3.setTitle(EQ()).setView(r2).setCancelable(true).setPositiveButton(com.almlkaide.kaypro.R.string.dialog_bt_hide, new abcd.DialogInterfaceOnClickListenerDh(this));
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 11; continue $sw5;
                    }
                    if (v5() == false) { $pc5 = 9; continue $sw5; }
                    try {
                        r3.setNegativeButton(17039360, new abcd.DialogInterfaceOnClickListenerEh(this));
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 11; continue $sw5;
                    }
                    $pc5 = 9; continue $sw5;
                }
                case 9: {
                    try {
                        this.gn = r3.create();
                        this.gn.setOnDismissListener(new abcd.DialogInterfaceOnDismissListenerFh(this));
                        we();
                        this.gn.setOnShowListener(new abcd.DialogInterfaceOnShowListenerGh(this));
                        this.gn.getWindow().addFlags(128);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 11; continue $sw5;
                    }
                    return this.gn;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    protected abstract java.lang.String tp();

    protected abstract int u7();

    protected abstract boolean v5();

    protected abstract void we();
}
