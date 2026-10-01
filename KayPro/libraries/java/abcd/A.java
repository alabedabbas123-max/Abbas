package abcd;

public class A {
    static final abcd.A.j j6 = null;
    private final android.view.accessibility.AccessibilityNodeInfo DW;
    public int FH;

    public static class a {
        public static final abcd.A.a BT = null;
        public static final abcd.A.a DW = null;
        public static final abcd.A.a EQ = null;
        public static final abcd.A.a FH = null;
        public static final abcd.A.a Hw = null;
        public static final abcd.A.a J0 = null;
        public static final abcd.A.a J8 = null;
        public static final abcd.A.a Mr = null;
        public static final abcd.A.a P8 = null;
        public static final abcd.A.a QX = null;
        public static final abcd.A.a U2 = null;
        public static final abcd.A.a VH = null;
        public static final abcd.A.a Ws = null;
        public static final abcd.A.a XL = null;
        public static final abcd.A.a Zo = null;
        public static final abcd.A.a a8 = null;
        public static final abcd.A.a aM = null;
        public static final abcd.A.a er = null;
        public static final abcd.A.a gW = null;
        public static final abcd.A.a gn = null;
        public static final abcd.A.a j3 = null;
        public static final abcd.A.a j6 = null;
        public static final abcd.A.a lg = null;
        public static final abcd.A.a rN = null;
        public static final abcd.A.a tp = null;
        public static final abcd.A.a u7 = null;
        public static final abcd.A.a v5 = null;
        public static final abcd.A.a vy = null;
        public static final abcd.A.a we = null;
        public static final abcd.A.a yS = null;
        final java.lang.Object ei;

        static {
            j6 = new abcd.A.a(1, null);
            DW = new abcd.A.a(2, null);
            FH = new abcd.A.a(4, null);
            Hw = new abcd.A.a(8, null);
            v5 = new abcd.A.a(16, null);
            Zo = new abcd.A.a(32, null);
            VH = new abcd.A.a(64, null);
            gn = new abcd.A.a(128, null);
            u7 = new abcd.A.a(256, null);
            tp = new abcd.A.a(512, null);
            EQ = new abcd.A.a(1024, null);
            we = new abcd.A.a(2048, null);
            J0 = new abcd.A.a(4096, null);
            J8 = new abcd.A.a(8192, null);
            Ws = new abcd.A.a(16384, null);
            QX = new abcd.A.a(32768, null);
            XL = new abcd.A.a(65536, null);
            aM = new abcd.A.a(131072, null);
            j3 = new abcd.A.a(262144, null);
            Mr = new abcd.A.a(524288, null);
            U2 = new abcd.A.a(1048576, null);
            a8 = new abcd.A.a(2097152, null);
            lg = new abcd.A.a(abcd.A.j6.gn());
            rN = new abcd.A.a(abcd.A.j6.v5());
            er = new abcd.A.a(abcd.A.j6.Zo());
            yS = new abcd.A.a(abcd.A.j6.FH());
            gW = new abcd.A.a(abcd.A.j6.DW());
            BT = new abcd.A.a(abcd.A.j6.Hw());
            vy = new abcd.A.a(abcd.A.j6.j6());
            P8 = new abcd.A.a(abcd.A.j6.VH());
        }

        public a(int r2, java.lang.CharSequence r3) {
            this(abcd.A.j6.j6(r2, r3));
        }

        a(java.lang.Object r1) {
            this.ei = r1;
        }
    }

    static class b extends abcd.A.j {
        b() {
        }

        @Override
        public void DW(android.view.accessibility.AccessibilityNodeInfo r1, boolean r2) {
            r1.setVisibleToUser(r2);
        }

        @Override
        public boolean FH(android.view.accessibility.AccessibilityNodeInfo r1) {
            return r1.isAccessibilityFocused();
        }

        @Override
        public boolean Hw(android.view.accessibility.AccessibilityNodeInfo r1) {
            return r1.isVisibleToUser();
        }

        @Override
        public int j6(android.view.accessibility.AccessibilityNodeInfo r1) {
            return r1.getMovementGranularities();
        }

        @Override
        public void j6(android.view.accessibility.AccessibilityNodeInfo r1, int r2) {
            r1.setMovementGranularities(r2);
        }

        @Override
        public void j6(android.view.accessibility.AccessibilityNodeInfo r1, boolean r2) {
            r1.setAccessibilityFocused(r2);
        }
    }

    static class c extends abcd.A.b {
        c() {
        }
    }

    static class d extends abcd.A.c {
        d() {
        }

        @Override
        public java.lang.String DW(android.view.accessibility.AccessibilityNodeInfo r1) {
            return r1.getViewIdResourceName();
        }
    }

    static class e extends abcd.A.d {
        e() {
        }
    }

    static class f extends abcd.A.e {
        f() {
        }

        @Override
        public java.lang.Object j6(int r2, java.lang.CharSequence r3) {
            return new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(r2, r3);
        }

        @Override
        public boolean j6(android.view.accessibility.AccessibilityNodeInfo r1, java.lang.Object r2) {
            return r1.removeAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r2);
        }
    }

    static class g extends abcd.A.f {
        g() {
        }
    }

    static class h extends abcd.A.g {
        h() {
        }

        @Override
        public java.lang.Object DW() {
            return android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
        }

        @Override
        public java.lang.Object FH() {
            return android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
        }

        @Override
        public java.lang.Object Hw() {
            return android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
        }

        @Override
        public java.lang.Object Zo() {
            return android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
        }

        @Override
        public java.lang.Object gn() {
            return android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
        }

        @Override
        public java.lang.Object j6() {
            return android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
        }

        @Override
        public java.lang.Object v5() {
            return android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
        }
    }

    static class i extends abcd.A.h {
        i() {
        }

        @Override
        public java.lang.Object VH() {
            return android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        }
    }

    static class j {
        j() {
        }

        public java.lang.Object DW() {
            return null;
        }

        public java.lang.String DW(android.view.accessibility.AccessibilityNodeInfo r1) {
            return null;
        }

        public void DW(android.view.accessibility.AccessibilityNodeInfo r1, boolean r2) {
        }

        public java.lang.Object FH() {
            return null;
        }

        public boolean FH(android.view.accessibility.AccessibilityNodeInfo r1) {
            return false;
        }

        public java.lang.Object Hw() {
            return null;
        }

        public boolean Hw(android.view.accessibility.AccessibilityNodeInfo r1) {
            return false;
        }

        public java.lang.Object VH() {
            return null;
        }

        public java.lang.Object Zo() {
            return null;
        }

        public java.lang.Object gn() {
            return null;
        }

        public int j6(android.view.accessibility.AccessibilityNodeInfo r1) {
            return 0;
        }

        public java.lang.Object j6() {
            return null;
        }

        public java.lang.Object j6(int r1, java.lang.CharSequence r2) {
            return null;
        }

        public void j6(android.view.accessibility.AccessibilityNodeInfo r1, int r2) {
        }

        public void j6(android.view.accessibility.AccessibilityNodeInfo r1, boolean r2) {
        }

        public boolean j6(android.view.accessibility.AccessibilityNodeInfo r1, java.lang.Object r2) {
            return false;
        }

        public java.lang.Object v5() {
            return null;
        }
    }

    static {
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = android.os.Build.VERSION.SDK_INT;
                    if (r0 < 24) { $pc0 = 6; continue $sw0; }
                    j6 = new abcd.A.i();
                    return;
                }
                case 6: {
                    if (r0 < 23) { $pc0 = 9; continue $sw0; }
                    j6 = new abcd.A.h();
                    return;
                }
                case 9: {
                    if (r0 < 22) { $pc0 = 12; continue $sw0; }
                    j6 = new abcd.A.g();
                    return;
                }
                case 12: {
                    if (r0 < 21) { $pc0 = 15; continue $sw0; }
                    j6 = new abcd.A.f();
                    return;
                }
                case 15: {
                    if (r0 < 19) { $pc0 = 18; continue $sw0; }
                    j6 = new abcd.A.e();
                    return;
                }
                case 18: {
                    if (r0 < 18) { $pc0 = 21; continue $sw0; }
                    j6 = new abcd.A.d();
                    return;
                }
                case 21: {
                    if (r0 < 17) { $pc0 = 24; continue $sw0; }
                    j6 = new abcd.A.c();
                    return;
                }
                case 24: {
                    if (r0 < 16) { $pc0 = 26; continue $sw0; }
                    j6 = new abcd.A.b();
                    return;
                }
                case 26: {
                    j6 = new abcd.A.j();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    private A(android.view.accessibility.AccessibilityNodeInfo r2) {
        this.FH = -1;
        this.DW = r2;
    }

    private static java.lang.String FH(int r1) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r1 != 1) { $pc1 = 5; continue $sw1; }
                    return "ACTION_FOCUS";
                }
                case 5: {
                    if (r1 == 2) { $pc1 = 41; continue $sw1; }
                    switch(r1) {
                        case 4: { $pc1 = 39; continue $sw1; }
                        case 8: { $pc1 = 37; continue $sw1; }
                        case 16: { $pc1 = 35; continue $sw1; }
                        case 32: { $pc1 = 33; continue $sw1; }
                        case 64: { $pc1 = 31; continue $sw1; }
                        case 128: { $pc1 = 29; continue $sw1; }
                        case 256: { $pc1 = 27; continue $sw1; }
                        case 512: { $pc1 = 25; continue $sw1; }
                        case 1024: { $pc1 = 23; continue $sw1; }
                        case 2048: { $pc1 = 21; continue $sw1; }
                        case 4096: { $pc1 = 19; continue $sw1; }
                        case 8192: { $pc1 = 17; continue $sw1; }
                        case 16384: { $pc1 = 15; continue $sw1; }
                        case 32768: { $pc1 = 13; continue $sw1; }
                        case 65536: { $pc1 = 11; continue $sw1; }
                        case 131072: { $pc1 = 9; continue $sw1; }
                        default: { $pc1 = 7; continue $sw1; }
                    };
                }
                case 7: {
                    return "ACTION_UNKNOWN";
                }
                case 9: {
                    return "ACTION_SET_SELECTION";
                }
                case 11: {
                    return "ACTION_CUT";
                }
                case 13: {
                    return "ACTION_PASTE";
                }
                case 15: {
                    return "ACTION_COPY";
                }
                case 17: {
                    return "ACTION_SCROLL_BACKWARD";
                }
                case 19: {
                    return "ACTION_SCROLL_FORWARD";
                }
                case 21: {
                    return "ACTION_PREVIOUS_HTML_ELEMENT";
                }
                case 23: {
                    return "ACTION_NEXT_HTML_ELEMENT";
                }
                case 25: {
                    return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                }
                case 27: {
                    return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                }
                case 29: {
                    return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                }
                case 31: {
                    return "ACTION_ACCESSIBILITY_FOCUS";
                }
                case 33: {
                    return "ACTION_LONG_CLICK";
                }
                case 35: {
                    return "ACTION_CLICK";
                }
                case 37: {
                    return "ACTION_CLEAR_SELECTION";
                }
                case 39: {
                    return "ACTION_SELECT";
                }
                case 41: {
                    return "ACTION_CLEAR_FOCUS";
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static abcd.A j6(abcd.A r0) {
        return j6(android.view.accessibility.AccessibilityNodeInfo.obtain(r0.DW));
    }

    public static abcd.A j6(android.view.accessibility.AccessibilityNodeInfo r1) {
        return new abcd.A(r1);
    }

    public java.lang.CharSequence DW() {
        return this.DW.getClassName();
    }

    public void DW(int r3) {
        j6.j6(this.DW, r3);
    }

    public void DW(android.graphics.Rect r2) {
        this.DW.getBoundsInScreen(r2);
    }

    public void DW(android.view.View r2) {
        this.DW.setParent(r2);
    }

    public void DW(java.lang.CharSequence r2) {
        this.DW.setContentDescription(r2);
    }

    public void DW(boolean r2) {
        this.DW.setClickable(r2);
    }

    public boolean EQ() {
        return this.DW.isClickable();
    }

    public java.lang.CharSequence FH() {
        return this.DW.getContentDescription();
    }

    public void FH(android.graphics.Rect r2) {
        this.DW.setBoundsInParent(r2);
    }

    public void FH(android.view.View r2) {
        this.DW.setSource(r2);
    }

    public void FH(java.lang.CharSequence r2) {
        this.DW.setPackageName(r2);
    }

    public void FH(boolean r2) {
        this.DW.setEnabled(r2);
    }

    public int Hw() {
        return j6.j6(this.DW);
    }

    public void Hw(android.graphics.Rect r2) {
        this.DW.setBoundsInScreen(r2);
    }

    public void Hw(boolean r2) {
        this.DW.setFocusable(r2);
    }

    public boolean J0() {
        return this.DW.isFocusable();
    }

    public boolean J8() {
        return this.DW.isFocused();
    }

    public void Mr() {
        this.DW.recycle();
    }

    public boolean QX() {
        return this.DW.isPassword();
    }

    public android.view.accessibility.AccessibilityNodeInfo U2() {
        return this.DW;
    }

    public java.lang.String VH() {
        return j6.DW(this.DW);
    }

    public void VH(boolean r2) {
        this.DW.setScrollable(r2);
    }

    public boolean Ws() {
        return this.DW.isLongClickable();
    }

    public boolean XL() {
        return this.DW.isScrollable();
    }

    public java.lang.CharSequence Zo() {
        return this.DW.getText();
    }

    public void Zo(boolean r2) {
        this.DW.setLongClickable(r2);
    }

    public boolean aM() {
        return this.DW.isSelected();
    }

    public boolean equals(java.lang.Object r5) {
        abcd.A r6 = null;
        android.view.accessibility.AccessibilityNodeInfo r2 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    if (this != r5) { $pc2 = 6; continue $sw2; }
                    return true;
                }
                case 6: {
                    if (r5 != null) { $pc2 = 9; continue $sw2; }
                    return false;
                }
                case 9: {
                    if (abcd.A.class == r5.getClass()) { $pc2 = 11; continue $sw2; }
                    return false;
                }
                case 11: {
                    r6 = (abcd.A) r5;
                    r2 = this.DW;
                    if (r2 != null) { $pc2 = 17; continue $sw2; }
                    if (r6.DW == null) { $pc2 = 19; continue $sw2; }
                    return false;
                }
                case 19: {
                    return true;
                }
                case 17: {
                    if (r2.equals(r6.DW) == true) { $pc2 = 19; continue $sw2; }
                    return false;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public void gn(boolean r2) {
        this.DW.setSelected(r2);
    }

    public boolean gn() {
        return j6.FH(this.DW);
    }

    public int hashCode() {
        android.view.accessibility.AccessibilityNodeInfo r0 = null;
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    r0 = this.DW;
                    if (r0 != null) { $pc3 = 6; continue $sw3; }
                    return 0;
                }
                case 6: {
                    return r0.hashCode();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean j3() {
        return j6.Hw(this.DW);
    }

    public int j6() {
        return this.DW.getActions();
    }

    public void j6(int r2) {
        this.DW.addAction(r2);
    }

    public void j6(android.graphics.Rect r2) {
        this.DW.getBoundsInParent(r2);
    }

    public void j6(android.view.View r2) {
        this.DW.addChild(r2);
    }

    public void j6(java.lang.CharSequence r2) {
        this.DW.setClassName(r2);
    }

    public void j6(boolean r3) {
        j6.j6(this.DW, r3);
    }

    public boolean j6(abcd.A.a r3) {
        return j6.j6(this.DW, r3.ei);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder r0 = null;
        android.graphics.Rect r1 = null;
        int r2 = 0;
        int r3 = 0;
        java.lang.Throwable $ex4 = null;
        int $pc4 = -1;
        $sw4: while (true) {
            switch ($pc4) {
                case -1: {
                    r0 = new java.lang.StringBuilder();
                    r0.append(super.toString());
                    r1 = new android.graphics.Rect();
                    j6(r1);
                    r0.append("; boundsInParent: " + r1);
                    DW(r1);
                    r0.append("; boundsInScreen: " + r1);
                    r0.append("; packageName: ");
                    r0.append(v5());
                    r0.append("; className: ");
                    r0.append(DW());
                    r0.append("; text: ");
                    r0.append(Zo());
                    r0.append("; contentDescription: ");
                    r0.append(FH());
                    r0.append("; viewId: ");
                    r0.append(VH());
                    r0.append("; checkable: ");
                    r0.append(u7());
                    r0.append("; checked: ");
                    r0.append(tp());
                    r0.append("; focusable: ");
                    r0.append(J0());
                    r0.append("; focused: ");
                    r0.append(J8());
                    r0.append("; selected: ");
                    r0.append(aM());
                    r0.append("; clickable: ");
                    r0.append(EQ());
                    r0.append("; longClickable: ");
                    r0.append(Ws());
                    r0.append("; enabled: ");
                    r0.append(we());
                    r0.append("; password: ");
                    r0.append(QX());
                    r0.append("; scrollable: " + XL());
                    r0.append("; [");
                    r2 = j6();
                    $pc4 = 3; continue $sw4;
                }
                case 3: {
                    if (r2 == 0) { $pc4 = 7; continue $sw4; }
                    r3 = 1 << java.lang.Integer.numberOfTrailingZeros(r2);
                    r2 = r2 & (r3 ^ (-1));
                    r0.append(FH(r3));
                    if (r2 == 0) { $pc4 = 3; continue $sw4; }
                    r0.append(", ");
                    { $pc4 = 3; continue $sw4; }
                }
                case 7: {
                    r0.append("]");
                    return r0.toString();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public boolean tp() {
        return this.DW.isChecked();
    }

    public void u7(boolean r3) {
        j6.DW(this.DW, r3);
    }

    public boolean u7() {
        return this.DW.isCheckable();
    }

    public java.lang.CharSequence v5() {
        return this.DW.getPackageName();
    }

    public void v5(boolean r2) {
        this.DW.setFocused(r2);
    }

    public boolean we() {
        return this.DW.isEnabled();
    }
}
