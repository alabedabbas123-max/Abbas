package org.c.a.a.c.c.a.a;

public class ClassA {
    public static String m8720a(int i) {
        switch (i) {
            case 8:
                return "\\b";
            case 9:
                return "\\t";
            case 10:
                return "\\n";
            case 12:
                return "\\f";
            case 13:
                return "\\r";
            case 39:
                return "\\'";
            case 92:
                return "\\\\";
            default:
                return i < 32 ? "\\0" + ((char) ((i >> 3) + 48)) + ((char) ((i & 7) + 48)) : String.valueOf((char) i);
        }
    }
}
