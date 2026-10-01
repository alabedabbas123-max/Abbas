package com.appfour.backbone.api.define;

@android.support.annotation.Keep
public interface DefineOccurrences {
    com.appfour.backbone.api.define.DefineHook asEachOccurrenceOf();

    com.appfour.backbone.api.define.DefineHook asFirstOccurrenceOf();

    com.appfour.backbone.api.define.DefineHook asFirstOccurrencePerAppVersionOf();

    com.appfour.backbone.api.define.DefineHook asFirstOccurrencePerDayOf();

    com.appfour.backbone.api.define.DefineHook asFirstOccurrencePerMonthOf();

    com.appfour.backbone.api.define.DefineHook asFirstOccurrencePerWeekOf();
}
