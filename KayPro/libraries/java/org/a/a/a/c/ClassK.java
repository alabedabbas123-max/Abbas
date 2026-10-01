package org.a.a.a.c;

public final class ClassK {
    public static int m7404a() {
        return m7405a(0);
    }

    public static int m7405a(int i) {
        return i;
    }

    public static int m7406a(int i, int i2) {
        int i3 = (-862048943) * i2;
        int i4 = (((i3 >>> 17) | (i3 << 15)) * 461845907) ^ i;
        return (((i4 >>> 19) | (i4 << 13)) * 5) - 430675100;
    }

    public static int m7407a(int i, Object obj) {
        return m7406a(i, obj != null ? obj.hashCode() : 0);
    }

    public static int m7408b(int i, int i2) {
        int i3 = (i2 * 4) ^ i;
        int i4 = (i3 ^ (i3 >>> 16)) * (-2048144789);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477387);
        return i5 ^ (i5 >>> 16);
    }
}
