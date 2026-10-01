package com.github.megatronking.svg.generator.utils;

public class TextUtils {
    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static String removeMultiSpace(String str) {
        while (str != null && str.contains("  ")) {
            str = str.replaceAll("  ", " ");
        }
        return str;
    }
}
