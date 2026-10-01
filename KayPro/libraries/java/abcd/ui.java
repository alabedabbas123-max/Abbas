package abcd;

@abcd.Interfacexu
public class ui extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    static {
        abcd.wu.j6(abcd.ui.class, -4195144536276187105L, -4195144536276187105L);
    }

    public ui() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (VH == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -4910576453537338584L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-4910576453537338584L, null);
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

    static boolean DW(abcd.ui r0, android.app.AlertDialog r1) {
        return r0.FH(r1);
    }

    @abcd.Interfacesu(method = -2219398116819319803L)
    private boolean FH(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 13: {
                    th = $ex1;
                    if (VH == false) { $pc1 = 17; continue $sw1; }
                    abcd.wu.j6(th, -878408223698140944L, this, r5);
                    $pc1 = 17; continue $sw1;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc1 = 7; continue $sw1; }
                    try {
                        abcd.wu.j6(-878408223698140944L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 13; continue $sw1;
                    }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (Zo(r5).length() == 0) { $pc1 = 11; continue $sw1; }
                    if (gn(r5).equals(Zo(r5)) == true) { $pc1 = 11; continue $sw1; }
                    return true;
                }
                case 11: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -5573960183748699008L)
    private void Hw(android.app.AlertDialog r6) {
        android.view.inputmethod.InputMethodManager r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if (VH == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, 4274518944532211235L, this, r6);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(4274518944532211235L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        r2 = (android.view.inputmethod.InputMethodManager) r6.getContext().getSystemService("input_method");
                        r2.hideSoftInputFromWindow(v5(r6).getWindowToken(), 0);
                        r2.hideSoftInputFromWindow(VH(r6).getWindowToken(), 0);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -2150265422598495135L)
    private android.widget.EditText VH(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (VH == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, 2846712913976042272L, this, r5);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(2846712913976042272L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.replaceWithText);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 640147955846519265L)
    private java.lang.String Zo(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 8: {
                    th = $ex4;
                    if (VH == false) { $pc4 = 12; continue $sw4; }
                    abcd.wu.j6(th, 142505698703918356L, this, r5);
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(142505698703918356L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    return v5(r5).getText().toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -362242430075187200L)
    private java.lang.String gn(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 8: {
                    th = $ex5;
                    if (VH == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, -627713647852890783L, this, r5);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(-627713647852890783L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    return VH(r5).getText().toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(abcd.ui r0, android.app.AlertDialog r1) {
        r0.Hw(r1);
    }

    @abcd.Interfacesu(method = -2822391206186049720L)
    private android.widget.EditText v5(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 8: {
                    th = $ex6;
                    if (VH == false) { $pc6 = 12; continue $sw6; }
                    abcd.wu.j6(th, 2180589482704515701L, this, r5);
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(2180589482704515701L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.replaceFindText);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -2592561645331515781L)
    protected void DW(android.app.AlertDialog r5) {
        android.widget.Button r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 10: {
                    th = $ex7;
                    if (VH == false) { $pc7 = 14; continue $sw7; }
                    abcd.wu.j6(th, 678975074223110868L, this, r5);
                    $pc7 = 14; continue $sw7;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(678975074223110868L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 10; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    try {
                        r2 = r5.getButton(-1);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 10; continue $sw7;
                    }
                    if (r2 == null) { $pc7 = 17; continue $sw7; }
                    try {
                        r2.setEnabled(FH(r5));
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 10; continue $sw7;
                    }
                    return;
                }
                case 17: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 1853749979640786432L)
    protected android.app.Dialog j6(android.app.Activity r10) {
        abcd.Tl r2 = null;
        java.lang.String r3 = null;
        android.view.View r4 = null;
        android.app.AlertDialog.Builder r5 = null;
        android.app.AlertDialog r6 = null;
        android.widget.EditText r7 = null;
        android.widget.EditText r8 = null;
        android.widget.TextView r9 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 17: {
                    th = $ex8;
                    if (VH == false) { $pc8 = 21; continue $sw8; }
                    abcd.wu.j6(th, 1345564862924095537L, this, r10);
                    $pc8 = 21; continue $sw8;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(1345564862924095537L, this, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 17; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    try {
                        r2 = com.aide.ui.U.lg().J8().getCurrentFileSpan();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 17; continue $sw8;
                    }
                    r3 = "";
                    if (r2.Hw == r2.Zo) { $pc8 = 9; continue $sw8; }
                    $pc8 = 11; continue $sw8;
                }
                case 11: {
                    try {
                        r4 = android.view.LayoutInflater.from(r10).inflate(com.almlkaide.kaypro.R.layout.replace, null);
                        r5 = new android.app.AlertDialog.Builder(r10);
                        r5.setTitle(com.almlkaide.kaypro.R.string.command_replace_textually).setView(r4).setCancelable(true).setPositiveButton(com.almlkaide.kaypro.R.string.dialog_replace, new abcd.DialogInterfaceOnClickListeneroi(this)).setNegativeButton(com.almlkaide.kaypro.R.string.dialog_cancel, new abcd.DialogInterfaceOnClickListenerni(this));
                        r6 = r5.create();
                        r7 = (android.widget.EditText) r4.findViewById(com.almlkaide.kaypro.R.id.replaceFindText);
                        r8 = (android.widget.EditText) r4.findViewById(com.almlkaide.kaypro.R.id.replaceWithText);
                        r9 = (android.widget.TextView) r4.findViewById(com.almlkaide.kaypro.R.id.replaceScope);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 17; continue $sw8;
                    }
                    if (r2.Hw != r2.Zo) { $pc8 = 14; continue $sw8; }
                    try {
                        r9.setText(com.almlkaide.kaypro.R.string.dialog_replace_message_in_this_file);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 17; continue $sw8;
                    }
                    $pc8 = 15; continue $sw8;
                }
                case 15: {
                    try {
                        r7.setText(r3);
                        r7.setOnKeyListener(new abcd.ViewOnKeyListenerpi(this, r8));
                        r7.addTextChangedListener(new abcd.qi(this, r6));
                        r8.setText(r3);
                        r8.setOnKeyListener(new abcd.ViewOnKeyListenerri(this, r6));
                        r8.addTextChangedListener(new abcd.si(this, r6));
                        r6.getWindow().setSoftInputMode(2);
                        r6.setOnShowListener(new abcd.DialogInterfaceOnShowListenerti(this, r7));
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 17; continue $sw8;
                    }
                    return r6;
                }
                case 14: {
                    try {
                        r9.setText(com.almlkaide.kaypro.R.string.dialog_replace_message_in_selected_lines);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 17; continue $sw8;
                    }
                    { $pc8 = 15; continue $sw8; }
                }
                case 9: {
                    if (r2.v5 == r2.VH) { $pc8 = 11; continue $sw8; }
                    try {
                        r3 = com.aide.ui.U.lg().J8().getSelectionContent().trim();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 17; continue $sw8;
                    }
                    { $pc8 = 11; continue $sw8; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -363263751922773952L)
    protected void j6(android.app.AlertDialog r20) {
        java.lang.String r11 = null;
        java.lang.String r12 = null;
        abcd.Tl r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 11: {
                    th = $ex9;
                    if (VH == false) { $pc9 = 15; continue $sw9; }
                    abcd.wu.j6(th, -982286731689318033L, this, r20);
                    $pc9 = 15; continue $sw9;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc9 = 6; continue $sw9; }
                    try {
                        abcd.wu.j6(-982286731689318033L, this, r20);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 11; continue $sw9;
                    }
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    try {
                        r11 = Zo(r20);
                        r12 = gn(r20);
                        r0 = com.aide.ui.U.lg().J8().getCurrentFileSpan();
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 11; continue $sw9;
                    }
                    if (r0.Hw != r0.Zo) { $pc9 = 9; continue $sw9; }
                    try {
                        r0 = new abcd.Tl(r0.FH, 1, 1, Integer.MAX_VALUE, 1);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 11; continue $sw9;
                    }
                    $pc9 = 9; continue $sw9;
                }
                case 9: {
                    try {
                        com.aide.ui.U.EQ().j6(r0.FH, r0.Hw, r0.v5, r0.Zo, r0.VH, r11, r12);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 11; continue $sw9;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
