package abcd;

public class Hv {
    private static java.lang.reflect.Field DW;
    private static java.lang.Object FH;
    private static java.lang.reflect.Field Hw;
    private static java.lang.Runnable VH;
    private static android.os.Handler Zo;
    private static android.app.Activity gn;
    private static java.util.List<android.util.Pair<android.view.View, com.appfour.backbone.api.objects.UserActionWindow>> j6;
    private static abcd.Hv.a u7;
    private static java.lang.Object v5;

    private static class a extends android.view.inputmethod.InputConnectionWrapper {
        public a(android.view.inputmethod.InputConnection r1, boolean r2) {
            super(r1, r2);
        }

        private void j6() {
            com.appfour.backbone.api.objects.UserActionWindow r0 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        r0 = abcd.Hv.gn();
                        if (r0 == null) { $pc0 = 6; continue $sw0; }
                        abcd.Qv.DW(new com.appfour.backbone.api.objects.UserInputAction(r0, false));
                        return;
                    }
                    case 6: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public boolean commitText(java.lang.CharSequence r1, int r2) {
            j6();
            return super.commitText(r1, r2);
        }

        @Override
        public boolean setComposingText(java.lang.CharSequence r1, int r2) {
            j6();
            return super.setComposingText(r1, r2);
        }
    }

    static {
        j6 = new java.util.ArrayList();
    }

    private static android.view.Window DW(android.view.View r3) {
        java.lang.reflect.Field r0 = null;
        java.lang.reflect.Field r1 = null;
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    try {
                        r0 = java.lang.Class.forName("com.android.internal.policy.DecorView").getDeclaredField("mWindow");
                        r0.setAccessible(true);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 5; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return (android.view.Window) r0.get(r3);
                }
                case 5: {
                    try {
                        r1 = r3.getClass().getDeclaredField("this$0");
                        r1.setAccessible(true);
                    } catch (java.lang.Throwable $t) {
                        $ex1 = $t;
                        if ($t instanceof java.lang.Exception) { $pc1 = 7; continue $sw1; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return (android.view.Window) r1.get(r3);
                }
                case 7: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void DW() {
        we();
    }

    private static boolean DW(android.content.Intent r2) {
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (r2 != null) { $pc2 = 4; continue $sw2; }
                    $pc2 = 10; continue $sw2;
                }
                case 10: {
                    return false;
                }
                case 4: {
                    if ("android.intent.action.MAIN".equals(r2.getAction()) == false) { $pc2 = 10; continue $sw2; }
                    if (r2.getCategories() == null) { $pc2 = 10; continue $sw2; }
                    if (r2.getCategories().contains("android.intent.category.LAUNCHER") == false) { $pc2 = 10; continue $sw2; }
                    return true;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static java.util.List<android.view.View> EQ() {
        java.util.ArrayList r0 = null;
        java.lang.Object r1 = null;
        java.util.List r2 = null;
        java.util.Iterator r3 = null;
        android.view.View r4 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = new java.util.ArrayList();
                    r1 = null;
                    if (DW == null) { $pc3 = 7; continue $sw3; }
                    try {
                        r1 = DW.get(FH);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.IllegalAccessException) { $pc3 = 23; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc3 = 9; continue $sw3;
                }
                case 9: {
                    try {
                        r2 = new java.util.ArrayList();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.IllegalAccessException) { $pc3 = 23; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if ((r1 instanceof java.util.List) == false) { $pc3 = 13; continue $sw3; }
                    try {
                        r2 = (java.util.List) r1;
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.IllegalAccessException) { $pc3 = 23; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc3 = 15; continue $sw3;
                }
                case 15: {
                    try {
                        r3 = r2.iterator();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.IllegalAccessException) { $pc3 = 23; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc3 = 16; continue $sw3;
                }
                case 16: {
                    if (r3.hasNext() == false) { $pc3 = 22; continue $sw3; }
                    try {
                        r4 = (android.view.View) r3.next();
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.IllegalAccessException) { $pc3 = 23; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (Hw(r4) == false) { $pc3 = 16; continue $sw3; }
                    try {
                        r0.add(r4);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.IllegalAccessException) { $pc3 = 23; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc3 = 16; continue $sw3; }
                }
                case 13: {
                    if ((r1 instanceof android.view.View[]) == false) { $pc3 = 15; continue $sw3; }
                    try {
                        r2 = java.util.Arrays.asList((android.view.View[]) r1);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.IllegalAccessException) { $pc3 = 23; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc3 = 15; continue $sw3; }
                }
                case 7: {
                    if (Hw == null) { $pc3 = 9; continue $sw3; }
                    try {
                        r1 = Hw.get(v5);
                    } catch (java.lang.Throwable $t) {
                        $ex3 = $t;
                        if ($t instanceof java.lang.IllegalAccessException) { $pc3 = 23; continue $sw3; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc3 = 22; continue $sw3;
                }
                case 22: {
                    return r0;
                }
                case 23: {
                    throw new java.lang.IllegalStateException();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.Runnable FH() {
        return VH;
    }

    private static boolean FH(android.view.View r3) {
        android.view.Window r0 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = DW(r3);
                    if (r0 != null) { $pc4 = 5; continue $sw4; }
                    return false;
                }
                case 5: {
                    if (j6(r0, null, r3).getType() != 0) { $pc4 = 9; continue $sw4; }
                    return true;
                }
                case 9: {
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.util.List Hw() {
        return j6;
    }

    private static boolean Hw(android.view.View r2) {
        android.app.Activity r3 = null;
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (r2.isShown() == true) { $pc5 = 5; continue $sw5; }
                    return false;
                }
                case 5: {
                    r3 = j6(r2.getContext());
                    if (r3 != null) { $pc5 = 8; continue $sw5; }
                    $pc5 = 9; continue $sw5;
                }
                case 9: {
                    return true;
                }
                case 8: {
                    if (r3.getWindow().getDecorView().isShown() == true) { $pc5 = 9; continue $sw5; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void J0() {
        java.util.List<android.view.View> r0 = null;
        java.util.List<android.util.Pair<android.view.View, com.appfour.backbone.api.objects.UserActionWindow>> r1 = null;
        int r2 = 0;
        boolean r4 = false;
        android.view.View r5 = null;
        java.util.Iterator<android.view.View> r6 = null;
        java.util.ArrayList r3 = null;
        java.util.Iterator<android.view.View> r7 = null;
        android.view.View r8 = null;
        java.util.Iterator<android.util.Pair<android.view.View, com.appfour.backbone.api.objects.UserActionWindow>> r9 = null;
        android.util.Pair<android.view.View, com.appfour.backbone.api.objects.UserActionWindow> r10 = null;
        java.util.Iterator<android.view.View> r11 = null;
        android.view.View r12 = null;
        java.util.Iterator<android.util.Pair<android.view.View, com.appfour.backbone.api.objects.UserActionWindow>> r13 = null;
        android.util.Pair<android.view.View, com.appfour.backbone.api.objects.UserActionWindow> r14 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    r0 = EQ();
                    r1 = j6;
                    r2 = r1.size() - 1;
                    r4 = false;
                    $pc6 = 3; continue $sw6;
                }
                case 3: {
                    if (r2 < 0) { $pc6 = 12; continue $sw6; }
                    r5 = (android.view.View) r1.get(r2).first;
                    r6 = r0.iterator();
                    $pc6 = 6; continue $sw6;
                }
                case 6: {
                    if (r6.hasNext() == false) { $pc6 = 10; continue $sw6; }
                    if (r6.next() != r5) { $pc6 = 6; continue $sw6; }
                    $pc6 = 11; continue $sw6;
                }
                case 11: {
                    r2 = r2 - 1;
                    { $pc6 = 3; continue $sw6; }
                }
                case 10: {
                    j6((com.appfour.backbone.api.objects.UserActionWindow) r1.get(r2).second);
                    r4 = true;
                    { $pc6 = 11; continue $sw6; }
                }
                case 12: {
                    r3 = new java.util.ArrayList();
                    r7 = r0.iterator();
                    $pc6 = 14; continue $sw6;
                }
                case 14: {
                    if (r7.hasNext() == false) { $pc6 = 24; continue $sw6; }
                    r8 = r7.next();
                    if (FH(r8) == false) { $pc6 = 14; continue $sw6; }
                    r9 = j6.iterator();
                    $pc6 = 19; continue $sw6;
                }
                case 19: {
                    if (r9.hasNext() == false) { $pc6 = 23; continue $sw6; }
                    r10 = r9.next();
                    if (r10.first != r8) { $pc6 = 19; continue $sw6; }
                    r3.add(android.util.Pair.create(r8, r10.second));
                    { $pc6 = 14; continue $sw6; }
                }
                case 23: {
                    r3.add(android.util.Pair.create(r8, v5(r8)));
                    r4 = true;
                    { $pc6 = 14; continue $sw6; }
                }
                case 24: {
                    r11 = r0.iterator();
                    $pc6 = 26; continue $sw6;
                }
                case 26: {
                    if (r11.hasNext() == false) { $pc6 = 36; continue $sw6; }
                    r12 = r11.next();
                    if (FH(r12) == true) { $pc6 = 26; continue $sw6; }
                    r13 = j6.iterator();
                    $pc6 = 31; continue $sw6;
                }
                case 31: {
                    if (r13.hasNext() == false) { $pc6 = 35; continue $sw6; }
                    r14 = r13.next();
                    if (r14.first != r12) { $pc6 = 31; continue $sw6; }
                    r3.add(android.util.Pair.create(r12, r14.second));
                    { $pc6 = 26; continue $sw6; }
                }
                case 35: {
                    r3.add(android.util.Pair.create(r12, v5(r12)));
                    r4 = true;
                    { $pc6 = 26; continue $sw6; }
                }
                case 36: {
                    if (r4 == false) { $pc6 = 62; continue $sw6; }
                    j6 = new java.util.ArrayList(r3);
                    return;
                }
                case 62: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static android.app.Activity VH() {
        return gn;
    }

    static void Zo() {
        tp();
    }

    public static com.appfour.backbone.api.objects.UserActionWindow gn() {
        java.util.Iterator<android.util.Pair<android.view.View, com.appfour.backbone.api.objects.UserActionWindow>> r0 = null;
        android.util.Pair<android.view.View, com.appfour.backbone.api.objects.UserActionWindow> r1 = null;
        java.util.Iterator<android.util.Pair<android.view.View, com.appfour.backbone.api.objects.UserActionWindow>> r2 = null;
        android.util.Pair<android.view.View, com.appfour.backbone.api.objects.UserActionWindow> r3 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    if (gn == null) { $pc7 = 20; continue $sw7; }
                    r0 = j6.iterator();
                    $pc7 = 6; continue $sw7;
                }
                case 6: {
                    if (r0.hasNext() == false) { $pc7 = 13; continue $sw7; }
                    r1 = r0.next();
                    if (((com.appfour.backbone.api.objects.UserActionWindow) r1.second).getType() == 0) { $pc7 = 6; continue $sw7; }
                    if (((com.appfour.backbone.api.objects.UserActionWindow) r1.second).getActivity() != gn) { $pc7 = 6; continue $sw7; }
                    return (com.appfour.backbone.api.objects.UserActionWindow) r1.second;
                }
                case 13: {
                    r2 = j6.iterator();
                    $pc7 = 15; continue $sw7;
                }
                case 15: {
                    if (r2.hasNext() == false) { $pc7 = 31; continue $sw7; }
                    r3 = r2.next();
                    if (((com.appfour.backbone.api.objects.UserActionWindow) r3.second).getActivity() != gn) { $pc7 = 15; continue $sw7; }
                    return (com.appfour.backbone.api.objects.UserActionWindow) r3.second;
                }
                case 31: {
                    return null;
                }
                case 20: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static android.app.Activity j6(android.app.Activity r0) {
        gn = r0;
        return r0;
    }

    private static android.app.Activity j6(android.content.Context r1) {
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    if ((r1 instanceof android.app.Activity) == false) { $pc8 = 7; continue $sw8; }
                    return (android.app.Activity) r1;
                }
                case 7: {
                    if ((r1 instanceof android.content.ContextWrapper) == true) { $pc8 = 9; continue $sw8; }
                    return null;
                }
                case 9: {
                    return j6(((android.content.ContextWrapper) r1).getBaseContext());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static android.widget.PopupWindow j6(android.view.View r2) {
        java.lang.reflect.Field r0 = null;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    try {
                        r0 = r2.getClass().getDeclaredField("this$0");
                        r0.setAccessible(true);
                    } catch (java.lang.Throwable $t) {
                        $ex9 = $t;
                        if ($t instanceof java.lang.Exception) { $pc9 = 4; continue $sw9; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    return (android.widget.PopupWindow) r0.get(r2);
                }
                case 4: {
                    return null;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static com.appfour.backbone.api.objects.UserActionWindow j6(android.view.Window r3, android.widget.PopupWindow r4, android.view.View r5) {
        android.app.Activity r0 = null;
        android.app.Activity r1 = null;
        int r2 = 0;
        java.lang.Throwable $ex10 = null;
        int $pc10 = -1;
        $sw10: while (true) {
            switch ($pc10) {
                case -1: {
                    if (r3 != null) { $pc10 = 4; continue $sw10; }
                    $pc10 = 6; continue $sw10;
                }
                case 6: {
                    r0 = null;
                    $pc10 = 7; continue $sw10;
                }
                case 7: {
                    r1 = j6(r5.getContext());
                    r2 = 3;
                    if (r0 == null) { $pc10 = 10; continue $sw10; }
                    r2 = 0;
                    $pc10 = 22; continue $sw10;
                }
                case 22: {
                    if (r1 == null) { $pc10 = 25; continue $sw10; }
                    r0 = r1;
                    $pc10 = 25; continue $sw10;
                }
                case 25: {
                    return new com.appfour.backbone.api.objects.UserActionWindow(r0, r2, r5);
                }
                case 10: {
                    if (r3 != null) { $pc10 = 17; continue $sw10; }
                    if (r4 != null) { $pc10 = 17; continue $sw10; }
                    if ((r5.getLayoutParams() instanceof android.view.WindowManager.LayoutParams) == false) { $pc10 = 22; continue $sw10; }
                    if ("Toast".equals(((android.view.WindowManager.LayoutParams) r5.getLayoutParams()).getTitle()) == false) { $pc10 = 22; continue $sw10; }
                    r2 = 4;
                    $pc10 = 17; continue $sw10;
                }
                case 17: {
                    if (r3 == null) { $pc10 = 19; continue $sw10; }
                    r2 = 1;
                    { $pc10 = 22; continue $sw10; }
                }
                case 19: {
                    if (r4 == null) { $pc10 = 22; continue $sw10; }
                    r2 = 2;
                    { $pc10 = 22; continue $sw10; }
                }
                case 4: {
                    if ((r3.getContext() instanceof android.app.Activity) == false) { $pc10 = 6; continue $sw10; }
                    r0 = (android.app.Activity) r3.getContext();
                    { $pc10 = 7; continue $sw10; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6() {
        J0();
    }

    private static void j6(com.appfour.backbone.api.objects.UserActionWindow r0) {
        abcd.kv.FH(r0);
    }

    static boolean j6(android.content.Intent r0) {
        return DW(r0);
    }

    private static void tp() {
        Zo.removeCallbacks(VH);
        Zo.post(VH);
    }

    public static void u7() {
        android.app.Application r0 = null;
        java.lang.Class<?> r1 = null;
        java.lang.Class<?> r2 = null;
        java.lang.Throwable $ex11 = null;
        int $pc11 = -1;
        $sw11: while (true) {
            switch ($pc11) {
                case -1: {
                    r0 = abcd.wu.j6();
                    if (android.os.Build.VERSION.SDK_INT < 17) { $pc11 = 9; continue $sw11; }
                    try {
                        r1 = java.lang.Class.forName("android.view.WindowManagerGlobal");
                        FH = r1.getMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                        DW = r1.getDeclaredField("mViews");
                        DW.setAccessible(true);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 16; continue $sw11;
                    }
                    $pc11 = 17; continue $sw11;
                }
                case 17: {
                    { $pc11 = 14; continue $sw11; }
                }
                case 9: {
                    if (android.os.Build.VERSION.SDK_INT < 14) { $pc11 = 17; continue $sw11; }
                    if (android.os.Build.VERSION.SDK_INT >= 17) { $pc11 = 17; continue $sw11; }
                    try {
                        r2 = java.lang.Class.forName("android.view.WindowManagerImpl");
                        v5 = r2.getMethod("getDefault", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
                        Hw = r2.getDeclaredField("mViews");
                        Hw.setAccessible(true);
                    } catch (java.lang.Throwable $t) {
                        $ex11 = $t;
                        $pc11 = 16; continue $sw11;
                    }
                    $pc11 = 14; continue $sw11;
                }
                case 14: {
                    Zo = new android.os.Handler();
                    VH = new abcd.Fv();
                    Zo.post(VH);
                    r0.registerActivityLifecycleCallbacks(new abcd.Gv());
                    $pc11 = 16; continue $sw11;
                }
                case 16: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static android.os.Handler v5() {
        return Zo;
    }

    private static com.appfour.backbone.api.objects.UserActionWindow v5(android.view.View r2) {
        android.view.Window r0 = null;
        com.appfour.backbone.api.objects.UserActionWindow r3 = null;
        android.widget.PopupWindow r1 = null;
        com.appfour.backbone.api.objects.UserActionWindow r4 = null;
        com.appfour.backbone.api.objects.UserActionWindow r5 = null;
        java.lang.Throwable $ex12 = null;
        int $pc12 = -1;
        $sw12: while (true) {
            switch ($pc12) {
                case -1: {
                    r0 = DW(r2);
                    if (r0 == null) { $pc12 = 6; continue $sw12; }
                    r3 = j6(r0, null, r2);
                    abcd.kv.Hw(r3);
                    abcd.Qv.j6(r0, r3);
                    return r3;
                }
                case 6: {
                    r1 = j6(r2);
                    if (r1 == null) { $pc12 = 10; continue $sw12; }
                    r4 = j6(null, r1, r2);
                    abcd.kv.Hw(r4);
                    abcd.Qv.j6(r1, r4);
                    return r4;
                }
                case 10: {
                    r5 = j6(null, null, r2);
                    abcd.kv.Hw(r5);
                    abcd.Qv.j6(r2, r5);
                    return r5;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static void we() {
        android.view.inputmethod.InputMethodManager r0 = null;
        java.lang.reflect.Field r1 = null;
        java.lang.Object r2 = null;
        java.lang.reflect.Field r3 = null;
        java.lang.ref.WeakReference r4 = null;
        android.view.inputmethod.InputConnection r5 = null;
        java.lang.Throwable $ex13 = null;
        int $pc13 = -1;
        $sw13: while (true) {
            switch ($pc13) {
                case -1: {
                    try {
                        r0 = (android.view.inputmethod.InputMethodManager) abcd.wu.j6().getSystemService("input_method");
                        r1 = r0.getClass().getDeclaredField("mServedInputConnectionWrapper");
                        r1.setAccessible(true);
                        r2 = r1.get(r0);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        if ($t instanceof java.lang.Exception) { $pc13 = 19; continue $sw13; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r2 == null) { $pc13 = 20; continue $sw13; }
                    try {
                        r3 = r2.getClass().getSuperclass().getDeclaredField("mInputConnection");
                        r3.setAccessible(true);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        if ($t instanceof java.lang.Exception) { $pc13 = 19; continue $sw13; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r3.getType() != java.lang.ref.WeakReference.class) { $pc13 = 13; continue $sw13; }
                    try {
                        r4 = (java.lang.ref.WeakReference) r3.get(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        if ($t instanceof java.lang.Exception) { $pc13 = 19; continue $sw13; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r4 == null) { $pc13 = 20; continue $sw13; }
                    if (r4.get() == null) { $pc13 = 20; continue $sw13; }
                    if ((r4.get() instanceof abcd.Hv.a) == true) { $pc13 = 20; continue $sw13; }
                    try {
                        u7 = new abcd.Hv.a((android.view.inputmethod.InputConnection) r4.get(), true);
                        r3.set(r2, new java.lang.ref.WeakReference(u7));
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        if ($t instanceof java.lang.Exception) { $pc13 = 19; continue $sw13; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    { $pc13 = 20; continue $sw13; }
                }
                case 13: {
                    try {
                        r5 = (android.view.inputmethod.InputConnection) r3.get(r2);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        if ($t instanceof java.lang.Exception) { $pc13 = 19; continue $sw13; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    if (r5 == null) { $pc13 = 20; continue $sw13; }
                    if ((r5 instanceof abcd.Hv.a) == true) { $pc13 = 20; continue $sw13; }
                    try {
                        u7 = new abcd.Hv.a(r5, true);
                        r3.set(r2, u7);
                    } catch (java.lang.Throwable $t) {
                        $ex13 = $t;
                        if ($t instanceof java.lang.Exception) { $pc13 = 19; continue $sw13; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc13 = 20; continue $sw13;
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
}
