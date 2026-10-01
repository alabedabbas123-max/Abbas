package com.aide.appwizard;

@abcd.Interfacexu
public class AppWizardDesignActivity extends com.aide.appwizard.runtime.AppWizardActivity implements com.aide.common.UndoManager.a {

    @abcd.Interfaceuu
    private static boolean er;

    @abcd.Interfacetu
    private static boolean rN;

    @abcd.Interfaceru(field = -5352084308253688415L)
    private boolean BT;

    @abcd.Interfaceru(field = 2620692931698923016L)
    private com.aide.common.UndoManager gW;

    @abcd.Interfaceru(field = -2805678668597169024L)
    private com.aide.appwizard.B yS;

    static {
        abcd.wu.j6(com.aide.appwizard.AppWizardDesignActivity.class, 2913940607094183125L, 2913940607094183125L);
    }

    public AppWizardDesignActivity() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (er == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -6904562788031962339L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (rN == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-6904562788031962339L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        this.yS = new com.aide.appwizard.B(this);
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

    static com.aide.common.UndoManager DW(com.aide.appwizard.AppWizardDesignActivity r0) {
        return r0.gW;
    }

    @abcd.Interfacesu(method = 250922864455321960L)
    private org.w3c.dom.Document DW(java.lang.String r5) {
        java.io.ByteArrayInputStream r2 = null;
        org.w3c.dom.Document r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (er == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, -707556527892343976L, this, r5);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (rN == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-707556527892343976L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        r2 = new java.io.ByteArrayInputStream(r5.getBytes());
                        r3 = com.aide.common.pa.j6(r2);
                        r2.close();
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -796916692242759036L)
    private void DW(boolean r6) {
        android.content.SharedPreferences.Editor r2 = null;
        java.util.Iterator<android.support.v4.app.Fragment> r3 = null;
        android.support.v4.app.Fragment r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 14: {
                    th = $ex2;
                    if (er == false) { $pc2 = 19; continue $sw2; }
                    abcd.wu.j6(th, -596202950687543532L, this, new java.lang.Boolean(r6));
                    $pc2 = 19; continue $sw2;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (rN == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-596202950687543532L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 14; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        r2 = getSharedPreferences("AppWizard", 0).edit();
                        r2.putBoolean("PREF_APPWIZARD_EDITMODE", r6);
                        r2.commit();
                        r3 = FH().FH().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 14; continue $sw2;
                    }
                    $pc2 = 8; continue $sw2;
                }
                case 8: {
                    if (r3.hasNext() == false) { $pc2 = 12; continue $sw2; }
                    try {
                        r4 = r3.next();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 14; continue $sw2;
                    }
                    if ((r4 instanceof com.aide.appwizard.h) == false) { $pc2 = 8; continue $sw2; }
                    try {
                        ((com.aide.appwizard.h) r4).OW();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 14; continue $sw2;
                    }
                    { $pc2 = 8; continue $sw2; }
                }
                case 12: {
                    try {
                        aM();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 14; continue $sw2;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -914337038102759600L)
    private void FH(java.lang.String r5) {
        java.io.FileWriter r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (er == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, -377184259200432992L, this, r5);
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (rN == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(-377184259200432992L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        r2 = new java.io.FileWriter(XL());
                        r2.write(r5);
                        r2.close();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 4106308932470283168L)
    private java.lang.String XL() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 8: {
                    th = $ex4;
                    if (er == false) { $pc4 = 12; continue $sw4; }
                    abcd.wu.j6(th, 168272603472369888L, this);
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (rN == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(168272603472369888L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    return J0() + "/assets/app.xml";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 1624984027671534292L)
    private void aM() {
        android.widget.ImageView r2 = null;
        android.view.View r3 = null;
        int r4 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 16: {
                    th = $ex5;
                    if (er == false) { $pc5 = 20; continue $sw5; }
                    abcd.wu.j6(th, -2205098022962184540L, this);
                    $pc5 = 20; continue $sw5;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (rN == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(-2205098022962184540L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 16; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    try {
                        r2 = (android.widget.ImageView) findViewById(com.aide.ui.Na.appwizardModeButton);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 16; continue $sw5;
                    }
                    if (QX() == false) { $pc5 = 9; continue $sw5; }
                    try {
                        r2.setImageResource(com.aide.ui.R$drawable.ic_menu_edit);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 16; continue $sw5;
                    }
                    $pc5 = 10; continue $sw5;
                }
                case 10: {
                    try {
                        r3 = findViewById(com.aide.ui.Na.appwizardEditButtonLayout);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 16; continue $sw5;
                    }
                    if (QX() == false) { $pc5 = 13; continue $sw5; }
                    r4 = 0;
                    $pc5 = 14; continue $sw5;
                }
                case 14: {
                    try {
                        r3.setVisibility(r4);
                        findViewById(com.aide.ui.Na.appwizardUndoButton).setEnabled(this.gW.DW());
                        findViewById(com.aide.ui.Na.appwizardRedoButton).setEnabled(this.gW.j6());
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 16; continue $sw5;
                    }
                    return;
                }
                case 13: {
                    r4 = 8;
                    { $pc5 = 14; continue $sw5; }
                }
                case 9: {
                    try {
                        r2.setImageResource(com.aide.ui.R$drawable.ic_menu_view);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 16; continue $sw5;
                    }
                    { $pc5 = 10; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2102742534531679011L)
    private void j3() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 8: {
                    th = $ex6;
                    if (er == false) { $pc6 = 12; continue $sw6; }
                    abcd.wu.j6(th, 2597880133305324571L, this);
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (rN == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(2597880133305324571L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    try {
                        aM();
                        findViewById(com.aide.ui.Na.appwizardModeButton).setOnClickListener(new com.aide.appwizard.ViewOnClickListenerb(this));
                        findViewById(com.aide.ui.Na.appwizardEditButton).setOnClickListener(new com.aide.appwizard.ViewOnClickListenerc(this));
                        findViewById(com.aide.ui.Na.appwizardUndoButton).setOnClickListener(new com.aide.appwizard.ViewOnClickListenerd(this));
                        findViewById(com.aide.ui.Na.appwizardRedoButton).setOnClickListener(new com.aide.appwizard.e(this));
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static com.aide.appwizard.B j6(com.aide.appwizard.AppWizardDesignActivity r0) {
        return r0.yS;
    }

    static void j6(com.aide.appwizard.AppWizardDesignActivity r0, boolean r1) {
        r0.DW(r1);
    }

    @Override
    public void DW() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 10: {
                    th = $ex7;
                    if (er == false) { $pc7 = 14; continue $sw7; }
                    abcd.wu.j6(th, 264662972645095557L, this);
                    $pc7 = 14; continue $sw7;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (rN == false) { $pc7 = 7; continue $sw7; }
                    try {
                        abcd.wu.j6(264662972645095557L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 10; continue $sw7;
                    }
                    $pc7 = 7; continue $sw7;
                }
                case 7: {
                    if (this.BT == false) { $pc7 = 17; continue $sw7; }
                    try {
                        aM();
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
    @abcd.Interfacesu(method = 3098058398552670469L)
    protected org.w3c.dom.Document EQ() {
        java.lang.String r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 10: {
                    th = $ex8;
                    if (er == false) { $pc8 = 14; continue $sw8; }
                    abcd.wu.j6(th, 2461068550482008733L, this);
                    $pc8 = 14; continue $sw8;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (rN == false) { $pc8 = 17; continue $sw8; }
                    try {
                        abcd.wu.j6(2461068550482008733L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 10; continue $sw8;
                    }
                    $pc8 = 17; continue $sw8;
                }
                case 17: {
                    try {
                        r2 = com.aide.appwizard.D.j6(XL());
                        this.gW.j6(XL(), r2, 0);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        if ($t instanceof java.lang.Exception) { $pc8 = 8; continue $sw8; }
                        $pc8 = 10; continue $sw8;
                    }
                    return DW(r2);
                }
                case 8: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String FH(int r6) {
        java.lang.String r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 8: {
                    th = $ex9;
                    if (er == false) { $pc9 = 12; continue $sw9; }
                    abcd.wu.j6(th, -8245276577243568135L, this, new java.lang.Integer(r6));
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (rN == false) { $pc9 = 6; continue $sw9; }
                    try {
                        abcd.wu.j6(-8245276577243568135L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 8; continue $sw9;
                    }
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    try {
                        r3 = "fragment" + (r6 + 1);
                        gn().j6(r6).j6(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 8; continue $sw9;
                    }
                    return j6(r3);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String J0() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 4;
        $sw10: while (true) {
            switch ($pc10) {
                case 8: {
                    th = $ex10;
                    if (er == false) { $pc10 = 12; continue $sw10; }
                    abcd.wu.j6(th, 3608242947054295088L, this);
                    $pc10 = 12; continue $sw10;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (rN == false) { $pc10 = 6; continue $sw10; }
                    try {
                        abcd.wu.j6(3608242947054295088L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 8; continue $sw10;
                    }
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    return com.aide.appwizard.D.j6() + "/AppProjects/AppWizard";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String J8() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 4;
        $sw11: while (true) {
            switch ($pc11) {
                case 8: {
                    th = $ex11;
                    if (er == false) { $pc11 = 12; continue $sw11; }
                    abcd.wu.j6(th, 4545960354605069604L, this);
                    $pc11 = 12; continue $sw11;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (rN == false) { $pc11 = 6; continue $sw11; }
                    try {
                        abcd.wu.j6(4545960354605069604L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 8; continue $sw11;
                    }
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    return J0() + "/res";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean QX() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 4;
        $sw12: while (true) {
            switch ($pc12) {
                case 8: {
                    th = $ex12;
                    if (er == false) { $pc12 = 12; continue $sw12; }
                    abcd.wu.j6(th, -641302897837442405L, this);
                    $pc12 = 12; continue $sw12;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (rN == false) { $pc12 = 6; continue $sw12; }
                    try {
                        abcd.wu.j6(-641302897837442405L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 8; continue $sw12;
                    }
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    return getSharedPreferences("AppWizard", 0).getBoolean("PREF_APPWIZARD_EDITMODE", true);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public com.aide.common.UndoManager Ws() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 4;
        $sw13: while (true) {
            switch ($pc13) {
                case 8: {
                    th = $ex13;
                    if (er == false) { $pc13 = 12; continue $sw13; }
                    abcd.wu.j6(th, 3962180854406689681L, this);
                    $pc13 = 12; continue $sw13;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (rN == false) { $pc13 = 6; continue $sw13; }
                    try {
                        abcd.wu.j6(3962180854406689681L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 8; continue $sw13;
                    }
                    $pc13 = 6; continue $sw13;
                }
                case 6: {
                    return this.gW;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 691631376643698848L)
    protected android.support.v4.app.Fragment j6(com.aide.appwizard.runtime.i.c r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 4;
        $sw14: while (true) {
            switch ($pc14) {
                case 8: {
                    th = $ex14;
                    if (er == false) { $pc14 = 12; continue $sw14; }
                    abcd.wu.j6(th, 6502358185241633248L, this, r5);
                    $pc14 = 12; continue $sw14;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (rN == false) { $pc14 = 6; continue $sw14; }
                    try {
                        abcd.wu.j6(6502358185241633248L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 8; continue $sw14;
                    }
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    return com.aide.appwizard.h.j6(r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String j6(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = 4;
        $sw15: while (true) {
            switch ($pc15) {
                case 11: {
                    th = $ex15;
                    if (er == false) { $pc15 = 15; continue $sw15; }
                    abcd.wu.j6(th, -6130386242084568387L, this, r5);
                    $pc15 = 15; continue $sw15;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (rN == false) { $pc15 = 6; continue $sw15; }
                    try {
                        abcd.wu.j6(-6130386242084568387L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 11; continue $sw15;
                    }
                    $pc15 = 6; continue $sw15;
                }
                case 6: {
                    if (r5 == null) { $pc15 = 9; continue $sw15; }
                    return J8() + "/layout/" + r5 + ".xml";
                }
                case 9: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(java.lang.String r9, java.lang.String r10, int r11) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = 9;
        $sw16: while (true) {
            switch ($pc16) {
                case 9: {
                    th = $ex16;
                    if (er == false) { $pc16 = 13; continue $sw16; }
                    abcd.wu.j6(th, 3682180538294556312L, this, r9, r10, new java.lang.Integer(r11));
                    $pc16 = 13; continue $sw16;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (rN == false) { $pc16 = 6; continue $sw16; }
                    try {
                        abcd.wu.j6(3682180538294556312L, this, r9, r10, new java.lang.Integer(r11));
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 9; continue $sw16;
                    }
                    $pc16 = 6; continue $sw16;
                }
                case 6: {
                    if (r9.equals(XL()) == false) { $pc16 = 18; continue $sw16; }
                    try {
                        FH(r10);
                        u7().j6(DW(r10), r11);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        if ($t instanceof java.lang.Exception) { $pc16 = 14; continue $sw16; }
                        $pc16 = 9; continue $sw16;
                    }
                    return;
                }
                case 19: {
                    return;
                }
                case 14: {
                    $pc16 = 18; continue $sw16;
                }
                case 18: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -970430955756054336L)
    protected void j6(org.w3c.dom.Document r8, int r9) {
        java.lang.String r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = 3;
        $sw17: while (true) {
            switch ($pc17) {
                case 7: {
                    th = $ex17;
                    if (er == false) { $pc17 = 11; continue $sw17; }
                    abcd.wu.j6(th, 29282458577692672L, this, r8, new java.lang.Integer(r9));
                    $pc17 = 11; continue $sw17;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (rN == false) { $pc17 = 13; continue $sw17; }
                    try {
                        abcd.wu.j6(29282458577692672L, this, r8, new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 7; continue $sw17;
                    }
                    $pc17 = 13; continue $sw17;
                }
                case 13: {
                    try {
                        r0 = new com.aide.appwizard.C().j6(r8);
                        this.gW.DW(XL(), r0, r9);
                        new java.io.File(XL()).getParentFile().mkdirs();
                        FH(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        if ($t instanceof java.lang.Exception) { $pc17 = 12; continue $sw17; }
                        $pc17 = 7; continue $sw17;
                    }
                    return;
                }
                case 12: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 604787746086475155L)
    protected void onCreate(android.os.Bundle r10) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = -1;
        $sw18: while (true) {
            switch ($pc18) {
                case -1: {
                    try {
                        abcd.wu.j6(this, 1570708489093L, "androidRelease", "https://backbone-direct.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/dev/probes.zip", "https://backbone-cdn.appfour.com/project/SvkPQDcCSkSU4JZRRqsTuw/variant/androidRelease/audience/public/probes.zip", "https://backbone-ingest.appfour.com/api/report/v1alpha1/data/project/SvkPQDcCSkSU4JZRRqsTuw");
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 14; continue $sw18;
                    }
                    if (rN == false) { $pc18 = 6; continue $sw18; }
                    try {
                        abcd.wu.j6(396469608976986363L, this, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 14; continue $sw18;
                    }
                    $pc18 = 6; continue $sw18;
                }
                case 6: {
                    try {
                        android.util.Log.d(getPackageName(), "onCreate()");
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 14; continue $sw18;
                    }
                    if (abcd.F.DW() == true) { $pc18 = 9; continue $sw18; }
                    try {
                        abcd.F.j6(this, new com.aide.appwizard.ClassA(this));
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 14; continue $sw18;
                    }
                    $pc18 = 9; continue $sw18;
                }
                case 9: {
                    try {
                        this.gW = new com.aide.common.UndoManager();
                        this.gW.j6(this);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 14; continue $sw18;
                    }
                    if (r10 == null) { $pc18 = 12; continue $sw18; }
                    try {
                        this.gW.j6(r10);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 14; continue $sw18;
                    }
                    $pc18 = 12; continue $sw18;
                }
                case 12: {
                    try {
                        super.onCreate(r10);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 14; continue $sw18;
                    }
                    return;
                }
                case 14: {
                    th = $ex18;
                    if (er == false) { $pc18 = 18; continue $sw18; }
                    abcd.wu.j6(th, 396469608976986363L, this, r10);
                    $pc18 = 18; continue $sw18;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 1056534037715966656L)
    protected android.app.Dialog onCreateDialog(int r8, android.os.Bundle r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = 3;
        $sw19: while (true) {
            switch ($pc19) {
                case 7: {
                    th = $ex19;
                    if (er == false) { $pc19 = 11; continue $sw19; }
                    abcd.wu.j6(th, -1250959508217015936L, this, new java.lang.Integer(r8), r9);
                    $pc19 = 11; continue $sw19;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (rN == false) { $pc19 = 5; continue $sw19; }
                    try {
                        abcd.wu.j6(-1250959508217015936L, this, new java.lang.Integer(r8), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 7; continue $sw19;
                    }
                    $pc19 = 5; continue $sw19;
                }
                case 5: {
                    return com.aide.common.Abstractma.j6(this, r8);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = 4;
        $sw20: while (true) {
            switch ($pc20) {
                case 8: {
                    th = $ex20;
                    if (er == false) { $pc20 = 12; continue $sw20; }
                    abcd.wu.j6(th, 4377392057228154327L, this, r5);
                    $pc20 = 12; continue $sw20;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (rN == false) { $pc20 = 15; continue $sw20; }
                    try {
                        abcd.wu.j6(4377392057228154327L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 8; continue $sw20;
                    }
                    return true;
                }
                case 15: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 2647583274613300205L)
    protected void onDestroy() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = 4;
        $sw21: while (true) {
            switch ($pc21) {
                case 10: {
                    th = $ex21;
                    if (er == false) { $pc21 = 14; continue $sw21; }
                    abcd.wu.j6(th, -1804378661955014315L, this);
                    $pc21 = 14; continue $sw21;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (rN == false) { $pc21 = 6; continue $sw21; }
                    try {
                        abcd.wu.j6(-1804378661955014315L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 10; continue $sw21;
                    }
                    $pc21 = 6; continue $sw21;
                }
                case 6: {
                    try {
                        super.onDestroy();
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 10; continue $sw21;
                    }
                    if (this.gW == null) { $pc21 = 17; continue $sw21; }
                    try {
                        this.gW.DW(this);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 10; continue $sw21;
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
    @abcd.Interfacesu(method = -1731010988790436612L)
    protected void onSaveInstanceState(android.os.Bundle r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = 4;
        $sw22: while (true) {
            switch ($pc22) {
                case 10: {
                    th = $ex22;
                    if (er == false) { $pc22 = 14; continue $sw22; }
                    abcd.wu.j6(th, 5908860950119534476L, this, r5);
                    $pc22 = 14; continue $sw22;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (rN == false) { $pc22 = 6; continue $sw22; }
                    try {
                        abcd.wu.j6(5908860950119534476L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 10; continue $sw22;
                    }
                    $pc22 = 6; continue $sw22;
                }
                case 6: {
                    try {
                        super.onSaveInstanceState(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 10; continue $sw22;
                    }
                    if (this.gW == null) { $pc22 = 17; continue $sw22; }
                    try {
                        this.gW.DW(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 10; continue $sw22;
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
    @abcd.Interfacesu(method = -6095803384248157827L)
    protected int tp() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex23 = null;
        int $pc23 = 4;
        $sw23: while (true) {
            switch ($pc23) {
                case 8: {
                    th = $ex23;
                    if (er == false) { $pc23 = 12; continue $sw23; }
                    abcd.wu.j6(th, 4667213631028605525L, this);
                    $pc23 = 12; continue $sw23;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (rN == false) { $pc23 = 6; continue $sw23; }
                    try {
                        abcd.wu.j6(4667213631028605525L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 8; continue $sw23;
                    }
                    $pc23 = 6; continue $sw23;
                }
                case 6: {
                    try {
                        setContentView(com.aide.ui.Oa.appwizard);
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 8; continue $sw23;
                    }
                    return com.aide.ui.Na.appwizardContentContainer;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void we() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex24 = null;
        int $pc24 = 4;
        $sw24: while (true) {
            switch ($pc24) {
                case 8: {
                    th = $ex24;
                    if (er == false) { $pc24 = 12; continue $sw24; }
                    abcd.wu.j6(th, -836416611662812612L, this);
                    $pc24 = 12; continue $sw24;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (rN == false) { $pc24 = 6; continue $sw24; }
                    try {
                        abcd.wu.j6(-836416611662812612L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 8; continue $sw24;
                    }
                    $pc24 = 6; continue $sw24;
                }
                case 6: {
                    try {
                        super.we();
                        this.BT = true;
                        j3();
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 8; continue $sw24;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
