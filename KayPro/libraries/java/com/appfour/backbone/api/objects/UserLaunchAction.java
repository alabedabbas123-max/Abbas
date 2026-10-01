package com.appfour.backbone.api.objects;

@android.support.annotation.Keep
public class UserLaunchAction {
    private final android.app.Activity activity;

    public UserLaunchAction(android.app.Activity r1) {
        this.activity = r1;
    }

    public android.app.Activity getActivity() {
        return this.activity;
    }
}
