package abcd;

public class zw {
    public static android.graphics.Rect j6() {
        android.graphics.Point r0 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (android.os.Build.VERSION.SDK_INT < 17) { $pc0 = 7; continue $sw0; }
                    r0 = new android.graphics.Point();
                    ((android.view.WindowManager) abcd.wu.j6().getSystemService("window")).getDefaultDisplay().getRealSize(r0);
                    return new android.graphics.Rect(0, 0, r0.x, r0.y);
                }
                case 7: {
                    return new android.graphics.Rect(0, 0, abcd.wu.j6().getResources().getDisplayMetrics().widthPixels, abcd.wu.j6().getResources().getDisplayMetrics().heightPixels);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static android.graphics.Rect j6(android.app.Activity r0) {
        java.lang.Throwable $ex1 = null;
        int $pc1 = -1;
        $sw1: while (true) {
            switch ($pc1) {
                case -1: {
                    if (r0 != null) { $pc1 = 6; continue $sw1; }
                    return new android.graphics.Rect();
                }
                case 6: {
                    return j6(r0.getWindow().getDecorView());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static android.graphics.Rect j6(android.view.View r4) {
        int[] r0 = null;
        int r1 = 0;
        int r2 = 0;
        android.graphics.Rect r3 = null;
        java.lang.Throwable $ex2 = null;
        int $pc2 = -1;
        $sw2: while (true) {
            switch ($pc2) {
                case -1: {
                    r0 = new int[2];
                    r4.getLocationOnScreen(r0);
                    r1 = r0[0];
                    r2 = r0[1];
                    r3 = new android.graphics.Rect(r1, r2, r4.getWidth() + r1, r4.getHeight() + r2);
                    if (r3.intersect(j6()) == false) { $pc2 = 6; continue $sw2; }
                    return r3;
                }
                case 6: {
                    return new android.graphics.Rect();
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static android.graphics.Rect j6(com.appfour.backbone.api.objects.UserActionWidget r1) {
        java.lang.Throwable $ex3 = null;
        int $pc3 = -1;
        $sw3: while (true) {
            switch ($pc3) {
                case -1: {
                    if (r1 != null) { $pc3 = 6; continue $sw3; }
                    return new android.graphics.Rect();
                }
                case 6: {
                    if (r1.getItemView() == null) { $pc3 = 10; continue $sw3; }
                    return j6(r1.getItemView());
                }
                case 10: {
                    return j6(r1.getView());
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public static android.graphics.Rect j6(com.appfour.backbone.api.objects.UserActionWindow r0) {
        return j6(r0.getWindowView());
    }
}
