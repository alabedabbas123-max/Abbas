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
            com.appfour.backbone.api.objects.UserActionWindow r0 = abcd.Hv.gn();
            if (r0 == null) goto L6;
            abcd.Qv.DW(new com.appfour.backbone.api.objects.UserInputAction(r0, false));
            return;
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
        java.lang.reflect.Field r0 = java.lang.Class.forName("com.android.internal.policy.DecorView").getDeclaredField("mWindow");     // Catch: java.lang.Exception -> L5
        r0.setAccessible(true);     // Catch: java.lang.Exception -> L5
        return (android.view.Window) r0.get(r3);
    L5:
        java.lang.reflect.Field r1 = r3.getClass().getDeclaredField("this$0");     // Catch: java.lang.Exception -> L7
        r1.setAccessible(true);     // Catch: java.lang.Exception -> L7
        return (android.view.Window) r1.get(r3);
    L7:
        return null;
    }

    static void DW() {
        we();
    }

    private static boolean DW(android.content.Intent r2) {
        if (r2 != null) goto L4;
    L10:
        return false;
    L4:
        if ("android.intent.action.MAIN".equals(r2.getAction()) == false) goto L10;
        if (r2.getCategories() == null) goto L10;
        if (r2.getCategories().contains("android.intent.category.LAUNCHER") == false) goto L10;
        return true;
    }

    private static java.util.List<android.view.View> EQ() {
        java.util.ArrayList r0 = new java.util.ArrayList();
        java.lang.Object r1 = null;
        if (DW == null) goto L7;
        r1 = DW.get(FH);     // Catch: java.lang.IllegalAccessException -> L23
    L9:
        java.util.List r2 = new java.util.ArrayList();     // Catch: java.lang.IllegalAccessException -> L23
        if ((r1 instanceof java.util.List) == false) goto L13;
        r2 = (java.util.List) r1;     // Catch: java.lang.IllegalAccessException -> L23
    L15:
        java.util.Iterator r3 = r2.iterator();     // Catch: java.lang.IllegalAccessException -> L23
    L16:
        if (r3.hasNext() == false) goto L22;
        android.view.View r4 = (android.view.View) r3.next();     // Catch: java.lang.IllegalAccessException -> L23
        if (Hw(r4) == false) goto L16;
        r0.add(r4);     // Catch: java.lang.IllegalAccessException -> L23
        goto L16
    L13:
        if ((r1 instanceof android.view.View[]) == false) goto L15;
        r2 = java.util.Arrays.asList((android.view.View[]) r1);     // Catch: java.lang.IllegalAccessException -> L23
        goto L15
    L7:
        if (Hw == null) goto L9;
        r1 = Hw.get(v5);     // Catch: java.lang.IllegalAccessException -> L23
    L22:
        return r0;
    }

    static java.lang.Runnable FH() {
        return VH;
    }

    private static boolean FH(android.view.View r3) {
        android.view.Window r0 = DW(r3);
        if (r0 != null) goto L5;
        return false;
    L5:
        if (j6(r0, null, r3).getType() != 0) goto L9;
        return true;
    L9:
        return false;
    }

    static java.util.List Hw() {
        return j6;
    }

    private static boolean Hw(android.view.View r2) {
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

    private static void J0() {
        java.util.List<android.view.View> r0 = EQ();
        java.util.List<android.util.Pair<android.view.View, com.appfour.backbone.api.objects.UserActionWindow>> r1 = j6;
        int r2 = r1.size() - 1;
        boolean r4 = false;
    L3:
        if (r2 < 0) goto L12;
        android.view.View r5 = (android.view.View) r1.get(r2).first;
        java.util.Iterator<android.view.View> r6 = r0.iterator();
    L6:
        if (r6.hasNext() == false) goto L10;
        if (r6.next() != r5) goto L6;
    L11:
        r2 = r2 - 1;
        goto L3
    L10:
        j6((com.appfour.backbone.api.objects.UserActionWindow) r1.get(r2).second);
        r4 = true;
        goto L11
    L12:
        java.util.ArrayList r3 = new java.util.ArrayList();
        java.util.Iterator<android.view.View> r7 = r0.iterator();
    L14:
        if (r7.hasNext() == false) goto L24;
        android.view.View r8 = r7.next();
        if (FH(r8) == false) goto L14;
        java.util.Iterator<android.util.Pair<android.view.View, com.appfour.backbone.api.objects.UserActionWindow>> r9 = j6.iterator();
    L19:
        if (r9.hasNext() == false) goto L23;
        android.util.Pair<android.view.View, com.appfour.backbone.api.objects.UserActionWindow> r10 = r9.next();
        if (r10.first != r8) goto L19;
        r3.add(android.util.Pair.create(r8, r10.second));
        goto L14
    L23:
        r3.add(android.util.Pair.create(r8, v5(r8)));
        r4 = true;
        goto L14
    L24:
        java.util.Iterator<android.view.View> r11 = r0.iterator();
    L26:
        if (r11.hasNext() == false) goto L36;
        android.view.View r12 = r11.next();
        if (FH(r12) == true) goto L26;
        java.util.Iterator<android.util.Pair<android.view.View, com.appfour.backbone.api.objects.UserActionWindow>> r13 = j6.iterator();
    L31:
        if (r13.hasNext() == false) goto L35;
        android.util.Pair<android.view.View, com.appfour.backbone.api.objects.UserActionWindow> r14 = r13.next();
        if (r14.first != r12) goto L31;
        r3.add(android.util.Pair.create(r12, r14.second));
        goto L26
    L35:
        r3.add(android.util.Pair.create(r12, v5(r12)));
        r4 = true;
        goto L26
    L36:
        if (r4 == false) goto L62;
        j6 = new java.util.ArrayList(r3);
        return;
    }

    static android.app.Activity VH() {
        return gn;
    }

    static void Zo() {
        tp();
    }

    public static com.appfour.backbone.api.objects.UserActionWindow gn() {
        if (gn == null) goto L20;
        java.util.Iterator<android.util.Pair<android.view.View, com.appfour.backbone.api.objects.UserActionWindow>> r0 = j6.iterator();
    L6:
        if (r0.hasNext() == false) goto L13;
        android.util.Pair<android.view.View, com.appfour.backbone.api.objects.UserActionWindow> r1 = r0.next();
        if (((com.appfour.backbone.api.objects.UserActionWindow) r1.second).getType() == 0) goto L6;
        if (((com.appfour.backbone.api.objects.UserActionWindow) r1.second).getActivity() != gn) goto L6;
        return (com.appfour.backbone.api.objects.UserActionWindow) r1.second;
    L13:
        java.util.Iterator<android.util.Pair<android.view.View, com.appfour.backbone.api.objects.UserActionWindow>> r2 = j6.iterator();
    L15:
        if (r2.hasNext() == false) goto L31;
        android.util.Pair<android.view.View, com.appfour.backbone.api.objects.UserActionWindow> r3 = r2.next();
        if (((com.appfour.backbone.api.objects.UserActionWindow) r3.second).getActivity() != gn) goto L15;
        return (com.appfour.backbone.api.objects.UserActionWindow) r3.second;
    L31:
        return null;
    L20:
        return null;
    }

    static android.app.Activity j6(android.app.Activity r0) {
        gn = r0;
        return r0;
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

    private static android.widget.PopupWindow j6(android.view.View r2) {
        java.lang.reflect.Field r0 = r2.getClass().getDeclaredField("this$0");     // Catch: java.lang.Exception -> L4
        r0.setAccessible(true);     // Catch: java.lang.Exception -> L4
        return (android.widget.PopupWindow) r0.get(r2);
    L4:
        return null;
    }

    private static com.appfour.backbone.api.objects.UserActionWindow j6(android.view.Window r3, android.widget.PopupWindow r4, android.view.View r5) {
        if (r3 != null) goto L4;
    L6:
        android.app.Activity r0 = null;
    L7:
        android.app.Activity r1 = j6(r5.getContext());
        int r2 = 3;
        if (r0 == null) goto L10;
        r2 = 0;
    L22:
        if (r1 == null) goto L25;
        r0 = r1;
    L25:
        return new com.appfour.backbone.api.objects.UserActionWindow(r0, r2, r5);
    L10:
        if (r3 != null) goto L17;
        if (r4 != null) goto L17;
        if ((r5.getLayoutParams() instanceof android.view.WindowManager.LayoutParams) == false) goto L22;
        if ("Toast".equals(((android.view.WindowManager.LayoutParams) r5.getLayoutParams()).getTitle()) == false) goto L22;
        r2 = 4;
    L17:
        if (r3 == null) goto L19;
        r2 = 1;
        goto L22
    L19:
        if (r4 == null) goto L22;
        r2 = 2;
        goto L22
    L4:
        if ((r3.getContext() instanceof android.app.Activity) == false) goto L6;
        r0 = (android.app.Activity) r3.getContext();
        goto L7
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
        android.app.Application r0 = abcd.wu.j6();
        if (android.os.Build.VERSION.SDK_INT < 17) goto L9;
        java.lang.Class<?> r1 = java.lang.Class.forName("android.view.WindowManagerGlobal");     // Catch: java.lang.Throwable -> L16
        FH = r1.getMethod("getInstance", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);     // Catch: java.lang.Throwable -> L16
        DW = r1.getDeclaredField("mViews");     // Catch: java.lang.Throwable -> L16
        DW.setAccessible(true);     // Catch: java.lang.Throwable -> L16
    L17:
        goto L14
    L9:
        if (android.os.Build.VERSION.SDK_INT < 14) goto L17;
        if (android.os.Build.VERSION.SDK_INT >= 17) goto L17;
        java.lang.Class<?> r2 = java.lang.Class.forName("android.view.WindowManagerImpl");     // Catch: java.lang.Throwable -> L16
        v5 = r2.getMethod("getDefault", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);     // Catch: java.lang.Throwable -> L16
        Hw = r2.getDeclaredField("mViews");     // Catch: java.lang.Throwable -> L16
        Hw.setAccessible(true);     // Catch: java.lang.Throwable -> L16
    L14:
        Zo = new android.os.Handler();
        VH = new abcd.Fv();
        Zo.post(VH);
        r0.registerActivityLifecycleCallbacks(new abcd.Gv());
    }

    static android.os.Handler v5() {
        return Zo;
    }

    private static com.appfour.backbone.api.objects.UserActionWindow v5(android.view.View r2) {
        android.view.Window r0 = DW(r2);
        if (r0 == null) goto L6;
        com.appfour.backbone.api.objects.UserActionWindow r3 = j6(r0, null, r2);
        abcd.kv.Hw(r3);
        abcd.Qv.j6(r0, r3);
        return r3;
    L6:
        android.widget.PopupWindow r1 = j6(r2);
        if (r1 == null) goto L10;
        com.appfour.backbone.api.objects.UserActionWindow r4 = j6(null, r1, r2);
        abcd.kv.Hw(r4);
        abcd.Qv.j6(r1, r4);
        return r4;
    L10:
        com.appfour.backbone.api.objects.UserActionWindow r5 = j6(null, null, r2);
        abcd.kv.Hw(r5);
        abcd.Qv.j6(r2, r5);
        return r5;
    }

    private static void we() {
        android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) abcd.wu.j6().getSystemService("input_method");     // Catch: java.lang.Exception -> L19
        java.lang.reflect.Field r1 = r0.getClass().getDeclaredField("mServedInputConnectionWrapper");     // Catch: java.lang.Exception -> L19
        r1.setAccessible(true);     // Catch: java.lang.Exception -> L19
        java.lang.Object r2 = r1.get(r0);     // Catch: java.lang.Exception -> L19
        if (r2 == null) goto L20;
        java.lang.reflect.Field r3 = r2.getClass().getSuperclass().getDeclaredField("mInputConnection");     // Catch: java.lang.Exception -> L19
        r3.setAccessible(true);     // Catch: java.lang.Exception -> L19
        if (r3.getType() != java.lang.ref.WeakReference.class) goto L13;
        java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r3.get(r2);     // Catch: java.lang.Exception -> L19
        if (r4 == null) goto L20;
        if (r4.get() == null) goto L20;
        if ((r4.get() instanceof abcd.Hv.a) == true) goto L20;
        u7 = new abcd.Hv.a((android.view.inputmethod.InputConnection) r4.get(), true);     // Catch: java.lang.Exception -> L19
        r3.set(r2, new java.lang.ref.WeakReference(u7));     // Catch: java.lang.Exception -> L19
        goto L20
    L13:
        android.view.inputmethod.InputConnection r5 = (android.view.inputmethod.InputConnection) r3.get(r2);     // Catch: java.lang.Exception -> L19
        if (r5 == null) goto L20;
        if ((r5 instanceof abcd.Hv.a) == true) goto L20;
        u7 = new abcd.Hv.a(r5, true);     // Catch: java.lang.Exception -> L19
        r3.set(r2, u7);     // Catch: java.lang.Exception -> L19
    L20:
        return;
    }
}
