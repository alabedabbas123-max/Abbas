package com.a.b.d;

public final class ClassD {
    public static boolean m4706a(int i) {
        if (i < -1) {
            return false;
        }
        if (i == -1) {
            return true;
        }
        int i2 = i & 255;
        if (i2 == 0 || i2 == 255) {
            return true;
        }
        return (65280 & i) == 0;
    }
}
