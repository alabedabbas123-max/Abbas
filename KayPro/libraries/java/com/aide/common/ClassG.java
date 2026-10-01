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
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 1123404112429320200L, null);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(1123404112429320200L, null);     // Catch: java.lang.Throwable -> L8
    L6:
    }

    public static float DW(android.content.Context r5) {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 4003758142168701840L, null, r5);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(4003758142168701840L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        return java.lang.Math.min(j6(r5), Hw(r5));
    }

    public static int DW(android.content.Context r7, int r8) {
    L7:
        th = move-exception;
        if (Hw == false) goto L11;
        abcd.wu.j6(th, 621390210197194053L, null, r7, new java.lang.Integer(r8));
    L11:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(621390210197194053L, null, r7, new java.lang.Integer(r8));     // Catch: java.lang.Throwable -> L7
    L5:
        android.content.res.TypedArray r0 = r7.obtainStyledAttributes(new int[]{r8});     // Catch: java.lang.Throwable -> L7
        int r1 = r0.getColor(0, -1);     // Catch: java.lang.Throwable -> L7
        r0.recycle();     // Catch: java.lang.Throwable -> L7
        return r1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @abcd.Interfacesu(method = -2412139209681051315L)
    private static <T extends android.view.View> T DW(android.view.View r7, java.lang.Class<T> r8) {
    L20:
        th = move-exception;
        if (Hw == false) goto L25;
        abcd.wu.j6(th, -753914654287951527L, null, r7, r8);
    L25:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(-753914654287951527L, null, r7, r8);     // Catch: java.lang.Throwable -> L20
    L5:
        if (r7 != 0) goto L8;
        return null;
    L8:
        if (r7.getClass() != r8) goto L11;
        return r7;
    L11:
        if ((r7 instanceof android.view.ViewGroup) == false) goto L19;
        android.view.ViewGroup r0 = (android.view.ViewGroup) r7;     // Catch: java.lang.Throwable -> L20
        int r2 = 0;
    L13:
        if (r2 >= r0.getChildCount()) goto L19;
        T r3 = (T) DW(r0.getChildAt(r2), r8);
        if (r3 != null) goto L17;
        r2 = r2 + 1;
        goto L13
    L17:
        return r3;
    L19:
        return null;
    }

    public static void DW(android.app.Activity r8) {
    L15:
        th = move-exception;
        if (Hw == false) goto L19;
        abcd.wu.j6(th, -175477646570065261L, null, r8);
    L19:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(-175477646570065261L, null, r8);     // Catch: java.lang.Throwable -> L15
    L7:
        if (android.os.Build.VERSION.SDK_INT < 21) goto L22;
        android.view.View r5 = r8.findViewById(r8.getResources().getIdentifier("action_bar", "id", "android"));     // Catch: java.lang.Throwable -> L15
        if ((r5 instanceof android.view.ViewGroup) == false) goto L11;
        ((android.view.ViewGroup) r5).setTouchscreenBlocksFocus(false);     // Catch: java.lang.Throwable -> L15
    L11:
        android.view.View r0 = r8.findViewById(r8.getResources().getIdentifier("action_bar_container", "id", "android"));     // Catch: java.lang.Throwable -> L15
        if ((r0 instanceof android.view.ViewGroup) == false) goto L23;
        ((android.view.ViewGroup) r0).setTouchscreenBlocksFocus(false);     // Catch: java.lang.Throwable -> L15
        return;
    L23:
        return;
    }

    public static boolean DW(android.view.MotionEvent r5) {
    L14:
        th = move-exception;
        if (Hw == false) goto L18;
        abcd.wu.j6(th, -4371106096306733584L, null, r5);
    L18:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(-4371106096306733584L, null, r5);     // Catch: java.lang.Throwable -> L14
    L7:
        if (j6(r5) == false) goto L12;
        if (r5.getButtonState() != 2) goto L12;
        return true;
    L12:
        return false;
    }

    public static boolean EQ(android.content.Context r5) {
    L13:
        th = move-exception;
        if (Hw == false) goto L17;
        abcd.wu.j6(th, -5853450705758181103L, null, r5);
    L17:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(-5853450705758181103L, null, r5);     // Catch: java.lang.Throwable -> L13
    L7:
        if (r5.getResources().getConfiguration().keyboard != 2) goto L11;
        if (r5.getResources().getConfiguration().hardKeyboardHidden == 2) goto L11;
        return true;
    L11:
        return false;
    }

    public static int FH(android.content.Context r5) {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -4498292904257305317L, null, r5);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-4498292904257305317L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        android.view.WindowManager r3 = (android.view.WindowManager) r5.getSystemService("window");     // Catch: java.lang.Throwable -> L8
        return java.lang.Math.min(r3.getDefaultDisplay().getHeight(), r3.getDefaultDisplay().getWidth());
    }

    public static int FH(android.content.Context r7, int r8) {
    L7:
        th = move-exception;
        if (Hw == false) goto L11;
        abcd.wu.j6(th, -1437560050403393320L, null, r7, new java.lang.Integer(r8));
    L11:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(-1437560050403393320L, null, r7, new java.lang.Integer(r8));     // Catch: java.lang.Throwable -> L7
    L5:
        android.content.res.TypedArray r0 = r7.obtainStyledAttributes(new int[]{r8});     // Catch: java.lang.Throwable -> L7
        int r1 = r0.getResourceId(0, 0);     // Catch: java.lang.Throwable -> L7
        r0.recycle();     // Catch: java.lang.Throwable -> L7
        return r1;
    }

    public static void FH(android.app.Activity r7) {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -5968739812695808131L, null, r7);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-5968739812695808131L, null, r7);     // Catch: java.lang.Throwable -> L8
    L6:
        new android.os.Handler().postDelayed(new com.aide.common.Runnablef(r7), 200);     // Catch: java.lang.Throwable -> L8
    }

    @abcd.Interfacesu(method = -2606726766413675937L)
    private static boolean FH(android.view.MotionEvent r5) {
    L17:
        th = move-exception;
        if (Hw == false) goto L21;
        abcd.wu.j6(th, 1194221725721743915L, null, r5);
    L21:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(1194221725721743915L, null, r5);     // Catch: java.lang.Throwable -> L17
    L7:
        if (r5.getAction() != 0) goto L9;
    L12:
        if (r5.getButtonState() != 0) goto L15;
        return true;
    L15:
        return false;
    L9:
        if (r5.getAction() == 3) goto L12;
        if (r5.getAction() != 2) goto L15;
        goto L12
    }

    public static float Hw(android.content.Context r5) {
    L9:
        th = move-exception;
        if (Hw == false) goto L13;
        abcd.wu.j6(th, -3184543668233818835L, null, r5);
    L13:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-3184543668233818835L, null, r5);     // Catch: java.lang.Throwable -> L9
    L6:
        android.view.WindowManager r3 = (android.view.WindowManager) r5.getSystemService("window");     // Catch: java.lang.Throwable -> L9
        return r3.getDefaultDisplay().getWidth() / r5.getResources().getDisplayMetrics().density;
    }

    @android.annotation.TargetApi(21)
    public static void Hw(android.app.Activity r9) {
    L12:
        th = move-exception;
        if (Hw == false) goto L16;
        abcd.wu.j6(th, 948696159716436028L, null, r9);
    L16:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(948696159716436028L, null, r9);     // Catch: java.lang.Throwable -> L12
    L7:
        if (J8(r9) == false) goto L19;
        float r3 = r9.getResources().getDisplayMetrics().density;     // Catch: java.lang.Throwable -> L12
        r9.getActionBar().setElevation(3.0f * r3);     // Catch: java.lang.Throwable -> L12
        android.view.View r4 = r9.getWindow().getDecorView().findViewById(r9.getResources().getIdentifier("action_bar_container", "id", "android"));     // Catch: java.lang.Throwable -> L12
        if (r4 == null) goto L20;
        int r5 = (int) (48.0f * r3);     // Catch: java.lang.Throwable -> L12
        r4.setPadding(r5, (int) (r3 * 27.0f), r5, 0);     // Catch: java.lang.Throwable -> L12
        return;
    L20:
        return;
    }

    public static boolean J0(android.content.Context r5) {
    L13:
        th = move-exception;
        if (Hw == false) goto L17;
        abcd.wu.j6(th, 3217005404104941453L, null, r5);
    L17:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(3217005404104941453L, null, r5);     // Catch: java.lang.Throwable -> L13
    L7:
        if (j6() == true) goto L11;
        if (J8(r5) == true) goto L11;
        return true;
    L11:
        return false;
    }

    public static boolean J8(android.content.Context r6) {
    L16:
        th = move-exception;
        if (Hw == false) goto L20;
        abcd.wu.j6(th, -2081768783119786509L, null, r6);
    L20:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(-2081768783119786509L, null, r6);     // Catch: java.lang.Throwable -> L16
    L7:
        if (j6 != null) goto L14;
        boolean r3 = false;
        j6 = false;     // Catch: java.lang.Throwable -> L16
        if (android.os.Build.VERSION.SDK_INT < 21) goto L14;
        if (((android.app.UiModeManager) r6.getSystemService("uimode")).getCurrentModeType() != 4) goto L13;
        r3 = true;
    L13:
        j6 = java.lang.Boolean.valueOf(r3);     // Catch: java.lang.Throwable -> L16
    L14:
        return j6.booleanValue();
    }

    public static boolean QX(android.content.Context r7) {
    L14:
        th = move-exception;
        if (Hw == false) goto L18;
        abcd.wu.j6(th, -2163333111741559520L, null, r7);
    L18:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(-2163333111741559520L, null, r7);     // Catch: java.lang.Throwable -> L14
    L7:
        if (android.os.Build.VERSION.SDK_INT < 20) goto L12;
        android.util.TypedValue r3 = new android.util.TypedValue();     // Catch: java.lang.Throwable -> L14
        if (r7.getTheme().resolveAttribute(com.aide.ui.Ma.theme_name, r3, true) == false) goto L21;
        return "Material".equals(r3.string);
    L21:
        return false;
    L12:
        return false;
    }

    public static float VH(android.content.Context r5) {
    L17:
        th = move-exception;
        if (Hw == false) goto L21;
        abcd.wu.j6(th, -450878124985839000L, null, r5);
    L21:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(-450878124985839000L, null, r5);     // Catch: java.lang.Throwable -> L17
    L7:
        if (DW(r5) <= 720.0f) goto L10;
        return 25.0f;
    L10:
        if (DW(r5) < 400.0f) goto L15;
        return 22.0f;
    L15:
        return 20.0f;
    }

    public static boolean Ws(android.content.Context r5) {
    L14:
        th = move-exception;
        if (Hw == false) goto L18;
        abcd.wu.j6(th, -3092613739657721945L, null, r5);
    L18:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(-3092613739657721945L, null, r5);     // Catch: java.lang.Throwable -> L14
    L7:
        if (r5.getPackageManager().hasSystemFeature("android.hardware.type.pc") == true) goto L12;
        if (r5.getPackageManager().hasSystemFeature("org.chromium.arc.device_management") == true) goto L12;
        return false;
    L12:
        return true;
    }

    public static int Zo(android.content.Context r5) {
    L17:
        th = move-exception;
        if (Hw == false) goto L21;
        abcd.wu.j6(th, -756466250292846912L, null, r5);
    L21:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(-756466250292846912L, null, r5);     // Catch: java.lang.Throwable -> L17
    L7:
        if (DW(r5) <= 720.0f) goto L10;
        return 21;
    L10:
        if (DW(r5) < 400.0f) goto L15;
        return 18;
    L15:
        return 14;
    }

    public static float gn(android.content.Context r5) {
    L17:
        th = move-exception;
        if (Hw == false) goto L21;
        abcd.wu.j6(th, 781510863908749200L, null, r5);
    L21:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(781510863908749200L, null, r5);     // Catch: java.lang.Throwable -> L17
    L7:
        if (DW(r5) <= 720.0f) goto L10;
        return 35.0f;
    L10:
        if (DW(r5) < 400.0f) goto L15;
        return 30.0f;
    L15:
        return 25.0f;
    }

    public static float j6(android.content.Context r5) {
    L9:
        th = move-exception;
        if (Hw == false) goto L13;
        abcd.wu.j6(th, 4933710697175507848L, null, r5);
    L13:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(4933710697175507848L, null, r5);     // Catch: java.lang.Throwable -> L9
    L6:
        android.view.WindowManager r3 = (android.view.WindowManager) r5.getSystemService("window");     // Catch: java.lang.Throwable -> L9
        return r3.getDefaultDisplay().getHeight() / r5.getResources().getDisplayMetrics().density;
    }

    public static int j6(android.content.Context r7, int r8) {
    L11:
        th = move-exception;
        if (Hw == false) goto L15;
        abcd.wu.j6(th, -1243226287542072044L, null, r7, new java.lang.Integer(r8));
    L15:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(-1243226287542072044L, null, r7, new java.lang.Integer(r8));     // Catch: java.lang.Throwable -> L11
    L5:
        if (DW(r7) >= 400.0f) goto L9;
        return r8;
    L9:
        return (int) (r8 * 1.3f);
    }

    public static android.graphics.drawable.Drawable j6(android.content.Context r8, int r9, int r10) {
    L7:
        th = move-exception;
        if (Hw == false) goto L11;
        abcd.wu.j6(th, -7110126465582252149L, null, r8, new java.lang.Integer(r9), new java.lang.Integer(r10));
    L11:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(-7110126465582252149L, null, r8, new java.lang.Integer(r9), new java.lang.Integer(r10));     // Catch: java.lang.Throwable -> L7
    L5:
        android.graphics.drawable.Drawable r0 = android.support.v4.content.b.DW(r8, FH(r8, r9));     // Catch: java.lang.Throwable -> L7
        r0.setColorFilter(DW(r8, r10), android.graphics.PorterDuff.Mode.SRC_IN);     // Catch: java.lang.Throwable -> L7
        return r0;
    }

    static android.view.View j6(android.view.View r0, java.lang.Class r1) {
        return DW(r0, r1);
    }

    public static void j6(android.app.Activity r6) {
    L13:
        th = move-exception;
        if (Hw == false) goto L17;
        abcd.wu.j6(th, 750338857930420512L, null, r6);
    L17:
        throw th;
    L4:
        if (FH == false) goto L8;
        abcd.wu.j6(750338857930420512L, null, r6);     // Catch: java.lang.Throwable -> L13
    L8:
        if (DW(r6) < 540.0f) goto L22;
        android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r6);     // Catch: java.lang.Exception -> L18 java.lang.Throwable -> L13
        java.lang.reflect.Field r4 = android.view.ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");     // Catch: java.lang.Exception -> L18 java.lang.Throwable -> L13
        if (r4 == null) goto L23;
        r4.setAccessible(true);     // Catch: java.lang.Exception -> L18 java.lang.Throwable -> L13
        r4.setBoolean(r3, false);     // Catch: java.lang.Exception -> L18 java.lang.Throwable -> L13
        return;
        goto L24
    L23:
        return;
    L24:
        return;
    }

    public static void j6(android.app.Activity r7, java.lang.String r8) {
    L13:
        th = move-exception;
        if (Hw == false) goto L17;
        abcd.wu.j6(th, -4320628111573899060L, null, r7, r8);
    L17:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(-4320628111573899060L, null, r7, r8);     // Catch: java.lang.Throwable -> L13
    L5:
        if (r8 != null) goto L7;
    L9:
        java.util.Locale r0 = DW;     // Catch: java.lang.Throwable -> L13
        DW = null;     // Catch: java.lang.Throwable -> L13
    L10:
        if (r0 == null) goto L20;
        java.util.Locale.setDefault(r0);     // Catch: java.lang.Throwable -> L13
        android.content.res.Configuration r1 = new android.content.res.Configuration();     // Catch: java.lang.Throwable -> L13
        r1.locale = r0;     // Catch: java.lang.Throwable -> L13
        r7.getBaseContext().getResources().updateConfiguration(r1, r7.getBaseContext().getResources().getDisplayMetrics());     // Catch: java.lang.Throwable -> L13
        return;
    L20:
        return;
    L7:
        if ("default".equals(r8) == true) goto L9;
        r0 = new java.util.Locale(r8);     // Catch: java.lang.Throwable -> L13
        DW = java.util.Locale.getDefault();     // Catch: java.lang.Throwable -> L13
        goto L10
    }

    public static void j6(android.app.Activity r7, boolean r8) {
    L10:
        th = move-exception;
        if (Hw == false) goto L14;
        abcd.wu.j6(th, -5698127656685140416L, null, r7, new java.lang.Boolean(r8));
    L14:
        throw th;
    L3:
        if (FH == false) goto L15;
        abcd.wu.j6(-5698127656685140416L, null, r7, new java.lang.Boolean(r8));     // Catch: java.lang.Throwable -> L10
    L15:
        java.lang.reflect.Method r0 = r7.getActionBar().getClass().getDeclaredMethod("setHasEmbeddedTabs", new java.lang.Class[]{java.lang.Boolean.TYPE});     // Catch: java.lang.Exception -> L7 java.lang.Throwable -> L10
        r0.setAccessible(true);     // Catch: java.lang.Exception -> L7 java.lang.Throwable -> L10
        r0.invoke(r7.getActionBar(), new java.lang.Object[]{java.lang.Boolean.valueOf(r8)});     // Catch: java.lang.Exception -> L7 java.lang.Throwable -> L10
    L19:
        return;
    L7:
        e = move-exception;
        e.printStackTrace();     // Catch: java.lang.Throwable -> L10
    }

    public static void j6(android.content.Context r7, android.graphics.Rect r8) {
    L7:
        th = move-exception;
        if (Hw == false) goto L11;
        abcd.wu.j6(th, 5332574427369261111L, null, r7, r8);
    L11:
        throw th;
    L3:
        if (FH == false) goto L5;
        abcd.wu.j6(5332574427369261111L, null, r7, r8);     // Catch: java.lang.Throwable -> L7
    L5:
        ((android.app.Activity) r7).getWindow().getDecorView().getWindowVisibleDisplayFrame(r8);     // Catch: java.lang.Throwable -> L7
    }

    public static void j6(android.view.View r5) {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -2576100528666937080L, null, r5);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-2576100528666937080L, null, r5);     // Catch: java.lang.Throwable -> L8
    L6:
        j6(r5, false);     // Catch: java.lang.Throwable -> L8
    }

    @android.annotation.TargetApi(21)
    public static void j6(android.view.View r9, boolean r10) {
    L15:
        th = move-exception;
        if (Hw == false) goto L19;
        abcd.wu.j6(th, 830483819560853601L, null, r9, new java.lang.Boolean(r10));
    L19:
        throw th;
    L3:
        if (FH == false) goto L6;
        abcd.wu.j6(830483819560853601L, null, r9, new java.lang.Boolean(r10));     // Catch: java.lang.Throwable -> L15
    L6:
        if (J8(r9.getContext()) == false) goto L22;
        android.app.Activity r0 = (android.app.Activity) r9.getContext();     // Catch: java.lang.Throwable -> L15
        float r1 = r0.getResources().getDisplayMetrics().density;     // Catch: java.lang.Throwable -> L15
        r0.getActionBar().setElevation(3.0f * r1);     // Catch: java.lang.Throwable -> L15
        int r2 = (int) (48.0f * r1);     // Catch: java.lang.Throwable -> L15
        if (r10 == false) goto L10;
        int r5 = (int) (r1 * 27.0f);     // Catch: java.lang.Throwable -> L15
    L11:
        r9.setPadding(r2, 0, r2, r5);     // Catch: java.lang.Throwable -> L15
        android.view.View r3 = r0.getWindow().getDecorView().findViewById(r0.getResources().getIdentifier("action_bar_container", "id", "android"));     // Catch: java.lang.Throwable -> L15
        if (r3 == null) goto L23;
        r3.setPadding(r2, (int) (r1 * 27.0f), r2, 0);     // Catch: java.lang.Throwable -> L15
        return;
    L23:
        return;
    L10:
        r5 = 0;
        goto L11
    }

    public static void j6(android.widget.TextView r6) {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, -3170672808846646372L, null, r6);
    L12:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-3170672808846646372L, null, r6);     // Catch: java.lang.Throwable -> L8
    L6:
        r6.setTextSize(j6(r6.getContext(), (int) r6.getTextSize()) / r6.getContext().getResources().getDisplayMetrics().scaledDensity);     // Catch: java.lang.Throwable -> L8
    }

    public static boolean j6() {
    L8:
        th = move-exception;
        if (Hw == false) goto L12;
        abcd.wu.j6(th, 3340886991838745825L, null);
    L12:
        throw th;
    L4:
        if (FH == false) goto L15;
        abcd.wu.j6(3340886991838745825L, null);     // Catch: java.lang.Throwable -> L8
        return false;
    L15:
        return false;
    }

    public static boolean j6(android.view.MotionEvent r7) {
    L19:
        th = move-exception;
        if (Hw == false) goto L23;
        abcd.wu.j6(th, 6543668983874266464L, null, r7);
    L23:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(6543668983874266464L, null, r7);     // Catch: java.lang.Throwable -> L19
    L7:
        if (FH(r7) == false) goto L10;
        return false;
    L10:
        if (r7.getToolType(0) != 3) goto L12;
        return true;
    L12:
        int r8 = r7.getSource();     // Catch: java.lang.Throwable -> L19
        if (r8 != 8194) goto L16;
    L18:
        return true;
    L16:
        if (r8 == 1048584) goto L18;
        return false;
    }

    public static float tp(android.content.Context r6) {
    L9:
        th = move-exception;
        if (Hw == false) goto L13;
        abcd.wu.j6(th, -4172557700451251640L, null, r6);
    L13:
        throw th;
    L4:
        if (FH == false) goto L6;
        abcd.wu.j6(-4172557700451251640L, null, r6);     // Catch: java.lang.Throwable -> L9
    L6:
        android.app.Activity r3 = (android.app.Activity) r6;     // Catch: java.lang.Throwable -> L9
        float r4 = r3.getResources().getDisplayMetrics().density;     // Catch: java.lang.Throwable -> L9
        android.graphics.Rect r5 = new android.graphics.Rect();     // Catch: java.lang.Throwable -> L9
        r3.getWindow().getDecorView().getWindowVisibleDisplayFrame(r5);     // Catch: java.lang.Throwable -> L9
        return (r5.bottom - r5.top) / r4;
    }

    public static float u7(android.content.Context r5) {
    L17:
        th = move-exception;
        if (Hw == false) goto L21;
        abcd.wu.j6(th, 879740075994925176L, null, r5);
    L21:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(879740075994925176L, null, r5);     // Catch: java.lang.Throwable -> L17
    L7:
        if (DW(r5) <= 720.0f) goto L10;
        return 20.0f;
    L10:
        if (DW(r5) < 400.0f) goto L15;
        return 18.0f;
    L15:
        return 15.0f;
    }

    public static float v5(android.content.Context r5) {
    L17:
        th = move-exception;
        if (Hw == false) goto L21;
        abcd.wu.j6(th, 811111452886127169L, null, r5);
    L21:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(811111452886127169L, null, r5);     // Catch: java.lang.Throwable -> L17
    L7:
        if (DW(r5) <= 720.0f) goto L10;
        return 25.0f;
    L10:
        if (DW(r5) < 400.0f) goto L15;
        return 22.0f;
    L15:
        return 20.0f;
    }

    public static boolean we(android.content.Context r5) {
    L14:
        th = move-exception;
        if (Hw == false) goto L18;
        abcd.wu.j6(th, -4802308845907983971L, null, r5);
    L18:
        throw th;
    L4:
        if (FH == false) goto L7;
        abcd.wu.j6(-4802308845907983971L, null, r5);     // Catch: java.lang.Throwable -> L14
    L7:
        if (r5.getResources().getConfiguration().keyboard == 1) goto L21;
        if (r5.getResources().getConfiguration().hardKeyboardHidden == 2) goto L22;
        return false;
    L22:
        return true;
    L21:
        return true;
    }
}
