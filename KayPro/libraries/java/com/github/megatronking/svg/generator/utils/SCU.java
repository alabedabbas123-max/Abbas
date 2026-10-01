package com.github.megatronking.svg.generator.utils;

public class SCU {
    private static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean parseBoolean(String str, boolean z) {
        if (isEmpty(str)) {
            return z;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception e) {
            return z;
        }
    }

    public static byte parseByte(String str, byte b) {
        if (isEmpty(str)) {
            return b;
        }
        try {
            return Byte.parseByte(str);
        } catch (Exception e) {
            return b;
        }
    }

    public static double parseDouble(String str, double d) {
        if (isEmpty(str)) {
            return d;
        }
        try {
            return Double.parseDouble(str);
        } catch (Exception e) {
            return d;
        }
    }

    public static float parseFloat(String str, float f) {
        if (isEmpty(str)) {
            return f;
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception e) {
            return f;
        }
    }

    public static int parseInt(String str) {
        try {
            if (isEmpty(str)) {
                return 0;
            }
            return new Double(Double.parseDouble(str)).intValue();
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static int parseInt(String str, int i) {
        if (isEmpty(str)) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            return i;
        }
    }

    public static long parseLong(String str, long j) {
        if (isEmpty(str)) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception e) {
            return j;
        }
    }
}
