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
        int r0 = 0;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    r0 = android.os.Build.VERSION.SDK_INT;
                    if (r0 < 16) { $pc0 = 6; continue $sw0; }
                    j6 = new abcd.C.b();
                    return;
                }
                case 6: {
                    if (r0 < 15) { $pc0 = 8; continue $sw0; }
                    j6 = new abcd.C.a();
                    return;
                }
                case 8: {
                    j6 = new abcd.C.c();
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static void DW(android.view.accessibility.AccessibilityRecord r1, int r2) {
        j6.DW(r1, r2);
    }

    public static void j6(android.view.accessibility.AccessibilityRecord r1, int r2) {
        j6.j6(r1, r2);
    }
}
