package com.appfour.backbone.api.objects;

@android.support.annotation.Keep
public class UserNotificationAction {
    public static final java.lang.String CONTENT_ACTION_NAME = "__CONTENT";
    public static final java.lang.String DELETE_ACTION_NAME = "__DELETE";
    private final android.app.Activity activity;
    private final java.lang.String name;
    private final com.appfour.backbone.api.objects.UserNotification notification;

    public UserNotificationAction(com.appfour.backbone.api.objects.UserNotification r1, android.app.Activity r2, java.lang.String r3) {
        this.notification = r1;
        this.name = r3;
        this.activity = r2;
    }

    public android.app.Activity getActivity() {
        return this.activity;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public com.appfour.backbone.api.objects.UserNotification getNotification() {
        return this.notification;
    }

    public java.lang.String toString() {
        return com.appfour.backbone.api.runtime.b.j6().DW(this);
    }
}
