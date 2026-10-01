package com.a.b.g;

import org.objectweb.asm.signature.SignatureVisitor;

public final class ClassK {
    public static String m5480a(int i) {
        char[] cArr = new char[8];
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[7 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String m5481a(long j) {
        char[] cArr = new char[16];
        for (int i = 0; i < 16; i++) {
            cArr[15 - i] = Character.forDigit(((int) j) & 15, 16);
            j >>= 4;
        }
        return new String(cArr);
    }

    public static String m5482a(byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        String strM5483b;
        int i6 = i + i2;
        if ((i | i2 | i6) < 0 || i6 > bArr.length) {
            throw new IndexOutOfBoundsException("arr.length " + bArr.length + "; " + i + "..!" + i6);
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
                        strM5483b = m5487e(i3);
                        break;
                    case 3:
                    case 5:
                    default:
                        strM5483b = m5480a(i3);
                        break;
                    case 4:
                        strM5483b = m5485c(i3);
                        break;
                    case 6:
                        strM5483b = m5483b(i3);
                        break;
                }
                sb.append(strM5483b);
                sb.append(": ");
            } else if ((i7 & 1) == 0) {
                sb.append(' ');
            }
            sb.append(m5487e(bArr[i]));
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

    public static String m5483b(int i) {
        char[] cArr = new char[6];
        for (int i2 = 0; i2 < 6; i2++) {
            cArr[5 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String m5484b(long j) {
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

    public static String m5485c(int i) {
        char[] cArr = new char[4];
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[3 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String m5486d(int i) {
        return i == ((char) i) ? m5485c(i) : m5480a(i);
    }

    public static String m5487e(int i) {
        char[] cArr = new char[2];
        for (int i2 = 0; i2 < 2; i2++) {
            cArr[1 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    public static String m5488f(int i) {
        return new String(new char[]{Character.forDigit(i & 15, 16)});
    }

    public static String m5489g(int i) {
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

    public static String m5490h(int i) {
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

    public static String m5491i(int i) {
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
}
