package com.google.googlejavaformat.java;

public class OpUtil {
    public static boolean isPostUnaryOp(int tag) {
        return tag == 54 || tag == 55;
    }

    public boolean isIncOrDecUnaryOp(int tag) {
        return tag == 52 || tag == 53 || tag == 54 || tag == 55;
    }
}
