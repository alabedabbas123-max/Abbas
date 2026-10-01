package com.almlkaide.kaypro.android.dex;

import com.almlkaide.kaypro.android.dex.util.ByteInput;
import com.almlkaide.kaypro.android.dx.io.Opcodes;
import java.io.UTFDataFormatException;

public final class Mutf8 {
    Mutf8() {
    }

    public static String decode(ByteInput byteInput, char[] cArr) throws UTFDataFormatException {
        int i = 0;
        while (true) {
            char c = (char) (byteInput.readByte() & 255);
            if (c == 0) {
                return new String(cArr, 0, i);
            }
            cArr[i] = c;
            if (c < 128) {
                i++;
            } else if ((c & 224) == 192) {
                int i2 = byteInput.readByte() & 255;
                if ((i2 & 192) != 128) {
                    throw new UTFDataFormatException("bad second byte");
                }
                cArr[i] = (char) (((c & 31) << 6) | (i2 & 63));
                i++;
            } else if ((c & 240) == 224) {
                int i3 = byteInput.readByte() & 255;
                int i4 = byteInput.readByte() & 255;
                if ((i3 & 192) != 128 || (i4 & 192) != 128) {
                    throw new UTFDataFormatException("bad second or third byte");
                }
                cArr[i] = (char) (((c & 15) << 12) | ((i3 & 63) << 6) | (i4 & 63));
                i++;
            } else {
                throw new UTFDataFormatException("bad byte");
            }
        }
    }

    private static long countBytes(String str, boolean z) throws UTFDataFormatException {
        long j;
        long j2 = 0;
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt != 0 && cCharAt <= 127) {
                j = 1 + j2;
            } else if (cCharAt <= 2047) {
                j = ((long) 2) + j2;
            } else {
                j = ((long) 3) + j2;
            }
            if (!z || j <= 65535) {
                i++;
                j2 = j;
            } else {
                throw new UTFDataFormatException("String more than 65535 UTF bytes long");
            }
        }
        return j2;
    }

    public static void encode(byte[] bArr, int i, String str) {
        int i2;
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != 0 && cCharAt <= 127) {
                i2 = i + 1;
                bArr[i] = (byte) cCharAt;
            } else if (cCharAt <= 2047) {
                int i4 = i + 1;
                bArr[i] = (byte) (((cCharAt >> 6) & 31) | 192);
                i2 = i4 + 1;
                bArr[i4] = (byte) ((cCharAt & '?') | 128);
            } else {
                int i5 = i + 1;
                bArr[i] = (byte) (((cCharAt >> '\f') & 15) | Opcodes.SHL_INT_LIT8);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (((cCharAt >> 6) & 63) | 128);
                i2 = i6 + 1;
                bArr[i6] = (byte) ((cCharAt & '?') | 128);
            }
            i3++;
            i = i2;
        }
    }

    public static byte[] encode(String str) throws UTFDataFormatException {
        byte[] bArr = new byte[(int) countBytes(str, true)];
        encode(bArr, 0, str);
        return bArr;
    }
}
