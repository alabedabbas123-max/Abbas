package com.almlkaide.kaypro.android.dx.util;

public final class HexParser {
    HexParser() {
    }

    public static byte[] parse(String str) {
        String strSubstring;
        int iIndexOf;
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            int iIndexOf2 = str.indexOf(10, i2);
            if (iIndexOf2 < 0) {
                iIndexOf2 = length;
            }
            int iIndexOf3 = str.indexOf(35, i2);
            if (iIndexOf3 >= 0 && iIndexOf3 < iIndexOf2) {
                strSubstring = str.substring(i2, iIndexOf3);
            } else {
                strSubstring = str.substring(i2, iIndexOf2);
            }
            int i3 = iIndexOf2 + 1;
            int iIndexOf4 = strSubstring.indexOf(58);
            if (iIndexOf4 != -1 && ((iIndexOf = strSubstring.indexOf(34)) == -1 || iIndexOf >= iIndexOf4)) {
                String strTrim = strSubstring.substring(0, iIndexOf4).trim();
                strSubstring = strSubstring.substring(iIndexOf4 + 1);
                if (Integer.parseInt(strTrim, 16) != i) {
                    throw new RuntimeException(new StringBuffer().append("bogus offset marker: ").append(strTrim).toString());
                }
            }
            int length2 = strSubstring.length();
            boolean z = false;
            int i4 = -1;
            for (int i5 = 0; i5 < length2; i5++) {
                char cCharAt = strSubstring.charAt(i5);
                if (z) {
                    if (cCharAt == '\"') {
                        z = false;
                    } else {
                        bArr[i] = (byte) cCharAt;
                        i++;
                    }
                } else if (cCharAt <= ' ') {
                    continue;
                } else if (cCharAt == '\"') {
                    if (i4 != -1) {
                        throw new RuntimeException(new StringBuffer().append(new StringBuffer().append("spare digit around ").append("offset ").toString()).append(Hex.m7227u4(i)).toString());
                    }
                    z = true;
                } else {
                    int iDigit = Character.digit(cCharAt, 16);
                    if (iDigit == -1) {
                        throw new RuntimeException(new StringBuffer().append(new StringBuffer().append("bogus digit character: \"").append(cCharAt).toString()).append("\"").toString());
                    }
                    if (i4 == -1) {
                        i4 = iDigit;
                    } else {
                        bArr[i] = (byte) ((i4 << 4) | iDigit);
                        i++;
                        i4 = -1;
                    }
                }
            }
            if (i4 != -1) {
                throw new RuntimeException(new StringBuffer().append("spare digit around offset ").append(Hex.m7227u4(i)).toString());
            }
            if (z) {
                throw new RuntimeException(new StringBuffer().append(new StringBuffer().append("unterminated quote around ").append("offset ").toString()).append(Hex.m7227u4(i)).toString());
            }
            i2 = i3;
        }
        if (i >= bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }
}
