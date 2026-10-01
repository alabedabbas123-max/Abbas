package abcd;

public class Qv {
    public static int DW;
    private static boolean FH;
    private static java.util.Map<java.lang.Integer, abcd.Qv.c> Hw;
    public static boolean j6;

    private static class a {
        private final int DW;
        private final int FH;
        private final android.os.Handler Hw;
        private float VH;
        private float Zo;
        private boolean gn;
        private final com.appfour.backbone.api.objects.UserActionWindow j6;
        private final java.lang.Runnable v5;

        public a(com.appfour.backbone.api.objects.UserActionWindow r2) {
            this.j6 = r2;
            this.Hw = new android.os.Handler();
            this.v5 = new abcd.Pv(this, r2);
            int r3 = (int) (r2.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.DW = r3 * r3;
            this.FH = android.view.ViewConfiguration.getLongPressTimeout();
        }

        static float DW(abcd.Qv.a r0) {
            return r0.Zo;
        }

        private static boolean DW(android.view.View r2) {
            android.app.Activity r3 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (r2.isShown() == true) { $pc0 = 5; continue $sw0; }
                        return false;
                    }
                    case 5: {
                        r3 = j6(r2.getContext());
                        if (r3 != null) { $pc0 = 8; continue $sw0; }
                        $pc0 = 9; continue $sw0;
                    }
                    case 9: {
                        return true;
                    }
                    case 8: {
                        if (r3.getWindow().getDecorView().isShown() == true) { $pc0 = 9; continue $sw0; }
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        static float FH(abcd.Qv.a r0) {
            return r0.VH;
        }

        private static android.app.Activity j6(android.content.Context r1) {
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if ((r1 instanceof android.app.Activity) == false) { $pc1 = 7; continue $sw1; }
                        return (android.app.Activity) r1;
                    }
                    case 7: {
                        if ((r1 instanceof android.content.ContextWrapper) == true) { $pc1 = 9; continue $sw1; }
                        return null;
                    }
                    case 9: {
                        return j6(((android.content.ContextWrapper) r1).getBaseContext());
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        static boolean j6(abcd.Qv.a r0) {
            return r0.gn;
        }

        static boolean j6(abcd.Qv.a r0, boolean r1) {
            r0.gn = r1;
            return r1;
        }

        static boolean j6(android.view.View r0) {
            return DW(r0);
        }

        public void DW(android.view.MotionEvent r5) {
            float r0 = 0.0f;
            float r1 = 0.0f;
            float r2 = 0.0f;
            float r3 = 0.0f;
            java.lang.Throwable $ex2 = null;
            int $pc2 = -1;
            $sw2: while (true) {
                switch ($pc2) {
                    case -1: {
                        if (r5.getActionMasked() != 0) { $pc2 = 6; continue $sw2; }
                        this.Zo = r5.getX();
                        this.VH = r5.getY();
                        this.gn = true;
                        this.Hw.postDelayed(this.v5, this.FH);
                        return;
                    }
                    case 6: {
                        if (r5.getActionMasked() != 1) { $pc2 = 14; continue $sw2; }
                        this.Hw.removeCallbacks(this.v5);
                        if (this.gn == false) { $pc2 = 23; continue $sw2; }
                        this.gn = false;
                        r0 = (r5.getX() - this.Zo) * (r5.getX() - this.Zo);
                        r1 = r5.getY() - this.VH;
                        r2 = r5.getY();
                        r3 = this.VH;
                        if ((r0 + (r1 * (r2 - r3))) < this.DW) { $pc2 = 12; continue $sw2; }
                        abcd.Qv.e.j6(this.j6, this.Zo, r3, r5.getX(), r5.getY());
                        return;
                    }
                    case 12: {
                        abcd.Qv.e.j6(this.j6, this.Zo, r3);
                        return;
                    }
                    case 23: {
                        return;
                    }
                    case 14: {
                        if (r5.getActionMasked() != 3) { $pc2 = 17; continue $sw2; }
                        this.Hw.removeCallbacks(this.v5);
                        return;
                    }
                    case 17: {
                        if (r5.getActionMasked() == 2) { $pc2 = 19; continue $sw2; }
                        return;
                    }
                    case 19: {
                        if ((((r5.getX() - this.Zo) * (r5.getX() - this.Zo)) + ((r5.getY() - this.VH) * (r5.getY() - this.VH))) < this.DW) { $pc2 = 28; continue $sw2; }
                        this.Hw.removeCallbacks(this.v5);
                        return;
                    }
                    case 28: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public void j6(android.view.MotionEvent r1) {
            DW(r1);
        }
    }

    private static class b implements android.view.View.OnTouchListener {
        private final abcd.Qv.a j6;

        public b(android.widget.PopupWindow r1, com.appfour.backbone.api.objects.UserActionWindow r2) {
            this.j6 = new abcd.Qv.a(r2);
        }

        public static android.view.View.OnTouchListener j6(android.widget.PopupWindow r2) {
            java.lang.reflect.Field r0 = null;
            java.lang.Throwable th = null;
            java.lang.Throwable $ex3 = null;
            int $pc3 = -1;
            $sw3: while (true) {
                switch ($pc3) {
                    case -1: {
                        try {
                            r0 = android.widget.PopupWindow.class.getDeclaredField("mTouchInterceptor");
                            r0.setAccessible(true);
                        } catch (java.lang.Throwable $t) {
                            $ex3 = $t;
                            $pc3 = 4; continue $sw3;
                        }
                        return (android.view.View.OnTouchListener) r0.get(r2);
                    }
                    case 4: {
                        th = $ex3;
                        abcd.yw.j6("Runtime Error", th);
                        return null;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public boolean onTouch(android.view.View r1, android.view.MotionEvent r2) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex4 = null;
            int $pc4 = -1;
            $sw4: while (true) {
                switch ($pc4) {
                    case -1: {
                        try {
                            this.j6.DW(r2);
                        } catch (java.lang.Throwable $t) {
                            $ex4 = $t;
                            $pc4 = 4; continue $sw4;
                        }
                        return false;
                    }
                    case 4: {
                        th = $ex4;
                        abcd.yw.j6("Runtime Error", th);
                        return false;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    private static class c extends android.widget.FrameLayout {
        private abcd.Qv.a j6;

        @Override
        public boolean dispatchTouchEvent(android.view.MotionEvent r2) {
            abcd.Qv.a r0 = null;
            java.lang.Throwable $ex5 = null;
            int $pc5 = -1;
            $sw5: while (true) {
                switch ($pc5) {
                    case -1: {
                        r0 = this.j6;
                        if (r0 == null) { $pc5 = 6; continue $sw5; }
                        r0.DW(r2);
                        $pc5 = 6; continue $sw5;
                    }
                    case 6: {
                        return getChildAt(0).dispatchTouchEvent(r2);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public void j6(com.appfour.backbone.api.objects.UserActionWindow r2) {
            this.j6 = new abcd.Qv.a(r2);
        }

        @Override
        public boolean onInterceptTouchEvent(android.view.MotionEvent r2) {
            ((android.view.ViewGroup) getChildAt(0)).onInterceptTouchEvent(r2);
            return true;
        }
    }

    private static class d implements android.view.Window.Callback {
        private final android.view.Window.Callback DW;
        private final com.appfour.backbone.api.objects.UserActionWindow FH;
        private final abcd.Qv.a j6;

        public d(android.view.Window r2, com.appfour.backbone.api.objects.UserActionWindow r3) {
            java.lang.Throwable $ex6 = null;
            int $pc6 = -1;
            $sw6: while (true) {
                switch ($pc6) {
                    case -1: {
                        this.DW = r2.getCallback();
                        this.j6 = new abcd.Qv.a(r3);
                        this.FH = r3;
                        if (r3.getType() != 0) { $pc6 = 6; continue $sw6; }
                        r2.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new abcd.Rv(this));
                        j6();
                        return;
                    }
                    case 6: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private void j6() {
            android.view.inputmethod.InputMethodManager r0 = null;
            java.lang.reflect.Method r1 = null;
            boolean r2 = false;
            java.lang.Integer r3 = null;
            java.lang.Throwable $ex7 = null;
            int $pc7 = -1;
            $sw7: while (true) {
                switch ($pc7) {
                    case -1: {
                        try {
                            r0 = (android.view.inputmethod.InputMethodManager) this.FH.getWindowView().getContext().getSystemService("input_method");
                            r1 = r0.getClass().getDeclaredMethod("getInputMethodWindowVisibleHeight", new java.lang.Class[0]);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            if ($t instanceof java.lang.Exception) { $pc7 = 13; continue $sw7; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        r2 = true;
                        try {
                            r1.setAccessible(true);
                            r3 = (java.lang.Integer) r1.invoke(r0, new java.lang.Object[0]);
                            abcd.Qv.DW = r3.intValue();
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            if ($t instanceof java.lang.Exception) { $pc7 = 13; continue $sw7; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        if (r3.intValue() > 0) { $pc7 = 7; continue $sw7; }
                        r2 = false;
                        $pc7 = 7; continue $sw7;
                    }
                    case 7: {
                        if (abcd.Qv.j6 == r2) { $pc7 = 14; continue $sw7; }
                        try {
                            abcd.Qv.j6 = r2;
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            if ($t instanceof java.lang.Exception) { $pc7 = 13; continue $sw7; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        if (abcd.Qv.j6 == false) { $pc7 = 11; continue $sw7; }
                        try {
                            abcd.Qv.j6(this.FH);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            if ($t instanceof java.lang.Exception) { $pc7 = 13; continue $sw7; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        { $pc7 = 14; continue $sw7; }
                    }
                    case 11: {
                        try {
                            abcd.Qv.DW(this.FH);
                        } catch (java.lang.Throwable $t) {
                            $ex7 = $t;
                            if ($t instanceof java.lang.Exception) { $pc7 = 13; continue $sw7; }
                            throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                        }
                        $pc7 = 14; continue $sw7;
                    }
                    case 14: {
                        return;
                    }
                    case 13: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        static void j6(abcd.Qv.d r0) {
            r0.j6();
        }

        @Override
        public boolean dispatchGenericMotionEvent(android.view.MotionEvent r3) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex8 = null;
            int $pc8 = -1;
            $sw8: while (true) {
                switch ($pc8) {
                    case -1: {
                        try {
                            this.j6.j6(r3);
                        } catch (java.lang.Throwable $t) {
                            $ex8 = $t;
                            $pc8 = 4; continue $sw8;
                        }
                        $pc8 = 7; continue $sw8;
                    }
                    case 7: {
                        return this.DW.dispatchGenericMotionEvent(r3);
                    }
                    case 4: {
                        th = $ex8;
                        abcd.yw.j6("Runtime Error", th);
                        { $pc8 = 7; continue $sw8; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
            boolean r1 = false;
            com.appfour.backbone.api.objects.UserActionWindow r0 = null;
            java.lang.Throwable $ex9 = null;
            int $pc9 = -1;
            $sw9: while (true) {
                switch ($pc9) {
                    case -1: {
                        r1 = true;
                        if (r6.getAction() != 1) { $pc9 = 14; continue $sw9; }
                        if (this.FH.getActivity() == null) { $pc9 = 14; continue $sw9; }
                        r0 = abcd.Hv.gn();
                        if (r0 == null) { $pc9 = 14; continue $sw9; }
                        if (r6.getKeyCode() == 4) { $pc9 = 12; continue $sw9; }
                        r1 = false;
                        $pc9 = 12; continue $sw9;
                    }
                    case 12: {
                        abcd.Qv.j6(new com.appfour.backbone.api.objects.UserInputAction(r0, r1));
                        $pc9 = 14; continue $sw9;
                    }
                    case 14: {
                        return this.DW.dispatchKeyEvent(r6);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r2) {
            return this.DW.dispatchKeyShortcutEvent(r2);
        }

        @Override
        public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            return this.DW.dispatchPopulateAccessibilityEvent(r2);
        }

        @Override
        public boolean dispatchTouchEvent(android.view.MotionEvent r3) {
            java.lang.Throwable th = null;
            java.lang.Throwable $ex10 = null;
            int $pc10 = -1;
            $sw10: while (true) {
                switch ($pc10) {
                    case -1: {
                        try {
                            this.j6.DW(r3);
                        } catch (java.lang.Throwable $t) {
                            $ex10 = $t;
                            $pc10 = 4; continue $sw10;
                        }
                        $pc10 = 7; continue $sw10;
                    }
                    case 7: {
                        return this.DW.dispatchTouchEvent(r3);
                    }
                    case 4: {
                        th = $ex10;
                        abcd.yw.j6("Runtime Error", th);
                        { $pc10 = 7; continue $sw10; }
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public boolean dispatchTrackballEvent(android.view.MotionEvent r2) {
            return this.DW.dispatchTrackballEvent(r2);
        }

        @Override
        public void onActionModeFinished(android.view.ActionMode r2) {
            this.DW.onActionModeFinished(r2);
        }

        @Override
        public void onActionModeStarted(android.view.ActionMode r2) {
            this.DW.onActionModeStarted(r2);
        }

        @Override
        public void onAttachedToWindow() {
            this.DW.onAttachedToWindow();
        }

        @Override
        public void onContentChanged() {
            this.DW.onContentChanged();
        }

        @Override
        public boolean onCreatePanelMenu(int r2, android.view.Menu r3) {
            return this.DW.onCreatePanelMenu(r2, r3);
        }

        @Override
        public android.view.View onCreatePanelView(int r2) {
            return this.DW.onCreatePanelView(r2);
        }

        @Override
        public void onDetachedFromWindow() {
            this.DW.onDetachedFromWindow();
        }

        @Override
        public boolean onMenuItemSelected(int r2, android.view.MenuItem r3) {
            return this.DW.onMenuItemSelected(r2, r3);
        }

        @Override
        public boolean onMenuOpened(int r2, android.view.Menu r3) {
            return this.DW.onMenuOpened(r2, r3);
        }

        @Override
        public void onPanelClosed(int r2, android.view.Menu r3) {
            this.DW.onPanelClosed(r2, r3);
        }

        @Override
        public void onPointerCaptureChanged(boolean r2) {
            this.DW.onPointerCaptureChanged(r2);
        }

        @Override
        public boolean onPreparePanel(int r2, android.view.View r3, android.view.Menu r4) {
            return this.DW.onPreparePanel(r2, r3, r4);
        }

        @Override
        public void onProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> r2, android.view.Menu r3, int r4) {
            this.DW.onProvideKeyboardShortcuts(r2, r3, r4);
        }

        @Override
        public boolean onSearchRequested() {
            return this.DW.onSearchRequested();
        }

        @Override
        public boolean onSearchRequested(android.view.SearchEvent r2) {
            return this.DW.onSearchRequested(r2);
        }

        @Override
        public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams r2) {
            this.DW.onWindowAttributesChanged(r2);
        }

        @Override
        public void onWindowFocusChanged(boolean r2) {
            this.DW.onWindowFocusChanged(r2);
        }

        @Override
        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r2) {
            return this.DW.onWindowStartingActionMode(r2);
        }

        @Override
        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r2, int r3) {
            return this.DW.onWindowStartingActionMode(r2, r3);
        }
    }

    private static class e {
        private static float DW(android.view.View r1, android.view.View r2) {
            java.lang.Throwable $ex11 = null;
            int $pc11 = -1;
            $sw11: while (true) {
                switch ($pc11) {
                    case -1: {
                        if (r2 != r1) { $pc11 = 6; continue $sw11; }
                        return 0.0f;
                    }
                    case 6: {
                        return r2.getY() + DW(r1, (android.view.View) r2.getParent());
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private static android.view.MenuItem DW(android.view.View r4) {
            java.lang.Class<?> r0 = null;
            java.lang.Throwable $ex12 = null;
            int $pc12 = -1;
            $sw12: while (true) {
                switch ($pc12) {
                    case -1: {
                        if ((r4 instanceof android.support.v7.view.menu.MenuView.ItemView) == false) { $pc12 = 15; continue $sw12; }
                        return ((android.support.v7.view.menu.MenuView.ItemView) r4).getItemData();
                    }
                    case 15: {
                        try {
                            r0 = java.lang.Class.forName("com.android.internal.view.menu.MenuView$ItemView");
                        } catch (java.lang.Throwable $t) {
                            $ex12 = $t;
                            $pc12 = 14; continue $sw12;
                        }
                        if (r0.isInstance(r4) == false) { $pc12 = 11; continue $sw12; }
                        return (android.view.MenuItem) r0.getDeclaredMethod("getItemData", new java.lang.Class[0]).invoke(r4, new java.lang.Object[0]);
                    }
                    case 11: {
                        return null;
                    }
                    case 19: {
                        return null;
                    }
                    case 14: {
                        throw new java.lang.IllegalStateException();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private static android.view.View DW(android.view.View r8, float r9, float r10) {
            android.view.ViewGroup r0 = null;
            int r2 = 0;
            android.view.View r3 = null;
            android.view.View r4 = null;
            android.view.View r5 = null;
            java.lang.Throwable $ex13 = null;
            int $pc13 = -1;
            $sw13: while (true) {
                switch ($pc13) {
                    case -1: {
                        if ((r8 instanceof android.view.ViewGroup) == false) { $pc13 = 17; continue $sw13; }
                        r0 = (android.view.ViewGroup) r8;
                        r2 = 0;
                        r3 = null;
                        $pc13 = 6; continue $sw13;
                    }
                    case 6: {
                        if (r2 >= r0.getChildCount()) { $pc13 = 14; continue $sw13; }
                        r4 = r0.getChildAt(r2);
                        r5 = DW(r4, (r9 - r4.getX()) + r4.getScrollX(), (r10 - r4.getY()) + r4.getScrollY());
                        if (r5 == null) { $pc13 = 13; continue $sw13; }
                        if (r3 != null) { $pc13 = 11; continue $sw13; }
                        $pc13 = 12; continue $sw13;
                    }
                    case 12: {
                        r3 = r5;
                        { $pc13 = 13; continue $sw13; }
                    }
                    case 11: {
                        if (FH(r5, r3) == true) { $pc13 = 12; continue $sw13; }
                        $pc13 = 13; continue $sw13;
                    }
                    case 13: {
                        r2 = r2 + 1;
                        { $pc13 = 6; continue $sw13; }
                    }
                    case 14: {
                        if (r3 == null) { $pc13 = 17; continue $sw13; }
                        return r3;
                    }
                    case 17: {
                        if (r8.isClickable() == true) { $pc13 = 19; continue $sw13; }
                        $pc13 = 29; continue $sw13;
                    }
                    case 29: {
                        return null;
                    }
                    case 19: {
                        if (r9 < 0.0f) { $pc13 = 29; continue $sw13; }
                        if (r10 < 0.0f) { $pc13 = 29; continue $sw13; }
                        if (r9 > r8.getWidth()) { $pc13 = 29; continue $sw13; }
                        if (r10 > r8.getHeight()) { $pc13 = 29; continue $sw13; }
                        if (r8.isShown() == false) { $pc13 = 29; continue $sw13; }
                        return r8;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public static void DW(com.appfour.backbone.api.objects.UserActionWindow r11, float r12, float r13) {
            android.view.View r0 = null;
            int r7 = 0;
            int r8 = 0;
            android.util.Pair<java.lang.Integer, android.view.View> r1 = null;
            int r9 = 0;
            int r10 = 0;
            android.util.Pair<? extends android.view.View, java.lang.Integer> r2 = null;
            int r14 = 0;
            int r15 = 0;
            com.appfour.backbone.api.objects.UserTouchAction r16 = null;
            java.lang.Object r17 = null;
            int r18 = 0;
            int r19 = 0;
            java.lang.Throwable $ex14 = null;
            int $pc14 = -1;
            $sw14: while (true) {
                switch ($pc14) {
                    case -1: {
                        r0 = FH(r11.getWindowView(), r12, r13);
                        if (r0 != null) { $pc14 = 6; continue $sw14; }
                        r7 = (int) r12;
                        r8 = (int) r13;
                        abcd.Qv.FH(new com.appfour.backbone.api.objects.UserTouchAction(r11, null, 2, r7, r8, r7, r8));
                        return;
                    }
                    case 6: {
                        r1 = j6(r11.getWindowView(), r12, r13, r0);
                        if (r1 == null) { $pc14 = 10; continue $sw14; }
                        r9 = (int) r12;
                        r10 = (int) r13;
                        abcd.Qv.j6(new com.appfour.backbone.api.objects.UserTouchAction(r11, new com.appfour.backbone.api.objects.UserActionWidget(r0, ((java.lang.Integer) r1.first).intValue(), (android.view.View) r1.second), 3, r9, r10, r9, r10), r0, j6(r0), ((java.lang.Integer) r1.first).intValue(), (android.view.View) r1.second);
                        return;
                    }
                    case 10: {
                        r2 = FH(r0);
                        if (r2 == null) { $pc14 = 14; continue $sw14; }
                        r14 = (int) r12;
                        r15 = (int) r13;
                        r16 = new com.appfour.backbone.api.objects.UserTouchAction(r11, new com.appfour.backbone.api.objects.UserActionWidget(r0, ((java.lang.Integer) r2.second).intValue(), (android.view.View) r2.first), 3, r14, r15, r14, r15);
                        r17 = r2.first;
                        abcd.Qv.j6(r16, (android.view.View) r17, j6((android.view.View) r17), ((java.lang.Integer) r2.second).intValue(), r0);
                        return;
                    }
                    case 14: {
                        r18 = (int) r12;
                        r19 = (int) r13;
                        abcd.Qv.j6(new com.appfour.backbone.api.objects.UserTouchAction(r11, new com.appfour.backbone.api.objects.UserActionWidget(r0, 0, null), 4, r18, r19, r18, r19), r0);
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private static android.util.Pair<? extends android.view.View, java.lang.Integer> FH(android.view.View r2) {
            android.util.Pair r3 = null;
            int r0 = 0;
            java.lang.Throwable $ex15 = null;
            int $pc15 = -1;
            $sw15: while (true) {
                switch ($pc15) {
                    case -1: {
                        try {
                            r3 = j6(r2, android.support.v7.widget.RecyclerView.class);
                        } catch (java.lang.Throwable $t) {
                            $ex15 = $t;
                            $pc15 = 8; continue $sw15;
                        }
                        if (r3 == null) { $pc15 = 6; continue $sw15; }
                        try {
                            r0 = ((android.support.v7.widget.RecyclerView) r3.first).getChildAdapterPosition((android.view.View) r3.second);
                        } catch (java.lang.Throwable $t) {
                            $ex15 = $t;
                            $pc15 = 8; continue $sw15;
                        }
                        return new android.util.Pair(r3.first, java.lang.Integer.valueOf(r0));
                    }
                    case 6: {
                        return null;
                    }
                    case 11: {
                        return null;
                    }
                    case 8: {
                        throw new java.lang.IllegalStateException();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private static android.view.View FH(android.view.View r8, float r9, float r10) {
            android.view.ViewGroup r0 = null;
            int r2 = 0;
            android.view.View r3 = null;
            android.view.View r4 = null;
            android.view.View r5 = null;
            java.lang.Throwable $ex16 = null;
            int $pc16 = -1;
            $sw16: while (true) {
                switch ($pc16) {
                    case -1: {
                        if ((r8 instanceof android.view.ViewGroup) == false) { $pc16 = 17; continue $sw16; }
                        r0 = (android.view.ViewGroup) r8;
                        r2 = 0;
                        r3 = null;
                        $pc16 = 6; continue $sw16;
                    }
                    case 6: {
                        if (r2 >= r0.getChildCount()) { $pc16 = 14; continue $sw16; }
                        r4 = r0.getChildAt(r2);
                        r5 = DW(r4, (r9 - r4.getX()) + r4.getScrollX(), (r10 - r4.getY()) + r4.getScrollY());
                        if (r5 == null) { $pc16 = 13; continue $sw16; }
                        if (r3 != null) { $pc16 = 11; continue $sw16; }
                        $pc16 = 12; continue $sw16;
                    }
                    case 12: {
                        r3 = r5;
                        { $pc16 = 13; continue $sw16; }
                    }
                    case 11: {
                        if (FH(r5, r3) == true) { $pc16 = 12; continue $sw16; }
                        $pc16 = 13; continue $sw16;
                    }
                    case 13: {
                        r2 = r2 + 1;
                        { $pc16 = 6; continue $sw16; }
                    }
                    case 14: {
                        if (r3 == null) { $pc16 = 17; continue $sw16; }
                        return r3;
                    }
                    case 17: {
                        if (r8.isLongClickable() == true) { $pc16 = 19; continue $sw16; }
                        $pc16 = 29; continue $sw16;
                    }
                    case 29: {
                        return null;
                    }
                    case 19: {
                        if (r9 < 0.0f) { $pc16 = 29; continue $sw16; }
                        if (r10 < 0.0f) { $pc16 = 29; continue $sw16; }
                        if (r9 > r8.getWidth()) { $pc16 = 29; continue $sw16; }
                        if (r10 > r8.getHeight()) { $pc16 = 29; continue $sw16; }
                        if (r8.isShown() == false) { $pc16 = 29; continue $sw16; }
                        return r8;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private static boolean FH(android.view.View r3, android.view.View r4) {
            java.lang.Throwable $ex17 = null;
            int $pc17 = -1;
            $sw17: while (true) {
                switch ($pc17) {
                    case -1: {
                        if (android.os.Build.VERSION.SDK_INT < 21) { $pc17 = 8; continue $sw17; }
                        if (r3.getElevation() <= r4.getElevation()) { $pc17 = 8; continue $sw17; }
                        return true;
                    }
                    case 8: {
                        if ((r3.getWidth() * r3.getHeight()) < (r4.getWidth() * r4.getHeight())) { $pc17 = 12; continue $sw17; }
                        return false;
                    }
                    case 12: {
                        return true;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private static float j6(android.view.View r1, android.view.View r2) {
            java.lang.Throwable $ex18 = null;
            int $pc18 = -1;
            $sw18: while (true) {
                switch ($pc18) {
                    case -1: {
                        if (r2 != r1) { $pc18 = 6; continue $sw18; }
                        return 0.0f;
                    }
                    case 6: {
                        return r2.getX() + j6(r1, (android.view.View) r2.getParent());
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private static android.util.Pair<java.lang.Integer, android.view.View> j6(android.view.View r2, float r3, float r4, android.view.View r5) {
            float r6 = 0.0f;
            float r7 = 0.0f;
            int r8 = 0;
            android.view.View r9 = null;
            java.lang.Throwable $ex19 = null;
            int $pc19 = -1;
            $sw19: while (true) {
                switch ($pc19) {
                    case -1: {
                        if ((r5 instanceof android.widget.ListView) == false) { $pc19 = 8; continue $sw19; }
                        r6 = r3 - j6(r2, r5);
                        r7 = r4 - DW(r2, r5);
                        r8 = ((android.widget.ListView) r5).pointToPosition((int) r6, (int) r7);
                        if (r8 == (-1)) { $pc19 = 10; continue $sw19; }
                        r9 = j6(r5, r6, r7);
                        return new android.util.Pair(java.lang.Integer.valueOf(r8), r9);
                    }
                    case 10: {
                        return null;
                    }
                    case 8: {
                        return null;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private static <V extends android.view.View> android.util.Pair<V, android.view.View> j6(android.view.View r2, java.lang.Class<V> r3) {
            java.lang.Object r0 = null;
            java.lang.Throwable $ex20 = null;
            int $pc20 = -1;
            $sw20: while (true) {
                switch ($pc20) {
                    case -1: {
                        r0 = r2.getParent();
                        if (r3.isInstance(r0) == false) { $pc20 = 7; continue $sw20; }
                        return new android.util.Pair((android.view.View) r0, r2);
                    }
                    case 7: {
                        if ((r0 instanceof android.view.View) == true) { $pc20 = 9; continue $sw20; }
                        return null;
                    }
                    case 9: {
                        return j6((android.view.View) r0, r3);
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private static android.view.View j6(android.view.View r4, float r5, float r6) {
            android.view.ViewGroup r7 = null;
            int r0 = 0;
            android.view.View r1 = null;
            java.lang.Throwable $ex21 = null;
            int $pc21 = -1;
            $sw21: while (true) {
                switch ($pc21) {
                    case -1: {
                        if ((r4 instanceof android.view.ViewGroup) == false) { $pc21 = 17; continue $sw21; }
                        r7 = (android.view.ViewGroup) r4;
                        r0 = 0;
                        $pc21 = 6; continue $sw21;
                    }
                    case 6: {
                        if (r0 >= r7.getChildCount()) { $pc21 = 25; continue $sw21; }
                        r1 = r7.getChildAt(r0);
                        if (r1.getX() > r5) { $pc21 = 16; continue $sw21; }
                        if ((r1.getX() + r1.getWidth()) < r5) { $pc21 = 16; continue $sw21; }
                        if (r1.getY() > r6) { $pc21 = 16; continue $sw21; }
                        if ((r1.getY() + r1.getHeight()) < r6) { $pc21 = 16; continue $sw21; }
                        return r1;
                    }
                    case 16: {
                        r0 = r0 + 1;
                        { $pc21 = 6; continue $sw21; }
                    }
                    case 25: {
                        return null;
                    }
                    case 17: {
                        return null;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        private static java.lang.Object j6(android.view.View r1) {
            java.lang.Throwable $ex22 = null;
            int $pc22 = -1;
            $sw22: while (true) {
                switch ($pc22) {
                    case -1: {
                        if ((r1 instanceof android.widget.AdapterView) == true) { $pc22 = 5; continue $sw22; }
                        if ((r1 instanceof android.support.v7.widget.RecyclerView) == false) { $pc22 = 10; continue $sw22; }
                        return ((android.support.v7.widget.RecyclerView) r1).getAdapter();
                    }
                    case 10: {
                        return null;
                    }
                    case 15: {
                        return null;
                    }
                    case 5: {
                        return ((android.widget.AdapterView) r1).getAdapter();
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public static void j6(com.appfour.backbone.api.objects.UserActionWindow r22, float r23, float r24) {
            android.view.View r2 = null;
            int r9 = 0;
            int r10 = 0;
            android.view.MenuItem r3 = null;
            int r12 = 0;
            int r13 = 0;
            android.util.Pair<java.lang.Integer, android.view.View> r4 = null;
            android.view.MenuItem r5 = null;
            int r11 = 0;
            int r14 = 0;
            int r0 = 0;
            int r1 = 0;
            android.util.Pair<? extends android.view.View, java.lang.Integer> r6 = null;
            int r15 = 0;
            int r16 = 0;
            com.appfour.backbone.api.objects.UserTouchAction r7 = null;
            java.lang.Object r8 = null;
            int r17 = 0;
            int r18 = 0;
            java.lang.Throwable $ex23 = null;
            int $pc23 = -1;
            $sw23: while (true) {
                switch ($pc23) {
                    case -1: {
                        r2 = DW(r22.getWindowView(), r23, r24);
                        if (r2 != null) { $pc23 = 6; continue $sw23; }
                        r9 = (int) r23;
                        r10 = (int) r24;
                        abcd.Qv.j6(new com.appfour.backbone.api.objects.UserTouchAction(r22, null, 0, r9, r10, r9, r10));
                        return;
                    }
                    case 6: {
                        r3 = DW(r2);
                        if (r3 == null) { $pc23 = 10; continue $sw23; }
                        r12 = (int) r23;
                        r13 = (int) r24;
                        abcd.Qv.j6(new com.appfour.backbone.api.objects.UserTouchAction(r22, new com.appfour.backbone.api.objects.UserActionWidget(r2, 0, null), 5, r12, r13, r12, r13), r3);
                        return;
                    }
                    case 10: {
                        r4 = j6(r22.getWindowView(), r23, r24, r2);
                        if (r4 == null) { $pc23 = 18; continue $sw23; }
                        r5 = DW((android.view.View) r4.second);
                        if (r5 == null) { $pc23 = 16; continue $sw23; }
                        r11 = (int) r23;
                        r14 = (int) r24;
                        abcd.Qv.j6(new com.appfour.backbone.api.objects.UserTouchAction(r22, new com.appfour.backbone.api.objects.UserActionWidget(r2, ((java.lang.Integer) r4.first).intValue(), (android.view.View) r4.second), 5, r11, r14, r11, r14), r5);
                        return;
                    }
                    case 16: {
                        r0 = (int) r23;
                        r1 = (int) r24;
                        abcd.Qv.DW(new com.appfour.backbone.api.objects.UserTouchAction(r22, new com.appfour.backbone.api.objects.UserActionWidget(r2, ((java.lang.Integer) r4.first).intValue(), (android.view.View) r4.second), 6, r0, r1, r0, r1), r2, j6(r2), ((java.lang.Integer) r4.first).intValue(), (android.view.View) r4.second);
                        return;
                    }
                    case 18: {
                        r6 = FH(r2);
                        if (r6 == null) { $pc23 = 22; continue $sw23; }
                        r15 = (int) r23;
                        r16 = (int) r24;
                        r7 = new com.appfour.backbone.api.objects.UserTouchAction(r22, new com.appfour.backbone.api.objects.UserActionWidget(r2, ((java.lang.Integer) r6.second).intValue(), (android.view.View) r6.first), 6, r15, r16, r15, r16);
                        r8 = r6.first;
                        abcd.Qv.DW(r7, (android.view.View) r8, j6((android.view.View) r8), ((java.lang.Integer) r6.second).intValue(), r2);
                        return;
                    }
                    case 22: {
                        r17 = (int) r23;
                        r18 = (int) r24;
                        abcd.Qv.DW(new com.appfour.backbone.api.objects.UserTouchAction(r22, new com.appfour.backbone.api.objects.UserActionWidget(r2, 0, null), 7, r17, r18, r17, r18), r2);
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        public static void j6(com.appfour.backbone.api.objects.UserActionWindow r9, float r10, float r11, float r12, float r13) {
            abcd.Qv.DW(new com.appfour.backbone.api.objects.UserTouchAction(r9, null, 1, (int) r10, (int) r11, (int) r12, (int) r13));
        }
    }

    static {
        Hw = new java.util.HashMap();
    }

    static void DW(com.appfour.backbone.api.objects.UserActionWindow r0) {
        FH(r0);
    }

    public static void DW(com.appfour.backbone.api.objects.UserInputAction r0) {
        FH(r0);
    }

    static void DW(com.appfour.backbone.api.objects.UserTouchAction r0) {
        v5(r0);
    }

    private static void DW(com.appfour.backbone.api.objects.UserTouchAction r0, android.view.MenuItem r1) {
        abcd.kv.j6(r0);
        abcd.kv.j6(r0, r1);
        FH = false;
    }

    static void DW(com.appfour.backbone.api.objects.UserTouchAction r0, android.view.View r1) {
        FH(r0, r1);
    }

    static void DW(com.appfour.backbone.api.objects.UserTouchAction r0, android.view.View r1, java.lang.Object r2, int r3, android.view.View r4) {
        FH(r0, r1, r2, r3, r4);
    }

    private static void FH(com.appfour.backbone.api.objects.UserActionWindow r0) {
        abcd.kv.j6(r0);
    }

    private static void FH(com.appfour.backbone.api.objects.UserInputAction r1) {
        java.lang.Throwable $ex24 = null;
        int $pc24 = -1;
        $sw24: while (true) {
            switch ($pc24) {
                case -1: {
                    if (r1.isBackKey() == false) { $pc24 = 6; continue $sw24; }
                    abcd.kv.j6(r1);
                    FH = false;
                    return;
                }
                case 6: {
                    if (FH == true) { $pc24 = 10; continue $sw24; }
                    abcd.kv.j6(r1);
                    FH = true;
                    return;
                }
                case 10: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void FH(com.appfour.backbone.api.objects.UserTouchAction r0) {
        Hw(r0);
    }

    private static void FH(com.appfour.backbone.api.objects.UserTouchAction r0, android.view.View r1) {
        abcd.kv.j6(r0);
        abcd.kv.j6(r0, r1);
        FH = false;
    }

    private static void FH(com.appfour.backbone.api.objects.UserTouchAction r0, android.view.View r1, java.lang.Object r2, int r3, android.view.View r4) {
        abcd.kv.j6(r0);
        abcd.kv.j6(r0, r1, r2, r3, r4);
        FH = false;
    }

    private static void Hw(com.appfour.backbone.api.objects.UserActionWindow r0) {
        abcd.kv.DW(r0);
    }

    private static void Hw(com.appfour.backbone.api.objects.UserTouchAction r0) {
        abcd.kv.j6(r0);
        FH = false;
    }

    private static void Hw(com.appfour.backbone.api.objects.UserTouchAction r0, android.view.View r1) {
        abcd.kv.j6(r0);
        abcd.kv.DW(r0, r1);
        FH = false;
    }

    private static void Hw(com.appfour.backbone.api.objects.UserTouchAction r0, android.view.View r1, java.lang.Object r2, int r3, android.view.View r4) {
        abcd.kv.j6(r0);
        abcd.kv.DW(r0, r1, r2, r3, r4);
        FH = false;
    }

    private static void Zo(com.appfour.backbone.api.objects.UserTouchAction r0) {
        abcd.kv.j6(r0);
        FH = false;
    }

    public static void j6(android.view.View r1, com.appfour.backbone.api.objects.UserActionWindow r2) {
        java.lang.Throwable $ex25 = null;
        int $pc25 = -1;
        $sw25: while (true) {
            switch ($pc25) {
                case -1: {
                    if ((r1 instanceof abcd.Qv.c) == false) { $pc25 = 6; continue $sw25; }
                    ((abcd.Qv.c) r1).j6(r2);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.view.Window r1, com.appfour.backbone.api.objects.UserActionWindow r2) {
        java.lang.Throwable $ex26 = null;
        int $pc26 = -1;
        $sw26: while (true) {
            switch ($pc26) {
                case -1: {
                    if ((r1.getCallback() instanceof abcd.Qv.d) == false) { $pc26 = 5; continue $sw26; }
                    abcd.Qv.d.j6((abcd.Qv.d) r1.getCallback());
                    return;
                }
                case 5: {
                    r1.setCallback(new abcd.Qv.d(r1, r2));
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.widget.PopupWindow r1, com.appfour.backbone.api.objects.UserActionWindow r2) {
        java.lang.Throwable $ex27 = null;
        int $pc27 = -1;
        $sw27: while (true) {
            switch ($pc27) {
                case -1: {
                    if ((abcd.Qv.b.j6(r1) instanceof abcd.Qv.b) == true) { $pc27 = 6; continue $sw27; }
                    r1.setTouchInterceptor(new abcd.Qv.b(r1, r2));
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static void j6(com.appfour.backbone.api.objects.UserActionWindow r0) {
        Hw(r0);
    }

    static void j6(com.appfour.backbone.api.objects.UserInputAction r0) {
        FH(r0);
    }

    static void j6(com.appfour.backbone.api.objects.UserTouchAction r0) {
        Zo(r0);
    }

    static void j6(com.appfour.backbone.api.objects.UserTouchAction r0, android.view.MenuItem r1) {
        DW(r0, r1);
    }

    static void j6(com.appfour.backbone.api.objects.UserTouchAction r0, android.view.View r1) {
        Hw(r0, r1);
    }

    static void j6(com.appfour.backbone.api.objects.UserTouchAction r0, android.view.View r1, java.lang.Object r2, int r3, android.view.View r4) {
        Hw(r0, r1, r2, r3, r4);
    }

    private static void v5(com.appfour.backbone.api.objects.UserTouchAction r0) {
        abcd.kv.j6(r0);
        FH = false;
    }
}
