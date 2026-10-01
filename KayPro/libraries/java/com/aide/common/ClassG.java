package com.aide.common;

@abcd.Interfacexu
public class ClassG {

    @abcd.Interfaceru(field = 4843290959917204869L)
    private static java.util.Locale DW;

    @abcd.Interfacetu
    private static boolean FH;

    @abcd.Interfaceuu
    private static boolean Hw;

    @abcd.Interfaceru(field = 4544239001975544531L)
    private static java.lang.Boolean j6;

    static {
        abcd.wu.j6(com.aide.common.ClassG.class, -5719469610590790156L, -5719469610590790156L);
    }

    public ClassG() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = 4;
        $sw0: while (true) {
            switch ($pc0) {
                case 8: {
                    th = $ex0;
                    if (Hw == false) { $pc0 = 12; continue $sw0; }
                    abcd.wu.j6(th, 1123404112429320200L, null);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc0 = 6; continue $sw0; }
                    try {
                        abcd.wu.j6(1123404112429320200L, null);
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

    public static float DW(android.content.Context r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = 4;
        $sw1: while (true) {
            switch ($pc1) {
                case 8: {
                    th = $ex1;
                    if (Hw == false) { $pc1 = 12; continue $sw1; }
                    abcd.wu.j6(th, 4003758142168701840L, null, r5);
                    $pc1 = 12; continue $sw1;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc1 = 6; continue $sw1; }
                    try {
                        abcd.wu.j6(4003758142168701840L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        $pc1 = 8; continue $sw1;
                    }
                    $pc1 = 6; continue $sw1;
                }
                case 6: {
                    return java.lang.Math.min(j6(r5), Hw(r5));
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int DW(android.content.Context r7, int r8) {
        android.content.res.TypedArray r0 = null;
        int r1 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = 3;
        $sw2: while (true) {
            switch ($pc2) {
                case 7: {
                    th = $ex2;
                    if (Hw == false) { $pc2 = 11; continue $sw2; }
                    abcd.wu.j6(th, 621390210197194053L, null, r7, new java.lang.Integer(r8));
                    $pc2 = 11; continue $sw2;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (FH == false) { $pc2 = 5; continue $sw2; }
                    try {
                        abcd.wu.j6(621390210197194053L, null, r7, new java.lang.Integer(r8));
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 7; continue $sw2;
                    }
                    $pc2 = 5; continue $sw2;
                }
                case 5: {
                    try {
                        r0 = r7.obtainStyledAttributes(new int[]{r8});
                        r1 = r0.getColor(0, -1);
                        r0.recycle();
                    } catch (java.lang.Throwable $t) {
                        $ex2 = $t;
                        $pc2 = 7; continue $sw2;
                    }
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @abcd.Interfacesu(method = -2412139209681051315L)
    private static <T extends android.view.View> T DW(android.view.View r7, java.lang.Class<T> r8) {
        android.view.ViewGroup r0 = null;
        int r2 = 0;
        T r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = 3;
        $sw3: while (true) {
            switch ($pc3) {
                case 20: {
                    th = $ex3;
                    if (Hw == false) { $pc3 = 25; continue $sw3; }
                    abcd.wu.j6(th, -753914654287951527L, null, r7, r8);
                    $pc3 = 25; continue $sw3;
                }
                case 25: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (FH == false) { $pc3 = 5; continue $sw3; }
                    try {
                        abcd.wu.j6(-753914654287951527L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 20; continue $sw3;
                    }
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    if (r7 != 0) { $pc3 = 8; continue $sw3; }
                    return null;
                }
                case 8: {
                    if (r7.getClass() != r8) { $pc3 = 11; continue $sw3; }
                    return r7;
                }
                case 11: {
                    if ((r7 instanceof android.view.ViewGroup) == false) { $pc3 = 19; continue $sw3; }
                    try {
                        r0 = (android.view.ViewGroup) r7;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        $pc3 = 20; continue $sw3;
                    }
                    r2 = 0;
                    $pc3 = 13; continue $sw3;
                }
                case 13: {
                    if (r2 >= r0.getChildCount()) { $pc3 = 19; continue $sw3; }
                    r3 = (T) DW(r0.getChildAt(r2), r8);
                    if (r3 != null) { $pc3 = 17; continue $sw3; }
                    r2 = r2 + 1;
                    { $pc3 = 13; continue $sw3; }
                }
                case 17: {
                    return r3;
                }
                case 19: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void DW(android.app.Activity r8) {
        android.view.View r5 = null;
        android.view.View r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = 4;
        $sw4: while (true) {
            switch ($pc4) {
                case 15: {
                    th = $ex4;
                    if (Hw == false) { $pc4 = 19; continue $sw4; }
                    abcd.wu.j6(th, -175477646570065261L, null, r8);
                    $pc4 = 19; continue $sw4;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc4 = 7; continue $sw4; }
                    try {
                        abcd.wu.j6(-175477646570065261L, null, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 15; continue $sw4;
                    }
                    $pc4 = 7; continue $sw4;
                }
                case 7: {
                    if (android.os.Build.VERSION.SDK_INT < 21) { $pc4 = 22; continue $sw4; }
                    try {
                        r5 = r8.findViewById(r8.getResources().getIdentifier("action_bar", "id", "android"));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 15; continue $sw4;
                    }
                    if ((r5 instanceof android.view.ViewGroup) == false) { $pc4 = 11; continue $sw4; }
                    try {
                        ((android.view.ViewGroup) r5).setTouchscreenBlocksFocus(false);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 15; continue $sw4;
                    }
                    $pc4 = 11; continue $sw4;
                }
                case 11: {
                    try {
                        r0 = r8.findViewById(r8.getResources().getIdentifier("action_bar_container", "id", "android"));
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 15; continue $sw4;
                    }
                    if ((r0 instanceof android.view.ViewGroup) == false) { $pc4 = 23; continue $sw4; }
                    try {
                        ((android.view.ViewGroup) r0).setTouchscreenBlocksFocus(false);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        $pc4 = 15; continue $sw4;
                    }
                    return;
                }
                case 23: {
                    return;
                }
                case 22: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean DW(android.view.MotionEvent r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = 4;
        $sw5: while (true) {
            switch ($pc5) {
                case 14: {
                    th = $ex5;
                    if (Hw == false) { $pc5 = 18; continue $sw5; }
                    abcd.wu.j6(th, -4371106096306733584L, null, r5);
                    $pc5 = 18; continue $sw5;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc5 = 7; continue $sw5; }
                    try {
                        abcd.wu.j6(-4371106096306733584L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex5 = $t;
                        $pc5 = 14; continue $sw5;
                    }
                    $pc5 = 7; continue $sw5;
                }
                case 7: {
                    if (j6(r5) == false) { $pc5 = 12; continue $sw5; }
                    if (r5.getButtonState() != 2) { $pc5 = 12; continue $sw5; }
                    return true;
                }
                case 12: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean EQ(android.content.Context r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = 4;
        $sw6: while (true) {
            switch ($pc6) {
                case 13: {
                    th = $ex6;
                    if (Hw == false) { $pc6 = 17; continue $sw6; }
                    abcd.wu.j6(th, -5853450705758181103L, null, r5);
                    $pc6 = 17; continue $sw6;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc6 = 7; continue $sw6; }
                    try {
                        abcd.wu.j6(-5853450705758181103L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex6 = $t;
                        $pc6 = 13; continue $sw6;
                    }
                    $pc6 = 7; continue $sw6;
                }
                case 7: {
                    if (r5.getResources().getConfiguration().keyboard != 2) { $pc6 = 11; continue $sw6; }
                    if (r5.getResources().getConfiguration().hardKeyboardHidden == 2) { $pc6 = 11; continue $sw6; }
                    return true;
                }
                case 11: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int FH(android.content.Context r5) {
        android.view.WindowManager r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = 4;
        $sw7: while (true) {
            switch ($pc7) {
                case 8: {
                    th = $ex7;
                    if (Hw == false) { $pc7 = 12; continue $sw7; }
                    abcd.wu.j6(th, -4498292904257305317L, null, r5);
                    $pc7 = 12; continue $sw7;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc7 = 6; continue $sw7; }
                    try {
                        abcd.wu.j6(-4498292904257305317L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    try {
                        r3 = (android.view.WindowManager) r5.getSystemService("window");
                    } catch (java.lang.Throwable $t) {
                        $ex7 = $t;
                        $pc7 = 8; continue $sw7;
                    }
                    return java.lang.Math.min(r3.getDefaultDisplay().getHeight(), r3.getDefaultDisplay().getWidth());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int FH(android.content.Context r7, int r8) {
        android.content.res.TypedArray r0 = null;
        int r1 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex8 = null;
        int $pc8 = 3;
        $sw8: while (true) {
            switch ($pc8) {
                case 7: {
                    th = $ex8;
                    if (Hw == false) { $pc8 = 11; continue $sw8; }
                    abcd.wu.j6(th, -1437560050403393320L, null, r7, new java.lang.Integer(r8));
                    $pc8 = 11; continue $sw8;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (FH == false) { $pc8 = 5; continue $sw8; }
                    try {
                        abcd.wu.j6(-1437560050403393320L, null, r7, new java.lang.Integer(r8));
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 7; continue $sw8;
                    }
                    $pc8 = 5; continue $sw8;
                }
                case 5: {
                    try {
                        r0 = r7.obtainStyledAttributes(new int[]{r8});
                        r1 = r0.getResourceId(0, 0);
                        r0.recycle();
                    } catch (java.lang.Throwable $t) {
                        $ex8 = $t;
                        $pc8 = 7; continue $sw8;
                    }
                    return r1;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void FH(android.app.Activity r7) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = 4;
        $sw9: while (true) {
            switch ($pc9) {
                case 8: {
                    th = $ex9;
                    if (Hw == false) { $pc9 = 12; continue $sw9; }
                    abcd.wu.j6(th, -5968739812695808131L, null, r7);
                    $pc9 = 12; continue $sw9;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc9 = 6; continue $sw9; }
                    try {
                        abcd.wu.j6(-5968739812695808131L, null, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        $pc9 = 8; continue $sw9;
                    }
                    $pc9 = 6; continue $sw9;
                }
                case 6: {
                    try {
                        new android.os.Handler().postDelayed(new com.aide.common.Runnablef(r7), 200);
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

    @abcd.Interfacesu(method = -2606726766413675937L)
    private static boolean FH(android.view.MotionEvent r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex10 = null;
        int $pc10 = 4;
        $sw10: while (true) {
            switch ($pc10) {
                case 17: {
                    th = $ex10;
                    if (Hw == false) { $pc10 = 21; continue $sw10; }
                    abcd.wu.j6(th, 1194221725721743915L, null, r5);
                    $pc10 = 21; continue $sw10;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc10 = 7; continue $sw10; }
                    try {
                        abcd.wu.j6(1194221725721743915L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex10 = $t;
                        $pc10 = 17; continue $sw10;
                    }
                    $pc10 = 7; continue $sw10;
                }
                case 7: {
                    if (r5.getAction() != 0) { $pc10 = 9; continue $sw10; }
                    $pc10 = 12; continue $sw10;
                }
                case 12: {
                    if (r5.getButtonState() != 0) { $pc10 = 15; continue $sw10; }
                    return true;
                }
                case 15: {
                    return false;
                }
                case 9: {
                    if (r5.getAction() == 3) { $pc10 = 12; continue $sw10; }
                    if (r5.getAction() != 2) { $pc10 = 15; continue $sw10; }
                    { $pc10 = 12; continue $sw10; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static float Hw(android.content.Context r5) {
        android.view.WindowManager r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = 4;
        $sw11: while (true) {
            switch ($pc11) {
                case 9: {
                    th = $ex11;
                    if (Hw == false) { $pc11 = 13; continue $sw11; }
                    abcd.wu.j6(th, -3184543668233818835L, null, r5);
                    $pc11 = 13; continue $sw11;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc11 = 6; continue $sw11; }
                    try {
                        abcd.wu.j6(-3184543668233818835L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 9; continue $sw11;
                    }
                    $pc11 = 6; continue $sw11;
                }
                case 6: {
                    try {
                        r3 = (android.view.WindowManager) r5.getSystemService("window");
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 9; continue $sw11;
                    }
                    return r3.getDefaultDisplay().getWidth() / r5.getResources().getDisplayMetrics().density;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @android.annotation.TargetApi(21)
    public static void Hw(android.app.Activity r9) {
        float r3 = 0.0f;
        android.view.View r4 = null;
        int r5 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = 4;
        $sw12: while (true) {
            switch ($pc12) {
                case 12: {
                    th = $ex12;
                    if (Hw == false) { $pc12 = 16; continue $sw12; }
                    abcd.wu.j6(th, 948696159716436028L, null, r9);
                    $pc12 = 16; continue $sw12;
                }
                case 16: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc12 = 7; continue $sw12; }
                    try {
                        abcd.wu.j6(948696159716436028L, null, r9);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 12; continue $sw12;
                    }
                    $pc12 = 7; continue $sw12;
                }
                case 7: {
                    if (J8(r9) == false) { $pc12 = 19; continue $sw12; }
                    try {
                        r3 = r9.getResources().getDisplayMetrics().density;
                        r9.getActionBar().setElevation(3.0f * r3);
                        r4 = r9.getWindow().getDecorView().findViewById(r9.getResources().getIdentifier("action_bar_container", "id", "android"));
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 12; continue $sw12;
                    }
                    if (r4 == null) { $pc12 = 20; continue $sw12; }
                    try {
                        r5 = (int) (48.0f * r3);
                        r4.setPadding(r5, (int) (r3 * 27.0f), r5, 0);
                    } catch (java.lang.Throwable $t) {
                        $ex12 = $t;
                        $pc12 = 12; continue $sw12;
                    }
                    return;
                }
                case 20: {
                    return;
                }
                case 19: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean J0(android.content.Context r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = 4;
        $sw13: while (true) {
            switch ($pc13) {
                case 13: {
                    th = $ex13;
                    if (Hw == false) { $pc13 = 17; continue $sw13; }
                    abcd.wu.j6(th, 3217005404104941453L, null, r5);
                    $pc13 = 17; continue $sw13;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc13 = 7; continue $sw13; }
                    try {
                        abcd.wu.j6(3217005404104941453L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        $pc13 = 13; continue $sw13;
                    }
                    $pc13 = 7; continue $sw13;
                }
                case 7: {
                    if (j6() == true) { $pc13 = 11; continue $sw13; }
                    if (J8(r5) == true) { $pc13 = 11; continue $sw13; }
                    return true;
                }
                case 11: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean J8(android.content.Context r6) {
        boolean r3 = false;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex14 = null;
        int $pc14 = 4;
        $sw14: while (true) {
            switch ($pc14) {
                case 16: {
                    th = $ex14;
                    if (Hw == false) { $pc14 = 20; continue $sw14; }
                    abcd.wu.j6(th, -2081768783119786509L, null, r6);
                    $pc14 = 20; continue $sw14;
                }
                case 20: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc14 = 7; continue $sw14; }
                    try {
                        abcd.wu.j6(-2081768783119786509L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 16; continue $sw14;
                    }
                    $pc14 = 7; continue $sw14;
                }
                case 7: {
                    if (j6 != null) { $pc14 = 14; continue $sw14; }
                    r3 = false;
                    try {
                        j6 = false;
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 16; continue $sw14;
                    }
                    if (android.os.Build.VERSION.SDK_INT < 21) { $pc14 = 14; continue $sw14; }
                    if (((android.app.UiModeManager) r6.getSystemService("uimode")).getCurrentModeType() != 4) { $pc14 = 13; continue $sw14; }
                    r3 = true;
                    $pc14 = 13; continue $sw14;
                }
                case 13: {
                    try {
                        j6 = java.lang.Boolean.valueOf(r3);
                    } catch (java.lang.Throwable $t) {
                        $ex14 = $t;
                        $pc14 = 16; continue $sw14;
                    }
                    $pc14 = 14; continue $sw14;
                }
                case 14: {
                    return j6.booleanValue();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean QX(android.content.Context r7) {
        android.util.TypedValue r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex15 = null;
        int $pc15 = 4;
        $sw15: while (true) {
            switch ($pc15) {
                case 14: {
                    th = $ex15;
                    if (Hw == false) { $pc15 = 18; continue $sw15; }
                    abcd.wu.j6(th, -2163333111741559520L, null, r7);
                    $pc15 = 18; continue $sw15;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc15 = 7; continue $sw15; }
                    try {
                        abcd.wu.j6(-2163333111741559520L, null, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 14; continue $sw15;
                    }
                    $pc15 = 7; continue $sw15;
                }
                case 7: {
                    if (android.os.Build.VERSION.SDK_INT < 20) { $pc15 = 12; continue $sw15; }
                    try {
                        r3 = new android.util.TypedValue();
                    } catch (java.lang.Throwable $t) {
                        $ex15 = $t;
                        $pc15 = 14; continue $sw15;
                    }
                    if (r7.getTheme().resolveAttribute(com.aide.ui.Ma.theme_name, r3, true) == false) { $pc15 = 21; continue $sw15; }
                    return "Material".equals(r3.string);
                }
                case 21: {
                    return false;
                }
                case 12: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static float VH(android.content.Context r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex16 = null;
        int $pc16 = 4;
        $sw16: while (true) {
            switch ($pc16) {
                case 17: {
                    th = $ex16;
                    if (Hw == false) { $pc16 = 21; continue $sw16; }
                    abcd.wu.j6(th, -450878124985839000L, null, r5);
                    $pc16 = 21; continue $sw16;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc16 = 7; continue $sw16; }
                    try {
                        abcd.wu.j6(-450878124985839000L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex16 = $t;
                        $pc16 = 17; continue $sw16;
                    }
                    $pc16 = 7; continue $sw16;
                }
                case 7: {
                    if (DW(r5) <= 720.0f) { $pc16 = 10; continue $sw16; }
                    return 25.0f;
                }
                case 10: {
                    if (DW(r5) < 400.0f) { $pc16 = 15; continue $sw16; }
                    return 22.0f;
                }
                case 15: {
                    return 20.0f;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean Ws(android.content.Context r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex17 = null;
        int $pc17 = 4;
        $sw17: while (true) {
            switch ($pc17) {
                case 14: {
                    th = $ex17;
                    if (Hw == false) { $pc17 = 18; continue $sw17; }
                    abcd.wu.j6(th, -3092613739657721945L, null, r5);
                    $pc17 = 18; continue $sw17;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc17 = 7; continue $sw17; }
                    try {
                        abcd.wu.j6(-3092613739657721945L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex17 = $t;
                        $pc17 = 14; continue $sw17;
                    }
                    $pc17 = 7; continue $sw17;
                }
                case 7: {
                    if (r5.getPackageManager().hasSystemFeature("android.hardware.type.pc") == true) { $pc17 = 12; continue $sw17; }
                    if (r5.getPackageManager().hasSystemFeature("org.chromium.arc.device_management") == true) { $pc17 = 12; continue $sw17; }
                    return false;
                }
                case 12: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int Zo(android.content.Context r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex18 = null;
        int $pc18 = 4;
        $sw18: while (true) {
            switch ($pc18) {
                case 17: {
                    th = $ex18;
                    if (Hw == false) { $pc18 = 21; continue $sw18; }
                    abcd.wu.j6(th, -756466250292846912L, null, r5);
                    $pc18 = 21; continue $sw18;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc18 = 7; continue $sw18; }
                    try {
                        abcd.wu.j6(-756466250292846912L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex18 = $t;
                        $pc18 = 17; continue $sw18;
                    }
                    $pc18 = 7; continue $sw18;
                }
                case 7: {
                    if (DW(r5) <= 720.0f) { $pc18 = 10; continue $sw18; }
                    return 21;
                }
                case 10: {
                    if (DW(r5) < 400.0f) { $pc18 = 15; continue $sw18; }
                    return 18;
                }
                case 15: {
                    return 14;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static float gn(android.content.Context r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex19 = null;
        int $pc19 = 4;
        $sw19: while (true) {
            switch ($pc19) {
                case 17: {
                    th = $ex19;
                    if (Hw == false) { $pc19 = 21; continue $sw19; }
                    abcd.wu.j6(th, 781510863908749200L, null, r5);
                    $pc19 = 21; continue $sw19;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc19 = 7; continue $sw19; }
                    try {
                        abcd.wu.j6(781510863908749200L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex19 = $t;
                        $pc19 = 17; continue $sw19;
                    }
                    $pc19 = 7; continue $sw19;
                }
                case 7: {
                    if (DW(r5) <= 720.0f) { $pc19 = 10; continue $sw19; }
                    return 35.0f;
                }
                case 10: {
                    if (DW(r5) < 400.0f) { $pc19 = 15; continue $sw19; }
                    return 30.0f;
                }
                case 15: {
                    return 25.0f;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static float j6(android.content.Context r5) {
        android.view.WindowManager r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex20 = null;
        int $pc20 = 4;
        $sw20: while (true) {
            switch ($pc20) {
                case 9: {
                    th = $ex20;
                    if (Hw == false) { $pc20 = 13; continue $sw20; }
                    abcd.wu.j6(th, 4933710697175507848L, null, r5);
                    $pc20 = 13; continue $sw20;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc20 = 6; continue $sw20; }
                    try {
                        abcd.wu.j6(4933710697175507848L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 9; continue $sw20;
                    }
                    $pc20 = 6; continue $sw20;
                }
                case 6: {
                    try {
                        r3 = (android.view.WindowManager) r5.getSystemService("window");
                    } catch (java.lang.Throwable $t) {
                        $ex20 = $t;
                        $pc20 = 9; continue $sw20;
                    }
                    return r3.getDefaultDisplay().getHeight() / r5.getResources().getDisplayMetrics().density;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static int j6(android.content.Context r7, int r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex21 = null;
        int $pc21 = 3;
        $sw21: while (true) {
            switch ($pc21) {
                case 11: {
                    th = $ex21;
                    if (Hw == false) { $pc21 = 15; continue $sw21; }
                    abcd.wu.j6(th, -1243226287542072044L, null, r7, new java.lang.Integer(r8));
                    $pc21 = 15; continue $sw21;
                }
                case 15: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (FH == false) { $pc21 = 5; continue $sw21; }
                    try {
                        abcd.wu.j6(-1243226287542072044L, null, r7, new java.lang.Integer(r8));
                    } catch (java.lang.Throwable $t) {
                        $ex21 = $t;
                        $pc21 = 11; continue $sw21;
                    }
                    $pc21 = 5; continue $sw21;
                }
                case 5: {
                    if (DW(r7) >= 400.0f) { $pc21 = 9; continue $sw21; }
                    return r8;
                }
                case 9: {
                    return (int) (r8 * 1.3f);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static android.graphics.drawable.Drawable j6(android.content.Context r8, int r9, int r10) {
        android.graphics.drawable.Drawable r0 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex22 = null;
        int $pc22 = 3;
        $sw22: while (true) {
            switch ($pc22) {
                case 7: {
                    th = $ex22;
                    if (Hw == false) { $pc22 = 11; continue $sw22; }
                    abcd.wu.j6(th, -7110126465582252149L, null, r8, new java.lang.Integer(r9), new java.lang.Integer(r10));
                    $pc22 = 11; continue $sw22;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (FH == false) { $pc22 = 5; continue $sw22; }
                    try {
                        abcd.wu.j6(-7110126465582252149L, null, r8, new java.lang.Integer(r9), new java.lang.Integer(r10));
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 7; continue $sw22;
                    }
                    $pc22 = 5; continue $sw22;
                }
                case 5: {
                    try {
                        r0 = android.support.v4.content.b.DW(r8, FH(r8, r9));
                        r0.setColorFilter(DW(r8, r10), android.graphics.PorterDuff.Mode.SRC_IN);
                    } catch (java.lang.Throwable $t) {
                        $ex22 = $t;
                        $pc22 = 7; continue $sw22;
                    }
                    return r0;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static android.view.View j6(android.view.View r0, java.lang.Class r1) {
        return DW(r0, r1);
    }

    public static void j6(android.app.Activity r6) {
        android.view.ViewConfiguration r3 = null;
        java.lang.reflect.Field r4 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex23 = null;
        int $pc23 = 4;
        $sw23: while (true) {
            switch ($pc23) {
                case 13: {
                    th = $ex23;
                    if (Hw == false) { $pc23 = 17; continue $sw23; }
                    abcd.wu.j6(th, 750338857930420512L, null, r6);
                    $pc23 = 17; continue $sw23;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc23 = 8; continue $sw23; }
                    try {
                        abcd.wu.j6(750338857930420512L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        $pc23 = 13; continue $sw23;
                    }
                    $pc23 = 8; continue $sw23;
                }
                case 8: {
                    if (DW(r6) < 540.0f) { $pc23 = 22; continue $sw23; }
                    try {
                        r3 = android.view.ViewConfiguration.get(r6);
                        r4 = android.view.ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        if ($t instanceof java.lang.Exception) { $pc23 = 18; continue $sw23; }
                        $pc23 = 13; continue $sw23;
                    }
                    if (r4 == null) { $pc23 = 23; continue $sw23; }
                    try {
                        r4.setAccessible(true);
                        r4.setBoolean(r3, false);
                    } catch (java.lang.Throwable $t) {
                        $ex23 = $t;
                        if ($t instanceof java.lang.Exception) { $pc23 = 18; continue $sw23; }
                        $pc23 = 13; continue $sw23;
                    }
                    return;
                    { $pc23 = 24; continue $sw23; }
                }
                case 23: {
                    return;
                }
                case 24: {
                    return;
                }
                case 18: {
                    $pc23 = 22; continue $sw23;
                }
                case 22: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.app.Activity r7, java.lang.String r8) {
        java.util.Locale r0 = null;
        android.content.res.Configuration r1 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex24 = null;
        int $pc24 = 3;
        $sw24: while (true) {
            switch ($pc24) {
                case 13: {
                    th = $ex24;
                    if (Hw == false) { $pc24 = 17; continue $sw24; }
                    abcd.wu.j6(th, -4320628111573899060L, null, r7, r8);
                    $pc24 = 17; continue $sw24;
                }
                case 17: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (FH == false) { $pc24 = 5; continue $sw24; }
                    try {
                        abcd.wu.j6(-4320628111573899060L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 13; continue $sw24;
                    }
                    $pc24 = 5; continue $sw24;
                }
                case 5: {
                    if (r8 != null) { $pc24 = 7; continue $sw24; }
                    $pc24 = 9; continue $sw24;
                }
                case 9: {
                    try {
                        r0 = DW;
                        DW = null;
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 13; continue $sw24;
                    }
                    $pc24 = 10; continue $sw24;
                }
                case 10: {
                    if (r0 == null) { $pc24 = 20; continue $sw24; }
                    try {
                        java.util.Locale.setDefault(r0);
                        r1 = new android.content.res.Configuration();
                        r1.locale = r0;
                        r7.getBaseContext().getResources().updateConfiguration(r1, r7.getBaseContext().getResources().getDisplayMetrics());
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 13; continue $sw24;
                    }
                    return;
                }
                case 20: {
                    return;
                }
                case 7: {
                    if ("default".equals(r8) == true) { $pc24 = 9; continue $sw24; }
                    try {
                        r0 = new java.util.Locale(r8);
                        DW = java.util.Locale.getDefault();
                    } catch (java.lang.Throwable $t) {
                        $ex24 = $t;
                        $pc24 = 13; continue $sw24;
                    }
                    { $pc24 = 10; continue $sw24; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.app.Activity r7, boolean r8) {
        java.lang.reflect.Method r0 = null;
        java.lang.Throwable e = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex25 = null;
        int $pc25 = 3;
        $sw25: while (true) {
            switch ($pc25) {
                case 10: {
                    th = $ex25;
                    if (Hw == false) { $pc25 = 14; continue $sw25; }
                    abcd.wu.j6(th, -5698127656685140416L, null, r7, new java.lang.Boolean(r8));
                    $pc25 = 14; continue $sw25;
                }
                case 14: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (FH == false) { $pc25 = 15; continue $sw25; }
                    try {
                        abcd.wu.j6(-5698127656685140416L, null, r7, new java.lang.Boolean(r8));
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 10; continue $sw25;
                    }
                    $pc25 = 15; continue $sw25;
                }
                case 15: {
                    try {
                        r0 = r7.getActionBar().getClass().getDeclaredMethod("setHasEmbeddedTabs", new java.lang.Class[]{java.lang.Boolean.TYPE});
                        r0.setAccessible(true);
                        r0.invoke(r7.getActionBar(), new java.lang.Object[]{java.lang.Boolean.valueOf(r8)});
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        if ($t instanceof java.lang.Exception) { $pc25 = 7; continue $sw25; }
                        $pc25 = 10; continue $sw25;
                    }
                    $pc25 = 19; continue $sw25;
                }
                case 19: {
                    return;
                }
                case 7: {
                    e = $ex25;
                    try {
                        e.printStackTrace();
                    } catch (java.lang.Throwable $t) {
                        $ex25 = $t;
                        $pc25 = 10; continue $sw25;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.content.Context r7, android.graphics.Rect r8) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex26 = null;
        int $pc26 = 3;
        $sw26: while (true) {
            switch ($pc26) {
                case 7: {
                    th = $ex26;
                    if (Hw == false) { $pc26 = 11; continue $sw26; }
                    abcd.wu.j6(th, 5332574427369261111L, null, r7, r8);
                    $pc26 = 11; continue $sw26;
                }
                case 11: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (FH == false) { $pc26 = 5; continue $sw26; }
                    try {
                        abcd.wu.j6(5332574427369261111L, null, r7, r8);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 7; continue $sw26;
                    }
                    $pc26 = 5; continue $sw26;
                }
                case 5: {
                    try {
                        ((android.app.Activity) r7).getWindow().getDecorView().getWindowVisibleDisplayFrame(r8);
                    } catch (java.lang.Throwable $t) {
                        $ex26 = $t;
                        $pc26 = 7; continue $sw26;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.view.View r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex27 = null;
        int $pc27 = 4;
        $sw27: while (true) {
            switch ($pc27) {
                case 8: {
                    th = $ex27;
                    if (Hw == false) { $pc27 = 12; continue $sw27; }
                    abcd.wu.j6(th, -2576100528666937080L, null, r5);
                    $pc27 = 12; continue $sw27;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc27 = 6; continue $sw27; }
                    try {
                        abcd.wu.j6(-2576100528666937080L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 8; continue $sw27;
                    }
                    $pc27 = 6; continue $sw27;
                }
                case 6: {
                    try {
                        j6(r5, false);
                    } catch (java.lang.Throwable $t) {
                        $ex27 = $t;
                        $pc27 = 8; continue $sw27;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    @android.annotation.TargetApi(21)
    public static void j6(android.view.View r9, boolean r10) {
        android.app.Activity r0 = null;
        float r1 = 0.0f;
        int r2 = 0;
        int r5 = 0;
        android.view.View r3 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex28 = null;
        int $pc28 = 3;
        $sw28: while (true) {
            switch ($pc28) {
                case 15: {
                    th = $ex28;
                    if (Hw == false) { $pc28 = 19; continue $sw28; }
                    abcd.wu.j6(th, 830483819560853601L, null, r9, new java.lang.Boolean(r10));
                    $pc28 = 19; continue $sw28;
                }
                case 19: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 3: {
                    if (FH == false) { $pc28 = 6; continue $sw28; }
                    try {
                        abcd.wu.j6(830483819560853601L, null, r9, new java.lang.Boolean(r10));
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 15; continue $sw28;
                    }
                    $pc28 = 6; continue $sw28;
                }
                case 6: {
                    if (J8(r9.getContext()) == false) { $pc28 = 22; continue $sw28; }
                    try {
                        r0 = (android.app.Activity) r9.getContext();
                        r1 = r0.getResources().getDisplayMetrics().density;
                        r0.getActionBar().setElevation(3.0f * r1);
                        r2 = (int) (48.0f * r1);
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 15; continue $sw28;
                    }
                    if (r10 == false) { $pc28 = 10; continue $sw28; }
                    try {
                        r5 = (int) (r1 * 27.0f);
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 15; continue $sw28;
                    }
                    $pc28 = 11; continue $sw28;
                }
                case 11: {
                    try {
                        r9.setPadding(r2, 0, r2, r5);
                        r3 = r0.getWindow().getDecorView().findViewById(r0.getResources().getIdentifier("action_bar_container", "id", "android"));
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 15; continue $sw28;
                    }
                    if (r3 == null) { $pc28 = 23; continue $sw28; }
                    try {
                        r3.setPadding(r2, (int) (r1 * 27.0f), r2, 0);
                    } catch (java.lang.Throwable $t) {
                        $ex28 = $t;
                        $pc28 = 15; continue $sw28;
                    }
                    return;
                }
                case 23: {
                    return;
                }
                case 10: {
                    r5 = 0;
                    { $pc28 = 11; continue $sw28; }
                }
                case 22: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.widget.TextView r6) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex29 = null;
        int $pc29 = 4;
        $sw29: while (true) {
            switch ($pc29) {
                case 8: {
                    th = $ex29;
                    if (Hw == false) { $pc29 = 12; continue $sw29; }
                    abcd.wu.j6(th, -3170672808846646372L, null, r6);
                    $pc29 = 12; continue $sw29;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc29 = 6; continue $sw29; }
                    try {
                        abcd.wu.j6(-3170672808846646372L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 8; continue $sw29;
                    }
                    $pc29 = 6; continue $sw29;
                }
                case 6: {
                    try {
                        r6.setTextSize(j6(r6.getContext(), (int) r6.getTextSize()) / r6.getContext().getResources().getDisplayMetrics().scaledDensity);
                    } catch (java.lang.Throwable $t) {
                        $ex29 = $t;
                        $pc29 = 8; continue $sw29;
                    }
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6() {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex30 = null;
        int $pc30 = 4;
        $sw30: while (true) {
            switch ($pc30) {
                case 8: {
                    th = $ex30;
                    if (Hw == false) { $pc30 = 12; continue $sw30; }
                    abcd.wu.j6(th, 3340886991838745825L, null);
                    $pc30 = 12; continue $sw30;
                }
                case 12: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc30 = 15; continue $sw30; }
                    try {
                        abcd.wu.j6(3340886991838745825L, null);
                    } catch (java.lang.Throwable $t) {
                        $ex30 = $t;
                        $pc30 = 8; continue $sw30;
                    }
                    return false;
                }
                case 15: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(android.view.MotionEvent r7) {
        int r8 = 0;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex31 = null;
        int $pc31 = 4;
        $sw31: while (true) {
            switch ($pc31) {
                case 19: {
                    th = $ex31;
                    if (Hw == false) { $pc31 = 23; continue $sw31; }
                    abcd.wu.j6(th, 6543668983874266464L, null, r7);
                    $pc31 = 23; continue $sw31;
                }
                case 23: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc31 = 7; continue $sw31; }
                    try {
                        abcd.wu.j6(6543668983874266464L, null, r7);
                    } catch (java.lang.Throwable $t) {
                        $ex31 = $t;
                        $pc31 = 19; continue $sw31;
                    }
                    $pc31 = 7; continue $sw31;
                }
                case 7: {
                    if (FH(r7) == false) { $pc31 = 10; continue $sw31; }
                    return false;
                }
                case 10: {
                    if (r7.getToolType(0) != 3) { $pc31 = 12; continue $sw31; }
                    return true;
                }
                case 12: {
                    try {
                        r8 = r7.getSource();
                    } catch (java.lang.Throwable $t) {
                        $ex31 = $t;
                        $pc31 = 19; continue $sw31;
                    }
                    if (r8 != 8194) { $pc31 = 16; continue $sw31; }
                    $pc31 = 18; continue $sw31;
                }
                case 18: {
                    return true;
                }
                case 16: {
                    if (r8 == 1048584) { $pc31 = 18; continue $sw31; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static float tp(android.content.Context r6) {
        android.app.Activity r3 = null;
        float r4 = 0.0f;
        android.graphics.Rect r5 = null;
        java.lang.Throwable th = null;
        java.lang.Throwable $ex32 = null;
        int $pc32 = 4;
        $sw32: while (true) {
            switch ($pc32) {
                case 9: {
                    th = $ex32;
                    if (Hw == false) { $pc32 = 13; continue $sw32; }
                    abcd.wu.j6(th, -4172557700451251640L, null, r6);
                    $pc32 = 13; continue $sw32;
                }
                case 13: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc32 = 6; continue $sw32; }
                    try {
                        abcd.wu.j6(-4172557700451251640L, null, r6);
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 9; continue $sw32;
                    }
                    $pc32 = 6; continue $sw32;
                }
                case 6: {
                    try {
                        r3 = (android.app.Activity) r6;
                        r4 = r3.getResources().getDisplayMetrics().density;
                        r5 = new android.graphics.Rect();
                        r3.getWindow().getDecorView().getWindowVisibleDisplayFrame(r5);
                    } catch (java.lang.Throwable $t) {
                        $ex32 = $t;
                        $pc32 = 9; continue $sw32;
                    }
                    return (r5.bottom - r5.top) / r4;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static float u7(android.content.Context r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex33 = null;
        int $pc33 = 4;
        $sw33: while (true) {
            switch ($pc33) {
                case 17: {
                    th = $ex33;
                    if (Hw == false) { $pc33 = 21; continue $sw33; }
                    abcd.wu.j6(th, 879740075994925176L, null, r5);
                    $pc33 = 21; continue $sw33;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc33 = 7; continue $sw33; }
                    try {
                        abcd.wu.j6(879740075994925176L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex33 = $t;
                        $pc33 = 17; continue $sw33;
                    }
                    $pc33 = 7; continue $sw33;
                }
                case 7: {
                    if (DW(r5) <= 720.0f) { $pc33 = 10; continue $sw33; }
                    return 20.0f;
                }
                case 10: {
                    if (DW(r5) < 400.0f) { $pc33 = 15; continue $sw33; }
                    return 18.0f;
                }
                case 15: {
                    return 15.0f;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static float v5(android.content.Context r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex34 = null;
        int $pc34 = 4;
        $sw34: while (true) {
            switch ($pc34) {
                case 17: {
                    th = $ex34;
                    if (Hw == false) { $pc34 = 21; continue $sw34; }
                    abcd.wu.j6(th, 811111452886127169L, null, r5);
                    $pc34 = 21; continue $sw34;
                }
                case 21: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc34 = 7; continue $sw34; }
                    try {
                        abcd.wu.j6(811111452886127169L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex34 = $t;
                        $pc34 = 17; continue $sw34;
                    }
                    $pc34 = 7; continue $sw34;
                }
                case 7: {
                    if (DW(r5) <= 720.0f) { $pc34 = 10; continue $sw34; }
                    return 25.0f;
                }
                case 10: {
                    if (DW(r5) < 400.0f) { $pc34 = 15; continue $sw34; }
                    return 22.0f;
                }
                case 15: {
                    return 20.0f;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean we(android.content.Context r5) {
        java.lang.Throwable th = null;
        java.lang.Throwable $ex35 = null;
        int $pc35 = 4;
        $sw35: while (true) {
            switch ($pc35) {
                case 14: {
                    th = $ex35;
                    if (Hw == false) { $pc35 = 18; continue $sw35; }
                    abcd.wu.j6(th, -4802308845907983971L, null, r5);
                    $pc35 = 18; continue $sw35;
                }
                case 18: {
                    throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow(th);
                }
                case 4: {
                    if (FH == false) { $pc35 = 7; continue $sw35; }
                    try {
                        abcd.wu.j6(-4802308845907983971L, null, r5);
                    } catch (java.lang.Throwable $t) {
                        $ex35 = $t;
                        $pc35 = 14; continue $sw35;
                    }
                    $pc35 = 7; continue $sw35;
                }
                case 7: {
                    if (r5.getResources().getConfiguration().keyboard == 1) { $pc35 = 21; continue $sw35; }
                    if (r5.getResources().getConfiguration().hardKeyboardHidden == 2) { $pc35 = 22; continue $sw35; }
                    return false;
                }
                case 22: {
                    return true;
                }
                case 21: {
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
