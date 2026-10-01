package abcd;

@abcd.Interfacexu
public class di extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    @abcd.Interfaceru(field = 3289488117011052235L)
    private java.lang.String gn;

    static {
        abcd.wu.j6(abcd.di.class, 294461532386472240L, 294461532386472240L);
    }

    public di(java.lang.String r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (VH == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -1302759957451423743L, null, r6);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-1302759957451423743L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.gn = r6;
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

    static java.lang.String DW(abcd.di r0, android.app.AlertDialog r1) {
        return r0.FH(r1);
    }

    @abcd.Interfacesu(method = 4001293043147922100L)
    private void DW(android.app.AlertDialog r6) {
        android.view.inputmethod.InputMethodManager r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (VH == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, 1795971876204410507L, this, r6);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(1795971876204410507L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        r2 = (android.view.inputmethod.InputMethodManager) r6.getContext().getSystemService("input_method");
                        r2.hideSoftInputFromWindow(Hw(r6).getWindowToken(), 0);
                        r2.hideSoftInputFromWindow(Zo(r6).getWindowToken(), 0);
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

    static java.lang.String FH(abcd.di r0, android.app.AlertDialog r1) {
        return r0.v5(r1);
    }

    @abcd.Interfacesu(method = -4878540208062632523L)
    private java.lang.String FH(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if (VH == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, -911990147909276436L, this, r5);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-911990147909276436L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    return Hw(r5).getText().toString().trim();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static android.widget.EditText Hw(abcd.di r0, android.app.AlertDialog r1) {
        return r0.Zo(r1);
    }

    @abcd.Interfacesu(method = -3614173312527169216L)
    private android.widget.EditText Hw(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (VH == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, -2555099710780862995L, this, r5);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(-2555099710780862995L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.gitclonerepositoryDirectoryName);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -195978998071684413L)
    private android.widget.EditText Zo(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 8: {
                    th = $ex4;
                    if (VH == false) { $pc4 = 12; continue $sw4; }
                    abcd.wu.j6(th, -6350219985223189656L, this, r5);
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(-6350219985223189656L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.gitclonerepositoryUrl);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String j6(abcd.di r0) {
        return r0.v5();
    }

    static void j6(abcd.di r0, android.app.AlertDialog r1) {
        r0.DW(r1);
    }

    @abcd.Interfacesu(method = 4975793607705188268L)
    private java.lang.String v5() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 8: {
                    th = $ex5;
                    if (VH == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, 201232545820468981L, this);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(201232545820468981L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    return this.gn;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 3534611745733543400L)
    private java.lang.String v5(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 8: {
                    th = $ex6;
                    if (VH == false) { $pc6 = 12; continue $sw6; }
                    abcd.wu.j6(th, -4434289999238011625L, this, r5);
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(-4434289999238011625L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    return Zo(r5).getText().toString().trim();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 1960161719356701120L)
    protected android.app.Dialog j6(android.app.Activity r10) {
        java.lang.String r3 = null;
        android.view.View r4 = null;
        android.app.AlertDialog.Builder r5 = null;
        android.app.AlertDialog r6 = null;
        android.widget.EditText r7 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 8: {
                    th = $ex7;
                    if (VH == false) { $pc7 = 12; continue $sw7; }
                    abcd.wu.j6(th, 1275607209537150833L, this, r10);
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(1275607209537150833L, this, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    try {
                        r3 = v5();
                        r4 = android.view.LayoutInflater.from(r10).inflate(com.almlkaide.kaypro.R.layout.gitclonerepository, null);
                        r5 = new android.app.AlertDialog.Builder(r10);
                        r5.setTitle(com.almlkaide.kaypro.R.string.command_files_clone_git_repository).setView(r4).setCancelable(true).setPositiveButton(com.almlkaide.kaypro.R.string.dialog_bt_clone, null).setNegativeButton(17039360, new abcd.DialogInterfaceOnClickListenerZh(this));
                        r6 = r5.create();
                        ((android.widget.TextView) r4.findViewById(com.almlkaide.kaypro.R.id.gitclonerepositoryUrl)).setText("");
                        ((android.widget.TextView) r4.findViewById(com.almlkaide.kaypro.R.id.gitclonerepositoryLocation)).setText(r3);
                        r7 = (android.widget.EditText) r4.findViewById(com.almlkaide.kaypro.R.id.gitclonerepositoryDirectoryName);
                        r7.setText("");
                        r7.addTextChangedListener(new abcd._h(this, r6));
                        ((android.widget.EditText) r4.findViewById(com.almlkaide.kaypro.R.id.gitclonerepositoryUrl)).addTextChangedListener(new abcd.C0526ai(this, r6, r7));
                        r6.setOnShowListener(new abcd.DialogInterfaceOnShowListenerci(this, r10));
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    return r6;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 1783523156329601489L)
    protected void j6(android.app.AlertDialog r9) {
        android.widget.Button r2 = null;
        boolean r3 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 17: {
                    th = $ex8;
                    if (VH == false) { $pc8 = 21; continue $sw8; }
                    abcd.wu.j6(th, 3442036354139500500L, this, r9);
                    $pc8 = 21; continue $sw8;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(3442036354139500500L, this, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 17; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    try {
                        r2 = r9.getButton(-1);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 17; continue $sw8;
                    }
                    if (r2 == null) { $pc8 = 26; continue $sw8; }
                    r3 = true;
                    try {
                        new abcd.HJ(v5(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.net.URISyntaxException) { $pc8 = 11; continue $sw8; }
                        $pc8 = 17; continue $sw8;
                    }
                    $pc8 = 13; continue $sw8;
                }
                case 13: {
                    if (com.aide.ui.U.Ws().j6(v5(), FH(r9)) == true) { $pc8 = 15; continue $sw8; }
                    r3 = false;
                    $pc8 = 15; continue $sw8;
                }
                case 15: {
                    try {
                        r2.setEnabled(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 17; continue $sw8;
                    }
                    return;
                }
                case 11: {
                    r3 = false;
                    { $pc8 = 13; continue $sw8; }
                }
                case 26: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
