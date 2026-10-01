package com.appfour.backbone.api.define;

@android.support.annotation.Keep
public interface DefineAnalytics {
    com.appfour.backbone.api.define.DefineOccurrences defineEvent(java.lang.String r1);

    void onDefineEventError(java.lang.Throwable r1);

    void undefineEvent(java.lang.String r1);
}
