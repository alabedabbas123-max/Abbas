package com.appfour.backbone.api.closures;

@android.support.annotation.Keep
@java.lang.FunctionalInterface
public interface OnItemClickClosure<A extends android.app.Activity> {
    com.appfour.backbone.api.objects.EventData getValue(A r1, android.view.View r2, java.lang.Object r3, int r4, android.view.View r5);
}
