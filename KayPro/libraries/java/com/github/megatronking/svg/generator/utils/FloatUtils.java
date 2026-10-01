package com.github.megatronking.svg.generator.utils;

public class FloatUtils {
    public static String format2String(float f) {
        return f == ((float) ((long) f)) ? String.valueOf((long) f) : String.valueOf(f);
    }
}
