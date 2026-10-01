package com.appfour.backbone.api.objects;

@android.support.annotation.Keep
public class UIScene {
    public int deviceHeight;
    public int deviceWidth;
    public int imeHeight;
    public boolean pressedBackKey;
    public boolean pressedKey;
    public int touchX;
    public int touchX2;
    public int touchY;
    public int touchY2;
    public com.appfour.backbone.api.objects.UISceneWidget[] widgets;

    public UIScene(int r1, int r2, int r3, boolean r4, boolean r5, int r6, int r7, int r8, int r9, com.appfour.backbone.api.objects.UISceneWidget... r10) {
        this.deviceWidth = r1;
        this.deviceHeight = r2;
        this.imeHeight = r3;
        this.pressedBackKey = r4;
        this.pressedKey = r5;
        this.touchX = r6;
        this.touchY = r7;
        this.touchX2 = r8;
        this.touchY2 = r9;
        java.util.ArrayList r11 = new java.util.ArrayList();
        int r12 = 0;
    L4:
        if (r12 >= r10.length) goto L13;
        com.appfour.backbone.api.objects.UISceneWidget r13 = r10[r12];
        if (r13 == null) goto L12;
        if (r13.width <= 0) goto L12;
        if (r13.height <= 0) goto L12;
        r11.add(r13);
    L12:
        r12 = r12 + 1;
        goto L4
    L13:
        this.widgets = (com.appfour.backbone.api.objects.UISceneWidget[]) r11.toArray(new com.appfour.backbone.api.objects.UISceneWidget[r11.size()]);
    }
}
