package sun.misc;

class FloatingDecimal2 {
    static final boolean $assertionsDisabled = false;
    int[] data;
    int nWords;

    public FloatingDecimal2(int v) {
        this.nWords = 1;
        this.data = new int[]{v};
    }

    public FloatingDecimal2(long v) {
        int[] iArr = {(int) v, (int) (v >>> 32)};
        this.data = iArr;
        this.nWords = iArr[1] == 0 ? 1 : 2;
    }

    public FloatingDecimal2(FloatingDecimal2 other) {
        int i = other.nWords;
        this.nWords = i;
        int[] iArr = new int[i];
        this.data = iArr;
        System.arraycopy(other.data, 0, iArr, 0, i);
    }

    private FloatingDecimal2(int[] d, int n) {
        this.data = d;
        this.nWords = n;
    }

    public FloatingDecimal2(long seed, char[] digit, int nd0, int nd) {
        int n = (nd + 8) / 9;
        int[] iArr = new int[n < 2 ? 2 : n];
        this.data = iArr;
        iArr[0] = (int) seed;
        iArr[1] = (int) (seed >>> 32);
        this.nWords = iArr[1] == 0 ? 1 : 2;
        int i = nd0;
        int limit = nd - 5;
        while (i < limit) {
            int ilim = i + 5;
            int v = digit[i] - '0';
            i++;
            while (i < ilim) {
                v = ((v * 10) + digit[i]) - 48;
                i++;
            }
            multaddMe(100000, v);
        }
        int factor = 1;
        int v2 = 0;
        while (i < nd) {
            v2 = ((v2 * 10) + digit[i]) - 48;
            factor *= 10;
            i++;
        }
        if (factor != 1) {
            multaddMe(factor, v2);
        }
    }

    public void lshiftMe(int c) throws IllegalArgumentException {
        int target;
        if (c <= 0) {
            if (c == 0) {
                return;
            } else {
                throw new IllegalArgumentException("negative shift count");
            }
        }
        int wordcount = c >> 5;
        int bitcount = c & 31;
        int anticount = 32 - bitcount;
        int[] t = this.data;
        int[] s = this.data;
        int i = this.nWords;
        if (i + wordcount + 1 > t.length) {
            t = new int[i + wordcount + 1];
        }
        int i2 = this.nWords;
        int target2 = i2 + wordcount;
        int src = i2 - 1;
        if (bitcount == 0) {
            System.arraycopy(s, 0, t, wordcount, i2);
            target = wordcount - 1;
        } else {
            int target3 = target2 - 1;
            t[target2] = s[src] >>> anticount;
            while (src >= 1) {
                int i3 = s[src] << bitcount;
                src--;
                t[target3] = i3 | (s[src] >>> anticount);
                target3--;
            }
            t[target3] = s[src] << bitcount;
            target = target3 - 1;
        }
        while (target >= 0) {
            t[target] = 0;
            target--;
        }
        this.data = t;
        this.nWords += wordcount + 1;
        while (true) {
            int i4 = this.nWords;
            if (i4 > 1 && this.data[i4 - 1] == 0) {
                this.nWords = i4 - 1;
            } else {
                return;
            }
        }
    }

    public int normalizeMe() throws IllegalArgumentException {
        int wordcount = 0;
        int bitcount = 0;
        int v = 0;
        int src = this.nWords - 1;
        while (src >= 0) {
            int i = this.data[src];
            v = i;
            if (i != 0) {
                break;
            }
            wordcount++;
            src--;
        }
        if (src < 0) {
            throw new IllegalArgumentException("zero value");
        }
        this.nWords -= wordcount;
        if ((v & (-268435456)) != 0) {
            bitcount = 32;
            while ((v & (-268435456)) != 0) {
                v >>>= 1;
                bitcount--;
            }
        } else {
            while (v <= 1048575) {
                v <<= 8;
                bitcount += 8;
            }
            while (v <= 134217727) {
                v <<= 1;
                bitcount++;
            }
        }
        if (bitcount != 0) {
            lshiftMe(bitcount);
        }
        return bitcount;
    }

    public FloatingDecimal2 mult(int iv) {
        int i;
        long v = iv;
        int[] iArr = this.data;
        int i2 = this.nWords;
        if ((((long) iArr[i2 - 1]) & 4294967295L) * v > 268435455) {
            i2++;
        }
        int[] r = new int[i2];
        long p = 0;
        int i3 = 0;
        while (true) {
            i = this.nWords;
            if (i3 >= i) {
                break;
            }
            long p2 = p + ((((long) this.data[i3]) & 4294967295L) * v);
            r[i3] = (int) p2;
            p = p2 >>> 32;
            i3++;
        }
        if (p == 0) {
            return new FloatingDecimal2(r, this.nWords);
        }
        r[i] = (int) p;
        return new FloatingDecimal2(r, this.nWords + 1);
    }

    public void multaddMe(int iv, int addend) {
        int i;
        long v = iv;
        int[] iArr = this.data;
        long p = ((((long) iArr[0]) & 4294967295L) * v) + (((long) addend) & 4294967295L);
        iArr[0] = (int) p;
        long p2 = p >>> 32;
        int i2 = 1;
        while (true) {
            i = this.nWords;
            if (i2 >= i) {
                break;
            }
            int[] iArr2 = this.data;
            long p3 = p2 + ((((long) iArr2[i2]) & 4294967295L) * v);
            iArr2[i2] = (int) p3;
            p2 = p3 >>> 32;
            i2++;
        }
        if (p2 != 0) {
            this.data[i] = (int) p2;
            this.nWords = i + 1;
        }
    }

    public FloatingDecimal2 mult(FloatingDecimal2 other) {
        int[] r = new int[this.nWords + other.nWords];
        for (int i = 0; i < this.nWords; i++) {
            long v = ((long) this.data[i]) & 4294967295L;
            long p = 0;
            int j = 0;
            while (j < other.nWords) {
                long p2 = p + (((long) r[i + j]) & 4294967295L) + ((((long) other.data[j]) & 4294967295L) * v);
                r[i + j] = (int) p2;
                p = p2 >>> 32;
                j++;
            }
            r[i + j] = (int) p;
        }
        int i2 = r.length - 1;
        while (i2 > 0 && r[i2] == 0) {
            i2--;
        }
        return new FloatingDecimal2(r, i2 + 1);
    }

    public FloatingDecimal2 m525add(FloatingDecimal2 other) {
        int[] a;
        int n;
        int[] b;
        int m;
        long c = 0;
        if (this.nWords >= other.nWords) {
            a = this.data;
            n = this.nWords;
            b = other.data;
            m = other.nWords;
        } else {
            a = other.data;
            n = other.nWords;
            b = this.data;
            m = this.nWords;
        }
        int[] r = new int[n];
        int i = 0;
        while (i < n) {
            long c2 = c + (((long) a[i]) & 4294967295L);
            if (i < m) {
                c2 += ((long) b[i]) & 4294967295L;
            }
            r[i] = (int) c2;
            c = c2 >> 32;
            i++;
        }
        if (c != 0) {
            int[] s = new int[r.length + 1];
            System.arraycopy(r, 0, s, 0, r.length);
            s[i] = (int) c;
            return new FloatingDecimal2(s, i + 1);
        }
        return new FloatingDecimal2(r, i);
    }

    public FloatingDecimal2 m527sub(FloatingDecimal2 other) {
        int[] r = new int[this.nWords];
        int n = this.nWords;
        int m = other.nWords;
        int nzeros = 0;
        long c = 0;
        for (int i = 0; i < n; i++) {
            long c2 = c + (((long) this.data[i]) & 4294967295L);
            if (i < m) {
                c2 -= ((long) other.data[i]) & 4294967295L;
            }
            int i2 = (int) c2;
            r[i] = i2;
            if (i2 == 0) {
                nzeros++;
            } else {
                nzeros = 0;
            }
            c = c2 >> 32;
        }
        return new FloatingDecimal2(r, n - nzeros);
    }

    private static boolean dataInRangeIsZero(int i, int m, FloatingDecimal2 other) {
        while (i < m) {
            int i2 = i + 1;
            if (other.data[i] == 0) {
                i = i2;
            } else {
                return false;
            }
        }
        return true;
    }

    public int m526cmp(FloatingDecimal2 other) {
        int i;
        int i2 = this.nWords;
        int i3 = other.nWords;
        if (i2 > i3) {
            int j = i3 - 1;
            i = i2 - 1;
            while (i > j) {
                if (this.data[i] != 0) {
                    return 1;
                }
                i--;
            }
        } else if (i2 < i3) {
            int j2 = i2 - 1;
            int i4 = i3 - 1;
            while (i4 > j2) {
                if (other.data[i4] != 0) {
                    return -1;
                }
                i4--;
            }
            i = i4;
        } else {
            i = i2 - 1;
        }
        while (i > 0 && this.data[i] == other.data[i]) {
            i--;
        }
        int a = this.data[i];
        int b = other.data[i];
        if (a < 0) {
            if (b < 0) {
                return a - b;
            }
            return 1;
        }
        if (b < 0) {
            return -1;
        }
        return a - b;
    }

    public int quoRemIteration(FloatingDecimal2 S) throws IllegalArgumentException {
        int i = this.nWords;
        if (i != S.nWords) {
            throw new IllegalArgumentException("disparate values");
        }
        int n = i - 1;
        long q = (((long) this.data[n]) & 4294967295L) / ((long) S.data[n]);
        long diff = 0;
        for (int i2 = 0; i2 <= n; i2++) {
            int[] iArr = this.data;
            long diff2 = diff + ((((long) iArr[i2]) & 4294967295L) - ((((long) S.data[i2]) & 4294967295L) * q));
            iArr[i2] = (int) diff2;
            diff = diff2 >> 32;
        }
        if (diff != 0) {
            long sum = 0;
            for (long j = 0; sum == j; j = 0) {
                sum = 0;
                int i3 = 0;
                while (i3 <= n) {
                    int[] iArr2 = this.data;
                    long j2 = ((long) iArr2[i3]) & 4294967295L;
                    long diff3 = diff;
                    long diff4 = S.data[i3];
                    long sum2 = sum + j2 + (diff4 & 4294967295L);
                    iArr2[i3] = (int) sum2;
                    sum = sum2 >> 32;
                    i3++;
                    diff = diff3;
                }
                q--;
                diff = diff;
            }
        }
        long p = 0;
        for (int i4 = 0; i4 <= n; i4++) {
            int[] iArr3 = this.data;
            long p2 = p + ((((long) iArr3[i4]) & 4294967295L) * 10);
            iArr3[i4] = (int) p2;
            p = p2 >> 32;
        }
        return (int) q;
    }

    public long longValue() {
        if (this.nWords == 1) {
            return 4294967295L & ((long) this.data[0]);
        }
        int[] iArr = this.data;
        return (4294967295L & ((long) iArr[0])) | (((long) iArr[1]) << 32);
    }

    public String toString() {
        StringBuffer r = new StringBuffer(30);
        r.append('[');
        if (this.nWords > this.data.length) {
            r.append("(" + this.data.length + "<" + this.nWords + "!)");
        }
        for (int i = Math.min(this.nWords - 1, this.data.length - 1); i > 0; i--) {
            r.append(Integer.toHexString(this.data[i]));
            r.append(' ');
        }
        r.append(Integer.toHexString(this.data[0]));
        r.append(']');
        return new String(r);
    }
}
