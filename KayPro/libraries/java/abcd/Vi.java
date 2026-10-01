package abcd;

@abcd.Interfacexu
class Vi {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(abcd.Vi.class, 5055569416012248315L, 5055569416012248315L);
    }

    @abcd.Interfacesu(method = -2746829644629080871L)
    Vi() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 329814685272620568L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(329814685272620568L, null);
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

    @abcd.Interfacesu(method = 597287778549131195L)
    public static boolean BT(java.lang.String r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 15: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 19; continue $sw1; }
                    abcd.wu.j6(th, -908934281112909600L, null, r6);
                    $pc1 = 19; continue $sw1;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc1 = 7; continue $sw1; }
                    try {
                        abcd.wu.j6(-908934281112909600L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 15; continue $sw1;
                    }
                    $pc1 = 7; continue $sw1;
                }
                case 7: {
                    if (new java.io.File(r6 + "/src").exists() == true) { $pc1 = 9; continue $sw1; }
                    $pc1 = 13; continue $sw1;
                }
                case 13: {
                    return false;
                }
                case 9: {
                    if (new java.io.File(r6 + "/build.gradle").exists() == false) { $pc1 = 13; continue $sw1; }
                    if (yS(r6) == true) { $pc1 = 13; continue $sw1; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 1021319146108111072L)
    public static java.lang.String DW(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 4;
        $sw2: while (true) {
            switch ($pc2) {
                case 8: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 12; continue $sw2; }
                    abcd.wu.j6(th, 1165870240618862163L, null, r5);
                    $pc2 = 12; continue $sw2;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc2 = 6; continue $sw2; }
                    try {
                        abcd.wu.j6(1165870240618862163L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 8; continue $sw2;
                    }
                    $pc2 = 6; continue $sw2;
                }
                case 6: {
                    return abcd.Vl.tp(r5) + ".apk";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 3616478081290032L)
    public static java.lang.String DW(java.lang.String r7, java.lang.String r8) {
        java.lang.String r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 14: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 18; continue $sw3; }
                    abcd.wu.j6(th, 2525556916911377917L, null, r7, r8);
                    $pc3 = 18; continue $sw3;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc3 = 6; continue $sw3; }
                    try {
                        abcd.wu.j6(2525556916911377917L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 14; continue $sw3;
                    }
                    $pc3 = 6; continue $sw3;
                }
                case 6: {
                    if (BT(r7) == false) { $pc3 = 13; continue $sw3; }
                    if (r8 == null) { $pc3 = 13; continue $sw3; }
                    if ("main".equals(r8) == true) { $pc3 = 13; continue $sw3; }
                    try {
                        r0 = r7 + "/src/" + r8 + "/res";
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 14; continue $sw3;
                    }
                    if (abcd.Vl.aM(r0) == false) { $pc3 = 13; continue $sw3; }
                    return r0;
                }
                case 13: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 441700784036517303L)
    public static java.util.List<java.lang.String> DW(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        java.util.ArrayList r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 3;
        $sw4: while (true) {
            switch ($pc4) {
                case 22: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 26; continue $sw4; }
                    abcd.wu.j6(th, -2705127839778416768L, null, r8, r9, r10);
                    $pc4 = 26; continue $sw4;
                }
                case 26: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc4 = 6; continue $sw4; }
                    try {
                        abcd.wu.j6(-2705127839778416768L, null, r8, r9, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 22; continue $sw4;
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if (gW(r8) == false) { $pc4 = 10; continue $sw4; }
                    return java.util.Collections.singletonList(r8 + "/jni");
                }
                case 10: {
                    if (BT(r8) == false) { $pc4 = 21; continue $sw4; }
                    try {
                        r0 = new java.util.ArrayList();
                        r0.add(r8 + "/src/main/jniLibs");
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 22; continue $sw4;
                    }
                    if (r10 != null) { $pc4 = 15; continue $sw4; }
                    $pc4 = 17; continue $sw4;
                }
                case 17: {
                    if (r9 == null) { $pc4 = 19; continue $sw4; }
                    try {
                        r0.add(r8 + "/src/" + r9 + "/jniLibs");
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 22; continue $sw4;
                    }
                    $pc4 = 19; continue $sw4;
                }
                case 19: {
                    return r0;
                }
                case 15: {
                    if ("main".equals(r10) == true) { $pc4 = 17; continue $sw4; }
                    try {
                        r0.add(r8 + "/src/" + r10 + "/jniLibs");
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 22; continue $sw4;
                    }
                    { $pc4 = 17; continue $sw4; }
                }
                case 21: {
                    return java.util.Collections.singletonList(r8 + "/libs");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 1397656539040602456L)
    public static java.lang.String EQ(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 11: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 15; continue $sw5; }
                    abcd.wu.j6(th, -339943079727375475L, null, r5);
                    $pc5 = 15; continue $sw5;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc5 = 7; continue $sw5; }
                    try {
                        abcd.wu.j6(-339943079727375475L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 11; continue $sw5;
                    }
                    $pc5 = 7; continue $sw5;
                }
                case 7: {
                    if (BT(r5) == false) { $pc5 = 10; continue $sw5; }
                    return FH(r5) + "/generated";
                }
                case 10: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 3261126412797577584L)
    public static java.lang.String FH(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 12: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 16; continue $sw6; }
                    abcd.wu.j6(th, -229172250814450911L, null, r5);
                    $pc6 = 16; continue $sw6;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc6 = 7; continue $sw6; }
                    try {
                        abcd.wu.j6(-229172250814450911L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 12; continue $sw6;
                    }
                    $pc6 = 7; continue $sw6;
                }
                case 7: {
                    if (BT(r5) == false) { $pc6 = 11; continue $sw6; }
                    return r5 + "/build/bin";
                }
                case 11: {
                    return r5 + "/bin";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 333278616578380375L)
    public static java.lang.String FH(java.lang.String r7, java.lang.String r8) {
        java.lang.String r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 3;
        $sw7: while (true) {
            switch ($pc7) {
                case 18: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 22; continue $sw7; }
                    abcd.wu.j6(th, -5867559191916800280L, null, r7, r8);
                    $pc7 = 22; continue $sw7;
                }
                case 22: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(-5867559191916800280L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 18; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    if (BT(r7) == false) { $pc7 = 10; continue $sw7; }
                    return r7 + "/src/main/AndroidManifest.xml";
                }
                case 10: {
                    if (r8 == null) { $pc7 = 17; continue $sw7; }
                    if ("main".equals(r8) == true) { $pc7 = 17; continue $sw7; }
                    try {
                        r1 = r7 + "/flavors/" + r8 + "/AndroidManifest.xml";
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 18; continue $sw7;
                    }
                    if (abcd.Vl.j3(r1) == false) { $pc7 = 17; continue $sw7; }
                    return r1;
                }
                case 17: {
                    return r7 + "/AndroidManifest.xml";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 874401604928226293L)
    public static java.lang.String Hw(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 4;
        $sw8: while (true) {
            switch ($pc8) {
                case 8: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 12; continue $sw8; }
                    abcd.wu.j6(th, -802055225629460440L, null, r5);
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc8 = 6; continue $sw8; }
                    try {
                        abcd.wu.j6(-802055225629460440L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 8; continue $sw8;
                    }
                    $pc8 = 6; continue $sw8;
                }
                case 6: {
                    return FH(r5) + "/res";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -958043168284638213L)
    public static java.lang.String[] Hw(java.lang.String r8, java.lang.String r9) {
        java.lang.String r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 3;
        $sw9: while (true) {
            switch ($pc9) {
                case 20: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 24; continue $sw9; }
                    abcd.wu.j6(th, -190303033313080408L, null, r8, r9);
                    $pc9 = 24; continue $sw9;
                }
                case 24: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc9 = 7; continue $sw9; }
                    try {
                        abcd.wu.j6(-190303033313080408L, null, r8, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 20; continue $sw9;
                    }
                    $pc9 = 7; continue $sw9;
                }
                case 7: {
                    if (BT(r8) == false) { $pc9 = 19; continue $sw9; }
                    if (r9 == null) { $pc9 = 17; continue $sw9; }
                    if ("main".equals(r9) == true) { $pc9 = 17; continue $sw9; }
                    try {
                        r5 = r8 + "/src/" + r9 + "/java";
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 20; continue $sw9;
                    }
                    if (abcd.Vl.aM(r5) == false) { $pc9 = 17; continue $sw9; }
                    return new java.lang.String[]{r8 + "/src/main/java", r8 + "/src/main/aidl", r5};
                }
                case 17: {
                    return new java.lang.String[]{r8 + "/src/main/java", r8 + "/src/main/aidl"};
                }
                case 19: {
                    return new java.lang.String[]{r8 + "/src"};
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 1150311299387222464L)
    public static java.lang.String J0(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 4;
        $sw10: while (true) {
            switch ($pc10) {
                case 8: {
                    th = $ex10;
                    if (DW == false) { $pc10 = 12; continue $sw10; }
                    abcd.wu.j6(th, -70864024740859473L, null, r5);
                    $pc10 = 12; continue $sw10;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc10 = 6; continue $sw10; }
                    try {
                        abcd.wu.j6(-70864024740859473L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 8; continue $sw10;
                    }
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    return FH(r5) + "/jardex";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -2240853136297844991L)
    public static java.lang.String J8(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 4;
        $sw11: while (true) {
            switch ($pc11) {
                case 12: {
                    th = $ex11;
                    if (DW == false) { $pc11 = 16; continue $sw11; }
                    abcd.wu.j6(th, -1721378713251393040L, null, r5);
                    $pc11 = 16; continue $sw11;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc11 = 7; continue $sw11; }
                    try {
                        abcd.wu.j6(-1721378713251393040L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 12; continue $sw11;
                    }
                    $pc11 = 7; continue $sw11;
                }
                case 7: {
                    if (BT(r5) == false) { $pc11 = 11; continue $sw11; }
                    return r5 + "/src/main/jni";
                }
                case 11: {
                    return r5 + "/jni";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2248435439880355260L)
    public static java.lang.String Mr(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 4;
        $sw12: while (true) {
            switch ($pc12) {
                case 12: {
                    th = $ex12;
                    if (DW == false) { $pc12 = 16; continue $sw12; }
                    abcd.wu.j6(th, 2229986576859501127L, null, r5);
                    $pc12 = 16; continue $sw12;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc12 = 7; continue $sw12; }
                    try {
                        abcd.wu.j6(2229986576859501127L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 12; continue $sw12;
                    }
                    $pc12 = 7; continue $sw12;
                }
                case 7: {
                    if (BT(r5) == false) { $pc12 = 11; continue $sw12; }
                    return r5 + "/src/main/res";
                }
                case 11: {
                    return r5 + "/res";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -828567314079558555L)
    public static boolean P8(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 4;
        $sw13: while (true) {
            switch ($pc13) {
                case 13: {
                    th = $ex13;
                    if (DW == false) { $pc13 = 17; continue $sw13; }
                    abcd.wu.j6(th, -1879071983851456608L, null, r5);
                    $pc13 = 17; continue $sw13;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc13 = 7; continue $sw13; }
                    try {
                        abcd.wu.j6(-1879071983851456608L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 13; continue $sw13;
                    }
                    $pc13 = 7; continue $sw13;
                }
                case 7: {
                    if (er(r5) == false) { $pc13 = 11; continue $sw13; }
                    if (abcd.Vl.Hw(aM(r5)) == false) { $pc13 = 11; continue $sw13; }
                    return true;
                }
                case 11: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 25823367571262619L)
    public static java.lang.String QX(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 4;
        $sw14: while (true) {
            switch ($pc14) {
                case 12: {
                    th = $ex14;
                    if (DW == false) { $pc14 = 16; continue $sw14; }
                    abcd.wu.j6(th, -1483645710251643276L, null, r5);
                    $pc14 = 16; continue $sw14;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc14 = 7; continue $sw14; }
                    try {
                        abcd.wu.j6(-1483645710251643276L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 12; continue $sw14;
                    }
                    $pc14 = 7; continue $sw14;
                }
                case 7: {
                    if (BT(r5) == false) { $pc14 = 11; continue $sw14; }
                    return r5 + "/src/main/assets";
                }
                case 11: {
                    return r5 + "/assets";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static java.lang.String U2(java.lang.String r1) {
        return com.almlkaide.kaypro.aide.AdvancedSetting.getBuildApkPath(r1);
    }

    @abcd.Interfacesu(method = -66863009208285521L)
    public static java.lang.String VH(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = 4;
        $sw15: while (true) {
            switch ($pc15) {
                case 12: {
                    th = $ex15;
                    if (DW == false) { $pc15 = 16; continue $sw15; }
                    abcd.wu.j6(th, -8223220009466489156L, null, r5);
                    $pc15 = 16; continue $sw15;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc15 = 7; continue $sw15; }
                    try {
                        abcd.wu.j6(-8223220009466489156L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 12; continue $sw15;
                    }
                    $pc15 = 7; continue $sw15;
                }
                case 7: {
                    if (BT(r5) == false) { $pc15 = 10; continue $sw15; }
                    return "";
                }
                case 10: {
                    return r5 + "/.classpath";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 55857002621040105L)
    public static java.lang.String Ws(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = 4;
        $sw16: while (true) {
            switch ($pc16) {
                case 17: {
                    th = $ex16;
                    if (DW == false) { $pc16 = 21; continue $sw16; }
                    abcd.wu.j6(th, -2143162816375976616L, null, r5);
                    $pc16 = 21; continue $sw16;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc16 = 8; continue $sw16; }
                    try {
                        abcd.wu.j6(-2143162816375976616L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 17; continue $sw16;
                    }
                    $pc16 = 8; continue $sw16;
                }
                case 8: {
                    if (gW(r5) == false) { $pc16 = 12; continue $sw16; }
                    return r5 + "/libs";
                }
                case 12: {
                    if (BT(r5) == false) { $pc16 = 16; continue $sw16; }
                    return r5 + "/libs";
                }
                case 16: {
                    return r5 + "/libs";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 291631321996582785L)
    public static java.lang.String XL(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = 4;
        $sw17: while (true) {
            switch ($pc17) {
                case 8: {
                    th = $ex17;
                    if (DW == false) { $pc17 = 12; continue $sw17; }
                    abcd.wu.j6(th, -290462525071335900L, null, r5);
                    $pc17 = 12; continue $sw17;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc17 = 6; continue $sw17; }
                    try {
                        abcd.wu.j6(-290462525071335900L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 8; continue $sw17;
                    }
                    $pc17 = 6; continue $sw17;
                }
                case 6: {
                    return FH(r5) + "/merged/AndroidManifest.xml";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -33912775131369204L)
    public static java.lang.String Zo(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = 4;
        $sw18: while (true) {
            switch ($pc18) {
                case 8: {
                    th = $ex18;
                    if (DW == false) { $pc18 = 12; continue $sw18; }
                    abcd.wu.j6(th, 8147758450608217111L, null, r5);
                    $pc18 = 12; continue $sw18;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc18 = 6; continue $sw18; }
                    try {
                        abcd.wu.j6(8147758450608217111L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 8; continue $sw18;
                    }
                    $pc18 = 6; continue $sw18;
                }
                case 6: {
                    return FH(r5);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -2744657450497666676L)
    public static java.lang.String a8(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = 4;
        $sw19: while (true) {
            switch ($pc19) {
                case 8: {
                    th = $ex19;
                    if (DW == false) { $pc19 = 12; continue $sw19; }
                    abcd.wu.j6(th, 985099596843497631L, null, r5);
                    $pc19 = 12; continue $sw19;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc19 = 6; continue $sw19; }
                    try {
                        abcd.wu.j6(985099596843497631L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 8; continue $sw19;
                    }
                    $pc19 = 6; continue $sw19;
                }
                case 6: {
                    return FH(r5) + "/resources.ap_";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 696660510040861608L)
    public static java.lang.String aM(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = 4;
        $sw20: while (true) {
            switch ($pc20) {
                case 8: {
                    th = $ex20;
                    if (DW == false) { $pc20 = 12; continue $sw20; }
                    abcd.wu.j6(th, -17700344372257197L, null, r5);
                    $pc20 = 12; continue $sw20;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc20 = 6; continue $sw20; }
                    try {
                        abcd.wu.j6(-17700344372257197L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 8; continue $sw20;
                    }
                    $pc20 = 6; continue $sw20;
                }
                case 6: {
                    return QX(r5) + "/www";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -322999388407107720L)
    private static boolean ei(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = 4;
        $sw21: while (true) {
            switch ($pc21) {
                case 13: {
                    th = $ex21;
                    if (DW == false) { $pc21 = 17; continue $sw21; }
                    abcd.wu.j6(th, 3200180194929264755L, null, r5);
                    $pc21 = 17; continue $sw21;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc21 = 7; continue $sw21; }
                    try {
                        abcd.wu.j6(3200180194929264755L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 13; continue $sw21;
                    }
                    $pc21 = 7; continue $sw21;
                }
                case 7: {
                    if ("src".equals(abcd.Vl.tp(abcd.Vl.EQ(r5))) == false) { $pc21 = 11; continue $sw21; }
                    if (BT(abcd.Vl.EQ(abcd.Vl.EQ(r5))) == false) { $pc21 = 11; continue $sw21; }
                    return true;
                }
                case 11: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 4763181167407726219L)
    public static boolean er(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = 4;
        $sw22: while (true) {
            switch ($pc22) {
                case 14: {
                    th = $ex22;
                    if (DW == false) { $pc22 = 18; continue $sw22; }
                    abcd.wu.j6(th, 4896364450023516960L, null, r5);
                    $pc22 = 18; continue $sw22;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc22 = 7; continue $sw22; }
                    try {
                        abcd.wu.j6(4896364450023516960L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 14; continue $sw22;
                    }
                    $pc22 = 7; continue $sw22;
                }
                case 7: {
                    if (yS(r5) == true) { $pc22 = 12; continue $sw22; }
                    if (BT(r5) == true) { $pc22 = 12; continue $sw22; }
                    return false;
                }
                case 12: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 9500144567062080L)
    public static boolean gW(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex23 = null;
        int $pc23 = 4;
        $sw23: while (true) {
            switch ($pc23) {
                case 13: {
                    th = $ex23;
                    if (DW == false) { $pc23 = 17; continue $sw23; }
                    abcd.wu.j6(th, -1498082708627040741L, null, r5);
                    $pc23 = 17; continue $sw23;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc23 = 7; continue $sw23; }
                    try {
                        abcd.wu.j6(-1498082708627040741L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 13; continue $sw23;
                    }
                    $pc23 = 7; continue $sw23;
                }
                case 7: {
                    if (abcd.Vl.Hw(j6(r5)) == false) { $pc23 = 11; continue $sw23; }
                    if (abcd.Vl.Hw(FH(r5, null)) == false) { $pc23 = 11; continue $sw23; }
                    return true;
                }
                case 11: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 3003472507983836000L)
    public static java.util.List<java.lang.String> gn(java.lang.String r8) {
        java.util.ArrayList r4 = null;
        java.util.Iterator<java.lang.String> r0 = null;
        java.lang.String r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex24 = null;
        int $pc24 = 4;
        $sw24: while (true) {
            switch ($pc24) {
                case 18: {
                    th = $ex24;
                    if (DW == false) { $pc24 = 23; continue $sw24; }
                    abcd.wu.j6(th, 2151865509126595915L, null, r8);
                    $pc24 = 23; continue $sw24;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc24 = 7; continue $sw24; }
                    try {
                        abcd.wu.j6(2151865509126595915L, null, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 18; continue $sw24;
                    }
                    $pc24 = 7; continue $sw24;
                }
                case 7: {
                    if (abcd.Vl.aM(r8 + "/flavors") == true) { $pc24 = 28; continue $sw24; }
                    $pc24 = 17; continue $sw24;
                }
                case 17: {
                    return null;
                }
                case 28: {
                    try {
                        r4 = new java.util.ArrayList();
                        r0 = abcd.Vl.Zo(r8 + "/flavors").iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        if ($t instanceof java.io.IOException) { $pc24 = 25; continue $sw24; }
                        $pc24 = 18; continue $sw24;
                    }
                    $pc24 = 10; continue $sw24;
                }
                case 10: {
                    if (r0.hasNext() == false) { $pc24 = 14; continue $sw24; }
                    try {
                        r5 = r0.next();
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        if ($t instanceof java.io.IOException) { $pc24 = 25; continue $sw24; }
                        $pc24 = 18; continue $sw24;
                    }
                    if (abcd.Vl.J8(r5 + "/AndroidManifest.xml") == false) { $pc24 = 10; continue $sw24; }
                    try {
                        r4.add(abcd.Vl.tp(r5));
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        if ($t instanceof java.io.IOException) { $pc24 = 25; continue $sw24; }
                        $pc24 = 18; continue $sw24;
                    }
                    { $pc24 = 10; continue $sw24; }
                }
                case 14: {
                    if (r4.size() <= 0) { $pc24 = 17; continue $sw24; }
                    return r4;
                    { $pc24 = 17; continue $sw24; }
                }
                case 25: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 117369853506687936L)
    public static java.lang.String j3(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex25 = null;
        int $pc25 = 4;
        $sw25: while (true) {
            switch ($pc25) {
                case 12: {
                    th = $ex25;
                    if (DW == false) { $pc25 = 16; continue $sw25; }
                    abcd.wu.j6(th, -5103387868992549331L, null, r5);
                    $pc25 = 16; continue $sw25;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc25 = 7; continue $sw25; }
                    try {
                        abcd.wu.j6(-5103387868992549331L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 12; continue $sw25;
                    }
                    $pc25 = 7; continue $sw25;
                }
                case 7: {
                    if (BT(r5) == false) { $pc25 = 10; continue $sw25; }
                    return "";
                }
                case 10: {
                    return r5 + "/project.properties";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -3963442482895129647L)
    public static java.lang.String j6(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex26 = null;
        int $pc26 = 4;
        $sw26: while (true) {
            switch ($pc26) {
                case 8: {
                    th = $ex26;
                    if (DW == false) { $pc26 = 12; continue $sw26; }
                    abcd.wu.j6(th, -7988407728649668984L, null, r5);
                    $pc26 = 12; continue $sw26;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc26 = 6; continue $sw26; }
                    try {
                        abcd.wu.j6(-7988407728649668984L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 8; continue $sw26;
                    }
                    $pc26 = 6; continue $sw26;
                }
                case 6: {
                    return r5 + "/classes.jar";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 1521775742238204115L)
    public static java.lang.String j6(java.lang.String r7, java.lang.String r8) {
        java.lang.String r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex27 = null;
        int $pc27 = 3;
        $sw27: while (true) {
            switch ($pc27) {
                case 14: {
                    th = $ex27;
                    if (DW == false) { $pc27 = 18; continue $sw27; }
                    abcd.wu.j6(th, 1013853298467179160L, null, r7, r8);
                    $pc27 = 18; continue $sw27;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc27 = 6; continue $sw27; }
                    try {
                        abcd.wu.j6(1013853298467179160L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 14; continue $sw27;
                    }
                    $pc27 = 6; continue $sw27;
                }
                case 6: {
                    if (BT(r7) == false) { $pc27 = 13; continue $sw27; }
                    if (r8 == null) { $pc27 = 13; continue $sw27; }
                    if ("main".equals(r8) == true) { $pc27 = 13; continue $sw27; }
                    try {
                        r0 = r7 + "/src/" + r8 + "/AndroidManifest.xml";
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 14; continue $sw27;
                    }
                    if (abcd.Vl.j3(r0) == false) { $pc27 = 13; continue $sw27; }
                    return r0;
                }
                case 13: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 4086758386955887032L)
    public static java.lang.String j6(java.lang.String r7, boolean r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex28 = null;
        int $pc28 = 3;
        $sw28: while (true) {
            switch ($pc28) {
                case 10: {
                    th = $ex28;
                    if (DW == false) { $pc28 = 14; continue $sw28; }
                    abcd.wu.j6(th, -425360667011199651L, null, r7, new java.lang.Boolean(r8));
                    $pc28 = 14; continue $sw28;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc28 = 5; continue $sw28; }
                    try {
                        abcd.wu.j6(-425360667011199651L, null, r7, new java.lang.Boolean(r8));
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 10; continue $sw28;
                    }
                    $pc28 = 5; continue $sw28;
                }
                case 5: {
                    if (r8 == false) { $pc28 = 9; continue $sw28; }
                    return FH(r7) + "/classesdebug";
                }
                case 9: {
                    return FH(r7) + "/classesrelease";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 5299441812555281607L)
    public static java.util.List<java.lang.String> j6(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        java.util.ArrayList r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex29 = null;
        int $pc29 = 3;
        $sw29: while (true) {
            switch ($pc29) {
                case 18: {
                    th = $ex29;
                    if (DW == false) { $pc29 = 22; continue $sw29; }
                    abcd.wu.j6(th, 5091541062928197408L, null, r8, r9, r10);
                    $pc29 = 22; continue $sw29;
                }
                case 22: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc29 = 6; continue $sw29; }
                    try {
                        abcd.wu.j6(5091541062928197408L, null, r8, r9, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 18; continue $sw29;
                    }
                    $pc29 = 6; continue $sw29;
                }
                case 6: {
                    if (BT(r8) == false) { $pc29 = 17; continue $sw29; }
                    try {
                        r0 = new java.util.ArrayList();
                        r0.add(QX(r8));
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 18; continue $sw29;
                    }
                    if (r10 != null) { $pc29 = 11; continue $sw29; }
                    $pc29 = 13; continue $sw29;
                }
                case 13: {
                    if (r9 == null) { $pc29 = 15; continue $sw29; }
                    try {
                        r0.add(r8 + "/src/" + r9 + "/assets");
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 18; continue $sw29;
                    }
                    $pc29 = 15; continue $sw29;
                }
                case 15: {
                    return r0;
                }
                case 11: {
                    if ("main".equals(r10) == true) { $pc29 = 13; continue $sw29; }
                    try {
                        r0.add(r8 + "/src/" + r10 + "/assets");
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 18; continue $sw29;
                    }
                    { $pc29 = 13; continue $sw29; }
                }
                case 17: {
                    return java.util.Collections.singletonList(QX(r8));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -7315831205860313488L)
    public static java.lang.String lg(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex30 = null;
        int $pc30 = 4;
        $sw30: while (true) {
            switch ($pc30) {
                case 8: {
                    th = $ex30;
                    if (DW == false) { $pc30 = 12; continue $sw30; }
                    abcd.wu.j6(th, 7236813190115014173L, null, r5);
                    $pc30 = 12; continue $sw30;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc30 = 6; continue $sw30; }
                    try {
                        abcd.wu.j6(7236813190115014173L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 8; continue $sw30;
                    }
                    $pc30 = 6; continue $sw30;
                }
                case 6: {
                    return abcd.Vl.VH(r5, "../build.gradle");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -646906257065111445L)
    public static java.lang.String rN(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex31 = null;
        int $pc31 = 4;
        $sw31: while (true) {
            switch ($pc31) {
                case 8: {
                    th = $ex31;
                    if (DW == false) { $pc31 = 12; continue $sw31; }
                    abcd.wu.j6(th, -1066898492866624120L, null, r5);
                    $pc31 = 12; continue $sw31;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc31 = 6; continue $sw31; }
                    try {
                        abcd.wu.j6(-1066898492866624120L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex31 = $t;
                        $pc31 = 8; continue $sw31;
                    }
                    $pc31 = 6; continue $sw31;
                }
                case 6: {
                    return abcd.Vl.VH(r5, "../settings.gradle");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -2010563693572571495L)
    public static java.lang.String tp(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex32 = null;
        int $pc32 = 4;
        $sw32: while (true) {
            switch ($pc32) {
                case 12: {
                    th = $ex32;
                    if (DW == false) { $pc32 = 16; continue $sw32; }
                    abcd.wu.j6(th, 2923344691364490576L, null, r5);
                    $pc32 = 16; continue $sw32;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc32 = 7; continue $sw32; }
                    try {
                        abcd.wu.j6(2923344691364490576L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 12; continue $sw32;
                    }
                    $pc32 = 7; continue $sw32;
                }
                case 7: {
                    if (BT(r5) == false) { $pc32 = 11; continue $sw32; }
                    return r5 + "/build/gen";
                }
                case 11: {
                    return r5 + "/gen";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -655757880434760112L)
    public static java.lang.String u7(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex33 = null;
        int $pc33 = 4;
        $sw33: while (true) {
            switch ($pc33) {
                case 8: {
                    th = $ex33;
                    if (DW == false) { $pc33 = 12; continue $sw33; }
                    abcd.wu.j6(th, 24795661799075881L, null, r5);
                    $pc33 = 12; continue $sw33;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc33 = 6; continue $sw33; }
                    try {
                        abcd.wu.j6(24795661799075881L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex33 = $t;
                        $pc33 = 8; continue $sw33;
                    }
                    $pc33 = 6; continue $sw33;
                }
                case 6: {
                    return FH(r5) + "/exploded-aar";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = -168757717452118877L)
    public static java.lang.String v5(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex34 = null;
        int $pc34 = 4;
        $sw34: while (true) {
            switch ($pc34) {
                case 8: {
                    th = $ex34;
                    if (DW == false) { $pc34 = 12; continue $sw34; }
                    abcd.wu.j6(th, 643150827880796484L, null, r5);
                    $pc34 = 12; continue $sw34;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc34 = 6; continue $sw34; }
                    try {
                        abcd.wu.j6(643150827880796484L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        $pc34 = 8; continue $sw34;
                    }
                    $pc34 = 6; continue $sw34;
                }
                case 6: {
                    return r5 + "/build.gradle";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 2624883019095671925L)
    public static boolean vy(java.lang.String r5) {
        boolean r4 = false;
        java.lang.StringBuilder r3 = null;
        java.lang.String r6 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex35 = null;
        int $pc35 = 4;
        $sw35: while (true) {
            switch ($pc35) {
                case 12: {
                    th = $ex35;
                    if (DW == false) { $pc35 = 16; continue $sw35; }
                    abcd.wu.j6(th, -1814780239257932280L, null, r5);
                    $pc35 = 16; continue $sw35;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc35 = 6; continue $sw35; }
                    try {
                        abcd.wu.j6(-1814780239257932280L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex35 = $t;
                        $pc35 = 12; continue $sw35;
                    }
                    $pc35 = 6; continue $sw35;
                }
                case 6: {
                    try {
                        r4 = BT(r5);
                        r3 = new java.lang.StringBuilder();
                        r3.append(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex35 = $t;
                        $pc35 = 12; continue $sw35;
                    }
                    if (r4 == true) { $pc35 = 9; continue $sw35; }
                    r6 = "/jni/Android.mk";
                    $pc35 = 10; continue $sw35;
                }
                case 10: {
                    try {
                        r3.append(r6);
                    } catch (java.lang.Throwable $t) {
                        $ex35 = $t;
                        $pc35 = 12; continue $sw35;
                    }
                    return abcd.Vl.j3(r3.toString());
                }
                case 9: {
                    r6 = "/src/main/jni/Android.mk";
                    { $pc35 = 10; continue $sw35; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 353658387465895099L)
    public static java.lang.String we(java.lang.String r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex36 = null;
        int $pc36 = 4;
        $sw36: while (true) {
            switch ($pc36) {
                case 8: {
                    th = $ex36;
                    if (DW == false) { $pc36 = 12; continue $sw36; }
                    abcd.wu.j6(th, 1277078547273840624L, null, r5);
                    $pc36 = 12; continue $sw36;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc36 = 6; continue $sw36; }
                    try {
                        abcd.wu.j6(1277078547273840624L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex36 = $t;
                        $pc36 = 8; continue $sw36;
                    }
                    $pc36 = 6; continue $sw36;
                }
                case 6: {
                    return FH(r5) + "/injected/AndroidManifest.xml";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @abcd.Interfacesu(method = 1187046122809283061L)
    public static boolean yS(java.lang.String r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex37 = null;
        int $pc37 = 4;
        $sw37: while (true) {
            switch ($pc37) {
                case 13: {
                    th = $ex37;
                    if (DW == false) { $pc37 = 17; continue $sw37; }
                    abcd.wu.j6(th, 1932078902069940876L, null, r6);
                    $pc37 = 17; continue $sw37;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc37 = 7; continue $sw37; }
                    try {
                        abcd.wu.j6(1932078902069940876L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex37 = $t;
                        $pc37 = 13; continue $sw37;
                    }
                    $pc37 = 7; continue $sw37;
                }
                case 7: {
                    if (new java.io.File(r6 + "/AndroidManifest.xml").exists() == false) { $pc37 = 11; continue $sw37; }
                    if (ei(r6) == true) { $pc37 = 11; continue $sw37; }
                    return true;
                }
                case 11: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
