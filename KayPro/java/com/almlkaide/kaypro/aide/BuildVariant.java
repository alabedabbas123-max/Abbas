package com.almlkaide.kaypro.aide;

import com.almlkaide.kaypro.aide.application.App;

@Deprecated
public enum BuildVariant {
    DEBUG,
    RELEASE,
    UNKNOWN;

    public static BuildVariant valueOf(String str) {
        for (BuildVariant buildVariant : values()) {
            if (buildVariant.name().equals(str)) {
                return buildVariant;
            }
        }
        throw new IllegalArgumentException();
    }

    public static BuildVariant getBuildVariant(String str) {
        String string = App.getApp().getSharedPreferences("ProjectService", 0).getString("BuildVariant_".concat(str), "");
        if ("release".endsWith(string) || string.endsWith(" release")) {
            return RELEASE;
        }
        if ("debug".endsWith(string) || string.endsWith(" debug")) {
            return DEBUG;
        }
        return UNKNOWN;
    }
}
