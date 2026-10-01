package com.appfour.backbone.api.objects;

@android.support.annotation.Keep
public class UserTouchAction {
    public static final int CLICK_KIND = 7;
    public static final int ITEM_CLICK_KIND = 6;
    public static final int ITEM_LONG_PRESS_KIND = 3;
    public static final int LONG_PRESS_KIND = 4;
    public static final int LONG_TAP_KIND = 2;
    public static final int MENU_ITEM_SELECT_KIND = 5;
    public static final int SWIPE_KIND = 1;
    public static final int TAP_KIND = 0;
    private final int kind;
    private final com.appfour.backbone.api.objects.UserActionWidget widget;
    private final com.appfour.backbone.api.objects.UserActionWindow window;
    private final int x1;
    private final int x2;
    private final int y1;
    private final int y2;

    public UserTouchAction(com.appfour.backbone.api.objects.UserActionWindow r1, com.appfour.backbone.api.objects.UserActionWidget r2, int r3, int r4, int r5, int r6, int r7) {
        this.window = r1;
        this.kind = r3;
        this.x1 = r4;
        this.y1 = r5;
        this.x2 = r6;
        this.y2 = r7;
        this.widget = r2;
    }

    public android.app.Activity getActivity() {
        return this.window.getActivity();
    }

    public java.lang.Class<?> getActivityClass() {
        if (getActivity() != null) goto L7;
        return null;
    L7:
        return getActivity().getClass();
    }

    public int getKind() {
        return this.kind;
    }

    public java.lang.String getViewIdText() {
        com.appfour.backbone.api.objects.UserActionWidget r0 = this.widget;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.getViewIdText();
    }

    public com.appfour.backbone.api.objects.UserActionWidget getWidget() {
        return this.widget;
    }

    public com.appfour.backbone.api.objects.UserActionWindow getWindow() {
        return this.window;
    }

    public int getX1() {
        return this.x1;
    }

    public int getX2() {
        return this.x2;
    }

    public int getY1() {
        return this.y1;
    }

    public int getY2() {
        return this.y2;
    }

    public java.lang.String toString() {
        return com.appfour.backbone.api.runtime.b.j6().DW(this);
    }
}
