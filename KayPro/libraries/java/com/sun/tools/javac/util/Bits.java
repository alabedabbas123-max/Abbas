package com.sun.tools.javac.util;

import java.util.Random;

public class Bits {
    private static final int wordlen = 32;
    private static final int wordmask = 31;
    private static final int wordshift = 5;
    private int[] bits;

    public Bits() {
        this(new int[1]);
    }

    public Bits(int[] bits) {
        this.bits = bits;
    }

    public Bits(int start, int limit) {
        this();
        inclRange(start, limit);
    }

    private void sizeTo(int len) {
        int[] iArr = this.bits;
        if (iArr.length < len) {
            int[] newbits = new int[len];
            System.arraycopy(iArr, 0, newbits, 0, iArr.length);
            this.bits = newbits;
        }
    }

    public void clear() {
        int i = 0;
        while (true) {
            int[] iArr = this.bits;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    public Bits m499dup() {
        int[] iArr = this.bits;
        int[] newbits = new int[iArr.length];
        System.arraycopy(iArr, 0, newbits, 0, iArr.length);
        return new Bits(newbits);
    }

    public void incl(int x) {
        Assert.check(x >= 0);
        sizeTo((x >>> 5) + 1);
        int[] iArr = this.bits;
        iArr[x >>> 5] = (1 << (x & 31)) | iArr[x >>> 5];
    }

    public void inclRange(int start, int limit) {
        sizeTo((limit >>> 5) + 1);
        for (int x = start; x < limit; x++) {
            int[] iArr = this.bits;
            iArr[x >>> 5] = iArr[x >>> 5] | (1 << (x & 31));
        }
    }

    public void excludeFrom(int start) {
        Bits temp = new Bits();
        temp.sizeTo(this.bits.length);
        temp.inclRange(0, start);
        andSet(temp);
    }

    public void excl(int x) {
        Assert.check(x >= 0);
        sizeTo((x >>> 5) + 1);
        int[] iArr = this.bits;
        iArr[x >>> 5] = ((1 << (x & 31)) ^ (-1)) & iArr[x >>> 5];
    }

    public boolean isMember(int x) {
        if (x >= 0) {
            int[] iArr = this.bits;
            if (x < (iArr.length << 5) && (iArr[x >>> 5] & (1 << (x & 31))) != 0) {
                return true;
            }
        }
        return false;
    }

    public Bits andSet(Bits xs) {
        sizeTo(xs.bits.length);
        int i = 0;
        while (true) {
            int[] iArr = xs.bits;
            if (i < iArr.length) {
                int[] iArr2 = this.bits;
                iArr2[i] = iArr[i] & iArr2[i];
                i++;
            } else {
                return this;
            }
        }
    }

    public Bits orSet(Bits xs) {
        sizeTo(xs.bits.length);
        int i = 0;
        while (true) {
            int[] iArr = xs.bits;
            if (i < iArr.length) {
                int[] iArr2 = this.bits;
                iArr2[i] = iArr[i] | iArr2[i];
                i++;
            } else {
                return this;
            }
        }
    }

    public Bits diffSet(Bits xs) {
        int i = 0;
        while (true) {
            int[] iArr = this.bits;
            if (i < iArr.length) {
                int[] iArr2 = xs.bits;
                if (i < iArr2.length) {
                    iArr[i] = (iArr2[i] ^ (-1)) & iArr[i];
                }
                i++;
            } else {
                return this;
            }
        }
    }

    public Bits xorSet(Bits xs) {
        sizeTo(xs.bits.length);
        int i = 0;
        while (true) {
            int[] iArr = xs.bits;
            if (i < iArr.length) {
                int[] iArr2 = this.bits;
                iArr2[i] = iArr[i] ^ iArr2[i];
                i++;
            } else {
                return this;
            }
        }
    }

    private static int trailingZeroBits(int x) {
        Assert.check(true);
        if (x == 0) {
            return 32;
        }
        int n = 1;
        if ((65535 & x) == 0) {
            n = 1 + 16;
            x >>>= 16;
        }
        if ((x & 255) == 0) {
            n += 8;
            x >>>= 8;
        }
        if ((x & 15) == 0) {
            n += 4;
            x >>>= 4;
        }
        if ((x & 3) == 0) {
            n += 2;
            x >>>= 2;
        }
        return n - (x & 1);
    }

    public int nextBit(int x) {
        int windex = x >>> 5;
        int[] iArr = this.bits;
        if (windex >= iArr.length) {
            return -1;
        }
        int word = iArr[windex] & (((1 << (x & 31)) - 1) ^ (-1));
        while (word == 0) {
            windex++;
            int[] iArr2 = this.bits;
            if (windex >= iArr2.length) {
                return -1;
            }
            word = iArr2[windex];
        }
        return (windex << 5) + trailingZeroBits(word);
    }

    public String toString() {
        char[] digits = new char[this.bits.length * 32];
        for (int i = 0; i < this.bits.length * 32; i++) {
            digits[i] = isMember(i) ? '1' : '0';
        }
        return new String(digits);
    }

    public static void main(String[] args) {
        int k;
        Random r = new Random();
        Bits bits = new Bits();
        for (int i = 0; i < 125; i++) {
            do {
                k = r.nextInt(250);
            } while (bits.isMember(k));
            System.out.println("adding " + k);
            bits.incl(k);
        }
        int count = 0;
        for (int i2 = bits.nextBit(0); i2 >= 0; i2 = bits.nextBit(i2 + 1)) {
            System.out.println("found " + i2);
            count++;
        }
        if (count != 125) {
            throw new Error();
        }
    }
}
