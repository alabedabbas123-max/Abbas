package com.almlkaide.kaypro.android.dx.util;

import org.objectweb.asm.signature.SignatureVisitor;

public final class Hex {
    Hex() {
    }

    public static String m7228u8(long j) {
        char[] cArr = new char[16];
        for (int i = 0; i < 16; i++) {
            cArr[15 - i] = Character.forDigit(((int) j) & 15, 16);
            j >>= 4;
        }
        return new String(cArr);
    }

    public static String m7227u4(int i) {
        char[] cArr = new char[8];
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[7 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String m7226u3(int i) {
        char[] cArr = new char[6];
        for (int i2 = 0; i2 < 6; i2++) {
            cArr[5 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String m7225u2(int i) {
        char[] cArr = new char[4];
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[3 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String u2or4(int i) {
        return i == ((char) i) ? m7225u2(i) : m7227u4(i);
    }

    public static String m7224u1(int i) {
        char[] cArr = new char[2];
        for (int i2 = 0; i2 < 2; i2++) {
            cArr[1 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String uNibble(int i) {
        return new String(new char[]{Character.forDigit(i & 15, 16)});
    }

    public static String m7223s8(long j) {
        char[] cArr = new char[17];
        if (j < 0) {
            cArr[0] = SignatureVisitor.SUPER;
            j = -j;
        } else {
            cArr[0] = SignatureVisitor.EXTENDS;
        }
        for (int i = 0; i < 16; i++) {
            cArr[16 - i] = Character.forDigit(((int) j) & 15, 16);
            j >>= 4;
        }
        return new String(cArr);
    }

    public static String m7222s4(int i) {
        char[] cArr = new char[9];
        if (i < 0) {
            cArr[0] = SignatureVisitor.SUPER;
            i = -i;
        } else {
            cArr[0] = SignatureVisitor.EXTENDS;
        }
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[8 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String m7221s2(int i) {
        char[] cArr = new char[5];
        if (i < 0) {
            cArr[0] = SignatureVisitor.SUPER;
            i = -i;
        } else {
            cArr[0] = SignatureVisitor.EXTENDS;
        }
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[4 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String m7220s1(int i) {
        char[] cArr = new char[3];
        if (i < 0) {
            cArr[0] = SignatureVisitor.SUPER;
            i = -i;
        } else {
            cArr[0] = SignatureVisitor.EXTENDS;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            cArr[2 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String dump(byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        String strM7226u3;
        int i6 = i + i2;
        if ((i | i2 | i6) < 0 || i6 > bArr.length) {
            throw new IndexOutOfBoundsException(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append(new StringBuffer().append("arr.length ").append(bArr.length).toString()).append("; ").toString()).append(i).toString()).append("..!").toString()).append(i6).toString());
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("outOffset < 0");
        }
        if (i2 == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder((i2 * 4) + 6);
        int i7 = 0;
        while (i2 > 0) {
            if (i7 == 0) {
                switch (i5) {
                    case 2:
                        strM7226u3 = m7224u1(i3);
                        break;
                    case 3:
                    case 5:
                    default:
                        strM7226u3 = m7227u4(i3);
                        break;
                    case 4:
                        strM7226u3 = m7225u2(i3);
                        break;
                    case 6:
                        strM7226u3 = m7226u3(i3);
                        break;
                }
                sb.append(strM7226u3);
                sb.append(": ");
            } else if ((i7 & 1) == 0) {
                sb.append(' ');
            }
            sb.append(m7224u1(bArr[i]));
            i3++;
            i++;
            int i8 = i7 + 1;
            if (i8 == i4) {
                sb.append('\n');
                i8 = 0;
            }
            i2--;
            i7 = i8;
        }
        if (i7 != 0) {
            sb.append('\n');
        }
        return sb.toString();
    }
}
