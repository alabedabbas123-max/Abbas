package com.almlkaide.kaypro.android.dx.util;

public final class Bits {
    Bits() {
    }

    public static int[] makeBitSet(int i) {
        return new int[(i + 31) >> 5];
    }

    public static int getMax(int[] iArr) {
        return iArr.length * 32;
    }

    public static boolean m7216get(int[] iArr, int i) {
        return (iArr[i >> 5] & (1 << (i & 31))) != 0;
    }

    public static void m7219set(int[] iArr, int i, boolean z) {
        int i2 = i >> 5;
        int i3 = 1 << (i & 31);
        if (z) {
            iArr[i2] = i3 | iArr[i2];
        } else {
            iArr[i2] = (i3 ^ (-1)) & iArr[i2];
        }
    }

    public static void m7218set(int[] iArr, int i) {
        int i2 = i >> 5;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    public static void clear(int[] iArr, int i) {
        int i2 = i >> 5;
        iArr[i2] = ((1 << (i & 31)) ^ (-1)) & iArr[i2];
    }

    public static boolean isEmpty(int[] iArr) {
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static int bitCount(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int iBitCount = Integer.bitCount(iArr[i]) + i2;
            i++;
            i2 = iBitCount;
        }
        return i2;
    }

    public static boolean anyInRange(int[] iArr, int i, int i2) {
        int iFindFirst = findFirst(iArr, i);
        return iFindFirst >= 0 && iFindFirst < i2;
    }

    public static int findFirst(int[] iArr, int i) {
        int iFindFirst;
        int length = iArr.length;
        int i2 = i & 31;
        for (int i3 = i >> 5; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i4 != 0 && (iFindFirst = findFirst(i4, i2)) >= 0) {
                return (i3 << 5) + iFindFirst;
            }
            i2 = 0;
        }
        return -1;
    }

    public static int findFirst(int i, int i2) {
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros((((1 << i2) - 1) ^ (-1)) & i);
        if (iNumberOfTrailingZeros == 32) {
            return -1;
        }
        return iNumberOfTrailingZeros;
    }

    public static void m7217or(int[] iArr, int[] iArr2) {
        for (int i = 0; i < iArr2.length; i++) {
            iArr[i] = iArr[i] | iArr2[i];
        }
    }

    public static String toHuman(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        int length = iArr.length * 32;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            if (m7216get(iArr, i)) {
                if (z) {
                    sb.append(',');
                }
                z = true;
                sb.append(i);
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
