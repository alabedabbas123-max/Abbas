package com.appfour.backbone.api.objects;

@android.support.annotation.Keep
public class UISceneWidget {
    public boolean fill;
    public int height;
    public java.lang.CharSequence text;
    public boolean textAlignTop;
    public int width;
    public int x;
    public int y;

    public UISceneWidget(android.graphics.Rect r2, boolean r3, java.lang.CharSequence r4, boolean r5) {
        this.x = r2.left;
        this.y = r2.top;
        this.width = r2.width();
        this.height = r2.height();
        this.fill = r3;
        this.text = r4;
        this.textAlignTop = r5;
    }
}
