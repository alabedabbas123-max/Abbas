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
            if (tv.ouya.console.api.j.j6().get(r4) != null) goto L11;
            tv.ouya.console.api.f r0 = tv.ouya.console.api.f.j6(r4);
            if (r0 == null) goto L9;
            tv.ouya.console.api.d.e r1 = tv.ouya.console.api.j.DW().j6(tv.ouya.console.api.j.DW().j6(r0.FH()));
            if (r1 == null) goto L12;
            tv.ouya.console.api.j.j6().put(r4, r1);
            return;
        L12:
            return;
        L9:
            android.util.Log.e(tv.ouya.console.api.j.FH(), "onInputDeviceAdded device=" + r4 + " not found");
            return;
        }

        @Override
        public void onInputDeviceChanged(int r1) {
        }

        @Override
        public void onInputDeviceRemoved(int r2) {
            if (tv.ouya.console.api.j.j6().get(r2) == null) goto L6;
            tv.ouya.console.api.j.j6().remove(r2);
            return;
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
        android.hardware.input.InputManager r2 = Hw;
        if (r2 == null) goto L6;
        r2.unregisterInputDeviceListener(FH);
        return;
    }

    private static boolean DW(android.app.Activity r1, android.view.MotionEvent r2) {
        if (v5 == false) goto L5;
        tv.ouya.console.api.f.j6(r2);
    L5:
        u7 = true;
        boolean r3 = r1.dispatchGenericMotionEvent(r2);
        u7 = false;
        return r3;
    }

    static java.lang.String FH() {
        return j6;
    }

    private static java.lang.String FH(android.app.Activity r3) {
        android.os.Bundle r4 = r3.getApplicationContext().getContentResolver().call(DW, "get_button_remap_json", null, null);     // Catch: java.lang.IllegalArgumentException -> L5
    L6:
        if (r4 != null) goto L8;
        return null;
    L8:
        return r4.getString("button_remap");
    L5:
        android.util.Log.e(j6, "Error querying button remapping");
        r4 = null;
        goto L6
    }

    static android.util.SparseArray j6() {
        return Zo;
    }

    private static tv.ouya.console.api.d.e j6(int r1) {
        if (Zo.get(r1) != null) goto L5;
        FH.onInputDeviceAdded(r1);
        return Zo.get(r1);
    L5:
        return Zo.get(r1);
    }

    public static void j6(android.app.Activity r6) {
        tv.ouya.console.api.f.j6(r6);
        if (FH != null) goto L7;
        FH = new tv.ouya.console.api.j.a();
        Hw = (android.hardware.input.InputManager) r6.getSystemService("input");
        android.hardware.input.InputManager r0 = Hw;
        if (r0 == null) goto L7;
        r0.registerInputDeviceListener(FH, null);
    L7:
        int r1 = 0;
        int r2 = 0;
    L9:
        if (r2 >= 4) goto L11;
        VH.add(new android.util.SparseBooleanArray());
        r2 = r2 + 1;
    L11:
        if (r1 >= 4) goto L21;
        tv.ouya.console.api.f r3 = tv.ouya.console.api.f.DW(r1);
        if (r3 == null) goto L20;
        if (r3.j6() == null) goto L18;
        java.lang.String r4 = r3.j6().getName();
    L19:
        android.util.Log.i(j6, "OUYA Controller #" + r1 + ": " + r4);
        goto L20
    L18:
        r4 = "null";
    L20:
        r1 = r1 + 1;
        goto L11
    L21:
        gn.DW(FH(r6));
    }

    public static void j6(boolean r0) {
        v5 = r0;
    }

    public static boolean j6(android.app.Activity r17, android.view.KeyEvent r18) {
        android.view.KeyEvent r1 = r18;
        if (j6(r18) == false) goto L30;
        android.view.View r2 = r17.getCurrentFocus();
        if (r2 != null) goto L7;
    L10:
        tv.ouya.console.api.d.e r3 = j6(r18.getDeviceId());
        if (r3 == null) goto L13;
        int r4 = r18.getKeyCode();
        int r5 = r18.getSource();
        tv.ouya.console.api.d.c r6 = gn.j6(r3, r4);
        if (r6 != null) goto L19;
        return j6(r17, r1, true);
    L19:
        if (r6.FH.size() <= 0) goto L24;
        if (r6.FH.get(r5) == false) goto L24;
        return true;
    L24:
        if (r4 == r6.DW) goto L28;
        r1 = new android.view.KeyEvent(r18.getDownTime(), r18.getEventTime(), r18.getAction(), r6.DW, r18.getRepeatCount(), r18.getMetaState(), r18.getDeviceId(), 0);
    L28:
        return j6(r17, r1, true);
    L13:
        return j6(r17, r1, true);
    L7:
        if ((r2 instanceof android.widget.EditText) == false) goto L10;
        return j6(r17, r1, false);
    L30:
        throw new java.lang.RuntimeException("Don't pass events when shouldHandleInputEvent is false");
    }

    private static boolean j6(android.app.Activity r17, android.view.KeyEvent r18, boolean r19) {
        int r1 = r18.getKeyCode();
        int r2 = r18.getAction();
        if (r2 == 0) goto L10;
        if (r2 == 1) goto L7;
    L12:
        u7 = true;
        boolean r3 = r17.dispatchKeyEvent(r18);
        if (r3 == true) goto L23;
        if (r19 == false) goto L23;
        switch(r18.getKeyCode()) {
            case 96: goto L20;
            case 97: goto L19;
            case 98: goto L17;
            case 99: goto L18;
            case 100: goto L18;
            default: goto L17;
        };
    L17:
        int r11 = 0;
    L21:
        if (r11 == 0) goto L23;
        r17.dispatchKeyEvent(new android.view.KeyEvent(r18.getDownTime(), r18.getEventTime(), r18.getAction(), r11, r18.getRepeatCount(), r18.getMetaState(), r18.getDeviceId(), 0, 1024));
        r3 = true;
        goto L23
    L18:
        r3 = true;
        goto L17
    L19:
        r11 = 4;
        goto L21
    L20:
        r11 = 23;
    L23:
        u7 = false;
        return r3;
    L7:
        if (v5 == false) goto L12;
        tv.ouya.console.api.f.DW(r1, r18);
        goto L12
    L10:
        if (v5 == false) goto L12;
        tv.ouya.console.api.f.j6(r1, r18);
        goto L12
    }

    public static boolean j6(android.app.Activity r28, android.view.MotionEvent r29) {
        if (j6(r29) == false) goto L61;
        android.view.View r2 = r28.getCurrentFocus();
        if (r2 != null) goto L7;
    L10:
        int r3 = tv.ouya.console.api.f.FH(r29.getDeviceId());
        if (r3 >= 0) goto L14;
        android.util.Log.e(j6, "Failed to find playerNum for Controller=" + r29.getDevice().getName());
        return DW(r28, r29);
    L14:
        tv.ouya.console.api.d.e r4 = j6(r29.getDeviceId());
        if (r4 == null) goto L17;
        int r15 = r29.getSource();
        java.util.Vector<tv.ouya.console.api.d.C0068d> r5 = r4.v5;
        if (r5 == null) goto L36;
        int r7 = 0;
        boolean r8 = false;
    L22:
        if (r7 >= r5.size()) goto L35;
        tv.ouya.console.api.d.C0068d r9 = r5.get(r7);
        float r10 = r29.getAxisValue(r9.j6);
        if (r10 < r9.FH) goto L31;
        if (r10 > r9.DW) goto L31;
        if (VH.get(r3).get(r9.Hw) == true) goto L34;
        VH.get(r3).put(r9.Hw, true);
        boolean r11 = j6(r28, new android.view.KeyEvent(0, 0, 0, r9.Hw, 0, 0, r29.getDeviceId(), 0, 1024), true);
    L33:
        r8 = r8 | r11;
    L34:
        r7 = r7 + 1;
    L31:
        if (VH.get(r3).get(r9.Hw) == false) goto L34;
        VH.get(r3).put(r9.Hw, false);
        r11 = j6(r28, new android.view.KeyEvent(0, 0, 1, r9.Hw, 0, 0, r29.getDeviceId(), 0, 1024), true);
        goto L33
    L35:
        boolean r17 = r8;
    L38:
        if (r4.DW.size() > 0) goto L40;
    L42:
        java.util.Vector<tv.ouya.console.api.d.b> r6 = r4.FH;
        if (r6 == null) goto L59;
        int r12 = r29.getPointerCount();
        if (r12 <= 0) goto L59;
        if (r6.size() <= 0) goto L59;
        android.view.MotionEvent.PointerProperties[] r13 = {new android.view.MotionEvent.PointerProperties()};
        android.view.MotionEvent.PointerCoords[] r14 = {new android.view.MotionEvent.PointerCoords()};
        r29.getPointerProperties(0, r13[0]);
        r29.getPointerCoords(0, r14[0]);
        int r16 = 0;
    L50:
        if (r16 >= r6.size()) goto L56;
        tv.ouya.console.api.d.b r18 = r6.get(r16);
        int r19 = r18.j6;
        if (r19 == r18.DW) goto L55;
        r14[0].setAxisValue(r18.DW, r29.getAxisValue(r19));
    L55:
        r16 = r16 + 1;
        goto L50
    L56:
        android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r29.getDownTime(), r29.getEventTime(), r29.getAction(), r12, r13, r14, r29.getMetaState(), r29.getButtonState(), 1.0f, 1.0f, r29.getDeviceId(), r29.getEdgeFlags(), r15, r29.getFlags());
        boolean r0 = r17 | DW(r28, r1);
        r1.recycle();
        return r0;
    L59:
        return r17 | DW(r28, r29);
    L40:
        if (r4.DW.get(r15) == false) goto L42;
        return true;
    L36:
        r17 = false;
        goto L38
    L17:
        return DW(r28, r29);
    L7:
        if ((r2 instanceof android.widget.EditText) == false) goto L10;
        return DW(r28, r29);
    L61:
        throw new java.lang.RuntimeException("Don't pass events when shouldHandleInputEvent is false");
    }

    public static boolean j6(android.view.InputEvent r0) {
        return !u7;
    }
}
