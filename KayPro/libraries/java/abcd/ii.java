package abcd;

@abcd.Interfacexu
public class ii extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    static {
        abcd.wu.j6(abcd.ii.class, 1005502431686740692L, 1005502431686740692L);
    }

    public ii() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (VH == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -4938847751760937084L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-4938847751760937084L, null);
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

    static void DW(abcd.ii r0, android.app.AlertDialog r1) {
        r0.Hw(r1);
    }

    @abcd.Interfacesu(method = 5599495411478456605L)
    private void DW(android.app.AlertDialog r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (VH == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, 4834141387453951560L, this, r6);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(4834141387453951560L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        ((android.view.inputmethod.InputMethodManager) r6.getContext().getSystemService("input_method")).hideSoftInputFromWindow(FH(r6).getWindowToken(), 0);
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

    @abcd.Interfacesu(method = -2421677187363125520L)
    private android.widget.EditText FH(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if (VH == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, -446751284592849375L, this, r5);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-446751284592849375L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.gitcommitdatamessage);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1929844814493486400L)
    private void Hw(android.app.AlertDialog r6) {
        android.widget.Button r2 = null;
        boolean r3 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 13: {
                    th = $ex3;
                    if (VH == false) { $pc3 = 17; continue $sw3; }
                    abcd.wu.j6(th, -14707139850991089L, this, r6);
                    $pc3 = 17; continue $sw3;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(-14707139850991089L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 13; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        r2 = r6.getButton(-1);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 13; continue $sw3;
                    }
                    if (r2 == null) { $pc3 = 20; continue $sw3; }
                    r3 = true;
                    if (j6(r6).length() != 0) { $pc3 = 11; continue $sw3; }
                    r3 = false;
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    try {
                        r2.setEnabled(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 13; continue $sw3;
                    }
                    return;
                }
                case 20: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(abcd.ii r0, android.app.AlertDialog r1) {
        r0.DW(r1);
    }

    @Override
    @abcd.Interfacesu(method = 1171647940657283783L)
    protected android.app.Dialog j6(android.app.Activity r8) {
        android.view.View r2 = null;
        android.app.AlertDialog.Builder r3 = null;
        android.app.AlertDialog r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 8: {
                    th = $ex4;
                    if (VH == false) { $pc4 = 12; continue $sw4; }
                    abcd.wu.j6(th, -1971422416823227860L, this, r8);
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(-1971422416823227860L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    try {
                        r2 = android.view.LayoutInflater.from(r8).inflate(com.almlkaide.kaypro.R.layout.gitcommitdata, null);
                        r3 = new android.app.AlertDialog.Builder(r8);
                        r3.setTitle("Git commit").setView(r2).setCancelable(true).setPositiveButton("Commit", new abcd.DialogInterfaceOnClickListenerfi(this, r8)).setNegativeButton(17039360, new abcd.DialogInterfaceOnClickListenerei(this));
                        r4 = r3.create();
                        ((android.widget.EditText) r2.findViewById(com.almlkaide.kaypro.R.id.gitcommitdatamessage)).addTextChangedListener(new abcd.gi(this, r4));
                        r4.setOnShowListener(new abcd.DialogInterfaceOnShowListenerhi(this));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    return r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String j6(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 8: {
                    th = $ex5;
                    if (VH == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, -274808525779235932L, this, r5);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(-274808525779235932L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    return FH(r5).getText().toString().trim();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
