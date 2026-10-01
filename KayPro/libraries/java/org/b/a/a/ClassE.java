package org.b.a.a;

import com.almlkaide.kaypro.android.dex.DexFormat;
import java.io.IOException;
import java.math.BigInteger;
import org.b.a.b.Abstractf;
import org.b.a.b.Interfacee;

public class ClassE {

    static final Interfacee f5437a = Abstractf.m7557a(null);

    static final Interfacee f5438b = new ClassF();

    public static long m7546a(byte[] bArr, int i, int i2) {
        long j = 0;
        int i3 = i + i2;
        if (i2 < 2) {
            throw new IllegalArgumentException("Length " + i2 + " must be at least 2");
        }
        if (bArr[i] != 0) {
            int i4 = i;
            while (i4 < i3 && bArr[i4] == 32) {
                i4++;
            }
            byte b = bArr[i3 - 1];
            int i5 = i3;
            while (i4 < i5 && (b == 0 || b == 32)) {
                int i6 = i5 - 1;
                b = bArr[i6 - 1];
                i5 = i6;
            }
            while (i4 < i5) {
                byte b2 = bArr[i4];
                if (b2 < 48 || b2 > 55) {
                    throw new IllegalArgumentException(m7548a(bArr, i, i2, i4, b2));
                }
                i4++;
                j = ((long) (b2 - 48)) + (j << 3);
            }
        }
        return j;
    }

    private static long m7547a(byte[] bArr, int i, int i2, boolean z) {
        if (i2 >= 9) {
            throw new IllegalArgumentException("At offset " + i + ", " + i2 + " byte binary number exceeds maximum signed long value");
        }
        long jPow = 0;
        int i3 = 1;
        while (i3 < i2) {
            long j = ((long) (bArr[i + i3] & 255)) + (jPow << 8);
            i3++;
            jPow = j;
        }
        if (z) {
            jPow = (jPow - 1) ^ (((long) Math.pow(2.0d, ((double) (i2 - 1)) * 8.0d)) - 1);
        }
        return z ? -jPow : jPow;
    }

    private static String m7548a(byte[] bArr, int i, int i2, int i3, byte b) {
        return "Invalid byte " + ((int) b) + " at offset " + (i3 - i) + " in '" + new String(bArr, i, i2).replaceAll(DexFormat.MAGIC_SUFFIX, "{NUL}") + "' len=" + i2;
    }

    public static String m7549a(byte[] bArr, int i, int i2, Interfacee interfaceC1813e) {
        while (i2 > 0 && bArr[(i + i2) - 1] == 0) {
            i2--;
        }
        if (i2 <= 0) {
            return "";
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return interfaceC1813e.mo7554a(bArr2);
    }

    public static boolean m7550a(byte[] bArr, int i) {
        return bArr[i] == 1;
    }

    public static long m7551b(byte[] bArr, int i, int i2) {
        if ((bArr[i] & 128) == 0) {
            return m7546a(bArr, i, i2);
        }
        boolean z = bArr[i] == -1;
        return i2 < 9 ? m7547a(bArr, i, i2, z) : m7552b(bArr, i, i2, z);
    }

    private static long m7552b(byte[] bArr, int i, int i2, boolean z) {
        byte[] bArr2 = new byte[i2 - 1];
        System.arraycopy(bArr, i + 1, bArr2, 0, i2 - 1);
        BigInteger bigInteger = new BigInteger(bArr2);
        if (z) {
            bigInteger = bigInteger.add(BigInteger.valueOf(-1L)).not();
        }
        if (bigInteger.bitLength() > 63) {
            throw new IllegalArgumentException("At offset " + i + ", " + i2 + " byte binary number exceeds maximum signed long value");
        }
        return z ? -bigInteger.longValue() : bigInteger.longValue();
    }

    public static String m7553c(byte[] bArr, int i, int i2) {
        try {
            return m7549a(bArr, i, i2, f5437a);
        } catch (IOException e) {
            try {
                return m7549a(bArr, i, i2, f5438b);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }
}
