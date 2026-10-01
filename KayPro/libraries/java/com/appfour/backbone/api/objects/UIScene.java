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
        java.util.ArrayList r11 = null;
        int r12 = 0;
        com.appfour.backbone.api.objects.UISceneWidget r13 = null;
        java.lang.Throwable $ex0 = null;
        int $pc0 = -1;
        $sw0: while (true) {
            switch ($pc0) {
                case -1: {
                    this.deviceWidth = r1;
                    this.deviceHeight = r2;
                    this.imeHeight = r3;
                    this.pressedBackKey = r4;
                    this.pressedKey = r5;
                    this.touchX = r6;
                    this.touchY = r7;
                    this.touchX2 = r8;
                    this.touchY2 = r9;
                    r11 = new java.util.ArrayList();
                    r12 = 0;
                    $pc0 = 4; continue $sw0;
                }
                case 4: {
                    if (r12 >= r10.length) { $pc0 = 13; continue $sw0; }
                    r13 = r10[r12];
                    if (r13 == null) { $pc0 = 12; continue $sw0; }
                    if (r13.width <= 0) { $pc0 = 12; continue $sw0; }
                    if (r13.height <= 0) { $pc0 = 12; continue $sw0; }
                    r11.add(r13);
                    $pc0 = 12; continue $sw0;
                }
                case 12: {
                    r12 = r12 + 1;
                    { $pc0 = 4; continue $sw0; }
                }
                case 13: {
                    this.widgets = (com.appfour.backbone.api.objects.UISceneWidget[]) r11.toArray(new com.appfour.backbone.api.objects.UISceneWidget[r11.size()]);
                    return;
                }
                default: throw new java.lang.IllegalStateException();
            }
        }
    }
}
