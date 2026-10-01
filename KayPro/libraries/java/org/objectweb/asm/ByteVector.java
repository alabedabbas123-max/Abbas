package org.objectweb.asm;

import com.almlkaide.kaypro.android.dx.io.Opcodes;

public class ByteVector {

    byte[] f6439a;

    int f6440b;

    public ByteVector() {
        this.f6439a = new byte[64];
    }

    public ByteVector(int i) {
        this.f6439a = new byte[i];
    }

    private void m8896a(int i) {
        int length = this.f6439a.length * 2;
        int i2 = this.f6440b + i;
        if (length <= i2) {
            length = i2;
        }
        byte[] bArr = new byte[length];
        System.arraycopy(this.f6439a, 0, bArr, 0, this.f6440b);
        this.f6439a = bArr;
    }

    ByteVector m8897a(int i, int i2) {
        int i3 = this.f6440b;
        if (i3 + 2 > this.f6439a.length) {
            m8896a(2);
        }
        byte[] bArr = this.f6439a;
        int i4 = i3 + 1;
        bArr[i3] = (byte) i;
        bArr[i4] = (byte) i2;
        this.f6440b = i4 + 1;
        return this;
    }

    ByteVector m8898b(int i, int i2) {
        int i3 = this.f6440b;
        if (i3 + 3 > this.f6439a.length) {
            m8896a(3);
        }
        byte[] bArr = this.f6439a;
        int i4 = i3 + 1;
        bArr[i3] = (byte) i;
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i2 >>> 8);
        bArr[i5] = (byte) i2;
        this.f6440b = i5 + 1;
        return this;
    }

    ByteVector m8899c(String str, int i, int i2) {
        int i3;
        int length = str.length();
        int i4 = i;
        for (int i5 = i; i5 < length; i5++) {
            char cCharAt = str.charAt(i5);
            i4 = (cCharAt < 1 || cCharAt > 127) ? cCharAt > 2047 ? i4 + 3 : i4 + 2 : i4 + 1;
        }
        if (i4 > i2) {
            throw new IllegalArgumentException();
        }
        int i6 = (this.f6440b - i) - 2;
        if (i6 >= 0) {
            this.f6439a[i6] = (byte) (i4 >>> 8);
            this.f6439a[i6 + 1] = (byte) i4;
        }
        if ((this.f6440b + i4) - i > this.f6439a.length) {
            m8896a(i4 - i);
        }
        int i7 = this.f6440b;
        while (i < length) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 >= 1 && cCharAt2 <= 127) {
                i3 = i7 + 1;
                this.f6439a[i7] = (byte) cCharAt2;
            } else if (cCharAt2 > 2047) {
                int i8 = i7 + 1;
                this.f6439a[i7] = (byte) (((cCharAt2 >> '\f') & 15) | Opcodes.SHL_INT_LIT8);
                int i9 = i8 + 1;
                this.f6439a[i8] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                i3 = i9 + 1;
                this.f6439a[i9] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                int i10 = i7 + 1;
                this.f6439a[i7] = (byte) (((cCharAt2 >> 6) & 31) | 192);
                i3 = i10 + 1;
                this.f6439a[i10] = (byte) ((cCharAt2 & '?') | 128);
            }
            i++;
            i7 = i3;
        }
        this.f6440b = i7;
        return this;
    }

    public ByteVector putByte(int i) {
        int i2 = this.f6440b;
        if (i2 + 1 > this.f6439a.length) {
            m8896a(1);
        }
        this.f6439a[i2] = (byte) i;
        this.f6440b = i2 + 1;
        return this;
    }

    public ByteVector putByteArray(byte[] bArr, int i, int i2) {
        if (this.f6440b + i2 > this.f6439a.length) {
            m8896a(i2);
        }
        if (bArr != null) {
            System.arraycopy(bArr, i, this.f6439a, this.f6440b, i2);
        }
        this.f6440b += i2;
        return this;
    }

    public ByteVector putInt(int i) {
        int i2 = this.f6440b;
        if (i2 + 4 > this.f6439a.length) {
            m8896a(4);
        }
        byte[] bArr = this.f6439a;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i5] = (byte) i;
        this.f6440b = i5 + 1;
        return this;
    }

    public ByteVector putLong(long j) {
        int i = this.f6440b;
        if (i + 8 > this.f6439a.length) {
            m8896a(8);
        }
        byte[] bArr = this.f6439a;
        int i2 = (int) (j >>> 32);
        int i3 = i + 1;
        bArr[i] = (byte) (i2 >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i2 >>> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i2 >>> 8);
        int i6 = i5 + 1;
        bArr[i5] = (byte) i2;
        int i7 = (int) j;
        int i8 = i6 + 1;
        bArr[i6] = (byte) (i7 >>> 24);
        int i9 = i8 + 1;
        bArr[i8] = (byte) (i7 >>> 16);
        int i10 = i9 + 1;
        bArr[i9] = (byte) (i7 >>> 8);
        bArr[i10] = (byte) i7;
        this.f6440b = i10 + 1;
        return this;
    }

    public ByteVector putShort(int i) {
        int i2 = this.f6440b;
        if (i2 + 2 > this.f6439a.length) {
            m8896a(2);
        }
        byte[] bArr = this.f6439a;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 8);
        bArr[i3] = (byte) i;
        this.f6440b = i3 + 1;
        return this;
    }

    public ByteVector putUTF8(String str) {
        int length = str.length();
        if (length > 65535) {
            throw new IllegalArgumentException();
        }
        int i = this.f6440b;
        if (i + 2 + length > this.f6439a.length) {
            m8896a(length + 2);
        }
        byte[] bArr = this.f6439a;
        int i2 = i + 1;
        bArr[i] = (byte) (length >>> 8);
        int i3 = i2 + 1;
        bArr[i2] = (byte) length;
        int i4 = 0;
        while (i4 < length) {
            char cCharAt = str.charAt(i4);
            if (cCharAt < 1 || cCharAt > 127) {
                this.f6440b = i3;
                return m8899c(str, i4, 65535);
            }
            bArr[i3] = (byte) cCharAt;
            i4++;
            i3++;
        }
        this.f6440b = i3;
        return this;
    }
}
