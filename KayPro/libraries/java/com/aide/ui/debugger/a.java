package com.aide.ui.debugger;

@abcd.Interfacexu
public class a {

    @abcd.Interfaceuu
    private static boolean DW;

    @abcd.Interfacetu
    private static boolean j6;

    static {
        abcd.wu.j6(com.aide.ui.debugger.a.class, -2166214085823675229L, -2166214085823675229L);
    }

    public a() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (DW == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, -21893438031947136L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (j6 == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(-21893438031947136L, null);
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

    public static void DW(android.content.Context r7, java.lang.String r8) {
        android.content.Intent r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 3;
        $sw1: while (true) {
            switch ($pc1) {
                case 7: {
                    th = $ex1;
                    if (DW == false) { $pc1 = 11; continue $sw1; }
                    abcd.wu.j6(th, 659328601534059303L, null, r7, r8);
                    $pc1 = 11; continue $sw1;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc1 = 5; continue $sw1; }
                    try {
                        abcd.wu.j6(659328601534059303L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 7; continue $sw1;
                    }
                    $pc1 = 5; continue $sw1;
                }
                case 5: {
                    try {
                        r0 = new android.content.Intent();
                        r0.setPackage(r8);
                        r0.setAction("com.adrt.KILL");
                        r7.sendBroadcast(r0);
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

    public static void DW(android.content.Context r8, java.lang.String r9, java.util.ArrayList<java.lang.String> r10) {
        android.content.Intent r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 7: {
                    th = $ex2;
                    if (DW == false) { $pc2 = 11; continue $sw2; }
                    abcd.wu.j6(th, 3544907813734325328L, null, r8, r9, r10);
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(3544907813734325328L, null, r8, r9, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 7; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        r0 = new android.content.Intent();
                        r0.setPackage(r9);
                        r0.setAction("com.adrt.RESUME");
                        r0.putExtra("breakpoints", r10);
                        r8.sendBroadcast(r0);
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

    public static void FH(android.content.Context r7, java.lang.String r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 7: {
                    th = $ex3;
                    if (DW == false) { $pc3 = 11; continue $sw3; }
                    abcd.wu.j6(th, 414597785526560900L, null, r7, r8);
                    $pc3 = 11; continue $sw3;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc3 = 5; continue $sw3; }
                    try {
                        abcd.wu.j6(414597785526560900L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 7; continue $sw3;
                    }
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    try {
                        DW(r7, r8, null);
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

    public static void Hw(android.content.Context r7, java.lang.String r8) {
        android.content.Intent r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 3;
        $sw4: while (true) {
            switch ($pc4) {
                case 7: {
                    th = $ex4;
                    if (DW == false) { $pc4 = 11; continue $sw4; }
                    abcd.wu.j6(th, -2583986050371316912L, null, r7, r8);
                    $pc4 = 11; continue $sw4;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc4 = 5; continue $sw4; }
                    try {
                        abcd.wu.j6(-2583986050371316912L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 7; continue $sw4;
                    }
                    $pc4 = 5; continue $sw4;
                }
                case 5: {
                    try {
                        r0 = new android.content.Intent();
                        r0.setPackage(r8);
                        r0.setAction("com.adrt.STEP_IN");
                        r7.sendBroadcast(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 7; continue $sw4;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void Zo(android.content.Context r7, java.lang.String r8) {
        android.content.Intent r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 3;
        $sw5: while (true) {
            switch ($pc5) {
                case 7: {
                    th = $ex5;
                    if (DW == false) { $pc5 = 11; continue $sw5; }
                    abcd.wu.j6(th, 1015145722550728725L, null, r7, r8);
                    $pc5 = 11; continue $sw5;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc5 = 5; continue $sw5; }
                    try {
                        abcd.wu.j6(1015145722550728725L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 7; continue $sw5;
                    }
                    $pc5 = 5; continue $sw5;
                }
                case 5: {
                    try {
                        r0 = new android.content.Intent();
                        r0.setPackage(r8);
                        r0.setAction("com.adrt.STEP_OVER");
                        r7.sendBroadcast(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 7; continue $sw5;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.content.Context r7, java.lang.String r8) {
        android.content.Intent r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 3;
        $sw6: while (true) {
            switch ($pc6) {
                case 7: {
                    th = $ex6;
                    if (DW == false) { $pc6 = 11; continue $sw6; }
                    abcd.wu.j6(th, -7019756002085584037L, null, r7, r8);
                    $pc6 = 11; continue $sw6;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc6 = 5; continue $sw6; }
                    try {
                        abcd.wu.j6(-7019756002085584037L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 7; continue $sw6;
                    }
                    $pc6 = 5; continue $sw6;
                }
                case 5: {
                    try {
                        r0 = new android.content.Intent();
                        r0.setPackage(r8);
                        r0.setAction("com.adrt.DISCONNECT");
                        r7.sendBroadcast(r0);
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

    public static void j6(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
        android.content.Intent r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 3;
        $sw7: while (true) {
            switch ($pc7) {
                case 7: {
                    th = $ex7;
                    if (DW == false) { $pc7 = 11; continue $sw7; }
                    abcd.wu.j6(th, -212459585372817552L, null, r8, r9, r10);
                    $pc7 = 11; continue $sw7;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc7 = 5; continue $sw7; }
                    try {
                        abcd.wu.j6(-212459585372817552L, null, r8, r9, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 7; continue $sw7;
                    }
                    $pc7 = 5; continue $sw7;
                }
                case 5: {
                    try {
                        r0 = new android.content.Intent();
                        r0.setPackage(r9);
                        r0.setAction("com.adrt.GET_FIELDS");
                        r0.putExtra("path", r10);
                        r8.sendBroadcast(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 7; continue $sw7;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.content.Context r8, java.lang.String r9, java.util.ArrayList<java.lang.String> r10) {
        android.content.Intent r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 3;
        $sw8: while (true) {
            switch ($pc8) {
                case 7: {
                    th = $ex8;
                    if (DW == false) { $pc8 = 11; continue $sw8; }
                    abcd.wu.j6(th, -980888569243410389L, null, r8, r9, r10);
                    $pc8 = 11; continue $sw8;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc8 = 5; continue $sw8; }
                    try {
                        abcd.wu.j6(-980888569243410389L, null, r8, r9, r10);
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 7; continue $sw8;
                    }
                    $pc8 = 5; continue $sw8;
                }
                case 5: {
                    try {
                        r0 = new android.content.Intent();
                        r0.setPackage(r9);
                        r0.setAction("com.adrt.SET_BREAKPOINTS");
                        r0.putStringArrayListExtra("breakpoints", r10);
                        r8.sendBroadcast(r0);
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

    public static void v5(android.content.Context r7, java.lang.String r8) {
        android.content.Intent r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 3;
        $sw9: while (true) {
            switch ($pc9) {
                case 7: {
                    th = $ex9;
                    if (DW == false) { $pc9 = 11; continue $sw9; }
                    abcd.wu.j6(th, 1967225791859342293L, null, r7, r8);
                    $pc9 = 11; continue $sw9;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (j6 == false) { $pc9 = 5; continue $sw9; }
                    try {
                        abcd.wu.j6(1967225791859342293L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 7; continue $sw9;
                    }
                    $pc9 = 5; continue $sw9;
                }
                case 5: {
                    try {
                        r0 = new android.content.Intent();
                        r0.setPackage(r8);
                        r0.setAction("com.adrt.STEP_OUT");
                        r7.sendBroadcast(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 7; continue $sw9;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
