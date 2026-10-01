package tv.ouya.console.api;

public class j {
    private static final android.net.Uri DW = null;
    private static tv.ouya.console.api.j.a FH = null;
    private static android.hardware.input.InputManager Hw = null;
    private static java.util.List<android.util.SparseBooleanArray> VH = null;
    private static android.util.SparseArray<tv.ouya.console.api.d.e> Zo = null;
    private static tv.ouya.console.api.d gn = null;
    private static final java.lang.String j6 = "j";
    private static boolean u7;
    private static boolean v5;

    static class a implements android.hardware.input.InputManager.InputDeviceListener {
        a() {
        }

        @Override
        public void onInputDeviceAdded(int r4) {
            tv.ouya.console.api.f r0 = null;
            tv.ouya.console.api.d.e r1 = null;
            java.lang.Throwable $ex0 = null;
            int $pc0 = -1;
            $sw0: while (true) {
                switch ($pc0) {
                    case -1: {
                        if (tv.ouya.console.api.j.j6().get(r4) != null) { $pc0 = 11; continue $sw0; }
                        r0 = tv.ouya.console.api.f.j6(r4);
                        if (r0 == null) { $pc0 = 9; continue $sw0; }
                        r1 = tv.ouya.console.api.j.DW().j6(tv.ouya.console.api.j.DW().j6(r0.FH()));
                        if (r1 == null) { $pc0 = 12; continue $sw0; }
                        tv.ouya.console.api.j.j6().put(r4, r1);
                        return;
                    }
                    case 12: {
                        return;
                    }
                    case 9: {
                        android.util.Log.e(tv.ouya.console.api.j.FH(), "onInputDeviceAdded device=" + r4 + " not found");
                        return;
                    }
                    case 11: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }

        @Override
        public void onInputDeviceChanged(int r1) {
        }

        @Override
        public void onInputDeviceRemoved(int r2) {
            java.lang.Throwable $ex1 = null;
            int $pc1 = -1;
            $sw1: while (true) {
                switch ($pc1) {
                    case -1: {
                        if (tv.ouya.console.api.j.j6().get(r2) == null) { $pc1 = 6; continue $sw1; }
                        tv.ouya.console.api.j.j6().remove(r2);
                        return;
                    }
                    case 6: {
                        return;
                    }
                    default: throw new java.lang.IllegalStateException();
                }
            }
        }
    }

    static {
        DW = android.net.Uri.parse("content://tv.ouya.controllerdata/");
        FH = null;
        v5 = true;
        Zo = new android.util.SparseArray();
        VH = new java.util.ArrayList();
        gn = new tv.ouya.console.api.d();
        u7 = false;
    }

    static tv.ouya.console.api.d DW() {
        return gn;
    }

    public static void DW(android.app.Activity r1) {
        android.hardware.input.InputManager r2 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r2 = Hw;
                    if (r2 == null) { $pc2 = 6; continue $sw2; }
                    r2.unregisterInputDeviceListener(FH);
                    return;
                }
                case 6: {
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean DW(android.app.Activity r1, android.view.MotionEvent r2) {
        boolean r3 = false;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (v5 == false) { $pc3 = 5; continue $sw3; }
                    tv.ouya.console.api.f.j6(r2);
                    $pc3 = 5; continue $sw3;
                }
                case 5: {
                    u7 = true;
                    r3 = r1.dispatchGenericMotionEvent(r2);
                    u7 = false;
                    return r3;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static java.lang.String FH() {
        return j6;
    }

    private static java.lang.String FH(android.app.Activity r3) {
        android.os.Bundle r4 = null;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    try {
                        r4 = r3.getApplicationContext().getContentResolver().call(DW, "get_button_remap_json", null, null);
                    } catch (java.lang.Throwable $t) {
                        $ex4 = $t;
                        if ($t instanceof java.lang.IllegalArgumentException) { $pc4 = 5; continue $sw4; }
                        throw com.almlkaide.kaypro.internal.DecompileSupport.rethrow($t);
                    }
                    $pc4 = 6; continue $sw4;
                }
                case 6: {
                    if (r4 != null) { $pc4 = 8; continue $sw4; }
                    return null;
                }
                case 8: {
                    return r4.getString("button_remap");
                }
                case 5: {
                    android.util.Log.e(j6, "Error querying button remapping");
                    r4 = null;
                    { $pc4 = 6; continue $sw4; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    static android.util.SparseArray j6() {
        return Zo;
    }

    private static tv.ouya.console.api.d.e j6(int r1) {
        java.lang.Throwable $ex5 = null;
        int $pc5 = -1;
        $sw5: while (true) {
            switch ($pc5) {
                case -1: {
                    if (Zo.get(r1) != null) { $pc5 = 5; continue $sw5; }
                    FH.onInputDeviceAdded(r1);
                    return Zo.get(r1);
                }
                case 5: {
                    return Zo.get(r1);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(android.app.Activity r6) {
        android.hardware.input.InputManager r0 = null;
        int r1 = 0;
        int r2 = 0;
        tv.ouya.console.api.f r3 = null;
        java.lang.String r4 = null;
        java.lang.Throwable $ex6 = null;
        int $pc6 = -1;
        $sw6: while (true) {
            switch ($pc6) {
                case -1: {
                    tv.ouya.console.api.f.j6(r6);
                    if (FH != null) { $pc6 = 7; continue $sw6; }
                    FH = new tv.ouya.console.api.j.a();
                    Hw = (android.hardware.input.InputManager) r6.getSystemService("input");
                    r0 = Hw;
                    if (r0 == null) { $pc6 = 7; continue $sw6; }
                    r0.registerInputDeviceListener(FH, null);
                    $pc6 = 7; continue $sw6;
                }
                case 7: {
                    r1 = 0;
                    r2 = 0;
                    $pc6 = 9; continue $sw6;
                }
                case 9: {
                    if (r2 >= 4) { $pc6 = 11; continue $sw6; }
                    VH.add(new android.util.SparseBooleanArray());
                    r2 = r2 + 1;
                    $pc6 = 11; continue $sw6;
                }
                case 11: {
                    if (r1 >= 4) { $pc6 = 21; continue $sw6; }
                    r3 = tv.ouya.console.api.f.DW(r1);
                    if (r3 == null) { $pc6 = 20; continue $sw6; }
                    if (r3.j6() == null) { $pc6 = 18; continue $sw6; }
                    r4 = r3.j6().getName();
                    $pc6 = 19; continue $sw6;
                }
                case 19: {
                    android.util.Log.i(j6, "OUYA Controller #" + r1 + ": " + r4);
                    { $pc6 = 20; continue $sw6; }
                }
                case 18: {
                    r4 = "null";
                    $pc6 = 20; continue $sw6;
                }
                case 20: {
                    r1 = r1 + 1;
                    { $pc6 = 11; continue $sw6; }
                }
                case 21: {
                    gn.DW(FH(r6));
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void j6(boolean r0) {
        v5 = r0;
    }

    public static boolean j6(android.app.Activity r17, android.view.KeyEvent r18) {
        android.view.KeyEvent r1 = null;
        android.view.View r2 = null;
        tv.ouya.console.api.d.e r3 = null;
        int r4 = 0;
        int r5 = 0;
        tv.ouya.console.api.d.c r6 = null;
        java.lang.Throwable $ex7 = null;
        int $pc7 = -1;
        $sw7: while (true) {
            switch ($pc7) {
                case -1: {
                    r1 = r18;
                    if (j6(r18) == false) { $pc7 = 30; continue $sw7; }
                    r2 = r17.getCurrentFocus();
                    if (r2 != null) { $pc7 = 7; continue $sw7; }
                    $pc7 = 10; continue $sw7;
                }
                case 10: {
                    r3 = j6(r18.getDeviceId());
                    if (r3 == null) { $pc7 = 13; continue $sw7; }
                    r4 = r18.getKeyCode();
                    r5 = r18.getSource();
                    r6 = gn.j6(r3, r4);
                    if (r6 != null) { $pc7 = 19; continue $sw7; }
                    return j6(r17, r1, true);
                }
                case 19: {
                    if (r6.FH.size() <= 0) { $pc7 = 24; continue $sw7; }
                    if (r6.FH.get(r5) == false) { $pc7 = 24; continue $sw7; }
                    return true;
                }
                case 24: {
                    if (r4 == r6.DW) { $pc7 = 28; continue $sw7; }
                    r1 = new android.view.KeyEvent(r18.getDownTime(), r18.getEventTime(), r18.getAction(), r6.DW, r18.getRepeatCount(), r18.getMetaState(), r18.getDeviceId(), 0);
                    $pc7 = 28; continue $sw7;
                }
                case 28: {
                    return j6(r17, r1, true);
                }
                case 13: {
                    return j6(r17, r1, true);
                }
                case 7: {
                    if ((r2 instanceof android.widget.EditText) == false) { $pc7 = 10; continue $sw7; }
                    return j6(r17, r1, false);
                }
                case 30: {
                    throw new java.lang.RuntimeException("Don't pass events when shouldHandleInputEvent is false");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private static boolean j6(android.app.Activity r17, android.view.KeyEvent r18, boolean r19) {
        int r1 = 0;
        int r2 = 0;
        boolean r3 = false;
        int r11 = 0;
        java.lang.Throwable $ex8 = null;
        int $pc8 = -1;
        $sw8: while (true) {
            switch ($pc8) {
                case -1: {
                    r1 = r18.getKeyCode();
                    r2 = r18.getAction();
                    if (r2 == 0) { $pc8 = 10; continue $sw8; }
                    if (r2 == 1) { $pc8 = 7; continue $sw8; }
                    $pc8 = 12; continue $sw8;
                }
                case 12: {
                    u7 = true;
                    r3 = r17.dispatchKeyEvent(r18);
                    if (r3 == true) { $pc8 = 23; continue $sw8; }
                    if (r19 == false) { $pc8 = 23; continue $sw8; }
                    switch(r18.getKeyCode()) {
                        case 96: { $pc8 = 20; continue $sw8; }
                        case 97: { $pc8 = 19; continue $sw8; }
                        case 98: { $pc8 = 17; continue $sw8; }
                        case 99: { $pc8 = 18; continue $sw8; }
                        case 100: { $pc8 = 18; continue $sw8; }
                        default: { $pc8 = 17; continue $sw8; }
                    };
                }
                case 17: {
                    r11 = 0;
                    $pc8 = 21; continue $sw8;
                }
                case 21: {
                    if (r11 == 0) { $pc8 = 23; continue $sw8; }
                    r17.dispatchKeyEvent(new android.view.KeyEvent(r18.getDownTime(), r18.getEventTime(), r18.getAction(), r11, r18.getRepeatCount(), r18.getMetaState(), r18.getDeviceId(), 0, 1024));
                    r3 = true;
                    { $pc8 = 23; continue $sw8; }
                }
                case 18: {
                    r3 = true;
                    { $pc8 = 17; continue $sw8; }
                }
                case 19: {
                    r11 = 4;
                    { $pc8 = 21; continue $sw8; }
                }
                case 20: {
                    r11 = 23;
                    $pc8 = 23; continue $sw8;
                }
                case 23: {
                    u7 = false;
                    return r3;
                }
                case 7: {
                    if (v5 == false) { $pc8 = 12; continue $sw8; }
                    tv.ouya.console.api.f.DW(r1, r18);
                    { $pc8 = 12; continue $sw8; }
                }
                case 10: {
                    if (v5 == false) { $pc8 = 12; continue $sw8; }
                    tv.ouya.console.api.f.j6(r1, r18);
                    { $pc8 = 12; continue $sw8; }
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(android.app.Activity r28, android.view.MotionEvent r29) {
        android.view.View r2 = null;
        int r3 = 0;
        tv.ouya.console.api.d.e r4 = null;
        int r15 = 0;
        java.util.Vector<tv.ouya.console.api.d.C0068d> r5 = null;
        int r7 = 0;
        boolean r8 = false;
        tv.ouya.console.api.d.C0068d r9 = null;
        float r10 = 0.0f;
        boolean r11 = false;
        boolean r17 = false;
        java.util.Vector<tv.ouya.console.api.d.b> r6 = null;
        int r12 = 0;
        android.view.MotionEvent.PointerProperties[] r13 = null;
        android.view.MotionEvent.PointerCoords[] r14 = null;
        int r16 = 0;
        tv.ouya.console.api.d.b r18 = null;
        int r19 = 0;
        android.view.MotionEvent r1 = null;
        boolean r0 = false;
        java.lang.Throwable $ex9 = null;
        int $pc9 = -1;
        $sw9: while (true) {
            switch ($pc9) {
                case -1: {
                    if (j6(r29) == false) { $pc9 = 61; continue $sw9; }
                    r2 = r28.getCurrentFocus();
                    if (r2 != null) { $pc9 = 7; continue $sw9; }
                    $pc9 = 10; continue $sw9;
                }
                case 10: {
                    r3 = tv.ouya.console.api.f.FH(r29.getDeviceId());
                    if (r3 >= 0) { $pc9 = 14; continue $sw9; }
                    android.util.Log.e(j6, "Failed to find playerNum for Controller=" + r29.getDevice().getName());
                    return DW(r28, r29);
                }
                case 14: {
                    r4 = j6(r29.getDeviceId());
                    if (r4 == null) { $pc9 = 17; continue $sw9; }
                    r15 = r29.getSource();
                    r5 = r4.v5;
                    if (r5 == null) { $pc9 = 36; continue $sw9; }
                    r7 = 0;
                    r8 = false;
                    $pc9 = 22; continue $sw9;
                }
                case 22: {
                    if (r7 >= r5.size()) { $pc9 = 35; continue $sw9; }
                    r9 = r5.get(r7);
                    r10 = r29.getAxisValue(r9.j6);
                    if (r10 < r9.FH) { $pc9 = 31; continue $sw9; }
                    if (r10 > r9.DW) { $pc9 = 31; continue $sw9; }
                    if (VH.get(r3).get(r9.Hw) == true) { $pc9 = 34; continue $sw9; }
                    VH.get(r3).put(r9.Hw, true);
                    r11 = j6(r28, new android.view.KeyEvent(0, 0, 0, r9.Hw, 0, 0, r29.getDeviceId(), 0, 1024), true);
                    $pc9 = 33; continue $sw9;
                }
                case 33: {
                    r8 = r8 | r11;
                    $pc9 = 34; continue $sw9;
                }
                case 34: {
                    r7 = r7 + 1;
                    $pc9 = 31; continue $sw9;
                }
                case 31: {
                    if (VH.get(r3).get(r9.Hw) == false) { $pc9 = 34; continue $sw9; }
                    VH.get(r3).put(r9.Hw, false);
                    r11 = j6(r28, new android.view.KeyEvent(0, 0, 1, r9.Hw, 0, 0, r29.getDeviceId(), 0, 1024), true);
                    { $pc9 = 33; continue $sw9; }
                }
                case 35: {
                    r17 = r8;
                    $pc9 = 38; continue $sw9;
                }
                case 38: {
                    if (r4.DW.size() > 0) { $pc9 = 40; continue $sw9; }
                    $pc9 = 42; continue $sw9;
                }
                case 42: {
                    r6 = r4.FH;
                    if (r6 == null) { $pc9 = 59; continue $sw9; }
                    r12 = r29.getPointerCount();
                    if (r12 <= 0) { $pc9 = 59; continue $sw9; }
                    if (r6.size() <= 0) { $pc9 = 59; continue $sw9; }
                    r13 = new android.view.MotionEvent.PointerProperties[]{new android.view.MotionEvent.PointerProperties()};
                    r14 = new android.view.MotionEvent.PointerCoords[]{new android.view.MotionEvent.PointerCoords()};
                    r29.getPointerProperties(0, r13[0]);
                    r29.getPointerCoords(0, r14[0]);
                    r16 = 0;
                    $pc9 = 50; continue $sw9;
                }
                case 50: {
                    if (r16 >= r6.size()) { $pc9 = 56; continue $sw9; }
                    r18 = r6.get(r16);
                    r19 = r18.j6;
                    if (r19 == r18.DW) { $pc9 = 55; continue $sw9; }
                    r14[0].setAxisValue(r18.DW, r29.getAxisValue(r19));
                    $pc9 = 55; continue $sw9;
                }
                case 55: {
                    r16 = r16 + 1;
                    { $pc9 = 50; continue $sw9; }
                }
                case 56: {
                    r1 = android.view.MotionEvent.obtain(r29.getDownTime(), r29.getEventTime(), r29.getAction(), r12, r13, r14, r29.getMetaState(), r29.getButtonState(), 1.0f, 1.0f, r29.getDeviceId(), r29.getEdgeFlags(), r15, r29.getFlags());
                    r0 = r17 | DW(r28, r1);
                    r1.recycle();
                    return r0;
                }
                case 59: {
                    return r17 | DW(r28, r29);
                }
                case 40: {
                    if (r4.DW.get(r15) == false) { $pc9 = 42; continue $sw9; }
                    return true;
                }
                case 36: {
                    r17 = false;
                    { $pc9 = 38; continue $sw9; }
                }
                case 17: {
                    return DW(r28, r29);
                }
                case 7: {
                    if ((r2 instanceof android.widget.EditText) == false) { $pc9 = 10; continue $sw9; }
                    return DW(r28, r29);
                }
                case 61: {
                    throw new java.lang.RuntimeException("Don't pass events when shouldHandleInputEvent is false");
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static boolean j6(android.view.InputEvent r0) {
        return !u7;
    }
}
