package abcd;

@abcd.Interfacexu
public class rh extends com.aide.common.Abstractma {

    @abcd.Interfaceuu
    private static boolean VH;

    @abcd.Interfacetu
    private static boolean Zo;

    @abcd.Interfaceru(field = -3097312497375352368L)
    private java.lang.String EQ;

    @abcd.Interfaceru(field = 1646899450280302640L)
    private abcd.rh.a gn;

    @abcd.Interfaceru(field = 3714767747166659601L)
    private java.lang.String tp;

    @abcd.Interfaceru(field = 1663393257271961853L)
    private java.lang.CharSequence u7;

    public interface a {
        void j6(boolean r1, java.lang.String r2);
    }

    static {
        abcd.wu.j6(abcd.rh.class, 570958555126909067L, 570958555126909067L);
    }

    public rh(java.lang.String r10, java.lang.String r11, java.lang.String r12, abcd.rh.a r13) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 3;
        $sw0: while (true) {
            switch ($pc0) {
                case 7: {
                    th = $ex0;
                    if (VH == false) { $pc0 = 11; continue $sw0; }
                    abcd.wu.j6(th, -58103162200349085L, null, r10, r11, r12, r13);
                    $pc0 = 11; continue $sw0;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (Zo == false) { $pc0 = 5; continue $sw0; }
                    try {
                        abcd.wu.j6(-58103162200349085L, null, r10, r11, r12, r13);
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    $pc0 = 5; continue $sw0;
                }
                case 5: {
                    try {
                        this.u7 = r10;
                        this.EQ = r11;
                        this.tp = r12;
                        this.gn = r13;
                    } catch (java.lang.Throwable $t) {
                        $ex0 = $t;
                        $pc0 = 7; continue $sw0;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void DW(abcd.rh r0, android.app.AlertDialog r1) {
        r0.FH(r1);
    }

    @abcd.Interfacesu(method = 6889585926751959904L)
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
                    abcd.wu.j6(th, -2921395968523535616L, this, r6);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(-2921395968523535616L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    try {
                        r2 = (android.view.inputmethod.InputMethodManager) r6.getContext().getSystemService("input_method");
                        r2.hideSoftInputFromWindow(U2(r6).getWindowToken(), 0);
                        r2.hideSoftInputFromWindow(v5(r6).getWindowToken(), 0);
                        r2.hideSoftInputFromWindow(j3(r6).getWindowToken(), 0);
                        r2.hideSoftInputFromWindow(aM(r6).getWindowToken(), 0);
                        r2.hideSoftInputFromWindow(er(r6).getWindowToken(), 0);
                        r2.hideSoftInputFromWindow(EQ(r6).getWindowToken(), 0);
                        r2.hideSoftInputFromWindow(Ws(r6).getWindowToken(), 0);
                        r2.hideSoftInputFromWindow(J0(r6).getWindowToken(), 0);
                        r2.hideSoftInputFromWindow(u7(r6).getWindowToken(), 0);
                        r2.hideSoftInputFromWindow(lg(r6).getWindowToken(), 0);
                        r2.hideSoftInputFromWindow(VH(r6).getWindowToken(), 0);
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

    @abcd.Interfacesu(method = -2385989018343730425L)
    private android.widget.EditText EQ(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if (VH == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, -954561341241826065L, this, r5);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(-954561341241826065L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.createkeystoreName);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1427299092932691195L)
    private void FH(android.app.AlertDialog r19) {
        java.lang.String r3 = null;
        java.math.BigInteger r9 = null;
        java.lang.String r5 = null;
        java.lang.String r4 = null;
        java.lang.String r6 = null;
        java.lang.String r10 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (VH == false) { $pc3 = 13; continue $sw3; }
                    abcd.wu.j6(th, 1327163876020088477L, this, r19);
                    $pc3 = 13; continue $sw3;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(1327163876020088477L, this, r19);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    try {
                        r3 = Mr(r19);
                        r9 = java.math.BigInteger.ONE;
                        r5 = Hw(r19);
                        r4 = QX(r19);
                        r6 = QX(r19);
                        r10 = tp(r19);
                        com.aide.ui.U.j6(new abcd.Runnableqh(this, r3, r4, r5, r6, new java.util.Date(), new java.util.Date(java.lang.System.currentTimeMillis() + (((long) rN(r19)) * 31536000000L)), r9, r10, we(r19), J8(r19), gn(r19), a8(r19), Zo(r19)));
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

    @abcd.Interfacesu(method = -1051873170851904687L)
    private java.lang.String Hw(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 8: {
                    th = $ex4;
                    if (VH == false) { $pc4 = 12; continue $sw4; }
                    abcd.wu.j6(th, 39354419913805817L, this, r5);
                    $pc4 = 12; continue $sw4;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(39354419913805817L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 8; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    return v5(r5).getText().toString().trim();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -2970835056011249893L)
    private android.widget.EditText J0(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 8: {
                    th = $ex5;
                    if (VH == false) { $pc5 = 12; continue $sw5; }
                    abcd.wu.j6(th, -3173741928503173101L, this, r5);
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc5 = 6; continue $sw5; }
                    try {
                        abcd.wu.j6(-3173741928503173101L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 8; continue $sw5;
                    }
                    $pc5 = 6; continue $sw5;
                }
                case 6: {
                    return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.createkeystoreOrganization);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 40081365516300291L)
    private java.lang.String J8(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 8: {
                    th = $ex6;
                    if (VH == false) { $pc6 = 12; continue $sw6; }
                    abcd.wu.j6(th, -1580144667537984053L, this, r5);
                    $pc6 = 12; continue $sw6;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc6 = 6; continue $sw6; }
                    try {
                        abcd.wu.j6(-1580144667537984053L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 8; continue $sw6;
                    }
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    return Ws(r5).getText().toString().trim();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 15549895966954180L)
    private java.lang.String Mr(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 8: {
                    th = $ex7;
                    if (VH == false) { $pc7 = 12; continue $sw7; }
                    abcd.wu.j6(th, -5122548082567647564L, this, r5);
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(-5122548082567647564L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    return U2(r5).getText().toString().trim();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 680720132582765184L)
    private java.lang.String QX(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 8: {
                    th = $ex8;
                    if (VH == false) { $pc8 = 12; continue $sw8; }
                    abcd.wu.j6(th, 813534989046649408L, this, r5);
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(813534989046649408L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    return j3(r5).getText().toString().trim();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -2320893560256460623L)
    private android.widget.EditText U2(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 8: {
                    th = $ex9;
                    if (VH == false) { $pc9 = 12; continue $sw9; }
                    abcd.wu.j6(th, -922651158293970687L, this, r5);
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc9 = 6; continue $sw9; }
                    try {
                        abcd.wu.j6(-922651158293970687L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 8; continue $sw9;
                    }
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.createkeystorePath);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1695426915671515776L)
    private android.widget.EditText VH(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 4;
        $sw10: while (true) {
            switch ($pc10) {
                case 8: {
                    th = $ex10;
                    if (VH == false) { $pc10 = 12; continue $sw10; }
                    abcd.wu.j6(th, 1205083892986867056L, this, r5);
                    $pc10 = 12; continue $sw10;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc10 = 6; continue $sw10; }
                    try {
                        abcd.wu.j6(1205083892986867056L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 8; continue $sw10;
                    }
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.createkeystoreCountry);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2769040807497675256L)
    private android.widget.EditText Ws(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 4;
        $sw11: while (true) {
            switch ($pc11) {
                case 8: {
                    th = $ex11;
                    if (VH == false) { $pc11 = 12; continue $sw11; }
                    abcd.wu.j6(th, -768590386549048032L, this, r5);
                    $pc11 = 12; continue $sw11;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc11 = 6; continue $sw11; }
                    try {
                        abcd.wu.j6(-768590386549048032L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 8; continue $sw11;
                    }
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.createkeystoreOrganizationalUnit);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 3366550914960961752L)
    private java.lang.String XL(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 4;
        $sw12: while (true) {
            switch ($pc12) {
                case 8: {
                    th = $ex12;
                    if (VH == false) { $pc12 = 12; continue $sw12; }
                    abcd.wu.j6(th, -647006229061864208L, this, r5);
                    $pc12 = 12; continue $sw12;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc12 = 6; continue $sw12; }
                    try {
                        abcd.wu.j6(-647006229061864208L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 8; continue $sw12;
                    }
                    $pc12 = 6; continue $sw12;
                }
                case 6: {
                    return aM(r5).getText().toString().trim();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 518173262568870417L)
    private java.lang.String Zo(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 4;
        $sw13: while (true) {
            switch ($pc13) {
                case 8: {
                    th = $ex13;
                    if (VH == false) { $pc13 = 12; continue $sw13; }
                    abcd.wu.j6(th, -594061320860409207L, this, r5);
                    $pc13 = 12; continue $sw13;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc13 = 6; continue $sw13; }
                    try {
                        abcd.wu.j6(-594061320860409207L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 8; continue $sw13;
                    }
                    $pc13 = 6; continue $sw13;
                }
                case 6: {
                    return VH(r5).getText().toString().trim();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -822389887291286556L)
    private java.lang.String a8(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 4;
        $sw14: while (true) {
            switch ($pc14) {
                case 8: {
                    th = $ex14;
                    if (VH == false) { $pc14 = 12; continue $sw14; }
                    abcd.wu.j6(th, 112449284067021700L, this, r5);
                    $pc14 = 12; continue $sw14;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc14 = 6; continue $sw14; }
                    try {
                        abcd.wu.j6(112449284067021700L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 8; continue $sw14;
                    }
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    return lg(r5).getText().toString().trim();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -3483383981477383305L)
    private android.widget.EditText aM(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = 4;
        $sw15: while (true) {
            switch ($pc15) {
                case 8: {
                    th = $ex15;
                    if (VH == false) { $pc15 = 12; continue $sw15; }
                    abcd.wu.j6(th, 2381288683859117063L, this, r5);
                    $pc15 = 12; continue $sw15;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc15 = 6; continue $sw15; }
                    try {
                        abcd.wu.j6(2381288683859117063L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 8; continue $sw15;
                    }
                    $pc15 = 6; continue $sw15;
                }
                case 6: {
                    return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.createkeystorePassword2);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1846300353548245272L)
    private android.widget.EditText er(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = 4;
        $sw16: while (true) {
            switch ($pc16) {
                case 8: {
                    th = $ex16;
                    if (VH == false) { $pc16 = 12; continue $sw16; }
                    abcd.wu.j6(th, -403346432161697728L, this, r5);
                    $pc16 = 12; continue $sw16;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc16 = 6; continue $sw16; }
                    try {
                        abcd.wu.j6(-403346432161697728L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 8; continue $sw16;
                    }
                    $pc16 = 6; continue $sw16;
                }
                case 6: {
                    return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.createkeystoreValidity);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 1313307645035191148L)
    private java.lang.String gn(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = 4;
        $sw17: while (true) {
            switch ($pc17) {
                case 8: {
                    th = $ex17;
                    if (VH == false) { $pc17 = 12; continue $sw17; }
                    abcd.wu.j6(th, 1148106482757580012L, this, r5);
                    $pc17 = 12; continue $sw17;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc17 = 6; continue $sw17; }
                    try {
                        abcd.wu.j6(1148106482757580012L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 8; continue $sw17;
                    }
                    $pc17 = 6; continue $sw17;
                }
                case 6: {
                    return u7(r5).getText().toString().trim();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 5538169492134630813L)
    private android.widget.EditText j3(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = 4;
        $sw18: while (true) {
            switch ($pc18) {
                case 8: {
                    th = $ex18;
                    if (VH == false) { $pc18 = 12; continue $sw18; }
                    abcd.wu.j6(th, -3539060210161209411L, this, r5);
                    $pc18 = 12; continue $sw18;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc18 = 6; continue $sw18; }
                    try {
                        abcd.wu.j6(-3539060210161209411L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 8; continue $sw18;
                    }
                    $pc18 = 6; continue $sw18;
                }
                case 6: {
                    return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.createkeystorePassword);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static abcd.rh.a j6(abcd.rh r0) {
        return r0.gn;
    }

    static void j6(abcd.rh r0, android.app.AlertDialog r1) {
        r0.DW(r1);
    }

    @abcd.Interfacesu(method = -2253710304931857511L)
    private android.widget.EditText lg(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = 4;
        $sw19: while (true) {
            switch ($pc19) {
                case 8: {
                    th = $ex19;
                    if (VH == false) { $pc19 = 12; continue $sw19; }
                    abcd.wu.j6(th, 533699287818600881L, this, r5);
                    $pc19 = 12; continue $sw19;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc19 = 6; continue $sw19; }
                    try {
                        abcd.wu.j6(533699287818600881L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 8; continue $sw19;
                    }
                    $pc19 = 6; continue $sw19;
                }
                case 6: {
                    return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.createkeystoreState);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2752373511361579575L)
    private int rN(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = 4;
        $sw20: while (true) {
            switch ($pc20) {
                case 10: {
                    th = $ex20;
                    if (VH == false) { $pc20 = 14; continue $sw20; }
                    abcd.wu.j6(th, -1700181441206012625L, this, r5);
                    $pc20 = 14; continue $sw20;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc20 = 15; continue $sw20; }
                    try {
                        abcd.wu.j6(-1700181441206012625L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 10; continue $sw20;
                    }
                    $pc20 = 15; continue $sw20;
                }
                case 15: {
                    return java.lang.Integer.parseInt(er(r5).getText().toString().trim());
                }
                case 8: {
                    return 0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 588842031307012704L)
    private java.lang.String tp(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = 4;
        $sw21: while (true) {
            switch ($pc21) {
                case 8: {
                    th = $ex21;
                    if (VH == false) { $pc21 = 12; continue $sw21; }
                    abcd.wu.j6(th, 1232354463437978600L, this, r5);
                    $pc21 = 12; continue $sw21;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc21 = 6; continue $sw21; }
                    try {
                        abcd.wu.j6(1232354463437978600L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 8; continue $sw21;
                    }
                    $pc21 = 6; continue $sw21;
                }
                case 6: {
                    return EQ(r5).getText().toString().trim();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2886593429845302861L)
    private android.widget.EditText u7(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = 4;
        $sw22: while (true) {
            switch ($pc22) {
                case 8: {
                    th = $ex22;
                    if (VH == false) { $pc22 = 12; continue $sw22; }
                    abcd.wu.j6(th, 3106608217135157805L, this, r5);
                    $pc22 = 12; continue $sw22;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc22 = 6; continue $sw22; }
                    try {
                        abcd.wu.j6(3106608217135157805L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 8; continue $sw22;
                    }
                    $pc22 = 6; continue $sw22;
                }
                case 6: {
                    return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.createkeystoreLocation);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 46347621939896660L)
    private android.widget.EditText v5(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex23 = null;
        int $pc23 = 4;
        $sw23: while (true) {
            switch ($pc23) {
                case 8: {
                    th = $ex23;
                    if (VH == false) { $pc23 = 12; continue $sw23; }
                    abcd.wu.j6(th, 1917094992085727348L, this, r5);
                    $pc23 = 12; continue $sw23;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc23 = 6; continue $sw23; }
                    try {
                        abcd.wu.j6(1917094992085727348L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 8; continue $sw23;
                    }
                    $pc23 = 6; continue $sw23;
                }
                case 6: {
                    return (android.widget.EditText) r5.findViewById(com.almlkaide.kaypro.R.id.createkeystoreAlias);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -3080236751416757776L)
    private java.lang.String we(android.app.AlertDialog r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex24 = null;
        int $pc24 = 4;
        $sw24: while (true) {
            switch ($pc24) {
                case 8: {
                    th = $ex24;
                    if (VH == false) { $pc24 = 12; continue $sw24; }
                    abcd.wu.j6(th, -1316555455924435320L, this, r5);
                    $pc24 = 12; continue $sw24;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc24 = 6; continue $sw24; }
                    try {
                        abcd.wu.j6(-1316555455924435320L, this, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 8; continue $sw24;
                    }
                    $pc24 = 6; continue $sw24;
                }
                case 6: {
                    return J0(r5).getText().toString().trim();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @Override
    @abcd.Interfacesu(method = -2781519187215238224L)
    protected android.app.Dialog j6(android.app.Activity r11) {
        android.view.View r2 = null;
        android.app.AlertDialog.Builder r3 = null;
        android.app.AlertDialog r4 = null;
        abcd.nh r5 = null;
        android.widget.EditText r6 = null;
        android.widget.EditText r7 = null;
        android.widget.EditText r8 = null;
        android.widget.EditText r9 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex25 = null;
        int $pc25 = 4;
        $sw25: while (true) {
            switch ($pc25) {
                case 8: {
                    th = $ex25;
                    if (VH == false) { $pc25 = 12; continue $sw25; }
                    abcd.wu.j6(th, 1979613089118669400L, this, r11);
                    $pc25 = 12; continue $sw25;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc25 = 6; continue $sw25; }
                    try {
                        abcd.wu.j6(1979613089118669400L, this, r11);
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 8; continue $sw25;
                    }
                    $pc25 = 6; continue $sw25;
                }
                case 6: {
                    try {
                        r2 = android.view.LayoutInflater.from(r11).inflate(com.almlkaide.kaypro.R.layout.createkeystore, null);
                        r3 = new android.app.AlertDialog.Builder(r11);
                        r3.setTitle(com.almlkaide.kaypro.R.string.dialog_title_create_keystore).setView(r2).setCancelable(true).setPositiveButton(com.almlkaide.kaypro.R.string.dialog_bt_create_keystore, new abcd.DialogInterfaceOnClickListenermh(this)).setNegativeButton(17039360, new abcd.DialogInterfaceOnClickListenerlh(this));
                        r4 = r3.create();
                        r5 = new abcd.nh(this, r4);
                        r6 = (android.widget.EditText) r2.findViewById(com.almlkaide.kaypro.R.id.createkeystorePath);
                        r6.addTextChangedListener(r5);
                        r7 = (android.widget.EditText) r2.findViewById(com.almlkaide.kaypro.R.id.createkeystoreAlias);
                        r7.addTextChangedListener(r5);
                        r8 = (android.widget.EditText) r2.findViewById(com.almlkaide.kaypro.R.id.createkeystorePassword);
                        r8.addTextChangedListener(r5);
                        r9 = (android.widget.EditText) r2.findViewById(com.almlkaide.kaypro.R.id.createkeystorePassword2);
                        r9.addTextChangedListener(r5);
                        ((android.widget.EditText) r2.findViewById(com.almlkaide.kaypro.R.id.createkeystoreValidity)).addTextChangedListener(r5);
                        ((android.widget.EditText) r2.findViewById(com.almlkaide.kaypro.R.id.createkeystoreName)).addTextChangedListener(r5);
                        ((android.widget.EditText) r2.findViewById(com.almlkaide.kaypro.R.id.createkeystoreOrganizationalUnit)).addTextChangedListener(r5);
                        ((android.widget.EditText) r2.findViewById(com.almlkaide.kaypro.R.id.createkeystoreOrganization)).addTextChangedListener(r5);
                        ((android.widget.EditText) r2.findViewById(com.almlkaide.kaypro.R.id.createkeystoreState)).addTextChangedListener(r5);
                        ((android.widget.EditText) r2.findViewById(com.almlkaide.kaypro.R.id.createkeystoreLocation)).addTextChangedListener(r5);
                        ((android.widget.EditText) r2.findViewById(com.almlkaide.kaypro.R.id.createkeystoreCountry)).addTextChangedListener(r5);
                        r6.setText(this.u7);
                        r7.setText(this.EQ);
                        r8.setText(this.tp);
                        r9.setText(this.tp);
                        r4.setOnShowListener(new abcd.DialogInterfaceOnShowListeneroh(this));
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 8; continue $sw25;
                    }
                    return r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 386151563015636465L)
    protected void j6(android.app.AlertDialog r6) {
        android.widget.Button r2 = null;
        java.lang.String r3 = null;
        boolean r4 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex26 = null;
        int $pc26 = 4;
        $sw26: while (true) {
            switch ($pc26) {
                case 26: {
                    th = $ex26;
                    if (VH == false) { $pc26 = 30; continue $sw26; }
                    abcd.wu.j6(th, 2639250644443242777L, this, r6);
                    $pc26 = 30; continue $sw26;
                }
                case 30: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (Zo == false) { $pc26 = 6; continue $sw26; }
                    try {
                        abcd.wu.j6(2639250644443242777L, this, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 26; continue $sw26;
                    }
                    $pc26 = 6; continue $sw26;
                }
                case 6: {
                    try {
                        r2 = r6.getButton(-1);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 26; continue $sw26;
                    }
                    if (r2 == null) { $pc26 = 33; continue $sw26; }
                    try {
                        r3 = Mr(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 26; continue $sw26;
                    }
                    if (abcd.Vl.U2(r3) == true) { $pc26 = 11; continue $sw26; }
                    $pc26 = 23; continue $sw26;
                }
                case 23: {
                    r4 = false;
                    $pc26 = 24; continue $sw26;
                }
                case 24: {
                    try {
                        r2.setEnabled(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 26; continue $sw26;
                    }
                    return;
                }
                case 11: {
                    if (abcd.Vl.Hw(r3) == true) { $pc26 = 23; continue $sw26; }
                    if (tp(r6).length() <= 0) { $pc26 = 23; continue $sw26; }
                    if (rN(r6) < 20) { $pc26 = 23; continue $sw26; }
                    if (Hw(r6).length() <= 0) { $pc26 = 23; continue $sw26; }
                    if (QX(r6).length() < 2) { $pc26 = 23; continue $sw26; }
                    if (QX(r6).equals(XL(r6)) == false) { $pc26 = 23; continue $sw26; }
                    r4 = true;
                    { $pc26 = 24; continue $sw26; }
                }
                case 33: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
