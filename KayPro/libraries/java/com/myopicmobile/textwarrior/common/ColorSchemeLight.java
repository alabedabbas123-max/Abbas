package com.myopicmobile.textwarrior.common;

public class ColorSchemeLight extends ColorScheme {
    private static final int OFF_BLACK = -13421773;
    private static final int OFF_WHITE = -986899;

    public ColorSchemeLight() {
        setColor(ColorScheme.Colorable.FOREGROUND, OFF_BLACK);
        setColor(ColorScheme.Colorable.BACKGROUND, -1);
        setColor(ColorScheme.Colorable.SELECTION_FOREGROUND, OFF_WHITE);
        setColor(ColorScheme.Colorable.CARET_FOREGROUND, OFF_WHITE);
    }

    @Override
    public boolean isDark() {
        return false;
    }
}
