package com.a.b.e.b;

import com.a.b.g.ClassK;
import com.almlkaide.kaypro.android.dx.rop.code.AccessFlags;

public final class ClassA {
    public static String m4726a(int i) {
        return m4727a(i, AccessFlags.CLASS_FLAGS, 1);
    }

    private static String m4727a(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder(80);
        int i4 = (i2 ^ (-1)) & i;
        int i5 = i & i2;
        if ((i5 & 1) != 0) {
            sb.append("|public");
        }
        if ((i5 & 2) != 0) {
            sb.append("|private");
        }
        if ((i5 & 4) != 0) {
            sb.append("|protected");
        }
        if ((i5 & 8) != 0) {
            sb.append("|static");
        }
        if ((i5 & 16) != 0) {
            sb.append("|final");
        }
        if ((i5 & 32) != 0) {
            if (i3 == 1) {
                sb.append("|super");
            } else {
                sb.append("|synchronized");
            }
        }
        if ((i5 & 64) != 0) {
            if (i3 == 3) {
                sb.append("|bridge");
            } else {
                sb.append("|volatile");
            }
        }
        if ((i5 & 128) != 0) {
            if (i3 == 3) {
                sb.append("|varargs");
            } else {
                sb.append("|transient");
            }
        }
        if ((i5 & 256) != 0) {
            sb.append("|native");
        }
        if ((i5 & 512) != 0) {
            sb.append("|interface");
        }
        if ((i5 & 1024) != 0) {
            sb.append("|abstract");
        }
        if ((i5 & 2048) != 0) {
            sb.append("|strictfp");
        }
        if ((i5 & 4096) != 0) {
            sb.append("|synthetic");
        }
        if ((i5 & 8192) != 0) {
            sb.append("|annotation");
        }
        if ((i5 & 16384) != 0) {
            sb.append("|enum");
        }
        if ((65536 & i5) != 0) {
            sb.append("|constructor");
        }
        if ((i5 & 131072) != 0) {
            sb.append("|declared_synchronized");
        }
        if (i4 != 0 || sb.length() == 0) {
            sb.append('|');
            sb.append(ClassK.m5485c(i4));
        }
        return sb.substring(1);
    }

    public static String m4728b(int i) {
        return m4727a(i, AccessFlags.INNER_CLASS_FLAGS, 1);
    }

    public static String m4729c(int i) {
        return m4727a(i, AccessFlags.FIELD_FLAGS, 2);
    }

    public static String m4730d(int i) {
        return m4727a(i, AccessFlags.METHOD_FLAGS, 3);
    }

    public static boolean m4731e(int i) {
        return (i & 2) != 0;
    }

    public static boolean m4732f(int i) {
        return (i & 8) != 0;
    }

    public static boolean m4733g(int i) {
        return (i & 32) != 0;
    }

    public static boolean m4734h(int i) {
        return (i & 1024) != 0;
    }

    public static boolean m4735i(int i) {
        return (i & 256) != 0;
    }

    public static boolean m4736j(int i) {
        return (i & 8192) != 0;
    }
}
