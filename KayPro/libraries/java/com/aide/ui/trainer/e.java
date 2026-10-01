package com.aide.ui.trainer;

@abcd.Interfacexu
public class e {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 2853263377798123500L)
    private boolean FH;

    @abcd.Interfaceru(field = 4503584321728343015L)
    private java.util.Set<java.lang.Long> Hw;

    @abcd.Interfaceru(field = -2645097344141993192L)
    private android.widget.Toast v5;

    static {
        abcd.wu.j6(com.aide.ui.trainer.e.class, 221157201561947787L, 221157201561947787L);
    }

    public e() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -297574364462958549L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-297574364462958549L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.FH = true;
                        this.Hw = new java.util.HashSet();
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

    @abcd.Interfacesu(method = 892486056931509375L)
    private void DW(android.content.Context r8, boolean r9) {
        android.content.SharedPreferences.Editor r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 7: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 11; continue $sw1; }
                    abcd.wu.j6(th, 420420788734058880L, this, r8, new java.lang.Boolean(r9));
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(420420788734058880L, this, r8, new java.lang.Boolean(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    try {
                        r0 = r8.getSharedPreferences("RunAppController", 0).edit();
                        r0.putBoolean("WAS_STARTED_SETTING", r9);
                        r0.commit();
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

    @abcd.Interfacesu(method = -3566859795971533516L)
    private java.lang.String FH(android.content.Context r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, -3225740262230010471L, this, r6);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-3225740262230010471L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    return r6.getSharedPreferences("RunAppController", 0).getString("TOAST_BUTTON_SETTING", "");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2584547906189071680L)
    private int Hw(android.content.Context r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, 4053417970824357001L, this, r6);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(4053417970824357001L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    return r6.getSharedPreferences("RunAppController", 0).getInt("TOAST_DURATION_SETTING", 0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -4478451687526743223L)
    private boolean VH(android.content.Context r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 8: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 12; continue $sw4; }
                    abcd.wu.j6(th, 2827354588986762816L, this, r6);
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(2827354588986762816L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    return r6.getSharedPreferences("RunAppController", 0).getBoolean("HAS_RUN_SETTING", false);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -4400174861997036720L)
    private java.lang.String Zo(android.content.Context r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 8: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, 220874735420168871L, this, r6);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(220874735420168871L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    return r6.getSharedPreferences("RunAppController", 0).getString("TOAST_TITLE_SETTING", "");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 3654868819262592153L)
    private boolean gn(android.content.Context r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 8: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 12; continue $sw6; }
                    abcd.wu.j6(th, 2282516770321706292L, this, r6);
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(2282516770321706292L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    return r6.getSharedPreferences("RunAppController", 0).getBoolean("SOUND_ENABLED", false);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static android.widget.Toast j6(com.aide.ui.trainer.e r0) {
        return r0.v5;
    }

    @abcd.Interfacesu(method = -4585183239225438080L)
    private void j6(android.content.Context r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15) {
        android.view.View r0 = null;
        android.widget.TextView r1 = null;
        android.widget.TextView r2 = null;
        android.widget.TextView r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 3;
        $sw7: while (true) {
            switch ($pc7) {
                case 20: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 24; continue $sw7; }
                    abcd.wu.j6(th, -1280659570339275091L, this, r11, r12, r13, r14, new java.lang.Integer(r15));
                    $pc7 = 24; continue $sw7;
                }
                case 24: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc7 = 5; continue $sw7; }
                    try {
                        abcd.wu.j6(-1280659570339275091L, this, r11, r12, r13, r14, new java.lang.Integer(r15));
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 20; continue $sw7;
                    }
                    $pc7 = 5; continue $sw7;
                }
                case 5: {
                    try {
                        r0 = android.view.LayoutInflater.from(r11).inflate(com.almlkaide.kaypro.R.layout.trainer_toast, null);
                        r1 = (android.widget.TextView) r0.findViewById(com.almlkaide.kaypro.R.id.trainerToastTitle);
                        r2 = (android.widget.TextView) r0.findViewById(com.almlkaide.kaypro.R.id.trainerToastText);
                        r3 = (android.widget.TextView) r0.findViewById(com.almlkaide.kaypro.R.id.trainerToastButton);
                        r1.setText(r12);
                        r2.setText(android.text.Html.fromHtml(r13));
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 20; continue $sw7;
                    }
                    if (r14 == null) { $pc7 = 8; continue $sw7; }
                    try {
                        r3.setText(r14);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 20; continue $sw7;
                    }
                    $pc7 = 9; continue $sw7;
                }
                case 9: {
                    try {
                        r1.setTextSize(com.aide.common.ClassG.gn(r11));
                        r2.setTextSize(com.aide.common.ClassG.u7(r11));
                        r3.setTextSize(com.aide.common.ClassG.v5(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 20; continue $sw7;
                    }
                    if (this.v5 == null) { $pc7 = 12; continue $sw7; }
                    try {
                        this.v5.cancel();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 20; continue $sw7;
                    }
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    try {
                        this.v5 = new android.widget.Toast(r11);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 20; continue $sw7;
                    }
                    if ("P".equals(android.os.Build.VERSION.CODENAME) == false) { $pc7 = 15; continue $sw7; }
                    try {
                        this.v5.setDuration(1);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 20; continue $sw7;
                    }
                    $pc7 = 18; continue $sw7;
                }
                case 18: {
                    try {
                        this.v5.setGravity(49, this.v5.getXOffset(), this.v5.getYOffset());
                        this.v5.setView(r0);
                        this.v5.show();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 20; continue $sw7;
                    }
                    return;
                }
                case 15: {
                    try {
                        this.v5.setDuration(0);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 20; continue $sw7;
                    }
                    if (r15 <= 2) { $pc7 = 18; continue $sw7; }
                    try {
                        new com.aide.ui.trainer.c(this, r15 * 1000, 1000).start();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 20; continue $sw7;
                    }
                    { $pc7 = 18; continue $sw7; }
                }
                case 8: {
                    try {
                        r3.setVisibility(8);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 20; continue $sw7;
                    }
                    { $pc7 = 9; continue $sw7; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -4494442696519281413L)
    private void j6(android.content.Context r8, boolean r9) {
        android.content.SharedPreferences.Editor r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 3;
        $sw8: while (true) {
            switch ($pc8) {
                case 7: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 11; continue $sw8; }
                    abcd.wu.j6(th, -1181747296391785084L, this, r8, new java.lang.Boolean(r9));
                    $pc8 = 11; continue $sw8;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc8 = 5; continue $sw8; }
                    try {
                        abcd.wu.j6(-1181747296391785084L, this, r8, new java.lang.Boolean(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 7; continue $sw8;
                    }
                    $pc8 = 5; continue $sw8;
                }
                case 5: {
                    try {
                        r0 = r8.getSharedPreferences("RunAppController", 0).edit();
                        r0.putBoolean("WAS_RUN_SETTING", r9);
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

    @abcd.Interfacesu(method = -13235061828226875L)
    private void j6(android.content.Context r8, boolean r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13, boolean r14) {
        android.content.SharedPreferences.Editor r15 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (j6 == false) { $pc9 = 5; continue $sw9; }
                    abcd.wu.j6(530569127130955440L, this, new java.lang.Object[]{r8, new java.lang.Boolean(r9), r10, r11, r12, new java.lang.Integer(r13), new java.lang.Boolean(r14)});
                    $pc9 = 5; continue $sw9;
                }
                case 5: {
                    r15 = r8.getSharedPreferences("RunAppController", 0).edit();
                    r15.putBoolean("WAS_STARTED_SETTING", true);
                    r15.putBoolean("IS_PLAYGROUND_SETTING", r9);
                    r15.putString("TOAST_TITLE_SETTING", r10);
                    r15.putString("TOAST_MESSAGE_SETTING", r11);
                    r15.putString("TOAST_BUTTON_SETTING", r12);
                    r15.putInt("TOAST_DURATION_SETTING", r13);
                    r15.putBoolean("SOUND_ENABLED", r14);
                    r15.commit();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static boolean j6(com.aide.ui.trainer.e r0, android.content.Context r1) {
        return r0.gn(r1);
    }

    @abcd.Interfacesu(method = -868530212890861839L)
    private void u7(android.content.Context r6) {
        android.content.SharedPreferences.Editor r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 4;
        $sw10: while (true) {
            switch ($pc10) {
                case 8: {
                    th = $ex10;
                    if (DW == false) { $pc10 = 12; continue $sw10; }
                    abcd.wu.j6(th, -3370410740114890440L, this, r6);
                    $pc10 = 12; continue $sw10;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc10 = 6; continue $sw10; }
                    try {
                        abcd.wu.j6(-3370410740114890440L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 8; continue $sw10;
                    }
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    try {
                        r2 = r6.getSharedPreferences("RunAppController", 0).edit();
                        r2.putBoolean("HAS_RUN_SETTING", true);
                        r2.commit();
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 8; continue $sw10;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -140775756344569689L)
    private java.lang.String v5(android.content.Context r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 4;
        $sw11: while (true) {
            switch ($pc11) {
                case 8: {
                    th = $ex11;
                    if (DW == false) { $pc11 = 12; continue $sw11; }
                    abcd.wu.j6(th, 1954103076871647512L, this, r6);
                    $pc11 = 12; continue $sw11;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc11 = 6; continue $sw11; }
                    try {
                        abcd.wu.j6(1954103076871647512L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 8; continue $sw11;
                    }
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    return r6.getSharedPreferences("RunAppController", 0).getString("TOAST_MESSAGE_SETTING", "");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void DW() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 4;
        $sw12: while (true) {
            switch ($pc12) {
                case 13: {
                    th = $ex12;
                    if (DW == false) { $pc12 = 17; continue $sw12; }
                    abcd.wu.j6(th, 2395072917251341135L, this);
                    $pc12 = 17; continue $sw12;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc12 = 6; continue $sw12; }
                    try {
                        abcd.wu.j6(2395072917251341135L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 13; continue $sw12;
                    }
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    try {
                        this.FH = true;
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 13; continue $sw12;
                    }
                    if (j6(com.aide.ui.U.Zo()) == false) { $pc12 = 20; continue $sw12; }
                    try {
                        j6(com.aide.ui.U.Zo(), false);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 13; continue $sw12;
                    }
                    if (this.v5 == null) { $pc12 = 11; continue $sw12; }
                    try {
                        this.v5.cancel();
                        this.v5 = null;
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 13; continue $sw12;
                    }
                    $pc12 = 11; continue $sw12;
                }
                case 11: {
                    try {
                        new android.os.Handler().postDelayed(new com.aide.ui.trainer.d(this), 500);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 13; continue $sw12;
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

    public boolean DW(android.content.Context r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 4;
        $sw13: while (true) {
            switch ($pc13) {
                case 8: {
                    th = $ex13;
                    if (DW == false) { $pc13 = 12; continue $sw13; }
                    abcd.wu.j6(th, -199396731430747321L, this, r6);
                    $pc13 = 12; continue $sw13;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc13 = 6; continue $sw13; }
                    try {
                        abcd.wu.j6(-199396731430747321L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 8; continue $sw13;
                    }
                    $pc13 = 6; continue $sw13;
                }
                case 6: {
                    return r6.getSharedPreferences("RunAppController", 0).getBoolean("WAS_STARTED_SETTING", false);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean FH() {
        android.content.Context r9 = null;
        boolean r10 = false;
        java.lang.String r11 = null;
        java.lang.String r12 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 4;
        $sw14: while (true) {
            switch ($pc14) {
                case 18: {
                    th = $ex14;
                    if (DW == false) { $pc14 = 22; continue $sw14; }
                    abcd.wu.j6(th, -529265911346797729L, this);
                    $pc14 = 22; continue $sw14;
                }
                case 22: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc14 = 23; continue $sw14; }
                    try {
                        abcd.wu.j6(-529265911346797729L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 18; continue $sw14;
                    }
                    $pc14 = 23; continue $sw14;
                }
                case 23: {
                    try {
                        r9 = com.aide.ui.U.Zo();
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        if ($t instanceof android.provider.Settings.SettingNotFoundException) { $pc14 = 17; continue $sw14; }
                        $pc14 = 18; continue $sw14;
                    }
                    if (android.provider.Settings.Secure.getInt(r9.getContentResolver(), "install_non_market_apps") != 1) { $pc14 = 10; continue $sw14; }
                    r10 = true;
                    $pc14 = 11; continue $sw14;
                }
                case 11: {
                    if (r10 == true) { $pc14 = 14; continue $sw14; }
                    try {
                        abcd.F.j6("Exercise app was not run unknown sources: " + com.aide.ui.U.SI().J8());
                        r11 = r9.getResources().getString(com.almlkaide.kaypro.R.string.trainer_on_enable_unknown_sources);
                        j6(r9, "⚠", r11, null, 5);
                        r9.startActivity(new android.content.Intent("android.settings.SECURITY_SETTINGS"));
                        com.aide.ui.U.SI().DW(r11);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        if ($t instanceof android.provider.Settings.SettingNotFoundException) { $pc14 = 17; continue $sw14; }
                        $pc14 = 18; continue $sw14;
                    }
                    $pc14 = 16; continue $sw14;
                }
                case 16: {
                    return r10;
                }
                case 14: {
                    if (VH(r9) == true) { $pc14 = 16; continue $sw14; }
                    try {
                        r12 = r9.getResources().getString(com.almlkaide.kaypro.R.string.trainer_on_first_install);
                        j6(r9, "⚠", r12, null, 5);
                        com.aide.ui.U.SI().DW(r12);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        if ($t instanceof android.provider.Settings.SettingNotFoundException) { $pc14 = 17; continue $sw14; }
                        $pc14 = 18; continue $sw14;
                    }
                    { $pc14 = 16; continue $sw14; }
                }
                case 10: {
                    r10 = false;
                    throw new java.lang.IllegalStateException();
                }
                case 17: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = 4;
        $sw15: while (true) {
            switch ($pc15) {
                case 8: {
                    th = $ex15;
                    if (DW == false) { $pc15 = 12; continue $sw15; }
                    abcd.wu.j6(th, 4422172288166470288L, this);
                    $pc15 = 12; continue $sw15;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc15 = 6; continue $sw15; }
                    try {
                        abcd.wu.j6(4422172288166470288L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 8; continue $sw15;
                    }
                    $pc15 = 6; continue $sw15;
                }
                case 6: {
                    try {
                        this.FH = false;
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 8; continue $sw15;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(android.content.Context r8, long r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = 3;
        $sw16: while (true) {
            switch ($pc16) {
                case 19: {
                    th = $ex16;
                    if (DW == false) { $pc16 = 23; continue $sw16; }
                    abcd.wu.j6(th, 878924841870323508L, this, r8, new java.lang.Long(r9));
                    $pc16 = 23; continue $sw16;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc16 = 6; continue $sw16; }
                    try {
                        abcd.wu.j6(878924841870323508L, this, r8, new java.lang.Long(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 19; continue $sw16;
                    }
                    $pc16 = 6; continue $sw16;
                }
                case 6: {
                    if (DW(r8) == false) { $pc16 = 25; continue $sw16; }
                    try {
                        DW(r8, false);
                        u7(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 19; continue $sw16;
                    }
                    if (this.Hw.contains(java.lang.Long.valueOf(r9)) == true) { $pc16 = 26; continue $sw16; }
                    try {
                        this.Hw.add(java.lang.Long.valueOf(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 19; continue $sw16;
                    }
                    if (com.aide.ui.U.sh() == false) { $pc16 = 12; continue $sw16; }
                    try {
                        j6(r8, true);
                        new android.os.Handler().postDelayed(new com.aide.ui.trainer.b(this, r8), 2000);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 19; continue $sw16;
                    }
                    return;
                }
                case 12: {
                    try {
                        abcd.F.j6("Exercise app was run: " + com.aide.ui.U.SI().J8());
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 19; continue $sw16;
                    }
                    if (this.FH == false) { $pc16 = 15; continue $sw16; }
                    try {
                        com.aide.ui.U.SI().nw();
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 19; continue $sw16;
                    }
                    return;
                }
                case 15: {
                    try {
                        j6(r8, true);
                        com.aide.ui.U.SI().er();
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 19; continue $sw16;
                    }
                    if (com.aide.ui.U.SI().a8() == true) { $pc16 = 29; continue $sw16; }
                    try {
                        j6(r8, Zo(r8), v5(r8), FH(r8), Hw(r8));
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 19; continue $sw16;
                    }
                    return;
                }
                case 29: {
                    return;
                }
                case 26: {
                    return;
                }
                case 25: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void j6(java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = 3;
        $sw17: while (true) {
            switch ($pc17) {
                case 10: {
                    th = $ex17;
                    if (DW == false) { $pc17 = 14; continue $sw17; }
                    abcd.wu.j6(th, 267554450065614045L, this, r10, r11, r12);
                    $pc17 = 14; continue $sw17;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc17 = 6; continue $sw17; }
                    try {
                        abcd.wu.j6(267554450065614045L, this, r10, r11, r12);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 10; continue $sw17;
                    }
                    $pc17 = 6; continue $sw17;
                }
                case 6: {
                    if (r12.length() <= 0) { $pc17 = 8; continue $sw17; }
                    try {
                        com.aide.ui.activities.AndroidTrainerActivity.j6(com.aide.ui.U.lg(), r12, com.aide.ui.U.SI().J0(), com.aide.ui.U.SI().VH().we(), com.aide.ui.U.SI().Ws(), com.aide.ui.U.SI().VH().EQ(), com.aide.ui.U.SI().a8());
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 10; continue $sw17;
                    }
                    return;
                }
                case 8: {
                    try {
                        j6(com.aide.ui.U.Zo(), com.aide.ui.U.SI().a8(), com.aide.ui.U.SI().J0(), com.aide.ui.U.SI().VH().we(), com.aide.ui.U.SI().Hw(), com.aide.ui.U.SI().VH().EQ(), com.aide.ui.aa.J0());
                        com.aide.ui.U.J0().j6(r10, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 10; continue $sw17;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j6(android.content.Context r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = 4;
        $sw18: while (true) {
            switch ($pc18) {
                case 8: {
                    th = $ex18;
                    if (DW == false) { $pc18 = 12; continue $sw18; }
                    abcd.wu.j6(th, -375650919703520625L, this, r6);
                    $pc18 = 12; continue $sw18;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc18 = 6; continue $sw18; }
                    try {
                        abcd.wu.j6(-375650919703520625L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 8; continue $sw18;
                    }
                    $pc18 = 6; continue $sw18;
                }
                case 6: {
                    return r6.getSharedPreferences("RunAppController", 0).getBoolean("WAS_RUN_SETTING", false);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
