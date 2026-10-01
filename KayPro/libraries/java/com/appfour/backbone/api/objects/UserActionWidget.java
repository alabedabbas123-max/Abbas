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
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    if (this.view != null) { $pc0 = 7; continue $sw0; }
                    return null;
                }
                case 7: {
                    return com.appfour.backbone.api.runtime.b.j6().j6(this.view);
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }

    public java.lang.String toString() {
        return com.appfour.backbone.api.runtime.b.j6().DW(this);
    }
}
