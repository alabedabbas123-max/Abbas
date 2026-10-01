package abcd;

@abcd.Interfacexu
public class Yh extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    @abcd.Interfaceru(field = -2635689681807066136L)
    private java.lang.String gn;

    @abcd.Interfaceru(field = -2350192644063101112L)
    private java.lang.String tp;

    @abcd.Interfaceru(field = 2039735921507585539L)
    private java.lang.String u7;

    static {
        abcd.wu.j6(abcd.Yh.class, 4518137094473097045L, 4518137094473097045L);
    }

    public Yh(java.lang.String r9) {
        android.content.SharedPreferences r3 = null;
        java.lang.StringBuilder r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (VH == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 3828419465604789783L, null, r9);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(3828419465604789783L, null, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        r3 = com.aide.ui.U.Zo().getSharedPreferences("ExportAPKDialog", 0);
                        r4 = new java.lang.StringBuilder();
                        r4.append(r3.getString("DefaultAPKDir", abcd.Vl.VH() + "/AppProjects"));
                        r4.append("/");
                        r4.append(abcd.C0790gj.Mr(com.aide.ui.U.vy().J0()));
                        this.u7 = r4.toString();
                        this.gn = r3.getString("DefaultKeyStore", abcd.Vl.VH() + "/AppProjects/publish.keystore");
                        this.tp = r9;
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

    @abcd.Interfacesu(method = -3215078050561682305L)
    private Yh(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 7: {
                    th = $ex1;
                    if (VH == false) { $pc1 = 11; continue $sw1; }
                    abcd.wu.j6(th, 3466111084542111291L, null, r9, r10, r11);
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (Zo == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(3466111084542111291L, null, r9, r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    try {
                        this.u7 = r10;
                        this.gn = r11;
                        this.tp = r9;
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    Yh(java.lang.String r10, java.lang.String r11, java.lang.String r12, abcd.DialogInterfaceOnClickListenerRh r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 7: {
                    th = $ex2;
                    if (VH == false) { $pc2 = 11; continue $sw2; }
                    abcd.wu.j6(th, -5553121834155633612L, null, r10, r11, r12, r13);
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (Zo == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(-5553121834155633612L, null, r10, r11, r12, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 7; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        this(r10, r11, r12);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 7; continue $sw2;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String DW(abcd.Yh r0, android.app.AlertDialog r1) {
        return r0.FH(r1);
    }

    @abcd.Interfacesu(method = 109508426829733232L)
    private void DW(android.app.Activity r9, java.lang.String r10, java.lang.String r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 7: {
                    th = $ex3;
                    if (VH == false) { $pc3 = 11; continue $sw3; }
                    abcd.wu.j6(th, -7290312324950855872L, this, r9, r10, r11);
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (Zo == false) { $pc3 = 5; continue $sw3; }
                    try {
                        abcd.wu.j6(-7290312324950855872L, this, r9, r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 7; continue $sw3;
                    }
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    try {
                        com.aide.common.Abstractma.j6(r9, new abcd.rh(r11, "appkey", "", new abcd.C0443Xh(this, r9, r10)));
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 7; continue $sw3;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -5859736509948213984L)
    private void DW(android.app.AlertDialog r6) {
        android.view.inputmethod.InputMethodManager r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 8: {
                    th = $ex4;
                    if (VH == false) { $pc4 = 12; continue $sw4; }
                    abcd.wu.j6(th, 2128688099187769296L, this, r6);
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(2128688099187769296L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    try {
                        r2 = (android.view.inputmethod.InputMethodManager) r6.getContext().getSystemService("input_method");
                        r2.hideSoftInputFromWindow(Hw(r6).getWindowToken(), 0);
                        r2.hideSoftInputFromWindow(Zo(r6).getWindowToken(), 0);
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

    static java.lang.String FH(abcd.Yh r0, android.app.AlertDialog r1) {
        return r0.v5(r1);
    }

    @abcd.Interfacesu(method = -2113376607681099084L)
    private java.lang.String FH(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 8: {
                    th = $ex5;
                    if (VH == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, 792772347225384800L, this, r5);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(792772347225384800L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    return Hw(r5).getText().toString().trim();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -2486626551369405375L)
    private android.widget.EditText Hw(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 8: {
                    th = $ex6;
                    if (VH == false) { $pc6 = 12; continue $sw6; }
                    abcd.wu.j6(th, -1761200616027796605L, this, r5);
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(-1761200616027796605L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.exportapkFile);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 6726713543896544784L)
    private android.widget.EditText Zo(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 8: {
                    th = $ex7;
                    if (VH == false) { $pc7 = 12; continue $sw7; }
                    abcd.wu.j6(th, 4473098694391518668L, this, r5);
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(4473098694391518668L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.exportapkKeystoreFile);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String j6(abcd.Yh r0) {
        return r0.tp;
    }

    static void j6(abcd.Yh r0, android.app.Activity r1, java.lang.String r2, java.lang.String r3) {
        r0.DW(r1, r2, r3);
    }

    static void j6(abcd.Yh r0, android.app.AlertDialog r1) {
        r0.DW(r1);
    }

    static void j6(abcd.Yh r0, java.lang.String r1, java.lang.String r2) {
        r0.j6(r1, r2);
    }

    @abcd.Interfacesu(method = 8015687732796562304L)
    private void j6(java.lang.String r8, java.lang.String r9) {
        android.content.SharedPreferences.Editor r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 3;
        $sw8: while (true) {
            switch ($pc8) {
                case 7: {
                    th = $ex8;
                    if (VH == false) { $pc8 = 11; continue $sw8; }
                    abcd.wu.j6(th, 4771908176910514920L, this, r8, r9);
                    $pc8 = 11; continue $sw8;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (Zo == false) { $pc8 = 5; continue $sw8; }
                    try {
                        abcd.wu.j6(4771908176910514920L, this, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 7; continue $sw8;
                    }
                    $pc8 = 5; continue $sw8;
                }
                case 5: {
                    try {
                        r0 = com.aide.ui.U.Zo().getSharedPreferences("ExportAPKDialog", 0).edit();
                        r0.putString("DefaultKeyStore", r9);
                        r0.putString("DefaultAPKDir", abcd.Vl.EQ(r8));
                        r0.commit();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 7; continue $sw8;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -2916478725766900605L)
    private java.lang.String v5(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 8: {
                    th = $ex9;
                    if (VH == false) { $pc9 = 12; continue $sw9; }
                    abcd.wu.j6(th, 2534346003423630797L, this, r5);
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc9 = 6; continue $sw9; }
                    try {
                        abcd.wu.j6(2534346003423630797L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 8; continue $sw9;
                    }
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    return Zo(r5).getText().toString().trim();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 340203784419912784L)
    protected android.app.Dialog j6(android.app.Activity r8) {
        android.view.View r2 = null;
        android.app.AlertDialog.Builder r3 = null;
        android.app.AlertDialog r4 = null;
        android.widget.TextView r5 = null;
        android.widget.EditText r6 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 4;
        $sw10: while (true) {
            switch ($pc10) {
                case 8: {
                    th = $ex10;
                    if (VH == false) { $pc10 = 12; continue $sw10; }
                    abcd.wu.j6(th, -2405816802693573780L, this, r8);
                    $pc10 = 12; continue $sw10;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc10 = 6; continue $sw10; }
                    try {
                        abcd.wu.j6(-2405816802693573780L, this, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 8; continue $sw10;
                    }
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    try {
                        r2 = android.view.LayoutInflater.from(r8).inflate(com.almlkaide.kaypro.R.layout.exportapk, null);
                        r3 = new android.app.AlertDialog.Builder(r8);
                        r3.setTitle(com.almlkaide.kaypro.R.string.dialog_title_export).setView(r2).setCancelable(true).setPositiveButton(com.almlkaide.kaypro.R.string.dialog_bt_export, new abcd.DialogInterfaceOnClickListenerC0379Th(this)).setNeutralButton(com.almlkaide.kaypro.R.string.dialog_title_create_keystore, new abcd.DialogInterfaceOnClickListenerSh(this, r8)).setNegativeButton(17039360, new abcd.DialogInterfaceOnClickListenerRh(this));
                        r4 = r3.create();
                        r5 = (android.widget.TextView) r2.findViewById(com.almlkaide.kaypro.R.id.exportapkFile);
                        r5.setText(this.u7);
                        r5.addTextChangedListener(new abcd.Uh(this, r4));
                        r6 = (android.widget.EditText) r2.findViewById(com.almlkaide.kaypro.R.id.exportapkKeystoreFile);
                        r6.setText(this.gn);
                        r6.addTextChangedListener(new abcd.Vh(this, r4));
                        r4.setOnShowListener(new abcd.DialogInterfaceOnShowListenerWh(this));
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 8; continue $sw10;
                    }
                    return r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 79586093315472705L)
    protected void j6(android.app.AlertDialog r5) {
        android.widget.Button r2 = null;
        boolean r3 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 4;
        $sw11: while (true) {
            switch ($pc11) {
                case 16: {
                    th = $ex11;
                    if (VH == false) { $pc11 = 20; continue $sw11; }
                    abcd.wu.j6(th, 200007312684874959L, this, r5);
                    $pc11 = 20; continue $sw11;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc11 = 6; continue $sw11; }
                    try {
                        abcd.wu.j6(200007312684874959L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 16; continue $sw11;
                    }
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    try {
                        r2 = r5.getButton(-1);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 16; continue $sw11;
                    }
                    if (r2 != null) { $pc11 = 9; continue $sw11; }
                    return;
                }
                case 9: {
                    if (abcd.Vl.Hw(v5(r5)) == true) { $pc11 = 11; continue $sw11; }
                    $pc11 = 13; continue $sw11;
                }
                case 13: {
                    r3 = false;
                    $pc11 = 14; continue $sw11;
                }
                case 14: {
                    try {
                        r2.setEnabled(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 16; continue $sw11;
                    }
                    return;
                }
                case 11: {
                    if (abcd.Vl.U2(FH(r5)) == false) { $pc11 = 13; continue $sw11; }
                    r3 = true;
                    { $pc11 = 14; continue $sw11; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
