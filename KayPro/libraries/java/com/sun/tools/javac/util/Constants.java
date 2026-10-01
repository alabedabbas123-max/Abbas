package com.sun.tools.javac.util;

import com.sun.tools.javac.code.Type;

public class Constants {
    public static Object decode(Object value, Type type) {
        if (value instanceof Integer) {
            int i = ((Integer) value).intValue();
            int i2 = type.f344tag;
            if (i2 == 1) {
                return Byte.valueOf((byte) i);
            }
            if (i2 == 2) {
                return Character.valueOf((char) i);
            }
            if (i2 == 3) {
                return Short.valueOf((short) i);
            }
            if (i2 == 8) {
                return Boolean.valueOf(i != 0);
            }
        }
        return value;
    }

    public static String format(Object value, Type type) {
        Object value2 = decode(value, type);
        int i = type.f344tag;
        if (i == 1) {
            return formatByte(((Byte) value2).byteValue());
        }
        if (i == 2) {
            return formatChar(((Character) value2).charValue());
        }
        if (i == 5) {
            return formatLong(((Long) value2).longValue());
        }
        if (i == 6) {
            return formatFloat(((Float) value2).floatValue());
        }
        if (i == 7) {
            return formatDouble(((Double) value2).doubleValue());
        }
        if (value2 instanceof String) {
            return formatString((String) value2);
        }
        return value2 + "";
    }

    public static String format(Object value) {
        String str;
        if (value instanceof Byte) {
            return formatByte(((Byte) value).byteValue());
        }
        if (value instanceof Short) {
            return formatShort(((Short) value).shortValue());
        }
        if (value instanceof Long) {
            return formatLong(((Long) value).longValue());
        }
        if (value instanceof Float) {
            return formatFloat(((Float) value).floatValue());
        }
        if (value instanceof Double) {
            return formatDouble(((Double) value).doubleValue());
        }
        if (value instanceof Character) {
            return formatChar(((Character) value).charValue());
        }
        if (value instanceof String) {
            return formatString((String) value);
        }
        if ((value instanceof Integer) || (value instanceof Boolean)) {
            return value.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Argument is not a primitive type or a string; it ");
        if (value == null) {
            str = "is a null value.";
        } else {
            str = "has class " + value.getClass().getName();
        }
        sb.append(str);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    private static String formatByte(byte b) {
        return String.format("(byte)0x%02x", Byte.valueOf(b));
    }

    private static String formatShort(short s) {
        return String.format("(short)%d", Short.valueOf(s));
    }

    private static String formatLong(long lng) {
        return lng + "L";
    }

    private static String formatFloat(float f) {
        if (Float.isNaN(f)) {
            return "0.0f/0.0f";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-1.0f/0.0f" : "1.0f/0.0f";
        }
        return f + "f";
    }

    private static String formatDouble(double d) {
        if (Double.isNaN(d)) {
            return "0.0/0.0";
        }
        if (Double.isInfinite(d)) {
            return d < 0.0d ? "-1.0/0.0" : "1.0/0.0";
        }
        return d + "";
    }

    private static String formatChar(char c) {
        return '\'' + Convert.quote(c) + '\'';
    }

    private static String formatString(String s) {
        return '\"' + Convert.quote(s) + '\"';
    }
}
