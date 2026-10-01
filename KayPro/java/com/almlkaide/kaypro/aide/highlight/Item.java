package com.almlkaide.kaypro.aide.highlight;

import java.util.Locale;

public class Item {
    private String defaultColor;
    private String title;
    private String type;

    public Item(String str, String str2, String str3) {
        this.title = str;
        this.type = str2;
        this.defaultColor = str3;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getType() {
        return this.type;
    }

    public String getColor(boolean z) {
        return HighlightUtils.getHSp().getString(HighlightUtils.getSpKey(getType(), z), getDefaultColor()).toUpperCase(Locale.ENGLISH);
    }

    public void setDefaultColor(String str) {
        this.defaultColor = str;
    }

    public String getDefaultColor() {
        return this.defaultColor;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getTitle() {
        return this.title;
    }

    public String getSpKey(boolean z) {
        return HighlightUtils.getSpKey(getType(), z);
    }
}
