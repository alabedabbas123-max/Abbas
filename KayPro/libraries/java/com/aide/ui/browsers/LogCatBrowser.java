package com.aide.ui.browsers;

@abcd.Interfacexu
public class LogCatBrowser extends android.widget.LinearLayout implements abcd.Gk.b, com.aide.ui.browsers.a {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    @abcd.Interfaceru(field = 2213379967895764992L)
    private boolean FH;

    @abcd.Interfaceru(field = 818110698334428443L)
    private boolean Hw;

    static {
        abcd.wu.j6(com.aide.ui.browsers.LogCatBrowser.class, 7477716827155690953L, 7477716827155690953L);
    }

    public LogCatBrowser(android.content.Context r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 3391270462590117360L, null, r6);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(3391270462590117360L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 8; continue $sw0;
                    }
                    $pc0 = 6; continue $sw0;
                }
                case 6: {
                    try {
                        super(r6);
                        QX();
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

    public LogCatBrowser(android.content.Context r8, android.util.AttributeSet r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 7: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 11; continue $sw1; }
                    abcd.wu.j6(th, 4840727608924488435L, null, r8, r9);
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(4840727608924488435L, null, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    try {
                        super(r8, r9);
                        QX();
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

    @abcd.Interfacesu(method = -154818912667366899L)
    private void QX() {
        android.view.View r2 = null;
        android.widget.ImageView r3 = null;
        boolean r5 = false;
        android.content.SharedPreferences r4 = null;
        int r6 = 0;
        java.lang.String r7 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 23: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 27; continue $sw2; }
                    abcd.wu.j6(th, -234241693491009035L, this);
                    $pc2 = 27; continue $sw2;
                }
                case 27: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-234241693491009035L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 23; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    try {
                        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
                        r2 = android.view.LayoutInflater.from(getContext()).inflate(com.almlkaide.kaypro.R.layout.logcatbrowser, null);
                        removeAllViews();
                        addView(r2);
                        r3 = (android.widget.ImageView) r2.findViewById(com.almlkaide.kaypro.R.id.logcatHeaderMenuButton);
                        r3.setOnClickListener(new com.aide.ui.browsers.m(this, r3));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 23; continue $sw2;
                    }
                    r5 = false;
                    try {
                        r4 = getContext().getSharedPreferences("Logcat", 0);
                        r6 = r4.getInt("FilterType", -1);
                        r7 = r4.getString("FilterValue", "");
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 23; continue $sw2;
                    }
                    if (r6 < 0) { $pc2 = 9; continue $sw2; }
                    r5 = true;
                    $pc2 = 9; continue $sw2;
                }
                case 9: {
                    try {
                        this.Hw = r5;
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 23; continue $sw2;
                    }
                    if (r6 == 0) { $pc2 = 20; continue $sw2; }
                    if (r6 != 1) { $pc2 = 13; continue $sw2; }
                    try {
                        getConsole().v5(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 23; continue $sw2;
                    }
                    $pc2 = 21; continue $sw2;
                }
                case 21: {
                    try {
                        com.aide.ui.U.a8().j6(this);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 23; continue $sw2;
                    }
                    return;
                }
                case 13: {
                    if (r6 != 2) { $pc2 = 15; continue $sw2; }
                    try {
                        getConsole().Hw(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 23; continue $sw2;
                    }
                    { $pc2 = 21; continue $sw2; }
                }
                case 15: {
                    if (r6 != 3) { $pc2 = 21; continue $sw2; }
                    try {
                        getConsole().DW(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 23; continue $sw2;
                    }
                    { $pc2 = 21; continue $sw2; }
                }
                case 20: {
                    try {
                        getConsole().FH(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 23; continue $sw2;
                    }
                    { $pc2 = 21; continue $sw2; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 364511122984474760L)
    private void XL() {
        abcd.Gk r2 = null;
        boolean r3 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 14: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 18; continue $sw3; }
                    abcd.wu.j6(th, -3598202661913812744L, this);
                    $pc3 = 18; continue $sw3;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(-3598202661913812744L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 14; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        r2 = com.aide.ui.U.a8();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 14; continue $sw3;
                    }
                    if (isShown() == true) { $pc3 = 9; continue $sw3; }
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    r3 = false;
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    try {
                        r2.j6(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 14; continue $sw3;
                    }
                    return;
                }
                case 9: {
                    if (this.FH == true) { $pc3 = 11; continue $sw3; }
                    r3 = true;
                    { $pc3 = 12; continue $sw3; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 882312505897087104L)
    private com.aide.ui.LogCatConsole getConsole() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 8: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 12; continue $sw4; }
                    abcd.wu.j6(th, -1552867225769129280L, this);
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(-1552867225769129280L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    return (com.aide.ui.LogCatConsole) findViewById(com.almlkaide.kaypro.R.id.logcatConsole);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static com.aide.ui.LogCatConsole j6(com.aide.ui.browsers.LogCatBrowser r0) {
        return r0.getConsole();
    }

    @abcd.Interfacesu(method = -1044960461859182555L)
    private void j6(int r8, java.lang.String r9) {
        boolean r2 = false;
        android.content.SharedPreferences.Editor r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 3;
        $sw5: while (true) {
            switch ($pc5) {
                case 10: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 14; continue $sw5; }
                    abcd.wu.j6(th, 1816673659634517117L, this, new java.lang.Integer(r8), r9);
                    $pc5 = 14; continue $sw5;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc5 = 5; continue $sw5; }
                    try {
                        abcd.wu.j6(1816673659634517117L, this, new java.lang.Integer(r8), r9);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 10; continue $sw5;
                    }
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    r2 = false;
                    try {
                        r0 = getContext().getSharedPreferences("Logcat", 0).edit();
                        r0.putInt("FilterType", r8);
                        r0.putString("FilterValue", r9);
                        r0.commit();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 10; continue $sw5;
                    }
                    if (r8 < 0) { $pc5 = 8; continue $sw5; }
                    r2 = true;
                    $pc5 = 8; continue $sw5;
                }
                case 8: {
                    try {
                        this.Hw = r2;
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 10; continue $sw5;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(com.aide.ui.browsers.LogCatBrowser r0, int r1, java.lang.String r2) {
        r0.j6(r1, r2);
    }

    @Override
    public void DW() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 8: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 12; continue $sw6; }
                    abcd.wu.j6(th, -2240505120460587047L, this);
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(-2240505120460587047L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    try {
                        XL();
                        com.aide.ui.U.a8().Zo();
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

    public void EQ() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 8: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 12; continue $sw7; }
                    abcd.wu.j6(th, -2005681202283578379L, this);
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(-2005681202283578379L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    try {
                        getConsole().er();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void FH() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 8: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 12; continue $sw8; }
                    abcd.wu.j6(th, 3706890429276918991L, this);
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(3706890429276918991L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    try {
                        getConsole().a8();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Hw() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 8: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 12; continue $sw9; }
                    abcd.wu.j6(th, 385753486758046632L, this);
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc9 = 6; continue $sw9; }
                    try {
                        abcd.wu.j6(385753486758046632L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 8; continue $sw9;
                    }
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    try {
                        j6(-1, "");
                        getConsole().lg();
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 8; continue $sw9;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean J0() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 4;
        $sw10: while (true) {
            switch ($pc10) {
                case 8: {
                    th = $ex10;
                    if (DW == false) { $pc10 = 12; continue $sw10; }
                    abcd.wu.j6(th, -3205440259059028185L, this);
                    $pc10 = 12; continue $sw10;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc10 = 6; continue $sw10; }
                    try {
                        abcd.wu.j6(-3205440259059028185L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 8; continue $sw10;
                    }
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    return this.FH;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void J8() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 4;
        $sw11: while (true) {
            switch ($pc11) {
                case 8: {
                    th = $ex11;
                    if (DW == false) { $pc11 = 12; continue $sw11; }
                    abcd.wu.j6(th, -2186967230605215707L, this);
                    $pc11 = 12; continue $sw11;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc11 = 6; continue $sw11; }
                    try {
                        abcd.wu.j6(-2186967230605215707L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 8; continue $sw11;
                    }
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    try {
                        this.FH = true;
                        XL();
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 8; continue $sw11;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void VH() {
        java.lang.String r2 = null;
        java.lang.String r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 4;
        $sw12: while (true) {
            switch ($pc12) {
                case 10: {
                    th = $ex12;
                    if (DW == false) { $pc12 = 14; continue $sw12; }
                    abcd.wu.j6(th, -3258117951479065443L, this);
                    $pc12 = 14; continue $sw12;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc12 = 6; continue $sw12; }
                    try {
                        abcd.wu.j6(-3258117951479065443L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 10; continue $sw12;
                    }
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    try {
                        r2 = com.aide.ui.U.vy().J0();
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 10; continue $sw12;
                    }
                    if (abcd.C0790gj.P8(r2) == false) { $pc12 = 17; continue $sw12; }
                    try {
                        r3 = abcd.C0790gj.FH(r2, com.aide.ui.U.vy().tp());
                        j6(3, r3);
                        getConsole().DW(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 10; continue $sw12;
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

    public void Ws() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 4;
        $sw13: while (true) {
            switch ($pc13) {
                case 8: {
                    th = $ex13;
                    if (DW == false) { $pc13 = 12; continue $sw13; }
                    abcd.wu.j6(th, 836057295500169096L, this);
                    $pc13 = 12; continue $sw13;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc13 = 6; continue $sw13; }
                    try {
                        abcd.wu.j6(836057295500169096L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 8; continue $sw13;
                    }
                    $pc13 = 6; continue $sw13;
                }
                case 6: {
                    try {
                        this.FH = false;
                        XL();
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 8; continue $sw13;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void Zo() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 4;
        $sw14: while (true) {
            switch ($pc14) {
                case 8: {
                    th = $ex14;
                    if (DW == false) { $pc14 = 12; continue $sw14; }
                    abcd.wu.j6(th, -240674225994284784L, this);
                    $pc14 = 12; continue $sw14;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc14 = 6; continue $sw14; }
                    try {
                        abcd.wu.j6(-240674225994284784L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 8; continue $sw14;
                    }
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    try {
                        getConsole().v5();
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 8; continue $sw14;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void gn() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = 4;
        $sw15: while (true) {
            switch ($pc15) {
                case 8: {
                    th = $ex15;
                    if (DW == false) { $pc15 = 12; continue $sw15; }
                    abcd.wu.j6(th, -3641153637260431752L, this);
                    $pc15 = 12; continue $sw15;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc15 = 6; continue $sw15; }
                    try {
                        abcd.wu.j6(-3641153637260431752L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 8; continue $sw15;
                    }
                    $pc15 = 6; continue $sw15;
                }
                case 6: {
                    try {
                        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), "Priority", getConsole().getAllPriortities(), new com.aide.ui.browsers.p(this));
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

    @Override
    public void j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = 4;
        $sw16: while (true) {
            switch ($pc16) {
                case 8: {
                    th = $ex16;
                    if (DW == false) { $pc16 = 12; continue $sw16; }
                    abcd.wu.j6(th, -2534558566514297031L, this);
                    $pc16 = 12; continue $sw16;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc16 = 6; continue $sw16; }
                    try {
                        abcd.wu.j6(-2534558566514297031L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 8; continue $sw16;
                    }
                    $pc16 = 6; continue $sw16;
                }
                case 6: {
                    try {
                        getConsole().gn();
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 8; continue $sw16;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    public void j6(abcd.Gk.a r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = 4;
        $sw17: while (true) {
            switch ($pc17) {
                case 8: {
                    th = $ex17;
                    if (DW == false) { $pc17 = 12; continue $sw17; }
                    abcd.wu.j6(th, -4444229387523971408L, this, r5);
                    $pc17 = 12; continue $sw17;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc17 = 6; continue $sw17; }
                    try {
                        abcd.wu.j6(-4444229387523971408L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 8; continue $sw17;
                    }
                    $pc17 = 6; continue $sw17;
                }
                case 6: {
                    try {
                        getConsole().j6(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 8; continue $sw17;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = 238041878469925768L)
    protected void onVisibilityChanged(android.view.View r8, int r9) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = 3;
        $sw18: while (true) {
            switch ($pc18) {
                case 7: {
                    th = $ex18;
                    if (DW == false) { $pc18 = 11; continue $sw18; }
                    abcd.wu.j6(th, -286682196272051320L, this, r8, new java.lang.Integer(r9));
                    $pc18 = 11; continue $sw18;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc18 = 5; continue $sw18; }
                    try {
                        abcd.wu.j6(-286682196272051320L, this, r8, new java.lang.Integer(r9));
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 7; continue $sw18;
                    }
                    $pc18 = 5; continue $sw18;
                }
                case 5: {
                    try {
                        super.onVisibilityChanged(r8, r9);
                        XL();
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 7; continue $sw18;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void tp() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = 4;
        $sw19: while (true) {
            switch ($pc19) {
                case 8: {
                    th = $ex19;
                    if (DW == false) { $pc19 = 12; continue $sw19; }
                    abcd.wu.j6(th, -3258842333447503116L, this);
                    $pc19 = 12; continue $sw19;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc19 = 6; continue $sw19; }
                    try {
                        abcd.wu.j6(-3258842333447503116L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 8; continue $sw19;
                    }
                    $pc19 = 6; continue $sw19;
                }
                case 6: {
                    try {
                        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), "Tag", getConsole().getAllTags(), new com.aide.ui.browsers.o(this));
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 8; continue $sw19;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void u7() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = 4;
        $sw20: while (true) {
            switch ($pc20) {
                case 8: {
                    th = $ex20;
                    if (DW == false) { $pc20 = 12; continue $sw20; }
                    abcd.wu.j6(th, 2216493261410518929L, this);
                    $pc20 = 12; continue $sw20;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc20 = 6; continue $sw20; }
                    try {
                        abcd.wu.j6(2216493261410518929L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 8; continue $sw20;
                    }
                    $pc20 = 6; continue $sw20;
                }
                case 6: {
                    try {
                        com.aide.common.Abstractma.j6(com.aide.ui.U.lg(), "Process", getConsole().getAllProcesses(), new com.aide.ui.browsers.n(this));
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 8; continue $sw20;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void v5() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = 4;
        $sw21: while (true) {
            switch ($pc21) {
                case 8: {
                    th = $ex21;
                    if (DW == false) { $pc21 = 12; continue $sw21; }
                    abcd.wu.j6(th, -131349981993044319L, this);
                    $pc21 = 12; continue $sw21;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc21 = 6; continue $sw21; }
                    try {
                        abcd.wu.j6(-131349981993044319L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 8; continue $sw21;
                    }
                    $pc21 = 6; continue $sw21;
                }
                case 6: {
                    try {
                        getConsole().rN();
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 8; continue $sw21;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean we() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = 4;
        $sw22: while (true) {
            switch ($pc22) {
                case 8: {
                    th = $ex22;
                    if (DW == false) { $pc22 = 12; continue $sw22; }
                    abcd.wu.j6(th, -3874567268021625792L, this);
                    $pc22 = 12; continue $sw22;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc22 = 6; continue $sw22; }
                    try {
                        abcd.wu.j6(-3874567268021625792L, this);
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 8; continue $sw22;
                    }
                    $pc22 = 6; continue $sw22;
                }
                case 6: {
                    return this.Hw;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
