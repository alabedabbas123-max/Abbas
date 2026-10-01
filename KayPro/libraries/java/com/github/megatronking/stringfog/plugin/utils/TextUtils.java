package com.github.megatronking.stringfog.plugin.utils;

public final class TextUtils {
    TextUtils() {
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean isEmptyAfterTrim(String str) {
        return str == null || str.length() == 0 || str.trim().length() == 0;
    }
}
