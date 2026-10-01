package a.j;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ClassB {
    public static int m3120a(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iMin = Math.min(i, i2);
        for (int i3 = 0; i3 < iMin; i3++) {
            if (bArr[i3] < bArr2[i3]) {
                return -1;
            }
            if (bArr[i3] > bArr2[i3]) {
                return 1;
            }
        }
        if (i >= i2) {
            return i == i2 ? 0 : 1;
        }
        return -1;
    }

    public static int m3121a(char[] cArr, int i, char[] cArr2, int i2) {
        int iMin = Math.min(i, i2);
        for (int i3 = 0; i3 < iMin; i3++) {
            if (cArr[i3] < cArr2[i3]) {
                return -1;
            }
            if (cArr[i3] > cArr2[i3]) {
                return 1;
            }
        }
        if (i >= i2) {
            return i == i2 ? 0 : 1;
        }
        return -1;
    }

    public static int m3122a(double[] dArr, int i, double[] dArr2, int i2) {
        int iMin = Math.min(i, i2);
        for (int i3 = 0; i3 < iMin; i3++) {
            if (dArr[i3] < dArr2[i3]) {
                return -1;
            }
            if (dArr[i3] > dArr2[i3]) {
                return 1;
            }
        }
        if (i >= i2) {
            return i == i2 ? 0 : 1;
        }
        return -1;
    }

    public static int m3123a(float[] fArr, int i, float[] fArr2, int i2) {
        int iMin = Math.min(i, i2);
        for (int i3 = 0; i3 < iMin; i3++) {
            if (fArr[i3] < fArr2[i3]) {
                return -1;
            }
            if (fArr[i3] > fArr2[i3]) {
                return 1;
            }
        }
        if (i >= i2) {
            return i == i2 ? 0 : 1;
        }
        return -1;
    }

    public static int m3124a(int[] iArr, int i, int[] iArr2, int i2) {
        int iMin = Math.min(i, i2);
        for (int i3 = 0; i3 < iMin; i3++) {
            if (iArr[i3] < iArr2[i3]) {
                return -1;
            }
            if (iArr[i3] > iArr2[i3]) {
                return 1;
            }
        }
        if (i >= i2) {
            return i == i2 ? 0 : 1;
        }
        return -1;
    }

    public static int m3125a(long[] jArr, int i, long[] jArr2, int i2) {
        int iMin = Math.min(i, i2);
        for (int i3 = 0; i3 < iMin; i3++) {
            if (jArr[i3] < jArr2[i3]) {
                return -1;
            }
            if (jArr[i3] > jArr2[i3]) {
                return 1;
            }
        }
        if (i >= i2) {
            return i == i2 ? 0 : 1;
        }
        return -1;
    }

    public static int m3126a(Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        return m3127a(objArr, objArr.length);
    }

    public static int m3127a(Object[] objArr, int i) {
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = ((iHashCode >>> 31) | (iHashCode << 1)) ^ objArr[i2].hashCode();
        }
        return iHashCode;
    }

    public static int m3128a(short[] sArr, int i, short[] sArr2, int i2) {
        int iMin = Math.min(i, i2);
        for (int i3 = 0; i3 < iMin; i3++) {
            if (sArr[i3] < sArr2[i3]) {
                return -1;
            }
            if (sArr[i3] > sArr2[i3]) {
                return 1;
            }
        }
        if (i >= i2) {
            return i == i2 ? 0 : 1;
        }
        return -1;
    }

    public static int m3129a(boolean[] zArr, int i, boolean[] zArr2, int i2) {
        int iMin = Math.min(i, i2);
        for (int i3 = 0; i3 < iMin; i3++) {
            if (!zArr[i3] && zArr2[i3]) {
                return -1;
            }
            if (zArr[i3] && !zArr2[i3]) {
                return 1;
            }
        }
        if (i >= i2) {
            return i == i2 ? 0 : 1;
        }
        return -1;
    }

    public static void m3130a(Object[] objArr, int i, int i2) {
        System.arraycopy(objArr, i2 + 1, objArr, i2, (objArr.length - i2) - 1);
        objArr[i - 1] = null;
    }

    public static boolean m3131a(Object[] objArr, Object[] objArr2) {
        if (objArr == null) {
            return objArr2 == null;
        }
        return m3141b(objArr, objArr2, objArr.length);
    }

    public static boolean m3132a(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    public static byte[] m3133a(byte[] bArr, int i) {
        if (bArr.length >= i) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int[] m3134a(int[] iArr, int i) {
        if (iArr.length >= i) {
            return iArr;
        }
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static int[] m3135a(int[] iArr, int i, int i2) {
        int[] iArrM3134a = m3134a(iArr, i + 1);
        iArrM3134a[i] = i2;
        return iArrM3134a;
    }

    public static long[] m3136a(long[] jArr, int i, long j) {
        if (jArr.length >= i) {
            Arrays.fill(jArr, 0, i, j);
        } else {
            jArr = new long[i];
            if (j != 0) {
                Arrays.fill(jArr, 0, i, j);
            }
        }
        return jArr;
    }

    public static Object[] m3137a(Object[] objArr, int i, int i2, Object obj) {
        Object[] objArrM3144b = m3144b(objArr, i + 1);
        System.arraycopy(objArrM3144b, i2, objArrM3144b, i2 + 1, i - i2);
        objArrM3144b[i2] = obj;
        return objArrM3144b;
    }

    public static Object[] m3138a(Object[] objArr, int i, Object obj) {
        Object[] objArrM3144b = m3144b(objArr, i + 1);
        objArrM3144b[i] = obj;
        return objArrM3144b;
    }

    public static boolean[] m3139a(boolean[] zArr, int i) {
        if (zArr.length >= i) {
            return zArr;
        }
        boolean[] zArr2 = new boolean[i];
        System.arraycopy(zArr, 0, zArr2, 0, zArr.length);
        return zArr2;
    }

    public static boolean[] m3140a(boolean[] zArr, int i, boolean z) {
        if (zArr.length >= i) {
            Arrays.fill(zArr, 0, i, z);
        } else {
            zArr = new boolean[i];
            if (z) {
                Arrays.fill(zArr, 0, i, z);
            }
        }
        return zArr;
    }

    public static boolean m3141b(Object[] objArr, Object[] objArr2, int i) {
        if (objArr == null) {
            return objArr2 == null;
        }
        return objArr2 != null && m3132a(objArr, objArr2, i);
    }

    public static int[] m3142b(int[] iArr, int i, int i2) {
        if (iArr.length >= i) {
            Arrays.fill(iArr, 0, i, i2);
        } else {
            iArr = new int[i];
            if (i2 != 0) {
                Arrays.fill(iArr, 0, i, i2);
            }
        }
        return iArr;
    }

    public static Object[] m3143b(Object[] objArr) {
        if (objArr != null) {
            return (Object[]) objArr.clone();
        }
        return null;
    }

    public static Object[] m3144b(Object[] objArr, int i) {
        if (objArr.length >= i) {
            return objArr;
        }
        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        return objArr2;
    }

    public static Object[] m3145b(Object[] objArr, int i, Object obj) {
        if (objArr.length >= i) {
            Arrays.fill(objArr, 0, i, obj);
            return objArr;
        }
        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        if (obj == null) {
            return objArr2;
        }
        Arrays.fill(objArr2, 0, i, obj);
        return objArr2;
    }
}
