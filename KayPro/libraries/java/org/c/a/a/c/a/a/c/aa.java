package org.c.a.a.c.a.a.c;

import org.c.a.a.b.d.e.ClassK;

public class aa {

    protected static final ClassK[] f6073a;

    static final boolean f6074b;

    static {
        f6074b = !aa.class.desiredAssertionStatus();
        f6073a = new ClassK[25];
        f6073a[0] = ClassK.f5852b;
        f6073a[1] = ClassK.f5853c;
        f6073a[2] = ClassK.f5854d;
        f6073a[4] = ClassK.f5855e;
        f6073a[7] = ClassK.f5856f;
        f6073a[8] = ClassK.f5857g;
        f6073a[17] = ClassK.f5858h;
        f6073a[24] = ClassK.f5851a;
    }

    public static ClassK m8403a(int i) {
        if (i >= 0) {
            if (i <= 1) {
                return ClassK.f5863m;
            }
            if (i <= 127) {
                return ClassK.f5862l;
            }
            if (i <= 32767) {
                return ClassK.f5861k;
            }
            if (i <= 65535) {
                return ClassK.f5860j;
            }
        } else {
            if (i >= -128) {
                return ClassK.f5864n;
            }
            if (i >= -32768) {
                return ClassK.f5865o;
            }
        }
        return ClassK.f5866p;
    }

    public static ClassK m8404a(int i, int i2) {
        ClassK c2051kM8408c = m8408c(i);
        if (c2051kM8408c == null) {
            c2051kM8408c = ClassK.f5856f;
        }
        return c2051kM8408c.mo8143a(i2);
    }

    public static ClassK m8405a(String str) {
        int i = 0;
        while (str.charAt(i) == '[') {
            i++;
        }
        return f6073a[str.charAt(i) - 'B'].mo8143a(i);
    }

    public static ClassK m8406a(ClassK c2051k, ClassK c2051k2) {
        if (f6074b || (c2051k.mo8145d() == 0 && c2051k2.mo8145d() == 0)) {
            return m8408c(c2051k.m8157g() & c2051k2.m8157g());
        }
        throw new AssertionError();
    }

    public static int m8407b(int i) {
        if ((i & 1) != 0) {
            return 1;
        }
        if ((i & 16) != 0) {
            return 16;
        }
        if ((i & 2) != 0) {
            return 2;
        }
        if ((i & 32) != 0) {
            return 32;
        }
        return i;
    }

    protected static ClassK m8408c(int i) {
        switch (i) {
            case 1:
                return ClassK.f5851a;
            case 2:
                return ClassK.f5853c;
            case 4:
                return ClassK.f5855e;
            case 8:
                return ClassK.f5854d;
            case 16:
                return ClassK.f5852b;
            case 32:
                return ClassK.f5858h;
            case 64:
                return ClassK.f5856f;
            case 128:
                return ClassK.f5857g;
            case 256:
                return ClassK.f5859i;
            default:
                if (i == 66) {
                    return ClassK.f5860j;
                }
                if (i == 98) {
                    return ClassK.f5861k;
                }
                if (i == 114) {
                    return ClassK.f5862l;
                }
                if (i == 115) {
                    return ClassK.f5863m;
                }
                if (i == 112) {
                    return ClassK.f5864n;
                }
                if (i == 96) {
                    return ClassK.f5865o;
                }
                if (i == 113) {
                    return ClassK.f5867q;
                }
                return null;
        }
    }
}
