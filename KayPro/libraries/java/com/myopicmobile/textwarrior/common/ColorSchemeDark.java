package com.myopicmobile.textwarrior.common;

public class ColorSchemeDark extends ColorScheme {
    private static final int BEIGE = -2639235;
    private static final int DARK_GREY = -10461088;
    private static final int FLUORESCENT_YELLOW = -1052269;
    private static final int JUNGLE_GREEN = -10450098;
    private static final int LIGHT_GREY = -2894893;
    private static final int MARINE = -11100970;
    private static final int OCEAN_BLUE = -14326891;
    private static final int OFF_BLACK = -16514044;
    private static final int OFF_WHITE = -3091757;
    private static final int PEACH = -2712187;

    public ColorSchemeDark() {
        setColor(ColorScheme.Colorable.FOREGROUND, OFF_WHITE);
        setColor(ColorScheme.Colorable.BACKGROUND, OFF_BLACK);
        setColor(ColorScheme.Colorable.NON_PRINTING_GLYPH, DARK_GREY);
    }

    @Override
    public boolean isDark() {
        return true;
    }
}
