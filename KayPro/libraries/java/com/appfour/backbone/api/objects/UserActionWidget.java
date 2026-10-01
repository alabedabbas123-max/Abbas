package com.appfour.backbone.api.objects;

@android.support.annotation.Keep
public class UserActionWidget {
    private final int itemPosition;
    private final android.view.View itemView;
    private final android.view.View view;

    public UserActionWidget(android.view.View r1, int r2, android.view.View r3) {
        this.view = r1;
        this.itemView = r3;
        this.itemPosition = r2;
    }

    public android.content.Context getContext() {
        return this.view.getContext();
    }

    public int getItemPosition() {
        return this.itemPosition;
    }

    public android.view.View getItemView() {
        return this.itemView;
    }

    public android.view.View getView() {
        return this.view;
    }

    public java.lang.String getViewIdText() {
        if (this.view != null) goto L7;
        return null;
    L7:
        return com.appfour.backbone.api.runtime.b.j6().j6(this.view);
    }

    public java.lang.String toString() {
        return com.appfour.backbone.api.runtime.b.j6().DW(this);
    }
}
