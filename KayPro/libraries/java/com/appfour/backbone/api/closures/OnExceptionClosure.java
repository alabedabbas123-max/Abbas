package com.appfour.backbone.api.closures;

@android.support.annotation.Keep
@java.lang.FunctionalInterface
public interface OnExceptionClosure<C, E extends java.lang.Throwable> {
    com.appfour.backbone.api.objects.EventData getValue(C r1, E r2, java.lang.Object... r3);
}
