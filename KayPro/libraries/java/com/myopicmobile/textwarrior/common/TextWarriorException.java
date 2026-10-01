package com.myopicmobile.textwarrior.common;

import android.util.Log;

public class TextWarriorException extends Exception {
    private static final boolean NDEBUG = false;
    private static final long serialVersionUID = -8393914265675038931L;

    public TextWarriorException(String str) {
        super(str);
    }

    @SuppressWarnings("all")
    public static void assertVerbose(boolean z, String str) {
        if (z) {
            return;
        }
        System.err.print("TextWarrior assertion failed: ");
        System.err.println(str);
        Log.d("lua", str);
    }

    public static void fail(String str) {
        assertVerbose(false, str);
    }
}
