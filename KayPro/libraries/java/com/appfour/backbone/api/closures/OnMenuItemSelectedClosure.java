package com.appfour.backbone.api.closures;

@android.support.annotation.Keep
@java.lang.FunctionalInterface
public interface OnMenuItemSelectedClosure<A extends android.app.Activity> {
    com.appfour.backbone.api.objects.EventData getValue(A r1, android.view.MenuItem r2);
}
