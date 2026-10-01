package com.github.megatronking.stringfog.plugin.utils;

public class Log {
    private static boolean isDebug;

    public static void m7061e(String str) {
        if (isDebug) {
            System.err.println(str);
        }
    }

    public static void setDebug(boolean z) {
        isDebug = z;
    }

    public static void m7062v(String str) {
        if (isDebug) {
            System.out.println(str);
        }
    }
}
