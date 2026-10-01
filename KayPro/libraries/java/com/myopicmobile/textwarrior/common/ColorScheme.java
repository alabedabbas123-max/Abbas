package com.myopicmobile.textwarrior.common;

import java.util.HashMap;

public abstract class ColorScheme {
    private static final int BLACK = -16777216;
    private static final int BLUE = -16776961;
    private static final int DARK_BLUE = -3129123;
    private static final int DARK_RED = -7667712;
    private static final int GREEN = -7820664;
    private static final int GREY = -8355712;
    private static final int INDIGO = -14008065;
    private static final int LIGHT_BLUE = -10452737;
    private static final int LIGHT_BLUE2 = -12537601;
    private static final int LIGHT_GREY = -5592406;
    private static final int MAROON = -8388608;
    private static final int OLIVE_GREEN = -12615841;
    private static final int PURPLE = -2276216;
    private static final int PURPLE2 = -65281;

    private static final int f4830RED = 1157562368;
    private static final int WHITE = -32;
    protected HashMap<Colorable, Integer> _colors = generateDefaultColors();

    public enum Colorable {
        FOREGROUND,
        BACKGROUND,
        SELECTION_FOREGROUND,
        SELECTION_BACKGROUND,
        CARET_FOREGROUND,
        CARET_BACKGROUND,
        CARET_DISABLED,
        LINE_HIGHLIGHT,
        NON_PRINTING_GLYPH,
        COMMENT,
        KEYWORD,
        NAME,
        LITERAL,
        STRING,
        SECONDARY;

        public static Colorable valueOf(String str) {
            for (Colorable colorable : values()) {
                if (colorable.name().equals(str)) {
                    return colorable;
                }
            }
            throw new IllegalArgumentException();
        }
    }

    private HashMap<Colorable, Integer> generateDefaultColors() {
        HashMap<Colorable, Integer> map = new HashMap<>(Colorable.values().length);
        map.put(Colorable.FOREGROUND, new Integer(-16777216));
        map.put(Colorable.BACKGROUND, new Integer(-32));
        map.put(Colorable.SELECTION_FOREGROUND, new Integer(-32));
        map.put(Colorable.SELECTION_BACKGROUND, new Integer(-6832092));
        map.put(Colorable.CARET_FOREGROUND, new Integer(-32));
        map.put(Colorable.CARET_BACKGROUND, new Integer(LIGHT_BLUE2));
        map.put(Colorable.CARET_DISABLED, new Integer(-8355712));
        map.put(Colorable.LINE_HIGHLIGHT, new Integer(545818760));
        map.put(Colorable.NON_PRINTING_GLYPH, new Integer(LIGHT_GREY));
        map.put(Colorable.COMMENT, new Integer(OLIVE_GREEN));
        map.put(Colorable.KEYWORD, new Integer(DARK_BLUE));
        map.put(Colorable.NAME, new Integer(INDIGO));
        map.put(Colorable.LITERAL, new Integer(LIGHT_BLUE));
        map.put(Colorable.STRING, new Integer(PURPLE));
        map.put(Colorable.SECONDARY, new Integer(-8355712));
        return map;
    }

    public int getColor(Colorable colorable) {
        Integer num = this._colors.get(colorable);
        if (num != null) {
            return num.intValue();
        }
        TextWarriorException.fail(new StringBuffer().append("Color not specified for ").append(colorable).toString());
        return 0;
    }

    public int getTokenColor(int i) {
        Colorable colorable;
        switch (i) {
            case 0:
                colorable = Colorable.FOREGROUND;
                break;
            case 1:
                colorable = Colorable.KEYWORD;
                break;
            case 2:
            case 10:
            case 20:
                colorable = Colorable.SECONDARY;
                break;
            case 3:
                colorable = Colorable.NAME;
                break;
            case 4:
                colorable = Colorable.LITERAL;
                break;
            case 21:
            case 30:
            case 40:
                colorable = Colorable.COMMENT;
                break;
            case 50:
            case 51:
                colorable = Colorable.STRING;
                break;
            default:
                TextWarriorException.fail("Invalid token type");
                colorable = Colorable.FOREGROUND;
                break;
        }
        return getColor(colorable);
    }

    public abstract boolean isDark();

    public void setColor(Colorable colorable, int i) {
        this._colors.put(colorable, new Integer(i));
    }
}
