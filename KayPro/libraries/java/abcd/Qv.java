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
            if (r2.isShown() == true) goto L5;
            return false;
        L5:
            android.app.Activity r3 = j6(r2.getContext());
            if (r3 != null) goto L8;
        L9:
            return true;
        L8:
            if (r3.getWindow().getDecorView().isShown() == true) goto L9;
            return false;
        }

        static float FH(abcd.Qv.a r0) {
            return r0.VH;
        }

        private static android.app.Activity j6(android.content.Context r1) {
            if ((r1 instanceof android.app.Activity) == false) goto L7;
            return (android.app.Activity) r1;
        L7:
            if ((r1 instanceof android.content.ContextWrapper) == true) goto L9;
            return null;
        L9:
            return j6(((android.content.ContextWrapper) r1).getBaseContext());
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
            if (r5.getActionMasked() != 0) goto L6;
            this.Zo = r5.getX();
            this.VH = r5.getY();
            this.gn = true;
            this.Hw.postDelayed(this.v5, this.FH);
            return;
        L6:
            if (r5.getActionMasked() != 1) goto L14;
            this.Hw.removeCallbacks(this.v5);
            if (this.gn == false) goto L23;
            this.gn = false;
            float r0 = (r5.getX() - this.Zo) * (r5.getX() - this.Zo);
            float r1 = r5.getY() - this.VH;
            float r2 = r5.getY();
            float r3 = this.VH;
            if ((r0 + (r1 * (r2 - r3))) < this.DW) goto L12;
            abcd.Qv.e.j6(this.j6, this.Zo, r3, r5.getX(), r5.getY());
            return;
        L12:
            abcd.Qv.e.j6(this.j6, this.Zo, r3);
            return;
        L23:
            return;
        L14:
            if (r5.getActionMasked() != 3) goto L17;
            this.Hw.removeCallbacks(this.v5);
            return;
        L17:
            if (r5.getActionMasked() == 2) goto L19;
            return;
        L19:
            if ((((r5.getX() - this.Zo) * (r5.getX() - this.Zo)) + ((r5.getY() - this.VH) * (r5.getY() - this.VH))) < this.DW) goto L28;
            this.Hw.removeCallbacks(this.v5);
            return;
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
            java.lang.reflect.Field r0 = android.widget.PopupWindow.class.getDeclaredField("mTouchInterceptor");     // Catch: java.lang.Throwable -> L4
            r0.setAccessible(true);     // Catch: java.lang.Throwable -> L4
            return (android.view.View.OnTouchListener) r0.get(r2);
        L4:
            th = move-exception;
            abcd.yw.j6("Runtime Error", th);
            return null;
        }

        @Override
        public boolean onTouch(android.view.View r1, android.view.MotionEvent r2) {
            this.j6.DW(r2);     // Catch: java.lang.Throwable -> L4
            return false;
        L4:
            th = move-exception;
            abcd.yw.j6("Runtime Error", th);
            return false;
        }
    }

    private static class c extends android.widget.FrameLayout {
        private abcd.Qv.a j6;

        @Override
        public boolean dispatchTouchEvent(android.view.MotionEvent r2) {
            abcd.Qv.a r0 = this.j6;
            if (r0 == null) goto L6;
            r0.DW(r2);
        L6:
            return getChildAt(0).dispatchTouchEvent(r2);
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
            this.DW = r2.getCallback();
            this.j6 = new abcd.Qv.a(r3);
            this.FH = r3;
            if (r3.getType() != 0) goto L6;
            r2.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new abcd.Rv(this));
            j6();
            return;
        }

        private void j6() {
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) this.FH.getWindowView().getContext().getSystemService("input_method");     // Catch: java.lang.Exception -> L13
            java.lang.reflect.Method r1 = r0.getClass().getDeclaredMethod("getInputMethodWindowVisibleHeight", new java.lang.Class[0]);     // Catch: java.lang.Exception -> L13
            boolean r2 = true;
            r1.setAccessible(true);     // Catch: java.lang.Exception -> L13
            java.lang.Integer r3 = (java.lang.Integer) r1.invoke(r0, new java.lang.Object[0]);     // Catch: java.lang.Exception -> L13
            abcd.Qv.DW = r3.intValue();     // Catch: java.lang.Exception -> L13
            if (r3.intValue() > 0) goto L7;
            r2 = false;
        L7:
            if (abcd.Qv.j6 == r2) goto L14;
            abcd.Qv.j6 = r2;     // Catch: java.lang.Exception -> L13
            if (abcd.Qv.j6 == false) goto L11;
            abcd.Qv.j6(this.FH);     // Catch: java.lang.Exception -> L13
            goto L14
        L11:
            abcd.Qv.DW(this.FH);     // Catch: java.lang.Exception -> L13
        L14:
            return;
        }

        static void j6(abcd.Qv.d r0) {
            r0.j6();
        }

        @Override
        public boolean dispatchGenericMotionEvent(android.view.MotionEvent r3) {
            this.j6.j6(r3);     // Catch: java.lang.Throwable -> L4
        L7:
            return this.DW.dispatchGenericMotionEvent(r3);
        L4:
            th = move-exception;
            abcd.yw.j6("Runtime Error", th);
            goto L7
        }

        @Override
        public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
            boolean r1 = true;
            if (r6.getAction() != 1) goto L14;
            if (this.FH.getActivity() == null) goto L14;
            com.appfour.backbone.api.objects.UserActionWindow r0 = abcd.Hv.gn();
            if (r0 == null) goto L14;
            if (r6.getKeyCode() == 4) goto L12;
            r1 = false;
        L12:
            abcd.Qv.j6(new com.appfour.backbone.api.objects.UserInputAction(r0, r1));
        L14:
            return this.DW.dispatchKeyEvent(r6);
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
            this.j6.DW(r3);     // Catch: java.lang.Throwable -> L4
        L7:
            return this.DW.dispatchTouchEvent(r3);
        L4:
            th = move-exception;
            abcd.yw.j6("Runtime Error", th);
            goto L7
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
            if (r2 != r1) goto L6;
            return 0.0f;
        L6:
            return r2.getY() + DW(r1, (android.view.View) r2.getParent());
        }

        private static android.view.MenuItem DW(android.view.View r4) {
            if ((r4 instanceof android.support.v7.view.menu.MenuView.ItemView) == false) goto L15;
            return ((android.support.v7.view.menu.MenuView.ItemView) r4).getItemData();
        L15:
            java.lang.Class<?> r0 = java.lang.Class.forName("com.android.internal.view.menu.MenuView$ItemView");     // Catch: java.lang.Throwable -> L14
            if (r0.isInstance(r4) == false) goto L11;
            return (android.view.MenuItem) r0.getDeclaredMethod("getItemData", new java.lang.Class[0]).invoke(r4, new java.lang.Object[0]);
        L11:
            return null;
        L19:
            return null;
        }

        private static android.view.View DW(android.view.View r8, float r9, float r10) {
            if ((r8 instanceof android.view.ViewGroup) == false) goto L17;
            android.view.ViewGroup r0 = (android.view.ViewGroup) r8;
            int r2 = 0;
            android.view.View r3 = null;
        L6:
            if (r2 >= r0.getChildCount()) goto L14;
            android.view.View r4 = r0.getChildAt(r2);
            android.view.View r5 = DW(r4, (r9 - r4.getX()) + r4.getScrollX(), (r10 - r4.getY()) + r4.getScrollY());
            if (r5 == null) goto L13;
            if (r3 != null) goto L11;
        L12:
            r3 = r5;
            goto L13
        L11:
            if (FH(r5, r3) == true) goto L12;
        L13:
            r2 = r2 + 1;
            goto L6
        L14:
            if (r3 == null) goto L17;
            return r3;
        L17:
            if (r8.isClickable() == true) goto L19;
        L29:
            return null;
        L19:
            if (r9 < 0.0f) goto L29;
            if (r10 < 0.0f) goto L29;
            if (r9 > r8.getWidth()) goto L29;
            if (r10 > r8.getHeight()) goto L29;
            if (r8.isShown() == false) goto L29;
            return r8;
        }

        public static void DW(com.appfour.backbone.api.objects.UserActionWindow r11, float r12, float r13) {
            android.view.View r0 = FH(r11.getWindowView(), r12, r13);
            if (r0 != null) goto L6;
            int r7 = (int) r12;
            int r8 = (int) r13;
            abcd.Qv.FH(new com.appfour.backbone.api.objects.UserTouchAction(r11, null, 2, r7, r8, r7, r8));
            return;
        L6:
            android.util.Pair<java.lang.Integer, android.view.View> r1 = j6(r11.getWindowView(), r12, r13, r0);
            if (r1 == null) goto L10;
            int r9 = (int) r12;
            int r10 = (int) r13;
            abcd.Qv.j6(new com.appfour.backbone.api.objects.UserTouchAction(r11, new com.appfour.backbone.api.objects.UserActionWidget(r0, ((java.lang.Integer) r1.first).intValue(), (android.view.View) r1.second), 3, r9, r10, r9, r10), r0, j6(r0), ((java.lang.Integer) r1.first).intValue(), (android.view.View) r1.second);
            return;
        L10:
            android.util.Pair<? extends android.view.View, java.lang.Integer> r2 = FH(r0);
            if (r2 == null) goto L14;
            int r14 = (int) r12;
            int r15 = (int) r13;
            com.appfour.backbone.api.objects.UserTouchAction r16 = new com.appfour.backbone.api.objects.UserTouchAction(r11, new com.appfour.backbone.api.objects.UserActionWidget(r0, ((java.lang.Integer) r2.second).intValue(), (android.view.View) r2.first), 3, r14, r15, r14, r15);
            java.lang.Object r17 = r2.first;
            abcd.Qv.j6(r16, (android.view.View) r17, j6((android.view.View) r17), ((java.lang.Integer) r2.second).intValue(), r0);
            return;
        L14:
            int r18 = (int) r12;
            int r19 = (int) r13;
            abcd.Qv.j6(new com.appfour.backbone.api.objects.UserTouchAction(r11, new com.appfour.backbone.api.objects.UserActionWidget(r0, 0, null), 4, r18, r19, r18, r19), r0);
        }

        private static android.util.Pair<? extends android.view.View, java.lang.Integer> FH(android.view.View r2) {
            android.util.Pair r3 = j6(r2, android.support.v7.widget.RecyclerView.class);     // Catch: java.lang.Throwable -> L8
            if (r3 == null) goto L6;
            int r0 = ((android.support.v7.widget.RecyclerView) r3.first).getChildAdapterPosition((android.view.View) r3.second);     // Catch: java.lang.Throwable -> L8
            return new android.util.Pair(r3.first, java.lang.Integer.valueOf(r0));
        L6:
            return null;
        L11:
            return null;
        }

        private static android.view.View FH(android.view.View r8, float r9, float r10) {
            if ((r8 instanceof android.view.ViewGroup) == false) goto L17;
            android.view.ViewGroup r0 = (android.view.ViewGroup) r8;
            int r2 = 0;
            android.view.View r3 = null;
        L6:
            if (r2 >= r0.getChildCount()) goto L14;
            android.view.View r4 = r0.getChildAt(r2);
            android.view.View r5 = DW(r4, (r9 - r4.getX()) + r4.getScrollX(), (r10 - r4.getY()) + r4.getScrollY());
            if (r5 == null) goto L13;
            if (r3 != null) goto L11;
        L12:
            r3 = r5;
            goto L13
        L11:
            if (FH(r5, r3) == true) goto L12;
        L13:
            r2 = r2 + 1;
            goto L6
        L14:
            if (r3 == null) goto L17;
            return r3;
        L17:
            if (r8.isLongClickable() == true) goto L19;
        L29:
            return null;
        L19:
            if (r9 < 0.0f) goto L29;
            if (r10 < 0.0f) goto L29;
            if (r9 > r8.getWidth()) goto L29;
            if (r10 > r8.getHeight()) goto L29;
            if (r8.isShown() == false) goto L29;
            return r8;
        }

        private static boolean FH(android.view.View r3, android.view.View r4) {
            if (android.os.Build.VERSION.SDK_INT < 21) goto L8;
            if (r3.getElevation() <= r4.getElevation()) goto L8;
            return true;
        L8:
            if ((r3.getWidth() * r3.getHeight()) < (r4.getWidth() * r4.getHeight())) goto L12;
            return false;
        L12:
            return true;
        }

        private static float j6(android.view.View r1, android.view.View r2) {
            if (r2 != r1) goto L6;
            return 0.0f;
        L6:
            return r2.getX() + j6(r1, (android.view.View) r2.getParent());
        }

        private static android.util.Pair<java.lang.Integer, android.view.View> j6(android.view.View r2, float r3, float r4, android.view.View r5) {
            if ((r5 instanceof android.widget.ListView) == false) goto L8;
            float r6 = r3 - j6(r2, r5);
            float r7 = r4 - DW(r2, r5);
            int r8 = ((android.widget.ListView) r5).pointToPosition((int) r6, (int) r7);
            if (r8 == (-1)) goto L10;
            android.view.View r9 = j6(r5, r6, r7);
            return new android.util.Pair(java.lang.Integer.valueOf(r8), r9);
        L10:
            return null;
        L8:
            return null;
        }

        private static <V extends android.view.View> android.util.Pair<V, android.view.View> j6(android.view.View r2, java.lang.Class<V> r3) {
            java.lang.Object r0 = r2.getParent();
            if (r3.isInstance(r0) == false) goto L7;
            return new android.util.Pair((android.view.View) r0, r2);
        L7:
            if ((r0 instanceof android.view.View) == true) goto L9;
            return null;
        L9:
            return j6((android.view.View) r0, r3);
        }

        private static android.view.View j6(android.view.View r4, float r5, float r6) {
            if ((r4 instanceof android.view.ViewGroup) == false) goto L17;
            android.view.ViewGroup r7 = (android.view.ViewGroup) r4;
            int r0 = 0;
        L6:
            if (r0 >= r7.getChildCount()) goto L25;
            android.view.View r1 = r7.getChildAt(r0);
            if (r1.getX() > r5) goto L16;
            if ((r1.getX() + r1.getWidth()) < r5) goto L16;
            if (r1.getY() > r6) goto L16;
            if ((r1.getY() + r1.getHeight()) < r6) goto L16;
            return r1;
        L16:
            r0 = r0 + 1;
            goto L6
        L25:
            return null;
        L17:
            return null;
        }

        private static java.lang.Object j6(android.view.View r1) {
            if ((r1 instanceof android.widget.AdapterView) == true) goto L5;
            if ((r1 instanceof android.support.v7.widget.RecyclerView) == false) goto L10;
            return ((android.support.v7.widget.RecyclerView) r1).getAdapter();
        L10:
            return null;
        L15:
            return null;
        L5:
            return ((android.widget.AdapterView) r1).getAdapter();
        }

        public static void j6(com.appfour.backbone.api.objects.UserActionWindow r22, float r23, float r24) {
            android.view.View r2 = DW(r22.getWindowView(), r23, r24);
            if (r2 != null) goto L6;
            int r9 = (int) r23;
            int r10 = (int) r24;
            abcd.Qv.j6(new com.appfour.backbone.api.objects.UserTouchAction(r22, null, 0, r9, r10, r9, r10));
            return;
        L6:
            android.view.MenuItem r3 = DW(r2);
            if (r3 == null) goto L10;
            int r12 = (int) r23;
            int r13 = (int) r24;
            abcd.Qv.j6(new com.appfour.backbone.api.objects.UserTouchAction(r22, new com.appfour.backbone.api.objects.UserActionWidget(r2, 0, null), 5, r12, r13, r12, r13), r3);
            return;
        L10:
            android.util.Pair<java.lang.Integer, android.view.View> r4 = j6(r22.getWindowView(), r23, r24, r2);
            if (r4 == null) goto L18;
            android.view.MenuItem r5 = DW((android.view.View) r4.second);
            if (r5 == null) goto L16;
            int r11 = (int) r23;
            int r14 = (int) r24;
            abcd.Qv.j6(new com.appfour.backbone.api.objects.UserTouchAction(r22, new com.appfour.backbone.api.objects.UserActionWidget(r2, ((java.lang.Integer) r4.first).intValue(), (android.view.View) r4.second), 5, r11, r14, r11, r14), r5);
            return;
        L16:
            int r0 = (int) r23;
            int r1 = (int) r24;
            abcd.Qv.DW(new com.appfour.backbone.api.objects.UserTouchAction(r22, new com.appfour.backbone.api.objects.UserActionWidget(r2, ((java.lang.Integer) r4.first).intValue(), (android.view.View) r4.second), 6, r0, r1, r0, r1), r2, j6(r2), ((java.lang.Integer) r4.first).intValue(), (android.view.View) r4.second);
            return;
        L18:
            android.util.Pair<? extends android.view.View, java.lang.Integer> r6 = FH(r2);
            if (r6 == null) goto L22;
            int r15 = (int) r23;
            int r16 = (int) r24;
            com.appfour.backbone.api.objects.UserTouchAction r7 = new com.appfour.backbone.api.objects.UserTouchAction(r22, new com.appfour.backbone.api.objects.UserActionWidget(r2, ((java.lang.Integer) r6.second).intValue(), (android.view.View) r6.first), 6, r15, r16, r15, r16);
            java.lang.Object r8 = r6.first;
            abcd.Qv.DW(r7, (android.view.View) r8, j6((android.view.View) r8), ((java.lang.Integer) r6.second).intValue(), r2);
            return;
        L22:
            int r17 = (int) r23;
            int r18 = (int) r24;
            abcd.Qv.DW(new com.appfour.backbone.api.objects.UserTouchAction(r22, new com.appfour.backbone.api.objects.UserActionWidget(r2, 0, null), 7, r17, r18, r17, r18), r2);
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
        if (r1.isBackKey() == false) goto L6;
        abcd.kv.j6(r1);
        FH = false;
        return;
    L6:
        if (FH == true) goto L10;
        abcd.kv.j6(r1);
        FH = true;
        return;
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
        if ((r1 instanceof abcd.Qv.c) == false) goto L6;
        ((abcd.Qv.c) r1).j6(r2);
        return;
    }

    public static void j6(android.view.Window r1, com.appfour.backbone.api.objects.UserActionWindow r2) {
        if ((r1.getCallback() instanceof abcd.Qv.d) == false) goto L5;
        abcd.Qv.d.j6((abcd.Qv.d) r1.getCallback());
        return;
    L5:
        r1.setCallback(new abcd.Qv.d(r1, r2));
    }

    public static void j6(android.widget.PopupWindow r1, com.appfour.backbone.api.objects.UserActionWindow r2) {
        if ((abcd.Qv.b.j6(r1) instanceof abcd.Qv.b) == true) goto L6;
        r1.setTouchInterceptor(new abcd.Qv.b(r1, r2));
        return;
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
