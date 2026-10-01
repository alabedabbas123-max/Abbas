package com.aide.uidesigner;

@abcd.Interfacexu
public class ProxyMarginLayoutParams {

    @abcd.Interfacetu
    private static boolean $ON_ENTER_TOGGLE;

    @abcd.Interfaceuu
    private static boolean $ON_THROW_TOGGLE;

    @abcd.Interfaceru(field = 1286728673468488320L)
    private android.view.ViewGroup.MarginLayoutParams params;

    static {
        abcd.wu.j6(com.aide.uidesigner.ProxyMarginLayoutParams.class, -4357380200993762145L, -4357380200993762145L);
    }

    public ProxyMarginLayoutParams(java.lang.Object r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if ($ON_THROW_TOGGLE == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 2088598866734157688L, null, r6);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(2088598866734157688L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.params = (android.view.ViewGroup.MarginLayoutParams) r6;
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

    public void setMargin(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if ($ON_THROW_TOGGLE == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, -1042662775487324376L, this, new java.lang.Integer(r5));
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if ($ON_ENTER_TOGGLE == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-1042662775487324376L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        this.params.setMargins(r5, r5, r5, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
