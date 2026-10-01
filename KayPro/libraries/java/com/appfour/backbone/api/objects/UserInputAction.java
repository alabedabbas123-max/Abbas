package com.appfour.backbone.api.objects;

@android.support.annotation.Keep
public class UserInputAction {
    private final boolean isBackKey;
    private final com.appfour.backbone.api.objects.UserActionWindow window;

    public UserInputAction(com.appfour.backbone.api.objects.UserActionWindow r1, boolean r2) {
        this.window = r1;
        this.isBackKey = r2;
    }

    public android.app.Activity getActivity() {
        return this.window.getActivity();
    }

    public com.appfour.backbone.api.objects.UserActionWindow getWindow() {
        return this.window;
    }

    public boolean isBackKey() {
        return this.isBackKey;
    }

    public java.lang.String toString() {
        return com.appfour.backbone.api.runtime.b.j6().DW(this);
    }
}
