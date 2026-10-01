package com.a.b.g;

public final class ClassD {
    public static int m5417a(int i, int i2) {
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros((((1 << i2) - 1) ^ (-1)) & i);
        if (iNumberOfTrailingZeros == 32) {
            return -1;
        }
        return iNumberOfTrailingZeros;
    }

    public static int m5418a(int[] iArr) {
        return iArr.length * 32;
    }

    public static void m5419a(int[] iArr, int i, boolean z) {
        int i2 = i >> 5;
        int i3 = 1 << (i & 31);
        if (z) {
            iArr[i2] = i3 | iArr[i2];
        } else {
            iArr[i2] = (i3 ^ (-1)) & iArr[i2];
        }
    }

    public static void m5420a(int[] iArr, int[] iArr2) {
        for (int i = 0; i < iArr2.length; i++) {
            iArr[i] = iArr[i] | iArr2[i];
        }
    }

    public static boolean m5421a(int[] iArr, int i) {
        return (iArr[i >> 5] & (1 << (i & 31))) != 0;
    }

    public static boolean m5422a(int[] iArr, int i, int i2) {
        int iM5428d = m5428d(iArr, i);
        return iM5428d >= 0 && iM5428d < i2;
    }

    public static int[] m5423a(int i) {
        return new int[(i + 31) >> 5];
    }

    public static void m5424b(int[] iArr, int i) {
        int i2 = i >> 5;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    public static boolean m5425b(int[] iArr) {
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static int m5426c(int[] iArr) {
        int iBitCount = 0;
        for (int i : iArr) {
            iBitCount += Integer.bitCount(i);
        }
        return iBitCount;
    }

    public static void m5427c(int[] iArr, int i) {
        int i2 = i >> 5;
        iArr[i2] = ((1 << (i & 31)) ^ (-1)) & iArr[i2];
    }

    public static int m5428d(int[] iArr, int i) {
        int iM5417a;
        int length = iArr.length;
        int i2 = i & 31;
        for (int i3 = i >> 5; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i4 != 0 && (iM5417a = m5417a(i4, i2)) >= 0) {
                return (i3 << 5) + iM5417a;
            }
            i2 = 0;
        }
        return -1;
    }
}
