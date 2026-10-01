package a.j;

import com.almlkaide.kaypro.android.dx.io.Opcodes;

public class ClassX {
    public static byte[] m3178a(String str) {
        int i;
        int i2;
        int i3 = 0;
        int length = str.length();
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char cCharAt = str.charAt(i5);
            if (cCharAt == 0) {
                i2 = 2;
            } else if (cCharAt < 128) {
                i2 = 1;
            } else {
                i2 = cCharAt < 2048 ? 2 : 3;
            }
            i4 += i2;
        }
        byte[] bArr = new byte[i4];
        int i6 = 0;
        while (i6 < length) {
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 == 0) {
                int i7 = i3 + 1;
                bArr[i3] = -64;
                i = i7 + 1;
                bArr[i7] = -128;
            } else if (cCharAt2 < 128) {
                i = i3 + 1;
                bArr[i3] = (byte) cCharAt2;
            } else if (cCharAt2 < 2048) {
                int i8 = i3 + 1;
                bArr[i3] = (byte) (((cCharAt2 >>> 6) & 31) | 192);
                i = i8 + 1;
                bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                int i9 = i3 + 1;
                bArr[i3] = (byte) (((cCharAt2 >>> '\f') & 15) | Opcodes.SHL_INT_LIT8);
                int i10 = i9 + 1;
                bArr[i9] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i = i10 + 1;
                bArr[i10] = (byte) ((cCharAt2 & '?') | 128);
            }
            i6++;
            i3 = i;
        }
        return bArr;
    }
}
