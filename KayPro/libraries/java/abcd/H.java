package abcd;

@abcd.Interfacexu
public class H {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(abcd.H.class, -631724314935631775L, -631724314935631775L);
    }

    public H() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 400620540988354127L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(400620540988354127L, null);
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

    public static int DW(android.content.Context r8, java.lang.String r9, double... r10) {
        android.content.SharedPreferences r0 = null;
        int r1 = 0;
        android.content.SharedPreferences.Editor r2 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 10: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 14; continue $sw1; }
                    abcd.wu.j6(th, -520151565633891585L, null, r8, r9, r10);
                    $pc1 = 14; continue $sw1;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(-520151565633891585L, null, r8, r9, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 10; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    try {
                        r0 = DW(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 10; continue $sw1;
                    }
                    if (r0.contains(r9) == true) { $pc1 = 8; continue $sw1; }
                    try {
                        r1 = j6(r10);
                        r2 = r0.edit();
                        r2.putInt(r9, r1);
                        r2.commit();
                        j6(r9, r1);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 10; continue $sw1;
                    }
                    $pc1 = 8; continue $sw1;
                }
                case 8: {
                    return r0.getInt(r9, 0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1403905902894147609L)
    private static android.content.SharedPreferences DW(android.content.Context r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, 1853143184556849504L, null, r5);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(1853143184556849504L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    return r5.getSharedPreferences("SplitTests", 0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 3310114134219083920L)
    private static java.lang.String DW(int r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 4;
        $sw3: while (true) {
            switch ($pc3) {
                case 8: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 12; continue $sw3; }
                    abcd.wu.j6(th, -2482867755154384323L, null, new java.lang.Integer(r5));
                    $pc3 = 12; continue $sw3;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(-2482867755154384323L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 8; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    return java.lang.Character.toString((char) (r5 + 65));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean DW(android.content.Context r7, java.lang.String r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 3;
        $sw4: while (true) {
            switch ($pc4) {
                case 10: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 14; continue $sw4; }
                    abcd.wu.j6(th, -1449882754732320003L, null, r7, r8);
                    $pc4 = 14; continue $sw4;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc4 = 5; continue $sw4; }
                    try {
                        abcd.wu.j6(-1449882754732320003L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 10; continue $sw4;
                    }
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    if (DW(r7, r8, j6(2)) == 0) { $pc4 = 8; continue $sw4; }
                    return true;
                }
                case 8: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2014466822845368320L)
    private static boolean DW(android.content.Context r8, java.lang.String r9, boolean r10) {
        android.content.SharedPreferences r0 = null;
        boolean r3 = false;
        android.content.SharedPreferences.Editor r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 3;
        $sw5: while (true) {
            switch ($pc5) {
                case 17: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 21; continue $sw5; }
                    abcd.wu.j6(th, 4389278610342810305L, null, r8, r9, new java.lang.Boolean(r10));
                    $pc5 = 21; continue $sw5;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc5 = 5; continue $sw5; }
                    try {
                        abcd.wu.j6(4389278610342810305L, null, r8, r9, new java.lang.Boolean(r10));
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 17; continue $sw5;
                    }
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    try {
                        r0 = j6(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 17; continue $sw5;
                    }
                    if (r10 == true) { $pc5 = 8; continue $sw5; }
                    $pc5 = 12; continue $sw5;
                }
                case 12: {
                    r3 = false;
                    $pc5 = 14; continue $sw5;
                }
                case 14: {
                    if (r0.getBoolean(r9, false) == true) { $pc5 = 16; continue $sw5; }
                    try {
                        r1 = r0.edit();
                        r1.putBoolean(r9, r10);
                        r1.commit();
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 17; continue $sw5;
                    }
                    $pc5 = 16; continue $sw5;
                }
                case 16: {
                    return r3;
                }
                case 8: {
                    if (r0.contains(r9) == false) { $pc5 = 12; continue $sw5; }
                    if (r0.getBoolean(r9, false) == true) { $pc5 = 12; continue $sw5; }
                    r3 = true;
                    { $pc5 = 14; continue $sw5; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2412988057358639712L)
    private static void FH(android.content.Context r7, java.lang.String r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 3;
        $sw6: while (true) {
            switch ($pc6) {
                case 7: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 11; continue $sw6; }
                    abcd.wu.j6(th, 815116290126791247L, null, r7, r8);
                    $pc6 = 11; continue $sw6;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc6 = 5; continue $sw6; }
                    try {
                        abcd.wu.j6(815116290126791247L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 7; continue $sw6;
                    }
                    $pc6 = 5; continue $sw6;
                }
                case 5: {
                    try {
                        abcd.F.j6("Conversion_" + r8);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 7; continue $sw6;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -4515226447643989528L)
    private static void Hw(android.content.Context r7, java.lang.String r8) {
        java.util.Iterator<java.util.Map.Entry<java.lang.String, ?>> r0 = null;
        java.util.Map.Entry<java.lang.String, ?> r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 3;
        $sw7: while (true) {
            switch ($pc7) {
                case 11: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 16; continue $sw7; }
                    abcd.wu.j6(th, 742861982389369581L, null, r7, r8);
                    $pc7 = 16; continue $sw7;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc7 = 5; continue $sw7; }
                    try {
                        abcd.wu.j6(742861982389369581L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 11; continue $sw7;
                    }
                    $pc7 = 5; continue $sw7;
                }
                case 5: {
                    try {
                        r0 = DW(r7).getAll().entrySet().iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 11; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    if (r0.hasNext() == false) { $pc7 = 10; continue $sw7; }
                    try {
                        r1 = r0.next();
                        j6(r7, r8, r1.getKey(), ((java.lang.Integer) r1.getValue()).intValue());
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 11; continue $sw7;
                    }
                    { $pc7 = 6; continue $sw7; }
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 216919943116405264L)
    private static int j6(double... r10) {
        double r3 = 0.0d;
        int r5 = 0;
        double r6 = 0.0d;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 18: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 23; continue $sw8; }
                    abcd.wu.j6(th, -1465681611648003165L, null, r10);
                    $pc8 = 23; continue $sw8;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(-1465681611648003165L, null, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 18; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    try {
                        r3 = new java.util.Random().nextDouble();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 18; continue $sw8;
                    }
                    r5 = 0;
                    r6 = 0.0d;
                    $pc8 = 8; continue $sw8;
                }
                case 8: {
                    if (r5 >= r10.length) { $pc8 = 14; continue $sw8; }
                    try {
                        r6 = r6 + r10[r5];
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 18; continue $sw8;
                    }
                    if (r6 >= r3) { $pc8 = 14; continue $sw8; }
                    try {
                        r5 = r5 + 1;
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 18; continue $sw8;
                    }
                    $pc8 = 14; continue $sw8;
                }
                case 14: {
                    if (r5 != r10.length) { $pc8 = 29; continue $sw8; }
                    return r10.length - 1;
                }
                case 29: {
                    return r5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -1399776985629449889L)
    private static android.content.SharedPreferences j6(android.content.Context r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 8: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 12; continue $sw9; }
                    abcd.wu.j6(th, 1916053960646527940L, null, r5);
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc9 = 6; continue $sw9; }
                    try {
                        abcd.wu.j6(1916053960646527940L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 8; continue $sw9;
                    }
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    return r5.getSharedPreferences("Conversions", 0);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.content.Context r7, java.lang.String r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 3;
        $sw10: while (true) {
            switch ($pc10) {
                case 9: {
                    th = $ex10;
                    if (DW == false) { $pc10 = 13; continue $sw10; }
                    abcd.wu.j6(th, -5047671496272181111L, null, r7, r8);
                    $pc10 = 13; continue $sw10;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc10 = 6; continue $sw10; }
                    try {
                        abcd.wu.j6(-5047671496272181111L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 9; continue $sw10;
                    }
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    if (v5(r7, r8) == false) { $pc10 = 16; continue $sw10; }
                    try {
                        FH(r7, r8);
                        Hw(r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 9; continue $sw10;
                    }
                    return;
                }
                case 16: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.content.Context r8, java.lang.String r9, int r10) {
        android.content.SharedPreferences r0 = null;
        android.content.SharedPreferences.Editor r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 3;
        $sw11: while (true) {
            switch ($pc11) {
                case 9: {
                    th = $ex11;
                    if (DW == false) { $pc11 = 13; continue $sw11; }
                    abcd.wu.j6(th, -3343354739488848623L, null, r8, r9, new java.lang.Integer(r10));
                    $pc11 = 13; continue $sw11;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc11 = 5; continue $sw11; }
                    try {
                        abcd.wu.j6(-3343354739488848623L, null, r8, r9, new java.lang.Integer(r10));
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 9; continue $sw11;
                    }
                    $pc11 = 5; continue $sw11;
                }
                case 5: {
                    try {
                        r0 = DW(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 9; continue $sw11;
                    }
                    if (r0.contains(r9) == true) { $pc11 = 16; continue $sw11; }
                    try {
                        r1 = r0.edit();
                        r1.putInt(r9, r10);
                        r1.commit();
                        j6(r9, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 9; continue $sw11;
                    }
                    return;
                }
                case 16: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.content.Context r8, java.lang.String r9, long r10) {
        long r1 = 0L;
        java.lang.String r3 = null;
        java.lang.String r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 4;
        $sw12: while (true) {
            switch ($pc12) {
                case 12: {
                    th = $ex12;
                    if (DW == false) { $pc12 = 16; continue $sw12; }
                    abcd.wu.j6(th, 2006714162712158244L, null, r8, r9, new java.lang.Long(r10));
                    $pc12 = 16; continue $sw12;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc12 = 7; continue $sw12; }
                    try {
                        abcd.wu.j6(2006714162712158244L, null, r8, r9, new java.lang.Long(r10));
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 12; continue $sw12;
                    }
                    $pc12 = 7; continue $sw12;
                }
                case 7: {
                    if (v5(r8, r9) == true) { $pc12 = 9; continue $sw12; }
                    return;
                }
                case 9: {
                    if (r10 <= 0) { $pc12 = 20; continue $sw12; }
                    try {
                        r1 = (java.lang.System.currentTimeMillis() - r10) / 3600000;
                        r3 = r9 + "_" + (r1 / 24) + "days";
                        FH(r8, r3);
                        Hw(r8, r3);
                        r0 = r9 + "_" + r1 + "hours";
                        FH(r8, r0);
                        Hw(r8, r0);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 12; continue $sw12;
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

    @abcd.Interfacesu(method = 2278900053720331740L)
    private static void j6(android.content.Context r9, java.lang.String r10, java.lang.String r11, int r12) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 4;
        $sw13: while (true) {
            switch ($pc13) {
                case 8: {
                    th = $ex13;
                    if (DW == false) { $pc13 = 12; continue $sw13; }
                    abcd.wu.j6(th, 5251387218189944427L, null, r9, r10, r11, new java.lang.Integer(r12));
                    $pc13 = 12; continue $sw13;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc13 = 6; continue $sw13; }
                    try {
                        abcd.wu.j6(5251387218189944427L, null, r9, r10, r11, new java.lang.Integer(r12));
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 8; continue $sw13;
                    }
                    $pc13 = 6; continue $sw13;
                }
                case 6: {
                    try {
                        abcd.F.j6("Group_" + r11 + "_" + r10 + "_" + DW(r12));
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

    public static void j6(android.content.Context r8, java.lang.String r9, boolean r10) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 3;
        $sw14: while (true) {
            switch ($pc14) {
                case 9: {
                    th = $ex14;
                    if (DW == false) { $pc14 = 13; continue $sw14; }
                    abcd.wu.j6(th, 623120749578508000L, null, r8, r9, new java.lang.Boolean(r10));
                    $pc14 = 13; continue $sw14;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc14 = 6; continue $sw14; }
                    try {
                        abcd.wu.j6(623120749578508000L, null, r8, r9, new java.lang.Boolean(r10));
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 9; continue $sw14;
                    }
                    $pc14 = 6; continue $sw14;
                }
                case 6: {
                    if (DW(r8, r9, r10) == false) { $pc14 = 16; continue $sw14; }
                    try {
                        FH(r8, r9);
                        Hw(r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 9; continue $sw14;
                    }
                    return;
                }
                case 16: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -5025945382804827359L)
    private static void j6(java.lang.String r7, int r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = 3;
        $sw15: while (true) {
            switch ($pc15) {
                case 7: {
                    th = $ex15;
                    if (DW == false) { $pc15 = 11; continue $sw15; }
                    abcd.wu.j6(th, 4470573123673594140L, null, r7, new java.lang.Integer(r8));
                    $pc15 = 11; continue $sw15;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc15 = 5; continue $sw15; }
                    try {
                        abcd.wu.j6(4470573123673594140L, null, r7, new java.lang.Integer(r8));
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 7; continue $sw15;
                    }
                    $pc15 = 5; continue $sw15;
                }
                case 5: {
                    try {
                        abcd.F.j6("Group_" + r7 + "_" + DW(r8));
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 7; continue $sw15;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(android.content.Context r8, java.lang.String r9, double... r10) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = 3;
        $sw16: while (true) {
            switch ($pc16) {
                case 10: {
                    th = $ex16;
                    if (DW == false) { $pc16 = 14; continue $sw16; }
                    abcd.wu.j6(th, 6275929751280083520L, null, r8, r9, r10);
                    $pc16 = 14; continue $sw16;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc16 = 5; continue $sw16; }
                    try {
                        abcd.wu.j6(6275929751280083520L, null, r8, r9, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 10; continue $sw16;
                    }
                    $pc16 = 5; continue $sw16;
                }
                case 5: {
                    if (DW(r8, r9, r10) == 0) { $pc16 = 8; continue $sw16; }
                    return true;
                }
                case 8: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 6157569440757240L)
    private static double[] j6(int r9) {
        double[] r3 = null;
        int r4 = 0;
        double r7 = 0.0d;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = 4;
        $sw17: while (true) {
            switch ($pc17) {
                case 13: {
                    th = $ex17;
                    if (DW == false) { $pc17 = 18; continue $sw17; }
                    abcd.wu.j6(th, 3457582000720596921L, null, new java.lang.Integer(r9));
                    $pc17 = 18; continue $sw17;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc17 = 6; continue $sw17; }
                    try {
                        abcd.wu.j6(3457582000720596921L, null, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 13; continue $sw17;
                    }
                    $pc17 = 6; continue $sw17;
                }
                case 6: {
                    try {
                        r3 = new double[r9];
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 13; continue $sw17;
                    }
                    r4 = 0;
                    $pc17 = 7; continue $sw17;
                }
                case 7: {
                    if (r4 >= r3.length) { $pc17 = 12; continue $sw17; }
                    r7 = r9;
                    java.lang.Double.isNaN(r7);
                    try {
                        r3[r4] = 1.0d / r7;
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 13; continue $sw17;
                    }
                    r4 = r4 + 1;
                    { $pc17 = 7; continue $sw17; }
                }
                case 12: {
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 112551046055288393L)
    private static boolean v5(android.content.Context r7, java.lang.String r8) {
        android.content.SharedPreferences r0 = null;
        android.content.SharedPreferences.Editor r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = 3;
        $sw18: while (true) {
            switch ($pc18) {
                case 10: {
                    th = $ex18;
                    if (DW == false) { $pc18 = 14; continue $sw18; }
                    abcd.wu.j6(th, -2885168362231867160L, null, r7, r8);
                    $pc18 = 14; continue $sw18;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc18 = 5; continue $sw18; }
                    try {
                        abcd.wu.j6(-2885168362231867160L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 10; continue $sw18;
                    }
                    $pc18 = 5; continue $sw18;
                }
                case 5: {
                    try {
                        r0 = j6(r7);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 10; continue $sw18;
                    }
                    if (r0.getBoolean(r8, false) == true) { $pc18 = 9; continue $sw18; }
                    try {
                        r1 = r0.edit();
                        r1.putBoolean(r8, true);
                        r1.commit();
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 10; continue $sw18;
                    }
                    return true;
                }
                case 9: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
