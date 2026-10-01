package org.c.a.a.c.b.a;

import java.io.UTFDataFormatException;

public class ClassC {

    protected byte[] f6259a;

    protected int f6260b = 0;

    public ClassC(byte[] bArr) {
        this.f6259a = bArr;
    }

    public byte m8708a() {
        byte[] bArr = this.f6259a;
        int i = this.f6260b;
        this.f6260b = i + 1;
        return bArr[i];
    }

    public void m8709a(int i) {
        this.f6260b += i;
    }

    public void m8710a(byte[] bArr) {
        int length = bArr.length;
        System.arraycopy(this.f6259a, this.f6260b, bArr, 0, length);
        this.f6260b = length + this.f6260b;
    }

    public int m8711b() {
        byte[] bArr = this.f6259a;
        int i = this.f6260b;
        this.f6260b = i + 1;
        return bArr[i] & 255;
    }

    public int m8712c() {
        byte[] bArr = this.f6259a;
        int i = this.f6260b;
        this.f6260b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.f6259a;
        int i3 = this.f6260b;
        this.f6260b = i3 + 1;
        return i2 | (bArr2[i3] & 255);
    }

    public final int m8713d() {
        byte[] bArr = this.f6259a;
        int i = this.f6260b;
        this.f6260b = i + 1;
        int i2 = (bArr[i] & 255) << 24;
        byte[] bArr2 = this.f6259a;
        int i3 = this.f6260b;
        this.f6260b = i3 + 1;
        int i4 = i2 | ((bArr2[i3] & 255) << 16);
        byte[] bArr3 = this.f6259a;
        int i5 = this.f6260b;
        this.f6260b = i5 + 1;
        int i6 = i4 | ((bArr3[i5] & 255) << 8);
        byte[] bArr4 = this.f6259a;
        int i7 = this.f6260b;
        this.f6260b = i7 + 1;
        return i6 | (bArr4[i7] & 255);
    }

    public final float m8714e() {
        return Float.intBitsToFloat(m8713d());
    }

    public long m8715f() {
        byte[] bArr = this.f6259a;
        int i = this.f6260b;
        this.f6260b = i + 1;
        int i2 = (bArr[i] & 255) << 24;
        byte[] bArr2 = this.f6259a;
        int i3 = this.f6260b;
        this.f6260b = i3 + 1;
        int i4 = i2 | ((bArr2[i3] & 255) << 16);
        byte[] bArr3 = this.f6259a;
        int i5 = this.f6260b;
        this.f6260b = i5 + 1;
        int i6 = i4 | ((bArr3[i5] & 255) << 8);
        byte[] bArr4 = this.f6259a;
        int i7 = this.f6260b;
        this.f6260b = i7 + 1;
        long j = i6 | (bArr4[i7] & 255);
        byte[] bArr5 = this.f6259a;
        int i8 = this.f6260b;
        this.f6260b = i8 + 1;
        int i9 = (bArr5[i8] & 255) << 24;
        byte[] bArr6 = this.f6259a;
        int i10 = this.f6260b;
        this.f6260b = i10 + 1;
        int i11 = i9 | ((bArr6[i10] & 255) << 16);
        byte[] bArr7 = this.f6259a;
        int i12 = this.f6260b;
        this.f6260b = i12 + 1;
        int i13 = i11 | ((bArr7[i12] & 255) << 8);
        byte[] bArr8 = this.f6259a;
        int i14 = this.f6260b;
        this.f6260b = i14 + 1;
        return ((j & 4294967295L) << 32) | (((long) (i13 | (bArr8[i14] & 255))) & 4294967295L);
    }

    public double m8716g() {
        return Double.longBitsToDouble(m8715f());
    }

    public String m8717h() throws UTFDataFormatException {
        int iM8712c = m8712c();
        char[] cArr = new char[iM8712c];
        int i = this.f6260b + iM8712c;
        int i2 = 0;
        while (this.f6260b < i) {
            byte[] bArr = this.f6259a;
            int i3 = this.f6260b;
            this.f6260b = i3 + 1;
            int i4 = bArr[i3] & 255;
            switch (i4 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    cArr[i2] = (char) i4;
                    i2++;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    throw new UTFDataFormatException("malformed input around byte " + this.f6260b);
                case 12:
                case 13:
                    if (this.f6260b + 1 > i) {
                        throw new UTFDataFormatException("malformed input: partial character at end");
                    }
                    byte[] bArr2 = this.f6259a;
                    int i5 = this.f6260b;
                    this.f6260b = i5 + 1;
                    byte b = bArr2[i5];
                    if ((b & 192) != 128) {
                        throw new UTFDataFormatException("malformed input around byte " + this.f6260b);
                    }
                    cArr[i2] = (char) (((i4 & 31) << 6) | (b & 63));
                    i2++;
                    break;
                case 14:
                    if (this.f6260b + 2 > i) {
                        throw new UTFDataFormatException("malformed input: partial character at end");
                    }
                    byte[] bArr3 = this.f6259a;
                    int i6 = this.f6260b;
                    this.f6260b = i6 + 1;
                    byte b2 = bArr3[i6];
                    byte[] bArr4 = this.f6259a;
                    int i7 = this.f6260b;
                    this.f6260b = i7 + 1;
                    byte b3 = bArr4[i7];
                    if ((b2 & 192) != 128 || (b3 & 192) != 128) {
                        throw new UTFDataFormatException("malformed input around byte " + (this.f6260b - 1));
                    }
                    cArr[i2] = (char) (((i4 & 15) << 12) | ((b2 & 63) << 6) | ((b3 & 63) << 0));
                    i2++;
                    break;
            }
        }
        return new String(cArr, 0, i2);
    }
}
