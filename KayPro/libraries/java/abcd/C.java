package abcd;

public class C {
    private static final abcd.C.c j6 = null;

    static class a extends abcd.C.c {
        a() {
        }

        @Override
        public void DW(android.view.accessibility.AccessibilityRecord r1, int r2) {
            r1.setMaxScrollY(r2);
        }

        @Override
        public void j6(android.view.accessibility.AccessibilityRecord r1, int r2) {
            r1.setMaxScrollX(r2);
        }
    }

    static class b extends abcd.C.a {
        b() {
        }
    }

    static class c {
        c() {
        }

        public void DW(android.view.accessibility.AccessibilityRecord r1, int r2) {
        }

        public void j6(android.view.accessibility.AccessibilityRecord r1, int r2) {
        }
    }

    static {
        int r0 = android.os.Build.VERSION.SDK_INT;
        if (r0 < 16) goto L6;
        j6 = new abcd.C.b();
        return;
    L6:
        if (r0 < 15) goto L8;
        j6 = new abcd.C.a();
        return;
    L8:
        j6 = new abcd.C.c();
    }

    public static void DW(android.view.accessibility.AccessibilityRecord r1, int r2) {
        j6.DW(r1, r2);
    }

    public static void j6(android.view.accessibility.AccessibilityRecord r1, int r2) {
        j6.j6(r1, r2);
    }
}
