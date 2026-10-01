package com.appfour.backbone.api.objects;

@android.support.annotation.Keep
public class UserNotification {
    private final android.content.Context context;
    private final java.util.Map<java.lang.String, java.lang.String> extras;
    private final java.lang.String group;
    private final int id;

    public UserNotification(android.content.Context r1, int r2, java.lang.String r3, java.util.Map<java.lang.String, java.lang.String> r4) {
        this.extras = r4;
        this.context = r1;
        this.id = r2;
        this.group = r3;
    }

    public boolean getBooleanExtra(java.lang.String r2) {
        return java.lang.Boolean.parseBoolean(this.extras.get(r2));
    }

    public java.util.Map<java.lang.String, java.lang.String> getExtras() {
        return this.extras;
    }

    public java.lang.String getGroup() {
        return this.group;
    }

    public int getId() {
        return this.id;
    }

    public int getIntExtra(java.lang.String r2) {
        return java.lang.Integer.parseInt(this.extras.get(r2));
    }

    public java.lang.String getStringExtra(java.lang.String r2) {
        return this.extras.get(r2);
    }

    public boolean hasExtra(java.lang.String r2) {
        return this.extras.containsKey(r2);
    }

    public java.lang.String toString() {
        return com.appfour.backbone.api.runtime.b.j6().DW(this);
    }
}
