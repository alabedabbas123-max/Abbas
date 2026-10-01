package com.appfour.backbone.api.objects;

@android.support.annotation.Keep
public interface EventData {
    com.appfour.backbone.api.objects.EventData setCrash(java.lang.Throwable r1, boolean r2);

    com.appfour.backbone.api.objects.EventData setIsInstall(boolean r1);

    com.appfour.backbone.api.objects.EventData setIsProperty(boolean r1);

    com.appfour.backbone.api.objects.EventData setIsScreenView(boolean r1);

    com.appfour.backbone.api.objects.EventData setIsUserActive(boolean r1);

    com.appfour.backbone.api.objects.EventData setOutcome(long r1, java.lang.CharSequence r3);

    com.appfour.backbone.api.objects.EventData setOutcome(boolean r1);

    com.appfour.backbone.api.objects.EventData setParameter(java.lang.String r1, com.appfour.backbone.api.objects.CatchExceptions<?> r2);

    com.appfour.backbone.api.objects.EventData setParameter(java.lang.String r1, java.lang.Object r2);

    com.appfour.backbone.api.objects.EventData setParameterAnonymous(java.lang.String r1, com.appfour.backbone.api.objects.CatchExceptions<?> r2);

    com.appfour.backbone.api.objects.EventData setParameterAnonymous(java.lang.String r1, java.lang.Object r2);

    com.appfour.backbone.api.objects.EventData setUIScene(java.lang.Object r1);

    com.appfour.backbone.api.objects.EventData setValue(com.appfour.backbone.api.objects.CatchExceptions<?> r1);

    com.appfour.backbone.api.objects.EventData setValue(java.lang.Object r1);

    com.appfour.backbone.api.objects.EventData setValueAnonymous(com.appfour.backbone.api.objects.CatchExceptions<?> r1);

    com.appfour.backbone.api.objects.EventData setValueAnonymous(java.lang.Object r1);
}
