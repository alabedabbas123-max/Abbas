package com.appfour.backbone.api.objects;

@android.support.annotation.Keep
public class UserActionWindow {
    public static final int ACTIVITY_TYPE = 0;
    public static final int DIALOG_TYPE = 1;
    public static final int OVERLAY_TYPE = 3;
    public static final int POPUP_TYPE = 2;
    public static final int TOAST_TYPE = 4;
    private final android.app.Activity activity;
    private final int type;
    private final android.view.View windowView;

    public UserActionWindow(android.app.Activity r1, int r2, android.view.View r3) {
        this.activity = r1;
        this.type = r2;
        this.windowView = r3;
        com.appfour.backbone.api.Api.identifier(this);
    }

    public android.app.Activity getActivity() {
        return this.activity;
    }

    public android.content.Context getContext() {
        return this.windowView.getContext();
    }

    public int getHeight() {
        return this.windowView.getHeight();
    }

    public int getIMEHeight() {
        return com.appfour.backbone.api.runtime.b.j6().DW();
    }

    public int getType() {
        return this.type;
    }

    public int getWidth() {
        return this.windowView.getWidth();
    }

    public android.view.View getWindowView() {
        return this.windowView;
    }

    public java.lang.String toString() {
        return com.appfour.backbone.api.runtime.b.j6().DW(this);
    }
}
