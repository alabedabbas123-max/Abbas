package abcd;

public class zw {
    public static android.graphics.Rect j6() {
        if (android.os.Build.VERSION.SDK_INT < 17) goto L7;
        android.graphics.Point r0 = new android.graphics.Point();
        ((android.view.WindowManager) abcd.wu.j6().getSystemService("window")).getDefaultDisplay().getRealSize(r0);
        return new android.graphics.Rect(0, 0, r0.x, r0.y);
    L7:
        return new android.graphics.Rect(0, 0, abcd.wu.j6().getResources().getDisplayMetrics().widthPixels, abcd.wu.j6().getResources().getDisplayMetrics().heightPixels);
    }

    public static android.graphics.Rect j6(android.app.Activity r0) {
        if (r0 != null) goto L6;
        return new android.graphics.Rect();
    L6:
        return j6(r0.getWindow().getDecorView());
    }

    public static android.graphics.Rect j6(android.view.View r4) {
        int[] r0 = new int[2];
        r4.getLocationOnScreen(r0);
        int r1 = r0[0];
        int r2 = r0[1];
        android.graphics.Rect r3 = new android.graphics.Rect(r1, r2, r4.getWidth() + r1, r4.getHeight() + r2);
        if (r3.intersect(j6()) == false) goto L6;
        return r3;
    L6:
        return new android.graphics.Rect();
    }

    public static android.graphics.Rect j6(com.appfour.backbone.api.objects.UserActionWidget r1) {
        if (r1 != null) goto L6;
        return new android.graphics.Rect();
    L6:
        if (r1.getItemView() == null) goto L10;
        return j6(r1.getItemView());
    L10:
        return j6(r1.getView());
    }

    public static android.graphics.Rect j6(com.appfour.backbone.api.objects.UserActionWindow r0) {
        return j6(r0.getWindowView());
    }
}
